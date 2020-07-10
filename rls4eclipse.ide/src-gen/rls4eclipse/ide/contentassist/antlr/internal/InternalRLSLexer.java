package rls4eclipse.ide.contentassist.antlr.internal;

/*-
 * #%L
 * rls4eclipse.ide
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

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRLSLexer extends Lexer {
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

    public InternalRLSLexer() {;} 
    public InternalRLSLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalRLSLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalRLS.g"; }

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRLS.g:11:7: ( '{' )
            // InternalRLS.g:11:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRLS.g:12:7: ( '}' )
            // InternalRLS.g:12:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRLS.g:13:7: ( '[' )
            // InternalRLS.g:13:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRLS.g:14:7: ( ']' )
            // InternalRLS.g:14:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "RULE_E"
    public final void mRULE_E() throws RecognitionException {
        try {
            int _type = RULE_E;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRLS.g:4147:8: ( EOF )
            // InternalRLS.g:4147:10: EOF
            {
            match(EOF); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_E"

    // $ANTLR start "RULE_ARITY"
    public final void mRULE_ARITY() throws RecognitionException {
        try {
            int _type = RULE_ARITY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRLS.g:4149:12: ( '[' RULE_INTEGER ']' )
            // InternalRLS.g:4149:14: '[' RULE_INTEGER ']'
            {
            match('['); 
            mRULE_INTEGER(); 
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ARITY"

    // $ANTLR start "RULE_PRFX"
    public final void mRULE_PRFX() throws RecognitionException {
        try {
            int _type = RULE_PRFX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRLS.g:4151:11: ( '@prefix ' )
            // InternalRLS.g:4151:13: '@prefix '
            {
            match("@prefix "); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_PRFX"

    // $ANTLR start "RULE_BS"
    public final void mRULE_BS() throws RecognitionException {
        try {
            int _type = RULE_BS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRLS.g:4153:9: ( '@base ' )
            // InternalRLS.g:4153:11: '@base '
            {
            match("@base "); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_BS"

    // $ANTLR start "RULE_SRC"
    public final void mRULE_SRC() throws RecognitionException {
        try {
            int _type = RULE_SRC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRLS.g:4155:10: ( '@source' )
            // InternalRLS.g:4155:12: '@source'
            {
            match("@source"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SRC"

    // $ANTLR start "RULE_LOADCSV"
    public final void mRULE_LOADCSV() throws RecognitionException {
        try {
            int _type = RULE_LOADCSV;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRLS.g:4157:14: ( 'load-csv' )
            // InternalRLS.g:4157:16: 'load-csv'
            {
            match("load-csv"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LOADCSV"

    // $ANTLR start "RULE_LOADRDF"
    public final void mRULE_LOADRDF() throws RecognitionException {
        try {
            int _type = RULE_LOADRDF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRLS.g:4159:14: ( 'load-rdf' )
            // InternalRLS.g:4159:16: 'load-rdf'
            {
            match("load-rdf"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LOADRDF"

    // $ANTLR start "RULE_SPARQL"
    public final void mRULE_SPARQL() throws RecognitionException {
        try {
            int _type = RULE_SPARQL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRLS.g:4161:13: ( 'sparql' )
            // InternalRLS.g:4161:15: 'sparql'
            {
            match("sparql"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SPARQL"

    // $ANTLR start "RULE_NAMED_NULL"
    public final void mRULE_NAMED_NULL() throws RecognitionException {
        try {
            int _type = RULE_NAMED_NULL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRLS.g:4163:17: ( '_:' ( RULE_PN_CHARS_U | '0' .. '9' ) ( ( RULE_PN_CHARS | '.' )* RULE_PN_CHARS )? )
            // InternalRLS.g:4163:19: '_:' ( RULE_PN_CHARS_U | '0' .. '9' ) ( ( RULE_PN_CHARS | '.' )* RULE_PN_CHARS )?
            {
            match("_:"); 

            if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z')||(input.LA(1)>='\u00C0' && input.LA(1)<='\u00D6')||(input.LA(1)>='\u00D8' && input.LA(1)<='\u00F6')||(input.LA(1)>='\u00F8' && input.LA(1)<='\u02FF')||(input.LA(1)>='\u0370' && input.LA(1)<='\u037D')||(input.LA(1)>='\u037F' && input.LA(1)<='\u1FFF')||(input.LA(1)>='\u200C' && input.LA(1)<='\u200D')||(input.LA(1)>='\u2070' && input.LA(1)<='\u218F')||(input.LA(1)>='\u2C00' && input.LA(1)<='\u2FEF')||(input.LA(1)>='\u3001' && input.LA(1)<='\uD7FF')||(input.LA(1)>='\uF900' && input.LA(1)<='\uFFFD') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalRLS.g:4163:51: ( ( RULE_PN_CHARS | '.' )* RULE_PN_CHARS )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>='-' && LA2_0<='.')||(LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')||LA2_0=='\u00B7'||(LA2_0>='\u00C0' && LA2_0<='\u00D6')||(LA2_0>='\u00D8' && LA2_0<='\u00F6')||(LA2_0>='\u00F8' && LA2_0<='\u037D')||(LA2_0>='\u037F' && LA2_0<='\u1FFF')||(LA2_0>='\u200C' && LA2_0<='\u200D')||(LA2_0>='\u203F' && LA2_0<='\u2040')||(LA2_0>='\u2070' && LA2_0<='\u218F')||(LA2_0>='\u2C00' && LA2_0<='\u2FEF')||(LA2_0>='\u3001' && LA2_0<='\uD7FF')||(LA2_0>='\uF900' && LA2_0<='\uFFFD')) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalRLS.g:4163:52: ( RULE_PN_CHARS | '.' )* RULE_PN_CHARS
                    {
                    // InternalRLS.g:4163:52: ( RULE_PN_CHARS | '.' )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0=='-'||(LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='Z')||LA1_0=='_'||(LA1_0>='a' && LA1_0<='z')||LA1_0=='\u00B7'||(LA1_0>='\u00C0' && LA1_0<='\u00D6')||(LA1_0>='\u00D8' && LA1_0<='\u00F6')||(LA1_0>='\u00F8' && LA1_0<='\u037D')||(LA1_0>='\u037F' && LA1_0<='\u1FFF')||(LA1_0>='\u200C' && LA1_0<='\u200D')||(LA1_0>='\u203F' && LA1_0<='\u2040')||(LA1_0>='\u2070' && LA1_0<='\u218F')||(LA1_0>='\u2C00' && LA1_0<='\u2FEF')||(LA1_0>='\u3001' && LA1_0<='\uD7FF')||(LA1_0>='\uF900' && LA1_0<='\uFFFD')) ) {
                            int LA1_1 = input.LA(2);

                            if ( ((LA1_1>='-' && LA1_1<='.')||(LA1_1>='0' && LA1_1<='9')||(LA1_1>='A' && LA1_1<='Z')||LA1_1=='_'||(LA1_1>='a' && LA1_1<='z')||LA1_1=='\u00B7'||(LA1_1>='\u00C0' && LA1_1<='\u00D6')||(LA1_1>='\u00D8' && LA1_1<='\u00F6')||(LA1_1>='\u00F8' && LA1_1<='\u037D')||(LA1_1>='\u037F' && LA1_1<='\u1FFF')||(LA1_1>='\u200C' && LA1_1<='\u200D')||(LA1_1>='\u203F' && LA1_1<='\u2040')||(LA1_1>='\u2070' && LA1_1<='\u218F')||(LA1_1>='\u2C00' && LA1_1<='\u2FEF')||(LA1_1>='\u3001' && LA1_1<='\uD7FF')||(LA1_1>='\uF900' && LA1_1<='\uFFFD')) ) {
                                alt1=1;
                            }


                        }
                        else if ( (LA1_0=='.') ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalRLS.g:
                    	    {
                    	    if ( (input.LA(1)>='-' && input.LA(1)<='.')||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z')||input.LA(1)=='\u00B7'||(input.LA(1)>='\u00C0' && input.LA(1)<='\u00D6')||(input.LA(1)>='\u00D8' && input.LA(1)<='\u00F6')||(input.LA(1)>='\u00F8' && input.LA(1)<='\u037D')||(input.LA(1)>='\u037F' && input.LA(1)<='\u1FFF')||(input.LA(1)>='\u200C' && input.LA(1)<='\u200D')||(input.LA(1)>='\u203F' && input.LA(1)<='\u2040')||(input.LA(1)>='\u2070' && input.LA(1)<='\u218F')||(input.LA(1)>='\u2C00' && input.LA(1)<='\u2FEF')||(input.LA(1)>='\u3001' && input.LA(1)<='\uD7FF')||(input.LA(1)>='\uF900' && input.LA(1)<='\uFFFD') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                    mRULE_PN_CHARS(); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_NAMED_NULL"

    // $ANTLR start "RULE_INTEGER"
    public final void mRULE_INTEGER() throws RecognitionException {
        try {
            int _type = RULE_INTEGER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRLS.g:4165:14: ( ( '-' | '+' )? RULE_DIGITS )
            // InternalRLS.g:4165:16: ( '-' | '+' )? RULE_DIGITS
            {
            // InternalRLS.g:4165:16: ( '-' | '+' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='+'||LA3_0=='-') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalRLS.g:
                    {
                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }

            mRULE_DIGITS(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INTEGER"

    // $ANTLR start "RULE_DECIMAL"
    public final void mRULE_DECIMAL() throws RecognitionException {
        try {
            int _type = RULE_DECIMAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRLS.g:4167:14: ( ( '-' | '+' )? ( ( RULE_DIGITS )+ '.' ( RULE_DIGITS )* | '.' ( RULE_DIGITS )+ ) )
            // InternalRLS.g:4167:16: ( '-' | '+' )? ( ( RULE_DIGITS )+ '.' ( RULE_DIGITS )* | '.' ( RULE_DIGITS )+ )
            {
            // InternalRLS.g:4167:16: ( '-' | '+' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='+'||LA4_0=='-') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalRLS.g:
                    {
                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }

            // InternalRLS.g:4167:27: ( ( RULE_DIGITS )+ '.' ( RULE_DIGITS )* | '.' ( RULE_DIGITS )+ )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>='0' && LA8_0<='9')) ) {
                alt8=1;
            }
            else if ( (LA8_0=='.') ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalRLS.g:4167:28: ( RULE_DIGITS )+ '.' ( RULE_DIGITS )*
                    {
                    // InternalRLS.g:4167:28: ( RULE_DIGITS )+
                    int cnt5=0;
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalRLS.g:4167:28: RULE_DIGITS
                    	    {
                    	    mRULE_DIGITS(); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt5 >= 1 ) break loop5;
                                EarlyExitException eee =
                                    new EarlyExitException(5, input);
                                throw eee;
                        }
                        cnt5++;
                    } while (true);

                    match('.'); 
                    // InternalRLS.g:4167:45: ( RULE_DIGITS )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( ((LA6_0>='0' && LA6_0<='9')) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalRLS.g:4167:45: RULE_DIGITS
                    	    {
                    	    mRULE_DIGITS(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // InternalRLS.g:4167:58: '.' ( RULE_DIGITS )+
                    {
                    match('.'); 
                    // InternalRLS.g:4167:62: ( RULE_DIGITS )+
                    int cnt7=0;
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( ((LA7_0>='0' && LA7_0<='9')) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalRLS.g:4167:62: RULE_DIGITS
                    	    {
                    	    mRULE_DIGITS(); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt7 >= 1 ) break loop7;
                                EarlyExitException eee =
                                    new EarlyExitException(7, input);
                                throw eee;
                        }
                        cnt7++;
                    } while (true);


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DECIMAL"

    // $ANTLR start "RULE_DOUBLE"
    public final void mRULE_DOUBLE() throws RecognitionException {
        try {
            int _type = RULE_DOUBLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRLS.g:4169:13: ( ( '+' | '-' )? ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* RULE_EXPONENT | '.' ( '0' .. '9' )+ RULE_EXPONENT | ( '0' .. '9' )+ RULE_EXPONENT ) )
            // InternalRLS.g:4169:15: ( '+' | '-' )? ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* RULE_EXPONENT | '.' ( '0' .. '9' )+ RULE_EXPONENT | ( '0' .. '9' )+ RULE_EXPONENT )
            {
            // InternalRLS.g:4169:15: ( '+' | '-' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='+'||LA9_0=='-') ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalRLS.g:
                    {
                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }

            // InternalRLS.g:4169:26: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* RULE_EXPONENT | '.' ( '0' .. '9' )+ RULE_EXPONENT | ( '0' .. '9' )+ RULE_EXPONENT )
            int alt14=3;
            alt14 = dfa14.predict(input);
            switch (alt14) {
                case 1 :
                    // InternalRLS.g:4169:27: ( '0' .. '9' )+ '.' ( '0' .. '9' )* RULE_EXPONENT
                    {
                    // InternalRLS.g:4169:27: ( '0' .. '9' )+
                    int cnt10=0;
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( ((LA10_0>='0' && LA10_0<='9')) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalRLS.g:4169:28: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt10 >= 1 ) break loop10;
                                EarlyExitException eee =
                                    new EarlyExitException(10, input);
                                throw eee;
                        }
                        cnt10++;
                    } while (true);

                    match('.'); 
                    // InternalRLS.g:4169:43: ( '0' .. '9' )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( ((LA11_0>='0' && LA11_0<='9')) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalRLS.g:4169:44: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    mRULE_EXPONENT(); 

                    }
                    break;
                case 2 :
                    // InternalRLS.g:4169:69: '.' ( '0' .. '9' )+ RULE_EXPONENT
                    {
                    match('.'); 
                    // InternalRLS.g:4169:73: ( '0' .. '9' )+
                    int cnt12=0;
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( ((LA12_0>='0' && LA12_0<='9')) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalRLS.g:4169:74: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt12 >= 1 ) break loop12;
                                EarlyExitException eee =
                                    new EarlyExitException(12, input);
                                throw eee;
                        }
                        cnt12++;
                    } while (true);

                    mRULE_EXPONENT(); 

                    }
                    break;
                case 3 :
                    // InternalRLS.g:4169:99: ( '0' .. '9' )+ RULE_EXPONENT
                    {
                    // InternalRLS.g:4169:99: ( '0' .. '9' )+
                    int cnt13=0;
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( ((LA13_0>='0' && LA13_0<='9')) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalRLS.g:4169:100: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt13 >= 1 ) break loop13;
                                EarlyExitException eee =
                                    new EarlyExitException(13, input);
                                throw eee;
                        }
                        cnt13++;
                    } while (true);

                    mRULE_EXPONENT(); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DOUBLE"

    // $ANTLR start "RULE_DIGITS"
    public final void mRULE_DIGITS() throws RecognitionException {
        try {
            // InternalRLS.g:4171:22: ( ( '0' .. '9' )+ )
            // InternalRLS.g:4171:24: ( '0' .. '9' )+
            {
            // InternalRLS.g:4171:24: ( '0' .. '9' )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>='0' && LA15_0<='9')) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalRLS.g:4171:25: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt15 >= 1 ) break loop15;
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_DIGITS"

    // $ANTLR start "RULE_EXPONENT"
    public final void mRULE_EXPONENT() throws RecognitionException {
        try {
            // InternalRLS.g:4173:24: ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )
            // InternalRLS.g:4173:26: ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalRLS.g:4173:36: ( '+' | '-' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0=='+'||LA16_0=='-') ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalRLS.g:
                    {
                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }

            // InternalRLS.g:4173:47: ( '0' .. '9' )+
            int cnt17=0;
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>='0' && LA17_0<='9')) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalRLS.g:4173:48: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt17 >= 1 ) break loop17;
                        EarlyExitException eee =
                            new EarlyExitException(17, input);
                        throw eee;
                }
                cnt17++;
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_EXPONENT"

    // $ANTLR start "RULE_SKIP"
    public final void mRULE_SKIP() throws RecognitionException {
        try {
            int _type = RULE_SKIP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRLS.g:4175:11: ( ( ' ' | '\\t' | '\\n' | '\\r' | '\\f' | '%' (~ ( '\\n' ) )* '\\n' ) )
            // InternalRLS.g:4175:13: ( ' ' | '\\t' | '\\n' | '\\r' | '\\f' | '%' (~ ( '\\n' ) )* '\\n' )
            {
            // InternalRLS.g:4175:13: ( ' ' | '\\t' | '\\n' | '\\r' | '\\f' | '%' (~ ( '\\n' ) )* '\\n' )
            int alt19=6;
            switch ( input.LA(1) ) {
            case ' ':
                {
                alt19=1;
                }
                break;
            case '\t':
                {
                alt19=2;
                }
                break;
            case '\n':
                {
                alt19=3;
                }
                break;
            case '\r':
                {
                alt19=4;
                }
                break;
            case '\f':
                {
                alt19=5;
                }
                break;
            case '%':
                {
                alt19=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // InternalRLS.g:4175:14: ' '
                    {
                    match(' '); 

                    }
                    break;
                case 2 :
                    // InternalRLS.g:4175:18: '\\t'
                    {
                    match('\t'); 

                    }
                    break;
                case 3 :
                    // InternalRLS.g:4175:23: '\\n'
                    {
                    match('\n'); 

                    }
                    break;
                case 4 :
                    // InternalRLS.g:4175:28: '\\r'
                    {
                    match('\r'); 

                    }
                    break;
                case 5 :
                    // InternalRLS.g:4175:33: '\\f'
                    {
                    match('\f'); 

                    }
                    break;
                case 6 :
                    // InternalRLS.g:4175:38: '%' (~ ( '\\n' ) )* '\\n'
                    {
                    match('%'); 
                    // InternalRLS.g:4175:42: (~ ( '\\n' ) )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( ((LA18_0>='\u0000' && LA18_0<='\t')||(LA18_0>='\u000B' && LA18_0<='\uFFFF')) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // InternalRLS.g:4175:42: ~ ( '\\n' )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SKIP"

    // $ANTLR start "RULE_UNBRACE"
    public final void mRULE_UNBRACE() throws RecognitionException {
        try {
            int _type = RULE_UNBRACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRLS.g:4177:14: ( '{' (~ ( ( '{' | '}' ) ) )+ '}' )
            // InternalRLS.g:4177:16: '{' (~ ( ( '{' | '}' ) ) )+ '}'
            {
            match('{'); 
            // InternalRLS.g:4177:20: (~ ( ( '{' | '}' ) ) )+
            int cnt20=0;
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>='\u0000' && LA20_0<='z')||LA20_0=='|'||(LA20_0>='~' && LA20_0<='\uFFFF')) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalRLS.g:4177:20: ~ ( ( '{' | '}' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='z')||input.LA(1)=='|'||(input.LA(1)>='~' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt20 >= 1 ) break loop20;
                        EarlyExitException eee =
                            new EarlyExitException(20, input);
                        throw eee;
                }
                cnt20++;
            } while (true);

            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_UNBRACE"

    // $ANTLR start "RULE_UNBRACKET"
    public final void mRULE_UNBRACKET() throws RecognitionException {
        try {
            int _type = RULE_UNBRACKET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRLS.g:4179:16: ( '[' (~ ( ( '[' | ']' ) ) )+ ']' )
            // InternalRLS.g:4179:18: '[' (~ ( ( '[' | ']' ) ) )+ ']'
            {
            match('['); 
            // InternalRLS.g:4179:22: (~ ( ( '[' | ']' ) ) )+
            int cnt21=0;
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>='\u0000' && LA21_0<='Z')||LA21_0=='\\'||(LA21_0>='^' && LA21_0<='\uFFFF')) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalRLS.g:4179:22: ~ ( ( '[' | ']' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='Z')||input.LA(1)=='\\'||(input.LA(1)>='^' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt21 >= 1 ) break loop21;
                        EarlyExitException eee =
                            new EarlyExitException(21, input);
                        throw eee;
                }
                cnt21++;
            } while (true);

            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_UNBRACKET"

    // $ANTLR start "RULE_PIPE_DELIMITED_LITERAL"
    public final void mRULE_PIPE_DELIMITED_LITERAL() throws RecognitionException {
        try {
            int _type = RULE_PIPE_DELIMITED_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRLS.g:4181:29: ( '|' (~ ( '|' ) )* '|' )
            // InternalRLS.g:4181:31: '|' (~ ( '|' ) )* '|'
            {
            match('|'); 
            // InternalRLS.g:4181:35: (~ ( '|' ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>='\u0000' && LA22_0<='{')||(LA22_0>='}' && LA22_0<='\uFFFF')) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalRLS.g:4181:35: ~ ( '|' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='{')||(input.LA(1)>='}' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_PIPE_DELIMITED_LITERAL"

    // $ANTLR start "RULE_HASH_DELIMITED_LITERAL"
    public final void mRULE_HASH_DELIMITED_LITERAL() throws RecognitionException {
        try {
            int _type = RULE_HASH_DELIMITED_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRLS.g:4183:29: ( '#' (~ ( '#' ) )* '#' )
            // InternalRLS.g:4183:31: '#' (~ ( '#' ) )* '#'
            {
            match('#'); 
            // InternalRLS.g:4183:35: (~ ( '#' ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>='\u0000' && LA23_0<='\"')||(LA23_0>='$' && LA23_0<='\uFFFF')) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalRLS.g:4183:35: ~ ( '#' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\"')||(input.LA(1)>='$' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            match('#'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_HASH_DELIMITED_LITERAL"

    // $ANTLR start "RULE_STRING_LITERAL1"
    public final void mRULE_STRING_LITERAL1() throws RecognitionException {
        try {
            int _type = RULE_STRING_LITERAL1;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRLS.g:4185:22: ( '\\'' (~ ( ( '\\'' | '\\\\' | '\\n' | '\\r' ) ) | RULE_ECHAR )* '\\'' )
            // InternalRLS.g:4185:24: '\\'' (~ ( ( '\\'' | '\\\\' | '\\n' | '\\r' ) ) | RULE_ECHAR )* '\\''
            {
            match('\''); 
            // InternalRLS.g:4185:29: (~ ( ( '\\'' | '\\\\' | '\\n' | '\\r' ) ) | RULE_ECHAR )*
            loop24:
            do {
                int alt24=3;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>='\u0000' && LA24_0<='\t')||(LA24_0>='\u000B' && LA24_0<='\f')||(LA24_0>='\u000E' && LA24_0<='&')||(LA24_0>='(' && LA24_0<='[')||(LA24_0>=']' && LA24_0<='\uFFFF')) ) {
                    alt24=1;
                }
                else if ( (LA24_0=='\\') ) {
                    alt24=2;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalRLS.g:4185:30: ~ ( ( '\\'' | '\\\\' | '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;
            	case 2 :
            	    // InternalRLS.g:4185:55: RULE_ECHAR
            	    {
            	    mRULE_ECHAR(); 

            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING_LITERAL1"

    // $ANTLR start "RULE_STRING_LITERAL2"
    public final void mRULE_STRING_LITERAL2() throws RecognitionException {
        try {
            int _type = RULE_STRING_LITERAL2;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRLS.g:4187:22: ( '\"' (~ ( ( '\"' | '\\\\' | '\\n' | '\\r' ) ) | RULE_ECHAR )* '\"' )
            // InternalRLS.g:4187:24: '\"' (~ ( ( '\"' | '\\\\' | '\\n' | '\\r' ) ) | RULE_ECHAR )* '\"'
            {
            match('\"'); 
            // InternalRLS.g:4187:28: (~ ( ( '\"' | '\\\\' | '\\n' | '\\r' ) ) | RULE_ECHAR )*
            loop25:
            do {
                int alt25=3;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0>='\u0000' && LA25_0<='\t')||(LA25_0>='\u000B' && LA25_0<='\f')||(LA25_0>='\u000E' && LA25_0<='!')||(LA25_0>='#' && LA25_0<='[')||(LA25_0>=']' && LA25_0<='\uFFFF')) ) {
                    alt25=1;
                }
                else if ( (LA25_0=='\\') ) {
                    alt25=2;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalRLS.g:4187:29: ~ ( ( '\"' | '\\\\' | '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;
            	case 2 :
            	    // InternalRLS.g:4187:53: RULE_ECHAR
            	    {
            	    mRULE_ECHAR(); 

            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING_LITERAL2"

    // $ANTLR start "RULE_STRING_LITERAL_LONG1"
    public final void mRULE_STRING_LITERAL_LONG1() throws RecognitionException {
        try {
            int _type = RULE_STRING_LITERAL_LONG1;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRLS.g:4189:27: ( '\\'\\'\\'' (~ ( ( '\\'' | '\\\\' ) ) | RULE_ECHAR | '\\'' ~ ( '\\'' ) | '\\'\\'' ~ ( '\\'' ) )* '\\'\\'\\'' )
            // InternalRLS.g:4189:29: '\\'\\'\\'' (~ ( ( '\\'' | '\\\\' ) ) | RULE_ECHAR | '\\'' ~ ( '\\'' ) | '\\'\\'' ~ ( '\\'' ) )* '\\'\\'\\''
            {
            match("'''"); 

            // InternalRLS.g:4189:38: (~ ( ( '\\'' | '\\\\' ) ) | RULE_ECHAR | '\\'' ~ ( '\\'' ) | '\\'\\'' ~ ( '\\'' ) )*
            loop26:
            do {
                int alt26=5;
                int LA26_0 = input.LA(1);

                if ( (LA26_0=='\'') ) {
                    int LA26_1 = input.LA(2);

                    if ( (LA26_1=='\'') ) {
                        int LA26_4 = input.LA(3);

                        if ( ((LA26_4>='\u0000' && LA26_4<='&')||(LA26_4>='(' && LA26_4<='\uFFFF')) ) {
                            alt26=4;
                        }


                    }
                    else if ( ((LA26_1>='\u0000' && LA26_1<='&')||(LA26_1>='(' && LA26_1<='\uFFFF')) ) {
                        alt26=3;
                    }


                }
                else if ( ((LA26_0>='\u0000' && LA26_0<='&')||(LA26_0>='(' && LA26_0<='[')||(LA26_0>=']' && LA26_0<='\uFFFF')) ) {
                    alt26=1;
                }
                else if ( (LA26_0=='\\') ) {
                    alt26=2;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalRLS.g:4189:39: ~ ( ( '\\'' | '\\\\' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;
            	case 2 :
            	    // InternalRLS.g:4189:54: RULE_ECHAR
            	    {
            	    mRULE_ECHAR(); 

            	    }
            	    break;
            	case 3 :
            	    // InternalRLS.g:4189:65: '\\'' ~ ( '\\'' )
            	    {
            	    match('\''); 
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;
            	case 4 :
            	    // InternalRLS.g:4189:78: '\\'\\'' ~ ( '\\'' )
            	    {
            	    match("''"); 

            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            match("'''"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING_LITERAL_LONG1"

    // $ANTLR start "RULE_STRING_LITERAL_LONG2"
    public final void mRULE_STRING_LITERAL_LONG2() throws RecognitionException {
        try {
            int _type = RULE_STRING_LITERAL_LONG2;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRLS.g:4191:27: ( '\"\"\"' (~ ( ( '\"' | '\\\\' ) ) | RULE_ECHAR | '\"' ~ ( '\"' ) | '\"\"' ~ ( '\"' ) )* '\"\"\"' )
            // InternalRLS.g:4191:29: '\"\"\"' (~ ( ( '\"' | '\\\\' ) ) | RULE_ECHAR | '\"' ~ ( '\"' ) | '\"\"' ~ ( '\"' ) )* '\"\"\"'
            {
            match("\"\"\""); 

            // InternalRLS.g:4191:35: (~ ( ( '\"' | '\\\\' ) ) | RULE_ECHAR | '\"' ~ ( '\"' ) | '\"\"' ~ ( '\"' ) )*
            loop27:
            do {
                int alt27=5;
                int LA27_0 = input.LA(1);

                if ( (LA27_0=='\"') ) {
                    int LA27_1 = input.LA(2);

                    if ( (LA27_1=='\"') ) {
                        int LA27_4 = input.LA(3);

                        if ( ((LA27_4>='\u0000' && LA27_4<='!')||(LA27_4>='#' && LA27_4<='\uFFFF')) ) {
                            alt27=4;
                        }


                    }
                    else if ( ((LA27_1>='\u0000' && LA27_1<='!')||(LA27_1>='#' && LA27_1<='\uFFFF')) ) {
                        alt27=3;
                    }


                }
                else if ( ((LA27_0>='\u0000' && LA27_0<='!')||(LA27_0>='#' && LA27_0<='[')||(LA27_0>=']' && LA27_0<='\uFFFF')) ) {
                    alt27=1;
                }
                else if ( (LA27_0=='\\') ) {
                    alt27=2;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalRLS.g:4191:36: ~ ( ( '\"' | '\\\\' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;
            	case 2 :
            	    // InternalRLS.g:4191:50: RULE_ECHAR
            	    {
            	    mRULE_ECHAR(); 

            	    }
            	    break;
            	case 3 :
            	    // InternalRLS.g:4191:61: '\"' ~ ( '\"' )
            	    {
            	    match('\"'); 
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;
            	case 4 :
            	    // InternalRLS.g:4191:72: '\"\"' ~ ( '\"' )
            	    {
            	    match("\"\""); 

            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

            match("\"\"\""); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING_LITERAL_LONG2"

    // $ANTLR start "RULE_ECHAR"
    public final void mRULE_ECHAR() throws RecognitionException {
        try {
            // InternalRLS.g:4193:21: ( '\\\\' ( 't' | 'b' | 'n' | 'r' | 'f' | '\\\\' | '\"' | '\\'' ) )
            // InternalRLS.g:4193:23: '\\\\' ( 't' | 'b' | 'n' | 'r' | 'f' | '\\\\' | '\"' | '\\'' )
            {
            match('\\'); 
            if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_ECHAR"

    // $ANTLR start "RULE_IRI"
    public final void mRULE_IRI() throws RecognitionException {
        try {
            int _type = RULE_IRI;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRLS.g:4195:10: ( '<' (~ ( ( '>' | '<' | '\"' | '{' | '}' | '^' | '\\\\' | '|' | '`' | '\\u0000' .. ' ' ) ) )* '>' )
            // InternalRLS.g:4195:12: '<' (~ ( ( '>' | '<' | '\"' | '{' | '}' | '^' | '\\\\' | '|' | '`' | '\\u0000' .. ' ' ) ) )* '>'
            {
            match('<'); 
            // InternalRLS.g:4195:16: (~ ( ( '>' | '<' | '\"' | '{' | '}' | '^' | '\\\\' | '|' | '`' | '\\u0000' .. ' ' ) ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0=='!'||(LA28_0>='#' && LA28_0<=';')||LA28_0=='='||(LA28_0>='?' && LA28_0<='[')||LA28_0==']'||LA28_0=='_'||(LA28_0>='a' && LA28_0<='z')||(LA28_0>='~' && LA28_0<='\uFFFF')) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalRLS.g:4195:16: ~ ( ( '>' | '<' | '\"' | '{' | '}' | '^' | '\\\\' | '|' | '`' | '\\u0000' .. ' ' ) )
            	    {
            	    if ( input.LA(1)=='!'||(input.LA(1)>='#' && input.LA(1)<=';')||input.LA(1)=='='||(input.LA(1)>='?' && input.LA(1)<='[')||input.LA(1)==']'||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z')||(input.LA(1)>='~' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_IRI"

    // $ANTLR start "RULE_PNAME_LN"
    public final void mRULE_PNAME_LN() throws RecognitionException {
        try {
            int _type = RULE_PNAME_LN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRLS.g:4197:15: ( ( RULE_PN_PREFIX )? ':' RULE_PN_LOCAL )
            // InternalRLS.g:4197:17: ( RULE_PN_PREFIX )? ':' RULE_PN_LOCAL
            {
            // InternalRLS.g:4197:17: ( RULE_PN_PREFIX )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( ((LA29_0>='A' && LA29_0<='Z')||(LA29_0>='a' && LA29_0<='z')||(LA29_0>='\u00C0' && LA29_0<='\u00D6')||(LA29_0>='\u00D8' && LA29_0<='\u00F6')||(LA29_0>='\u00F8' && LA29_0<='\u02FF')||(LA29_0>='\u0370' && LA29_0<='\u037D')||(LA29_0>='\u037F' && LA29_0<='\u1FFF')||(LA29_0>='\u200C' && LA29_0<='\u200D')||(LA29_0>='\u2070' && LA29_0<='\u218F')||(LA29_0>='\u2C00' && LA29_0<='\u2FEF')||(LA29_0>='\u3001' && LA29_0<='\uD7FF')||(LA29_0>='\uF900' && LA29_0<='\uFFFD')) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalRLS.g:4197:17: RULE_PN_PREFIX
                    {
                    mRULE_PN_PREFIX(); 

                    }
                    break;

            }

            match(':'); 
            mRULE_PN_LOCAL(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_PNAME_LN"

    // $ANTLR start "RULE_PNAME_NS"
    public final void mRULE_PNAME_NS() throws RecognitionException {
        try {
            int _type = RULE_PNAME_NS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRLS.g:4199:15: ( RULE_PN_PREFIX ':' )
            // InternalRLS.g:4199:17: RULE_PN_PREFIX ':'
            {
            mRULE_PN_PREFIX(); 
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_PNAME_NS"

    // $ANTLR start "RULE_UNIVAR"
    public final void mRULE_UNIVAR() throws RecognitionException {
        try {
            int _type = RULE_UNIVAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRLS.g:4201:13: ( RULE_QMARK RULE_VARORPREDNAME )
            // InternalRLS.g:4201:15: RULE_QMARK RULE_VARORPREDNAME
            {
            mRULE_QMARK(); 
            mRULE_VARORPREDNAME(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_UNIVAR"

    // $ANTLR start "RULE_EXIVAR"
    public final void mRULE_EXIVAR() throws RecognitionException {
        try {
            int _type = RULE_EXIVAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRLS.g:4203:13: ( RULE_EMARK RULE_VARORPREDNAME )
            // InternalRLS.g:4203:15: RULE_EMARK RULE_VARORPREDNAME
            {
            mRULE_EMARK(); 
            mRULE_VARORPREDNAME(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_EXIVAR"

    // $ANTLR start "RULE_LANGTAG"
    public final void mRULE_LANGTAG() throws RecognitionException {
        try {
            int _type = RULE_LANGTAG;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRLS.g:4205:14: ( RULE_AT ( RULE_A2Z )+ ( '-' ( RULE_A2ZN )+ )* )
            // InternalRLS.g:4205:16: RULE_AT ( RULE_A2Z )+ ( '-' ( RULE_A2ZN )+ )*
            {
            mRULE_AT(); 
            // InternalRLS.g:4205:24: ( RULE_A2Z )+
            int cnt30=0;
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( ((LA30_0>='A' && LA30_0<='Z')||(LA30_0>='a' && LA30_0<='z')) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalRLS.g:4205:24: RULE_A2Z
            	    {
            	    mRULE_A2Z(); 

            	    }
            	    break;

            	default :
            	    if ( cnt30 >= 1 ) break loop30;
                        EarlyExitException eee =
                            new EarlyExitException(30, input);
                        throw eee;
                }
                cnt30++;
            } while (true);

            // InternalRLS.g:4205:34: ( '-' ( RULE_A2ZN )+ )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0=='-') ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalRLS.g:4205:35: '-' ( RULE_A2ZN )+
            	    {
            	    match('-'); 
            	    // InternalRLS.g:4205:39: ( RULE_A2ZN )+
            	    int cnt31=0;
            	    loop31:
            	    do {
            	        int alt31=2;
            	        int LA31_0 = input.LA(1);

            	        if ( ((LA31_0>='0' && LA31_0<='9')||(LA31_0>='A' && LA31_0<='Z')||(LA31_0>='a' && LA31_0<='z')) ) {
            	            alt31=1;
            	        }


            	        switch (alt31) {
            	    	case 1 :
            	    	    // InternalRLS.g:4205:39: RULE_A2ZN
            	    	    {
            	    	    mRULE_A2ZN(); 

            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt31 >= 1 ) break loop31;
            	                EarlyExitException eee =
            	                    new EarlyExitException(31, input);
            	                throw eee;
            	        }
            	        cnt31++;
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LANGTAG"

    // $ANTLR start "RULE_VARORPREDNAME"
    public final void mRULE_VARORPREDNAME() throws RecognitionException {
        try {
            int _type = RULE_VARORPREDNAME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRLS.g:4207:20: ( RULE_A2Z ( RULE_A2ZN )* )
            // InternalRLS.g:4207:22: RULE_A2Z ( RULE_A2ZN )*
            {
            mRULE_A2Z(); 
            // InternalRLS.g:4207:31: ( RULE_A2ZN )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( ((LA33_0>='0' && LA33_0<='9')||(LA33_0>='A' && LA33_0<='Z')||(LA33_0>='a' && LA33_0<='z')) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalRLS.g:4207:31: RULE_A2ZN
            	    {
            	    mRULE_A2ZN(); 

            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_VARORPREDNAME"

    // $ANTLR start "RULE_A2Z"
    public final void mRULE_A2Z() throws RecognitionException {
        try {
            // InternalRLS.g:4209:19: ( ( 'a' .. 'z' | 'A' .. 'Z' ) )
            // InternalRLS.g:4209:21: ( 'a' .. 'z' | 'A' .. 'Z' )
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_A2Z"

    // $ANTLR start "RULE_A2ZN"
    public final void mRULE_A2ZN() throws RecognitionException {
        try {
            // InternalRLS.g:4211:20: ( ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' ) )
            // InternalRLS.g:4211:22: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )
            {
            if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_A2ZN"

    // $ANTLR start "RULE_DIRECTIVENAME"
    public final void mRULE_DIRECTIVENAME() throws RecognitionException {
        try {
            int _type = RULE_DIRECTIVENAME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRLS.g:4213:20: ( ( RULE_AT 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '-' | '_' )* )
            // InternalRLS.g:4213:22: ( RULE_AT 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '-' | '_' )*
            {
            // InternalRLS.g:4213:22: ( RULE_AT 'a' .. 'z' | 'A' .. 'Z' )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0=='@') ) {
                alt34=1;
            }
            else if ( ((LA34_0>='A' && LA34_0<='Z')) ) {
                alt34=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // InternalRLS.g:4213:23: RULE_AT 'a' .. 'z'
                    {
                    mRULE_AT(); 
                    matchRange('a','z'); 

                    }
                    break;
                case 2 :
                    // InternalRLS.g:4213:40: 'A' .. 'Z'
                    {
                    matchRange('A','Z'); 

                    }
                    break;

            }

            // InternalRLS.g:4213:50: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '-' | '_' )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0=='-'||(LA35_0>='0' && LA35_0<='9')||(LA35_0>='A' && LA35_0<='Z')||LA35_0=='_'||(LA35_0>='a' && LA35_0<='z')) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalRLS.g:
            	    {
            	    if ( input.LA(1)=='-'||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DIRECTIVENAME"

    // $ANTLR start "RULE_A2ZNX"
    public final void mRULE_A2ZNX() throws RecognitionException {
        try {
            int _type = RULE_A2ZNX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRLS.g:4215:12: ( ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '-' | '_' ) )
            // InternalRLS.g:4215:14: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '-' | '_' )
            {
            if ( input.LA(1)=='-'||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_A2ZNX"

    // $ANTLR start "RULE_LPAREN"
    public final void mRULE_LPAREN() throws RecognitionException {
        try {
            int _type = RULE_LPAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRLS.g:4217:13: ( '(' )
            // InternalRLS.g:4217:15: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LPAREN"

    // $ANTLR start "RULE_RPAREN"
    public final void mRULE_RPAREN() throws RecognitionException {
        try {
            int _type = RULE_RPAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRLS.g:4219:13: ( ')' )
            // InternalRLS.g:4219:15: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_RPAREN"

    // $ANTLR start "RULE_COMMA"
    public final void mRULE_COMMA() throws RecognitionException {
        try {
            int _type = RULE_COMMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRLS.g:4221:12: ( ',' )
            // InternalRLS.g:4221:14: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_COMMA"

    // $ANTLR start "RULE_DOT"
    public final void mRULE_DOT() throws RecognitionException {
        try {
            int _type = RULE_DOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRLS.g:4223:10: ( '.' )
            // InternalRLS.g:4223:12: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DOT"

    // $ANTLR start "RULE_ARROW"
    public final void mRULE_ARROW() throws RecognitionException {
        try {
            int _type = RULE_ARROW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRLS.g:4225:12: ( ':-' )
            // InternalRLS.g:4225:14: ':-'
            {
            match(":-"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ARROW"

    // $ANTLR start "RULE_QMARK"
    public final void mRULE_QMARK() throws RecognitionException {
        try {
            // InternalRLS.g:4227:21: ( '?' )
            // InternalRLS.g:4227:23: '?'
            {
            match('?'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_QMARK"

    // $ANTLR start "RULE_EMARK"
    public final void mRULE_EMARK() throws RecognitionException {
        try {
            // InternalRLS.g:4229:21: ( '!' )
            // InternalRLS.g:4229:23: '!'
            {
            match('!'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_EMARK"

    // $ANTLR start "RULE_TILDE"
    public final void mRULE_TILDE() throws RecognitionException {
        try {
            int _type = RULE_TILDE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRLS.g:4231:12: ( '~' )
            // InternalRLS.g:4231:14: '~'
            {
            match('~'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_TILDE"

    // $ANTLR start "RULE_COLON"
    public final void mRULE_COLON() throws RecognitionException {
        try {
            int _type = RULE_COLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRLS.g:4233:12: ( ':' )
            // InternalRLS.g:4233:14: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_COLON"

    // $ANTLR start "RULE_DATATYPE"
    public final void mRULE_DATATYPE() throws RecognitionException {
        try {
            int _type = RULE_DATATYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRLS.g:4235:15: ( '^^' )
            // InternalRLS.g:4235:17: '^^'
            {
            match("^^"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DATATYPE"

    // $ANTLR start "RULE_AT"
    public final void mRULE_AT() throws RecognitionException {
        try {
            // InternalRLS.g:4237:18: ( '@' )
            // InternalRLS.g:4237:20: '@'
            {
            match('@'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_AT"

    // $ANTLR start "RULE_PN_CHARS_BASE"
    public final void mRULE_PN_CHARS_BASE() throws RecognitionException {
        try {
            // InternalRLS.g:4239:29: ( ( 'A' .. 'Z' | 'a' .. 'z' | '\\u00C0' .. '\\u00D6' | '\\u00D8' .. '\\u00F6' | '\\u00F8' .. '\\u02FF' | '\\u0370' .. '\\u037D' | '\\u037F' .. '\\u1FFF' | '\\u200C' .. '\\u200D' | '\\u2070' .. '\\u218F' | '\\u2C00' .. '\\u2FEF' | '\\u3001' .. '\\uD7FF' | '\\uF900' .. '\\uFFFD' ) )
            // InternalRLS.g:4239:31: ( 'A' .. 'Z' | 'a' .. 'z' | '\\u00C0' .. '\\u00D6' | '\\u00D8' .. '\\u00F6' | '\\u00F8' .. '\\u02FF' | '\\u0370' .. '\\u037D' | '\\u037F' .. '\\u1FFF' | '\\u200C' .. '\\u200D' | '\\u2070' .. '\\u218F' | '\\u2C00' .. '\\u2FEF' | '\\u3001' .. '\\uD7FF' | '\\uF900' .. '\\uFFFD' )
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z')||(input.LA(1)>='\u00C0' && input.LA(1)<='\u00D6')||(input.LA(1)>='\u00D8' && input.LA(1)<='\u00F6')||(input.LA(1)>='\u00F8' && input.LA(1)<='\u02FF')||(input.LA(1)>='\u0370' && input.LA(1)<='\u037D')||(input.LA(1)>='\u037F' && input.LA(1)<='\u1FFF')||(input.LA(1)>='\u200C' && input.LA(1)<='\u200D')||(input.LA(1)>='\u2070' && input.LA(1)<='\u218F')||(input.LA(1)>='\u2C00' && input.LA(1)<='\u2FEF')||(input.LA(1)>='\u3001' && input.LA(1)<='\uD7FF')||(input.LA(1)>='\uF900' && input.LA(1)<='\uFFFD') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_PN_CHARS_BASE"

    // $ANTLR start "RULE_PN_CHARS_U"
    public final void mRULE_PN_CHARS_U() throws RecognitionException {
        try {
            // InternalRLS.g:4241:26: ( ( RULE_PN_CHARS_BASE | '_' ) )
            // InternalRLS.g:4241:28: ( RULE_PN_CHARS_BASE | '_' )
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z')||(input.LA(1)>='\u00C0' && input.LA(1)<='\u00D6')||(input.LA(1)>='\u00D8' && input.LA(1)<='\u00F6')||(input.LA(1)>='\u00F8' && input.LA(1)<='\u02FF')||(input.LA(1)>='\u0370' && input.LA(1)<='\u037D')||(input.LA(1)>='\u037F' && input.LA(1)<='\u1FFF')||(input.LA(1)>='\u200C' && input.LA(1)<='\u200D')||(input.LA(1)>='\u2070' && input.LA(1)<='\u218F')||(input.LA(1)>='\u2C00' && input.LA(1)<='\u2FEF')||(input.LA(1)>='\u3001' && input.LA(1)<='\uD7FF')||(input.LA(1)>='\uF900' && input.LA(1)<='\uFFFD') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_PN_CHARS_U"

    // $ANTLR start "RULE_PN_CHARS"
    public final void mRULE_PN_CHARS() throws RecognitionException {
        try {
            // InternalRLS.g:4243:24: ( ( RULE_PN_CHARS_U | '-' | '0' .. '9' | '\\u00B7' | '\\u0300' .. '\\u036F' | '\\u203F' .. '\\u2040' ) )
            // InternalRLS.g:4243:26: ( RULE_PN_CHARS_U | '-' | '0' .. '9' | '\\u00B7' | '\\u0300' .. '\\u036F' | '\\u203F' .. '\\u2040' )
            {
            if ( input.LA(1)=='-'||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z')||input.LA(1)=='\u00B7'||(input.LA(1)>='\u00C0' && input.LA(1)<='\u00D6')||(input.LA(1)>='\u00D8' && input.LA(1)<='\u00F6')||(input.LA(1)>='\u00F8' && input.LA(1)<='\u037D')||(input.LA(1)>='\u037F' && input.LA(1)<='\u1FFF')||(input.LA(1)>='\u200C' && input.LA(1)<='\u200D')||(input.LA(1)>='\u203F' && input.LA(1)<='\u2040')||(input.LA(1)>='\u2070' && input.LA(1)<='\u218F')||(input.LA(1)>='\u2C00' && input.LA(1)<='\u2FEF')||(input.LA(1)>='\u3001' && input.LA(1)<='\uD7FF')||(input.LA(1)>='\uF900' && input.LA(1)<='\uFFFD') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_PN_CHARS"

    // $ANTLR start "RULE_PN_PREFIX"
    public final void mRULE_PN_PREFIX() throws RecognitionException {
        try {
            // InternalRLS.g:4245:25: ( RULE_PN_CHARS_BASE ( ( RULE_PN_CHARS | '.' )* RULE_PN_CHARS )? )
            // InternalRLS.g:4245:27: RULE_PN_CHARS_BASE ( ( RULE_PN_CHARS | '.' )* RULE_PN_CHARS )?
            {
            mRULE_PN_CHARS_BASE(); 
            // InternalRLS.g:4245:46: ( ( RULE_PN_CHARS | '.' )* RULE_PN_CHARS )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( ((LA37_0>='-' && LA37_0<='.')||(LA37_0>='0' && LA37_0<='9')||(LA37_0>='A' && LA37_0<='Z')||LA37_0=='_'||(LA37_0>='a' && LA37_0<='z')||LA37_0=='\u00B7'||(LA37_0>='\u00C0' && LA37_0<='\u00D6')||(LA37_0>='\u00D8' && LA37_0<='\u00F6')||(LA37_0>='\u00F8' && LA37_0<='\u037D')||(LA37_0>='\u037F' && LA37_0<='\u1FFF')||(LA37_0>='\u200C' && LA37_0<='\u200D')||(LA37_0>='\u203F' && LA37_0<='\u2040')||(LA37_0>='\u2070' && LA37_0<='\u218F')||(LA37_0>='\u2C00' && LA37_0<='\u2FEF')||(LA37_0>='\u3001' && LA37_0<='\uD7FF')||(LA37_0>='\uF900' && LA37_0<='\uFFFD')) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalRLS.g:4245:47: ( RULE_PN_CHARS | '.' )* RULE_PN_CHARS
                    {
                    // InternalRLS.g:4245:47: ( RULE_PN_CHARS | '.' )*
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( (LA36_0=='-'||(LA36_0>='0' && LA36_0<='9')||(LA36_0>='A' && LA36_0<='Z')||LA36_0=='_'||(LA36_0>='a' && LA36_0<='z')||LA36_0=='\u00B7'||(LA36_0>='\u00C0' && LA36_0<='\u00D6')||(LA36_0>='\u00D8' && LA36_0<='\u00F6')||(LA36_0>='\u00F8' && LA36_0<='\u037D')||(LA36_0>='\u037F' && LA36_0<='\u1FFF')||(LA36_0>='\u200C' && LA36_0<='\u200D')||(LA36_0>='\u203F' && LA36_0<='\u2040')||(LA36_0>='\u2070' && LA36_0<='\u218F')||(LA36_0>='\u2C00' && LA36_0<='\u2FEF')||(LA36_0>='\u3001' && LA36_0<='\uD7FF')||(LA36_0>='\uF900' && LA36_0<='\uFFFD')) ) {
                            int LA36_1 = input.LA(2);

                            if ( ((LA36_1>='-' && LA36_1<='.')||(LA36_1>='0' && LA36_1<='9')||(LA36_1>='A' && LA36_1<='Z')||LA36_1=='_'||(LA36_1>='a' && LA36_1<='z')||LA36_1=='\u00B7'||(LA36_1>='\u00C0' && LA36_1<='\u00D6')||(LA36_1>='\u00D8' && LA36_1<='\u00F6')||(LA36_1>='\u00F8' && LA36_1<='\u037D')||(LA36_1>='\u037F' && LA36_1<='\u1FFF')||(LA36_1>='\u200C' && LA36_1<='\u200D')||(LA36_1>='\u203F' && LA36_1<='\u2040')||(LA36_1>='\u2070' && LA36_1<='\u218F')||(LA36_1>='\u2C00' && LA36_1<='\u2FEF')||(LA36_1>='\u3001' && LA36_1<='\uD7FF')||(LA36_1>='\uF900' && LA36_1<='\uFFFD')) ) {
                                alt36=1;
                            }


                        }
                        else if ( (LA36_0=='.') ) {
                            alt36=1;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // InternalRLS.g:
                    	    {
                    	    if ( (input.LA(1)>='-' && input.LA(1)<='.')||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z')||input.LA(1)=='\u00B7'||(input.LA(1)>='\u00C0' && input.LA(1)<='\u00D6')||(input.LA(1)>='\u00D8' && input.LA(1)<='\u00F6')||(input.LA(1)>='\u00F8' && input.LA(1)<='\u037D')||(input.LA(1)>='\u037F' && input.LA(1)<='\u1FFF')||(input.LA(1)>='\u200C' && input.LA(1)<='\u200D')||(input.LA(1)>='\u203F' && input.LA(1)<='\u2040')||(input.LA(1)>='\u2070' && input.LA(1)<='\u218F')||(input.LA(1)>='\u2C00' && input.LA(1)<='\u2FEF')||(input.LA(1)>='\u3001' && input.LA(1)<='\uD7FF')||(input.LA(1)>='\uF900' && input.LA(1)<='\uFFFD') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop36;
                        }
                    } while (true);

                    mRULE_PN_CHARS(); 

                    }
                    break;

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_PN_PREFIX"

    // $ANTLR start "RULE_PN_LOCAL"
    public final void mRULE_PN_LOCAL() throws RecognitionException {
        try {
            // InternalRLS.g:4247:24: ( ( RULE_PN_CHARS_U | ':' | '0' .. '9' ) ( ( RULE_PN_CHARS | '.' | ':' )* RULE_PN_CHARS )? )
            // InternalRLS.g:4247:26: ( RULE_PN_CHARS_U | ':' | '0' .. '9' ) ( ( RULE_PN_CHARS | '.' | ':' )* RULE_PN_CHARS )?
            {
            if ( (input.LA(1)>='0' && input.LA(1)<=':')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z')||(input.LA(1)>='\u00C0' && input.LA(1)<='\u00D6')||(input.LA(1)>='\u00D8' && input.LA(1)<='\u00F6')||(input.LA(1)>='\u00F8' && input.LA(1)<='\u02FF')||(input.LA(1)>='\u0370' && input.LA(1)<='\u037D')||(input.LA(1)>='\u037F' && input.LA(1)<='\u1FFF')||(input.LA(1)>='\u200C' && input.LA(1)<='\u200D')||(input.LA(1)>='\u2070' && input.LA(1)<='\u218F')||(input.LA(1)>='\u2C00' && input.LA(1)<='\u2FEF')||(input.LA(1)>='\u3001' && input.LA(1)<='\uD7FF')||(input.LA(1)>='\uF900' && input.LA(1)<='\uFFFD') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalRLS.g:4247:57: ( ( RULE_PN_CHARS | '.' | ':' )* RULE_PN_CHARS )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( ((LA39_0>='-' && LA39_0<='.')||(LA39_0>='0' && LA39_0<=':')||(LA39_0>='A' && LA39_0<='Z')||LA39_0=='_'||(LA39_0>='a' && LA39_0<='z')||LA39_0=='\u00B7'||(LA39_0>='\u00C0' && LA39_0<='\u00D6')||(LA39_0>='\u00D8' && LA39_0<='\u00F6')||(LA39_0>='\u00F8' && LA39_0<='\u037D')||(LA39_0>='\u037F' && LA39_0<='\u1FFF')||(LA39_0>='\u200C' && LA39_0<='\u200D')||(LA39_0>='\u203F' && LA39_0<='\u2040')||(LA39_0>='\u2070' && LA39_0<='\u218F')||(LA39_0>='\u2C00' && LA39_0<='\u2FEF')||(LA39_0>='\u3001' && LA39_0<='\uD7FF')||(LA39_0>='\uF900' && LA39_0<='\uFFFD')) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalRLS.g:4247:58: ( RULE_PN_CHARS | '.' | ':' )* RULE_PN_CHARS
                    {
                    // InternalRLS.g:4247:58: ( RULE_PN_CHARS | '.' | ':' )*
                    loop38:
                    do {
                        int alt38=2;
                        int LA38_0 = input.LA(1);

                        if ( (LA38_0=='-'||(LA38_0>='0' && LA38_0<='9')||(LA38_0>='A' && LA38_0<='Z')||LA38_0=='_'||(LA38_0>='a' && LA38_0<='z')||LA38_0=='\u00B7'||(LA38_0>='\u00C0' && LA38_0<='\u00D6')||(LA38_0>='\u00D8' && LA38_0<='\u00F6')||(LA38_0>='\u00F8' && LA38_0<='\u037D')||(LA38_0>='\u037F' && LA38_0<='\u1FFF')||(LA38_0>='\u200C' && LA38_0<='\u200D')||(LA38_0>='\u203F' && LA38_0<='\u2040')||(LA38_0>='\u2070' && LA38_0<='\u218F')||(LA38_0>='\u2C00' && LA38_0<='\u2FEF')||(LA38_0>='\u3001' && LA38_0<='\uD7FF')||(LA38_0>='\uF900' && LA38_0<='\uFFFD')) ) {
                            int LA38_1 = input.LA(2);

                            if ( ((LA38_1>='-' && LA38_1<='.')||(LA38_1>='0' && LA38_1<=':')||(LA38_1>='A' && LA38_1<='Z')||LA38_1=='_'||(LA38_1>='a' && LA38_1<='z')||LA38_1=='\u00B7'||(LA38_1>='\u00C0' && LA38_1<='\u00D6')||(LA38_1>='\u00D8' && LA38_1<='\u00F6')||(LA38_1>='\u00F8' && LA38_1<='\u037D')||(LA38_1>='\u037F' && LA38_1<='\u1FFF')||(LA38_1>='\u200C' && LA38_1<='\u200D')||(LA38_1>='\u203F' && LA38_1<='\u2040')||(LA38_1>='\u2070' && LA38_1<='\u218F')||(LA38_1>='\u2C00' && LA38_1<='\u2FEF')||(LA38_1>='\u3001' && LA38_1<='\uD7FF')||(LA38_1>='\uF900' && LA38_1<='\uFFFD')) ) {
                                alt38=1;
                            }


                        }
                        else if ( (LA38_0=='.'||LA38_0==':') ) {
                            alt38=1;
                        }


                        switch (alt38) {
                    	case 1 :
                    	    // InternalRLS.g:
                    	    {
                    	    if ( (input.LA(1)>='-' && input.LA(1)<='.')||(input.LA(1)>='0' && input.LA(1)<=':')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z')||input.LA(1)=='\u00B7'||(input.LA(1)>='\u00C0' && input.LA(1)<='\u00D6')||(input.LA(1)>='\u00D8' && input.LA(1)<='\u00F6')||(input.LA(1)>='\u00F8' && input.LA(1)<='\u037D')||(input.LA(1)>='\u037F' && input.LA(1)<='\u1FFF')||(input.LA(1)>='\u200C' && input.LA(1)<='\u200D')||(input.LA(1)>='\u203F' && input.LA(1)<='\u2040')||(input.LA(1)>='\u2070' && input.LA(1)<='\u218F')||(input.LA(1)>='\u2C00' && input.LA(1)<='\u2FEF')||(input.LA(1)>='\u3001' && input.LA(1)<='\uD7FF')||(input.LA(1)>='\uF900' && input.LA(1)<='\uFFFD') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop38;
                        }
                    } while (true);

                    mRULE_PN_CHARS(); 

                    }
                    break;

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_PN_LOCAL"

    // $ANTLR start "RULE_NOT"
    public final void mRULE_NOT() throws RecognitionException {
        try {
            int _type = RULE_NOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRLS.g:4249:10: ( '!' )
            // InternalRLS.g:4249:12: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_NOT"

    public void mTokens() throws RecognitionException {
        // InternalRLS.g:1:8: ( T__56 | T__57 | T__58 | T__59 | RULE_E | RULE_ARITY | RULE_PRFX | RULE_BS | RULE_SRC | RULE_LOADCSV | RULE_LOADRDF | RULE_SPARQL | RULE_NAMED_NULL | RULE_INTEGER | RULE_DECIMAL | RULE_DOUBLE | RULE_SKIP | RULE_UNBRACE | RULE_UNBRACKET | RULE_PIPE_DELIMITED_LITERAL | RULE_HASH_DELIMITED_LITERAL | RULE_STRING_LITERAL1 | RULE_STRING_LITERAL2 | RULE_STRING_LITERAL_LONG1 | RULE_STRING_LITERAL_LONG2 | RULE_IRI | RULE_PNAME_LN | RULE_PNAME_NS | RULE_UNIVAR | RULE_EXIVAR | RULE_LANGTAG | RULE_VARORPREDNAME | RULE_DIRECTIVENAME | RULE_A2ZNX | RULE_LPAREN | RULE_RPAREN | RULE_COMMA | RULE_DOT | RULE_ARROW | RULE_TILDE | RULE_COLON | RULE_DATATYPE | RULE_NOT )
        int alt40=43;
        alt40 = dfa40.predict(input);
        switch (alt40) {
            case 1 :
                // InternalRLS.g:1:10: T__56
                {
                mT__56(); 

                }
                break;
            case 2 :
                // InternalRLS.g:1:16: T__57
                {
                mT__57(); 

                }
                break;
            case 3 :
                // InternalRLS.g:1:22: T__58
                {
                mT__58(); 

                }
                break;
            case 4 :
                // InternalRLS.g:1:28: T__59
                {
                mT__59(); 

                }
                break;
            case 5 :
                // InternalRLS.g:1:34: RULE_E
                {
                mRULE_E(); 

                }
                break;
            case 6 :
                // InternalRLS.g:1:41: RULE_ARITY
                {
                mRULE_ARITY(); 

                }
                break;
            case 7 :
                // InternalRLS.g:1:52: RULE_PRFX
                {
                mRULE_PRFX(); 

                }
                break;
            case 8 :
                // InternalRLS.g:1:62: RULE_BS
                {
                mRULE_BS(); 

                }
                break;
            case 9 :
                // InternalRLS.g:1:70: RULE_SRC
                {
                mRULE_SRC(); 

                }
                break;
            case 10 :
                // InternalRLS.g:1:79: RULE_LOADCSV
                {
                mRULE_LOADCSV(); 

                }
                break;
            case 11 :
                // InternalRLS.g:1:92: RULE_LOADRDF
                {
                mRULE_LOADRDF(); 

                }
                break;
            case 12 :
                // InternalRLS.g:1:105: RULE_SPARQL
                {
                mRULE_SPARQL(); 

                }
                break;
            case 13 :
                // InternalRLS.g:1:117: RULE_NAMED_NULL
                {
                mRULE_NAMED_NULL(); 

                }
                break;
            case 14 :
                // InternalRLS.g:1:133: RULE_INTEGER
                {
                mRULE_INTEGER(); 

                }
                break;
            case 15 :
                // InternalRLS.g:1:146: RULE_DECIMAL
                {
                mRULE_DECIMAL(); 

                }
                break;
            case 16 :
                // InternalRLS.g:1:159: RULE_DOUBLE
                {
                mRULE_DOUBLE(); 

                }
                break;
            case 17 :
                // InternalRLS.g:1:171: RULE_SKIP
                {
                mRULE_SKIP(); 

                }
                break;
            case 18 :
                // InternalRLS.g:1:181: RULE_UNBRACE
                {
                mRULE_UNBRACE(); 

                }
                break;
            case 19 :
                // InternalRLS.g:1:194: RULE_UNBRACKET
                {
                mRULE_UNBRACKET(); 

                }
                break;
            case 20 :
                // InternalRLS.g:1:209: RULE_PIPE_DELIMITED_LITERAL
                {
                mRULE_PIPE_DELIMITED_LITERAL(); 

                }
                break;
            case 21 :
                // InternalRLS.g:1:237: RULE_HASH_DELIMITED_LITERAL
                {
                mRULE_HASH_DELIMITED_LITERAL(); 

                }
                break;
            case 22 :
                // InternalRLS.g:1:265: RULE_STRING_LITERAL1
                {
                mRULE_STRING_LITERAL1(); 

                }
                break;
            case 23 :
                // InternalRLS.g:1:286: RULE_STRING_LITERAL2
                {
                mRULE_STRING_LITERAL2(); 

                }
                break;
            case 24 :
                // InternalRLS.g:1:307: RULE_STRING_LITERAL_LONG1
                {
                mRULE_STRING_LITERAL_LONG1(); 

                }
                break;
            case 25 :
                // InternalRLS.g:1:333: RULE_STRING_LITERAL_LONG2
                {
                mRULE_STRING_LITERAL_LONG2(); 

                }
                break;
            case 26 :
                // InternalRLS.g:1:359: RULE_IRI
                {
                mRULE_IRI(); 

                }
                break;
            case 27 :
                // InternalRLS.g:1:368: RULE_PNAME_LN
                {
                mRULE_PNAME_LN(); 

                }
                break;
            case 28 :
                // InternalRLS.g:1:382: RULE_PNAME_NS
                {
                mRULE_PNAME_NS(); 

                }
                break;
            case 29 :
                // InternalRLS.g:1:396: RULE_UNIVAR
                {
                mRULE_UNIVAR(); 

                }
                break;
            case 30 :
                // InternalRLS.g:1:408: RULE_EXIVAR
                {
                mRULE_EXIVAR(); 

                }
                break;
            case 31 :
                // InternalRLS.g:1:420: RULE_LANGTAG
                {
                mRULE_LANGTAG(); 

                }
                break;
            case 32 :
                // InternalRLS.g:1:433: RULE_VARORPREDNAME
                {
                mRULE_VARORPREDNAME(); 

                }
                break;
            case 33 :
                // InternalRLS.g:1:452: RULE_DIRECTIVENAME
                {
                mRULE_DIRECTIVENAME(); 

                }
                break;
            case 34 :
                // InternalRLS.g:1:471: RULE_A2ZNX
                {
                mRULE_A2ZNX(); 

                }
                break;
            case 35 :
                // InternalRLS.g:1:482: RULE_LPAREN
                {
                mRULE_LPAREN(); 

                }
                break;
            case 36 :
                // InternalRLS.g:1:494: RULE_RPAREN
                {
                mRULE_RPAREN(); 

                }
                break;
            case 37 :
                // InternalRLS.g:1:506: RULE_COMMA
                {
                mRULE_COMMA(); 

                }
                break;
            case 38 :
                // InternalRLS.g:1:517: RULE_DOT
                {
                mRULE_DOT(); 

                }
                break;
            case 39 :
                // InternalRLS.g:1:526: RULE_ARROW
                {
                mRULE_ARROW(); 

                }
                break;
            case 40 :
                // InternalRLS.g:1:537: RULE_TILDE
                {
                mRULE_TILDE(); 

                }
                break;
            case 41 :
                // InternalRLS.g:1:548: RULE_COLON
                {
                mRULE_COLON(); 

                }
                break;
            case 42 :
                // InternalRLS.g:1:559: RULE_DATATYPE
                {
                mRULE_DATATYPE(); 

                }
                break;
            case 43 :
                // InternalRLS.g:1:573: RULE_NOT
                {
                mRULE_NOT(); 

                }
                break;

        }

    }


    protected DFA14 dfa14 = new DFA14(this);
    protected DFA40 dfa40 = new DFA40(this);
    static final String DFA14_eotS =
        "\5\uffff";
    static final String DFA14_eofS =
        "\5\uffff";
    static final String DFA14_minS =
        "\2\56\3\uffff";
    static final String DFA14_maxS =
        "\1\71\1\145\3\uffff";
    static final String DFA14_acceptS =
        "\2\uffff\1\2\1\3\1\1";
    static final String DFA14_specialS =
        "\5\uffff}>";
    static final String[] DFA14_transitionS = {
            "\1\2\1\uffff\12\1",
            "\1\4\1\uffff\12\1\13\uffff\1\3\37\uffff\1\3",
            "",
            "",
            ""
    };

    static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
    static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
    static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
    static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
    static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
    static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
    static final short[][] DFA14_transition;

    static {
        int numStates = DFA14_transitionS.length;
        DFA14_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
        }
    }

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = DFA14_eot;
            this.eof = DFA14_eof;
            this.min = DFA14_min;
            this.max = DFA14_max;
            this.accept = DFA14_accept;
            this.special = DFA14_special;
            this.transition = DFA14_transition;
        }
        public String getDescription() {
            return "4169:26: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* RULE_EXPONENT | '.' ( '0' .. '9' )+ RULE_EXPONENT | ( '0' .. '9' )+ RULE_EXPONENT )";
        }
    }
    static final String DFA40_eotS =
        "\1\5\1\40\1\uffff\1\42\3\uffff\2\53\2\62\1\65\1\70\6\uffff\1\53\1\101\1\uffff\1\103\1\uffff\1\53\14\uffff\4\51\1\uffff\1\53\1\uffff\1\53\2\uffff\1\115\1\53\2\uffff\1\65\2\uffff\1\120\2\uffff\1\120\1\73\1\uffff\1\75\1\uffff\1\53\1\111\6\uffff\1\51\1\111\1\51\1\uffff\2\51\1\53\1\uffff\1\53\1\120\4\uffff\4\51\2\53\3\51\1\uffff\1\53\1\51\1\uffff\1\51\2\uffff\1\151\1\51\1\153\5\uffff\1\156\1\157\2\uffff";
    static final String DFA40_eofS =
        "\160\uffff";
    static final String DFA40_minS =
        "\1\11\1\0\1\uffff\1\0\2\uffff\1\101\2\55\1\72\2\56\1\60\3\uffff\2\0\1\uffff\2\55\1\uffff\1\101\2\55\1\56\7\uffff\1\0\1\uffff\1\0\1\uffff\4\55\1\uffff\1\55\1\uffff\3\55\1\60\1\55\2\uffff\1\56\1\60\1\uffff\1\60\2\uffff\1\60\1\47\1\uffff\1\42\1\uffff\2\55\6\uffff\1\55\1\60\1\55\1\uffff\3\55\1\uffff\1\55\1\60\4\uffff\7\55\1\40\4\55\1\uffff\4\55\1\40\3\55\3\uffff\2\55\2\uffff";
    static final String DFA40_maxS =
        "\1\ufffd\1\uffff\1\uffff\1\uffff\2\uffff\1\172\2\ufffd\1\72\1\71\1\145\1\71\3\uffff\2\uffff\1\uffff\2\ufffd\1\uffff\1\172\2\ufffd\1\71\7\uffff\1\uffff\1\uffff\1\uffff\1\uffff\4\172\1\uffff\1\ufffd\1\uffff\5\ufffd\2\uffff\1\145\1\71\1\uffff\1\145\2\uffff\1\145\1\47\1\uffff\1\42\1\uffff\2\ufffd\6\uffff\3\172\1\uffff\2\172\1\ufffd\1\uffff\1\ufffd\1\145\4\uffff\4\172\2\ufffd\3\172\2\ufffd\1\172\1\uffff\1\172\3\ufffd\2\172\2\ufffd\3\uffff\2\ufffd\2\uffff";
    static final String DFA40_acceptS =
        "\2\uffff\1\2\1\uffff\1\4\1\5\7\uffff\1\21\1\24\1\25\2\uffff\1\32\2\uffff\1\35\4\uffff\1\43\1\44\1\45\1\50\1\52\1\22\1\1\1\uffff\1\3\1\uffff\1\23\4\uffff\1\37\1\uffff\1\40\5\uffff\1\15\1\42\2\uffff\1\16\1\uffff\1\20\1\46\2\uffff\1\26\1\uffff\1\27\2\uffff\1\47\1\51\1\33\1\53\1\36\1\6\3\uffff\1\41\3\uffff\1\34\2\uffff\1\17\1\30\1\31\1\6\14\uffff\1\10\10\uffff\1\14\1\7\1\11\2\uffff\1\12\1\13";
    static final String DFA40_specialS =
        "\1\uffff\1\0\1\uffff\1\1\14\uffff\1\5\1\3\17\uffff\1\4\1\uffff\1\2\114\uffff}>";
    static final String[] DFA40_transitionS = {
            "\2\15\1\uffff\2\15\22\uffff\1\15\1\26\1\21\1\17\1\uffff\1\15\1\uffff\1\20\1\32\1\33\1\uffff\1\31\1\34\1\12\1\14\1\uffff\12\13\1\24\1\uffff\1\22\2\uffff\1\25\1\6\32\23\1\3\1\uffff\1\4\1\36\1\11\1\uffff\13\30\1\7\6\30\1\10\7\30\1\1\1\16\1\2\1\35\101\uffff\27\27\1\uffff\37\27\1\uffff\u0208\27\160\uffff\16\27\1\uffff\u1c81\27\14\uffff\2\27\142\uffff\u0120\27\u0a70\uffff\u03f0\27\21\uffff\ua7ff\27\u2100\uffff\u06fe\27",
            "\173\37\1\uffff\1\37\1\uffff\uff82\37",
            "",
            "\53\44\1\41\1\44\1\41\2\44\12\43\41\44\1\uffff\1\44\1\uffff\uffa2\44",
            "",
            "",
            "\32\51\6\uffff\1\50\1\46\15\50\1\45\2\50\1\47\7\50",
            "\1\55\1\56\1\uffff\12\54\1\57\6\uffff\32\54\4\uffff\1\55\1\uffff\16\54\1\52\13\54\74\uffff\1\55\10\uffff\27\55\1\uffff\37\55\1\uffff\u0286\55\1\uffff\u1c81\55\14\uffff\2\55\61\uffff\2\55\57\uffff\u0120\55\u0a70\uffff\u03f0\55\21\uffff\ua7ff\55\u2100\uffff\u06fe\55",
            "\1\55\1\56\1\uffff\12\54\1\57\6\uffff\32\54\4\uffff\1\55\1\uffff\17\54\1\60\12\54\74\uffff\1\55\10\uffff\27\55\1\uffff\37\55\1\uffff\u0286\55\1\uffff\u1c81\55\14\uffff\2\55\61\uffff\2\55\57\uffff\u0120\55\u0a70\uffff\u03f0\55\21\uffff\ua7ff\55\u2100\uffff\u06fe\55",
            "\1\61",
            "\1\64\1\uffff\12\63",
            "\1\66\1\uffff\12\63\13\uffff\1\67\37\uffff\1\67",
            "\12\71",
            "",
            "",
            "",
            "\12\73\1\uffff\2\73\1\uffff\31\73\1\72\uffd8\73",
            "\12\75\1\uffff\2\75\1\uffff\24\75\1\74\uffdd\75",
            "",
            "\1\77\1\56\1\uffff\12\76\1\57\6\uffff\32\76\4\uffff\1\77\1\uffff\32\76\74\uffff\1\55\10\uffff\27\55\1\uffff\37\55\1\uffff\u0286\55\1\uffff\u1c81\55\14\uffff\2\55\61\uffff\2\55\57\uffff\u0120\55\u0a70\uffff\u03f0\55\21\uffff\ua7ff\55\u2100\uffff\u06fe\55",
            "\1\100\2\uffff\13\102\6\uffff\32\102\4\uffff\1\102\1\uffff\32\102\105\uffff\27\102\1\uffff\37\102\1\uffff\u0208\102\160\uffff\16\102\1\uffff\u1c81\102\14\uffff\2\102\142\uffff\u0120\102\u0a70\uffff\u03f0\102\21\uffff\ua7ff\102\u2100\uffff\u06fe\102",
            "",
            "\32\104\6\uffff\32\104",
            "\1\55\1\56\1\uffff\12\55\1\57\6\uffff\32\55\4\uffff\1\55\1\uffff\32\55\74\uffff\1\55\10\uffff\27\55\1\uffff\37\55\1\uffff\u0286\55\1\uffff\u1c81\55\14\uffff\2\55\61\uffff\2\55\57\uffff\u0120\55\u0a70\uffff\u03f0\55\21\uffff\ua7ff\55\u2100\uffff\u06fe\55",
            "\1\55\1\56\1\uffff\12\54\1\57\6\uffff\32\54\4\uffff\1\55\1\uffff\32\54\74\uffff\1\55\10\uffff\27\55\1\uffff\37\55\1\uffff\u0286\55\1\uffff\u1c81\55\14\uffff\2\55\61\uffff\2\55\57\uffff\u0120\55\u0a70\uffff\u03f0\55\21\uffff\ua7ff\55\u2100\uffff\u06fe\55",
            "\1\64\1\uffff\12\63",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\60\44\12\43\41\44\1\uffff\uffa4\44",
            "",
            "\60\44\12\43\41\44\1\uffff\1\44\1\105\uffa2\44",
            "",
            "\1\107\2\uffff\12\111\7\uffff\32\110\4\uffff\1\111\1\uffff\21\110\1\106\10\110",
            "\1\107\2\uffff\12\111\7\uffff\32\110\4\uffff\1\111\1\uffff\1\112\31\110",
            "\1\107\2\uffff\12\111\7\uffff\32\110\4\uffff\1\111\1\uffff\16\110\1\113\13\110",
            "\1\107\2\uffff\12\111\7\uffff\32\110\4\uffff\1\111\1\uffff\32\110",
            "",
            "\1\55\1\56\1\uffff\12\54\1\57\6\uffff\32\54\4\uffff\1\55\1\uffff\1\114\31\54\74\uffff\1\55\10\uffff\27\55\1\uffff\37\55\1\uffff\u0286\55\1\uffff\u1c81\55\14\uffff\2\55\61\uffff\2\55\57\uffff\u0120\55\u0a70\uffff\u03f0\55\21\uffff\ua7ff\55\u2100\uffff\u06fe\55",
            "",
            "\1\55\1\56\1\uffff\12\54\1\57\6\uffff\32\54\4\uffff\1\55\1\uffff\32\54\74\uffff\1\55\10\uffff\27\55\1\uffff\37\55\1\uffff\u0286\55\1\uffff\u1c81\55\14\uffff\2\55\61\uffff\2\55\57\uffff\u0120\55\u0a70\uffff\u03f0\55\21\uffff\ua7ff\55\u2100\uffff\u06fe\55",
            "\1\55\1\56\1\uffff\12\55\1\57\6\uffff\32\55\4\uffff\1\55\1\uffff\32\55\74\uffff\1\55\10\uffff\27\55\1\uffff\37\55\1\uffff\u0286\55\1\uffff\u1c81\55\14\uffff\2\55\61\uffff\2\55\57\uffff\u0120\55\u0a70\uffff\u03f0\55\21\uffff\ua7ff\55\u2100\uffff\u06fe\55",
            "\1\55\1\56\1\uffff\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55\74\uffff\1\55\10\uffff\27\55\1\uffff\37\55\1\uffff\u0286\55\1\uffff\u1c81\55\14\uffff\2\55\61\uffff\2\55\57\uffff\u0120\55\u0a70\uffff\u03f0\55\21\uffff\ua7ff\55\u2100\uffff\u06fe\55",
            "\13\102\6\uffff\32\102\4\uffff\1\102\1\uffff\32\102\105\uffff\27\102\1\uffff\37\102\1\uffff\u0208\102\160\uffff\16\102\1\uffff\u1c81\102\14\uffff\2\102\142\uffff\u0120\102\u0a70\uffff\u03f0\102\21\uffff\ua7ff\102\u2100\uffff\u06fe\102",
            "\1\55\1\56\1\uffff\12\54\1\57\6\uffff\32\54\4\uffff\1\55\1\uffff\1\116\31\54\74\uffff\1\55\10\uffff\27\55\1\uffff\37\55\1\uffff\u0286\55\1\uffff\u1c81\55\14\uffff\2\55\61\uffff\2\55\57\uffff\u0120\55\u0a70\uffff\u03f0\55\21\uffff\ua7ff\55\u2100\uffff\u06fe\55",
            "",
            "",
            "\1\66\1\uffff\12\63\13\uffff\1\67\37\uffff\1\67",
            "\12\71",
            "",
            "\12\117\13\uffff\1\67\37\uffff\1\67",
            "",
            "",
            "\12\71\13\uffff\1\67\37\uffff\1\67",
            "\1\121",
            "",
            "\1\122",
            "",
            "\1\77\1\56\1\uffff\12\76\1\57\6\uffff\32\76\4\uffff\1\77\1\uffff\32\76\74\uffff\1\55\10\uffff\27\55\1\uffff\37\55\1\uffff\u0286\55\1\uffff\u1c81\55\14\uffff\2\55\61\uffff\2\55\57\uffff\u0120\55\u0a70\uffff\u03f0\55\21\uffff\ua7ff\55\u2100\uffff\u06fe\55",
            "\1\77\1\56\1\uffff\12\77\1\57\6\uffff\32\77\4\uffff\1\77\1\uffff\32\77\74\uffff\1\55\10\uffff\27\55\1\uffff\37\55\1\uffff\u0286\55\1\uffff\u1c81\55\14\uffff\2\55\61\uffff\2\55\57\uffff\u0120\55\u0a70\uffff\u03f0\55\21\uffff\ua7ff\55\u2100\uffff\u06fe\55",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\107\2\uffff\12\111\7\uffff\32\110\4\uffff\1\111\1\uffff\4\110\1\124\25\110",
            "\12\125\7\uffff\32\125\6\uffff\32\125",
            "\1\107\2\uffff\12\111\7\uffff\32\110\4\uffff\1\111\1\uffff\32\110",
            "",
            "\1\107\2\uffff\12\111\7\uffff\32\110\4\uffff\1\111\1\uffff\22\110\1\126\7\110",
            "\1\107\2\uffff\12\111\7\uffff\32\110\4\uffff\1\111\1\uffff\24\110\1\127\5\110",
            "\1\55\1\56\1\uffff\12\54\1\57\6\uffff\32\54\4\uffff\1\55\1\uffff\3\54\1\130\26\54\74\uffff\1\55\10\uffff\27\55\1\uffff\37\55\1\uffff\u0286\55\1\uffff\u1c81\55\14\uffff\2\55\61\uffff\2\55\57\uffff\u0120\55\u0a70\uffff\u03f0\55\21\uffff\ua7ff\55\u2100\uffff\u06fe\55",
            "",
            "\1\55\1\56\1\uffff\12\54\1\57\6\uffff\32\54\4\uffff\1\55\1\uffff\21\54\1\131\10\54\74\uffff\1\55\10\uffff\27\55\1\uffff\37\55\1\uffff\u0286\55\1\uffff\u1c81\55\14\uffff\2\55\61\uffff\2\55\57\uffff\u0120\55\u0a70\uffff\u03f0\55\21\uffff\ua7ff\55\u2100\uffff\u06fe\55",
            "\12\117\13\uffff\1\67\37\uffff\1\67",
            "",
            "",
            "",
            "",
            "\1\107\2\uffff\12\111\7\uffff\32\110\4\uffff\1\111\1\uffff\5\110\1\132\24\110",
            "\1\107\2\uffff\12\125\7\uffff\32\125\4\uffff\1\111\1\uffff\32\125",
            "\1\107\2\uffff\12\111\7\uffff\32\110\4\uffff\1\111\1\uffff\4\110\1\133\25\110",
            "\1\107\2\uffff\12\111\7\uffff\32\110\4\uffff\1\111\1\uffff\21\110\1\134\10\110",
            "\1\135\1\56\1\uffff\12\54\1\57\6\uffff\32\54\4\uffff\1\55\1\uffff\32\54\74\uffff\1\55\10\uffff\27\55\1\uffff\37\55\1\uffff\u0286\55\1\uffff\u1c81\55\14\uffff\2\55\61\uffff\2\55\57\uffff\u0120\55\u0a70\uffff\u03f0\55\21\uffff\ua7ff\55\u2100\uffff\u06fe\55",
            "\1\55\1\56\1\uffff\12\54\1\57\6\uffff\32\54\4\uffff\1\55\1\uffff\20\54\1\136\11\54\74\uffff\1\55\10\uffff\27\55\1\uffff\37\55\1\uffff\u0286\55\1\uffff\u1c81\55\14\uffff\2\55\61\uffff\2\55\57\uffff\u0120\55\u0a70\uffff\u03f0\55\21\uffff\ua7ff\55\u2100\uffff\u06fe\55",
            "\1\107\2\uffff\12\111\7\uffff\32\110\4\uffff\1\111\1\uffff\10\110\1\137\21\110",
            "\1\140\14\uffff\1\107\2\uffff\12\111\7\uffff\32\110\4\uffff\1\111\1\uffff\32\110",
            "\1\107\2\uffff\12\111\7\uffff\32\110\4\uffff\1\111\1\uffff\2\110\1\141\27\110",
            "\1\55\1\56\1\uffff\12\55\1\57\6\uffff\32\55\4\uffff\1\55\1\uffff\2\55\1\142\16\55\1\143\10\55\74\uffff\1\55\10\uffff\27\55\1\uffff\37\55\1\uffff\u0286\55\1\uffff\u1c81\55\14\uffff\2\55\61\uffff\2\55\57\uffff\u0120\55\u0a70\uffff\u03f0\55\21\uffff\ua7ff\55\u2100\uffff\u06fe\55",
            "\1\55\1\56\1\uffff\12\54\1\57\6\uffff\32\54\4\uffff\1\55\1\uffff\13\54\1\144\16\54\74\uffff\1\55\10\uffff\27\55\1\uffff\37\55\1\uffff\u0286\55\1\uffff\u1c81\55\14\uffff\2\55\61\uffff\2\55\57\uffff\u0120\55\u0a70\uffff\u03f0\55\21\uffff\ua7ff\55\u2100\uffff\u06fe\55",
            "\1\107\2\uffff\12\111\7\uffff\32\110\4\uffff\1\111\1\uffff\27\110\1\145\2\110",
            "",
            "\1\107\2\uffff\12\111\7\uffff\32\110\4\uffff\1\111\1\uffff\4\110\1\146\25\110",
            "\1\55\1\56\1\uffff\12\55\1\57\6\uffff\32\55\4\uffff\1\55\1\uffff\22\55\1\147\7\55\74\uffff\1\55\10\uffff\27\55\1\uffff\37\55\1\uffff\u0286\55\1\uffff\u1c81\55\14\uffff\2\55\61\uffff\2\55\57\uffff\u0120\55\u0a70\uffff\u03f0\55\21\uffff\ua7ff\55\u2100\uffff\u06fe\55",
            "\1\55\1\56\1\uffff\12\55\1\57\6\uffff\32\55\4\uffff\1\55\1\uffff\3\55\1\150\26\55\74\uffff\1\55\10\uffff\27\55\1\uffff\37\55\1\uffff\u0286\55\1\uffff\u1c81\55\14\uffff\2\55\61\uffff\2\55\57\uffff\u0120\55\u0a70\uffff\u03f0\55\21\uffff\ua7ff\55\u2100\uffff\u06fe\55",
            "\1\55\1\56\1\uffff\12\54\1\57\6\uffff\32\54\4\uffff\1\55\1\uffff\32\54\74\uffff\1\55\10\uffff\27\55\1\uffff\37\55\1\uffff\u0286\55\1\uffff\u1c81\55\14\uffff\2\55\61\uffff\2\55\57\uffff\u0120\55\u0a70\uffff\u03f0\55\21\uffff\ua7ff\55\u2100\uffff\u06fe\55",
            "\1\152\14\uffff\1\107\2\uffff\12\111\7\uffff\32\110\4\uffff\1\111\1\uffff\32\110",
            "\1\107\2\uffff\12\111\7\uffff\32\110\4\uffff\1\111\1\uffff\32\110",
            "\1\55\1\56\1\uffff\12\55\1\57\6\uffff\32\55\4\uffff\1\55\1\uffff\25\55\1\154\4\55\74\uffff\1\55\10\uffff\27\55\1\uffff\37\55\1\uffff\u0286\55\1\uffff\u1c81\55\14\uffff\2\55\61\uffff\2\55\57\uffff\u0120\55\u0a70\uffff\u03f0\55\21\uffff\ua7ff\55\u2100\uffff\u06fe\55",
            "\1\55\1\56\1\uffff\12\55\1\57\6\uffff\32\55\4\uffff\1\55\1\uffff\5\55\1\155\24\55\74\uffff\1\55\10\uffff\27\55\1\uffff\37\55\1\uffff\u0286\55\1\uffff\u1c81\55\14\uffff\2\55\61\uffff\2\55\57\uffff\u0120\55\u0a70\uffff\u03f0\55\21\uffff\ua7ff\55\u2100\uffff\u06fe\55",
            "",
            "",
            "",
            "\1\55\1\56\1\uffff\12\55\1\57\6\uffff\32\55\4\uffff\1\55\1\uffff\32\55\74\uffff\1\55\10\uffff\27\55\1\uffff\37\55\1\uffff\u0286\55\1\uffff\u1c81\55\14\uffff\2\55\61\uffff\2\55\57\uffff\u0120\55\u0a70\uffff\u03f0\55\21\uffff\ua7ff\55\u2100\uffff\u06fe\55",
            "\1\55\1\56\1\uffff\12\55\1\57\6\uffff\32\55\4\uffff\1\55\1\uffff\32\55\74\uffff\1\55\10\uffff\27\55\1\uffff\37\55\1\uffff\u0286\55\1\uffff\u1c81\55\14\uffff\2\55\61\uffff\2\55\57\uffff\u0120\55\u0a70\uffff\u03f0\55\21\uffff\ua7ff\55\u2100\uffff\u06fe\55",
            "",
            ""
    };

    static final short[] DFA40_eot = DFA.unpackEncodedString(DFA40_eotS);
    static final short[] DFA40_eof = DFA.unpackEncodedString(DFA40_eofS);
    static final char[] DFA40_min = DFA.unpackEncodedStringToUnsignedChars(DFA40_minS);
    static final char[] DFA40_max = DFA.unpackEncodedStringToUnsignedChars(DFA40_maxS);
    static final short[] DFA40_accept = DFA.unpackEncodedString(DFA40_acceptS);
    static final short[] DFA40_special = DFA.unpackEncodedString(DFA40_specialS);
    static final short[][] DFA40_transition;

    static {
        int numStates = DFA40_transitionS.length;
        DFA40_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA40_transition[i] = DFA.unpackEncodedString(DFA40_transitionS[i]);
        }
    }

    class DFA40 extends DFA {

        public DFA40(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 40;
            this.eot = DFA40_eot;
            this.eof = DFA40_eof;
            this.min = DFA40_min;
            this.max = DFA40_max;
            this.accept = DFA40_accept;
            this.special = DFA40_special;
            this.transition = DFA40_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__56 | T__57 | T__58 | T__59 | RULE_E | RULE_ARITY | RULE_PRFX | RULE_BS | RULE_SRC | RULE_LOADCSV | RULE_LOADRDF | RULE_SPARQL | RULE_NAMED_NULL | RULE_INTEGER | RULE_DECIMAL | RULE_DOUBLE | RULE_SKIP | RULE_UNBRACE | RULE_UNBRACKET | RULE_PIPE_DELIMITED_LITERAL | RULE_HASH_DELIMITED_LITERAL | RULE_STRING_LITERAL1 | RULE_STRING_LITERAL2 | RULE_STRING_LITERAL_LONG1 | RULE_STRING_LITERAL_LONG2 | RULE_IRI | RULE_PNAME_LN | RULE_PNAME_NS | RULE_UNIVAR | RULE_EXIVAR | RULE_LANGTAG | RULE_VARORPREDNAME | RULE_DIRECTIVENAME | RULE_A2ZNX | RULE_LPAREN | RULE_RPAREN | RULE_COMMA | RULE_DOT | RULE_ARROW | RULE_TILDE | RULE_COLON | RULE_DATATYPE | RULE_NOT );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA40_1 = input.LA(1);

                        s = -1;
                        if ( ((LA40_1>='\u0000' && LA40_1<='z')||LA40_1=='|'||(LA40_1>='~' && LA40_1<='\uFFFF')) ) {s = 31;}

                        else s = 32;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA40_3 = input.LA(1);

                        s = -1;
                        if ( (LA40_3=='+'||LA40_3=='-') ) {s = 33;}

                        else if ( ((LA40_3>='0' && LA40_3<='9')) ) {s = 35;}

                        else if ( ((LA40_3>='\u0000' && LA40_3<='*')||LA40_3==','||(LA40_3>='.' && LA40_3<='/')||(LA40_3>=':' && LA40_3<='Z')||LA40_3=='\\'||(LA40_3>='^' && LA40_3<='\uFFFF')) ) {s = 36;}

                        else s = 34;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA40_35 = input.LA(1);

                        s = -1;
                        if ( (LA40_35==']') ) {s = 69;}

                        else if ( ((LA40_35>='0' && LA40_35<='9')) ) {s = 35;}

                        else if ( ((LA40_35>='\u0000' && LA40_35<='/')||(LA40_35>=':' && LA40_35<='Z')||LA40_35=='\\'||(LA40_35>='^' && LA40_35<='\uFFFF')) ) {s = 36;}

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA40_17 = input.LA(1);

                        s = -1;
                        if ( (LA40_17=='\"') ) {s = 60;}

                        else if ( ((LA40_17>='\u0000' && LA40_17<='\t')||(LA40_17>='\u000B' && LA40_17<='\f')||(LA40_17>='\u000E' && LA40_17<='!')||(LA40_17>='#' && LA40_17<='\uFFFF')) ) {s = 61;}

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA40_33 = input.LA(1);

                        s = -1;
                        if ( ((LA40_33>='0' && LA40_33<='9')) ) {s = 35;}

                        else if ( ((LA40_33>='\u0000' && LA40_33<='/')||(LA40_33>=':' && LA40_33<='Z')||(LA40_33>='\\' && LA40_33<='\uFFFF')) ) {s = 36;}

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA40_16 = input.LA(1);

                        s = -1;
                        if ( (LA40_16=='\'') ) {s = 58;}

                        else if ( ((LA40_16>='\u0000' && LA40_16<='\t')||(LA40_16>='\u000B' && LA40_16<='\f')||(LA40_16>='\u000E' && LA40_16<='&')||(LA40_16>='(' && LA40_16<='\uFFFF')) ) {s = 59;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 40, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}
