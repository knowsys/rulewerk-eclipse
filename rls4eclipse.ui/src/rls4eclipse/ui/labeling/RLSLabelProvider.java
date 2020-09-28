/*
 * generated by Xtext 2.20.0
 */
package rls4eclipse.ui.labeling;

import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.xtext.ui.label.DefaultEObjectLabelProvider;

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

import com.google.inject.Inject;

import rls4eclipse.rLS.AR;
import rls4eclipse.rLS.Arguments;
import rls4eclipse.rLS.IRIBOL;
import rls4eclipse.rLS.Literal;
import rls4eclipse.rLS.NegativeLiteral;
import rls4eclipse.rLS.NumericLiteral;
import rls4eclipse.rLS.PositiveLiteral;
import rls4eclipse.rLS.Prefix;
import rls4eclipse.rLS.PrefixedName;
import rls4eclipse.rLS.RDFLiteral;
import rls4eclipse.rLS.Rule;
import rls4eclipse.rLS.Source;
import rls4eclipse.rLS.Statement;
import rls4eclipse.rLS.Striing;
import rls4eclipse.rLS.Term;
import rls4eclipse.rLS.listOfLiterals;
import rls4eclipse.rLS.listOfPositiveLiterals;
import rls4eclipse.rLS.listOfTerms;

/**
 * Provides labels for EObjects.
 * 
 * See https://www.eclipse.org/Xtext/documentation/310_eclipse_support.html#label-provider
 */
public class RLSLabelProvider extends DefaultEObjectLabelProvider {

	@Inject
	public RLSLabelProvider(AdapterFactoryLabelProvider delegate) {
		super(delegate);
	}

	String text(Rule r) {
		return "Rule";
	}
	
	String text(Statement s) {
		return "Statement";
	}
	
	String text(listOfPositiveLiterals h) {
		return "Head";
	}
	
	String text(listOfLiterals s) {
		return "Body";
	}
	
	String text(Literal s) {
		return "Predicate name";
	}
	
	String text(PositiveLiteral s) {
		return "Positive Literal";
	}
	
	String text(NegativeLiteral s) {
		return "Negative Literal";
	}
	
	String text(listOfTerms s) {
		return "Terms";
	}
	
	String text(Term t) {
		return "Term";
	}
	
	String text(Arguments a) {
		return "Arguments";
	}
	
	String text(Source s) {
		return "Source";
	}
	
	String text(Prefix p) {
		return "Prefix";
	}
	
	String text(PrefixedName pn) {
		return "Prefixed name";
	}
	
	String text(AR ar) {
		return "Arity";
	}
	
	String text(Striing st) {
		return "String";
	}
	
	String text(RDFLiteral rd) {
		return "RDFLiteral";
	}
	
	String text(IRIBOL iri) {
		return "IRI";
	}
	
	String text(NumericLiteral nl) {
		return "NumericLiteral";
	}

	
	
	
//
//	String image(Greeting ele) {
//		return "Greeting.gif";
//	}

}