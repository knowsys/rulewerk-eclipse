package rls4eclipse.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import rls4eclipse.services.RLSGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalRLSParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_E", "RULE_DATATYPE", "RULE_COMMA", "RULE_TILDE", "RULE_LPAREN", "RULE_RPAREN", "RULE_ARROW", "RULE_DOT", "RULE_SRC", "RULE_COLON", "RULE_PRFX", "RULE_BS", "RULE_PNAME_LN", "RULE_IRI", "RULE_STRING_LITERAL1", "RULE_STRING_LITERAL2", "RULE_STRING_LITERAL_LONG1", "RULE_STRING_LITERAL_LONG2", "RULE_LANGTAG", "RULE_INTEGER", "RULE_DECIMAL", "RULE_DOUBLE", "RULE_UNIVAR", "RULE_EXIVAR", "RULE_VARORPREDNAME", "RULE_NAMED_NULL", "RULE_DIRECTIVENAME", "RULE_ARITY", "RULE_PNAME_NS", "RULE_PIPE_DELIMITED_LITERAL", "RULE_HASH_DELIMITED_LITERAL", "RULE_UNBRACE", "RULE_UNBRACKET", "RULE_LOADCSV", "RULE_LOADRDF", "RULE_SPARQL", "RULE_PN_CHARS_U", "RULE_PN_CHARS", "RULE_DIGITS", "RULE_EXPONENT", "RULE_SKIP", "RULE_ECHAR", "RULE_PN_PREFIX", "RULE_PN_LOCAL", "RULE_QMARK", "RULE_EMARK", "RULE_AT", "RULE_A2Z", "RULE_A2ZN", "RULE_A2ZNX", "RULE_PN_CHARS_BASE", "RULE_NOT", "'{'", "'}'", "'['", "']'"
    };
    public static final int RULE_LPAREN=8;
    public static final int RULE_PIPE_DELIMITED_LITERAL=33;
    public static final int RULE_PRFX=14;
    public static final int RULE_NAMED_NULL=29;
    public static final int T__59=59;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int RULE_ARROW=10;
    public static final int RULE_A2Z=51;
    public static final int RULE_A2ZNX=53;
    public static final int RULE_PNAME_LN=16;
    public static final int RULE_COMMA=6;
    public static final int RULE_DATATYPE=5;
    public static final int RULE_COLON=13;
    public static final int RULE_UNBRACE=35;
    public static final int RULE_DECIMAL=24;
    public static final int RULE_DIRECTIVENAME=30;
    public static final int RULE_TILDE=7;
    public static final int RULE_UNBRACKET=36;
    public static final int RULE_SPARQL=39;
    public static final int RULE_PN_PREFIX=46;
    public static final int RULE_ECHAR=45;
    public static final int RULE_SRC=12;
    public static final int RULE_EXIVAR=27;
    public static final int RULE_EMARK=49;
    public static final int RULE_HASH_DELIMITED_LITERAL=34;
    public static final int RULE_PN_CHARS_BASE=54;
    public static final int RULE_STRING_LITERAL1=18;
    public static final int RULE_STRING_LITERAL2=19;
    public static final int RULE_IRI=17;
    public static final int RULE_VARORPREDNAME=28;
    public static final int RULE_ARITY=31;
    public static final int RULE_QMARK=48;
    public static final int RULE_A2ZN=52;
    public static final int RULE_STRING_LITERAL_LONG1=20;
    public static final int RULE_STRING_LITERAL_LONG2=21;
    public static final int RULE_SKIP=44;
    public static final int RULE_NOT=55;
    public static final int RULE_DIGITS=42;
    public static final int RULE_AT=50;
    public static final int RULE_PN_LOCAL=47;
    public static final int RULE_DOUBLE=25;
    public static final int RULE_UNIVAR=26;
    public static final int RULE_PNAME_NS=32;
    public static final int RULE_DOT=11;
    public static final int EOF=-1;
    public static final int RULE_LANGTAG=22;
    public static final int RULE_PN_CHARS=41;
    public static final int RULE_LOADRDF=38;
    public static final int RULE_BS=15;
    public static final int RULE_RPAREN=9;
    public static final int RULE_PN_CHARS_U=40;
    public static final int RULE_EXPONENT=43;
    public static final int RULE_E=4;
    public static final int RULE_LOADCSV=37;
    public static final int RULE_INTEGER=23;

    // delegates
    // delegators


        public InternalRLSParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalRLSParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalRLSParser.tokenNames; }
    public String getGrammarFileName() { return "InternalRLS.g"; }


    	private RLSGrammarAccess grammarAccess;

    	public void setGrammarAccess(RLSGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleModel"
    // InternalRLS.g:54:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalRLS.g:55:1: ( ruleModel EOF )
            // InternalRLS.g:56:1: ruleModel EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalRLS.g:63:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:67:2: ( ( ( rule__Model__Group__0 ) ) )
            // InternalRLS.g:68:2: ( ( rule__Model__Group__0 ) )
            {
            // InternalRLS.g:68:2: ( ( rule__Model__Group__0 ) )
            // InternalRLS.g:69:3: ( rule__Model__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getGroup()); 
            }
            // InternalRLS.g:70:3: ( rule__Model__Group__0 )
            // InternalRLS.g:70:4: rule__Model__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRulePrefixedName"
    // InternalRLS.g:79:1: entryRulePrefixedName : rulePrefixedName EOF ;
    public final void entryRulePrefixedName() throws RecognitionException {
        try {
            // InternalRLS.g:80:1: ( rulePrefixedName EOF )
            // InternalRLS.g:81:1: rulePrefixedName EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrefixedNameRule()); 
            }
            pushFollow(FOLLOW_1);
            rulePrefixedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrefixedNameRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePrefixedName"


    // $ANTLR start "rulePrefixedName"
    // InternalRLS.g:88:1: rulePrefixedName : ( ( rule__PrefixedName__TAssignment ) ) ;
    public final void rulePrefixedName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:92:2: ( ( ( rule__PrefixedName__TAssignment ) ) )
            // InternalRLS.g:93:2: ( ( rule__PrefixedName__TAssignment ) )
            {
            // InternalRLS.g:93:2: ( ( rule__PrefixedName__TAssignment ) )
            // InternalRLS.g:94:3: ( rule__PrefixedName__TAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrefixedNameAccess().getTAssignment()); 
            }
            // InternalRLS.g:95:3: ( rule__PrefixedName__TAssignment )
            // InternalRLS.g:95:4: rule__PrefixedName__TAssignment
            {
            pushFollow(FOLLOW_2);
            rule__PrefixedName__TAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrefixedNameAccess().getTAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrefixedName"


    // $ANTLR start "entryRuleIRIREF"
    // InternalRLS.g:104:1: entryRuleIRIREF : ruleIRIREF EOF ;
    public final void entryRuleIRIREF() throws RecognitionException {
        try {
            // InternalRLS.g:105:1: ( ruleIRIREF EOF )
            // InternalRLS.g:106:1: ruleIRIREF EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIRIREFRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleIRIREF();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIRIREFRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIRIREF"


    // $ANTLR start "ruleIRIREF"
    // InternalRLS.g:113:1: ruleIRIREF : ( ( rule__IRIREF__TAssignment ) ) ;
    public final void ruleIRIREF() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:117:2: ( ( ( rule__IRIREF__TAssignment ) ) )
            // InternalRLS.g:118:2: ( ( rule__IRIREF__TAssignment ) )
            {
            // InternalRLS.g:118:2: ( ( rule__IRIREF__TAssignment ) )
            // InternalRLS.g:119:3: ( rule__IRIREF__TAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIRIREFAccess().getTAssignment()); 
            }
            // InternalRLS.g:120:3: ( rule__IRIREF__TAssignment )
            // InternalRLS.g:120:4: rule__IRIREF__TAssignment
            {
            pushFollow(FOLLOW_2);
            rule__IRIREF__TAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIRIREFAccess().getTAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIRIREF"


    // $ANTLR start "entryRuleIRIBOL"
    // InternalRLS.g:129:1: entryRuleIRIBOL : ruleIRIBOL EOF ;
    public final void entryRuleIRIBOL() throws RecognitionException {
        try {
            // InternalRLS.g:130:1: ( ruleIRIBOL EOF )
            // InternalRLS.g:131:1: ruleIRIBOL EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIRIBOLRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleIRIBOL();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIRIBOLRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIRIBOL"


    // $ANTLR start "ruleIRIBOL"
    // InternalRLS.g:138:1: ruleIRIBOL : ( ( rule__IRIBOL__Alternatives ) ) ;
    public final void ruleIRIBOL() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:142:2: ( ( ( rule__IRIBOL__Alternatives ) ) )
            // InternalRLS.g:143:2: ( ( rule__IRIBOL__Alternatives ) )
            {
            // InternalRLS.g:143:2: ( ( rule__IRIBOL__Alternatives ) )
            // InternalRLS.g:144:3: ( rule__IRIBOL__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIRIBOLAccess().getAlternatives()); 
            }
            // InternalRLS.g:145:3: ( rule__IRIBOL__Alternatives )
            // InternalRLS.g:145:4: rule__IRIBOL__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__IRIBOL__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIRIBOLAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIRIBOL"


    // $ANTLR start "entryRuleStriing"
    // InternalRLS.g:154:1: entryRuleStriing : ruleStriing EOF ;
    public final void entryRuleStriing() throws RecognitionException {
        try {
            // InternalRLS.g:155:1: ( ruleStriing EOF )
            // InternalRLS.g:156:1: ruleStriing EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStriingRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleStriing();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStriingRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStriing"


    // $ANTLR start "ruleStriing"
    // InternalRLS.g:163:1: ruleStriing : ( ( rule__Striing__Alternatives ) ) ;
    public final void ruleStriing() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:167:2: ( ( ( rule__Striing__Alternatives ) ) )
            // InternalRLS.g:168:2: ( ( rule__Striing__Alternatives ) )
            {
            // InternalRLS.g:168:2: ( ( rule__Striing__Alternatives ) )
            // InternalRLS.g:169:3: ( rule__Striing__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStriingAccess().getAlternatives()); 
            }
            // InternalRLS.g:170:3: ( rule__Striing__Alternatives )
            // InternalRLS.g:170:4: rule__Striing__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Striing__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStriingAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStriing"


    // $ANTLR start "entryRuleLangtagg"
    // InternalRLS.g:179:1: entryRuleLangtagg : ruleLangtagg EOF ;
    public final void entryRuleLangtagg() throws RecognitionException {
        try {
            // InternalRLS.g:180:1: ( ruleLangtagg EOF )
            // InternalRLS.g:181:1: ruleLangtagg EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLangtaggRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleLangtagg();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLangtaggRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLangtagg"


    // $ANTLR start "ruleLangtagg"
    // InternalRLS.g:188:1: ruleLangtagg : ( ( rule__Langtagg__TAssignment ) ) ;
    public final void ruleLangtagg() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:192:2: ( ( ( rule__Langtagg__TAssignment ) ) )
            // InternalRLS.g:193:2: ( ( rule__Langtagg__TAssignment ) )
            {
            // InternalRLS.g:193:2: ( ( rule__Langtagg__TAssignment ) )
            // InternalRLS.g:194:3: ( rule__Langtagg__TAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLangtaggAccess().getTAssignment()); 
            }
            // InternalRLS.g:195:3: ( rule__Langtagg__TAssignment )
            // InternalRLS.g:195:4: rule__Langtagg__TAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Langtagg__TAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLangtaggAccess().getTAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLangtagg"


    // $ANTLR start "entryRuleRDFLiteral"
    // InternalRLS.g:204:1: entryRuleRDFLiteral : ruleRDFLiteral EOF ;
    public final void entryRuleRDFLiteral() throws RecognitionException {
        try {
            // InternalRLS.g:205:1: ( ruleRDFLiteral EOF )
            // InternalRLS.g:206:1: ruleRDFLiteral EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRDFLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleRDFLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRDFLiteralRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRDFLiteral"


    // $ANTLR start "ruleRDFLiteral"
    // InternalRLS.g:213:1: ruleRDFLiteral : ( ( rule__RDFLiteral__Group__0 ) ) ;
    public final void ruleRDFLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:217:2: ( ( ( rule__RDFLiteral__Group__0 ) ) )
            // InternalRLS.g:218:2: ( ( rule__RDFLiteral__Group__0 ) )
            {
            // InternalRLS.g:218:2: ( ( rule__RDFLiteral__Group__0 ) )
            // InternalRLS.g:219:3: ( rule__RDFLiteral__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRDFLiteralAccess().getGroup()); 
            }
            // InternalRLS.g:220:3: ( rule__RDFLiteral__Group__0 )
            // InternalRLS.g:220:4: rule__RDFLiteral__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RDFLiteral__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRDFLiteralAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRDFLiteral"


    // $ANTLR start "entryRuleNumericLiteral"
    // InternalRLS.g:229:1: entryRuleNumericLiteral : ruleNumericLiteral EOF ;
    public final void entryRuleNumericLiteral() throws RecognitionException {
        try {
            // InternalRLS.g:230:1: ( ruleNumericLiteral EOF )
            // InternalRLS.g:231:1: ruleNumericLiteral EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumericLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleNumericLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNumericLiteralRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNumericLiteral"


    // $ANTLR start "ruleNumericLiteral"
    // InternalRLS.g:238:1: ruleNumericLiteral : ( ( rule__NumericLiteral__Alternatives ) ) ;
    public final void ruleNumericLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:242:2: ( ( ( rule__NumericLiteral__Alternatives ) ) )
            // InternalRLS.g:243:2: ( ( rule__NumericLiteral__Alternatives ) )
            {
            // InternalRLS.g:243:2: ( ( rule__NumericLiteral__Alternatives ) )
            // InternalRLS.g:244:3: ( rule__NumericLiteral__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumericLiteralAccess().getAlternatives()); 
            }
            // InternalRLS.g:245:3: ( rule__NumericLiteral__Alternatives )
            // InternalRLS.g:245:4: rule__NumericLiteral__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__NumericLiteral__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNumericLiteralAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNumericLiteral"


    // $ANTLR start "entryRuleTerm"
    // InternalRLS.g:254:1: entryRuleTerm : ruleTerm EOF ;
    public final void entryRuleTerm() throws RecognitionException {
        try {
            // InternalRLS.g:255:1: ( ruleTerm EOF )
            // InternalRLS.g:256:1: ruleTerm EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTermRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleTerm();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTermRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTerm"


    // $ANTLR start "ruleTerm"
    // InternalRLS.g:263:1: ruleTerm : ( ( rule__Term__Alternatives ) ) ;
    public final void ruleTerm() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:267:2: ( ( ( rule__Term__Alternatives ) ) )
            // InternalRLS.g:268:2: ( ( rule__Term__Alternatives ) )
            {
            // InternalRLS.g:268:2: ( ( rule__Term__Alternatives ) )
            // InternalRLS.g:269:3: ( rule__Term__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTermAccess().getAlternatives()); 
            }
            // InternalRLS.g:270:3: ( rule__Term__Alternatives )
            // InternalRLS.g:270:4: rule__Term__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Term__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTermAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTerm"


    // $ANTLR start "entryRulepredicateName"
    // InternalRLS.g:279:1: entryRulepredicateName : rulepredicateName EOF ;
    public final void entryRulepredicateName() throws RecognitionException {
        try {
            // InternalRLS.g:280:1: ( rulepredicateName EOF )
            // InternalRLS.g:281:1: rulepredicateName EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPredicateNameRule()); 
            }
            pushFollow(FOLLOW_1);
            rulepredicateName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPredicateNameRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulepredicateName"


    // $ANTLR start "rulepredicateName"
    // InternalRLS.g:288:1: rulepredicateName : ( ( rule__PredicateName__Alternatives ) ) ;
    public final void rulepredicateName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:292:2: ( ( ( rule__PredicateName__Alternatives ) ) )
            // InternalRLS.g:293:2: ( ( rule__PredicateName__Alternatives ) )
            {
            // InternalRLS.g:293:2: ( ( rule__PredicateName__Alternatives ) )
            // InternalRLS.g:294:3: ( rule__PredicateName__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPredicateNameAccess().getAlternatives()); 
            }
            // InternalRLS.g:295:3: ( rule__PredicateName__Alternatives )
            // InternalRLS.g:295:4: rule__PredicateName__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__PredicateName__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPredicateNameAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulepredicateName"


    // $ANTLR start "entryRulelistOfTerms"
    // InternalRLS.g:304:1: entryRulelistOfTerms : rulelistOfTerms EOF ;
    public final void entryRulelistOfTerms() throws RecognitionException {
        try {
            // InternalRLS.g:305:1: ( rulelistOfTerms EOF )
            // InternalRLS.g:306:1: rulelistOfTerms EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListOfTermsRule()); 
            }
            pushFollow(FOLLOW_1);
            rulelistOfTerms();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getListOfTermsRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulelistOfTerms"


    // $ANTLR start "rulelistOfTerms"
    // InternalRLS.g:313:1: rulelistOfTerms : ( ( rule__ListOfTerms__Group__0 ) ) ;
    public final void rulelistOfTerms() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:317:2: ( ( ( rule__ListOfTerms__Group__0 ) ) )
            // InternalRLS.g:318:2: ( ( rule__ListOfTerms__Group__0 ) )
            {
            // InternalRLS.g:318:2: ( ( rule__ListOfTerms__Group__0 ) )
            // InternalRLS.g:319:3: ( rule__ListOfTerms__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListOfTermsAccess().getGroup()); 
            }
            // InternalRLS.g:320:3: ( rule__ListOfTerms__Group__0 )
            // InternalRLS.g:320:4: rule__ListOfTerms__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ListOfTerms__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getListOfTermsAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulelistOfTerms"


    // $ANTLR start "entryRuleNegativeLiteral"
    // InternalRLS.g:329:1: entryRuleNegativeLiteral : ruleNegativeLiteral EOF ;
    public final void entryRuleNegativeLiteral() throws RecognitionException {
        try {
            // InternalRLS.g:330:1: ( ruleNegativeLiteral EOF )
            // InternalRLS.g:331:1: ruleNegativeLiteral EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegativeLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleNegativeLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNegativeLiteralRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNegativeLiteral"


    // $ANTLR start "ruleNegativeLiteral"
    // InternalRLS.g:338:1: ruleNegativeLiteral : ( ( rule__NegativeLiteral__Group__0 ) ) ;
    public final void ruleNegativeLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:342:2: ( ( ( rule__NegativeLiteral__Group__0 ) ) )
            // InternalRLS.g:343:2: ( ( rule__NegativeLiteral__Group__0 ) )
            {
            // InternalRLS.g:343:2: ( ( rule__NegativeLiteral__Group__0 ) )
            // InternalRLS.g:344:3: ( rule__NegativeLiteral__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegativeLiteralAccess().getGroup()); 
            }
            // InternalRLS.g:345:3: ( rule__NegativeLiteral__Group__0 )
            // InternalRLS.g:345:4: rule__NegativeLiteral__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__NegativeLiteral__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNegativeLiteralAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNegativeLiteral"


    // $ANTLR start "entryRuleFact"
    // InternalRLS.g:354:1: entryRuleFact : ruleFact EOF ;
    public final void entryRuleFact() throws RecognitionException {
        try {
            // InternalRLS.g:355:1: ( ruleFact EOF )
            // InternalRLS.g:356:1: ruleFact EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFactRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleFact();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFactRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFact"


    // $ANTLR start "ruleFact"
    // InternalRLS.g:363:1: ruleFact : ( ( rule__Fact__Group__0 ) ) ;
    public final void ruleFact() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:367:2: ( ( ( rule__Fact__Group__0 ) ) )
            // InternalRLS.g:368:2: ( ( rule__Fact__Group__0 ) )
            {
            // InternalRLS.g:368:2: ( ( rule__Fact__Group__0 ) )
            // InternalRLS.g:369:3: ( rule__Fact__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFactAccess().getGroup()); 
            }
            // InternalRLS.g:370:3: ( rule__Fact__Group__0 )
            // InternalRLS.g:370:4: rule__Fact__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Fact__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFactAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFact"


    // $ANTLR start "entryRulePositiveLiteral"
    // InternalRLS.g:379:1: entryRulePositiveLiteral : rulePositiveLiteral EOF ;
    public final void entryRulePositiveLiteral() throws RecognitionException {
        try {
            // InternalRLS.g:380:1: ( rulePositiveLiteral EOF )
            // InternalRLS.g:381:1: rulePositiveLiteral EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPositiveLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            rulePositiveLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPositiveLiteralRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePositiveLiteral"


    // $ANTLR start "rulePositiveLiteral"
    // InternalRLS.g:388:1: rulePositiveLiteral : ( ( rule__PositiveLiteral__Group__0 ) ) ;
    public final void rulePositiveLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:392:2: ( ( ( rule__PositiveLiteral__Group__0 ) ) )
            // InternalRLS.g:393:2: ( ( rule__PositiveLiteral__Group__0 ) )
            {
            // InternalRLS.g:393:2: ( ( rule__PositiveLiteral__Group__0 ) )
            // InternalRLS.g:394:3: ( rule__PositiveLiteral__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPositiveLiteralAccess().getGroup()); 
            }
            // InternalRLS.g:395:3: ( rule__PositiveLiteral__Group__0 )
            // InternalRLS.g:395:4: rule__PositiveLiteral__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PositiveLiteral__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPositiveLiteralAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePositiveLiteral"


    // $ANTLR start "entryRuleLiteral"
    // InternalRLS.g:404:1: entryRuleLiteral : ruleLiteral EOF ;
    public final void entryRuleLiteral() throws RecognitionException {
        try {
            // InternalRLS.g:405:1: ( ruleLiteral EOF )
            // InternalRLS.g:406:1: ruleLiteral EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLiteral"


    // $ANTLR start "ruleLiteral"
    // InternalRLS.g:413:1: ruleLiteral : ( ( rule__Literal__Alternatives ) ) ;
    public final void ruleLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:417:2: ( ( ( rule__Literal__Alternatives ) ) )
            // InternalRLS.g:418:2: ( ( rule__Literal__Alternatives ) )
            {
            // InternalRLS.g:418:2: ( ( rule__Literal__Alternatives ) )
            // InternalRLS.g:419:3: ( rule__Literal__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralAccess().getAlternatives()); 
            }
            // InternalRLS.g:420:3: ( rule__Literal__Alternatives )
            // InternalRLS.g:420:4: rule__Literal__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Literal__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLiteral"


    // $ANTLR start "entryRulelistOfLiterals"
    // InternalRLS.g:429:1: entryRulelistOfLiterals : rulelistOfLiterals EOF ;
    public final void entryRulelistOfLiterals() throws RecognitionException {
        try {
            // InternalRLS.g:430:1: ( rulelistOfLiterals EOF )
            // InternalRLS.g:431:1: rulelistOfLiterals EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListOfLiteralsRule()); 
            }
            pushFollow(FOLLOW_1);
            rulelistOfLiterals();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getListOfLiteralsRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulelistOfLiterals"


    // $ANTLR start "rulelistOfLiterals"
    // InternalRLS.g:438:1: rulelistOfLiterals : ( ( rule__ListOfLiterals__Group__0 ) ) ;
    public final void rulelistOfLiterals() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:442:2: ( ( ( rule__ListOfLiterals__Group__0 ) ) )
            // InternalRLS.g:443:2: ( ( rule__ListOfLiterals__Group__0 ) )
            {
            // InternalRLS.g:443:2: ( ( rule__ListOfLiterals__Group__0 ) )
            // InternalRLS.g:444:3: ( rule__ListOfLiterals__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListOfLiteralsAccess().getGroup()); 
            }
            // InternalRLS.g:445:3: ( rule__ListOfLiterals__Group__0 )
            // InternalRLS.g:445:4: rule__ListOfLiterals__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ListOfLiterals__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getListOfLiteralsAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulelistOfLiterals"


    // $ANTLR start "entryRulelistOfPositiveLiterals"
    // InternalRLS.g:454:1: entryRulelistOfPositiveLiterals : rulelistOfPositiveLiterals EOF ;
    public final void entryRulelistOfPositiveLiterals() throws RecognitionException {
        try {
            // InternalRLS.g:455:1: ( rulelistOfPositiveLiterals EOF )
            // InternalRLS.g:456:1: rulelistOfPositiveLiterals EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListOfPositiveLiteralsRule()); 
            }
            pushFollow(FOLLOW_1);
            rulelistOfPositiveLiterals();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getListOfPositiveLiteralsRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulelistOfPositiveLiterals"


    // $ANTLR start "rulelistOfPositiveLiterals"
    // InternalRLS.g:463:1: rulelistOfPositiveLiterals : ( ( rule__ListOfPositiveLiterals__Group__0 ) ) ;
    public final void rulelistOfPositiveLiterals() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:467:2: ( ( ( rule__ListOfPositiveLiterals__Group__0 ) ) )
            // InternalRLS.g:468:2: ( ( rule__ListOfPositiveLiterals__Group__0 ) )
            {
            // InternalRLS.g:468:2: ( ( rule__ListOfPositiveLiterals__Group__0 ) )
            // InternalRLS.g:469:3: ( rule__ListOfPositiveLiterals__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListOfPositiveLiteralsAccess().getGroup()); 
            }
            // InternalRLS.g:470:3: ( rule__ListOfPositiveLiterals__Group__0 )
            // InternalRLS.g:470:4: rule__ListOfPositiveLiterals__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ListOfPositiveLiterals__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getListOfPositiveLiteralsAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulelistOfPositiveLiterals"


    // $ANTLR start "entryRuleRule"
    // InternalRLS.g:479:1: entryRuleRule : ruleRule EOF ;
    public final void entryRuleRule() throws RecognitionException {
        try {
            // InternalRLS.g:480:1: ( ruleRule EOF )
            // InternalRLS.g:481:1: ruleRule EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleRule();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuleRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRule"


    // $ANTLR start "ruleRule"
    // InternalRLS.g:488:1: ruleRule : ( ( rule__Rule__Group__0 ) ) ;
    public final void ruleRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:492:2: ( ( ( rule__Rule__Group__0 ) ) )
            // InternalRLS.g:493:2: ( ( rule__Rule__Group__0 ) )
            {
            // InternalRLS.g:493:2: ( ( rule__Rule__Group__0 ) )
            // InternalRLS.g:494:3: ( rule__Rule__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleAccess().getGroup()); 
            }
            // InternalRLS.g:495:3: ( rule__Rule__Group__0 )
            // InternalRLS.g:495:4: rule__Rule__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Rule__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuleAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRule"


    // $ANTLR start "entryRuleStatement"
    // InternalRLS.g:504:1: entryRuleStatement : ruleStatement EOF ;
    public final void entryRuleStatement() throws RecognitionException {
        try {
            // InternalRLS.g:505:1: ( ruleStatement EOF )
            // InternalRLS.g:506:1: ruleStatement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleStatement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // InternalRLS.g:513:1: ruleStatement : ( ( rule__Statement__Alternatives ) ) ;
    public final void ruleStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:517:2: ( ( ( rule__Statement__Alternatives ) ) )
            // InternalRLS.g:518:2: ( ( rule__Statement__Alternatives ) )
            {
            // InternalRLS.g:518:2: ( ( rule__Statement__Alternatives ) )
            // InternalRLS.g:519:3: ( rule__Statement__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getAlternatives()); 
            }
            // InternalRLS.g:520:3: ( rule__Statement__Alternatives )
            // InternalRLS.g:520:4: rule__Statement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Statement__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleDataSource"
    // InternalRLS.g:529:1: entryRuleDataSource : ruleDataSource EOF ;
    public final void entryRuleDataSource() throws RecognitionException {
        try {
            // InternalRLS.g:530:1: ( ruleDataSource EOF )
            // InternalRLS.g:531:1: ruleDataSource EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDataSourceRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleDataSource();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDataSourceRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDataSource"


    // $ANTLR start "ruleDataSource"
    // InternalRLS.g:538:1: ruleDataSource : ( ( rule__DataSource__Group__0 ) ) ;
    public final void ruleDataSource() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:542:2: ( ( ( rule__DataSource__Group__0 ) ) )
            // InternalRLS.g:543:2: ( ( rule__DataSource__Group__0 ) )
            {
            // InternalRLS.g:543:2: ( ( rule__DataSource__Group__0 ) )
            // InternalRLS.g:544:3: ( rule__DataSource__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDataSourceAccess().getGroup()); 
            }
            // InternalRLS.g:545:3: ( rule__DataSource__Group__0 )
            // InternalRLS.g:545:4: rule__DataSource__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DataSource__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDataSourceAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDataSource"


    // $ANTLR start "entryRuleSource"
    // InternalRLS.g:554:1: entryRuleSource : ruleSource EOF ;
    public final void entryRuleSource() throws RecognitionException {
        try {
            // InternalRLS.g:555:1: ( ruleSource EOF )
            // InternalRLS.g:556:1: ruleSource EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSourceRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleSource();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSourceRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSource"


    // $ANTLR start "ruleSource"
    // InternalRLS.g:563:1: ruleSource : ( ( rule__Source__Group__0 ) ) ;
    public final void ruleSource() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:567:2: ( ( ( rule__Source__Group__0 ) ) )
            // InternalRLS.g:568:2: ( ( rule__Source__Group__0 ) )
            {
            // InternalRLS.g:568:2: ( ( rule__Source__Group__0 ) )
            // InternalRLS.g:569:3: ( rule__Source__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSourceAccess().getGroup()); 
            }
            // InternalRLS.g:570:3: ( rule__Source__Group__0 )
            // InternalRLS.g:570:4: rule__Source__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Source__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSourceAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSource"


    // $ANTLR start "entryRulePrefix"
    // InternalRLS.g:579:1: entryRulePrefix : rulePrefix EOF ;
    public final void entryRulePrefix() throws RecognitionException {
        try {
            // InternalRLS.g:580:1: ( rulePrefix EOF )
            // InternalRLS.g:581:1: rulePrefix EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrefixRule()); 
            }
            pushFollow(FOLLOW_1);
            rulePrefix();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrefixRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePrefix"


    // $ANTLR start "rulePrefix"
    // InternalRLS.g:588:1: rulePrefix : ( ( rule__Prefix__Alternatives ) ) ;
    public final void rulePrefix() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:592:2: ( ( ( rule__Prefix__Alternatives ) ) )
            // InternalRLS.g:593:2: ( ( rule__Prefix__Alternatives ) )
            {
            // InternalRLS.g:593:2: ( ( rule__Prefix__Alternatives ) )
            // InternalRLS.g:594:3: ( rule__Prefix__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrefixAccess().getAlternatives()); 
            }
            // InternalRLS.g:595:3: ( rule__Prefix__Alternatives )
            // InternalRLS.g:595:4: rule__Prefix__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Prefix__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrefixAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrefix"


    // $ANTLR start "entryRuleBase"
    // InternalRLS.g:604:1: entryRuleBase : ruleBase EOF ;
    public final void entryRuleBase() throws RecognitionException {
        try {
            // InternalRLS.g:605:1: ( ruleBase EOF )
            // InternalRLS.g:606:1: ruleBase EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBaseRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleBase();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBaseRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBase"


    // $ANTLR start "ruleBase"
    // InternalRLS.g:613:1: ruleBase : ( ( rule__Base__Group__0 ) ) ;
    public final void ruleBase() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:617:2: ( ( ( rule__Base__Group__0 ) ) )
            // InternalRLS.g:618:2: ( ( rule__Base__Group__0 ) )
            {
            // InternalRLS.g:618:2: ( ( rule__Base__Group__0 ) )
            // InternalRLS.g:619:3: ( rule__Base__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBaseAccess().getGroup()); 
            }
            // InternalRLS.g:620:3: ( rule__Base__Group__0 )
            // InternalRLS.g:620:4: rule__Base__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Base__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBaseAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBase"


    // $ANTLR start "entryRuleConfigurable_Literal"
    // InternalRLS.g:629:1: entryRuleConfigurable_Literal : ruleConfigurable_Literal EOF ;
    public final void entryRuleConfigurable_Literal() throws RecognitionException {
        try {
            // InternalRLS.g:630:1: ( ruleConfigurable_Literal EOF )
            // InternalRLS.g:631:1: ruleConfigurable_Literal EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigurable_LiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleConfigurable_Literal();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConfigurable_LiteralRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConfigurable_Literal"


    // $ANTLR start "ruleConfigurable_Literal"
    // InternalRLS.g:638:1: ruleConfigurable_Literal : ( ( rule__Configurable_Literal__Alternatives ) ) ;
    public final void ruleConfigurable_Literal() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:642:2: ( ( ( rule__Configurable_Literal__Alternatives ) ) )
            // InternalRLS.g:643:2: ( ( rule__Configurable_Literal__Alternatives ) )
            {
            // InternalRLS.g:643:2: ( ( rule__Configurable_Literal__Alternatives ) )
            // InternalRLS.g:644:3: ( rule__Configurable_Literal__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigurable_LiteralAccess().getAlternatives()); 
            }
            // InternalRLS.g:645:3: ( rule__Configurable_Literal__Alternatives )
            // InternalRLS.g:645:4: rule__Configurable_Literal__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Configurable_Literal__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConfigurable_LiteralAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConfigurable_Literal"


    // $ANTLR start "entryRulebraceDelimitedLiteral"
    // InternalRLS.g:654:1: entryRulebraceDelimitedLiteral : rulebraceDelimitedLiteral EOF ;
    public final void entryRulebraceDelimitedLiteral() throws RecognitionException {
        try {
            // InternalRLS.g:655:1: ( rulebraceDelimitedLiteral EOF )
            // InternalRLS.g:656:1: rulebraceDelimitedLiteral EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBraceDelimitedLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            rulebraceDelimitedLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBraceDelimitedLiteralRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulebraceDelimitedLiteral"


    // $ANTLR start "rulebraceDelimitedLiteral"
    // InternalRLS.g:663:1: rulebraceDelimitedLiteral : ( ( rule__BraceDelimitedLiteral__Group__0 ) ) ;
    public final void rulebraceDelimitedLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:667:2: ( ( ( rule__BraceDelimitedLiteral__Group__0 ) ) )
            // InternalRLS.g:668:2: ( ( rule__BraceDelimitedLiteral__Group__0 ) )
            {
            // InternalRLS.g:668:2: ( ( rule__BraceDelimitedLiteral__Group__0 ) )
            // InternalRLS.g:669:3: ( rule__BraceDelimitedLiteral__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBraceDelimitedLiteralAccess().getGroup()); 
            }
            // InternalRLS.g:670:3: ( rule__BraceDelimitedLiteral__Group__0 )
            // InternalRLS.g:670:4: rule__BraceDelimitedLiteral__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BraceDelimitedLiteral__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBraceDelimitedLiteralAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulebraceDelimitedLiteral"


    // $ANTLR start "entryRulebraceDelimitedLiteralBody"
    // InternalRLS.g:679:1: entryRulebraceDelimitedLiteralBody : rulebraceDelimitedLiteralBody EOF ;
    public final void entryRulebraceDelimitedLiteralBody() throws RecognitionException {
        try {
            // InternalRLS.g:680:1: ( rulebraceDelimitedLiteralBody EOF )
            // InternalRLS.g:681:1: rulebraceDelimitedLiteralBody EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBraceDelimitedLiteralBodyRule()); 
            }
            pushFollow(FOLLOW_1);
            rulebraceDelimitedLiteralBody();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBraceDelimitedLiteralBodyRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulebraceDelimitedLiteralBody"


    // $ANTLR start "rulebraceDelimitedLiteralBody"
    // InternalRLS.g:688:1: rulebraceDelimitedLiteralBody : ( ( rule__BraceDelimitedLiteralBody__SAssignment ) ) ;
    public final void rulebraceDelimitedLiteralBody() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:692:2: ( ( ( rule__BraceDelimitedLiteralBody__SAssignment ) ) )
            // InternalRLS.g:693:2: ( ( rule__BraceDelimitedLiteralBody__SAssignment ) )
            {
            // InternalRLS.g:693:2: ( ( rule__BraceDelimitedLiteralBody__SAssignment ) )
            // InternalRLS.g:694:3: ( rule__BraceDelimitedLiteralBody__SAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBraceDelimitedLiteralBodyAccess().getSAssignment()); 
            }
            // InternalRLS.g:695:3: ( rule__BraceDelimitedLiteralBody__SAssignment )
            // InternalRLS.g:695:4: rule__BraceDelimitedLiteralBody__SAssignment
            {
            pushFollow(FOLLOW_2);
            rule__BraceDelimitedLiteralBody__SAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBraceDelimitedLiteralBodyAccess().getSAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulebraceDelimitedLiteralBody"


    // $ANTLR start "entryRulebracketDelimitedLiteral"
    // InternalRLS.g:704:1: entryRulebracketDelimitedLiteral : rulebracketDelimitedLiteral EOF ;
    public final void entryRulebracketDelimitedLiteral() throws RecognitionException {
        try {
            // InternalRLS.g:705:1: ( rulebracketDelimitedLiteral EOF )
            // InternalRLS.g:706:1: rulebracketDelimitedLiteral EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBracketDelimitedLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            rulebracketDelimitedLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBracketDelimitedLiteralRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulebracketDelimitedLiteral"


    // $ANTLR start "rulebracketDelimitedLiteral"
    // InternalRLS.g:713:1: rulebracketDelimitedLiteral : ( ( rule__BracketDelimitedLiteral__Group__0 ) ) ;
    public final void rulebracketDelimitedLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:717:2: ( ( ( rule__BracketDelimitedLiteral__Group__0 ) ) )
            // InternalRLS.g:718:2: ( ( rule__BracketDelimitedLiteral__Group__0 ) )
            {
            // InternalRLS.g:718:2: ( ( rule__BracketDelimitedLiteral__Group__0 ) )
            // InternalRLS.g:719:3: ( rule__BracketDelimitedLiteral__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBracketDelimitedLiteralAccess().getGroup()); 
            }
            // InternalRLS.g:720:3: ( rule__BracketDelimitedLiteral__Group__0 )
            // InternalRLS.g:720:4: rule__BracketDelimitedLiteral__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BracketDelimitedLiteral__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBracketDelimitedLiteralAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulebracketDelimitedLiteral"


    // $ANTLR start "entryRulebracketDelimitedLiteralBody"
    // InternalRLS.g:729:1: entryRulebracketDelimitedLiteralBody : rulebracketDelimitedLiteralBody EOF ;
    public final void entryRulebracketDelimitedLiteralBody() throws RecognitionException {
        try {
            // InternalRLS.g:730:1: ( rulebracketDelimitedLiteralBody EOF )
            // InternalRLS.g:731:1: rulebracketDelimitedLiteralBody EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBracketDelimitedLiteralBodyRule()); 
            }
            pushFollow(FOLLOW_1);
            rulebracketDelimitedLiteralBody();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBracketDelimitedLiteralBodyRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulebracketDelimitedLiteralBody"


    // $ANTLR start "rulebracketDelimitedLiteralBody"
    // InternalRLS.g:738:1: rulebracketDelimitedLiteralBody : ( ( rule__BracketDelimitedLiteralBody__SAssignment ) ) ;
    public final void rulebracketDelimitedLiteralBody() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:742:2: ( ( ( rule__BracketDelimitedLiteralBody__SAssignment ) ) )
            // InternalRLS.g:743:2: ( ( rule__BracketDelimitedLiteralBody__SAssignment ) )
            {
            // InternalRLS.g:743:2: ( ( rule__BracketDelimitedLiteralBody__SAssignment ) )
            // InternalRLS.g:744:3: ( rule__BracketDelimitedLiteralBody__SAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBracketDelimitedLiteralBodyAccess().getSAssignment()); 
            }
            // InternalRLS.g:745:3: ( rule__BracketDelimitedLiteralBody__SAssignment )
            // InternalRLS.g:745:4: rule__BracketDelimitedLiteralBody__SAssignment
            {
            pushFollow(FOLLOW_2);
            rule__BracketDelimitedLiteralBody__SAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBracketDelimitedLiteralBodyAccess().getSAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulebracketDelimitedLiteralBody"


    // $ANTLR start "entryRuleArguments"
    // InternalRLS.g:754:1: entryRuleArguments : ruleArguments EOF ;
    public final void entryRuleArguments() throws RecognitionException {
        try {
            // InternalRLS.g:755:1: ( ruleArguments EOF )
            // InternalRLS.g:756:1: ruleArguments EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArgumentsRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleArguments();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArgumentsRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleArguments"


    // $ANTLR start "ruleArguments"
    // InternalRLS.g:763:1: ruleArguments : ( ( rule__Arguments__Group__0 ) ) ;
    public final void ruleArguments() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:767:2: ( ( ( rule__Arguments__Group__0 ) ) )
            // InternalRLS.g:768:2: ( ( rule__Arguments__Group__0 ) )
            {
            // InternalRLS.g:768:2: ( ( rule__Arguments__Group__0 ) )
            // InternalRLS.g:769:3: ( rule__Arguments__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArgumentsAccess().getGroup()); 
            }
            // InternalRLS.g:770:3: ( rule__Arguments__Group__0 )
            // InternalRLS.g:770:4: rule__Arguments__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Arguments__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getArgumentsAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleArguments"


    // $ANTLR start "rule__IRIBOL__Alternatives"
    // InternalRLS.g:778:1: rule__IRIBOL__Alternatives : ( ( ( rule__IRIBOL__TAssignment_0 ) ) | ( ( rule__IRIBOL__TAssignment_1 ) ) );
    public final void rule__IRIBOL__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:782:1: ( ( ( rule__IRIBOL__TAssignment_0 ) ) | ( ( rule__IRIBOL__TAssignment_1 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_IRI) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_PNAME_LN) ) {
                alt1=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalRLS.g:783:2: ( ( rule__IRIBOL__TAssignment_0 ) )
                    {
                    // InternalRLS.g:783:2: ( ( rule__IRIBOL__TAssignment_0 ) )
                    // InternalRLS.g:784:3: ( rule__IRIBOL__TAssignment_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getIRIBOLAccess().getTAssignment_0()); 
                    }
                    // InternalRLS.g:785:3: ( rule__IRIBOL__TAssignment_0 )
                    // InternalRLS.g:785:4: rule__IRIBOL__TAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__IRIBOL__TAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getIRIBOLAccess().getTAssignment_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalRLS.g:789:2: ( ( rule__IRIBOL__TAssignment_1 ) )
                    {
                    // InternalRLS.g:789:2: ( ( rule__IRIBOL__TAssignment_1 ) )
                    // InternalRLS.g:790:3: ( rule__IRIBOL__TAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getIRIBOLAccess().getTAssignment_1()); 
                    }
                    // InternalRLS.g:791:3: ( rule__IRIBOL__TAssignment_1 )
                    // InternalRLS.g:791:4: rule__IRIBOL__TAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__IRIBOL__TAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getIRIBOLAccess().getTAssignment_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IRIBOL__Alternatives"


    // $ANTLR start "rule__Striing__Alternatives"
    // InternalRLS.g:799:1: rule__Striing__Alternatives : ( ( ( rule__Striing__TAssignment_0 ) ) | ( ( rule__Striing__TAssignment_1 ) ) | ( ( rule__Striing__TAssignment_2 ) ) | ( ( rule__Striing__TAssignment_3 ) ) );
    public final void rule__Striing__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:803:1: ( ( ( rule__Striing__TAssignment_0 ) ) | ( ( rule__Striing__TAssignment_1 ) ) | ( ( rule__Striing__TAssignment_2 ) ) | ( ( rule__Striing__TAssignment_3 ) ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case RULE_STRING_LITERAL1:
                {
                alt2=1;
                }
                break;
            case RULE_STRING_LITERAL2:
                {
                alt2=2;
                }
                break;
            case RULE_STRING_LITERAL_LONG1:
                {
                alt2=3;
                }
                break;
            case RULE_STRING_LITERAL_LONG2:
                {
                alt2=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalRLS.g:804:2: ( ( rule__Striing__TAssignment_0 ) )
                    {
                    // InternalRLS.g:804:2: ( ( rule__Striing__TAssignment_0 ) )
                    // InternalRLS.g:805:3: ( rule__Striing__TAssignment_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStriingAccess().getTAssignment_0()); 
                    }
                    // InternalRLS.g:806:3: ( rule__Striing__TAssignment_0 )
                    // InternalRLS.g:806:4: rule__Striing__TAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Striing__TAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStriingAccess().getTAssignment_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalRLS.g:810:2: ( ( rule__Striing__TAssignment_1 ) )
                    {
                    // InternalRLS.g:810:2: ( ( rule__Striing__TAssignment_1 ) )
                    // InternalRLS.g:811:3: ( rule__Striing__TAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStriingAccess().getTAssignment_1()); 
                    }
                    // InternalRLS.g:812:3: ( rule__Striing__TAssignment_1 )
                    // InternalRLS.g:812:4: rule__Striing__TAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Striing__TAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStriingAccess().getTAssignment_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalRLS.g:816:2: ( ( rule__Striing__TAssignment_2 ) )
                    {
                    // InternalRLS.g:816:2: ( ( rule__Striing__TAssignment_2 ) )
                    // InternalRLS.g:817:3: ( rule__Striing__TAssignment_2 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStriingAccess().getTAssignment_2()); 
                    }
                    // InternalRLS.g:818:3: ( rule__Striing__TAssignment_2 )
                    // InternalRLS.g:818:4: rule__Striing__TAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Striing__TAssignment_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStriingAccess().getTAssignment_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalRLS.g:822:2: ( ( rule__Striing__TAssignment_3 ) )
                    {
                    // InternalRLS.g:822:2: ( ( rule__Striing__TAssignment_3 ) )
                    // InternalRLS.g:823:3: ( rule__Striing__TAssignment_3 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStriingAccess().getTAssignment_3()); 
                    }
                    // InternalRLS.g:824:3: ( rule__Striing__TAssignment_3 )
                    // InternalRLS.g:824:4: rule__Striing__TAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Striing__TAssignment_3();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStriingAccess().getTAssignment_3()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Striing__Alternatives"


    // $ANTLR start "rule__RDFLiteral__Alternatives_1"
    // InternalRLS.g:832:1: rule__RDFLiteral__Alternatives_1 : ( ( ( rule__RDFLiteral__LAssignment_1_0 ) ) | ( ( rule__RDFLiteral__Group_1_1__0 ) ) );
    public final void rule__RDFLiteral__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:836:1: ( ( ( rule__RDFLiteral__LAssignment_1_0 ) ) | ( ( rule__RDFLiteral__Group_1_1__0 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_LANGTAG) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_DATATYPE) ) {
                alt3=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalRLS.g:837:2: ( ( rule__RDFLiteral__LAssignment_1_0 ) )
                    {
                    // InternalRLS.g:837:2: ( ( rule__RDFLiteral__LAssignment_1_0 ) )
                    // InternalRLS.g:838:3: ( rule__RDFLiteral__LAssignment_1_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRDFLiteralAccess().getLAssignment_1_0()); 
                    }
                    // InternalRLS.g:839:3: ( rule__RDFLiteral__LAssignment_1_0 )
                    // InternalRLS.g:839:4: rule__RDFLiteral__LAssignment_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RDFLiteral__LAssignment_1_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRDFLiteralAccess().getLAssignment_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalRLS.g:843:2: ( ( rule__RDFLiteral__Group_1_1__0 ) )
                    {
                    // InternalRLS.g:843:2: ( ( rule__RDFLiteral__Group_1_1__0 ) )
                    // InternalRLS.g:844:3: ( rule__RDFLiteral__Group_1_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRDFLiteralAccess().getGroup_1_1()); 
                    }
                    // InternalRLS.g:845:3: ( rule__RDFLiteral__Group_1_1__0 )
                    // InternalRLS.g:845:4: rule__RDFLiteral__Group_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RDFLiteral__Group_1_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRDFLiteralAccess().getGroup_1_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RDFLiteral__Alternatives_1"


    // $ANTLR start "rule__NumericLiteral__Alternatives"
    // InternalRLS.g:853:1: rule__NumericLiteral__Alternatives : ( ( ( rule__NumericLiteral__TAssignment_0 ) ) | ( ( rule__NumericLiteral__TAssignment_1 ) ) | ( ( rule__NumericLiteral__TAssignment_2 ) ) );
    public final void rule__NumericLiteral__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:857:1: ( ( ( rule__NumericLiteral__TAssignment_0 ) ) | ( ( rule__NumericLiteral__TAssignment_1 ) ) | ( ( rule__NumericLiteral__TAssignment_2 ) ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case RULE_INTEGER:
                {
                alt4=1;
                }
                break;
            case RULE_DECIMAL:
                {
                alt4=2;
                }
                break;
            case RULE_DOUBLE:
                {
                alt4=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalRLS.g:858:2: ( ( rule__NumericLiteral__TAssignment_0 ) )
                    {
                    // InternalRLS.g:858:2: ( ( rule__NumericLiteral__TAssignment_0 ) )
                    // InternalRLS.g:859:3: ( rule__NumericLiteral__TAssignment_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNumericLiteralAccess().getTAssignment_0()); 
                    }
                    // InternalRLS.g:860:3: ( rule__NumericLiteral__TAssignment_0 )
                    // InternalRLS.g:860:4: rule__NumericLiteral__TAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NumericLiteral__TAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNumericLiteralAccess().getTAssignment_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalRLS.g:864:2: ( ( rule__NumericLiteral__TAssignment_1 ) )
                    {
                    // InternalRLS.g:864:2: ( ( rule__NumericLiteral__TAssignment_1 ) )
                    // InternalRLS.g:865:3: ( rule__NumericLiteral__TAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNumericLiteralAccess().getTAssignment_1()); 
                    }
                    // InternalRLS.g:866:3: ( rule__NumericLiteral__TAssignment_1 )
                    // InternalRLS.g:866:4: rule__NumericLiteral__TAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__NumericLiteral__TAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNumericLiteralAccess().getTAssignment_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalRLS.g:870:2: ( ( rule__NumericLiteral__TAssignment_2 ) )
                    {
                    // InternalRLS.g:870:2: ( ( rule__NumericLiteral__TAssignment_2 ) )
                    // InternalRLS.g:871:3: ( rule__NumericLiteral__TAssignment_2 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNumericLiteralAccess().getTAssignment_2()); 
                    }
                    // InternalRLS.g:872:3: ( rule__NumericLiteral__TAssignment_2 )
                    // InternalRLS.g:872:4: rule__NumericLiteral__TAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__NumericLiteral__TAssignment_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNumericLiteralAccess().getTAssignment_2()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumericLiteral__Alternatives"


    // $ANTLR start "rule__Term__Alternatives"
    // InternalRLS.g:880:1: rule__Term__Alternatives : ( ( ( rule__Term__SAssignment_0 ) ) | ( ( rule__Term__CAssignment_1 ) ) | ( ( rule__Term__SAssignment_2 ) ) | ( ( rule__Term__TAssignment_3 ) ) | ( ( rule__Term__TAssignment_4 ) ) | ( ( rule__Term__TAssignment_5 ) ) | ( ( rule__Term__TAssignment_6 ) ) | ( ( rule__Term__TtAssignment_7 ) ) );
    public final void rule__Term__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:884:1: ( ( ( rule__Term__SAssignment_0 ) ) | ( ( rule__Term__CAssignment_1 ) ) | ( ( rule__Term__SAssignment_2 ) ) | ( ( rule__Term__TAssignment_3 ) ) | ( ( rule__Term__TAssignment_4 ) ) | ( ( rule__Term__TAssignment_5 ) ) | ( ( rule__Term__TAssignment_6 ) ) | ( ( rule__Term__TtAssignment_7 ) ) )
            int alt5=8;
            switch ( input.LA(1) ) {
            case RULE_PNAME_LN:
            case RULE_IRI:
                {
                alt5=1;
                }
                break;
            case RULE_INTEGER:
            case RULE_DECIMAL:
            case RULE_DOUBLE:
                {
                alt5=2;
                }
                break;
            case RULE_STRING_LITERAL1:
            case RULE_STRING_LITERAL2:
            case RULE_STRING_LITERAL_LONG1:
            case RULE_STRING_LITERAL_LONG2:
                {
                alt5=3;
                }
                break;
            case RULE_UNIVAR:
                {
                alt5=4;
                }
                break;
            case RULE_EXIVAR:
                {
                alt5=5;
                }
                break;
            case RULE_VARORPREDNAME:
                {
                alt5=6;
                }
                break;
            case RULE_NAMED_NULL:
                {
                alt5=7;
                }
                break;
            case RULE_PIPE_DELIMITED_LITERAL:
            case RULE_HASH_DELIMITED_LITERAL:
            case 56:
            case 58:
                {
                alt5=8;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalRLS.g:885:2: ( ( rule__Term__SAssignment_0 ) )
                    {
                    // InternalRLS.g:885:2: ( ( rule__Term__SAssignment_0 ) )
                    // InternalRLS.g:886:3: ( rule__Term__SAssignment_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTermAccess().getSAssignment_0()); 
                    }
                    // InternalRLS.g:887:3: ( rule__Term__SAssignment_0 )
                    // InternalRLS.g:887:4: rule__Term__SAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Term__SAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTermAccess().getSAssignment_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalRLS.g:891:2: ( ( rule__Term__CAssignment_1 ) )
                    {
                    // InternalRLS.g:891:2: ( ( rule__Term__CAssignment_1 ) )
                    // InternalRLS.g:892:3: ( rule__Term__CAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTermAccess().getCAssignment_1()); 
                    }
                    // InternalRLS.g:893:3: ( rule__Term__CAssignment_1 )
                    // InternalRLS.g:893:4: rule__Term__CAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Term__CAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTermAccess().getCAssignment_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalRLS.g:897:2: ( ( rule__Term__SAssignment_2 ) )
                    {
                    // InternalRLS.g:897:2: ( ( rule__Term__SAssignment_2 ) )
                    // InternalRLS.g:898:3: ( rule__Term__SAssignment_2 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTermAccess().getSAssignment_2()); 
                    }
                    // InternalRLS.g:899:3: ( rule__Term__SAssignment_2 )
                    // InternalRLS.g:899:4: rule__Term__SAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Term__SAssignment_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTermAccess().getSAssignment_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalRLS.g:903:2: ( ( rule__Term__TAssignment_3 ) )
                    {
                    // InternalRLS.g:903:2: ( ( rule__Term__TAssignment_3 ) )
                    // InternalRLS.g:904:3: ( rule__Term__TAssignment_3 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTermAccess().getTAssignment_3()); 
                    }
                    // InternalRLS.g:905:3: ( rule__Term__TAssignment_3 )
                    // InternalRLS.g:905:4: rule__Term__TAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Term__TAssignment_3();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTermAccess().getTAssignment_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalRLS.g:909:2: ( ( rule__Term__TAssignment_4 ) )
                    {
                    // InternalRLS.g:909:2: ( ( rule__Term__TAssignment_4 ) )
                    // InternalRLS.g:910:3: ( rule__Term__TAssignment_4 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTermAccess().getTAssignment_4()); 
                    }
                    // InternalRLS.g:911:3: ( rule__Term__TAssignment_4 )
                    // InternalRLS.g:911:4: rule__Term__TAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Term__TAssignment_4();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTermAccess().getTAssignment_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalRLS.g:915:2: ( ( rule__Term__TAssignment_5 ) )
                    {
                    // InternalRLS.g:915:2: ( ( rule__Term__TAssignment_5 ) )
                    // InternalRLS.g:916:3: ( rule__Term__TAssignment_5 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTermAccess().getTAssignment_5()); 
                    }
                    // InternalRLS.g:917:3: ( rule__Term__TAssignment_5 )
                    // InternalRLS.g:917:4: rule__Term__TAssignment_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__Term__TAssignment_5();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTermAccess().getTAssignment_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalRLS.g:921:2: ( ( rule__Term__TAssignment_6 ) )
                    {
                    // InternalRLS.g:921:2: ( ( rule__Term__TAssignment_6 ) )
                    // InternalRLS.g:922:3: ( rule__Term__TAssignment_6 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTermAccess().getTAssignment_6()); 
                    }
                    // InternalRLS.g:923:3: ( rule__Term__TAssignment_6 )
                    // InternalRLS.g:923:4: rule__Term__TAssignment_6
                    {
                    pushFollow(FOLLOW_2);
                    rule__Term__TAssignment_6();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTermAccess().getTAssignment_6()); 
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalRLS.g:927:2: ( ( rule__Term__TtAssignment_7 ) )
                    {
                    // InternalRLS.g:927:2: ( ( rule__Term__TtAssignment_7 ) )
                    // InternalRLS.g:928:3: ( rule__Term__TtAssignment_7 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTermAccess().getTtAssignment_7()); 
                    }
                    // InternalRLS.g:929:3: ( rule__Term__TtAssignment_7 )
                    // InternalRLS.g:929:4: rule__Term__TtAssignment_7
                    {
                    pushFollow(FOLLOW_2);
                    rule__Term__TtAssignment_7();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTermAccess().getTtAssignment_7()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__Alternatives"


    // $ANTLR start "rule__PredicateName__Alternatives"
    // InternalRLS.g:937:1: rule__PredicateName__Alternatives : ( ( ( rule__PredicateName__SAssignment_0 ) ) | ( ( rule__PredicateName__TAssignment_1 ) ) );
    public final void rule__PredicateName__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:941:1: ( ( ( rule__PredicateName__SAssignment_0 ) ) | ( ( rule__PredicateName__TAssignment_1 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=RULE_PNAME_LN && LA6_0<=RULE_IRI)) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_VARORPREDNAME) ) {
                alt6=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalRLS.g:942:2: ( ( rule__PredicateName__SAssignment_0 ) )
                    {
                    // InternalRLS.g:942:2: ( ( rule__PredicateName__SAssignment_0 ) )
                    // InternalRLS.g:943:3: ( rule__PredicateName__SAssignment_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPredicateNameAccess().getSAssignment_0()); 
                    }
                    // InternalRLS.g:944:3: ( rule__PredicateName__SAssignment_0 )
                    // InternalRLS.g:944:4: rule__PredicateName__SAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PredicateName__SAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPredicateNameAccess().getSAssignment_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalRLS.g:948:2: ( ( rule__PredicateName__TAssignment_1 ) )
                    {
                    // InternalRLS.g:948:2: ( ( rule__PredicateName__TAssignment_1 ) )
                    // InternalRLS.g:949:3: ( rule__PredicateName__TAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPredicateNameAccess().getTAssignment_1()); 
                    }
                    // InternalRLS.g:950:3: ( rule__PredicateName__TAssignment_1 )
                    // InternalRLS.g:950:4: rule__PredicateName__TAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__PredicateName__TAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPredicateNameAccess().getTAssignment_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicateName__Alternatives"


    // $ANTLR start "rule__Literal__Alternatives"
    // InternalRLS.g:958:1: rule__Literal__Alternatives : ( ( rulePositiveLiteral ) | ( ruleNegativeLiteral ) );
    public final void rule__Literal__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:962:1: ( ( rulePositiveLiteral ) | ( ruleNegativeLiteral ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=RULE_PNAME_LN && LA7_0<=RULE_IRI)||LA7_0==RULE_VARORPREDNAME) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_TILDE) ) {
                alt7=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalRLS.g:963:2: ( rulePositiveLiteral )
                    {
                    // InternalRLS.g:963:2: ( rulePositiveLiteral )
                    // InternalRLS.g:964:3: rulePositiveLiteral
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLiteralAccess().getPositiveLiteralParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    rulePositiveLiteral();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLiteralAccess().getPositiveLiteralParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalRLS.g:969:2: ( ruleNegativeLiteral )
                    {
                    // InternalRLS.g:969:2: ( ruleNegativeLiteral )
                    // InternalRLS.g:970:3: ruleNegativeLiteral
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLiteralAccess().getNegativeLiteralParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleNegativeLiteral();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLiteralAccess().getNegativeLiteralParserRuleCall_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__Alternatives"


    // $ANTLR start "rule__Statement__Alternatives"
    // InternalRLS.g:979:1: rule__Statement__Alternatives : ( ( ( rule__Statement__StatementAssignment_0 ) ) | ( ( rule__Statement__Group_1__0 ) ) );
    public final void rule__Statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:983:1: ( ( ( rule__Statement__StatementAssignment_0 ) ) | ( ( rule__Statement__Group_1__0 ) ) )
            int alt8=2;
            alt8 = dfa8.predict(input);
            switch (alt8) {
                case 1 :
                    // InternalRLS.g:984:2: ( ( rule__Statement__StatementAssignment_0 ) )
                    {
                    // InternalRLS.g:984:2: ( ( rule__Statement__StatementAssignment_0 ) )
                    // InternalRLS.g:985:3: ( rule__Statement__StatementAssignment_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getStatementAssignment_0()); 
                    }
                    // InternalRLS.g:986:3: ( rule__Statement__StatementAssignment_0 )
                    // InternalRLS.g:986:4: rule__Statement__StatementAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Statement__StatementAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStatementAccess().getStatementAssignment_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalRLS.g:990:2: ( ( rule__Statement__Group_1__0 ) )
                    {
                    // InternalRLS.g:990:2: ( ( rule__Statement__Group_1__0 ) )
                    // InternalRLS.g:991:3: ( rule__Statement__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getGroup_1()); 
                    }
                    // InternalRLS.g:992:3: ( rule__Statement__Group_1__0 )
                    // InternalRLS.g:992:4: rule__Statement__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Statement__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStatementAccess().getGroup_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Alternatives"


    // $ANTLR start "rule__DataSource__Alternatives_0"
    // InternalRLS.g:1000:1: rule__DataSource__Alternatives_0 : ( ( ( rule__DataSource__SourceNameAssignment_0_0 ) ) | ( ( rule__DataSource__SourceNameAssignment_0_1 ) ) );
    public final void rule__DataSource__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:1004:1: ( ( ( rule__DataSource__SourceNameAssignment_0_0 ) ) | ( ( rule__DataSource__SourceNameAssignment_0_1 ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_DIRECTIVENAME) ) {
                alt9=1;
            }
            else if ( (LA9_0==RULE_VARORPREDNAME) ) {
                alt9=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalRLS.g:1005:2: ( ( rule__DataSource__SourceNameAssignment_0_0 ) )
                    {
                    // InternalRLS.g:1005:2: ( ( rule__DataSource__SourceNameAssignment_0_0 ) )
                    // InternalRLS.g:1006:3: ( rule__DataSource__SourceNameAssignment_0_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDataSourceAccess().getSourceNameAssignment_0_0()); 
                    }
                    // InternalRLS.g:1007:3: ( rule__DataSource__SourceNameAssignment_0_0 )
                    // InternalRLS.g:1007:4: rule__DataSource__SourceNameAssignment_0_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DataSource__SourceNameAssignment_0_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDataSourceAccess().getSourceNameAssignment_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalRLS.g:1011:2: ( ( rule__DataSource__SourceNameAssignment_0_1 ) )
                    {
                    // InternalRLS.g:1011:2: ( ( rule__DataSource__SourceNameAssignment_0_1 ) )
                    // InternalRLS.g:1012:3: ( rule__DataSource__SourceNameAssignment_0_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDataSourceAccess().getSourceNameAssignment_0_1()); 
                    }
                    // InternalRLS.g:1013:3: ( rule__DataSource__SourceNameAssignment_0_1 )
                    // InternalRLS.g:1013:4: rule__DataSource__SourceNameAssignment_0_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__DataSource__SourceNameAssignment_0_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDataSourceAccess().getSourceNameAssignment_0_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSource__Alternatives_0"


    // $ANTLR start "rule__Prefix__Alternatives"
    // InternalRLS.g:1021:1: rule__Prefix__Alternatives : ( ( ( rule__Prefix__Group_0__0 ) ) | ( ( rule__Prefix__Group_1__0 ) ) );
    public final void rule__Prefix__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:1025:1: ( ( ( rule__Prefix__Group_0__0 ) ) | ( ( rule__Prefix__Group_1__0 ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_PRFX) ) {
                int LA10_1 = input.LA(2);

                if ( (LA10_1==RULE_COLON) ) {
                    alt10=1;
                }
                else if ( (LA10_1==RULE_PNAME_NS) ) {
                    alt10=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalRLS.g:1026:2: ( ( rule__Prefix__Group_0__0 ) )
                    {
                    // InternalRLS.g:1026:2: ( ( rule__Prefix__Group_0__0 ) )
                    // InternalRLS.g:1027:3: ( rule__Prefix__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrefixAccess().getGroup_0()); 
                    }
                    // InternalRLS.g:1028:3: ( rule__Prefix__Group_0__0 )
                    // InternalRLS.g:1028:4: rule__Prefix__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Prefix__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPrefixAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalRLS.g:1032:2: ( ( rule__Prefix__Group_1__0 ) )
                    {
                    // InternalRLS.g:1032:2: ( ( rule__Prefix__Group_1__0 ) )
                    // InternalRLS.g:1033:3: ( rule__Prefix__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrefixAccess().getGroup_1()); 
                    }
                    // InternalRLS.g:1034:3: ( rule__Prefix__Group_1__0 )
                    // InternalRLS.g:1034:4: rule__Prefix__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Prefix__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPrefixAccess().getGroup_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Prefix__Alternatives"


    // $ANTLR start "rule__Configurable_Literal__Alternatives"
    // InternalRLS.g:1042:1: rule__Configurable_Literal__Alternatives : ( ( ( rule__Configurable_Literal__TAssignment_0 ) ) | ( ( rule__Configurable_Literal__TAssignment_1 ) ) | ( ( rule__Configurable_Literal__SAssignment_2 ) ) | ( ( rule__Configurable_Literal__SAssignment_3 ) ) );
    public final void rule__Configurable_Literal__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:1046:1: ( ( ( rule__Configurable_Literal__TAssignment_0 ) ) | ( ( rule__Configurable_Literal__TAssignment_1 ) ) | ( ( rule__Configurable_Literal__SAssignment_2 ) ) | ( ( rule__Configurable_Literal__SAssignment_3 ) ) )
            int alt11=4;
            switch ( input.LA(1) ) {
            case RULE_PIPE_DELIMITED_LITERAL:
                {
                alt11=1;
                }
                break;
            case RULE_HASH_DELIMITED_LITERAL:
                {
                alt11=2;
                }
                break;
            case 56:
                {
                alt11=3;
                }
                break;
            case 58:
                {
                alt11=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalRLS.g:1047:2: ( ( rule__Configurable_Literal__TAssignment_0 ) )
                    {
                    // InternalRLS.g:1047:2: ( ( rule__Configurable_Literal__TAssignment_0 ) )
                    // InternalRLS.g:1048:3: ( rule__Configurable_Literal__TAssignment_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getConfigurable_LiteralAccess().getTAssignment_0()); 
                    }
                    // InternalRLS.g:1049:3: ( rule__Configurable_Literal__TAssignment_0 )
                    // InternalRLS.g:1049:4: rule__Configurable_Literal__TAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Configurable_Literal__TAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getConfigurable_LiteralAccess().getTAssignment_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalRLS.g:1053:2: ( ( rule__Configurable_Literal__TAssignment_1 ) )
                    {
                    // InternalRLS.g:1053:2: ( ( rule__Configurable_Literal__TAssignment_1 ) )
                    // InternalRLS.g:1054:3: ( rule__Configurable_Literal__TAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getConfigurable_LiteralAccess().getTAssignment_1()); 
                    }
                    // InternalRLS.g:1055:3: ( rule__Configurable_Literal__TAssignment_1 )
                    // InternalRLS.g:1055:4: rule__Configurable_Literal__TAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Configurable_Literal__TAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getConfigurable_LiteralAccess().getTAssignment_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalRLS.g:1059:2: ( ( rule__Configurable_Literal__SAssignment_2 ) )
                    {
                    // InternalRLS.g:1059:2: ( ( rule__Configurable_Literal__SAssignment_2 ) )
                    // InternalRLS.g:1060:3: ( rule__Configurable_Literal__SAssignment_2 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getConfigurable_LiteralAccess().getSAssignment_2()); 
                    }
                    // InternalRLS.g:1061:3: ( rule__Configurable_Literal__SAssignment_2 )
                    // InternalRLS.g:1061:4: rule__Configurable_Literal__SAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Configurable_Literal__SAssignment_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getConfigurable_LiteralAccess().getSAssignment_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalRLS.g:1065:2: ( ( rule__Configurable_Literal__SAssignment_3 ) )
                    {
                    // InternalRLS.g:1065:2: ( ( rule__Configurable_Literal__SAssignment_3 ) )
                    // InternalRLS.g:1066:3: ( rule__Configurable_Literal__SAssignment_3 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getConfigurable_LiteralAccess().getSAssignment_3()); 
                    }
                    // InternalRLS.g:1067:3: ( rule__Configurable_Literal__SAssignment_3 )
                    // InternalRLS.g:1067:4: rule__Configurable_Literal__SAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Configurable_Literal__SAssignment_3();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getConfigurable_LiteralAccess().getSAssignment_3()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configurable_Literal__Alternatives"


    // $ANTLR start "rule__Arguments__Alternatives_1"
    // InternalRLS.g:1075:1: rule__Arguments__Alternatives_1 : ( ( ( rule__Arguments__StrAssignment_1_0 ) ) | ( ( rule__Arguments__StrAssignment_1_1 ) ) | ( ( rule__Arguments__TAssignment_1_2 ) ) );
    public final void rule__Arguments__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:1079:1: ( ( ( rule__Arguments__StrAssignment_1_0 ) ) | ( ( rule__Arguments__StrAssignment_1_1 ) ) | ( ( rule__Arguments__TAssignment_1_2 ) ) )
            int alt12=3;
            alt12 = dfa12.predict(input);
            switch (alt12) {
                case 1 :
                    // InternalRLS.g:1080:2: ( ( rule__Arguments__StrAssignment_1_0 ) )
                    {
                    // InternalRLS.g:1080:2: ( ( rule__Arguments__StrAssignment_1_0 ) )
                    // InternalRLS.g:1081:3: ( rule__Arguments__StrAssignment_1_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getArgumentsAccess().getStrAssignment_1_0()); 
                    }
                    // InternalRLS.g:1082:3: ( rule__Arguments__StrAssignment_1_0 )
                    // InternalRLS.g:1082:4: rule__Arguments__StrAssignment_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Arguments__StrAssignment_1_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getArgumentsAccess().getStrAssignment_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalRLS.g:1086:2: ( ( rule__Arguments__StrAssignment_1_1 ) )
                    {
                    // InternalRLS.g:1086:2: ( ( rule__Arguments__StrAssignment_1_1 ) )
                    // InternalRLS.g:1087:3: ( rule__Arguments__StrAssignment_1_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getArgumentsAccess().getStrAssignment_1_1()); 
                    }
                    // InternalRLS.g:1088:3: ( rule__Arguments__StrAssignment_1_1 )
                    // InternalRLS.g:1088:4: rule__Arguments__StrAssignment_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Arguments__StrAssignment_1_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getArgumentsAccess().getStrAssignment_1_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalRLS.g:1092:2: ( ( rule__Arguments__TAssignment_1_2 ) )
                    {
                    // InternalRLS.g:1092:2: ( ( rule__Arguments__TAssignment_1_2 ) )
                    // InternalRLS.g:1093:3: ( rule__Arguments__TAssignment_1_2 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getArgumentsAccess().getTAssignment_1_2()); 
                    }
                    // InternalRLS.g:1094:3: ( rule__Arguments__TAssignment_1_2 )
                    // InternalRLS.g:1094:4: rule__Arguments__TAssignment_1_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Arguments__TAssignment_1_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getArgumentsAccess().getTAssignment_1_2()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arguments__Alternatives_1"


    // $ANTLR start "rule__Model__Group__0"
    // InternalRLS.g:1102:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:1106:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalRLS.g:1107:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Model__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Model__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0"


    // $ANTLR start "rule__Model__Group__0__Impl"
    // InternalRLS.g:1114:1: rule__Model__Group__0__Impl : ( () ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:1118:1: ( ( () ) )
            // InternalRLS.g:1119:1: ( () )
            {
            // InternalRLS.g:1119:1: ( () )
            // InternalRLS.g:1120:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getModelAction_0()); 
            }
            // InternalRLS.g:1121:2: ()
            // InternalRLS.g:1121:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getModelAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // InternalRLS.g:1129:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:1133:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // InternalRLS.g:1134:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Model__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Model__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1"


    // $ANTLR start "rule__Model__Group__1__Impl"
    // InternalRLS.g:1141:1: rule__Model__Group__1__Impl : ( ( rule__Model__BAssignment_1 )? ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:1145:1: ( ( ( rule__Model__BAssignment_1 )? ) )
            // InternalRLS.g:1146:1: ( ( rule__Model__BAssignment_1 )? )
            {
            // InternalRLS.g:1146:1: ( ( rule__Model__BAssignment_1 )? )
            // InternalRLS.g:1147:2: ( rule__Model__BAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getBAssignment_1()); 
            }
            // InternalRLS.g:1148:2: ( rule__Model__BAssignment_1 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_BS) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalRLS.g:1148:3: rule__Model__BAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Model__BAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getBAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1__Impl"


    // $ANTLR start "rule__Model__Group__2"
    // InternalRLS.g:1156:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:1160:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // InternalRLS.g:1161:2: rule__Model__Group__2__Impl rule__Model__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__Model__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Model__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__2"


    // $ANTLR start "rule__Model__Group__2__Impl"
    // InternalRLS.g:1168:1: rule__Model__Group__2__Impl : ( ( rule__Model__PAssignment_2 )* ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:1172:1: ( ( ( rule__Model__PAssignment_2 )* ) )
            // InternalRLS.g:1173:1: ( ( rule__Model__PAssignment_2 )* )
            {
            // InternalRLS.g:1173:1: ( ( rule__Model__PAssignment_2 )* )
            // InternalRLS.g:1174:2: ( rule__Model__PAssignment_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getPAssignment_2()); 
            }
            // InternalRLS.g:1175:2: ( rule__Model__PAssignment_2 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_PRFX) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalRLS.g:1175:3: rule__Model__PAssignment_2
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Model__PAssignment_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getPAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__2__Impl"


    // $ANTLR start "rule__Model__Group__3"
    // InternalRLS.g:1183:1: rule__Model__Group__3 : rule__Model__Group__3__Impl rule__Model__Group__4 ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:1187:1: ( rule__Model__Group__3__Impl rule__Model__Group__4 )
            // InternalRLS.g:1188:2: rule__Model__Group__3__Impl rule__Model__Group__4
            {
            pushFollow(FOLLOW_3);
            rule__Model__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Model__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__3"


    // $ANTLR start "rule__Model__Group__3__Impl"
    // InternalRLS.g:1195:1: rule__Model__Group__3__Impl : ( ( rule__Model__SAssignment_3 )* ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:1199:1: ( ( ( rule__Model__SAssignment_3 )* ) )
            // InternalRLS.g:1200:1: ( ( rule__Model__SAssignment_3 )* )
            {
            // InternalRLS.g:1200:1: ( ( rule__Model__SAssignment_3 )* )
            // InternalRLS.g:1201:2: ( rule__Model__SAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getSAssignment_3()); 
            }
            // InternalRLS.g:1202:2: ( rule__Model__SAssignment_3 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_SRC) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalRLS.g:1202:3: rule__Model__SAssignment_3
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Model__SAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getSAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__3__Impl"


    // $ANTLR start "rule__Model__Group__4"
    // InternalRLS.g:1210:1: rule__Model__Group__4 : rule__Model__Group__4__Impl rule__Model__Group__5 ;
    public final void rule__Model__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:1214:1: ( rule__Model__Group__4__Impl rule__Model__Group__5 )
            // InternalRLS.g:1215:2: rule__Model__Group__4__Impl rule__Model__Group__5
            {
            pushFollow(FOLLOW_3);
            rule__Model__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Model__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__4"


    // $ANTLR start "rule__Model__Group__4__Impl"
    // InternalRLS.g:1222:1: rule__Model__Group__4__Impl : ( ( rule__Model__StAssignment_4 )* ) ;
    public final void rule__Model__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:1226:1: ( ( ( rule__Model__StAssignment_4 )* ) )
            // InternalRLS.g:1227:1: ( ( rule__Model__StAssignment_4 )* )
            {
            // InternalRLS.g:1227:1: ( ( rule__Model__StAssignment_4 )* )
            // InternalRLS.g:1228:2: ( rule__Model__StAssignment_4 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getStAssignment_4()); 
            }
            // InternalRLS.g:1229:2: ( rule__Model__StAssignment_4 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=RULE_PNAME_LN && LA16_0<=RULE_IRI)||LA16_0==RULE_VARORPREDNAME) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalRLS.g:1229:3: rule__Model__StAssignment_4
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Model__StAssignment_4();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getStAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__4__Impl"


    // $ANTLR start "rule__Model__Group__5"
    // InternalRLS.g:1237:1: rule__Model__Group__5 : rule__Model__Group__5__Impl ;
    public final void rule__Model__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:1241:1: ( rule__Model__Group__5__Impl )
            // InternalRLS.g:1242:2: rule__Model__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__5"


    // $ANTLR start "rule__Model__Group__5__Impl"
    // InternalRLS.g:1248:1: rule__Model__Group__5__Impl : ( ( RULE_E )* ) ;
    public final void rule__Model__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:1252:1: ( ( ( RULE_E )* ) )
            // InternalRLS.g:1253:1: ( ( RULE_E )* )
            {
            // InternalRLS.g:1253:1: ( ( RULE_E )* )
            // InternalRLS.g:1254:2: ( RULE_E )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getETerminalRuleCall_5()); 
            }
            // InternalRLS.g:1255:2: ( RULE_E )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_E) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalRLS.g:1255:3: RULE_E
            	    {
            	    match(input,RULE_E,FOLLOW_7); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getETerminalRuleCall_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__5__Impl"


    // $ANTLR start "rule__RDFLiteral__Group__0"
    // InternalRLS.g:1264:1: rule__RDFLiteral__Group__0 : rule__RDFLiteral__Group__0__Impl rule__RDFLiteral__Group__1 ;
    public final void rule__RDFLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:1268:1: ( rule__RDFLiteral__Group__0__Impl rule__RDFLiteral__Group__1 )
            // InternalRLS.g:1269:2: rule__RDFLiteral__Group__0__Impl rule__RDFLiteral__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__RDFLiteral__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RDFLiteral__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RDFLiteral__Group__0"


    // $ANTLR start "rule__RDFLiteral__Group__0__Impl"
    // InternalRLS.g:1276:1: rule__RDFLiteral__Group__0__Impl : ( ( rule__RDFLiteral__SAssignment_0 ) ) ;
    public final void rule__RDFLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:1280:1: ( ( ( rule__RDFLiteral__SAssignment_0 ) ) )
            // InternalRLS.g:1281:1: ( ( rule__RDFLiteral__SAssignment_0 ) )
            {
            // InternalRLS.g:1281:1: ( ( rule__RDFLiteral__SAssignment_0 ) )
            // InternalRLS.g:1282:2: ( rule__RDFLiteral__SAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRDFLiteralAccess().getSAssignment_0()); 
            }
            // InternalRLS.g:1283:2: ( rule__RDFLiteral__SAssignment_0 )
            // InternalRLS.g:1283:3: rule__RDFLiteral__SAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__RDFLiteral__SAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRDFLiteralAccess().getSAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RDFLiteral__Group__0__Impl"


    // $ANTLR start "rule__RDFLiteral__Group__1"
    // InternalRLS.g:1291:1: rule__RDFLiteral__Group__1 : rule__RDFLiteral__Group__1__Impl ;
    public final void rule__RDFLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:1295:1: ( rule__RDFLiteral__Group__1__Impl )
            // InternalRLS.g:1296:2: rule__RDFLiteral__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RDFLiteral__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RDFLiteral__Group__1"


    // $ANTLR start "rule__RDFLiteral__Group__1__Impl"
    // InternalRLS.g:1302:1: rule__RDFLiteral__Group__1__Impl : ( ( rule__RDFLiteral__Alternatives_1 )? ) ;
    public final void rule__RDFLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:1306:1: ( ( ( rule__RDFLiteral__Alternatives_1 )? ) )
            // InternalRLS.g:1307:1: ( ( rule__RDFLiteral__Alternatives_1 )? )
            {
            // InternalRLS.g:1307:1: ( ( rule__RDFLiteral__Alternatives_1 )? )
            // InternalRLS.g:1308:2: ( rule__RDFLiteral__Alternatives_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRDFLiteralAccess().getAlternatives_1()); 
            }
            // InternalRLS.g:1309:2: ( rule__RDFLiteral__Alternatives_1 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_DATATYPE||LA18_0==RULE_LANGTAG) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalRLS.g:1309:3: rule__RDFLiteral__Alternatives_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__RDFLiteral__Alternatives_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRDFLiteralAccess().getAlternatives_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RDFLiteral__Group__1__Impl"


    // $ANTLR start "rule__RDFLiteral__Group_1_1__0"
    // InternalRLS.g:1318:1: rule__RDFLiteral__Group_1_1__0 : rule__RDFLiteral__Group_1_1__0__Impl rule__RDFLiteral__Group_1_1__1 ;
    public final void rule__RDFLiteral__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:1322:1: ( rule__RDFLiteral__Group_1_1__0__Impl rule__RDFLiteral__Group_1_1__1 )
            // InternalRLS.g:1323:2: rule__RDFLiteral__Group_1_1__0__Impl rule__RDFLiteral__Group_1_1__1
            {
            pushFollow(FOLLOW_9);
            rule__RDFLiteral__Group_1_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RDFLiteral__Group_1_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RDFLiteral__Group_1_1__0"


    // $ANTLR start "rule__RDFLiteral__Group_1_1__0__Impl"
    // InternalRLS.g:1330:1: rule__RDFLiteral__Group_1_1__0__Impl : ( RULE_DATATYPE ) ;
    public final void rule__RDFLiteral__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:1334:1: ( ( RULE_DATATYPE ) )
            // InternalRLS.g:1335:1: ( RULE_DATATYPE )
            {
            // InternalRLS.g:1335:1: ( RULE_DATATYPE )
            // InternalRLS.g:1336:2: RULE_DATATYPE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRDFLiteralAccess().getDATATYPETerminalRuleCall_1_1_0()); 
            }
            match(input,RULE_DATATYPE,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRDFLiteralAccess().getDATATYPETerminalRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RDFLiteral__Group_1_1__0__Impl"


    // $ANTLR start "rule__RDFLiteral__Group_1_1__1"
    // InternalRLS.g:1345:1: rule__RDFLiteral__Group_1_1__1 : rule__RDFLiteral__Group_1_1__1__Impl ;
    public final void rule__RDFLiteral__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:1349:1: ( rule__RDFLiteral__Group_1_1__1__Impl )
            // InternalRLS.g:1350:2: rule__RDFLiteral__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RDFLiteral__Group_1_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RDFLiteral__Group_1_1__1"


    // $ANTLR start "rule__RDFLiteral__Group_1_1__1__Impl"
    // InternalRLS.g:1356:1: rule__RDFLiteral__Group_1_1__1__Impl : ( ( rule__RDFLiteral__DtAssignment_1_1_1 ) ) ;
    public final void rule__RDFLiteral__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:1360:1: ( ( ( rule__RDFLiteral__DtAssignment_1_1_1 ) ) )
            // InternalRLS.g:1361:1: ( ( rule__RDFLiteral__DtAssignment_1_1_1 ) )
            {
            // InternalRLS.g:1361:1: ( ( rule__RDFLiteral__DtAssignment_1_1_1 ) )
            // InternalRLS.g:1362:2: ( rule__RDFLiteral__DtAssignment_1_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRDFLiteralAccess().getDtAssignment_1_1_1()); 
            }
            // InternalRLS.g:1363:2: ( rule__RDFLiteral__DtAssignment_1_1_1 )
            // InternalRLS.g:1363:3: rule__RDFLiteral__DtAssignment_1_1_1
            {
            pushFollow(FOLLOW_2);
            rule__RDFLiteral__DtAssignment_1_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRDFLiteralAccess().getDtAssignment_1_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RDFLiteral__Group_1_1__1__Impl"


    // $ANTLR start "rule__ListOfTerms__Group__0"
    // InternalRLS.g:1372:1: rule__ListOfTerms__Group__0 : rule__ListOfTerms__Group__0__Impl rule__ListOfTerms__Group__1 ;
    public final void rule__ListOfTerms__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:1376:1: ( rule__ListOfTerms__Group__0__Impl rule__ListOfTerms__Group__1 )
            // InternalRLS.g:1377:2: rule__ListOfTerms__Group__0__Impl rule__ListOfTerms__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__ListOfTerms__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ListOfTerms__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListOfTerms__Group__0"


    // $ANTLR start "rule__ListOfTerms__Group__0__Impl"
    // InternalRLS.g:1384:1: rule__ListOfTerms__Group__0__Impl : ( ( rule__ListOfTerms__TAssignment_0 ) ) ;
    public final void rule__ListOfTerms__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:1388:1: ( ( ( rule__ListOfTerms__TAssignment_0 ) ) )
            // InternalRLS.g:1389:1: ( ( rule__ListOfTerms__TAssignment_0 ) )
            {
            // InternalRLS.g:1389:1: ( ( rule__ListOfTerms__TAssignment_0 ) )
            // InternalRLS.g:1390:2: ( rule__ListOfTerms__TAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListOfTermsAccess().getTAssignment_0()); 
            }
            // InternalRLS.g:1391:2: ( rule__ListOfTerms__TAssignment_0 )
            // InternalRLS.g:1391:3: rule__ListOfTerms__TAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ListOfTerms__TAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getListOfTermsAccess().getTAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListOfTerms__Group__0__Impl"


    // $ANTLR start "rule__ListOfTerms__Group__1"
    // InternalRLS.g:1399:1: rule__ListOfTerms__Group__1 : rule__ListOfTerms__Group__1__Impl ;
    public final void rule__ListOfTerms__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:1403:1: ( rule__ListOfTerms__Group__1__Impl )
            // InternalRLS.g:1404:2: rule__ListOfTerms__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ListOfTerms__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListOfTerms__Group__1"


    // $ANTLR start "rule__ListOfTerms__Group__1__Impl"
    // InternalRLS.g:1410:1: rule__ListOfTerms__Group__1__Impl : ( ( rule__ListOfTerms__Group_1__0 )* ) ;
    public final void rule__ListOfTerms__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:1414:1: ( ( ( rule__ListOfTerms__Group_1__0 )* ) )
            // InternalRLS.g:1415:1: ( ( rule__ListOfTerms__Group_1__0 )* )
            {
            // InternalRLS.g:1415:1: ( ( rule__ListOfTerms__Group_1__0 )* )
            // InternalRLS.g:1416:2: ( rule__ListOfTerms__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListOfTermsAccess().getGroup_1()); 
            }
            // InternalRLS.g:1417:2: ( rule__ListOfTerms__Group_1__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_COMMA) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalRLS.g:1417:3: rule__ListOfTerms__Group_1__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__ListOfTerms__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getListOfTermsAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListOfTerms__Group__1__Impl"


    // $ANTLR start "rule__ListOfTerms__Group_1__0"
    // InternalRLS.g:1426:1: rule__ListOfTerms__Group_1__0 : rule__ListOfTerms__Group_1__0__Impl rule__ListOfTerms__Group_1__1 ;
    public final void rule__ListOfTerms__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:1430:1: ( rule__ListOfTerms__Group_1__0__Impl rule__ListOfTerms__Group_1__1 )
            // InternalRLS.g:1431:2: rule__ListOfTerms__Group_1__0__Impl rule__ListOfTerms__Group_1__1
            {
            pushFollow(FOLLOW_12);
            rule__ListOfTerms__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ListOfTerms__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListOfTerms__Group_1__0"


    // $ANTLR start "rule__ListOfTerms__Group_1__0__Impl"
    // InternalRLS.g:1438:1: rule__ListOfTerms__Group_1__0__Impl : ( RULE_COMMA ) ;
    public final void rule__ListOfTerms__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:1442:1: ( ( RULE_COMMA ) )
            // InternalRLS.g:1443:1: ( RULE_COMMA )
            {
            // InternalRLS.g:1443:1: ( RULE_COMMA )
            // InternalRLS.g:1444:2: RULE_COMMA
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListOfTermsAccess().getCOMMATerminalRuleCall_1_0()); 
            }
            match(input,RULE_COMMA,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getListOfTermsAccess().getCOMMATerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListOfTerms__Group_1__0__Impl"


    // $ANTLR start "rule__ListOfTerms__Group_1__1"
    // InternalRLS.g:1453:1: rule__ListOfTerms__Group_1__1 : rule__ListOfTerms__Group_1__1__Impl ;
    public final void rule__ListOfTerms__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:1457:1: ( rule__ListOfTerms__Group_1__1__Impl )
            // InternalRLS.g:1458:2: rule__ListOfTerms__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ListOfTerms__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListOfTerms__Group_1__1"


    // $ANTLR start "rule__ListOfTerms__Group_1__1__Impl"
    // InternalRLS.g:1464:1: rule__ListOfTerms__Group_1__1__Impl : ( ( rule__ListOfTerms__TAssignment_1_1 ) ) ;
    public final void rule__ListOfTerms__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:1468:1: ( ( ( rule__ListOfTerms__TAssignment_1_1 ) ) )
            // InternalRLS.g:1469:1: ( ( rule__ListOfTerms__TAssignment_1_1 ) )
            {
            // InternalRLS.g:1469:1: ( ( rule__ListOfTerms__TAssignment_1_1 ) )
            // InternalRLS.g:1470:2: ( rule__ListOfTerms__TAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListOfTermsAccess().getTAssignment_1_1()); 
            }
            // InternalRLS.g:1471:2: ( rule__ListOfTerms__TAssignment_1_1 )
            // InternalRLS.g:1471:3: rule__ListOfTerms__TAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__ListOfTerms__TAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getListOfTermsAccess().getTAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListOfTerms__Group_1__1__Impl"


    // $ANTLR start "rule__NegativeLiteral__Group__0"
    // InternalRLS.g:1480:1: rule__NegativeLiteral__Group__0 : rule__NegativeLiteral__Group__0__Impl rule__NegativeLiteral__Group__1 ;
    public final void rule__NegativeLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:1484:1: ( rule__NegativeLiteral__Group__0__Impl rule__NegativeLiteral__Group__1 )
            // InternalRLS.g:1485:2: rule__NegativeLiteral__Group__0__Impl rule__NegativeLiteral__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__NegativeLiteral__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__NegativeLiteral__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NegativeLiteral__Group__0"


    // $ANTLR start "rule__NegativeLiteral__Group__0__Impl"
    // InternalRLS.g:1492:1: rule__NegativeLiteral__Group__0__Impl : ( RULE_TILDE ) ;
    public final void rule__NegativeLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:1496:1: ( ( RULE_TILDE ) )
            // InternalRLS.g:1497:1: ( RULE_TILDE )
            {
            // InternalRLS.g:1497:1: ( RULE_TILDE )
            // InternalRLS.g:1498:2: RULE_TILDE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegativeLiteralAccess().getTILDETerminalRuleCall_0()); 
            }
            match(input,RULE_TILDE,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNegativeLiteralAccess().getTILDETerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NegativeLiteral__Group__0__Impl"


    // $ANTLR start "rule__NegativeLiteral__Group__1"
    // InternalRLS.g:1507:1: rule__NegativeLiteral__Group__1 : rule__NegativeLiteral__Group__1__Impl rule__NegativeLiteral__Group__2 ;
    public final void rule__NegativeLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:1511:1: ( rule__NegativeLiteral__Group__1__Impl rule__NegativeLiteral__Group__2 )
            // InternalRLS.g:1512:2: rule__NegativeLiteral__Group__1__Impl rule__NegativeLiteral__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__NegativeLiteral__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__NegativeLiteral__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NegativeLiteral__Group__1"


    // $ANTLR start "rule__NegativeLiteral__Group__1__Impl"
    // InternalRLS.g:1519:1: rule__NegativeLiteral__Group__1__Impl : ( ( rule__NegativeLiteral__PredicatenameAssignment_1 ) ) ;
    public final void rule__NegativeLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:1523:1: ( ( ( rule__NegativeLiteral__PredicatenameAssignment_1 ) ) )
            // InternalRLS.g:1524:1: ( ( rule__NegativeLiteral__PredicatenameAssignment_1 ) )
            {
            // InternalRLS.g:1524:1: ( ( rule__NegativeLiteral__PredicatenameAssignment_1 ) )
            // InternalRLS.g:1525:2: ( rule__NegativeLiteral__PredicatenameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegativeLiteralAccess().getPredicatenameAssignment_1()); 
            }
            // InternalRLS.g:1526:2: ( rule__NegativeLiteral__PredicatenameAssignment_1 )
            // InternalRLS.g:1526:3: rule__NegativeLiteral__PredicatenameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__NegativeLiteral__PredicatenameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNegativeLiteralAccess().getPredicatenameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NegativeLiteral__Group__1__Impl"


    // $ANTLR start "rule__NegativeLiteral__Group__2"
    // InternalRLS.g:1534:1: rule__NegativeLiteral__Group__2 : rule__NegativeLiteral__Group__2__Impl rule__NegativeLiteral__Group__3 ;
    public final void rule__NegativeLiteral__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:1538:1: ( rule__NegativeLiteral__Group__2__Impl rule__NegativeLiteral__Group__3 )
            // InternalRLS.g:1539:2: rule__NegativeLiteral__Group__2__Impl rule__NegativeLiteral__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__NegativeLiteral__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__NegativeLiteral__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NegativeLiteral__Group__2"


    // $ANTLR start "rule__NegativeLiteral__Group__2__Impl"
    // InternalRLS.g:1546:1: rule__NegativeLiteral__Group__2__Impl : ( RULE_LPAREN ) ;
    public final void rule__NegativeLiteral__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:1550:1: ( ( RULE_LPAREN ) )
            // InternalRLS.g:1551:1: ( RULE_LPAREN )
            {
            // InternalRLS.g:1551:1: ( RULE_LPAREN )
            // InternalRLS.g:1552:2: RULE_LPAREN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegativeLiteralAccess().getLPARENTerminalRuleCall_2()); 
            }
            match(input,RULE_LPAREN,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNegativeLiteralAccess().getLPARENTerminalRuleCall_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NegativeLiteral__Group__2__Impl"


    // $ANTLR start "rule__NegativeLiteral__Group__3"
    // InternalRLS.g:1561:1: rule__NegativeLiteral__Group__3 : rule__NegativeLiteral__Group__3__Impl rule__NegativeLiteral__Group__4 ;
    public final void rule__NegativeLiteral__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:1565:1: ( rule__NegativeLiteral__Group__3__Impl rule__NegativeLiteral__Group__4 )
            // InternalRLS.g:1566:2: rule__NegativeLiteral__Group__3__Impl rule__NegativeLiteral__Group__4
            {
            pushFollow(FOLLOW_15);
            rule__NegativeLiteral__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__NegativeLiteral__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NegativeLiteral__Group__3"


    // $ANTLR start "rule__NegativeLiteral__Group__3__Impl"
    // InternalRLS.g:1573:1: rule__NegativeLiteral__Group__3__Impl : ( ( rule__NegativeLiteral__TermsAssignment_3 ) ) ;
    public final void rule__NegativeLiteral__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:1577:1: ( ( ( rule__NegativeLiteral__TermsAssignment_3 ) ) )
            // InternalRLS.g:1578:1: ( ( rule__NegativeLiteral__TermsAssignment_3 ) )
            {
            // InternalRLS.g:1578:1: ( ( rule__NegativeLiteral__TermsAssignment_3 ) )
            // InternalRLS.g:1579:2: ( rule__NegativeLiteral__TermsAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegativeLiteralAccess().getTermsAssignment_3()); 
            }
            // InternalRLS.g:1580:2: ( rule__NegativeLiteral__TermsAssignment_3 )
            // InternalRLS.g:1580:3: rule__NegativeLiteral__TermsAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__NegativeLiteral__TermsAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNegativeLiteralAccess().getTermsAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NegativeLiteral__Group__3__Impl"


    // $ANTLR start "rule__NegativeLiteral__Group__4"
    // InternalRLS.g:1588:1: rule__NegativeLiteral__Group__4 : rule__NegativeLiteral__Group__4__Impl ;
    public final void rule__NegativeLiteral__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:1592:1: ( rule__NegativeLiteral__Group__4__Impl )
            // InternalRLS.g:1593:2: rule__NegativeLiteral__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NegativeLiteral__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NegativeLiteral__Group__4"


    // $ANTLR start "rule__NegativeLiteral__Group__4__Impl"
    // InternalRLS.g:1599:1: rule__NegativeLiteral__Group__4__Impl : ( RULE_RPAREN ) ;
    public final void rule__NegativeLiteral__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:1603:1: ( ( RULE_RPAREN ) )
            // InternalRLS.g:1604:1: ( RULE_RPAREN )
            {
            // InternalRLS.g:1604:1: ( RULE_RPAREN )
            // InternalRLS.g:1605:2: RULE_RPAREN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegativeLiteralAccess().getRPARENTerminalRuleCall_4()); 
            }
            match(input,RULE_RPAREN,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNegativeLiteralAccess().getRPARENTerminalRuleCall_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NegativeLiteral__Group__4__Impl"


    // $ANTLR start "rule__Fact__Group__0"
    // InternalRLS.g:1615:1: rule__Fact__Group__0 : rule__Fact__Group__0__Impl rule__Fact__Group__1 ;
    public final void rule__Fact__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:1619:1: ( rule__Fact__Group__0__Impl rule__Fact__Group__1 )
            // InternalRLS.g:1620:2: rule__Fact__Group__0__Impl rule__Fact__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__Fact__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Fact__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fact__Group__0"


    // $ANTLR start "rule__Fact__Group__0__Impl"
    // InternalRLS.g:1627:1: rule__Fact__Group__0__Impl : ( ( rule__Fact__PredicatenameAssignment_0 ) ) ;
    public final void rule__Fact__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:1631:1: ( ( ( rule__Fact__PredicatenameAssignment_0 ) ) )
            // InternalRLS.g:1632:1: ( ( rule__Fact__PredicatenameAssignment_0 ) )
            {
            // InternalRLS.g:1632:1: ( ( rule__Fact__PredicatenameAssignment_0 ) )
            // InternalRLS.g:1633:2: ( rule__Fact__PredicatenameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFactAccess().getPredicatenameAssignment_0()); 
            }
            // InternalRLS.g:1634:2: ( rule__Fact__PredicatenameAssignment_0 )
            // InternalRLS.g:1634:3: rule__Fact__PredicatenameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Fact__PredicatenameAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFactAccess().getPredicatenameAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fact__Group__0__Impl"


    // $ANTLR start "rule__Fact__Group__1"
    // InternalRLS.g:1642:1: rule__Fact__Group__1 : rule__Fact__Group__1__Impl rule__Fact__Group__2 ;
    public final void rule__Fact__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:1646:1: ( rule__Fact__Group__1__Impl rule__Fact__Group__2 )
            // InternalRLS.g:1647:2: rule__Fact__Group__1__Impl rule__Fact__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__Fact__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Fact__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fact__Group__1"


    // $ANTLR start "rule__Fact__Group__1__Impl"
    // InternalRLS.g:1654:1: rule__Fact__Group__1__Impl : ( RULE_LPAREN ) ;
    public final void rule__Fact__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:1658:1: ( ( RULE_LPAREN ) )
            // InternalRLS.g:1659:1: ( RULE_LPAREN )
            {
            // InternalRLS.g:1659:1: ( RULE_LPAREN )
            // InternalRLS.g:1660:2: RULE_LPAREN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFactAccess().getLPARENTerminalRuleCall_1()); 
            }
            match(input,RULE_LPAREN,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFactAccess().getLPARENTerminalRuleCall_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fact__Group__1__Impl"


    // $ANTLR start "rule__Fact__Group__2"
    // InternalRLS.g:1669:1: rule__Fact__Group__2 : rule__Fact__Group__2__Impl rule__Fact__Group__3 ;
    public final void rule__Fact__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:1673:1: ( rule__Fact__Group__2__Impl rule__Fact__Group__3 )
            // InternalRLS.g:1674:2: rule__Fact__Group__2__Impl rule__Fact__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__Fact__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Fact__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fact__Group__2"


    // $ANTLR start "rule__Fact__Group__2__Impl"
    // InternalRLS.g:1681:1: rule__Fact__Group__2__Impl : ( ( rule__Fact__TermsAssignment_2 ) ) ;
    public final void rule__Fact__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:1685:1: ( ( ( rule__Fact__TermsAssignment_2 ) ) )
            // InternalRLS.g:1686:1: ( ( rule__Fact__TermsAssignment_2 ) )
            {
            // InternalRLS.g:1686:1: ( ( rule__Fact__TermsAssignment_2 ) )
            // InternalRLS.g:1687:2: ( rule__Fact__TermsAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFactAccess().getTermsAssignment_2()); 
            }
            // InternalRLS.g:1688:2: ( rule__Fact__TermsAssignment_2 )
            // InternalRLS.g:1688:3: rule__Fact__TermsAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Fact__TermsAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFactAccess().getTermsAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fact__Group__2__Impl"


    // $ANTLR start "rule__Fact__Group__3"
    // InternalRLS.g:1696:1: rule__Fact__Group__3 : rule__Fact__Group__3__Impl ;
    public final void rule__Fact__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:1700:1: ( rule__Fact__Group__3__Impl )
            // InternalRLS.g:1701:2: rule__Fact__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Fact__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fact__Group__3"


    // $ANTLR start "rule__Fact__Group__3__Impl"
    // InternalRLS.g:1707:1: rule__Fact__Group__3__Impl : ( RULE_RPAREN ) ;
    public final void rule__Fact__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:1711:1: ( ( RULE_RPAREN ) )
            // InternalRLS.g:1712:1: ( RULE_RPAREN )
            {
            // InternalRLS.g:1712:1: ( RULE_RPAREN )
            // InternalRLS.g:1713:2: RULE_RPAREN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFactAccess().getRPARENTerminalRuleCall_3()); 
            }
            match(input,RULE_RPAREN,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFactAccess().getRPARENTerminalRuleCall_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fact__Group__3__Impl"


    // $ANTLR start "rule__PositiveLiteral__Group__0"
    // InternalRLS.g:1723:1: rule__PositiveLiteral__Group__0 : rule__PositiveLiteral__Group__0__Impl rule__PositiveLiteral__Group__1 ;
    public final void rule__PositiveLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:1727:1: ( rule__PositiveLiteral__Group__0__Impl rule__PositiveLiteral__Group__1 )
            // InternalRLS.g:1728:2: rule__PositiveLiteral__Group__0__Impl rule__PositiveLiteral__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__PositiveLiteral__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PositiveLiteral__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PositiveLiteral__Group__0"


    // $ANTLR start "rule__PositiveLiteral__Group__0__Impl"
    // InternalRLS.g:1735:1: rule__PositiveLiteral__Group__0__Impl : ( ( rule__PositiveLiteral__PredicatenameAssignment_0 ) ) ;
    public final void rule__PositiveLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:1739:1: ( ( ( rule__PositiveLiteral__PredicatenameAssignment_0 ) ) )
            // InternalRLS.g:1740:1: ( ( rule__PositiveLiteral__PredicatenameAssignment_0 ) )
            {
            // InternalRLS.g:1740:1: ( ( rule__PositiveLiteral__PredicatenameAssignment_0 ) )
            // InternalRLS.g:1741:2: ( rule__PositiveLiteral__PredicatenameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPositiveLiteralAccess().getPredicatenameAssignment_0()); 
            }
            // InternalRLS.g:1742:2: ( rule__PositiveLiteral__PredicatenameAssignment_0 )
            // InternalRLS.g:1742:3: rule__PositiveLiteral__PredicatenameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__PositiveLiteral__PredicatenameAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPositiveLiteralAccess().getPredicatenameAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PositiveLiteral__Group__0__Impl"


    // $ANTLR start "rule__PositiveLiteral__Group__1"
    // InternalRLS.g:1750:1: rule__PositiveLiteral__Group__1 : rule__PositiveLiteral__Group__1__Impl rule__PositiveLiteral__Group__2 ;
    public final void rule__PositiveLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:1754:1: ( rule__PositiveLiteral__Group__1__Impl rule__PositiveLiteral__Group__2 )
            // InternalRLS.g:1755:2: rule__PositiveLiteral__Group__1__Impl rule__PositiveLiteral__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__PositiveLiteral__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PositiveLiteral__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PositiveLiteral__Group__1"


    // $ANTLR start "rule__PositiveLiteral__Group__1__Impl"
    // InternalRLS.g:1762:1: rule__PositiveLiteral__Group__1__Impl : ( RULE_LPAREN ) ;
    public final void rule__PositiveLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:1766:1: ( ( RULE_LPAREN ) )
            // InternalRLS.g:1767:1: ( RULE_LPAREN )
            {
            // InternalRLS.g:1767:1: ( RULE_LPAREN )
            // InternalRLS.g:1768:2: RULE_LPAREN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPositiveLiteralAccess().getLPARENTerminalRuleCall_1()); 
            }
            match(input,RULE_LPAREN,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPositiveLiteralAccess().getLPARENTerminalRuleCall_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PositiveLiteral__Group__1__Impl"


    // $ANTLR start "rule__PositiveLiteral__Group__2"
    // InternalRLS.g:1777:1: rule__PositiveLiteral__Group__2 : rule__PositiveLiteral__Group__2__Impl rule__PositiveLiteral__Group__3 ;
    public final void rule__PositiveLiteral__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:1781:1: ( rule__PositiveLiteral__Group__2__Impl rule__PositiveLiteral__Group__3 )
            // InternalRLS.g:1782:2: rule__PositiveLiteral__Group__2__Impl rule__PositiveLiteral__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__PositiveLiteral__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PositiveLiteral__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PositiveLiteral__Group__2"


    // $ANTLR start "rule__PositiveLiteral__Group__2__Impl"
    // InternalRLS.g:1789:1: rule__PositiveLiteral__Group__2__Impl : ( ( rule__PositiveLiteral__TermsAssignment_2 ) ) ;
    public final void rule__PositiveLiteral__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:1793:1: ( ( ( rule__PositiveLiteral__TermsAssignment_2 ) ) )
            // InternalRLS.g:1794:1: ( ( rule__PositiveLiteral__TermsAssignment_2 ) )
            {
            // InternalRLS.g:1794:1: ( ( rule__PositiveLiteral__TermsAssignment_2 ) )
            // InternalRLS.g:1795:2: ( rule__PositiveLiteral__TermsAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPositiveLiteralAccess().getTermsAssignment_2()); 
            }
            // InternalRLS.g:1796:2: ( rule__PositiveLiteral__TermsAssignment_2 )
            // InternalRLS.g:1796:3: rule__PositiveLiteral__TermsAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__PositiveLiteral__TermsAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPositiveLiteralAccess().getTermsAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PositiveLiteral__Group__2__Impl"


    // $ANTLR start "rule__PositiveLiteral__Group__3"
    // InternalRLS.g:1804:1: rule__PositiveLiteral__Group__3 : rule__PositiveLiteral__Group__3__Impl ;
    public final void rule__PositiveLiteral__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:1808:1: ( rule__PositiveLiteral__Group__3__Impl )
            // InternalRLS.g:1809:2: rule__PositiveLiteral__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PositiveLiteral__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PositiveLiteral__Group__3"


    // $ANTLR start "rule__PositiveLiteral__Group__3__Impl"
    // InternalRLS.g:1815:1: rule__PositiveLiteral__Group__3__Impl : ( RULE_RPAREN ) ;
    public final void rule__PositiveLiteral__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:1819:1: ( ( RULE_RPAREN ) )
            // InternalRLS.g:1820:1: ( RULE_RPAREN )
            {
            // InternalRLS.g:1820:1: ( RULE_RPAREN )
            // InternalRLS.g:1821:2: RULE_RPAREN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPositiveLiteralAccess().getRPARENTerminalRuleCall_3()); 
            }
            match(input,RULE_RPAREN,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPositiveLiteralAccess().getRPARENTerminalRuleCall_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PositiveLiteral__Group__3__Impl"


    // $ANTLR start "rule__ListOfLiterals__Group__0"
    // InternalRLS.g:1831:1: rule__ListOfLiterals__Group__0 : rule__ListOfLiterals__Group__0__Impl rule__ListOfLiterals__Group__1 ;
    public final void rule__ListOfLiterals__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:1835:1: ( rule__ListOfLiterals__Group__0__Impl rule__ListOfLiterals__Group__1 )
            // InternalRLS.g:1836:2: rule__ListOfLiterals__Group__0__Impl rule__ListOfLiterals__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__ListOfLiterals__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ListOfLiterals__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListOfLiterals__Group__0"


    // $ANTLR start "rule__ListOfLiterals__Group__0__Impl"
    // InternalRLS.g:1843:1: rule__ListOfLiterals__Group__0__Impl : ( ( rule__ListOfLiterals__LAssignment_0 ) ) ;
    public final void rule__ListOfLiterals__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:1847:1: ( ( ( rule__ListOfLiterals__LAssignment_0 ) ) )
            // InternalRLS.g:1848:1: ( ( rule__ListOfLiterals__LAssignment_0 ) )
            {
            // InternalRLS.g:1848:1: ( ( rule__ListOfLiterals__LAssignment_0 ) )
            // InternalRLS.g:1849:2: ( rule__ListOfLiterals__LAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListOfLiteralsAccess().getLAssignment_0()); 
            }
            // InternalRLS.g:1850:2: ( rule__ListOfLiterals__LAssignment_0 )
            // InternalRLS.g:1850:3: rule__ListOfLiterals__LAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ListOfLiterals__LAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getListOfLiteralsAccess().getLAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListOfLiterals__Group__0__Impl"


    // $ANTLR start "rule__ListOfLiterals__Group__1"
    // InternalRLS.g:1858:1: rule__ListOfLiterals__Group__1 : rule__ListOfLiterals__Group__1__Impl ;
    public final void rule__ListOfLiterals__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:1862:1: ( rule__ListOfLiterals__Group__1__Impl )
            // InternalRLS.g:1863:2: rule__ListOfLiterals__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ListOfLiterals__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListOfLiterals__Group__1"


    // $ANTLR start "rule__ListOfLiterals__Group__1__Impl"
    // InternalRLS.g:1869:1: rule__ListOfLiterals__Group__1__Impl : ( ( rule__ListOfLiterals__Group_1__0 )* ) ;
    public final void rule__ListOfLiterals__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:1873:1: ( ( ( rule__ListOfLiterals__Group_1__0 )* ) )
            // InternalRLS.g:1874:1: ( ( rule__ListOfLiterals__Group_1__0 )* )
            {
            // InternalRLS.g:1874:1: ( ( rule__ListOfLiterals__Group_1__0 )* )
            // InternalRLS.g:1875:2: ( rule__ListOfLiterals__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListOfLiteralsAccess().getGroup_1()); 
            }
            // InternalRLS.g:1876:2: ( rule__ListOfLiterals__Group_1__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_COMMA) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalRLS.g:1876:3: rule__ListOfLiterals__Group_1__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__ListOfLiterals__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getListOfLiteralsAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListOfLiterals__Group__1__Impl"


    // $ANTLR start "rule__ListOfLiterals__Group_1__0"
    // InternalRLS.g:1885:1: rule__ListOfLiterals__Group_1__0 : rule__ListOfLiterals__Group_1__0__Impl rule__ListOfLiterals__Group_1__1 ;
    public final void rule__ListOfLiterals__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:1889:1: ( rule__ListOfLiterals__Group_1__0__Impl rule__ListOfLiterals__Group_1__1 )
            // InternalRLS.g:1890:2: rule__ListOfLiterals__Group_1__0__Impl rule__ListOfLiterals__Group_1__1
            {
            pushFollow(FOLLOW_16);
            rule__ListOfLiterals__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ListOfLiterals__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListOfLiterals__Group_1__0"


    // $ANTLR start "rule__ListOfLiterals__Group_1__0__Impl"
    // InternalRLS.g:1897:1: rule__ListOfLiterals__Group_1__0__Impl : ( RULE_COMMA ) ;
    public final void rule__ListOfLiterals__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:1901:1: ( ( RULE_COMMA ) )
            // InternalRLS.g:1902:1: ( RULE_COMMA )
            {
            // InternalRLS.g:1902:1: ( RULE_COMMA )
            // InternalRLS.g:1903:2: RULE_COMMA
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListOfLiteralsAccess().getCOMMATerminalRuleCall_1_0()); 
            }
            match(input,RULE_COMMA,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getListOfLiteralsAccess().getCOMMATerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListOfLiterals__Group_1__0__Impl"


    // $ANTLR start "rule__ListOfLiterals__Group_1__1"
    // InternalRLS.g:1912:1: rule__ListOfLiterals__Group_1__1 : rule__ListOfLiterals__Group_1__1__Impl ;
    public final void rule__ListOfLiterals__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:1916:1: ( rule__ListOfLiterals__Group_1__1__Impl )
            // InternalRLS.g:1917:2: rule__ListOfLiterals__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ListOfLiterals__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListOfLiterals__Group_1__1"


    // $ANTLR start "rule__ListOfLiterals__Group_1__1__Impl"
    // InternalRLS.g:1923:1: rule__ListOfLiterals__Group_1__1__Impl : ( ( rule__ListOfLiterals__LAssignment_1_1 ) ) ;
    public final void rule__ListOfLiterals__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:1927:1: ( ( ( rule__ListOfLiterals__LAssignment_1_1 ) ) )
            // InternalRLS.g:1928:1: ( ( rule__ListOfLiterals__LAssignment_1_1 ) )
            {
            // InternalRLS.g:1928:1: ( ( rule__ListOfLiterals__LAssignment_1_1 ) )
            // InternalRLS.g:1929:2: ( rule__ListOfLiterals__LAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListOfLiteralsAccess().getLAssignment_1_1()); 
            }
            // InternalRLS.g:1930:2: ( rule__ListOfLiterals__LAssignment_1_1 )
            // InternalRLS.g:1930:3: rule__ListOfLiterals__LAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__ListOfLiterals__LAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getListOfLiteralsAccess().getLAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListOfLiterals__Group_1__1__Impl"


    // $ANTLR start "rule__ListOfPositiveLiterals__Group__0"
    // InternalRLS.g:1939:1: rule__ListOfPositiveLiterals__Group__0 : rule__ListOfPositiveLiterals__Group__0__Impl rule__ListOfPositiveLiterals__Group__1 ;
    public final void rule__ListOfPositiveLiterals__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:1943:1: ( rule__ListOfPositiveLiterals__Group__0__Impl rule__ListOfPositiveLiterals__Group__1 )
            // InternalRLS.g:1944:2: rule__ListOfPositiveLiterals__Group__0__Impl rule__ListOfPositiveLiterals__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__ListOfPositiveLiterals__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ListOfPositiveLiterals__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListOfPositiveLiterals__Group__0"


    // $ANTLR start "rule__ListOfPositiveLiterals__Group__0__Impl"
    // InternalRLS.g:1951:1: rule__ListOfPositiveLiterals__Group__0__Impl : ( ( rule__ListOfPositiveLiterals__LAssignment_0 ) ) ;
    public final void rule__ListOfPositiveLiterals__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:1955:1: ( ( ( rule__ListOfPositiveLiterals__LAssignment_0 ) ) )
            // InternalRLS.g:1956:1: ( ( rule__ListOfPositiveLiterals__LAssignment_0 ) )
            {
            // InternalRLS.g:1956:1: ( ( rule__ListOfPositiveLiterals__LAssignment_0 ) )
            // InternalRLS.g:1957:2: ( rule__ListOfPositiveLiterals__LAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListOfPositiveLiteralsAccess().getLAssignment_0()); 
            }
            // InternalRLS.g:1958:2: ( rule__ListOfPositiveLiterals__LAssignment_0 )
            // InternalRLS.g:1958:3: rule__ListOfPositiveLiterals__LAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ListOfPositiveLiterals__LAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getListOfPositiveLiteralsAccess().getLAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListOfPositiveLiterals__Group__0__Impl"


    // $ANTLR start "rule__ListOfPositiveLiterals__Group__1"
    // InternalRLS.g:1966:1: rule__ListOfPositiveLiterals__Group__1 : rule__ListOfPositiveLiterals__Group__1__Impl ;
    public final void rule__ListOfPositiveLiterals__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:1970:1: ( rule__ListOfPositiveLiterals__Group__1__Impl )
            // InternalRLS.g:1971:2: rule__ListOfPositiveLiterals__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ListOfPositiveLiterals__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListOfPositiveLiterals__Group__1"


    // $ANTLR start "rule__ListOfPositiveLiterals__Group__1__Impl"
    // InternalRLS.g:1977:1: rule__ListOfPositiveLiterals__Group__1__Impl : ( ( rule__ListOfPositiveLiterals__Group_1__0 )* ) ;
    public final void rule__ListOfPositiveLiterals__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:1981:1: ( ( ( rule__ListOfPositiveLiterals__Group_1__0 )* ) )
            // InternalRLS.g:1982:1: ( ( rule__ListOfPositiveLiterals__Group_1__0 )* )
            {
            // InternalRLS.g:1982:1: ( ( rule__ListOfPositiveLiterals__Group_1__0 )* )
            // InternalRLS.g:1983:2: ( rule__ListOfPositiveLiterals__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListOfPositiveLiteralsAccess().getGroup_1()); 
            }
            // InternalRLS.g:1984:2: ( rule__ListOfPositiveLiterals__Group_1__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_COMMA) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalRLS.g:1984:3: rule__ListOfPositiveLiterals__Group_1__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__ListOfPositiveLiterals__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getListOfPositiveLiteralsAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListOfPositiveLiterals__Group__1__Impl"


    // $ANTLR start "rule__ListOfPositiveLiterals__Group_1__0"
    // InternalRLS.g:1993:1: rule__ListOfPositiveLiterals__Group_1__0 : rule__ListOfPositiveLiterals__Group_1__0__Impl rule__ListOfPositiveLiterals__Group_1__1 ;
    public final void rule__ListOfPositiveLiterals__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:1997:1: ( rule__ListOfPositiveLiterals__Group_1__0__Impl rule__ListOfPositiveLiterals__Group_1__1 )
            // InternalRLS.g:1998:2: rule__ListOfPositiveLiterals__Group_1__0__Impl rule__ListOfPositiveLiterals__Group_1__1
            {
            pushFollow(FOLLOW_13);
            rule__ListOfPositiveLiterals__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ListOfPositiveLiterals__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListOfPositiveLiterals__Group_1__0"


    // $ANTLR start "rule__ListOfPositiveLiterals__Group_1__0__Impl"
    // InternalRLS.g:2005:1: rule__ListOfPositiveLiterals__Group_1__0__Impl : ( RULE_COMMA ) ;
    public final void rule__ListOfPositiveLiterals__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:2009:1: ( ( RULE_COMMA ) )
            // InternalRLS.g:2010:1: ( RULE_COMMA )
            {
            // InternalRLS.g:2010:1: ( RULE_COMMA )
            // InternalRLS.g:2011:2: RULE_COMMA
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListOfPositiveLiteralsAccess().getCOMMATerminalRuleCall_1_0()); 
            }
            match(input,RULE_COMMA,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getListOfPositiveLiteralsAccess().getCOMMATerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListOfPositiveLiterals__Group_1__0__Impl"


    // $ANTLR start "rule__ListOfPositiveLiterals__Group_1__1"
    // InternalRLS.g:2020:1: rule__ListOfPositiveLiterals__Group_1__1 : rule__ListOfPositiveLiterals__Group_1__1__Impl ;
    public final void rule__ListOfPositiveLiterals__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:2024:1: ( rule__ListOfPositiveLiterals__Group_1__1__Impl )
            // InternalRLS.g:2025:2: rule__ListOfPositiveLiterals__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ListOfPositiveLiterals__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListOfPositiveLiterals__Group_1__1"


    // $ANTLR start "rule__ListOfPositiveLiterals__Group_1__1__Impl"
    // InternalRLS.g:2031:1: rule__ListOfPositiveLiterals__Group_1__1__Impl : ( ( rule__ListOfPositiveLiterals__LAssignment_1_1 ) ) ;
    public final void rule__ListOfPositiveLiterals__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:2035:1: ( ( ( rule__ListOfPositiveLiterals__LAssignment_1_1 ) ) )
            // InternalRLS.g:2036:1: ( ( rule__ListOfPositiveLiterals__LAssignment_1_1 ) )
            {
            // InternalRLS.g:2036:1: ( ( rule__ListOfPositiveLiterals__LAssignment_1_1 ) )
            // InternalRLS.g:2037:2: ( rule__ListOfPositiveLiterals__LAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListOfPositiveLiteralsAccess().getLAssignment_1_1()); 
            }
            // InternalRLS.g:2038:2: ( rule__ListOfPositiveLiterals__LAssignment_1_1 )
            // InternalRLS.g:2038:3: rule__ListOfPositiveLiterals__LAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__ListOfPositiveLiterals__LAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getListOfPositiveLiteralsAccess().getLAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListOfPositiveLiterals__Group_1__1__Impl"


    // $ANTLR start "rule__Rule__Group__0"
    // InternalRLS.g:2047:1: rule__Rule__Group__0 : rule__Rule__Group__0__Impl rule__Rule__Group__1 ;
    public final void rule__Rule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:2051:1: ( rule__Rule__Group__0__Impl rule__Rule__Group__1 )
            // InternalRLS.g:2052:2: rule__Rule__Group__0__Impl rule__Rule__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__Rule__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Rule__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__0"


    // $ANTLR start "rule__Rule__Group__0__Impl"
    // InternalRLS.g:2059:1: rule__Rule__Group__0__Impl : ( ( rule__Rule__HeadAssignment_0 ) ) ;
    public final void rule__Rule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:2063:1: ( ( ( rule__Rule__HeadAssignment_0 ) ) )
            // InternalRLS.g:2064:1: ( ( rule__Rule__HeadAssignment_0 ) )
            {
            // InternalRLS.g:2064:1: ( ( rule__Rule__HeadAssignment_0 ) )
            // InternalRLS.g:2065:2: ( rule__Rule__HeadAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleAccess().getHeadAssignment_0()); 
            }
            // InternalRLS.g:2066:2: ( rule__Rule__HeadAssignment_0 )
            // InternalRLS.g:2066:3: rule__Rule__HeadAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Rule__HeadAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuleAccess().getHeadAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__0__Impl"


    // $ANTLR start "rule__Rule__Group__1"
    // InternalRLS.g:2074:1: rule__Rule__Group__1 : rule__Rule__Group__1__Impl rule__Rule__Group__2 ;
    public final void rule__Rule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:2078:1: ( rule__Rule__Group__1__Impl rule__Rule__Group__2 )
            // InternalRLS.g:2079:2: rule__Rule__Group__1__Impl rule__Rule__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__Rule__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Rule__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__1"


    // $ANTLR start "rule__Rule__Group__1__Impl"
    // InternalRLS.g:2086:1: rule__Rule__Group__1__Impl : ( RULE_ARROW ) ;
    public final void rule__Rule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:2090:1: ( ( RULE_ARROW ) )
            // InternalRLS.g:2091:1: ( RULE_ARROW )
            {
            // InternalRLS.g:2091:1: ( RULE_ARROW )
            // InternalRLS.g:2092:2: RULE_ARROW
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleAccess().getARROWTerminalRuleCall_1()); 
            }
            match(input,RULE_ARROW,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuleAccess().getARROWTerminalRuleCall_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__1__Impl"


    // $ANTLR start "rule__Rule__Group__2"
    // InternalRLS.g:2101:1: rule__Rule__Group__2 : rule__Rule__Group__2__Impl rule__Rule__Group__3 ;
    public final void rule__Rule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:2105:1: ( rule__Rule__Group__2__Impl rule__Rule__Group__3 )
            // InternalRLS.g:2106:2: rule__Rule__Group__2__Impl rule__Rule__Group__3
            {
            pushFollow(FOLLOW_18);
            rule__Rule__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Rule__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__2"


    // $ANTLR start "rule__Rule__Group__2__Impl"
    // InternalRLS.g:2113:1: rule__Rule__Group__2__Impl : ( ( rule__Rule__BodyAssignment_2 ) ) ;
    public final void rule__Rule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:2117:1: ( ( ( rule__Rule__BodyAssignment_2 ) ) )
            // InternalRLS.g:2118:1: ( ( rule__Rule__BodyAssignment_2 ) )
            {
            // InternalRLS.g:2118:1: ( ( rule__Rule__BodyAssignment_2 ) )
            // InternalRLS.g:2119:2: ( rule__Rule__BodyAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleAccess().getBodyAssignment_2()); 
            }
            // InternalRLS.g:2120:2: ( rule__Rule__BodyAssignment_2 )
            // InternalRLS.g:2120:3: rule__Rule__BodyAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Rule__BodyAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuleAccess().getBodyAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__2__Impl"


    // $ANTLR start "rule__Rule__Group__3"
    // InternalRLS.g:2128:1: rule__Rule__Group__3 : rule__Rule__Group__3__Impl ;
    public final void rule__Rule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:2132:1: ( rule__Rule__Group__3__Impl )
            // InternalRLS.g:2133:2: rule__Rule__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Rule__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__3"


    // $ANTLR start "rule__Rule__Group__3__Impl"
    // InternalRLS.g:2139:1: rule__Rule__Group__3__Impl : ( RULE_DOT ) ;
    public final void rule__Rule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:2143:1: ( ( RULE_DOT ) )
            // InternalRLS.g:2144:1: ( RULE_DOT )
            {
            // InternalRLS.g:2144:1: ( RULE_DOT )
            // InternalRLS.g:2145:2: RULE_DOT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleAccess().getDOTTerminalRuleCall_3()); 
            }
            match(input,RULE_DOT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuleAccess().getDOTTerminalRuleCall_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__3__Impl"


    // $ANTLR start "rule__Statement__Group_1__0"
    // InternalRLS.g:2155:1: rule__Statement__Group_1__0 : rule__Statement__Group_1__0__Impl rule__Statement__Group_1__1 ;
    public final void rule__Statement__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:2159:1: ( rule__Statement__Group_1__0__Impl rule__Statement__Group_1__1 )
            // InternalRLS.g:2160:2: rule__Statement__Group_1__0__Impl rule__Statement__Group_1__1
            {
            pushFollow(FOLLOW_18);
            rule__Statement__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Statement__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_1__0"


    // $ANTLR start "rule__Statement__Group_1__0__Impl"
    // InternalRLS.g:2167:1: rule__Statement__Group_1__0__Impl : ( ( rule__Statement__StatementAssignment_1_0 ) ) ;
    public final void rule__Statement__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:2171:1: ( ( ( rule__Statement__StatementAssignment_1_0 ) ) )
            // InternalRLS.g:2172:1: ( ( rule__Statement__StatementAssignment_1_0 ) )
            {
            // InternalRLS.g:2172:1: ( ( rule__Statement__StatementAssignment_1_0 ) )
            // InternalRLS.g:2173:2: ( rule__Statement__StatementAssignment_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getStatementAssignment_1_0()); 
            }
            // InternalRLS.g:2174:2: ( rule__Statement__StatementAssignment_1_0 )
            // InternalRLS.g:2174:3: rule__Statement__StatementAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Statement__StatementAssignment_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getStatementAssignment_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_1__0__Impl"


    // $ANTLR start "rule__Statement__Group_1__1"
    // InternalRLS.g:2182:1: rule__Statement__Group_1__1 : rule__Statement__Group_1__1__Impl ;
    public final void rule__Statement__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:2186:1: ( rule__Statement__Group_1__1__Impl )
            // InternalRLS.g:2187:2: rule__Statement__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Statement__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_1__1"


    // $ANTLR start "rule__Statement__Group_1__1__Impl"
    // InternalRLS.g:2193:1: rule__Statement__Group_1__1__Impl : ( RULE_DOT ) ;
    public final void rule__Statement__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:2197:1: ( ( RULE_DOT ) )
            // InternalRLS.g:2198:1: ( RULE_DOT )
            {
            // InternalRLS.g:2198:1: ( RULE_DOT )
            // InternalRLS.g:2199:2: RULE_DOT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getDOTTerminalRuleCall_1_1()); 
            }
            match(input,RULE_DOT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getDOTTerminalRuleCall_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_1__1__Impl"


    // $ANTLR start "rule__DataSource__Group__0"
    // InternalRLS.g:2209:1: rule__DataSource__Group__0 : rule__DataSource__Group__0__Impl rule__DataSource__Group__1 ;
    public final void rule__DataSource__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:2213:1: ( rule__DataSource__Group__0__Impl rule__DataSource__Group__1 )
            // InternalRLS.g:2214:2: rule__DataSource__Group__0__Impl rule__DataSource__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__DataSource__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DataSource__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSource__Group__0"


    // $ANTLR start "rule__DataSource__Group__0__Impl"
    // InternalRLS.g:2221:1: rule__DataSource__Group__0__Impl : ( ( rule__DataSource__Alternatives_0 ) ) ;
    public final void rule__DataSource__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:2225:1: ( ( ( rule__DataSource__Alternatives_0 ) ) )
            // InternalRLS.g:2226:1: ( ( rule__DataSource__Alternatives_0 ) )
            {
            // InternalRLS.g:2226:1: ( ( rule__DataSource__Alternatives_0 ) )
            // InternalRLS.g:2227:2: ( rule__DataSource__Alternatives_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDataSourceAccess().getAlternatives_0()); 
            }
            // InternalRLS.g:2228:2: ( rule__DataSource__Alternatives_0 )
            // InternalRLS.g:2228:3: rule__DataSource__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__DataSource__Alternatives_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDataSourceAccess().getAlternatives_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSource__Group__0__Impl"


    // $ANTLR start "rule__DataSource__Group__1"
    // InternalRLS.g:2236:1: rule__DataSource__Group__1 : rule__DataSource__Group__1__Impl rule__DataSource__Group__2 ;
    public final void rule__DataSource__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:2240:1: ( rule__DataSource__Group__1__Impl rule__DataSource__Group__2 )
            // InternalRLS.g:2241:2: rule__DataSource__Group__1__Impl rule__DataSource__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__DataSource__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DataSource__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSource__Group__1"


    // $ANTLR start "rule__DataSource__Group__1__Impl"
    // InternalRLS.g:2248:1: rule__DataSource__Group__1__Impl : ( RULE_LPAREN ) ;
    public final void rule__DataSource__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:2252:1: ( ( RULE_LPAREN ) )
            // InternalRLS.g:2253:1: ( RULE_LPAREN )
            {
            // InternalRLS.g:2253:1: ( RULE_LPAREN )
            // InternalRLS.g:2254:2: RULE_LPAREN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDataSourceAccess().getLPARENTerminalRuleCall_1()); 
            }
            match(input,RULE_LPAREN,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDataSourceAccess().getLPARENTerminalRuleCall_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSource__Group__1__Impl"


    // $ANTLR start "rule__DataSource__Group__2"
    // InternalRLS.g:2263:1: rule__DataSource__Group__2 : rule__DataSource__Group__2__Impl rule__DataSource__Group__3 ;
    public final void rule__DataSource__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:2267:1: ( rule__DataSource__Group__2__Impl rule__DataSource__Group__3 )
            // InternalRLS.g:2268:2: rule__DataSource__Group__2__Impl rule__DataSource__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__DataSource__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DataSource__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSource__Group__2"


    // $ANTLR start "rule__DataSource__Group__2__Impl"
    // InternalRLS.g:2275:1: rule__DataSource__Group__2__Impl : ( ( rule__DataSource__ArgAssignment_2 ) ) ;
    public final void rule__DataSource__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:2279:1: ( ( ( rule__DataSource__ArgAssignment_2 ) ) )
            // InternalRLS.g:2280:1: ( ( rule__DataSource__ArgAssignment_2 ) )
            {
            // InternalRLS.g:2280:1: ( ( rule__DataSource__ArgAssignment_2 ) )
            // InternalRLS.g:2281:2: ( rule__DataSource__ArgAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDataSourceAccess().getArgAssignment_2()); 
            }
            // InternalRLS.g:2282:2: ( rule__DataSource__ArgAssignment_2 )
            // InternalRLS.g:2282:3: rule__DataSource__ArgAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__DataSource__ArgAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDataSourceAccess().getArgAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSource__Group__2__Impl"


    // $ANTLR start "rule__DataSource__Group__3"
    // InternalRLS.g:2290:1: rule__DataSource__Group__3 : rule__DataSource__Group__3__Impl ;
    public final void rule__DataSource__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:2294:1: ( rule__DataSource__Group__3__Impl )
            // InternalRLS.g:2295:2: rule__DataSource__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataSource__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSource__Group__3"


    // $ANTLR start "rule__DataSource__Group__3__Impl"
    // InternalRLS.g:2301:1: rule__DataSource__Group__3__Impl : ( RULE_RPAREN ) ;
    public final void rule__DataSource__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:2305:1: ( ( RULE_RPAREN ) )
            // InternalRLS.g:2306:1: ( RULE_RPAREN )
            {
            // InternalRLS.g:2306:1: ( RULE_RPAREN )
            // InternalRLS.g:2307:2: RULE_RPAREN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDataSourceAccess().getRPARENTerminalRuleCall_3()); 
            }
            match(input,RULE_RPAREN,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDataSourceAccess().getRPARENTerminalRuleCall_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSource__Group__3__Impl"


    // $ANTLR start "rule__Source__Group__0"
    // InternalRLS.g:2317:1: rule__Source__Group__0 : rule__Source__Group__0__Impl rule__Source__Group__1 ;
    public final void rule__Source__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:2321:1: ( rule__Source__Group__0__Impl rule__Source__Group__1 )
            // InternalRLS.g:2322:2: rule__Source__Group__0__Impl rule__Source__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__Source__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Source__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source__Group__0"


    // $ANTLR start "rule__Source__Group__0__Impl"
    // InternalRLS.g:2329:1: rule__Source__Group__0__Impl : ( RULE_SRC ) ;
    public final void rule__Source__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:2333:1: ( ( RULE_SRC ) )
            // InternalRLS.g:2334:1: ( RULE_SRC )
            {
            // InternalRLS.g:2334:1: ( RULE_SRC )
            // InternalRLS.g:2335:2: RULE_SRC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSourceAccess().getSRCTerminalRuleCall_0()); 
            }
            match(input,RULE_SRC,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSourceAccess().getSRCTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source__Group__0__Impl"


    // $ANTLR start "rule__Source__Group__1"
    // InternalRLS.g:2344:1: rule__Source__Group__1 : rule__Source__Group__1__Impl rule__Source__Group__2 ;
    public final void rule__Source__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:2348:1: ( rule__Source__Group__1__Impl rule__Source__Group__2 )
            // InternalRLS.g:2349:2: rule__Source__Group__1__Impl rule__Source__Group__2
            {
            pushFollow(FOLLOW_19);
            rule__Source__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Source__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source__Group__1"


    // $ANTLR start "rule__Source__Group__1__Impl"
    // InternalRLS.g:2356:1: rule__Source__Group__1__Impl : ( ( rule__Source__PredicatenameAssignment_1 ) ) ;
    public final void rule__Source__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:2360:1: ( ( ( rule__Source__PredicatenameAssignment_1 ) ) )
            // InternalRLS.g:2361:1: ( ( rule__Source__PredicatenameAssignment_1 ) )
            {
            // InternalRLS.g:2361:1: ( ( rule__Source__PredicatenameAssignment_1 ) )
            // InternalRLS.g:2362:2: ( rule__Source__PredicatenameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSourceAccess().getPredicatenameAssignment_1()); 
            }
            // InternalRLS.g:2363:2: ( rule__Source__PredicatenameAssignment_1 )
            // InternalRLS.g:2363:3: rule__Source__PredicatenameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Source__PredicatenameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSourceAccess().getPredicatenameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source__Group__1__Impl"


    // $ANTLR start "rule__Source__Group__2"
    // InternalRLS.g:2371:1: rule__Source__Group__2 : rule__Source__Group__2__Impl rule__Source__Group__3 ;
    public final void rule__Source__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:2375:1: ( rule__Source__Group__2__Impl rule__Source__Group__3 )
            // InternalRLS.g:2376:2: rule__Source__Group__2__Impl rule__Source__Group__3
            {
            pushFollow(FOLLOW_20);
            rule__Source__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Source__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source__Group__2"


    // $ANTLR start "rule__Source__Group__2__Impl"
    // InternalRLS.g:2383:1: rule__Source__Group__2__Impl : ( ( rule__Source__ArityAssignment_2 ) ) ;
    public final void rule__Source__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:2387:1: ( ( ( rule__Source__ArityAssignment_2 ) ) )
            // InternalRLS.g:2388:1: ( ( rule__Source__ArityAssignment_2 ) )
            {
            // InternalRLS.g:2388:1: ( ( rule__Source__ArityAssignment_2 ) )
            // InternalRLS.g:2389:2: ( rule__Source__ArityAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSourceAccess().getArityAssignment_2()); 
            }
            // InternalRLS.g:2390:2: ( rule__Source__ArityAssignment_2 )
            // InternalRLS.g:2390:3: rule__Source__ArityAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Source__ArityAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSourceAccess().getArityAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source__Group__2__Impl"


    // $ANTLR start "rule__Source__Group__3"
    // InternalRLS.g:2398:1: rule__Source__Group__3 : rule__Source__Group__3__Impl rule__Source__Group__4 ;
    public final void rule__Source__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:2402:1: ( rule__Source__Group__3__Impl rule__Source__Group__4 )
            // InternalRLS.g:2403:2: rule__Source__Group__3__Impl rule__Source__Group__4
            {
            pushFollow(FOLLOW_21);
            rule__Source__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Source__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source__Group__3"


    // $ANTLR start "rule__Source__Group__3__Impl"
    // InternalRLS.g:2410:1: rule__Source__Group__3__Impl : ( RULE_COLON ) ;
    public final void rule__Source__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:2414:1: ( ( RULE_COLON ) )
            // InternalRLS.g:2415:1: ( RULE_COLON )
            {
            // InternalRLS.g:2415:1: ( RULE_COLON )
            // InternalRLS.g:2416:2: RULE_COLON
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSourceAccess().getCOLONTerminalRuleCall_3()); 
            }
            match(input,RULE_COLON,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSourceAccess().getCOLONTerminalRuleCall_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source__Group__3__Impl"


    // $ANTLR start "rule__Source__Group__4"
    // InternalRLS.g:2425:1: rule__Source__Group__4 : rule__Source__Group__4__Impl rule__Source__Group__5 ;
    public final void rule__Source__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:2429:1: ( rule__Source__Group__4__Impl rule__Source__Group__5 )
            // InternalRLS.g:2430:2: rule__Source__Group__4__Impl rule__Source__Group__5
            {
            pushFollow(FOLLOW_18);
            rule__Source__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Source__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source__Group__4"


    // $ANTLR start "rule__Source__Group__4__Impl"
    // InternalRLS.g:2437:1: rule__Source__Group__4__Impl : ( ( rule__Source__DataSourceAssignment_4 ) ) ;
    public final void rule__Source__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:2441:1: ( ( ( rule__Source__DataSourceAssignment_4 ) ) )
            // InternalRLS.g:2442:1: ( ( rule__Source__DataSourceAssignment_4 ) )
            {
            // InternalRLS.g:2442:1: ( ( rule__Source__DataSourceAssignment_4 ) )
            // InternalRLS.g:2443:2: ( rule__Source__DataSourceAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSourceAccess().getDataSourceAssignment_4()); 
            }
            // InternalRLS.g:2444:2: ( rule__Source__DataSourceAssignment_4 )
            // InternalRLS.g:2444:3: rule__Source__DataSourceAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Source__DataSourceAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSourceAccess().getDataSourceAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source__Group__4__Impl"


    // $ANTLR start "rule__Source__Group__5"
    // InternalRLS.g:2452:1: rule__Source__Group__5 : rule__Source__Group__5__Impl ;
    public final void rule__Source__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:2456:1: ( rule__Source__Group__5__Impl )
            // InternalRLS.g:2457:2: rule__Source__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Source__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source__Group__5"


    // $ANTLR start "rule__Source__Group__5__Impl"
    // InternalRLS.g:2463:1: rule__Source__Group__5__Impl : ( RULE_DOT ) ;
    public final void rule__Source__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:2467:1: ( ( RULE_DOT ) )
            // InternalRLS.g:2468:1: ( RULE_DOT )
            {
            // InternalRLS.g:2468:1: ( RULE_DOT )
            // InternalRLS.g:2469:2: RULE_DOT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSourceAccess().getDOTTerminalRuleCall_5()); 
            }
            match(input,RULE_DOT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSourceAccess().getDOTTerminalRuleCall_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source__Group__5__Impl"


    // $ANTLR start "rule__Prefix__Group_0__0"
    // InternalRLS.g:2479:1: rule__Prefix__Group_0__0 : rule__Prefix__Group_0__0__Impl rule__Prefix__Group_0__1 ;
    public final void rule__Prefix__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:2483:1: ( rule__Prefix__Group_0__0__Impl rule__Prefix__Group_0__1 )
            // InternalRLS.g:2484:2: rule__Prefix__Group_0__0__Impl rule__Prefix__Group_0__1
            {
            pushFollow(FOLLOW_20);
            rule__Prefix__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Prefix__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Prefix__Group_0__0"


    // $ANTLR start "rule__Prefix__Group_0__0__Impl"
    // InternalRLS.g:2491:1: rule__Prefix__Group_0__0__Impl : ( RULE_PRFX ) ;
    public final void rule__Prefix__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:2495:1: ( ( RULE_PRFX ) )
            // InternalRLS.g:2496:1: ( RULE_PRFX )
            {
            // InternalRLS.g:2496:1: ( RULE_PRFX )
            // InternalRLS.g:2497:2: RULE_PRFX
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrefixAccess().getPRFXTerminalRuleCall_0_0()); 
            }
            match(input,RULE_PRFX,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrefixAccess().getPRFXTerminalRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Prefix__Group_0__0__Impl"


    // $ANTLR start "rule__Prefix__Group_0__1"
    // InternalRLS.g:2506:1: rule__Prefix__Group_0__1 : rule__Prefix__Group_0__1__Impl rule__Prefix__Group_0__2 ;
    public final void rule__Prefix__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:2510:1: ( rule__Prefix__Group_0__1__Impl rule__Prefix__Group_0__2 )
            // InternalRLS.g:2511:2: rule__Prefix__Group_0__1__Impl rule__Prefix__Group_0__2
            {
            pushFollow(FOLLOW_22);
            rule__Prefix__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Prefix__Group_0__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Prefix__Group_0__1"


    // $ANTLR start "rule__Prefix__Group_0__1__Impl"
    // InternalRLS.g:2518:1: rule__Prefix__Group_0__1__Impl : ( ( rule__Prefix__TAssignment_0_1 ) ) ;
    public final void rule__Prefix__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:2522:1: ( ( ( rule__Prefix__TAssignment_0_1 ) ) )
            // InternalRLS.g:2523:1: ( ( rule__Prefix__TAssignment_0_1 ) )
            {
            // InternalRLS.g:2523:1: ( ( rule__Prefix__TAssignment_0_1 ) )
            // InternalRLS.g:2524:2: ( rule__Prefix__TAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrefixAccess().getTAssignment_0_1()); 
            }
            // InternalRLS.g:2525:2: ( rule__Prefix__TAssignment_0_1 )
            // InternalRLS.g:2525:3: rule__Prefix__TAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Prefix__TAssignment_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrefixAccess().getTAssignment_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Prefix__Group_0__1__Impl"


    // $ANTLR start "rule__Prefix__Group_0__2"
    // InternalRLS.g:2533:1: rule__Prefix__Group_0__2 : rule__Prefix__Group_0__2__Impl rule__Prefix__Group_0__3 ;
    public final void rule__Prefix__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:2537:1: ( rule__Prefix__Group_0__2__Impl rule__Prefix__Group_0__3 )
            // InternalRLS.g:2538:2: rule__Prefix__Group_0__2__Impl rule__Prefix__Group_0__3
            {
            pushFollow(FOLLOW_18);
            rule__Prefix__Group_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Prefix__Group_0__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Prefix__Group_0__2"


    // $ANTLR start "rule__Prefix__Group_0__2__Impl"
    // InternalRLS.g:2545:1: rule__Prefix__Group_0__2__Impl : ( ( rule__Prefix__IriStringAssignment_0_2 ) ) ;
    public final void rule__Prefix__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:2549:1: ( ( ( rule__Prefix__IriStringAssignment_0_2 ) ) )
            // InternalRLS.g:2550:1: ( ( rule__Prefix__IriStringAssignment_0_2 ) )
            {
            // InternalRLS.g:2550:1: ( ( rule__Prefix__IriStringAssignment_0_2 ) )
            // InternalRLS.g:2551:2: ( rule__Prefix__IriStringAssignment_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrefixAccess().getIriStringAssignment_0_2()); 
            }
            // InternalRLS.g:2552:2: ( rule__Prefix__IriStringAssignment_0_2 )
            // InternalRLS.g:2552:3: rule__Prefix__IriStringAssignment_0_2
            {
            pushFollow(FOLLOW_2);
            rule__Prefix__IriStringAssignment_0_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrefixAccess().getIriStringAssignment_0_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Prefix__Group_0__2__Impl"


    // $ANTLR start "rule__Prefix__Group_0__3"
    // InternalRLS.g:2560:1: rule__Prefix__Group_0__3 : rule__Prefix__Group_0__3__Impl ;
    public final void rule__Prefix__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:2564:1: ( rule__Prefix__Group_0__3__Impl )
            // InternalRLS.g:2565:2: rule__Prefix__Group_0__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Prefix__Group_0__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Prefix__Group_0__3"


    // $ANTLR start "rule__Prefix__Group_0__3__Impl"
    // InternalRLS.g:2571:1: rule__Prefix__Group_0__3__Impl : ( RULE_DOT ) ;
    public final void rule__Prefix__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:2575:1: ( ( RULE_DOT ) )
            // InternalRLS.g:2576:1: ( RULE_DOT )
            {
            // InternalRLS.g:2576:1: ( RULE_DOT )
            // InternalRLS.g:2577:2: RULE_DOT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrefixAccess().getDOTTerminalRuleCall_0_3()); 
            }
            match(input,RULE_DOT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrefixAccess().getDOTTerminalRuleCall_0_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Prefix__Group_0__3__Impl"


    // $ANTLR start "rule__Prefix__Group_1__0"
    // InternalRLS.g:2587:1: rule__Prefix__Group_1__0 : rule__Prefix__Group_1__0__Impl rule__Prefix__Group_1__1 ;
    public final void rule__Prefix__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:2591:1: ( rule__Prefix__Group_1__0__Impl rule__Prefix__Group_1__1 )
            // InternalRLS.g:2592:2: rule__Prefix__Group_1__0__Impl rule__Prefix__Group_1__1
            {
            pushFollow(FOLLOW_23);
            rule__Prefix__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Prefix__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Prefix__Group_1__0"


    // $ANTLR start "rule__Prefix__Group_1__0__Impl"
    // InternalRLS.g:2599:1: rule__Prefix__Group_1__0__Impl : ( RULE_PRFX ) ;
    public final void rule__Prefix__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:2603:1: ( ( RULE_PRFX ) )
            // InternalRLS.g:2604:1: ( RULE_PRFX )
            {
            // InternalRLS.g:2604:1: ( RULE_PRFX )
            // InternalRLS.g:2605:2: RULE_PRFX
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrefixAccess().getPRFXTerminalRuleCall_1_0()); 
            }
            match(input,RULE_PRFX,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrefixAccess().getPRFXTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Prefix__Group_1__0__Impl"


    // $ANTLR start "rule__Prefix__Group_1__1"
    // InternalRLS.g:2614:1: rule__Prefix__Group_1__1 : rule__Prefix__Group_1__1__Impl rule__Prefix__Group_1__2 ;
    public final void rule__Prefix__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:2618:1: ( rule__Prefix__Group_1__1__Impl rule__Prefix__Group_1__2 )
            // InternalRLS.g:2619:2: rule__Prefix__Group_1__1__Impl rule__Prefix__Group_1__2
            {
            pushFollow(FOLLOW_22);
            rule__Prefix__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Prefix__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Prefix__Group_1__1"


    // $ANTLR start "rule__Prefix__Group_1__1__Impl"
    // InternalRLS.g:2626:1: rule__Prefix__Group_1__1__Impl : ( ( rule__Prefix__TAssignment_1_1 ) ) ;
    public final void rule__Prefix__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:2630:1: ( ( ( rule__Prefix__TAssignment_1_1 ) ) )
            // InternalRLS.g:2631:1: ( ( rule__Prefix__TAssignment_1_1 ) )
            {
            // InternalRLS.g:2631:1: ( ( rule__Prefix__TAssignment_1_1 ) )
            // InternalRLS.g:2632:2: ( rule__Prefix__TAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrefixAccess().getTAssignment_1_1()); 
            }
            // InternalRLS.g:2633:2: ( rule__Prefix__TAssignment_1_1 )
            // InternalRLS.g:2633:3: rule__Prefix__TAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Prefix__TAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrefixAccess().getTAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Prefix__Group_1__1__Impl"


    // $ANTLR start "rule__Prefix__Group_1__2"
    // InternalRLS.g:2641:1: rule__Prefix__Group_1__2 : rule__Prefix__Group_1__2__Impl rule__Prefix__Group_1__3 ;
    public final void rule__Prefix__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:2645:1: ( rule__Prefix__Group_1__2__Impl rule__Prefix__Group_1__3 )
            // InternalRLS.g:2646:2: rule__Prefix__Group_1__2__Impl rule__Prefix__Group_1__3
            {
            pushFollow(FOLLOW_18);
            rule__Prefix__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Prefix__Group_1__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Prefix__Group_1__2"


    // $ANTLR start "rule__Prefix__Group_1__2__Impl"
    // InternalRLS.g:2653:1: rule__Prefix__Group_1__2__Impl : ( ( rule__Prefix__IriStringAssignment_1_2 ) ) ;
    public final void rule__Prefix__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:2657:1: ( ( ( rule__Prefix__IriStringAssignment_1_2 ) ) )
            // InternalRLS.g:2658:1: ( ( rule__Prefix__IriStringAssignment_1_2 ) )
            {
            // InternalRLS.g:2658:1: ( ( rule__Prefix__IriStringAssignment_1_2 ) )
            // InternalRLS.g:2659:2: ( rule__Prefix__IriStringAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrefixAccess().getIriStringAssignment_1_2()); 
            }
            // InternalRLS.g:2660:2: ( rule__Prefix__IriStringAssignment_1_2 )
            // InternalRLS.g:2660:3: rule__Prefix__IriStringAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Prefix__IriStringAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrefixAccess().getIriStringAssignment_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Prefix__Group_1__2__Impl"


    // $ANTLR start "rule__Prefix__Group_1__3"
    // InternalRLS.g:2668:1: rule__Prefix__Group_1__3 : rule__Prefix__Group_1__3__Impl ;
    public final void rule__Prefix__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:2672:1: ( rule__Prefix__Group_1__3__Impl )
            // InternalRLS.g:2673:2: rule__Prefix__Group_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Prefix__Group_1__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Prefix__Group_1__3"


    // $ANTLR start "rule__Prefix__Group_1__3__Impl"
    // InternalRLS.g:2679:1: rule__Prefix__Group_1__3__Impl : ( RULE_DOT ) ;
    public final void rule__Prefix__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:2683:1: ( ( RULE_DOT ) )
            // InternalRLS.g:2684:1: ( RULE_DOT )
            {
            // InternalRLS.g:2684:1: ( RULE_DOT )
            // InternalRLS.g:2685:2: RULE_DOT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrefixAccess().getDOTTerminalRuleCall_1_3()); 
            }
            match(input,RULE_DOT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrefixAccess().getDOTTerminalRuleCall_1_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Prefix__Group_1__3__Impl"


    // $ANTLR start "rule__Base__Group__0"
    // InternalRLS.g:2695:1: rule__Base__Group__0 : rule__Base__Group__0__Impl rule__Base__Group__1 ;
    public final void rule__Base__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:2699:1: ( rule__Base__Group__0__Impl rule__Base__Group__1 )
            // InternalRLS.g:2700:2: rule__Base__Group__0__Impl rule__Base__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__Base__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Base__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Base__Group__0"


    // $ANTLR start "rule__Base__Group__0__Impl"
    // InternalRLS.g:2707:1: rule__Base__Group__0__Impl : ( RULE_BS ) ;
    public final void rule__Base__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:2711:1: ( ( RULE_BS ) )
            // InternalRLS.g:2712:1: ( RULE_BS )
            {
            // InternalRLS.g:2712:1: ( RULE_BS )
            // InternalRLS.g:2713:2: RULE_BS
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBaseAccess().getBSTerminalRuleCall_0()); 
            }
            match(input,RULE_BS,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBaseAccess().getBSTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Base__Group__0__Impl"


    // $ANTLR start "rule__Base__Group__1"
    // InternalRLS.g:2722:1: rule__Base__Group__1 : rule__Base__Group__1__Impl rule__Base__Group__2 ;
    public final void rule__Base__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:2726:1: ( rule__Base__Group__1__Impl rule__Base__Group__2 )
            // InternalRLS.g:2727:2: rule__Base__Group__1__Impl rule__Base__Group__2
            {
            pushFollow(FOLLOW_18);
            rule__Base__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Base__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Base__Group__1"


    // $ANTLR start "rule__Base__Group__1__Impl"
    // InternalRLS.g:2734:1: rule__Base__Group__1__Impl : ( ( rule__Base__IriStringAssignment_1 ) ) ;
    public final void rule__Base__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:2738:1: ( ( ( rule__Base__IriStringAssignment_1 ) ) )
            // InternalRLS.g:2739:1: ( ( rule__Base__IriStringAssignment_1 ) )
            {
            // InternalRLS.g:2739:1: ( ( rule__Base__IriStringAssignment_1 ) )
            // InternalRLS.g:2740:2: ( rule__Base__IriStringAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBaseAccess().getIriStringAssignment_1()); 
            }
            // InternalRLS.g:2741:2: ( rule__Base__IriStringAssignment_1 )
            // InternalRLS.g:2741:3: rule__Base__IriStringAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Base__IriStringAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBaseAccess().getIriStringAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Base__Group__1__Impl"


    // $ANTLR start "rule__Base__Group__2"
    // InternalRLS.g:2749:1: rule__Base__Group__2 : rule__Base__Group__2__Impl ;
    public final void rule__Base__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:2753:1: ( rule__Base__Group__2__Impl )
            // InternalRLS.g:2754:2: rule__Base__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Base__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Base__Group__2"


    // $ANTLR start "rule__Base__Group__2__Impl"
    // InternalRLS.g:2760:1: rule__Base__Group__2__Impl : ( RULE_DOT ) ;
    public final void rule__Base__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:2764:1: ( ( RULE_DOT ) )
            // InternalRLS.g:2765:1: ( RULE_DOT )
            {
            // InternalRLS.g:2765:1: ( RULE_DOT )
            // InternalRLS.g:2766:2: RULE_DOT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBaseAccess().getDOTTerminalRuleCall_2()); 
            }
            match(input,RULE_DOT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBaseAccess().getDOTTerminalRuleCall_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Base__Group__2__Impl"


    // $ANTLR start "rule__BraceDelimitedLiteral__Group__0"
    // InternalRLS.g:2776:1: rule__BraceDelimitedLiteral__Group__0 : rule__BraceDelimitedLiteral__Group__0__Impl rule__BraceDelimitedLiteral__Group__1 ;
    public final void rule__BraceDelimitedLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:2780:1: ( rule__BraceDelimitedLiteral__Group__0__Impl rule__BraceDelimitedLiteral__Group__1 )
            // InternalRLS.g:2781:2: rule__BraceDelimitedLiteral__Group__0__Impl rule__BraceDelimitedLiteral__Group__1
            {
            pushFollow(FOLLOW_24);
            rule__BraceDelimitedLiteral__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BraceDelimitedLiteral__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BraceDelimitedLiteral__Group__0"


    // $ANTLR start "rule__BraceDelimitedLiteral__Group__0__Impl"
    // InternalRLS.g:2788:1: rule__BraceDelimitedLiteral__Group__0__Impl : ( () ) ;
    public final void rule__BraceDelimitedLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:2792:1: ( ( () ) )
            // InternalRLS.g:2793:1: ( () )
            {
            // InternalRLS.g:2793:1: ( () )
            // InternalRLS.g:2794:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBraceDelimitedLiteralAccess().getBraceDelimitedLiteralAction_0()); 
            }
            // InternalRLS.g:2795:2: ()
            // InternalRLS.g:2795:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBraceDelimitedLiteralAccess().getBraceDelimitedLiteralAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BraceDelimitedLiteral__Group__0__Impl"


    // $ANTLR start "rule__BraceDelimitedLiteral__Group__1"
    // InternalRLS.g:2803:1: rule__BraceDelimitedLiteral__Group__1 : rule__BraceDelimitedLiteral__Group__1__Impl rule__BraceDelimitedLiteral__Group__2 ;
    public final void rule__BraceDelimitedLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:2807:1: ( rule__BraceDelimitedLiteral__Group__1__Impl rule__BraceDelimitedLiteral__Group__2 )
            // InternalRLS.g:2808:2: rule__BraceDelimitedLiteral__Group__1__Impl rule__BraceDelimitedLiteral__Group__2
            {
            pushFollow(FOLLOW_25);
            rule__BraceDelimitedLiteral__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BraceDelimitedLiteral__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BraceDelimitedLiteral__Group__1"


    // $ANTLR start "rule__BraceDelimitedLiteral__Group__1__Impl"
    // InternalRLS.g:2815:1: rule__BraceDelimitedLiteral__Group__1__Impl : ( '{' ) ;
    public final void rule__BraceDelimitedLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:2819:1: ( ( '{' ) )
            // InternalRLS.g:2820:1: ( '{' )
            {
            // InternalRLS.g:2820:1: ( '{' )
            // InternalRLS.g:2821:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBraceDelimitedLiteralAccess().getLeftCurlyBracketKeyword_1()); 
            }
            match(input,56,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBraceDelimitedLiteralAccess().getLeftCurlyBracketKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BraceDelimitedLiteral__Group__1__Impl"


    // $ANTLR start "rule__BraceDelimitedLiteral__Group__2"
    // InternalRLS.g:2830:1: rule__BraceDelimitedLiteral__Group__2 : rule__BraceDelimitedLiteral__Group__2__Impl rule__BraceDelimitedLiteral__Group__3 ;
    public final void rule__BraceDelimitedLiteral__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:2834:1: ( rule__BraceDelimitedLiteral__Group__2__Impl rule__BraceDelimitedLiteral__Group__3 )
            // InternalRLS.g:2835:2: rule__BraceDelimitedLiteral__Group__2__Impl rule__BraceDelimitedLiteral__Group__3
            {
            pushFollow(FOLLOW_25);
            rule__BraceDelimitedLiteral__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BraceDelimitedLiteral__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BraceDelimitedLiteral__Group__2"


    // $ANTLR start "rule__BraceDelimitedLiteral__Group__2__Impl"
    // InternalRLS.g:2842:1: rule__BraceDelimitedLiteral__Group__2__Impl : ( ( rule__BraceDelimitedLiteral__SbAssignment_2 )* ) ;
    public final void rule__BraceDelimitedLiteral__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:2846:1: ( ( ( rule__BraceDelimitedLiteral__SbAssignment_2 )* ) )
            // InternalRLS.g:2847:1: ( ( rule__BraceDelimitedLiteral__SbAssignment_2 )* )
            {
            // InternalRLS.g:2847:1: ( ( rule__BraceDelimitedLiteral__SbAssignment_2 )* )
            // InternalRLS.g:2848:2: ( rule__BraceDelimitedLiteral__SbAssignment_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBraceDelimitedLiteralAccess().getSbAssignment_2()); 
            }
            // InternalRLS.g:2849:2: ( rule__BraceDelimitedLiteral__SbAssignment_2 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RULE_UNBRACE) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalRLS.g:2849:3: rule__BraceDelimitedLiteral__SbAssignment_2
            	    {
            	    pushFollow(FOLLOW_26);
            	    rule__BraceDelimitedLiteral__SbAssignment_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBraceDelimitedLiteralAccess().getSbAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BraceDelimitedLiteral__Group__2__Impl"


    // $ANTLR start "rule__BraceDelimitedLiteral__Group__3"
    // InternalRLS.g:2857:1: rule__BraceDelimitedLiteral__Group__3 : rule__BraceDelimitedLiteral__Group__3__Impl ;
    public final void rule__BraceDelimitedLiteral__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:2861:1: ( rule__BraceDelimitedLiteral__Group__3__Impl )
            // InternalRLS.g:2862:2: rule__BraceDelimitedLiteral__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BraceDelimitedLiteral__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BraceDelimitedLiteral__Group__3"


    // $ANTLR start "rule__BraceDelimitedLiteral__Group__3__Impl"
    // InternalRLS.g:2868:1: rule__BraceDelimitedLiteral__Group__3__Impl : ( '}' ) ;
    public final void rule__BraceDelimitedLiteral__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:2872:1: ( ( '}' ) )
            // InternalRLS.g:2873:1: ( '}' )
            {
            // InternalRLS.g:2873:1: ( '}' )
            // InternalRLS.g:2874:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBraceDelimitedLiteralAccess().getRightCurlyBracketKeyword_3()); 
            }
            match(input,57,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBraceDelimitedLiteralAccess().getRightCurlyBracketKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BraceDelimitedLiteral__Group__3__Impl"


    // $ANTLR start "rule__BracketDelimitedLiteral__Group__0"
    // InternalRLS.g:2884:1: rule__BracketDelimitedLiteral__Group__0 : rule__BracketDelimitedLiteral__Group__0__Impl rule__BracketDelimitedLiteral__Group__1 ;
    public final void rule__BracketDelimitedLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:2888:1: ( rule__BracketDelimitedLiteral__Group__0__Impl rule__BracketDelimitedLiteral__Group__1 )
            // InternalRLS.g:2889:2: rule__BracketDelimitedLiteral__Group__0__Impl rule__BracketDelimitedLiteral__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__BracketDelimitedLiteral__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BracketDelimitedLiteral__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BracketDelimitedLiteral__Group__0"


    // $ANTLR start "rule__BracketDelimitedLiteral__Group__0__Impl"
    // InternalRLS.g:2896:1: rule__BracketDelimitedLiteral__Group__0__Impl : ( () ) ;
    public final void rule__BracketDelimitedLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:2900:1: ( ( () ) )
            // InternalRLS.g:2901:1: ( () )
            {
            // InternalRLS.g:2901:1: ( () )
            // InternalRLS.g:2902:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBracketDelimitedLiteralAccess().getBracketDelimitedLiteralAction_0()); 
            }
            // InternalRLS.g:2903:2: ()
            // InternalRLS.g:2903:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBracketDelimitedLiteralAccess().getBracketDelimitedLiteralAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BracketDelimitedLiteral__Group__0__Impl"


    // $ANTLR start "rule__BracketDelimitedLiteral__Group__1"
    // InternalRLS.g:2911:1: rule__BracketDelimitedLiteral__Group__1 : rule__BracketDelimitedLiteral__Group__1__Impl rule__BracketDelimitedLiteral__Group__2 ;
    public final void rule__BracketDelimitedLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:2915:1: ( rule__BracketDelimitedLiteral__Group__1__Impl rule__BracketDelimitedLiteral__Group__2 )
            // InternalRLS.g:2916:2: rule__BracketDelimitedLiteral__Group__1__Impl rule__BracketDelimitedLiteral__Group__2
            {
            pushFollow(FOLLOW_27);
            rule__BracketDelimitedLiteral__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BracketDelimitedLiteral__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BracketDelimitedLiteral__Group__1"


    // $ANTLR start "rule__BracketDelimitedLiteral__Group__1__Impl"
    // InternalRLS.g:2923:1: rule__BracketDelimitedLiteral__Group__1__Impl : ( '[' ) ;
    public final void rule__BracketDelimitedLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:2927:1: ( ( '[' ) )
            // InternalRLS.g:2928:1: ( '[' )
            {
            // InternalRLS.g:2928:1: ( '[' )
            // InternalRLS.g:2929:2: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBracketDelimitedLiteralAccess().getLeftSquareBracketKeyword_1()); 
            }
            match(input,58,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBracketDelimitedLiteralAccess().getLeftSquareBracketKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BracketDelimitedLiteral__Group__1__Impl"


    // $ANTLR start "rule__BracketDelimitedLiteral__Group__2"
    // InternalRLS.g:2938:1: rule__BracketDelimitedLiteral__Group__2 : rule__BracketDelimitedLiteral__Group__2__Impl rule__BracketDelimitedLiteral__Group__3 ;
    public final void rule__BracketDelimitedLiteral__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:2942:1: ( rule__BracketDelimitedLiteral__Group__2__Impl rule__BracketDelimitedLiteral__Group__3 )
            // InternalRLS.g:2943:2: rule__BracketDelimitedLiteral__Group__2__Impl rule__BracketDelimitedLiteral__Group__3
            {
            pushFollow(FOLLOW_27);
            rule__BracketDelimitedLiteral__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BracketDelimitedLiteral__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BracketDelimitedLiteral__Group__2"


    // $ANTLR start "rule__BracketDelimitedLiteral__Group__2__Impl"
    // InternalRLS.g:2950:1: rule__BracketDelimitedLiteral__Group__2__Impl : ( ( rule__BracketDelimitedLiteral__SbAssignment_2 )* ) ;
    public final void rule__BracketDelimitedLiteral__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:2954:1: ( ( ( rule__BracketDelimitedLiteral__SbAssignment_2 )* ) )
            // InternalRLS.g:2955:1: ( ( rule__BracketDelimitedLiteral__SbAssignment_2 )* )
            {
            // InternalRLS.g:2955:1: ( ( rule__BracketDelimitedLiteral__SbAssignment_2 )* )
            // InternalRLS.g:2956:2: ( rule__BracketDelimitedLiteral__SbAssignment_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBracketDelimitedLiteralAccess().getSbAssignment_2()); 
            }
            // InternalRLS.g:2957:2: ( rule__BracketDelimitedLiteral__SbAssignment_2 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==RULE_UNBRACKET) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalRLS.g:2957:3: rule__BracketDelimitedLiteral__SbAssignment_2
            	    {
            	    pushFollow(FOLLOW_28);
            	    rule__BracketDelimitedLiteral__SbAssignment_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBracketDelimitedLiteralAccess().getSbAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BracketDelimitedLiteral__Group__2__Impl"


    // $ANTLR start "rule__BracketDelimitedLiteral__Group__3"
    // InternalRLS.g:2965:1: rule__BracketDelimitedLiteral__Group__3 : rule__BracketDelimitedLiteral__Group__3__Impl ;
    public final void rule__BracketDelimitedLiteral__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:2969:1: ( rule__BracketDelimitedLiteral__Group__3__Impl )
            // InternalRLS.g:2970:2: rule__BracketDelimitedLiteral__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BracketDelimitedLiteral__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BracketDelimitedLiteral__Group__3"


    // $ANTLR start "rule__BracketDelimitedLiteral__Group__3__Impl"
    // InternalRLS.g:2976:1: rule__BracketDelimitedLiteral__Group__3__Impl : ( ']' ) ;
    public final void rule__BracketDelimitedLiteral__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:2980:1: ( ( ']' ) )
            // InternalRLS.g:2981:1: ( ']' )
            {
            // InternalRLS.g:2981:1: ( ']' )
            // InternalRLS.g:2982:2: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBracketDelimitedLiteralAccess().getRightSquareBracketKeyword_3()); 
            }
            match(input,59,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBracketDelimitedLiteralAccess().getRightSquareBracketKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BracketDelimitedLiteral__Group__3__Impl"


    // $ANTLR start "rule__Arguments__Group__0"
    // InternalRLS.g:2992:1: rule__Arguments__Group__0 : rule__Arguments__Group__0__Impl rule__Arguments__Group__1 ;
    public final void rule__Arguments__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:2996:1: ( rule__Arguments__Group__0__Impl rule__Arguments__Group__1 )
            // InternalRLS.g:2997:2: rule__Arguments__Group__0__Impl rule__Arguments__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Arguments__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Arguments__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arguments__Group__0"


    // $ANTLR start "rule__Arguments__Group__0__Impl"
    // InternalRLS.g:3004:1: rule__Arguments__Group__0__Impl : ( () ) ;
    public final void rule__Arguments__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:3008:1: ( ( () ) )
            // InternalRLS.g:3009:1: ( () )
            {
            // InternalRLS.g:3009:1: ( () )
            // InternalRLS.g:3010:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArgumentsAccess().getArgumentsAction_0()); 
            }
            // InternalRLS.g:3011:2: ()
            // InternalRLS.g:3011:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getArgumentsAccess().getArgumentsAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arguments__Group__0__Impl"


    // $ANTLR start "rule__Arguments__Group__1"
    // InternalRLS.g:3019:1: rule__Arguments__Group__1 : rule__Arguments__Group__1__Impl rule__Arguments__Group__2 ;
    public final void rule__Arguments__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:3023:1: ( rule__Arguments__Group__1__Impl rule__Arguments__Group__2 )
            // InternalRLS.g:3024:2: rule__Arguments__Group__1__Impl rule__Arguments__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__Arguments__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Arguments__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arguments__Group__1"


    // $ANTLR start "rule__Arguments__Group__1__Impl"
    // InternalRLS.g:3031:1: rule__Arguments__Group__1__Impl : ( ( rule__Arguments__Alternatives_1 ) ) ;
    public final void rule__Arguments__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:3035:1: ( ( ( rule__Arguments__Alternatives_1 ) ) )
            // InternalRLS.g:3036:1: ( ( rule__Arguments__Alternatives_1 ) )
            {
            // InternalRLS.g:3036:1: ( ( rule__Arguments__Alternatives_1 ) )
            // InternalRLS.g:3037:2: ( rule__Arguments__Alternatives_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArgumentsAccess().getAlternatives_1()); 
            }
            // InternalRLS.g:3038:2: ( rule__Arguments__Alternatives_1 )
            // InternalRLS.g:3038:3: rule__Arguments__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__Arguments__Alternatives_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getArgumentsAccess().getAlternatives_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arguments__Group__1__Impl"


    // $ANTLR start "rule__Arguments__Group__2"
    // InternalRLS.g:3046:1: rule__Arguments__Group__2 : rule__Arguments__Group__2__Impl ;
    public final void rule__Arguments__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:3050:1: ( rule__Arguments__Group__2__Impl )
            // InternalRLS.g:3051:2: rule__Arguments__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Arguments__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arguments__Group__2"


    // $ANTLR start "rule__Arguments__Group__2__Impl"
    // InternalRLS.g:3057:1: rule__Arguments__Group__2__Impl : ( ( rule__Arguments__Group_2__0 ) ) ;
    public final void rule__Arguments__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:3061:1: ( ( ( rule__Arguments__Group_2__0 ) ) )
            // InternalRLS.g:3062:1: ( ( rule__Arguments__Group_2__0 ) )
            {
            // InternalRLS.g:3062:1: ( ( rule__Arguments__Group_2__0 ) )
            // InternalRLS.g:3063:2: ( rule__Arguments__Group_2__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArgumentsAccess().getGroup_2()); 
            }
            // InternalRLS.g:3064:2: ( rule__Arguments__Group_2__0 )
            // InternalRLS.g:3064:3: rule__Arguments__Group_2__0
            {
            pushFollow(FOLLOW_2);
            rule__Arguments__Group_2__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getArgumentsAccess().getGroup_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arguments__Group__2__Impl"


    // $ANTLR start "rule__Arguments__Group_2__0"
    // InternalRLS.g:3073:1: rule__Arguments__Group_2__0 : rule__Arguments__Group_2__0__Impl rule__Arguments__Group_2__1 ;
    public final void rule__Arguments__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:3077:1: ( rule__Arguments__Group_2__0__Impl rule__Arguments__Group_2__1 )
            // InternalRLS.g:3078:2: rule__Arguments__Group_2__0__Impl rule__Arguments__Group_2__1
            {
            pushFollow(FOLLOW_12);
            rule__Arguments__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Arguments__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arguments__Group_2__0"


    // $ANTLR start "rule__Arguments__Group_2__0__Impl"
    // InternalRLS.g:3085:1: rule__Arguments__Group_2__0__Impl : ( RULE_COMMA ) ;
    public final void rule__Arguments__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:3089:1: ( ( RULE_COMMA ) )
            // InternalRLS.g:3090:1: ( RULE_COMMA )
            {
            // InternalRLS.g:3090:1: ( RULE_COMMA )
            // InternalRLS.g:3091:2: RULE_COMMA
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArgumentsAccess().getCOMMATerminalRuleCall_2_0()); 
            }
            match(input,RULE_COMMA,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArgumentsAccess().getCOMMATerminalRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arguments__Group_2__0__Impl"


    // $ANTLR start "rule__Arguments__Group_2__1"
    // InternalRLS.g:3100:1: rule__Arguments__Group_2__1 : rule__Arguments__Group_2__1__Impl ;
    public final void rule__Arguments__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:3104:1: ( rule__Arguments__Group_2__1__Impl )
            // InternalRLS.g:3105:2: rule__Arguments__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Arguments__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arguments__Group_2__1"


    // $ANTLR start "rule__Arguments__Group_2__1__Impl"
    // InternalRLS.g:3111:1: rule__Arguments__Group_2__1__Impl : ( ( rule__Arguments__SAssignment_2_1 ) ) ;
    public final void rule__Arguments__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:3115:1: ( ( ( rule__Arguments__SAssignment_2_1 ) ) )
            // InternalRLS.g:3116:1: ( ( rule__Arguments__SAssignment_2_1 ) )
            {
            // InternalRLS.g:3116:1: ( ( rule__Arguments__SAssignment_2_1 ) )
            // InternalRLS.g:3117:2: ( rule__Arguments__SAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArgumentsAccess().getSAssignment_2_1()); 
            }
            // InternalRLS.g:3118:2: ( rule__Arguments__SAssignment_2_1 )
            // InternalRLS.g:3118:3: rule__Arguments__SAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Arguments__SAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getArgumentsAccess().getSAssignment_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arguments__Group_2__1__Impl"


    // $ANTLR start "rule__Model__BAssignment_1"
    // InternalRLS.g:3127:1: rule__Model__BAssignment_1 : ( ruleBase ) ;
    public final void rule__Model__BAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:3131:1: ( ( ruleBase ) )
            // InternalRLS.g:3132:2: ( ruleBase )
            {
            // InternalRLS.g:3132:2: ( ruleBase )
            // InternalRLS.g:3133:3: ruleBase
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getBBaseParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleBase();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getBBaseParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__BAssignment_1"


    // $ANTLR start "rule__Model__PAssignment_2"
    // InternalRLS.g:3142:1: rule__Model__PAssignment_2 : ( rulePrefix ) ;
    public final void rule__Model__PAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:3146:1: ( ( rulePrefix ) )
            // InternalRLS.g:3147:2: ( rulePrefix )
            {
            // InternalRLS.g:3147:2: ( rulePrefix )
            // InternalRLS.g:3148:3: rulePrefix
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getPPrefixParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            rulePrefix();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getPPrefixParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__PAssignment_2"


    // $ANTLR start "rule__Model__SAssignment_3"
    // InternalRLS.g:3157:1: rule__Model__SAssignment_3 : ( ruleSource ) ;
    public final void rule__Model__SAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:3161:1: ( ( ruleSource ) )
            // InternalRLS.g:3162:2: ( ruleSource )
            {
            // InternalRLS.g:3162:2: ( ruleSource )
            // InternalRLS.g:3163:3: ruleSource
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getSSourceParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleSource();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getSSourceParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__SAssignment_3"


    // $ANTLR start "rule__Model__StAssignment_4"
    // InternalRLS.g:3172:1: rule__Model__StAssignment_4 : ( ruleStatement ) ;
    public final void rule__Model__StAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:3176:1: ( ( ruleStatement ) )
            // InternalRLS.g:3177:2: ( ruleStatement )
            {
            // InternalRLS.g:3177:2: ( ruleStatement )
            // InternalRLS.g:3178:3: ruleStatement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getStStatementParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getStStatementParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__StAssignment_4"


    // $ANTLR start "rule__PrefixedName__TAssignment"
    // InternalRLS.g:3187:1: rule__PrefixedName__TAssignment : ( RULE_PNAME_LN ) ;
    public final void rule__PrefixedName__TAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:3191:1: ( ( RULE_PNAME_LN ) )
            // InternalRLS.g:3192:2: ( RULE_PNAME_LN )
            {
            // InternalRLS.g:3192:2: ( RULE_PNAME_LN )
            // InternalRLS.g:3193:3: RULE_PNAME_LN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrefixedNameAccess().getTPNAME_LNTerminalRuleCall_0()); 
            }
            match(input,RULE_PNAME_LN,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrefixedNameAccess().getTPNAME_LNTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrefixedName__TAssignment"


    // $ANTLR start "rule__IRIREF__TAssignment"
    // InternalRLS.g:3202:1: rule__IRIREF__TAssignment : ( RULE_IRI ) ;
    public final void rule__IRIREF__TAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:3206:1: ( ( RULE_IRI ) )
            // InternalRLS.g:3207:2: ( RULE_IRI )
            {
            // InternalRLS.g:3207:2: ( RULE_IRI )
            // InternalRLS.g:3208:3: RULE_IRI
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIRIREFAccess().getTIRITerminalRuleCall_0()); 
            }
            match(input,RULE_IRI,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIRIREFAccess().getTIRITerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IRIREF__TAssignment"


    // $ANTLR start "rule__IRIBOL__TAssignment_0"
    // InternalRLS.g:3217:1: rule__IRIBOL__TAssignment_0 : ( ruleIRIREF ) ;
    public final void rule__IRIBOL__TAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:3221:1: ( ( ruleIRIREF ) )
            // InternalRLS.g:3222:2: ( ruleIRIREF )
            {
            // InternalRLS.g:3222:2: ( ruleIRIREF )
            // InternalRLS.g:3223:3: ruleIRIREF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIRIBOLAccess().getTIRIREFParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleIRIREF();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIRIBOLAccess().getTIRIREFParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IRIBOL__TAssignment_0"


    // $ANTLR start "rule__IRIBOL__TAssignment_1"
    // InternalRLS.g:3232:1: rule__IRIBOL__TAssignment_1 : ( rulePrefixedName ) ;
    public final void rule__IRIBOL__TAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:3236:1: ( ( rulePrefixedName ) )
            // InternalRLS.g:3237:2: ( rulePrefixedName )
            {
            // InternalRLS.g:3237:2: ( rulePrefixedName )
            // InternalRLS.g:3238:3: rulePrefixedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIRIBOLAccess().getTPrefixedNameParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            rulePrefixedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIRIBOLAccess().getTPrefixedNameParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IRIBOL__TAssignment_1"


    // $ANTLR start "rule__Striing__TAssignment_0"
    // InternalRLS.g:3247:1: rule__Striing__TAssignment_0 : ( RULE_STRING_LITERAL1 ) ;
    public final void rule__Striing__TAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:3251:1: ( ( RULE_STRING_LITERAL1 ) )
            // InternalRLS.g:3252:2: ( RULE_STRING_LITERAL1 )
            {
            // InternalRLS.g:3252:2: ( RULE_STRING_LITERAL1 )
            // InternalRLS.g:3253:3: RULE_STRING_LITERAL1
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStriingAccess().getTSTRING_LITERAL1TerminalRuleCall_0_0()); 
            }
            match(input,RULE_STRING_LITERAL1,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStriingAccess().getTSTRING_LITERAL1TerminalRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Striing__TAssignment_0"


    // $ANTLR start "rule__Striing__TAssignment_1"
    // InternalRLS.g:3262:1: rule__Striing__TAssignment_1 : ( RULE_STRING_LITERAL2 ) ;
    public final void rule__Striing__TAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:3266:1: ( ( RULE_STRING_LITERAL2 ) )
            // InternalRLS.g:3267:2: ( RULE_STRING_LITERAL2 )
            {
            // InternalRLS.g:3267:2: ( RULE_STRING_LITERAL2 )
            // InternalRLS.g:3268:3: RULE_STRING_LITERAL2
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStriingAccess().getTSTRING_LITERAL2TerminalRuleCall_1_0()); 
            }
            match(input,RULE_STRING_LITERAL2,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStriingAccess().getTSTRING_LITERAL2TerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Striing__TAssignment_1"


    // $ANTLR start "rule__Striing__TAssignment_2"
    // InternalRLS.g:3277:1: rule__Striing__TAssignment_2 : ( RULE_STRING_LITERAL_LONG1 ) ;
    public final void rule__Striing__TAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:3281:1: ( ( RULE_STRING_LITERAL_LONG1 ) )
            // InternalRLS.g:3282:2: ( RULE_STRING_LITERAL_LONG1 )
            {
            // InternalRLS.g:3282:2: ( RULE_STRING_LITERAL_LONG1 )
            // InternalRLS.g:3283:3: RULE_STRING_LITERAL_LONG1
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStriingAccess().getTSTRING_LITERAL_LONG1TerminalRuleCall_2_0()); 
            }
            match(input,RULE_STRING_LITERAL_LONG1,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStriingAccess().getTSTRING_LITERAL_LONG1TerminalRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Striing__TAssignment_2"


    // $ANTLR start "rule__Striing__TAssignment_3"
    // InternalRLS.g:3292:1: rule__Striing__TAssignment_3 : ( RULE_STRING_LITERAL_LONG2 ) ;
    public final void rule__Striing__TAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:3296:1: ( ( RULE_STRING_LITERAL_LONG2 ) )
            // InternalRLS.g:3297:2: ( RULE_STRING_LITERAL_LONG2 )
            {
            // InternalRLS.g:3297:2: ( RULE_STRING_LITERAL_LONG2 )
            // InternalRLS.g:3298:3: RULE_STRING_LITERAL_LONG2
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStriingAccess().getTSTRING_LITERAL_LONG2TerminalRuleCall_3_0()); 
            }
            match(input,RULE_STRING_LITERAL_LONG2,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStriingAccess().getTSTRING_LITERAL_LONG2TerminalRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Striing__TAssignment_3"


    // $ANTLR start "rule__Langtagg__TAssignment"
    // InternalRLS.g:3307:1: rule__Langtagg__TAssignment : ( RULE_LANGTAG ) ;
    public final void rule__Langtagg__TAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:3311:1: ( ( RULE_LANGTAG ) )
            // InternalRLS.g:3312:2: ( RULE_LANGTAG )
            {
            // InternalRLS.g:3312:2: ( RULE_LANGTAG )
            // InternalRLS.g:3313:3: RULE_LANGTAG
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLangtaggAccess().getTLANGTAGTerminalRuleCall_0()); 
            }
            match(input,RULE_LANGTAG,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLangtaggAccess().getTLANGTAGTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Langtagg__TAssignment"


    // $ANTLR start "rule__RDFLiteral__SAssignment_0"
    // InternalRLS.g:3322:1: rule__RDFLiteral__SAssignment_0 : ( ruleStriing ) ;
    public final void rule__RDFLiteral__SAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:3326:1: ( ( ruleStriing ) )
            // InternalRLS.g:3327:2: ( ruleStriing )
            {
            // InternalRLS.g:3327:2: ( ruleStriing )
            // InternalRLS.g:3328:3: ruleStriing
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRDFLiteralAccess().getSStriingParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleStriing();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRDFLiteralAccess().getSStriingParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RDFLiteral__SAssignment_0"


    // $ANTLR start "rule__RDFLiteral__LAssignment_1_0"
    // InternalRLS.g:3337:1: rule__RDFLiteral__LAssignment_1_0 : ( ruleLangtagg ) ;
    public final void rule__RDFLiteral__LAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:3341:1: ( ( ruleLangtagg ) )
            // InternalRLS.g:3342:2: ( ruleLangtagg )
            {
            // InternalRLS.g:3342:2: ( ruleLangtagg )
            // InternalRLS.g:3343:3: ruleLangtagg
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRDFLiteralAccess().getLLangtaggParserRuleCall_1_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleLangtagg();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRDFLiteralAccess().getLLangtaggParserRuleCall_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RDFLiteral__LAssignment_1_0"


    // $ANTLR start "rule__RDFLiteral__DtAssignment_1_1_1"
    // InternalRLS.g:3352:1: rule__RDFLiteral__DtAssignment_1_1_1 : ( ruleIRIBOL ) ;
    public final void rule__RDFLiteral__DtAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:3356:1: ( ( ruleIRIBOL ) )
            // InternalRLS.g:3357:2: ( ruleIRIBOL )
            {
            // InternalRLS.g:3357:2: ( ruleIRIBOL )
            // InternalRLS.g:3358:3: ruleIRIBOL
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRDFLiteralAccess().getDtIRIBOLParserRuleCall_1_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleIRIBOL();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRDFLiteralAccess().getDtIRIBOLParserRuleCall_1_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RDFLiteral__DtAssignment_1_1_1"


    // $ANTLR start "rule__NumericLiteral__TAssignment_0"
    // InternalRLS.g:3367:1: rule__NumericLiteral__TAssignment_0 : ( RULE_INTEGER ) ;
    public final void rule__NumericLiteral__TAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:3371:1: ( ( RULE_INTEGER ) )
            // InternalRLS.g:3372:2: ( RULE_INTEGER )
            {
            // InternalRLS.g:3372:2: ( RULE_INTEGER )
            // InternalRLS.g:3373:3: RULE_INTEGER
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumericLiteralAccess().getTINTEGERTerminalRuleCall_0_0()); 
            }
            match(input,RULE_INTEGER,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNumericLiteralAccess().getTINTEGERTerminalRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumericLiteral__TAssignment_0"


    // $ANTLR start "rule__NumericLiteral__TAssignment_1"
    // InternalRLS.g:3382:1: rule__NumericLiteral__TAssignment_1 : ( RULE_DECIMAL ) ;
    public final void rule__NumericLiteral__TAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:3386:1: ( ( RULE_DECIMAL ) )
            // InternalRLS.g:3387:2: ( RULE_DECIMAL )
            {
            // InternalRLS.g:3387:2: ( RULE_DECIMAL )
            // InternalRLS.g:3388:3: RULE_DECIMAL
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumericLiteralAccess().getTDECIMALTerminalRuleCall_1_0()); 
            }
            match(input,RULE_DECIMAL,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNumericLiteralAccess().getTDECIMALTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumericLiteral__TAssignment_1"


    // $ANTLR start "rule__NumericLiteral__TAssignment_2"
    // InternalRLS.g:3397:1: rule__NumericLiteral__TAssignment_2 : ( RULE_DOUBLE ) ;
    public final void rule__NumericLiteral__TAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:3401:1: ( ( RULE_DOUBLE ) )
            // InternalRLS.g:3402:2: ( RULE_DOUBLE )
            {
            // InternalRLS.g:3402:2: ( RULE_DOUBLE )
            // InternalRLS.g:3403:3: RULE_DOUBLE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumericLiteralAccess().getTDOUBLETerminalRuleCall_2_0()); 
            }
            match(input,RULE_DOUBLE,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNumericLiteralAccess().getTDOUBLETerminalRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumericLiteral__TAssignment_2"


    // $ANTLR start "rule__Term__SAssignment_0"
    // InternalRLS.g:3412:1: rule__Term__SAssignment_0 : ( ruleIRIBOL ) ;
    public final void rule__Term__SAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:3416:1: ( ( ruleIRIBOL ) )
            // InternalRLS.g:3417:2: ( ruleIRIBOL )
            {
            // InternalRLS.g:3417:2: ( ruleIRIBOL )
            // InternalRLS.g:3418:3: ruleIRIBOL
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTermAccess().getSIRIBOLParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleIRIBOL();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTermAccess().getSIRIBOLParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__SAssignment_0"


    // $ANTLR start "rule__Term__CAssignment_1"
    // InternalRLS.g:3427:1: rule__Term__CAssignment_1 : ( ruleNumericLiteral ) ;
    public final void rule__Term__CAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:3431:1: ( ( ruleNumericLiteral ) )
            // InternalRLS.g:3432:2: ( ruleNumericLiteral )
            {
            // InternalRLS.g:3432:2: ( ruleNumericLiteral )
            // InternalRLS.g:3433:3: ruleNumericLiteral
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTermAccess().getCNumericLiteralParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleNumericLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTermAccess().getCNumericLiteralParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__CAssignment_1"


    // $ANTLR start "rule__Term__SAssignment_2"
    // InternalRLS.g:3442:1: rule__Term__SAssignment_2 : ( ruleRDFLiteral ) ;
    public final void rule__Term__SAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:3446:1: ( ( ruleRDFLiteral ) )
            // InternalRLS.g:3447:2: ( ruleRDFLiteral )
            {
            // InternalRLS.g:3447:2: ( ruleRDFLiteral )
            // InternalRLS.g:3448:3: ruleRDFLiteral
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTermAccess().getSRDFLiteralParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleRDFLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTermAccess().getSRDFLiteralParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__SAssignment_2"


    // $ANTLR start "rule__Term__TAssignment_3"
    // InternalRLS.g:3457:1: rule__Term__TAssignment_3 : ( RULE_UNIVAR ) ;
    public final void rule__Term__TAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:3461:1: ( ( RULE_UNIVAR ) )
            // InternalRLS.g:3462:2: ( RULE_UNIVAR )
            {
            // InternalRLS.g:3462:2: ( RULE_UNIVAR )
            // InternalRLS.g:3463:3: RULE_UNIVAR
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTermAccess().getTUNIVARTerminalRuleCall_3_0()); 
            }
            match(input,RULE_UNIVAR,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTermAccess().getTUNIVARTerminalRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__TAssignment_3"


    // $ANTLR start "rule__Term__TAssignment_4"
    // InternalRLS.g:3472:1: rule__Term__TAssignment_4 : ( RULE_EXIVAR ) ;
    public final void rule__Term__TAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:3476:1: ( ( RULE_EXIVAR ) )
            // InternalRLS.g:3477:2: ( RULE_EXIVAR )
            {
            // InternalRLS.g:3477:2: ( RULE_EXIVAR )
            // InternalRLS.g:3478:3: RULE_EXIVAR
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTermAccess().getTEXIVARTerminalRuleCall_4_0()); 
            }
            match(input,RULE_EXIVAR,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTermAccess().getTEXIVARTerminalRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__TAssignment_4"


    // $ANTLR start "rule__Term__TAssignment_5"
    // InternalRLS.g:3487:1: rule__Term__TAssignment_5 : ( RULE_VARORPREDNAME ) ;
    public final void rule__Term__TAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:3491:1: ( ( RULE_VARORPREDNAME ) )
            // InternalRLS.g:3492:2: ( RULE_VARORPREDNAME )
            {
            // InternalRLS.g:3492:2: ( RULE_VARORPREDNAME )
            // InternalRLS.g:3493:3: RULE_VARORPREDNAME
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTermAccess().getTVARORPREDNAMETerminalRuleCall_5_0()); 
            }
            match(input,RULE_VARORPREDNAME,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTermAccess().getTVARORPREDNAMETerminalRuleCall_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__TAssignment_5"


    // $ANTLR start "rule__Term__TAssignment_6"
    // InternalRLS.g:3502:1: rule__Term__TAssignment_6 : ( RULE_NAMED_NULL ) ;
    public final void rule__Term__TAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:3506:1: ( ( RULE_NAMED_NULL ) )
            // InternalRLS.g:3507:2: ( RULE_NAMED_NULL )
            {
            // InternalRLS.g:3507:2: ( RULE_NAMED_NULL )
            // InternalRLS.g:3508:3: RULE_NAMED_NULL
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTermAccess().getTNAMED_NULLTerminalRuleCall_6_0()); 
            }
            match(input,RULE_NAMED_NULL,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTermAccess().getTNAMED_NULLTerminalRuleCall_6_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__TAssignment_6"


    // $ANTLR start "rule__Term__TtAssignment_7"
    // InternalRLS.g:3517:1: rule__Term__TtAssignment_7 : ( ruleConfigurable_Literal ) ;
    public final void rule__Term__TtAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:3521:1: ( ( ruleConfigurable_Literal ) )
            // InternalRLS.g:3522:2: ( ruleConfigurable_Literal )
            {
            // InternalRLS.g:3522:2: ( ruleConfigurable_Literal )
            // InternalRLS.g:3523:3: ruleConfigurable_Literal
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTermAccess().getTtConfigurable_LiteralParserRuleCall_7_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleConfigurable_Literal();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTermAccess().getTtConfigurable_LiteralParserRuleCall_7_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__TtAssignment_7"


    // $ANTLR start "rule__PredicateName__SAssignment_0"
    // InternalRLS.g:3532:1: rule__PredicateName__SAssignment_0 : ( ruleIRIBOL ) ;
    public final void rule__PredicateName__SAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:3536:1: ( ( ruleIRIBOL ) )
            // InternalRLS.g:3537:2: ( ruleIRIBOL )
            {
            // InternalRLS.g:3537:2: ( ruleIRIBOL )
            // InternalRLS.g:3538:3: ruleIRIBOL
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPredicateNameAccess().getSIRIBOLParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleIRIBOL();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPredicateNameAccess().getSIRIBOLParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicateName__SAssignment_0"


    // $ANTLR start "rule__PredicateName__TAssignment_1"
    // InternalRLS.g:3547:1: rule__PredicateName__TAssignment_1 : ( RULE_VARORPREDNAME ) ;
    public final void rule__PredicateName__TAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:3551:1: ( ( RULE_VARORPREDNAME ) )
            // InternalRLS.g:3552:2: ( RULE_VARORPREDNAME )
            {
            // InternalRLS.g:3552:2: ( RULE_VARORPREDNAME )
            // InternalRLS.g:3553:3: RULE_VARORPREDNAME
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPredicateNameAccess().getTVARORPREDNAMETerminalRuleCall_1_0()); 
            }
            match(input,RULE_VARORPREDNAME,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPredicateNameAccess().getTVARORPREDNAMETerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicateName__TAssignment_1"


    // $ANTLR start "rule__ListOfTerms__TAssignment_0"
    // InternalRLS.g:3562:1: rule__ListOfTerms__TAssignment_0 : ( ruleTerm ) ;
    public final void rule__ListOfTerms__TAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:3566:1: ( ( ruleTerm ) )
            // InternalRLS.g:3567:2: ( ruleTerm )
            {
            // InternalRLS.g:3567:2: ( ruleTerm )
            // InternalRLS.g:3568:3: ruleTerm
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListOfTermsAccess().getTTermParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleTerm();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getListOfTermsAccess().getTTermParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListOfTerms__TAssignment_0"


    // $ANTLR start "rule__ListOfTerms__TAssignment_1_1"
    // InternalRLS.g:3577:1: rule__ListOfTerms__TAssignment_1_1 : ( ruleTerm ) ;
    public final void rule__ListOfTerms__TAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:3581:1: ( ( ruleTerm ) )
            // InternalRLS.g:3582:2: ( ruleTerm )
            {
            // InternalRLS.g:3582:2: ( ruleTerm )
            // InternalRLS.g:3583:3: ruleTerm
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListOfTermsAccess().getTTermParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleTerm();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getListOfTermsAccess().getTTermParserRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListOfTerms__TAssignment_1_1"


    // $ANTLR start "rule__NegativeLiteral__PredicatenameAssignment_1"
    // InternalRLS.g:3592:1: rule__NegativeLiteral__PredicatenameAssignment_1 : ( rulepredicateName ) ;
    public final void rule__NegativeLiteral__PredicatenameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:3596:1: ( ( rulepredicateName ) )
            // InternalRLS.g:3597:2: ( rulepredicateName )
            {
            // InternalRLS.g:3597:2: ( rulepredicateName )
            // InternalRLS.g:3598:3: rulepredicateName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegativeLiteralAccess().getPredicatenamePredicateNameParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            rulepredicateName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNegativeLiteralAccess().getPredicatenamePredicateNameParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NegativeLiteral__PredicatenameAssignment_1"


    // $ANTLR start "rule__NegativeLiteral__TermsAssignment_3"
    // InternalRLS.g:3607:1: rule__NegativeLiteral__TermsAssignment_3 : ( rulelistOfTerms ) ;
    public final void rule__NegativeLiteral__TermsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:3611:1: ( ( rulelistOfTerms ) )
            // InternalRLS.g:3612:2: ( rulelistOfTerms )
            {
            // InternalRLS.g:3612:2: ( rulelistOfTerms )
            // InternalRLS.g:3613:3: rulelistOfTerms
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegativeLiteralAccess().getTermsListOfTermsParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            rulelistOfTerms();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNegativeLiteralAccess().getTermsListOfTermsParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NegativeLiteral__TermsAssignment_3"


    // $ANTLR start "rule__Fact__PredicatenameAssignment_0"
    // InternalRLS.g:3622:1: rule__Fact__PredicatenameAssignment_0 : ( rulepredicateName ) ;
    public final void rule__Fact__PredicatenameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:3626:1: ( ( rulepredicateName ) )
            // InternalRLS.g:3627:2: ( rulepredicateName )
            {
            // InternalRLS.g:3627:2: ( rulepredicateName )
            // InternalRLS.g:3628:3: rulepredicateName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFactAccess().getPredicatenamePredicateNameParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            rulepredicateName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFactAccess().getPredicatenamePredicateNameParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fact__PredicatenameAssignment_0"


    // $ANTLR start "rule__Fact__TermsAssignment_2"
    // InternalRLS.g:3637:1: rule__Fact__TermsAssignment_2 : ( rulelistOfTerms ) ;
    public final void rule__Fact__TermsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:3641:1: ( ( rulelistOfTerms ) )
            // InternalRLS.g:3642:2: ( rulelistOfTerms )
            {
            // InternalRLS.g:3642:2: ( rulelistOfTerms )
            // InternalRLS.g:3643:3: rulelistOfTerms
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFactAccess().getTermsListOfTermsParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            rulelistOfTerms();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFactAccess().getTermsListOfTermsParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fact__TermsAssignment_2"


    // $ANTLR start "rule__PositiveLiteral__PredicatenameAssignment_0"
    // InternalRLS.g:3652:1: rule__PositiveLiteral__PredicatenameAssignment_0 : ( rulepredicateName ) ;
    public final void rule__PositiveLiteral__PredicatenameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:3656:1: ( ( rulepredicateName ) )
            // InternalRLS.g:3657:2: ( rulepredicateName )
            {
            // InternalRLS.g:3657:2: ( rulepredicateName )
            // InternalRLS.g:3658:3: rulepredicateName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPositiveLiteralAccess().getPredicatenamePredicateNameParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            rulepredicateName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPositiveLiteralAccess().getPredicatenamePredicateNameParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PositiveLiteral__PredicatenameAssignment_0"


    // $ANTLR start "rule__PositiveLiteral__TermsAssignment_2"
    // InternalRLS.g:3667:1: rule__PositiveLiteral__TermsAssignment_2 : ( rulelistOfTerms ) ;
    public final void rule__PositiveLiteral__TermsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:3671:1: ( ( rulelistOfTerms ) )
            // InternalRLS.g:3672:2: ( rulelistOfTerms )
            {
            // InternalRLS.g:3672:2: ( rulelistOfTerms )
            // InternalRLS.g:3673:3: rulelistOfTerms
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPositiveLiteralAccess().getTermsListOfTermsParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            rulelistOfTerms();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPositiveLiteralAccess().getTermsListOfTermsParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PositiveLiteral__TermsAssignment_2"


    // $ANTLR start "rule__ListOfLiterals__LAssignment_0"
    // InternalRLS.g:3682:1: rule__ListOfLiterals__LAssignment_0 : ( ruleLiteral ) ;
    public final void rule__ListOfLiterals__LAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:3686:1: ( ( ruleLiteral ) )
            // InternalRLS.g:3687:2: ( ruleLiteral )
            {
            // InternalRLS.g:3687:2: ( ruleLiteral )
            // InternalRLS.g:3688:3: ruleLiteral
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListOfLiteralsAccess().getLLiteralParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getListOfLiteralsAccess().getLLiteralParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListOfLiterals__LAssignment_0"


    // $ANTLR start "rule__ListOfLiterals__LAssignment_1_1"
    // InternalRLS.g:3697:1: rule__ListOfLiterals__LAssignment_1_1 : ( ruleLiteral ) ;
    public final void rule__ListOfLiterals__LAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:3701:1: ( ( ruleLiteral ) )
            // InternalRLS.g:3702:2: ( ruleLiteral )
            {
            // InternalRLS.g:3702:2: ( ruleLiteral )
            // InternalRLS.g:3703:3: ruleLiteral
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListOfLiteralsAccess().getLLiteralParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getListOfLiteralsAccess().getLLiteralParserRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListOfLiterals__LAssignment_1_1"


    // $ANTLR start "rule__ListOfPositiveLiterals__LAssignment_0"
    // InternalRLS.g:3712:1: rule__ListOfPositiveLiterals__LAssignment_0 : ( rulePositiveLiteral ) ;
    public final void rule__ListOfPositiveLiterals__LAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:3716:1: ( ( rulePositiveLiteral ) )
            // InternalRLS.g:3717:2: ( rulePositiveLiteral )
            {
            // InternalRLS.g:3717:2: ( rulePositiveLiteral )
            // InternalRLS.g:3718:3: rulePositiveLiteral
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListOfPositiveLiteralsAccess().getLPositiveLiteralParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            rulePositiveLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getListOfPositiveLiteralsAccess().getLPositiveLiteralParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListOfPositiveLiterals__LAssignment_0"


    // $ANTLR start "rule__ListOfPositiveLiterals__LAssignment_1_1"
    // InternalRLS.g:3727:1: rule__ListOfPositiveLiterals__LAssignment_1_1 : ( rulePositiveLiteral ) ;
    public final void rule__ListOfPositiveLiterals__LAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:3731:1: ( ( rulePositiveLiteral ) )
            // InternalRLS.g:3732:2: ( rulePositiveLiteral )
            {
            // InternalRLS.g:3732:2: ( rulePositiveLiteral )
            // InternalRLS.g:3733:3: rulePositiveLiteral
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListOfPositiveLiteralsAccess().getLPositiveLiteralParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            rulePositiveLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getListOfPositiveLiteralsAccess().getLPositiveLiteralParserRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListOfPositiveLiterals__LAssignment_1_1"


    // $ANTLR start "rule__Rule__HeadAssignment_0"
    // InternalRLS.g:3742:1: rule__Rule__HeadAssignment_0 : ( rulelistOfPositiveLiterals ) ;
    public final void rule__Rule__HeadAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:3746:1: ( ( rulelistOfPositiveLiterals ) )
            // InternalRLS.g:3747:2: ( rulelistOfPositiveLiterals )
            {
            // InternalRLS.g:3747:2: ( rulelistOfPositiveLiterals )
            // InternalRLS.g:3748:3: rulelistOfPositiveLiterals
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleAccess().getHeadListOfPositiveLiteralsParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            rulelistOfPositiveLiterals();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuleAccess().getHeadListOfPositiveLiteralsParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__HeadAssignment_0"


    // $ANTLR start "rule__Rule__BodyAssignment_2"
    // InternalRLS.g:3757:1: rule__Rule__BodyAssignment_2 : ( rulelistOfLiterals ) ;
    public final void rule__Rule__BodyAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:3761:1: ( ( rulelistOfLiterals ) )
            // InternalRLS.g:3762:2: ( rulelistOfLiterals )
            {
            // InternalRLS.g:3762:2: ( rulelistOfLiterals )
            // InternalRLS.g:3763:3: rulelistOfLiterals
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleAccess().getBodyListOfLiteralsParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            rulelistOfLiterals();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuleAccess().getBodyListOfLiteralsParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__BodyAssignment_2"


    // $ANTLR start "rule__Statement__StatementAssignment_0"
    // InternalRLS.g:3772:1: rule__Statement__StatementAssignment_0 : ( ruleRule ) ;
    public final void rule__Statement__StatementAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:3776:1: ( ( ruleRule ) )
            // InternalRLS.g:3777:2: ( ruleRule )
            {
            // InternalRLS.g:3777:2: ( ruleRule )
            // InternalRLS.g:3778:3: ruleRule
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getStatementRuleParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleRule();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getStatementRuleParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__StatementAssignment_0"


    // $ANTLR start "rule__Statement__StatementAssignment_1_0"
    // InternalRLS.g:3787:1: rule__Statement__StatementAssignment_1_0 : ( ruleFact ) ;
    public final void rule__Statement__StatementAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:3791:1: ( ( ruleFact ) )
            // InternalRLS.g:3792:2: ( ruleFact )
            {
            // InternalRLS.g:3792:2: ( ruleFact )
            // InternalRLS.g:3793:3: ruleFact
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getStatementFactParserRuleCall_1_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleFact();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getStatementFactParserRuleCall_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__StatementAssignment_1_0"


    // $ANTLR start "rule__DataSource__SourceNameAssignment_0_0"
    // InternalRLS.g:3802:1: rule__DataSource__SourceNameAssignment_0_0 : ( RULE_DIRECTIVENAME ) ;
    public final void rule__DataSource__SourceNameAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:3806:1: ( ( RULE_DIRECTIVENAME ) )
            // InternalRLS.g:3807:2: ( RULE_DIRECTIVENAME )
            {
            // InternalRLS.g:3807:2: ( RULE_DIRECTIVENAME )
            // InternalRLS.g:3808:3: RULE_DIRECTIVENAME
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDataSourceAccess().getSourceNameDIRECTIVENAMETerminalRuleCall_0_0_0()); 
            }
            match(input,RULE_DIRECTIVENAME,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDataSourceAccess().getSourceNameDIRECTIVENAMETerminalRuleCall_0_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSource__SourceNameAssignment_0_0"


    // $ANTLR start "rule__DataSource__SourceNameAssignment_0_1"
    // InternalRLS.g:3817:1: rule__DataSource__SourceNameAssignment_0_1 : ( RULE_VARORPREDNAME ) ;
    public final void rule__DataSource__SourceNameAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:3821:1: ( ( RULE_VARORPREDNAME ) )
            // InternalRLS.g:3822:2: ( RULE_VARORPREDNAME )
            {
            // InternalRLS.g:3822:2: ( RULE_VARORPREDNAME )
            // InternalRLS.g:3823:3: RULE_VARORPREDNAME
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDataSourceAccess().getSourceNameVARORPREDNAMETerminalRuleCall_0_1_0()); 
            }
            match(input,RULE_VARORPREDNAME,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDataSourceAccess().getSourceNameVARORPREDNAMETerminalRuleCall_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSource__SourceNameAssignment_0_1"


    // $ANTLR start "rule__DataSource__ArgAssignment_2"
    // InternalRLS.g:3832:1: rule__DataSource__ArgAssignment_2 : ( ruleArguments ) ;
    public final void rule__DataSource__ArgAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:3836:1: ( ( ruleArguments ) )
            // InternalRLS.g:3837:2: ( ruleArguments )
            {
            // InternalRLS.g:3837:2: ( ruleArguments )
            // InternalRLS.g:3838:3: ruleArguments
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDataSourceAccess().getArgArgumentsParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleArguments();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDataSourceAccess().getArgArgumentsParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSource__ArgAssignment_2"


    // $ANTLR start "rule__Source__PredicatenameAssignment_1"
    // InternalRLS.g:3847:1: rule__Source__PredicatenameAssignment_1 : ( rulepredicateName ) ;
    public final void rule__Source__PredicatenameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:3851:1: ( ( rulepredicateName ) )
            // InternalRLS.g:3852:2: ( rulepredicateName )
            {
            // InternalRLS.g:3852:2: ( rulepredicateName )
            // InternalRLS.g:3853:3: rulepredicateName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSourceAccess().getPredicatenamePredicateNameParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            rulepredicateName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSourceAccess().getPredicatenamePredicateNameParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source__PredicatenameAssignment_1"


    // $ANTLR start "rule__Source__ArityAssignment_2"
    // InternalRLS.g:3862:1: rule__Source__ArityAssignment_2 : ( RULE_ARITY ) ;
    public final void rule__Source__ArityAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:3866:1: ( ( RULE_ARITY ) )
            // InternalRLS.g:3867:2: ( RULE_ARITY )
            {
            // InternalRLS.g:3867:2: ( RULE_ARITY )
            // InternalRLS.g:3868:3: RULE_ARITY
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSourceAccess().getArityARITYTerminalRuleCall_2_0()); 
            }
            match(input,RULE_ARITY,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSourceAccess().getArityARITYTerminalRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source__ArityAssignment_2"


    // $ANTLR start "rule__Source__DataSourceAssignment_4"
    // InternalRLS.g:3877:1: rule__Source__DataSourceAssignment_4 : ( ruleDataSource ) ;
    public final void rule__Source__DataSourceAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:3881:1: ( ( ruleDataSource ) )
            // InternalRLS.g:3882:2: ( ruleDataSource )
            {
            // InternalRLS.g:3882:2: ( ruleDataSource )
            // InternalRLS.g:3883:3: ruleDataSource
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSourceAccess().getDataSourceDataSourceParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleDataSource();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSourceAccess().getDataSourceDataSourceParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source__DataSourceAssignment_4"


    // $ANTLR start "rule__Prefix__TAssignment_0_1"
    // InternalRLS.g:3892:1: rule__Prefix__TAssignment_0_1 : ( RULE_COLON ) ;
    public final void rule__Prefix__TAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:3896:1: ( ( RULE_COLON ) )
            // InternalRLS.g:3897:2: ( RULE_COLON )
            {
            // InternalRLS.g:3897:2: ( RULE_COLON )
            // InternalRLS.g:3898:3: RULE_COLON
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrefixAccess().getTCOLONTerminalRuleCall_0_1_0()); 
            }
            match(input,RULE_COLON,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrefixAccess().getTCOLONTerminalRuleCall_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Prefix__TAssignment_0_1"


    // $ANTLR start "rule__Prefix__IriStringAssignment_0_2"
    // InternalRLS.g:3907:1: rule__Prefix__IriStringAssignment_0_2 : ( ruleIRIREF ) ;
    public final void rule__Prefix__IriStringAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:3911:1: ( ( ruleIRIREF ) )
            // InternalRLS.g:3912:2: ( ruleIRIREF )
            {
            // InternalRLS.g:3912:2: ( ruleIRIREF )
            // InternalRLS.g:3913:3: ruleIRIREF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrefixAccess().getIriStringIRIREFParserRuleCall_0_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleIRIREF();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrefixAccess().getIriStringIRIREFParserRuleCall_0_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Prefix__IriStringAssignment_0_2"


    // $ANTLR start "rule__Prefix__TAssignment_1_1"
    // InternalRLS.g:3922:1: rule__Prefix__TAssignment_1_1 : ( RULE_PNAME_NS ) ;
    public final void rule__Prefix__TAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:3926:1: ( ( RULE_PNAME_NS ) )
            // InternalRLS.g:3927:2: ( RULE_PNAME_NS )
            {
            // InternalRLS.g:3927:2: ( RULE_PNAME_NS )
            // InternalRLS.g:3928:3: RULE_PNAME_NS
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrefixAccess().getTPNAME_NSTerminalRuleCall_1_1_0()); 
            }
            match(input,RULE_PNAME_NS,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrefixAccess().getTPNAME_NSTerminalRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Prefix__TAssignment_1_1"


    // $ANTLR start "rule__Prefix__IriStringAssignment_1_2"
    // InternalRLS.g:3937:1: rule__Prefix__IriStringAssignment_1_2 : ( ruleIRIREF ) ;
    public final void rule__Prefix__IriStringAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:3941:1: ( ( ruleIRIREF ) )
            // InternalRLS.g:3942:2: ( ruleIRIREF )
            {
            // InternalRLS.g:3942:2: ( ruleIRIREF )
            // InternalRLS.g:3943:3: ruleIRIREF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrefixAccess().getIriStringIRIREFParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleIRIREF();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrefixAccess().getIriStringIRIREFParserRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Prefix__IriStringAssignment_1_2"


    // $ANTLR start "rule__Base__IriStringAssignment_1"
    // InternalRLS.g:3952:1: rule__Base__IriStringAssignment_1 : ( ruleIRIREF ) ;
    public final void rule__Base__IriStringAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:3956:1: ( ( ruleIRIREF ) )
            // InternalRLS.g:3957:2: ( ruleIRIREF )
            {
            // InternalRLS.g:3957:2: ( ruleIRIREF )
            // InternalRLS.g:3958:3: ruleIRIREF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBaseAccess().getIriStringIRIREFParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleIRIREF();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBaseAccess().getIriStringIRIREFParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Base__IriStringAssignment_1"


    // $ANTLR start "rule__Configurable_Literal__TAssignment_0"
    // InternalRLS.g:3967:1: rule__Configurable_Literal__TAssignment_0 : ( RULE_PIPE_DELIMITED_LITERAL ) ;
    public final void rule__Configurable_Literal__TAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:3971:1: ( ( RULE_PIPE_DELIMITED_LITERAL ) )
            // InternalRLS.g:3972:2: ( RULE_PIPE_DELIMITED_LITERAL )
            {
            // InternalRLS.g:3972:2: ( RULE_PIPE_DELIMITED_LITERAL )
            // InternalRLS.g:3973:3: RULE_PIPE_DELIMITED_LITERAL
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigurable_LiteralAccess().getTPIPE_DELIMITED_LITERALTerminalRuleCall_0_0()); 
            }
            match(input,RULE_PIPE_DELIMITED_LITERAL,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConfigurable_LiteralAccess().getTPIPE_DELIMITED_LITERALTerminalRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configurable_Literal__TAssignment_0"


    // $ANTLR start "rule__Configurable_Literal__TAssignment_1"
    // InternalRLS.g:3982:1: rule__Configurable_Literal__TAssignment_1 : ( RULE_HASH_DELIMITED_LITERAL ) ;
    public final void rule__Configurable_Literal__TAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:3986:1: ( ( RULE_HASH_DELIMITED_LITERAL ) )
            // InternalRLS.g:3987:2: ( RULE_HASH_DELIMITED_LITERAL )
            {
            // InternalRLS.g:3987:2: ( RULE_HASH_DELIMITED_LITERAL )
            // InternalRLS.g:3988:3: RULE_HASH_DELIMITED_LITERAL
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigurable_LiteralAccess().getTHASH_DELIMITED_LITERALTerminalRuleCall_1_0()); 
            }
            match(input,RULE_HASH_DELIMITED_LITERAL,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConfigurable_LiteralAccess().getTHASH_DELIMITED_LITERALTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configurable_Literal__TAssignment_1"


    // $ANTLR start "rule__Configurable_Literal__SAssignment_2"
    // InternalRLS.g:3997:1: rule__Configurable_Literal__SAssignment_2 : ( rulebraceDelimitedLiteral ) ;
    public final void rule__Configurable_Literal__SAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:4001:1: ( ( rulebraceDelimitedLiteral ) )
            // InternalRLS.g:4002:2: ( rulebraceDelimitedLiteral )
            {
            // InternalRLS.g:4002:2: ( rulebraceDelimitedLiteral )
            // InternalRLS.g:4003:3: rulebraceDelimitedLiteral
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigurable_LiteralAccess().getSBraceDelimitedLiteralParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            rulebraceDelimitedLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConfigurable_LiteralAccess().getSBraceDelimitedLiteralParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configurable_Literal__SAssignment_2"


    // $ANTLR start "rule__Configurable_Literal__SAssignment_3"
    // InternalRLS.g:4012:1: rule__Configurable_Literal__SAssignment_3 : ( rulebracketDelimitedLiteral ) ;
    public final void rule__Configurable_Literal__SAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:4016:1: ( ( rulebracketDelimitedLiteral ) )
            // InternalRLS.g:4017:2: ( rulebracketDelimitedLiteral )
            {
            // InternalRLS.g:4017:2: ( rulebracketDelimitedLiteral )
            // InternalRLS.g:4018:3: rulebracketDelimitedLiteral
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigurable_LiteralAccess().getSBracketDelimitedLiteralParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            rulebracketDelimitedLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConfigurable_LiteralAccess().getSBracketDelimitedLiteralParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configurable_Literal__SAssignment_3"


    // $ANTLR start "rule__BraceDelimitedLiteral__SbAssignment_2"
    // InternalRLS.g:4027:1: rule__BraceDelimitedLiteral__SbAssignment_2 : ( rulebraceDelimitedLiteralBody ) ;
    public final void rule__BraceDelimitedLiteral__SbAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:4031:1: ( ( rulebraceDelimitedLiteralBody ) )
            // InternalRLS.g:4032:2: ( rulebraceDelimitedLiteralBody )
            {
            // InternalRLS.g:4032:2: ( rulebraceDelimitedLiteralBody )
            // InternalRLS.g:4033:3: rulebraceDelimitedLiteralBody
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBraceDelimitedLiteralAccess().getSbBraceDelimitedLiteralBodyParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            rulebraceDelimitedLiteralBody();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBraceDelimitedLiteralAccess().getSbBraceDelimitedLiteralBodyParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BraceDelimitedLiteral__SbAssignment_2"


    // $ANTLR start "rule__BraceDelimitedLiteralBody__SAssignment"
    // InternalRLS.g:4042:1: rule__BraceDelimitedLiteralBody__SAssignment : ( RULE_UNBRACE ) ;
    public final void rule__BraceDelimitedLiteralBody__SAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:4046:1: ( ( RULE_UNBRACE ) )
            // InternalRLS.g:4047:2: ( RULE_UNBRACE )
            {
            // InternalRLS.g:4047:2: ( RULE_UNBRACE )
            // InternalRLS.g:4048:3: RULE_UNBRACE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBraceDelimitedLiteralBodyAccess().getSUNBRACETerminalRuleCall_0()); 
            }
            match(input,RULE_UNBRACE,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBraceDelimitedLiteralBodyAccess().getSUNBRACETerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BraceDelimitedLiteralBody__SAssignment"


    // $ANTLR start "rule__BracketDelimitedLiteral__SbAssignment_2"
    // InternalRLS.g:4057:1: rule__BracketDelimitedLiteral__SbAssignment_2 : ( rulebracketDelimitedLiteralBody ) ;
    public final void rule__BracketDelimitedLiteral__SbAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:4061:1: ( ( rulebracketDelimitedLiteralBody ) )
            // InternalRLS.g:4062:2: ( rulebracketDelimitedLiteralBody )
            {
            // InternalRLS.g:4062:2: ( rulebracketDelimitedLiteralBody )
            // InternalRLS.g:4063:3: rulebracketDelimitedLiteralBody
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBracketDelimitedLiteralAccess().getSbBracketDelimitedLiteralBodyParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            rulebracketDelimitedLiteralBody();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBracketDelimitedLiteralAccess().getSbBracketDelimitedLiteralBodyParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BracketDelimitedLiteral__SbAssignment_2"


    // $ANTLR start "rule__BracketDelimitedLiteralBody__SAssignment"
    // InternalRLS.g:4072:1: rule__BracketDelimitedLiteralBody__SAssignment : ( RULE_UNBRACKET ) ;
    public final void rule__BracketDelimitedLiteralBody__SAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:4076:1: ( ( RULE_UNBRACKET ) )
            // InternalRLS.g:4077:2: ( RULE_UNBRACKET )
            {
            // InternalRLS.g:4077:2: ( RULE_UNBRACKET )
            // InternalRLS.g:4078:3: RULE_UNBRACKET
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBracketDelimitedLiteralBodyAccess().getSUNBRACKETTerminalRuleCall_0()); 
            }
            match(input,RULE_UNBRACKET,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBracketDelimitedLiteralBodyAccess().getSUNBRACKETTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BracketDelimitedLiteralBody__SAssignment"


    // $ANTLR start "rule__Arguments__StrAssignment_1_0"
    // InternalRLS.g:4087:1: rule__Arguments__StrAssignment_1_0 : ( ruleStriing ) ;
    public final void rule__Arguments__StrAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:4091:1: ( ( ruleStriing ) )
            // InternalRLS.g:4092:2: ( ruleStriing )
            {
            // InternalRLS.g:4092:2: ( ruleStriing )
            // InternalRLS.g:4093:3: ruleStriing
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArgumentsAccess().getStrStriingParserRuleCall_1_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleStriing();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArgumentsAccess().getStrStriingParserRuleCall_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arguments__StrAssignment_1_0"


    // $ANTLR start "rule__Arguments__StrAssignment_1_1"
    // InternalRLS.g:4102:1: rule__Arguments__StrAssignment_1_1 : ( ruleIRIBOL ) ;
    public final void rule__Arguments__StrAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:4106:1: ( ( ruleIRIBOL ) )
            // InternalRLS.g:4107:2: ( ruleIRIBOL )
            {
            // InternalRLS.g:4107:2: ( ruleIRIBOL )
            // InternalRLS.g:4108:3: ruleIRIBOL
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArgumentsAccess().getStrIRIBOLParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleIRIBOL();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArgumentsAccess().getStrIRIBOLParserRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arguments__StrAssignment_1_1"


    // $ANTLR start "rule__Arguments__TAssignment_1_2"
    // InternalRLS.g:4117:1: rule__Arguments__TAssignment_1_2 : ( ruleTerm ) ;
    public final void rule__Arguments__TAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:4121:1: ( ( ruleTerm ) )
            // InternalRLS.g:4122:2: ( ruleTerm )
            {
            // InternalRLS.g:4122:2: ( ruleTerm )
            // InternalRLS.g:4123:3: ruleTerm
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArgumentsAccess().getTTermParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleTerm();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArgumentsAccess().getTTermParserRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arguments__TAssignment_1_2"


    // $ANTLR start "rule__Arguments__SAssignment_2_1"
    // InternalRLS.g:4132:1: rule__Arguments__SAssignment_2_1 : ( ruleArguments ) ;
    public final void rule__Arguments__SAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRLS.g:4136:1: ( ( ruleArguments ) )
            // InternalRLS.g:4137:2: ( ruleArguments )
            {
            // InternalRLS.g:4137:2: ( ruleArguments )
            // InternalRLS.g:4138:3: ruleArguments
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArgumentsAccess().getSArgumentsParserRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleArguments();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArgumentsAccess().getSArgumentsParserRuleCall_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arguments__SAssignment_2_1"

    // $ANTLR start synpred23_InternalRLS
    public final void synpred23_InternalRLS_fragment() throws RecognitionException {   
        // InternalRLS.g:1080:2: ( ( ( rule__Arguments__StrAssignment_1_0 ) ) )
        // InternalRLS.g:1080:2: ( ( rule__Arguments__StrAssignment_1_0 ) )
        {
        // InternalRLS.g:1080:2: ( ( rule__Arguments__StrAssignment_1_0 ) )
        // InternalRLS.g:1081:3: ( rule__Arguments__StrAssignment_1_0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getArgumentsAccess().getStrAssignment_1_0()); 
        }
        // InternalRLS.g:1082:3: ( rule__Arguments__StrAssignment_1_0 )
        // InternalRLS.g:1082:4: rule__Arguments__StrAssignment_1_0
        {
        pushFollow(FOLLOW_2);
        rule__Arguments__StrAssignment_1_0();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred23_InternalRLS

    // $ANTLR start synpred24_InternalRLS
    public final void synpred24_InternalRLS_fragment() throws RecognitionException {   
        // InternalRLS.g:1086:2: ( ( ( rule__Arguments__StrAssignment_1_1 ) ) )
        // InternalRLS.g:1086:2: ( ( rule__Arguments__StrAssignment_1_1 ) )
        {
        // InternalRLS.g:1086:2: ( ( rule__Arguments__StrAssignment_1_1 ) )
        // InternalRLS.g:1087:3: ( rule__Arguments__StrAssignment_1_1 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getArgumentsAccess().getStrAssignment_1_1()); 
        }
        // InternalRLS.g:1088:3: ( rule__Arguments__StrAssignment_1_1 )
        // InternalRLS.g:1088:4: rule__Arguments__StrAssignment_1_1
        {
        pushFollow(FOLLOW_2);
        rule__Arguments__StrAssignment_1_1();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred24_InternalRLS

    // Delegated rules

    public final boolean synpred23_InternalRLS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred23_InternalRLS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred24_InternalRLS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred24_InternalRLS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA8 dfa8 = new DFA8(this);
    protected DFA12 dfa12 = new DFA12(this);
    static final String dfa_1s = "\73\uffff";
    static final String dfa_2s = "\1\20\3\10\1\20\5\6\4\5\6\6\1\43\1\44\1\20\2\6\1\20\1\43\1\6\1\44\6\6\4\5\6\6\1\43\1\44\2\uffff\3\6\1\20\1\43\1\6\1\44\3\6";
    static final String dfa_3s = "\1\34\3\10\1\72\5\11\4\26\6\11\1\71\1\73\1\72\1\13\1\11\1\21\1\71\1\11\1\73\6\11\4\26\6\11\1\71\1\73\2\uffff\3\11\1\21\1\71\1\11\1\73\3\11";
    static final String dfa_4s = "\57\uffff\1\2\1\1\12\uffff";
    static final String dfa_5s = "\73\uffff}>";
    static final String[] dfa_6s = {
            "\1\2\1\1\12\uffff\1\3",
            "\1\4",
            "\1\4",
            "\1\4",
            "\1\6\1\5\1\12\1\13\1\14\1\15\1\uffff\1\7\1\10\1\11\1\16\1\17\1\20\1\21\3\uffff\1\22\1\23\25\uffff\1\24\1\uffff\1\25",
            "\1\26\2\uffff\1\27",
            "\1\26\2\uffff\1\27",
            "\1\26\2\uffff\1\27",
            "\1\26\2\uffff\1\27",
            "\1\26\2\uffff\1\27",
            "\1\31\1\26\2\uffff\1\27\14\uffff\1\30",
            "\1\31\1\26\2\uffff\1\27\14\uffff\1\30",
            "\1\31\1\26\2\uffff\1\27\14\uffff\1\30",
            "\1\31\1\26\2\uffff\1\27\14\uffff\1\30",
            "\1\26\2\uffff\1\27",
            "\1\26\2\uffff\1\27",
            "\1\26\2\uffff\1\27",
            "\1\26\2\uffff\1\27",
            "\1\26\2\uffff\1\27",
            "\1\26\2\uffff\1\27",
            "\1\32\25\uffff\1\33",
            "\1\34\26\uffff\1\35",
            "\1\37\1\36\1\43\1\44\1\45\1\46\1\uffff\1\40\1\41\1\42\1\47\1\50\1\51\1\52\3\uffff\1\53\1\54\25\uffff\1\55\1\uffff\1\56",
            "\1\60\3\uffff\1\60\1\57",
            "\1\26\2\uffff\1\27",
            "\1\62\1\61",
            "\1\32\25\uffff\1\33",
            "\1\26\2\uffff\1\27",
            "\1\34\26\uffff\1\35",
            "\1\26\2\uffff\1\27",
            "\1\26\2\uffff\1\27",
            "\1\26\2\uffff\1\27",
            "\1\26\2\uffff\1\27",
            "\1\26\2\uffff\1\27",
            "\1\26\2\uffff\1\27",
            "\1\64\1\26\2\uffff\1\27\14\uffff\1\63",
            "\1\64\1\26\2\uffff\1\27\14\uffff\1\63",
            "\1\64\1\26\2\uffff\1\27\14\uffff\1\63",
            "\1\64\1\26\2\uffff\1\27\14\uffff\1\63",
            "\1\26\2\uffff\1\27",
            "\1\26\2\uffff\1\27",
            "\1\26\2\uffff\1\27",
            "\1\26\2\uffff\1\27",
            "\1\26\2\uffff\1\27",
            "\1\26\2\uffff\1\27",
            "\1\65\25\uffff\1\66",
            "\1\67\26\uffff\1\70",
            "",
            "",
            "\1\26\2\uffff\1\27",
            "\1\26\2\uffff\1\27",
            "\1\26\2\uffff\1\27",
            "\1\72\1\71",
            "\1\65\25\uffff\1\66",
            "\1\26\2\uffff\1\27",
            "\1\67\26\uffff\1\70",
            "\1\26\2\uffff\1\27",
            "\1\26\2\uffff\1\27",
            "\1\26\2\uffff\1\27"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "979:1: rule__Statement__Alternatives : ( ( ( rule__Statement__StatementAssignment_0 ) ) | ( ( rule__Statement__Group_1__0 ) ) );";
        }
    }
    static final String dfa_7s = "\12\uffff";
    static final String dfa_8s = "\1\20\6\0\3\uffff";
    static final String dfa_9s = "\1\72\6\0\3\uffff";
    static final String dfa_10s = "\7\uffff\1\3\1\1\1\2";
    static final String dfa_11s = "\1\uffff\1\4\1\1\1\5\1\2\1\0\1\3\3\uffff}>";
    static final String[] dfa_12s = {
            "\1\6\1\5\1\1\1\2\1\3\1\4\1\uffff\7\7\3\uffff\2\7\25\uffff\1\7\1\uffff\1\7",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            ""
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final char[] dfa_8 = DFA.unpackEncodedStringToUnsignedChars(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final short[] dfa_10 = DFA.unpackEncodedString(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[][] dfa_12 = unpackEncodedStringArray(dfa_12s);

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "1075:1: rule__Arguments__Alternatives_1 : ( ( ( rule__Arguments__StrAssignment_1_0 ) ) | ( ( rule__Arguments__StrAssignment_1_1 ) ) | ( ( rule__Arguments__TAssignment_1_2 ) ) );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_5 = input.LA(1);

                         
                        int index12_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred24_InternalRLS()) ) {s = 9;}

                        else if ( (true) ) {s = 7;}

                         
                        input.seek(index12_5);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_2 = input.LA(1);

                         
                        int index12_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred23_InternalRLS()) ) {s = 8;}

                        else if ( (true) ) {s = 7;}

                         
                        input.seek(index12_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA12_4 = input.LA(1);

                         
                        int index12_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred23_InternalRLS()) ) {s = 8;}

                        else if ( (true) ) {s = 7;}

                         
                        input.seek(index12_4);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA12_6 = input.LA(1);

                         
                        int index12_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred24_InternalRLS()) ) {s = 9;}

                        else if ( (true) ) {s = 7;}

                         
                        input.seek(index12_6);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA12_1 = input.LA(1);

                         
                        int index12_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred23_InternalRLS()) ) {s = 8;}

                        else if ( (true) ) {s = 7;}

                         
                        input.seek(index12_1);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA12_3 = input.LA(1);

                         
                        int index12_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred23_InternalRLS()) ) {s = 8;}

                        else if ( (true) ) {s = 7;}

                         
                        input.seek(index12_3);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 12, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000000001003D010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000010030002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000400020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x050000063FBF0000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000010030000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000010030080L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000050000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0200000800000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0800001000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000001000000002L});

}