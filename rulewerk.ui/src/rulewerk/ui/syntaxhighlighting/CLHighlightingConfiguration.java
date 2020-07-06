package rulewerk.ui.syntaxhighlighting;

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

	@Override
	public void configure(IHighlightingConfigurationAcceptor acceptor) { // semantic highlighting
		acceptor.acceptDefaultHighlighting(Prefix_ID, "@prefix", //$NON-NLS-1$
				attributeIdTextStyle());
		acceptor.acceptDefaultHighlighting(Source_ID, "@source", //$NON-NLS-1$
				attributeIdTextStyle());
		acceptor.acceptDefaultHighlighting(Arrow_ID, "arrow", //$NON-NLS-1$
				arrowTextStyle());
		acceptor.acceptDefaultHighlighting(Comment_ID, "comment", //$NON-NLS-1$
				portIdTextStyle());
		acceptor.acceptDefaultHighlighting(UniVar_ID, "univar", //$NON-NLS-1$
				quotedStringTextStyle());
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
	}

	public TextStyle PnameIdTextStyle() {
		TextStyle textStyle = defaultTextStyle().copy();
		textStyle.setColor(new RGB(255, 128, 0)); // dark blue
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
		textStyle.setColor(new RGB(153, 0, 153));
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
		textStyle.setColor(new RGB(0, 153, 76)); // light green
		return textStyle;
	}

	public TextStyle varIdTextStyle() {
		TextStyle textStyle = defaultTextStyle().copy();
		textStyle.setColor(new RGB(0, 204, 0)); // purple
		textStyle.setStyle(SWT.BOLD);
		return textStyle;
	}

	public TextStyle var2IdTextStyle() {
		TextStyle textStyle = defaultTextStyle().copy();
		textStyle.setColor(new RGB(0, 153, 153));
		textStyle.setStyle(SWT.BOLD);
		return textStyle;
	}

	public TextStyle iriStringTextStyle() {
		TextStyle textStyle = defaultTextStyle().copy();
		textStyle.setColor(new RGB(0, 153, 153));
		return textStyle;
	}

	public TextStyle StriingTextStyle() {
		TextStyle textStyle = defaultTextStyle().copy();
		textStyle.setColor(new RGB(51, 51, 255));
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
		textStyle.setStyle(SWT.BOLD);
		return textStyle;
	}
}
