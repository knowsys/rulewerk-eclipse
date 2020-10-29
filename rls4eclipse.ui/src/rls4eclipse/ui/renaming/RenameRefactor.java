package rls4eclipse.ui.renaming;

/*-
 * #%L
 * rls4eclipse.ui
 * %%
 * Copyright (C) 2018 - 2020 rls4eclipse Developers
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.text.edits.ReplaceEdit;
import org.eclipse.text.edits.TextEdit;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.ui.refactoring.IRefactoringUpdateAcceptor;
import org.eclipse.xtext.ui.refactoring.impl.DefaultRenameStrategy;
import org.eclipse.xtext.ui.refactoring.impl.RefactoringException;
import org.eclipse.xtext.ui.refactoring.ui.IRenameElementContext;

import rls4eclipse.rLS.Term;
import rls4eclipse.rLS.predicateName;

@SuppressWarnings("restriction")
public class RenameRefactor extends DefaultRenameStrategy {

	//@Inject
	//private ILocationInFileProvider locationInFileProvider;

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
		//URI resourceURI = getTargetElementOriginalURI().trimFragment();
		if (getNameAttribute(targetElement).getName().contains("uv")) {
			createDeclarationUpdatesHelper1(newName, resourceSet, updateAcceptor);
		} else if (getNameAttribute(targetElement).getName().contains("PredName"))
				{
			createDeclarationUpdatesHelper2(newName, resourceSet, updateAcceptor);
		} 
		else if (getNameAttribute(targetElement).getName().contains("prediri"))
				{
			createDeclarationUpdatesHelper3(newName, resourceSet, updateAcceptor);
		}
		else {
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

	public void createDeclarationUpdatesHelper3(String newName, ResourceSet resourceSet,
			IRefactoringUpdateAcceptor updateAcceptor) {
		predicateName PN = (predicateName) targetElement;
		ICompositeNode node = NodeModelUtils.findActualNodeFor(PN);
		for (INode n : node.getParent().getRootNode().getChildren())
			for (INode nn : n.getLeafNodes()) {
				if (nn.getText().equals(PN.getPrediri())) {
					TextEdit referenceEdit = new ReplaceEdit(nn.getOffset(), nn.getLength(), newName);
					updateAcceptor.accept(PN.eResource().getURI(), referenceEdit);
				}
			}
	}
}
