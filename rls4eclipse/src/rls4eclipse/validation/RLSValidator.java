/*
 * generated by Xtext 2.20.0
 */
package rls4eclipse.validation;

/*-
 * #%L
 * rls4eclipse
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

import java.util.HashSet;

import org.eclipse.xtext.validation.Check;

import rls4eclipse.rLS.Literal;
import rls4eclipse.rLS.PositiveLiteral;
import rls4eclipse.rLS.RLSPackage;
import rls4eclipse.rLS.Rule;
import rls4eclipse.rLS.Term;

/**
 * This class contains custom validation rules.
 *
 * See
 * https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
public class RLSValidator extends AbstractRLSValidator {

	@Check
	public void checkUniVars(Rule rule) {
		HashSet<String> a = new HashSet<String>();
		for (Literal l : rule.getBody().getL()) {
			for (Term f : l.getTerms().getT()) {
				a.add(f.getT());
			}
		}
		for (PositiveLiteral x : rule.getHead().getL()) {
			for (Term t : x.getTerms().getT()) {
				if (t.getT().contains("?")) {
					if (!a.contains(t.getT())) {
						error("every universal variable in the head of the rule must also be in the body of the rule",
								rule.eClass().getEStructuralFeature(RLSPackage.RULE));
					}
				}
			}
		}

	}

	@Check
	public void checkMalformedRule(Rule rule) {
		HashSet<String> a = new HashSet<String>();
		for (Literal l : rule.getBody().getL()) {
			for (Term f : l.getTerms().getT()) {
				if (f.getT().startsWith("?")) {
					a.add(f.getT().replace("?", ""));
				}
			}
		}
		for (PositiveLiteral x : rule.getHead().getL()) {
			for (Term t : x.getTerms().getT()) {
				if (t.getT().startsWith("!")) {
					String s = t.getT().replace("!", "");
					if (a.contains(s)) {
						error("Variable that is existentially quantified in the head cannot be universally quantified in the body of the rule",
								rule.eClass().getEStructuralFeature(RLSPackage.RULE));
					}
				}
			}
		}

	}

	@Check
	public void checkExiVars(Rule rule) {
		for (Literal l : rule.getBody().getL()) {
			for (Term f : l.getTerms().getT()) {
				if (f.getT().startsWith("!")) {
					error("Existentialy quantified variables can not appear in the body of the rule",
							rule.eClass().getEStructuralFeature(RLSPackage.RULE));
				} else if (f.getT().startsWith("_:")) {
					error("Named nulls can not appear in the body of the rule",
							rule.eClass().getEStructuralFeature(RLSPackage.RULE));
				}
			}
		}

	}

}