package rls4eclipse.ui.syntaxhighlighting;

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
import rls4eclipse.ui.syntaxhighlighting.CLHighlightingConfiguration;

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
				String name = r.getName();
				int offset = node.getOffset();
				int length = node.getLength();
				if (name.equals("SRC")) {
					acceptor.addPosition(offset, length, CLHighlightingConfiguration.Prefix_ID);
				} else if (name.equals("PRFX")) {
					acceptor.addPosition(offset, length, CLHighlightingConfiguration.Source_ID);
				} else if (name.equals("DIRECTIVENAME")) {
					acceptor.addPosition(offset, length, CLHighlightingConfiguration.Source_ID);
				} else if (name.equals("PrefixedName")) {
					acceptor.addPosition(offset, length, CLHighlightingConfiguration.Pname_ID);
				} 
				else if (name.equals("PNAME_NS")) {
					acceptor.addPosition(offset, length, CLHighlightingConfiguration.PnameNS_ID);
				} 
				else if (r.getName().equals("DOT")) {
					acceptor.addPosition(offset, length, CLHighlightingConfiguration.Comma_ID);
				} else if (name.equals("BS")) {
					acceptor.addPosition(offset, length, CLHighlightingConfiguration.Source_ID);
				} else if (name.equals("ARROW") || r.getName().equals("COM") || r.getName().equals("TILDE")) {
					acceptor.addPosition(offset, length, CLHighlightingConfiguration.Comma_ID);
				} else if (name.equals("UNIVAR")) {
					acceptor.addPosition(offset, length, CLHighlightingConfiguration.UniVar_ID);
				} else if (name.equals("IRIREF")) {
					acceptor.addPosition(offset, length, CLHighlightingConfiguration.IRI_ID);
				} else if (name.equals("Striing")) {
					acceptor.addPosition(offset, length, CLHighlightingConfiguration.String_ID);
				} else if (name.equals("LANGTAG")) {
					acceptor.addPosition(offset, length, CLHighlightingConfiguration.String_ID);
				} else if (name.equals("NumericLiteral")) {
					acceptor.addPosition(offset, length, CLHighlightingConfiguration.String_ID);
				} 
				else if (name.equals("EXIVAR")) {
					acceptor.addPosition(offset, length, CLHighlightingConfiguration.ExiVar_ID);
				} else if (name.equals("VARORPREDNAME")) {
					RuleCall rr = (RuleCall) node.getParent().getGrammarElement();
					AbstractRule s = rr.getRule();
					if (s.getName().equals("predicateName")) {
						acceptor.addPosition(node.getOffset(), node.getLength(),
								CLHighlightingConfiguration.Predicate_ID);
					} else {
						acceptor.addPosition(node.getOffset(), node.getLength(),
								CLHighlightingConfiguration.String_ID);
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
