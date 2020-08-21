package rls4eclipse.ui.renaming;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.text.edits.ReplaceEdit;
import org.eclipse.text.edits.TextEdit;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.resource.ILocationInFileProvider;
import org.eclipse.xtext.ui.refactoring.IRefactoringUpdateAcceptor;
import org.eclipse.xtext.ui.refactoring.impl.DefaultRenameStrategy;
import org.eclipse.xtext.ui.refactoring.impl.RefactoringException;
import org.eclipse.xtext.ui.refactoring.ui.IRenameElementContext;
import com.google.inject.Inject;
import rls4eclipse.rLS.Term;
import rls4eclipse.rLS.predicateName;

public class RenameRefactor extends DefaultRenameStrategy {

	@Inject
	private ILocationInFileProvider locationInFileProvider;

	private EObject targetElement;

	@Override
	public boolean initialize(EObject targetElement, IRenameElementContext context) {
		if (super.initialize(targetElement, context)) {
			this.targetElement = targetElement;
			return true;
		}
		return false;
	}

	@Override
	protected EAttribute getNameAttribute(EObject targetElement) {
		for (EAttribute attribute : targetElement.eClass().getEAttributes()) {
			if (!attribute.getName().isEmpty()) { // $NON-NLS-1$
				return attribute;
			}
		}
		throw new RefactoringException("Cannot Refactor this element."); //$NON-NLS-1$
	}

	@Override
	protected String getNameAsText(String nameAsValue, String nameRuleName) {
		return nameAsValue;
	}

	@Override
	public void createDeclarationUpdates(String newName, ResourceSet resourceSet,
			IRefactoringUpdateAcceptor updateAcceptor) {
		URI resourceURI = getTargetElementOriginalURI().trimFragment();
		if (getNameAttribute(targetElement).getName().contains("uv")) {
			createDeclarationUpdatesHelper1(newName, resourceSet, updateAcceptor);
		} else if (getNameAttribute(targetElement).getName().contains("PredName")) {
			createDeclarationUpdatesHelper2(newName, resourceSet, updateAcceptor);
		} else {
			throw new RefactoringException("Cannot Refactor this element.");
		}
	}

	public void createDeclarationUpdatesHelper1(String newName, ResourceSet resourceSet,
			IRefactoringUpdateAcceptor updateAcceptor) {
		Term t = (Term) targetElement;
		ICompositeNode node = NodeModelUtils.findActualNodeFor(t);
		for (INode n : node.getParent().getParent().getParent().getParent().getParent().getChildren())
			for (INode nn : n.getLeafNodes()) {
				if (nn.getText().equals(t.getUv())) {
					TextEdit referenceEdit = new ReplaceEdit(nn.getOffset(), nn.getLength(), newName);
					updateAcceptor.accept(t.eResource().getURI(), referenceEdit);
				}
			}
	}

	public void createDeclarationUpdatesHelper2(String newName, ResourceSet resourceSet,
			IRefactoringUpdateAcceptor updateAcceptor) {
		predicateName PN = (predicateName) targetElement;
		ICompositeNode node = NodeModelUtils.findActualNodeFor(PN);
		for (INode n : node.getParent().getRootNode().getChildren())
			for (INode nn : n.getLeafNodes()) {
				if (nn.getText().equals(PN.getPredName())) {
					TextEdit referenceEdit = new ReplaceEdit(nn.getOffset(), nn.getLength(), newName);
					updateAcceptor.accept(PN.eResource().getURI(), referenceEdit);
				}
			}
	}
}