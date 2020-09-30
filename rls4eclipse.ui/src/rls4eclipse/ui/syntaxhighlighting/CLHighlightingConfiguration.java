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

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfigurationAcceptor;
import org.eclipse.xtext.ui.editor.utils.TextStyle;

public class CLHighlightingConfiguration extends DefaultHighlightingConfiguration {
	public static final String Prefix_ID = "@prefix";
	public static final String Source_ID = "@source";
	public static final String Arrow_ID = "arrow";
	public static final String Comment_ID = "comment";
	public static final String UniVar_ID = "univar";
	public static final String ExiVar_ID = "exivar";
	public static final String IRI_ID = "iri";
	public static final String String_ID = "striing";
	public static final String Predicate_ID = "predicate";
	public static final String Constant_ID = "constant";
	public static final String Comma_ID = "comma";
	public static final String Pname_ID = "Prefixedname";
	public static final String PnameNS_ID = "PNAME_NS";

	@Override
	public void configure(IHighlightingConfigurationAcceptor acceptor) { // semantic highlighting
		acceptor.acceptDefaultHighlighting(Prefix_ID, "@prefix", //$NON-NLS-1$
				quotedStringTextStyle());
		acceptor.acceptDefaultHighlighting(Source_ID, "@source", //$NON-NLS-1$
				quotedStringTextStyle());
		acceptor.acceptDefaultHighlighting(Arrow_ID, "arrow", //$NON-NLS-1$
				arrowTextStyle());
		acceptor.acceptDefaultHighlighting(Comment_ID, "comment", //$NON-NLS-1$
				portIdTextStyle());
		acceptor.acceptDefaultHighlighting(UniVar_ID, "univar", //$NON-NLS-1$
				var2IdTextStyle());
		acceptor.acceptDefaultHighlighting(ExiVar_ID, "var", //$NON-NLS-1$
				varIdTextStyle());
		acceptor.acceptDefaultHighlighting(IRI_ID, "iri", //$NON-NLS-1$
				iriStringTextStyle());
		acceptor.acceptDefaultHighlighting(String_ID, "striing", //$NON-NLS-1$
				StriingTextStyle());
		acceptor.acceptDefaultHighlighting(Predicate_ID, "predicate", //$NON-NLS-1$
				PredicateTextStyle());
		acceptor.acceptDefaultHighlighting(Constant_ID, "constant", //$NON-NLS-1$
				ConstantTextStyle());
		acceptor.acceptDefaultHighlighting(Comma_ID, "comma", //$NON-NLS-1$
				CommaTextStyle());
		acceptor.acceptDefaultHighlighting(Pname_ID, "Prefixedname", //$NON-NLS-1$
				PnameIdTextStyle());
		acceptor.acceptDefaultHighlighting(PnameNS_ID, "PNAME_NS", //$NON-NLS-1$
				PnsIdTextStyle());
	}

	public TextStyle PnameIdTextStyle() {
		TextStyle textStyle = defaultTextStyle().copy();
		//textStyle.setColor(new RGB(255, 128, 0)); // dark blue
		// textStyle.setStyle(SWT.BOLD);
		return textStyle;
	}

	public TextStyle PnsIdTextStyle() {
		TextStyle textStyle = defaultTextStyle().copy();
		textStyle.setColor(new RGB(0,0,192)); // dark blue
		textStyle.setStyle(SWT.BOLD);
		return textStyle;
	}

	public TextStyle attributeIdTextStyle() {
		TextStyle textStyle = defaultTextStyle().copy();
		textStyle.setColor(new RGB(153, 0, 0)); // red
		textStyle.setStyle(SWT.BOLD);
		return textStyle;
	}

	public TextStyle CommaTextStyle() {
		TextStyle textStyle = defaultTextStyle().copy();
		// textStyle.setColor(new RGB(153, 0, 153)); // dark blue
		textStyle.setStyle(SWT.BOLD);
		return textStyle;
	}

	public TextStyle quotedStringTextStyle() {
		TextStyle textStyle = defaultTextStyle().copy();
		textStyle.setColor(new RGB(127, 0, 85));
		textStyle.setStyle(SWT.BOLD);
		return textStyle;
	}

	public TextStyle arrowTextStyle() {
		TextStyle textStyle = defaultTextStyle().copy();
		textStyle.setColor(new RGB(204, 102, 0)); // brown
		textStyle.setStyle(SWT.BOLD);
		return textStyle;
	}

	public TextStyle portIdTextStyle() {
		TextStyle textStyle = defaultTextStyle().copy();
		textStyle.setColor(new RGB(34, 139, 34)); // light green
		return textStyle;
	}

	public TextStyle varIdTextStyle() {
		TextStyle textStyle = defaultTextStyle().copy();
		textStyle.setColor(new RGB(240, 0, 120)); // purple
		// textStyle.setStyle(SWT.BOLD);
		return textStyle;
	}

	public TextStyle var2IdTextStyle() {
		TextStyle textStyle = defaultTextStyle().copy();
		textStyle.setColor(new RGB(106, 62, 62));
		// textStyle.setStyle(SWT.BOLD);
		return textStyle;
	}

	public TextStyle iriStringTextStyle() {
		TextStyle textStyle = defaultTextStyle().copy();
		textStyle.setColor(new RGB(84, 6, 58));
		return textStyle;
	}

	public TextStyle StriingTextStyle() {
		TextStyle textStyle = defaultTextStyle().copy();
		textStyle.setColor(new RGB(42, 0, 255));
		return textStyle;
	}

	public TextStyle PredicateTextStyle() {
		TextStyle textStyle = defaultTextStyle().copy();
		// textStyle.setColor(new RGB(0, 255, 0));
		return textStyle;
	}

	public TextStyle ConstantTextStyle() {
		TextStyle textStyle = defaultTextStyle().copy();
		textStyle.setColor(new RGB(0, 128, 255));
		//textStyle.setStyle(SWT.BOLD);
		return textStyle;
	}
}
