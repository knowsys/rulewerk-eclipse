/*
 * generated by Xtext 2.20.0
 */
package rls4eclipse.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import rls4eclipse.ide.contentassist.antlr.internal.InternalRLSParser;
import rls4eclipse.services.RLSGrammarAccess;

public class RLSParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(RLSGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, RLSGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getIRIBOLAccess().getAlternatives(), "rule__IRIBOL__Alternatives");
			builder.put(grammarAccess.getStriingAccess().getAlternatives(), "rule__Striing__Alternatives");
			builder.put(grammarAccess.getRDFLiteralAccess().getAlternatives_1(), "rule__RDFLiteral__Alternatives_1");
			builder.put(grammarAccess.getNumericLiteralAccess().getAlternatives(), "rule__NumericLiteral__Alternatives");
			builder.put(grammarAccess.getTermAccess().getAlternatives(), "rule__Term__Alternatives");
			builder.put(grammarAccess.getPredicateNameAccess().getAlternatives(), "rule__PredicateName__Alternatives");
			builder.put(grammarAccess.getLiteralAccess().getAlternatives(), "rule__Literal__Alternatives");
			builder.put(grammarAccess.getStatementAccess().getAlternatives(), "rule__Statement__Alternatives");
			builder.put(grammarAccess.getDataSourceAccess().getAlternatives_0(), "rule__DataSource__Alternatives_0");
			builder.put(grammarAccess.getPrefixAccess().getAlternatives(), "rule__Prefix__Alternatives");
			builder.put(grammarAccess.getConfigurable_LiteralAccess().getAlternatives(), "rule__Configurable_Literal__Alternatives");
			builder.put(grammarAccess.getArgumentsAccess().getAlternatives_1(), "rule__Arguments__Alternatives_1");
			builder.put(grammarAccess.getModelAccess().getGroup(), "rule__Model__Group__0");
			builder.put(grammarAccess.getRDFLiteralAccess().getGroup(), "rule__RDFLiteral__Group__0");
			builder.put(grammarAccess.getRDFLiteralAccess().getGroup_1_1(), "rule__RDFLiteral__Group_1_1__0");
			builder.put(grammarAccess.getListOfTermsAccess().getGroup(), "rule__ListOfTerms__Group__0");
			builder.put(grammarAccess.getListOfTermsAccess().getGroup_1(), "rule__ListOfTerms__Group_1__0");
			builder.put(grammarAccess.getNegativeLiteralAccess().getGroup(), "rule__NegativeLiteral__Group__0");
			builder.put(grammarAccess.getFactAccess().getGroup(), "rule__Fact__Group__0");
			builder.put(grammarAccess.getPositiveLiteralAccess().getGroup(), "rule__PositiveLiteral__Group__0");
			builder.put(grammarAccess.getListOfLiteralsAccess().getGroup(), "rule__ListOfLiterals__Group__0");
			builder.put(grammarAccess.getListOfLiteralsAccess().getGroup_1(), "rule__ListOfLiterals__Group_1__0");
			builder.put(grammarAccess.getListOfPositiveLiteralsAccess().getGroup(), "rule__ListOfPositiveLiterals__Group__0");
			builder.put(grammarAccess.getListOfPositiveLiteralsAccess().getGroup_1(), "rule__ListOfPositiveLiterals__Group_1__0");
			builder.put(grammarAccess.getRuleAccess().getGroup(), "rule__Rule__Group__0");
			builder.put(grammarAccess.getStatementAccess().getGroup_1(), "rule__Statement__Group_1__0");
			builder.put(grammarAccess.getDataSourceAccess().getGroup(), "rule__DataSource__Group__0");
			builder.put(grammarAccess.getSourceAccess().getGroup(), "rule__Source__Group__0");
			builder.put(grammarAccess.getPrefixAccess().getGroup_0(), "rule__Prefix__Group_0__0");
			builder.put(grammarAccess.getPrefixAccess().getGroup_1(), "rule__Prefix__Group_1__0");
			builder.put(grammarAccess.getBaseAccess().getGroup(), "rule__Base__Group__0");
			builder.put(grammarAccess.getBraceDelimitedLiteralAccess().getGroup(), "rule__BraceDelimitedLiteral__Group__0");
			builder.put(grammarAccess.getBracketDelimitedLiteralAccess().getGroup(), "rule__BracketDelimitedLiteral__Group__0");
			builder.put(grammarAccess.getArgumentsAccess().getGroup(), "rule__Arguments__Group__0");
			builder.put(grammarAccess.getArgumentsAccess().getGroup_2(), "rule__Arguments__Group_2__0");
			builder.put(grammarAccess.getModelAccess().getBAssignment_1(), "rule__Model__BAssignment_1");
			builder.put(grammarAccess.getModelAccess().getPAssignment_2(), "rule__Model__PAssignment_2");
			builder.put(grammarAccess.getModelAccess().getSAssignment_3(), "rule__Model__SAssignment_3");
			builder.put(grammarAccess.getModelAccess().getStAssignment_4(), "rule__Model__StAssignment_4");
			builder.put(grammarAccess.getPrefixedNameAccess().getTAssignment(), "rule__PrefixedName__TAssignment");
			builder.put(grammarAccess.getIRIREFAccess().getTAssignment(), "rule__IRIREF__TAssignment");
			builder.put(grammarAccess.getIRIBOLAccess().getTAssignment_0(), "rule__IRIBOL__TAssignment_0");
			builder.put(grammarAccess.getIRIBOLAccess().getTAssignment_1(), "rule__IRIBOL__TAssignment_1");
			builder.put(grammarAccess.getStriingAccess().getTAssignment_0(), "rule__Striing__TAssignment_0");
			builder.put(grammarAccess.getStriingAccess().getTAssignment_1(), "rule__Striing__TAssignment_1");
			builder.put(grammarAccess.getStriingAccess().getTAssignment_2(), "rule__Striing__TAssignment_2");
			builder.put(grammarAccess.getStriingAccess().getTAssignment_3(), "rule__Striing__TAssignment_3");
			builder.put(grammarAccess.getLangtaggAccess().getTAssignment(), "rule__Langtagg__TAssignment");
			builder.put(grammarAccess.getRDFLiteralAccess().getSAssignment_0(), "rule__RDFLiteral__SAssignment_0");
			builder.put(grammarAccess.getRDFLiteralAccess().getLAssignment_1_0(), "rule__RDFLiteral__LAssignment_1_0");
			builder.put(grammarAccess.getRDFLiteralAccess().getDtAssignment_1_1_1(), "rule__RDFLiteral__DtAssignment_1_1_1");
			builder.put(grammarAccess.getNumericLiteralAccess().getTAssignment_0(), "rule__NumericLiteral__TAssignment_0");
			builder.put(grammarAccess.getNumericLiteralAccess().getTAssignment_1(), "rule__NumericLiteral__TAssignment_1");
			builder.put(grammarAccess.getNumericLiteralAccess().getTAssignment_2(), "rule__NumericLiteral__TAssignment_2");
			builder.put(grammarAccess.getTermAccess().getSAssignment_0(), "rule__Term__SAssignment_0");
			builder.put(grammarAccess.getTermAccess().getCAssignment_1(), "rule__Term__CAssignment_1");
			builder.put(grammarAccess.getTermAccess().getSAssignment_2(), "rule__Term__SAssignment_2");
			builder.put(grammarAccess.getTermAccess().getTAssignment_3(), "rule__Term__TAssignment_3");
			builder.put(grammarAccess.getTermAccess().getTAssignment_4(), "rule__Term__TAssignment_4");
			builder.put(grammarAccess.getTermAccess().getTAssignment_5(), "rule__Term__TAssignment_5");
			builder.put(grammarAccess.getTermAccess().getTAssignment_6(), "rule__Term__TAssignment_6");
			builder.put(grammarAccess.getTermAccess().getTtAssignment_7(), "rule__Term__TtAssignment_7");
			builder.put(grammarAccess.getPredicateNameAccess().getSAssignment_0(), "rule__PredicateName__SAssignment_0");
			builder.put(grammarAccess.getPredicateNameAccess().getTAssignment_1(), "rule__PredicateName__TAssignment_1");
			builder.put(grammarAccess.getListOfTermsAccess().getTAssignment_0(), "rule__ListOfTerms__TAssignment_0");
			builder.put(grammarAccess.getListOfTermsAccess().getTAssignment_1_1(), "rule__ListOfTerms__TAssignment_1_1");
			builder.put(grammarAccess.getNegativeLiteralAccess().getPredicatenameAssignment_1(), "rule__NegativeLiteral__PredicatenameAssignment_1");
			builder.put(grammarAccess.getNegativeLiteralAccess().getTermsAssignment_3(), "rule__NegativeLiteral__TermsAssignment_3");
			builder.put(grammarAccess.getFactAccess().getPredicatenameAssignment_0(), "rule__Fact__PredicatenameAssignment_0");
			builder.put(grammarAccess.getFactAccess().getTermsAssignment_2(), "rule__Fact__TermsAssignment_2");
			builder.put(grammarAccess.getPositiveLiteralAccess().getPredicatenameAssignment_0(), "rule__PositiveLiteral__PredicatenameAssignment_0");
			builder.put(grammarAccess.getPositiveLiteralAccess().getTermsAssignment_2(), "rule__PositiveLiteral__TermsAssignment_2");
			builder.put(grammarAccess.getListOfLiteralsAccess().getLAssignment_0(), "rule__ListOfLiterals__LAssignment_0");
			builder.put(grammarAccess.getListOfLiteralsAccess().getLAssignment_1_1(), "rule__ListOfLiterals__LAssignment_1_1");
			builder.put(grammarAccess.getListOfPositiveLiteralsAccess().getLAssignment_0(), "rule__ListOfPositiveLiterals__LAssignment_0");
			builder.put(grammarAccess.getListOfPositiveLiteralsAccess().getLAssignment_1_1(), "rule__ListOfPositiveLiterals__LAssignment_1_1");
			builder.put(grammarAccess.getRuleAccess().getHeadAssignment_0(), "rule__Rule__HeadAssignment_0");
			builder.put(grammarAccess.getRuleAccess().getBodyAssignment_2(), "rule__Rule__BodyAssignment_2");
			builder.put(grammarAccess.getStatementAccess().getStatementAssignment_0(), "rule__Statement__StatementAssignment_0");
			builder.put(grammarAccess.getStatementAccess().getStatementAssignment_1_0(), "rule__Statement__StatementAssignment_1_0");
			builder.put(grammarAccess.getDataSourceAccess().getSourceNameAssignment_0_0(), "rule__DataSource__SourceNameAssignment_0_0");
			builder.put(grammarAccess.getDataSourceAccess().getSourceNameAssignment_0_1(), "rule__DataSource__SourceNameAssignment_0_1");
			builder.put(grammarAccess.getDataSourceAccess().getArgAssignment_2(), "rule__DataSource__ArgAssignment_2");
			builder.put(grammarAccess.getSourceAccess().getPredicatenameAssignment_1(), "rule__Source__PredicatenameAssignment_1");
			builder.put(grammarAccess.getSourceAccess().getArityAssignment_2(), "rule__Source__ArityAssignment_2");
			builder.put(grammarAccess.getSourceAccess().getDataSourceAssignment_4(), "rule__Source__DataSourceAssignment_4");
			builder.put(grammarAccess.getPrefixAccess().getTAssignment_0_1(), "rule__Prefix__TAssignment_0_1");
			builder.put(grammarAccess.getPrefixAccess().getIriStringAssignment_0_2(), "rule__Prefix__IriStringAssignment_0_2");
			builder.put(grammarAccess.getPrefixAccess().getTAssignment_1_1(), "rule__Prefix__TAssignment_1_1");
			builder.put(grammarAccess.getPrefixAccess().getIriStringAssignment_1_2(), "rule__Prefix__IriStringAssignment_1_2");
			builder.put(grammarAccess.getBaseAccess().getIriStringAssignment_1(), "rule__Base__IriStringAssignment_1");
			builder.put(grammarAccess.getConfigurable_LiteralAccess().getTAssignment_0(), "rule__Configurable_Literal__TAssignment_0");
			builder.put(grammarAccess.getConfigurable_LiteralAccess().getTAssignment_1(), "rule__Configurable_Literal__TAssignment_1");
			builder.put(grammarAccess.getConfigurable_LiteralAccess().getSAssignment_2(), "rule__Configurable_Literal__SAssignment_2");
			builder.put(grammarAccess.getConfigurable_LiteralAccess().getSAssignment_3(), "rule__Configurable_Literal__SAssignment_3");
			builder.put(grammarAccess.getBraceDelimitedLiteralAccess().getSbAssignment_2(), "rule__BraceDelimitedLiteral__SbAssignment_2");
			builder.put(grammarAccess.getBraceDelimitedLiteralBodyAccess().getSAssignment(), "rule__BraceDelimitedLiteralBody__SAssignment");
			builder.put(grammarAccess.getBracketDelimitedLiteralAccess().getSbAssignment_2(), "rule__BracketDelimitedLiteral__SbAssignment_2");
			builder.put(grammarAccess.getBracketDelimitedLiteralBodyAccess().getSAssignment(), "rule__BracketDelimitedLiteralBody__SAssignment");
			builder.put(grammarAccess.getArgumentsAccess().getStrAssignment_1_0(), "rule__Arguments__StrAssignment_1_0");
			builder.put(grammarAccess.getArgumentsAccess().getStrAssignment_1_1(), "rule__Arguments__StrAssignment_1_1");
			builder.put(grammarAccess.getArgumentsAccess().getTAssignment_1_2(), "rule__Arguments__TAssignment_1_2");
			builder.put(grammarAccess.getArgumentsAccess().getSAssignment_2_1(), "rule__Arguments__SAssignment_2_1");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private RLSGrammarAccess grammarAccess;

	@Override
	protected InternalRLSParser createParser() {
		InternalRLSParser result = new InternalRLSParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_SKIP" };
	}

	public RLSGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(RLSGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
