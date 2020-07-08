package rulewerk.ui.syntaxhighlighting;

/*-
 * #%L
 * rulewerk.ui
 * %%
 * Copyright (C) 2018 - 2020 Rulewerk Developers
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


import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.AbstractRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.ide.editor.syntaxcoloring.DefaultSemanticHighlightingCalculator;
import org.eclipse.xtext.ide.editor.syntaxcoloring.IHighlightedPositionAcceptor;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.util.CancelIndicator;

public class SemanticHighlightingCalculator extends DefaultSemanticHighlightingCalculator {

	@Override
	public void provideHighlightingFor(XtextResource resource, IHighlightedPositionAcceptor acceptor,
			CancelIndicator cancelIndicator) {
		if (resource == null || resource.getParseResult() == null)
			return;

		INode root = resource.getParseResult().getRootNode();
		for (INode node : root.getAsTreeIterable()) {

			EObject grammarElement = node.getGrammarElement();
			if (grammarElement instanceof RuleCall) {
				RuleCall rc = (RuleCall) grammarElement;
				AbstractRule r = rc.getRule();
				// System.out.println(r.getName());
				if (r.getName().equals("SRC")) {
					acceptor.addPosition(node.getOffset(), node.getLength(), CLHighlightingConfiguration.Prefix_ID);
				} else if (r.getName().equals("PRFX")) {
					acceptor.addPosition(node.getOffset(), node.getLength(), CLHighlightingConfiguration.Source_ID);
				} else if (r.getName().equals("PrefixedName")) {
					acceptor.addPosition(node.getOffset(), node.getLength(), CLHighlightingConfiguration.Pname_ID);
				} else if (r.getName().equals("COMMA") || r.getName().equals("DOT")) {
					acceptor.addPosition(node.getOffset(), node.getLength(), CLHighlightingConfiguration.Comma_ID);
				} else if (r.getName().equals("BS")) {
					acceptor.addPosition(node.getOffset(), node.getLength(), CLHighlightingConfiguration.Source_ID);
				} else if (r.getName().equals("ARROW") || r.getName().equals("COMMA") || r.getName().equals("TILDE")) {
					acceptor.addPosition(node.getOffset(), node.getLength(), CLHighlightingConfiguration.Arrow_ID);
				} else if (r.getName().equals("UNIVAR")) {
					acceptor.addPosition(node.getOffset(), node.getLength(), CLHighlightingConfiguration.UniVar_ID);
				} else if (r.getName().equals("IRIREF")) {
					acceptor.addPosition(node.getOffset(), node.getLength(), CLHighlightingConfiguration.IRI_ID);
				} else if (r.getName().equals("Striing")) {
					acceptor.addPosition(node.getOffset(), node.getLength(), CLHighlightingConfiguration.String_ID);
				} else if (r.getName().equals("EXIVAR")) {
					acceptor.addPosition(node.getOffset(), node.getLength(), CLHighlightingConfiguration.ExiVar_ID);
				} else if (r.getName().equals("VARORPREDNAME")) {
					RuleCall rr = (RuleCall) node.getParent().getGrammarElement();
					AbstractRule s = rr.getRule();
					if (s.getName().equals("predicateName")) {
						acceptor.addPosition(node.getOffset(), node.getLength(),
								CLHighlightingConfiguration.Predicate_ID);
					} else {
						acceptor.addPosition(node.getOffset(), node.getLength(),
								CLHighlightingConfiguration.Constant_ID);
					}

				}
			} else if (grammarElement instanceof TerminalRule) {
				TerminalRule rc = (TerminalRule) grammarElement;
				if (rc.getName().equals("SKIP")) {
					acceptor.addPosition(node.getOffset(), node.getLength(), CLHighlightingConfiguration.Comment_ID);
				}
			}
		}
	}
}
