// $ANTLR 3.4 org/apache/synapse/util/streaming_xpath/compiler/XPath1Walker.g 2015-01-05 12:10:15

        package org.apache.synapse.util.streaming_xpath.compiler;

        import org.apache.synapse.util.streaming_xpath.custom.*;
        import org.apache.synapse.util.streaming_xpath.compiler.exception.*;
        import javax.xml.namespace.QName;
        
        

import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class XPath1Walker extends TreeParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ABBREVIATED_AXIS_STEP", "ANDEXPR", "ANY_NAMESPACED_NODE", "ANY_NODE", "ATTRIBUTE_AXIS", "AbbreviatedAxisSpecifier", "And", "AxisName", "AxisNameSeparator", "Colon", "Comma", "DOLLAR", "DecimalLiteral", "DoubleLiteral", "EQUEXPRESSION", "EXPRLIST", "EqualtyOp", "FUNCALL", "IntegerLiteral", "LOCATION_PATH", "LeftParenthesis", "LeftSquareBracket", "NAME", "NAMED_AXIS_STEP", "NAME_AXIS", "NUMBER", "Name", "NameSpacedQNAME", "NodeType", "OREXPR", "Or", "PREDICATE", "Pipe", "ProcessingInstruction", "QNAME", "QNAME_PREDICATE", "RecursiveAxisStep", "RightParenthesis", "RightSquareBracket", "SIMPLE_AXIS_STEP", "STRING", "SYNAPSE_SPECIFIC", "SingleAxisStep", "Star", "StringLiteral", "SynapseSpecific", "SynapseSpecificBody", "UNIONEXPR", "VARREF", "VariableReference", "WS", "XPATH", "'.'", "'..'", "'1'"
    };

    public static final int EOF=-1;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int ABBREVIATED_AXIS_STEP=4;
    public static final int ANDEXPR=5;
    public static final int ANY_NAMESPACED_NODE=6;
    public static final int ANY_NODE=7;
    public static final int ATTRIBUTE_AXIS=8;
    public static final int AbbreviatedAxisSpecifier=9;
    public static final int And=10;
    public static final int AxisName=11;
    public static final int AxisNameSeparator=12;
    public static final int Colon=13;
    public static final int Comma=14;
    public static final int DOLLAR=15;
    public static final int DecimalLiteral=16;
    public static final int DoubleLiteral=17;
    public static final int EQUEXPRESSION=18;
    public static final int EXPRLIST=19;
    public static final int EqualtyOp=20;
    public static final int FUNCALL=21;
    public static final int IntegerLiteral=22;
    public static final int LOCATION_PATH=23;
    public static final int LeftParenthesis=24;
    public static final int LeftSquareBracket=25;
    public static final int NAME=26;
    public static final int NAMED_AXIS_STEP=27;
    public static final int NAME_AXIS=28;
    public static final int NUMBER=29;
    public static final int Name=30;
    public static final int NameSpacedQNAME=31;
    public static final int NodeType=32;
    public static final int OREXPR=33;
    public static final int Or=34;
    public static final int PREDICATE=35;
    public static final int Pipe=36;
    public static final int ProcessingInstruction=37;
    public static final int QNAME=38;
    public static final int QNAME_PREDICATE=39;
    public static final int RecursiveAxisStep=40;
    public static final int RightParenthesis=41;
    public static final int RightSquareBracket=42;
    public static final int SIMPLE_AXIS_STEP=43;
    public static final int STRING=44;
    public static final int SYNAPSE_SPECIFIC=45;
    public static final int SingleAxisStep=46;
    public static final int Star=47;
    public static final int StringLiteral=48;
    public static final int SynapseSpecific=49;
    public static final int SynapseSpecificBody=50;
    public static final int UNIONEXPR=51;
    public static final int VARREF=52;
    public static final int VariableReference=53;
    public static final int WS=54;
    public static final int XPATH=55;

    // delegates
    public TreeParser[] getDelegates() {
        return new TreeParser[] {};
    }

    // delegators


    public XPath1Walker(TreeNodeStream input) {
        this(input, new RecognizerSharedState());
    }
    public XPath1Walker(TreeNodeStream input, RecognizerSharedState state) {
        super(input, state);
    }

    public String[] getTokenNames() { return XPath1Walker.tokenNames; }
    public String getGrammarFileName() { return "org/apache/synapse/util/streaming_xpath/compiler/XPath1Walker.g"; }


            boolean firstXPATH=true;
            String xpath=null;
            StreamingParser localParser=new StreamingParser();

            


    // $ANTLR start "xpath"
    // org/apache/synapse/util/streaming_xpath/compiler/XPath1Walker.g:36:9: xpath returns [StreamingParser xpathParser] : ( locationPath | ^( SYNAPSE_SPECIFIC SynapseSpecific locationPath ) );
    public final StreamingParser xpath() throws RecognitionException {
        StreamingParser xpathParser = null;


        try {
            // org/apache/synapse/util/streaming_xpath/compiler/XPath1Walker.g:37:9: ( locationPath | ^( SYNAPSE_SPECIFIC SynapseSpecific locationPath ) )
            int alt1=2;
            switch ( input.LA(1) ) {
            case LOCATION_PATH:
                {
                alt1=1;
                }
                break;
            case SYNAPSE_SPECIFIC:
                {
                alt1=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return xpathParser;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;

            }

            switch (alt1) {
                case 1 :
                    // org/apache/synapse/util/streaming_xpath/compiler/XPath1Walker.g:37:11: locationPath
                    {
                    pushFollow(FOLLOW_locationPath_in_xpath287);
                    locationPath();

                    state._fsp--;
                    if (state.failed) return xpathParser;

                    if ( state.backtracking==0 ) {xpathParser =localParser;}

                    }
                    break;
                case 2 :
                    // org/apache/synapse/util/streaming_xpath/compiler/XPath1Walker.g:38:11: ^( SYNAPSE_SPECIFIC SynapseSpecific locationPath )
                    {
                    match(input,SYNAPSE_SPECIFIC,FOLLOW_SYNAPSE_SPECIFIC_in_xpath302); if (state.failed) return xpathParser;

                    match(input, Token.DOWN, null); if (state.failed) return xpathParser;
                    match(input,SynapseSpecific,FOLLOW_SynapseSpecific_in_xpath304); if (state.failed) return xpathParser;

                    pushFollow(FOLLOW_locationPath_in_xpath306);
                    locationPath();

                    state._fsp--;
                    if (state.failed) return xpathParser;

                    match(input, Token.UP, null); if (state.failed) return xpathParser;


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return xpathParser;
    }
    // $ANTLR end "xpath"



    // $ANTLR start "locationPath"
    // org/apache/synapse/util/streaming_xpath/compiler/XPath1Walker.g:41:9: locationPath : ( ^( LOCATION_PATH SynapseSpecificBody relativeLocationPath ) | ^( LOCATION_PATH SynapseSpecific relativeLocationPath ) | ^( LOCATION_PATH SynapseSpecificBody absoluteLocationPath ) | ^( LOCATION_PATH SynapseSpecific absoluteLocationPath ) | ^( LOCATION_PATH relativeLocationPath ) | ^( LOCATION_PATH absoluteLocationPath ) | ^( LOCATION_PATH Name ) );
    public final void locationPath() throws RecognitionException {
        try {
            // org/apache/synapse/util/streaming_xpath/compiler/XPath1Walker.g:42:9: ( ^( LOCATION_PATH SynapseSpecificBody relativeLocationPath ) | ^( LOCATION_PATH SynapseSpecific relativeLocationPath ) | ^( LOCATION_PATH SynapseSpecificBody absoluteLocationPath ) | ^( LOCATION_PATH SynapseSpecific absoluteLocationPath ) | ^( LOCATION_PATH relativeLocationPath ) | ^( LOCATION_PATH absoluteLocationPath ) | ^( LOCATION_PATH Name ) )
            int alt2=7;
            switch ( input.LA(1) ) {
            case LOCATION_PATH:
                {
                int LA2_1 = input.LA(2);

                if ( (synpred2_XPath1Walker()) ) {
                    alt2=1;
                }
                else if ( (synpred3_XPath1Walker()) ) {
                    alt2=2;
                }
                else if ( (synpred4_XPath1Walker()) ) {
                    alt2=3;
                }
                else if ( (synpred5_XPath1Walker()) ) {
                    alt2=4;
                }
                else if ( (synpred6_XPath1Walker()) ) {
                    alt2=5;
                }
                else if ( (synpred7_XPath1Walker()) ) {
                    alt2=6;
                }
                else if ( (true) ) {
                    alt2=7;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;

                }
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
                    // org/apache/synapse/util/streaming_xpath/compiler/XPath1Walker.g:42:10: ^( LOCATION_PATH SynapseSpecificBody relativeLocationPath )
                    {
                    match(input,LOCATION_PATH,FOLLOW_LOCATION_PATH_in_locationPath341); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    match(input,SynapseSpecificBody,FOLLOW_SynapseSpecificBody_in_locationPath343); if (state.failed) return ;

                    pushFollow(FOLLOW_relativeLocationPath_in_locationPath345);
                    relativeLocationPath();

                    state._fsp--;
                    if (state.failed) return ;

                    if ( state.backtracking==0 ) { throw new StreamingXPATHCompilerException();}

                    match(input, Token.UP, null); if (state.failed) return ;


                    }
                    break;
                case 2 :
                    // org/apache/synapse/util/streaming_xpath/compiler/XPath1Walker.g:43:10: ^( LOCATION_PATH SynapseSpecific relativeLocationPath )
                    {
                    match(input,LOCATION_PATH,FOLLOW_LOCATION_PATH_in_locationPath360); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    match(input,SynapseSpecific,FOLLOW_SynapseSpecific_in_locationPath362); if (state.failed) return ;

                    if ( state.backtracking==0 ) { throw new StreamingXPATHCompilerException();}

                    pushFollow(FOLLOW_relativeLocationPath_in_locationPath366);
                    relativeLocationPath();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;


                    }
                    break;
                case 3 :
                    // org/apache/synapse/util/streaming_xpath/compiler/XPath1Walker.g:44:10: ^( LOCATION_PATH SynapseSpecificBody absoluteLocationPath )
                    {
                    match(input,LOCATION_PATH,FOLLOW_LOCATION_PATH_in_locationPath379); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    match(input,SynapseSpecificBody,FOLLOW_SynapseSpecificBody_in_locationPath381); if (state.failed) return ;

                    if ( state.backtracking==0 ) {
                             localParser.GetChild_GetChildrenByName("Body","soapenv");
                             firstXPATH=false;
                            }

                    pushFollow(FOLLOW_absoluteLocationPath_in_locationPath383);
                    absoluteLocationPath();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;


                    }
                    break;
                case 4 :
                    // org/apache/synapse/util/streaming_xpath/compiler/XPath1Walker.g:48:10: ^( LOCATION_PATH SynapseSpecific absoluteLocationPath )
                    {
                    match(input,LOCATION_PATH,FOLLOW_LOCATION_PATH_in_locationPath396); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    match(input,SynapseSpecific,FOLLOW_SynapseSpecific_in_locationPath398); if (state.failed) return ;

                    if ( state.backtracking==0 ) { throw new StreamingXPATHCompilerException();}

                    pushFollow(FOLLOW_absoluteLocationPath_in_locationPath402);
                    absoluteLocationPath();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;


                    }
                    break;
                case 5 :
                    // org/apache/synapse/util/streaming_xpath/compiler/XPath1Walker.g:49:10: ^( LOCATION_PATH relativeLocationPath )
                    {
                    match(input,LOCATION_PATH,FOLLOW_LOCATION_PATH_in_locationPath415); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    pushFollow(FOLLOW_relativeLocationPath_in_locationPath417);
                    relativeLocationPath();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;


                    }
                    break;
                case 6 :
                    // org/apache/synapse/util/streaming_xpath/compiler/XPath1Walker.g:50:10: ^( LOCATION_PATH absoluteLocationPath )
                    {
                    match(input,LOCATION_PATH,FOLLOW_LOCATION_PATH_in_locationPath432); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    pushFollow(FOLLOW_absoluteLocationPath_in_locationPath434);
                    absoluteLocationPath();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;


                    }
                    break;
                case 7 :
                    // org/apache/synapse/util/streaming_xpath/compiler/XPath1Walker.g:51:10: ^( LOCATION_PATH Name )
                    {
                    match(input,LOCATION_PATH,FOLLOW_LOCATION_PATH_in_locationPath447); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    match(input,Name,FOLLOW_Name_in_locationPath449); if (state.failed) return ;

                    if ( state.backtracking==0 ) { throw new StreamingXPATHCompilerException();}

                    match(input, Token.UP, null); if (state.failed) return ;


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "locationPath"



    // $ANTLR start "absoluteLocationPath"
    // org/apache/synapse/util/streaming_xpath/compiler/XPath1Walker.g:54:9: absoluteLocationPath : ( ^( SingleAxisStep ( relativeLocationPath )? ) | ^( RecursiveAxisStep relativeLocationPath ) );
    public final void absoluteLocationPath() throws RecognitionException {
        try {
            // org/apache/synapse/util/streaming_xpath/compiler/XPath1Walker.g:55:9: ( ^( SingleAxisStep ( relativeLocationPath )? ) | ^( RecursiveAxisStep relativeLocationPath ) )
            int alt4=2;
            switch ( input.LA(1) ) {
            case SingleAxisStep:
                {
                alt4=1;
                }
                break;
            case RecursiveAxisStep:
                {
                alt4=2;
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
                    // org/apache/synapse/util/streaming_xpath/compiler/XPath1Walker.g:55:10: ^( SingleAxisStep ( relativeLocationPath )? )
                    {
                    match(input,SingleAxisStep,FOLLOW_SingleAxisStep_in_absoluteLocationPath485); if (state.failed) return ;

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); if (state.failed) return ;
                        // org/apache/synapse/util/streaming_xpath/compiler/XPath1Walker.g:55:28: ( relativeLocationPath )?
                        int alt3=2;
                        switch ( input.LA(1) ) {
                            case QNAME_PREDICATE:
                            case RecursiveAxisStep:
                            case SingleAxisStep:
                                {
                                alt3=1;
                                }
                                break;
                        }

                        switch (alt3) {
                            case 1 :
                                // org/apache/synapse/util/streaming_xpath/compiler/XPath1Walker.g:55:28: relativeLocationPath
                                {
                                pushFollow(FOLLOW_relativeLocationPath_in_absoluteLocationPath488);
                                relativeLocationPath();

                                state._fsp--;
                                if (state.failed) return ;

                                }
                                break;

                        }


                        match(input, Token.UP, null); if (state.failed) return ;
                    }


                    }
                    break;
                case 2 :
                    // org/apache/synapse/util/streaming_xpath/compiler/XPath1Walker.g:56:10: ^( RecursiveAxisStep relativeLocationPath )
                    {
                    match(input,RecursiveAxisStep,FOLLOW_RecursiveAxisStep_in_absoluteLocationPath503); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    pushFollow(FOLLOW_relativeLocationPath_in_absoluteLocationPath505);
                    relativeLocationPath();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "absoluteLocationPath"



    // $ANTLR start "relativeLocationPath"
    // org/apache/synapse/util/streaming_xpath/compiler/XPath1Walker.g:59:9: relativeLocationPath : ( ^( SingleAxisStep step relativeLocationPath ) | ^( RecursiveAxisStep step relativeLocationPath ) | step );
    public final void relativeLocationPath() throws RecognitionException {
        try {
            // org/apache/synapse/util/streaming_xpath/compiler/XPath1Walker.g:60:9: ( ^( SingleAxisStep step relativeLocationPath ) | ^( RecursiveAxisStep step relativeLocationPath ) | step )
            int alt5=3;
            switch ( input.LA(1) ) {
            case SingleAxisStep:
                {
                alt5=1;
                }
                break;
            case RecursiveAxisStep:
                {
                alt5=2;
                }
                break;
            case QNAME_PREDICATE:
                {
                alt5=3;
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
                    // org/apache/synapse/util/streaming_xpath/compiler/XPath1Walker.g:60:10: ^( SingleAxisStep step relativeLocationPath )
                    {
                    match(input,SingleAxisStep,FOLLOW_SingleAxisStep_in_relativeLocationPath541); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    pushFollow(FOLLOW_step_in_relativeLocationPath544);
                    step();

                    state._fsp--;
                    if (state.failed) return ;

                    pushFollow(FOLLOW_relativeLocationPath_in_relativeLocationPath546);
                    relativeLocationPath();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;


                    }
                    break;
                case 2 :
                    // org/apache/synapse/util/streaming_xpath/compiler/XPath1Walker.g:61:10: ^( RecursiveAxisStep step relativeLocationPath )
                    {
                    match(input,RecursiveAxisStep,FOLLOW_RecursiveAxisStep_in_relativeLocationPath559); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    pushFollow(FOLLOW_step_in_relativeLocationPath562);
                    step();

                    state._fsp--;
                    if (state.failed) return ;

                    pushFollow(FOLLOW_relativeLocationPath_in_relativeLocationPath565);
                    relativeLocationPath();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;


                    }
                    break;
                case 3 :
                    // org/apache/synapse/util/streaming_xpath/compiler/XPath1Walker.g:62:10: step
                    {
                    pushFollow(FOLLOW_step_in_relativeLocationPath577);
                    step();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "relativeLocationPath"



    // $ANTLR start "step"
    // org/apache/synapse/util/streaming_xpath/compiler/XPath1Walker.g:65:9: step : ( ^( QNAME_PREDICATE namedAxisStep ( ( predicate )* )? ) | ^( QNAME_PREDICATE abbreviatedAxisStep ( ( predicate )* )? ) );
    public final void step() throws RecognitionException {
        try {
            // org/apache/synapse/util/streaming_xpath/compiler/XPath1Walker.g:66:9: ( ^( QNAME_PREDICATE namedAxisStep ( ( predicate )* )? ) | ^( QNAME_PREDICATE abbreviatedAxisStep ( ( predicate )* )? ) )
            int alt10=2;
            switch ( input.LA(1) ) {
            case QNAME_PREDICATE:
                {
                switch ( input.LA(2) ) {
                case DOWN:
                    {
                    switch ( input.LA(3) ) {
                    case ATTRIBUTE_AXIS:
                    case NAMED_AXIS_STEP:
                        {
                        alt10=1;
                        }
                        break;
                    case ABBREVIATED_AXIS_STEP:
                        {
                        alt10=2;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 10, 2, input);

                        throw nvae;

                    }

                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 1, input);

                    throw nvae;

                }

                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;

            }

            switch (alt10) {
                case 1 :
                    // org/apache/synapse/util/streaming_xpath/compiler/XPath1Walker.g:66:10: ^( QNAME_PREDICATE namedAxisStep ( ( predicate )* )? )
                    {
                    match(input,QNAME_PREDICATE,FOLLOW_QNAME_PREDICATE_in_step611); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    pushFollow(FOLLOW_namedAxisStep_in_step613);
                    namedAxisStep();

                    state._fsp--;
                    if (state.failed) return ;

                    // org/apache/synapse/util/streaming_xpath/compiler/XPath1Walker.g:66:42: ( ( predicate )* )?
                    int alt7=2;
                    switch ( input.LA(1) ) {
                        case PREDICATE:
                            {
                            alt7=1;
                            }
                            break;
                        case UP:
                            {
                            int LA7_2 = input.LA(2);

                            if ( (synpred13_XPath1Walker()) ) {
                                alt7=1;
                            }
                            }
                            break;
                    }

                    switch (alt7) {
                        case 1 :
                            // org/apache/synapse/util/streaming_xpath/compiler/XPath1Walker.g:66:43: ( predicate )*
                            {
                            // org/apache/synapse/util/streaming_xpath/compiler/XPath1Walker.g:66:43: ( predicate )*
                            loop6:
                            do {
                                int alt6=2;
                                switch ( input.LA(1) ) {
                                case PREDICATE:
                                    {
                                    alt6=1;
                                    }
                                    break;

                                }

                                switch (alt6) {
                            	case 1 :
                            	    // org/apache/synapse/util/streaming_xpath/compiler/XPath1Walker.g:66:43: predicate
                            	    {
                            	    pushFollow(FOLLOW_predicate_in_step616);
                            	    predicate();

                            	    state._fsp--;
                            	    if (state.failed) return ;

                            	    }
                            	    break;

                            	default :
                            	    break loop6;
                                }
                            } while (true);


                            }
                            break;

                    }


                    match(input, Token.UP, null); if (state.failed) return ;


                    }
                    break;
                case 2 :
                    // org/apache/synapse/util/streaming_xpath/compiler/XPath1Walker.g:67:10: ^( QNAME_PREDICATE abbreviatedAxisStep ( ( predicate )* )? )
                    {
                    match(input,QNAME_PREDICATE,FOLLOW_QNAME_PREDICATE_in_step632); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    pushFollow(FOLLOW_abbreviatedAxisStep_in_step634);
                    abbreviatedAxisStep();

                    state._fsp--;
                    if (state.failed) return ;

                    // org/apache/synapse/util/streaming_xpath/compiler/XPath1Walker.g:67:48: ( ( predicate )* )?
                    int alt9=2;
                    switch ( input.LA(1) ) {
                        case PREDICATE:
                            {
                            alt9=1;
                            }
                            break;
                        case UP:
                            {
                            int LA9_2 = input.LA(2);

                            if ( (synpred16_XPath1Walker()) ) {
                                alt9=1;
                            }
                            }
                            break;
                    }

                    switch (alt9) {
                        case 1 :
                            // org/apache/synapse/util/streaming_xpath/compiler/XPath1Walker.g:67:49: ( predicate )*
                            {
                            // org/apache/synapse/util/streaming_xpath/compiler/XPath1Walker.g:67:49: ( predicate )*
                            loop8:
                            do {
                                int alt8=2;
                                switch ( input.LA(1) ) {
                                case PREDICATE:
                                    {
                                    alt8=1;
                                    }
                                    break;

                                }

                                switch (alt8) {
                            	case 1 :
                            	    // org/apache/synapse/util/streaming_xpath/compiler/XPath1Walker.g:67:49: predicate
                            	    {
                            	    pushFollow(FOLLOW_predicate_in_step637);
                            	    predicate();

                            	    state._fsp--;
                            	    if (state.failed) return ;

                            	    }
                            	    break;

                            	default :
                            	    break loop8;
                                }
                            } while (true);


                            }
                            break;

                    }


                    match(input, Token.UP, null); if (state.failed) return ;


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "step"



    // $ANTLR start "abbreviatedAxisStep"
    // org/apache/synapse/util/streaming_xpath/compiler/XPath1Walker.g:70:9: abbreviatedAxisStep : ( ^( ABBREVIATED_AXIS_STEP '.' ) | ^( ABBREVIATED_AXIS_STEP '..' ) );
    public final void abbreviatedAxisStep() throws RecognitionException {
        try {
            // org/apache/synapse/util/streaming_xpath/compiler/XPath1Walker.g:71:9: ( ^( ABBREVIATED_AXIS_STEP '.' ) | ^( ABBREVIATED_AXIS_STEP '..' ) )
            int alt11=2;
            switch ( input.LA(1) ) {
            case ABBREVIATED_AXIS_STEP:
                {
                switch ( input.LA(2) ) {
                case DOWN:
                    {
                    switch ( input.LA(3) ) {
                    case 56:
                        {
                        alt11=1;
                        }
                        break;
                    case 57:
                        {
                        alt11=2;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 11, 2, input);

                        throw nvae;

                    }

                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 1, input);

                    throw nvae;

                }

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
                    // org/apache/synapse/util/streaming_xpath/compiler/XPath1Walker.g:71:11: ^( ABBREVIATED_AXIS_STEP '.' )
                    {
                    match(input,ABBREVIATED_AXIS_STEP,FOLLOW_ABBREVIATED_AXIS_STEP_in_abbreviatedAxisStep687); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    match(input,56,FOLLOW_56_in_abbreviatedAxisStep689); if (state.failed) return ;

                    if ( state.backtracking==0 ) {localParser.GetChild_GetCurrent();}

                    match(input, Token.UP, null); if (state.failed) return ;


                    }
                    break;
                case 2 :
                    // org/apache/synapse/util/streaming_xpath/compiler/XPath1Walker.g:72:11: ^( ABBREVIATED_AXIS_STEP '..' )
                    {
                    match(input,ABBREVIATED_AXIS_STEP,FOLLOW_ABBREVIATED_AXIS_STEP_in_abbreviatedAxisStep705); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    match(input,57,FOLLOW_57_in_abbreviatedAxisStep707); if (state.failed) return ;

                    if ( state.backtracking==0 ) {localParser.GetChild_FirstChild();}

                    match(input, Token.UP, null); if (state.failed) return ;


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "abbreviatedAxisStep"



    // $ANTLR start "namedAxisStep"
    // org/apache/synapse/util/streaming_xpath/compiler/XPath1Walker.g:75:9: namedAxisStep : ( ^( ATTRIBUTE_AXIS AbbreviatedAxisSpecifier nodeTest ) | ^( NAMED_AXIS_STEP ( axisSpecifier )? nodeTest ) );
    public final void namedAxisStep() throws RecognitionException {
        QName nodeTest1 =null;

        QName nodeTest2 =null;


        try {
            // org/apache/synapse/util/streaming_xpath/compiler/XPath1Walker.g:76:9: ( ^( ATTRIBUTE_AXIS AbbreviatedAxisSpecifier nodeTest ) | ^( NAMED_AXIS_STEP ( axisSpecifier )? nodeTest ) )
            int alt13=2;
            switch ( input.LA(1) ) {
            case ATTRIBUTE_AXIS:
                {
                alt13=1;
                }
                break;
            case NAMED_AXIS_STEP:
                {
                alt13=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;

            }

            switch (alt13) {
                case 1 :
                    // org/apache/synapse/util/streaming_xpath/compiler/XPath1Walker.g:76:10: ^( ATTRIBUTE_AXIS AbbreviatedAxisSpecifier nodeTest )
                    {
                    match(input,ATTRIBUTE_AXIS,FOLLOW_ATTRIBUTE_AXIS_in_namedAxisStep744); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    match(input,AbbreviatedAxisSpecifier,FOLLOW_AbbreviatedAxisSpecifier_in_namedAxisStep746); if (state.failed) return ;

                    pushFollow(FOLLOW_nodeTest_in_namedAxisStep748);
                    nodeTest1=nodeTest();

                    state._fsp--;
                    if (state.failed) return ;

                    if ( state.backtracking==0 ) {localParser.GetChild_GetAttribute(nodeTest1.getLocalPart(),nodeTest1.getNamespaceURI());}

                    match(input, Token.UP, null); if (state.failed) return ;


                    }
                    break;
                case 2 :
                    // org/apache/synapse/util/streaming_xpath/compiler/XPath1Walker.g:77:10: ^( NAMED_AXIS_STEP ( axisSpecifier )? nodeTest )
                    {
                    match(input,NAMED_AXIS_STEP,FOLLOW_NAMED_AXIS_STEP_in_namedAxisStep763); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    // org/apache/synapse/util/streaming_xpath/compiler/XPath1Walker.g:77:28: ( axisSpecifier )?
                    int alt12=2;
                    switch ( input.LA(1) ) {
                        case NAME_AXIS:
                            {
                            alt12=1;
                            }
                            break;
                    }

                    switch (alt12) {
                        case 1 :
                            // org/apache/synapse/util/streaming_xpath/compiler/XPath1Walker.g:77:28: axisSpecifier
                            {
                            pushFollow(FOLLOW_axisSpecifier_in_namedAxisStep765);
                            axisSpecifier();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }


                    pushFollow(FOLLOW_nodeTest_in_namedAxisStep768);
                    nodeTest2=nodeTest();

                    state._fsp--;
                    if (state.failed) return ;

                    if ( state.backtracking==0 ) { 
                                            boolean absolute=true;
                                            String name="";
                                            if(nodeTest2.getNamespaceURI()!=null &&nodeTest2.getNamespaceURI()!=""){
                                                   name=nodeTest2.getNamespaceURI()+":"+nodeTest2.getLocalPart();
                                            }
                                            else{
                                                  name=nodeTest2.getLocalPart();
                                            }

                                            if(xpath.charAt(xpath.indexOf(name)-1)=='/'){
                                                if(xpath.indexOf(name)-2>=0 && xpath.charAt(xpath.indexOf(name)-2)=='/'){
                                                    absolute=false;
                                                }
                                            }
                                            if(firstXPATH&&(absolute)){
                                                localParser.GetChild_GetCurrentMatch(nodeTest2.getLocalPart(),nodeTest2.getNamespaceURI());
                                                firstXPATH=false;
                                            }
                                            else{
                                                firstXPATH=false;
                                                if(!absolute){
                                                    localParser.GetChild_GetChildrenByNameRelative(nodeTest2.getLocalPart(),nodeTest2.getNamespaceURI());
                                                }
                                                else{
                                                    localParser.GetChild_GetChildrenByName(nodeTest2.getLocalPart(),nodeTest2.getNamespaceURI());
                                                }

                                            }
                            }

                    match(input, Token.UP, null); if (state.failed) return ;


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "namedAxisStep"



    // $ANTLR start "axisSpecifier"
    // org/apache/synapse/util/streaming_xpath/compiler/XPath1Walker.g:109:9: axisSpecifier : ^( NAME_AXIS AxisName ) ;
    public final void axisSpecifier() throws RecognitionException {
        try {
            // org/apache/synapse/util/streaming_xpath/compiler/XPath1Walker.g:110:9: ( ^( NAME_AXIS AxisName ) )
            // org/apache/synapse/util/streaming_xpath/compiler/XPath1Walker.g:110:10: ^( NAME_AXIS AxisName )
            {
            match(input,NAME_AXIS,FOLLOW_NAME_AXIS_in_axisSpecifier804); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            match(input,AxisName,FOLLOW_AxisName_in_axisSpecifier806); if (state.failed) return ;

            if ( state.backtracking==0 ) {throw new StreamingXPATHCompilerException();}

            match(input, Token.UP, null); if (state.failed) return ;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "axisSpecifier"



    // $ANTLR start "nodeTest"
    // org/apache/synapse/util/streaming_xpath/compiler/XPath1Walker.g:113:9: nodeTest returns [QName qname] : ( nameTest | ^( ANY_NODE NodeType ) | ProcessingInstruction LeftParenthesis StringLiteral RightParenthesis );
    public final QName nodeTest() throws RecognitionException {
        QName qname = null;


        QName nameTest3 =null;


        try {
            // org/apache/synapse/util/streaming_xpath/compiler/XPath1Walker.g:114:9: ( nameTest | ^( ANY_NODE NodeType ) | ProcessingInstruction LeftParenthesis StringLiteral RightParenthesis )
            int alt14=3;
            switch ( input.LA(1) ) {
            case ANY_NODE:
                {
                switch ( input.LA(2) ) {
                case DOWN:
                    {
                    switch ( input.LA(3) ) {
                    case NodeType:
                        {
                        alt14=2;
                        }
                        break;
                    case ANY_NODE:
                        {
                        alt14=1;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return qname;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 14, 4, input);

                        throw nvae;

                    }

                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return qname;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 1, input);

                    throw nvae;

                }

                }
                break;
            case ANY_NAMESPACED_NODE:
            case NameSpacedQNAME:
            case QNAME:
                {
                alt14=1;
                }
                break;
            case ProcessingInstruction:
                {
                alt14=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return qname;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;

            }

            switch (alt14) {
                case 1 :
                    // org/apache/synapse/util/streaming_xpath/compiler/XPath1Walker.g:114:11: nameTest
                    {
                    pushFollow(FOLLOW_nameTest_in_nodeTest848);
                    nameTest3=nameTest();

                    state._fsp--;
                    if (state.failed) return qname;

                    if ( state.backtracking==0 ) {qname =nameTest3;}

                    }
                    break;
                case 2 :
                    // org/apache/synapse/util/streaming_xpath/compiler/XPath1Walker.g:115:11: ^( ANY_NODE NodeType )
                    {
                    match(input,ANY_NODE,FOLLOW_ANY_NODE_in_nodeTest864); if (state.failed) return qname;

                    match(input, Token.DOWN, null); if (state.failed) return qname;
                    match(input,NodeType,FOLLOW_NodeType_in_nodeTest866); if (state.failed) return qname;

                    if ( state.backtracking==0 ) {throw new StreamingXPATHCompilerException();}

                    match(input, Token.UP, null); if (state.failed) return qname;


                    }
                    break;
                case 3 :
                    // org/apache/synapse/util/streaming_xpath/compiler/XPath1Walker.g:116:11: ProcessingInstruction LeftParenthesis StringLiteral RightParenthesis
                    {
                    match(input,ProcessingInstruction,FOLLOW_ProcessingInstruction_in_nodeTest880); if (state.failed) return qname;

                    if ( state.backtracking==0 ) {throw new StreamingXPATHCompilerException();}

                    match(input,LeftParenthesis,FOLLOW_LeftParenthesis_in_nodeTest883); if (state.failed) return qname;

                    match(input,StringLiteral,FOLLOW_StringLiteral_in_nodeTest885); if (state.failed) return qname;

                    match(input,RightParenthesis,FOLLOW_RightParenthesis_in_nodeTest887); if (state.failed) return qname;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return qname;
    }
    // $ANTLR end "nodeTest"



    // $ANTLR start "nameTest"
    // org/apache/synapse/util/streaming_xpath/compiler/XPath1Walker.g:119:9: nameTest returns [QName qname] : ( ^( ANY_NODE ANY_NODE ) | ^( ANY_NAMESPACED_NODE Name ) | qName );
    public final QName nameTest() throws RecognitionException {
        QName qname = null;


        QName qName4 =null;


        try {
            // org/apache/synapse/util/streaming_xpath/compiler/XPath1Walker.g:120:9: ( ^( ANY_NODE ANY_NODE ) | ^( ANY_NAMESPACED_NODE Name ) | qName )
            int alt15=3;
            switch ( input.LA(1) ) {
            case ANY_NODE:
                {
                alt15=1;
                }
                break;
            case ANY_NAMESPACED_NODE:
                {
                alt15=2;
                }
                break;
            case NameSpacedQNAME:
            case QNAME:
                {
                alt15=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return qname;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;

            }

            switch (alt15) {
                case 1 :
                    // org/apache/synapse/util/streaming_xpath/compiler/XPath1Walker.g:120:11: ^( ANY_NODE ANY_NODE )
                    {
                    match(input,ANY_NODE,FOLLOW_ANY_NODE_in_nameTest925); if (state.failed) return qname;

                    if ( state.backtracking==0 ) {throw new StreamingXPATHCompilerException();}

                    match(input, Token.DOWN, null); if (state.failed) return qname;
                    match(input,ANY_NODE,FOLLOW_ANY_NODE_in_nameTest928); if (state.failed) return qname;

                    match(input, Token.UP, null); if (state.failed) return qname;


                    }
                    break;
                case 2 :
                    // org/apache/synapse/util/streaming_xpath/compiler/XPath1Walker.g:121:10: ^( ANY_NAMESPACED_NODE Name )
                    {
                    match(input,ANY_NAMESPACED_NODE,FOLLOW_ANY_NAMESPACED_NODE_in_nameTest942); if (state.failed) return qname;

                    match(input, Token.DOWN, null); if (state.failed) return qname;
                    match(input,Name,FOLLOW_Name_in_nameTest944); if (state.failed) return qname;

                    if ( state.backtracking==0 ) {throw new StreamingXPATHCompilerException();}

                    match(input, Token.UP, null); if (state.failed) return qname;


                    }
                    break;
                case 3 :
                    // org/apache/synapse/util/streaming_xpath/compiler/XPath1Walker.g:122:11: qName
                    {
                    pushFollow(FOLLOW_qName_in_nameTest958);
                    qName4=qName();

                    state._fsp--;
                    if (state.failed) return qname;

                    if ( state.backtracking==0 ) {qname =qName4;}

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return qname;
    }
    // $ANTLR end "nameTest"



    // $ANTLR start "predicate"
    // org/apache/synapse/util/streaming_xpath/compiler/XPath1Walker.g:125:9: predicate : ( ^( PREDICATE predicateExpr ) | ^( PREDICATE '1' ) );
    public final void predicate() throws RecognitionException {
        try {
            // org/apache/synapse/util/streaming_xpath/compiler/XPath1Walker.g:126:9: ( ^( PREDICATE predicateExpr ) | ^( PREDICATE '1' ) )
            int alt16=2;
            switch ( input.LA(1) ) {
            case PREDICATE:
                {
                switch ( input.LA(2) ) {
                case DOWN:
                    {
                    switch ( input.LA(3) ) {
                    case 58:
                        {
                        alt16=2;
                        }
                        break;
                    case OREXPR:
                        {
                        alt16=1;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 16, 2, input);

                        throw nvae;

                    }

                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 16, 1, input);

                    throw nvae;

                }

                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;

            }

            switch (alt16) {
                case 1 :
                    // org/apache/synapse/util/streaming_xpath/compiler/XPath1Walker.g:126:11: ^( PREDICATE predicateExpr )
                    {
                    match(input,PREDICATE,FOLLOW_PREDICATE_in_predicate994); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    pushFollow(FOLLOW_predicateExpr_in_predicate996);
                    predicateExpr();

                    state._fsp--;
                    if (state.failed) return ;

                    if ( state.backtracking==0 ) {throw new StreamingXPATHCompilerException();}

                    match(input, Token.UP, null); if (state.failed) return ;


                    }
                    break;
                case 2 :
                    // org/apache/synapse/util/streaming_xpath/compiler/XPath1Walker.g:127:10: ^( PREDICATE '1' )
                    {
                    match(input,PREDICATE,FOLLOW_PREDICATE_in_predicate1010); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    match(input,58,FOLLOW_58_in_predicate1012); if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "predicate"



    // $ANTLR start "predicateExpr"
    // org/apache/synapse/util/streaming_xpath/compiler/XPath1Walker.g:130:9: predicateExpr : expr ;
    public final void predicateExpr() throws RecognitionException {
        try {
            // org/apache/synapse/util/streaming_xpath/compiler/XPath1Walker.g:130:23: ( expr )
            // org/apache/synapse/util/streaming_xpath/compiler/XPath1Walker.g:130:25: expr
            {
            pushFollow(FOLLOW_expr_in_predicateExpr1038);
            expr();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "predicateExpr"



    // $ANTLR start "functionCall"
    // org/apache/synapse/util/streaming_xpath/compiler/XPath1Walker.g:132:9: functionCall : ^( FUNCALL qName ( expressionList )? ) ;
    public final void functionCall() throws RecognitionException {
        try {
            // org/apache/synapse/util/streaming_xpath/compiler/XPath1Walker.g:133:9: ( ^( FUNCALL qName ( expressionList )? ) )
            // org/apache/synapse/util/streaming_xpath/compiler/XPath1Walker.g:133:11: ^( FUNCALL qName ( expressionList )? )
            {
            match(input,FUNCALL,FOLLOW_FUNCALL_in_functionCall1063); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            pushFollow(FOLLOW_qName_in_functionCall1065);
            qName();

            state._fsp--;
            if (state.failed) return ;

            // org/apache/synapse/util/streaming_xpath/compiler/XPath1Walker.g:133:27: ( expressionList )?
            int alt17=2;
            switch ( input.LA(1) ) {
                case EXPRLIST:
                    {
                    alt17=1;
                    }
                    break;
            }

            switch (alt17) {
                case 1 :
                    // org/apache/synapse/util/streaming_xpath/compiler/XPath1Walker.g:133:27: expressionList
                    {
                    pushFollow(FOLLOW_expressionList_in_functionCall1067);
                    expressionList();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            match(input, Token.UP, null); if (state.failed) return ;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "functionCall"



    // $ANTLR start "expressionList"
    // org/apache/synapse/util/streaming_xpath/compiler/XPath1Walker.g:136:9: expressionList : ^( EXPRLIST ( expr )+ ) ;
    public final void expressionList() throws RecognitionException {
        try {
            // org/apache/synapse/util/streaming_xpath/compiler/XPath1Walker.g:137:9: ( ^( EXPRLIST ( expr )+ ) )
            // org/apache/synapse/util/streaming_xpath/compiler/XPath1Walker.g:137:11: ^( EXPRLIST ( expr )+ )
            {
            match(input,EXPRLIST,FOLLOW_EXPRLIST_in_expressionList1103); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            // org/apache/synapse/util/streaming_xpath/compiler/XPath1Walker.g:137:22: ( expr )+
            int cnt18=0;
            loop18:
            do {
                int alt18=2;
                switch ( input.LA(1) ) {
                case OREXPR:
                    {
                    alt18=1;
                    }
                    break;

                }

                switch (alt18) {
            	case 1 :
            	    // org/apache/synapse/util/streaming_xpath/compiler/XPath1Walker.g:137:22: expr
            	    {
            	    pushFollow(FOLLOW_expr_in_expressionList1105);
            	    expr();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    if ( cnt18 >= 1 ) break loop18;
            	    if (state.backtracking>0) {state.failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(18, input);
                        throw eee;
                }
                cnt18++;
            } while (true);


            match(input, Token.UP, null); if (state.failed) return ;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "expressionList"



    // $ANTLR start "pathExpr"
    // org/apache/synapse/util/streaming_xpath/compiler/XPath1Walker.g:140:9: pathExpr : ( locationPath | filterExpr ( simpleAxisStep relativeLocationPath )? );
    public final void pathExpr() throws RecognitionException {
        try {
            // org/apache/synapse/util/streaming_xpath/compiler/XPath1Walker.g:141:9: ( locationPath | filterExpr ( simpleAxisStep relativeLocationPath )? )
            int alt20=2;
            switch ( input.LA(1) ) {
            case LOCATION_PATH:
                {
                alt20=1;
                }
                break;
            case FUNCALL:
            case LeftParenthesis:
            case NUMBER:
            case STRING:
            case VARREF:
                {
                alt20=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;

            }

            switch (alt20) {
                case 1 :
                    // org/apache/synapse/util/streaming_xpath/compiler/XPath1Walker.g:141:11: locationPath
                    {
                    pushFollow(FOLLOW_locationPath_in_pathExpr1140);
                    locationPath();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // org/apache/synapse/util/streaming_xpath/compiler/XPath1Walker.g:142:11: filterExpr ( simpleAxisStep relativeLocationPath )?
                    {
                    pushFollow(FOLLOW_filterExpr_in_pathExpr1152);
                    filterExpr();

                    state._fsp--;
                    if (state.failed) return ;

                    // org/apache/synapse/util/streaming_xpath/compiler/XPath1Walker.g:142:22: ( simpleAxisStep relativeLocationPath )?
                    int alt19=2;
                    switch ( input.LA(1) ) {
                        case SIMPLE_AXIS_STEP:
                            {
                            alt19=1;
                            }
                            break;
                    }

                    switch (alt19) {
                        case 1 :
                            // org/apache/synapse/util/streaming_xpath/compiler/XPath1Walker.g:142:23: simpleAxisStep relativeLocationPath
                            {
                            pushFollow(FOLLOW_simpleAxisStep_in_pathExpr1155);
                            simpleAxisStep();

                            state._fsp--;
                            if (state.failed) return ;

                            pushFollow(FOLLOW_relativeLocationPath_in_pathExpr1158);
                            relativeLocationPath();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

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
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "pathExpr"



    // $ANTLR start "simpleAxisStep"
    // org/apache/synapse/util/streaming_xpath/compiler/XPath1Walker.g:145:9: simpleAxisStep : ( ^( SIMPLE_AXIS_STEP SingleAxisStep ) | ^( SIMPLE_AXIS_STEP RecursiveAxisStep ) );
    public final void simpleAxisStep() throws RecognitionException {
        try {
            // org/apache/synapse/util/streaming_xpath/compiler/XPath1Walker.g:146:9: ( ^( SIMPLE_AXIS_STEP SingleAxisStep ) | ^( SIMPLE_AXIS_STEP RecursiveAxisStep ) )
            int alt21=2;
            switch ( input.LA(1) ) {
            case SIMPLE_AXIS_STEP:
                {
                switch ( input.LA(2) ) {
                case DOWN:
                    {
                    switch ( input.LA(3) ) {
                    case SingleAxisStep:
                        {
                        alt21=1;
                        }
                        break;
                    case RecursiveAxisStep:
                        {
                        alt21=2;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 21, 2, input);

                        throw nvae;

                    }

                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 21, 1, input);

                    throw nvae;

                }

                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;

            }

            switch (alt21) {
                case 1 :
                    // org/apache/synapse/util/streaming_xpath/compiler/XPath1Walker.g:146:10: ^( SIMPLE_AXIS_STEP SingleAxisStep )
                    {
                    match(input,SIMPLE_AXIS_STEP,FOLLOW_SIMPLE_AXIS_STEP_in_simpleAxisStep1201); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    match(input,SingleAxisStep,FOLLOW_SingleAxisStep_in_simpleAxisStep1203); if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;


                    }
                    break;
                case 2 :
                    // org/apache/synapse/util/streaming_xpath/compiler/XPath1Walker.g:147:10: ^( SIMPLE_AXIS_STEP RecursiveAxisStep )
                    {
                    match(input,SIMPLE_AXIS_STEP,FOLLOW_SIMPLE_AXIS_STEP_in_simpleAxisStep1216); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    match(input,RecursiveAxisStep,FOLLOW_RecursiveAxisStep_in_simpleAxisStep1218); if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "simpleAxisStep"



    // $ANTLR start "filterExpr"
    // org/apache/synapse/util/streaming_xpath/compiler/XPath1Walker.g:150:9: filterExpr : primaryExpr ( predicate )? ;
    public final void filterExpr() throws RecognitionException {
        try {
            // org/apache/synapse/util/streaming_xpath/compiler/XPath1Walker.g:151:9: ( primaryExpr ( predicate )? )
            // org/apache/synapse/util/streaming_xpath/compiler/XPath1Walker.g:151:11: primaryExpr ( predicate )?
            {
            pushFollow(FOLLOW_primaryExpr_in_filterExpr1260);
            primaryExpr();

            state._fsp--;
            if (state.failed) return ;

            // org/apache/synapse/util/streaming_xpath/compiler/XPath1Walker.g:151:23: ( predicate )?
            int alt22=2;
            switch ( input.LA(1) ) {
                case PREDICATE:
                    {
                    alt22=1;
                    }
                    break;
            }

            switch (alt22) {
                case 1 :
                    // org/apache/synapse/util/streaming_xpath/compiler/XPath1Walker.g:151:23: predicate
                    {
                    pushFollow(FOLLOW_predicate_in_filterExpr1262);
                    predicate();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "filterExpr"



    // $ANTLR start "primaryExpr"
    // org/apache/synapse/util/streaming_xpath/compiler/XPath1Walker.g:153:9: primaryExpr : ( LeftParenthesis expr RightParenthesis | literal | functionCall );
    public final void primaryExpr() throws RecognitionException {
        try {
            // org/apache/synapse/util/streaming_xpath/compiler/XPath1Walker.g:154:9: ( LeftParenthesis expr RightParenthesis | literal | functionCall )
            int alt23=3;
            switch ( input.LA(1) ) {
            case LeftParenthesis:
                {
                alt23=1;
                }
                break;
            case NUMBER:
            case STRING:
            case VARREF:
                {
                alt23=2;
                }
                break;
            case FUNCALL:
                {
                alt23=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;

            }

            switch (alt23) {
                case 1 :
                    // org/apache/synapse/util/streaming_xpath/compiler/XPath1Walker.g:154:11: LeftParenthesis expr RightParenthesis
                    {
                    match(input,LeftParenthesis,FOLLOW_LeftParenthesis_in_primaryExpr1287); if (state.failed) return ;

                    pushFollow(FOLLOW_expr_in_primaryExpr1289);
                    expr();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input,RightParenthesis,FOLLOW_RightParenthesis_in_primaryExpr1291); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // org/apache/synapse/util/streaming_xpath/compiler/XPath1Walker.g:155:11: literal
                    {
                    pushFollow(FOLLOW_literal_in_primaryExpr1303);
                    literal();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // org/apache/synapse/util/streaming_xpath/compiler/XPath1Walker.g:156:11: functionCall
                    {
                    pushFollow(FOLLOW_functionCall_in_primaryExpr1315);
                    functionCall();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "primaryExpr"



    // $ANTLR start "expr"
    // org/apache/synapse/util/streaming_xpath/compiler/XPath1Walker.g:159:9: expr : orExpr ;
    public final void expr() throws RecognitionException {
        try {
            // org/apache/synapse/util/streaming_xpath/compiler/XPath1Walker.g:160:9: ( orExpr )
            // org/apache/synapse/util/streaming_xpath/compiler/XPath1Walker.g:160:11: orExpr
            {
            pushFollow(FOLLOW_orExpr_in_expr1348);
            orExpr();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "expr"



    // $ANTLR start "orExpr"
    // org/apache/synapse/util/streaming_xpath/compiler/XPath1Walker.g:163:9: orExpr : ^( OREXPR ( andExpr )+ ) ;
    public final void orExpr() throws RecognitionException {
        try {
            // org/apache/synapse/util/streaming_xpath/compiler/XPath1Walker.g:164:9: ( ^( OREXPR ( andExpr )+ ) )
            // org/apache/synapse/util/streaming_xpath/compiler/XPath1Walker.g:164:10: ^( OREXPR ( andExpr )+ )
            {
            match(input,OREXPR,FOLLOW_OREXPR_in_orExpr1381); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            // org/apache/synapse/util/streaming_xpath/compiler/XPath1Walker.g:164:19: ( andExpr )+
            int cnt24=0;
            loop24:
            do {
                int alt24=2;
                switch ( input.LA(1) ) {
                case ANDEXPR:
                    {
                    alt24=1;
                    }
                    break;

                }

                switch (alt24) {
            	case 1 :
            	    // org/apache/synapse/util/streaming_xpath/compiler/XPath1Walker.g:164:19: andExpr
            	    {
            	    pushFollow(FOLLOW_andExpr_in_orExpr1383);
            	    andExpr();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    if ( cnt24 >= 1 ) break loop24;
            	    if (state.backtracking>0) {state.failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(24, input);
                        throw eee;
                }
                cnt24++;
            } while (true);


            match(input, Token.UP, null); if (state.failed) return ;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "orExpr"



    // $ANTLR start "andExpr"
    // org/apache/synapse/util/streaming_xpath/compiler/XPath1Walker.g:167:9: andExpr : ^( ANDEXPR ( equalityExpr )+ ) ;
    public final void andExpr() throws RecognitionException {
        try {
            // org/apache/synapse/util/streaming_xpath/compiler/XPath1Walker.g:168:9: ( ^( ANDEXPR ( equalityExpr )+ ) )
            // org/apache/synapse/util/streaming_xpath/compiler/XPath1Walker.g:168:11: ^( ANDEXPR ( equalityExpr )+ )
            {
            match(input,ANDEXPR,FOLLOW_ANDEXPR_in_andExpr1419); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            // org/apache/synapse/util/streaming_xpath/compiler/XPath1Walker.g:168:21: ( equalityExpr )+
            int cnt25=0;
            loop25:
            do {
                int alt25=2;
                switch ( input.LA(1) ) {
                case EQUEXPRESSION:
                    {
                    alt25=1;
                    }
                    break;

                }

                switch (alt25) {
            	case 1 :
            	    // org/apache/synapse/util/streaming_xpath/compiler/XPath1Walker.g:168:21: equalityExpr
            	    {
            	    pushFollow(FOLLOW_equalityExpr_in_andExpr1421);
            	    equalityExpr();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    if ( cnt25 >= 1 ) break loop25;
            	    if (state.backtracking>0) {state.failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(25, input);
                        throw eee;
                }
                cnt25++;
            } while (true);


            match(input, Token.UP, null); if (state.failed) return ;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "andExpr"



    // $ANTLR start "equalityExpr"
    // org/apache/synapse/util/streaming_xpath/compiler/XPath1Walker.g:171:9: equalityExpr : ^( EQUEXPRESSION relationalExpr ( EqualtyOp relationalExpr )? ) ;
    public final void equalityExpr() throws RecognitionException {
        try {
            // org/apache/synapse/util/streaming_xpath/compiler/XPath1Walker.g:172:9: ( ^( EQUEXPRESSION relationalExpr ( EqualtyOp relationalExpr )? ) )
            // org/apache/synapse/util/streaming_xpath/compiler/XPath1Walker.g:172:11: ^( EQUEXPRESSION relationalExpr ( EqualtyOp relationalExpr )? )
            {
            match(input,EQUEXPRESSION,FOLLOW_EQUEXPRESSION_in_equalityExpr1457); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            pushFollow(FOLLOW_relationalExpr_in_equalityExpr1459);
            relationalExpr();

            state._fsp--;
            if (state.failed) return ;

            // org/apache/synapse/util/streaming_xpath/compiler/XPath1Walker.g:172:42: ( EqualtyOp relationalExpr )?
            int alt26=2;
            switch ( input.LA(1) ) {
                case EqualtyOp:
                    {
                    alt26=1;
                    }
                    break;
            }

            switch (alt26) {
                case 1 :
                    // org/apache/synapse/util/streaming_xpath/compiler/XPath1Walker.g:172:43: EqualtyOp relationalExpr
                    {
                    match(input,EqualtyOp,FOLLOW_EqualtyOp_in_equalityExpr1462); if (state.failed) return ;

                    pushFollow(FOLLOW_relationalExpr_in_equalityExpr1464);
                    relationalExpr();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            match(input, Token.UP, null); if (state.failed) return ;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "equalityExpr"



    // $ANTLR start "relationalExpr"
    // org/apache/synapse/util/streaming_xpath/compiler/XPath1Walker.g:175:9: relationalExpr : unionExpr ;
    public final void relationalExpr() throws RecognitionException {
        try {
            // org/apache/synapse/util/streaming_xpath/compiler/XPath1Walker.g:176:9: ( unionExpr )
            // org/apache/synapse/util/streaming_xpath/compiler/XPath1Walker.g:176:11: unionExpr
            {
            pushFollow(FOLLOW_unionExpr_in_relationalExpr1500);
            unionExpr();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "relationalExpr"



    // $ANTLR start "unionExpr"
    // org/apache/synapse/util/streaming_xpath/compiler/XPath1Walker.g:179:9: unionExpr : ^( UNIONEXPR ( pathExpr )+ ) ;
    public final void unionExpr() throws RecognitionException {
        try {
            // org/apache/synapse/util/streaming_xpath/compiler/XPath1Walker.g:180:9: ( ^( UNIONEXPR ( pathExpr )+ ) )
            // org/apache/synapse/util/streaming_xpath/compiler/XPath1Walker.g:180:10: ^( UNIONEXPR ( pathExpr )+ )
            {
            match(input,UNIONEXPR,FOLLOW_UNIONEXPR_in_unionExpr1533); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            // org/apache/synapse/util/streaming_xpath/compiler/XPath1Walker.g:180:22: ( pathExpr )+
            int cnt27=0;
            loop27:
            do {
                int alt27=2;
                switch ( input.LA(1) ) {
                case FUNCALL:
                case LOCATION_PATH:
                case LeftParenthesis:
                case NUMBER:
                case STRING:
                case VARREF:
                    {
                    alt27=1;
                    }
                    break;

                }

                switch (alt27) {
            	case 1 :
            	    // org/apache/synapse/util/streaming_xpath/compiler/XPath1Walker.g:180:22: pathExpr
            	    {
            	    pushFollow(FOLLOW_pathExpr_in_unionExpr1535);
            	    pathExpr();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    if ( cnt27 >= 1 ) break loop27;
            	    if (state.backtracking>0) {state.failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(27, input);
                        throw eee;
                }
                cnt27++;
            } while (true);


            match(input, Token.UP, null); if (state.failed) return ;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "unionExpr"



    // $ANTLR start "literal"
    // org/apache/synapse/util/streaming_xpath/compiler/XPath1Walker.g:183:9: literal : ( ^( STRING StringLiteral ) | ^( NUMBER numericLiteral ) | ^( VARREF VariableReference ) );
    public final void literal() throws RecognitionException {
        try {
            // org/apache/synapse/util/streaming_xpath/compiler/XPath1Walker.g:184:9: ( ^( STRING StringLiteral ) | ^( NUMBER numericLiteral ) | ^( VARREF VariableReference ) )
            int alt28=3;
            switch ( input.LA(1) ) {
            case STRING:
                {
                alt28=1;
                }
                break;
            case NUMBER:
                {
                alt28=2;
                }
                break;
            case VARREF:
                {
                alt28=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;

            }

            switch (alt28) {
                case 1 :
                    // org/apache/synapse/util/streaming_xpath/compiler/XPath1Walker.g:184:11: ^( STRING StringLiteral )
                    {
                    match(input,STRING,FOLLOW_STRING_in_literal1571); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    match(input,StringLiteral,FOLLOW_StringLiteral_in_literal1573); if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;


                    }
                    break;
                case 2 :
                    // org/apache/synapse/util/streaming_xpath/compiler/XPath1Walker.g:185:10: ^( NUMBER numericLiteral )
                    {
                    match(input,NUMBER,FOLLOW_NUMBER_in_literal1586); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    pushFollow(FOLLOW_numericLiteral_in_literal1588);
                    numericLiteral();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;


                    }
                    break;
                case 3 :
                    // org/apache/synapse/util/streaming_xpath/compiler/XPath1Walker.g:186:10: ^( VARREF VariableReference )
                    {
                    match(input,VARREF,FOLLOW_VARREF_in_literal1601); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    match(input,VariableReference,FOLLOW_VariableReference_in_literal1603); if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "literal"



    // $ANTLR start "numericLiteral"
    // org/apache/synapse/util/streaming_xpath/compiler/XPath1Walker.g:189:9: numericLiteral : ( IntegerLiteral | DecimalLiteral | DoubleLiteral );
    public final void numericLiteral() throws RecognitionException {
        try {
            // org/apache/synapse/util/streaming_xpath/compiler/XPath1Walker.g:190:9: ( IntegerLiteral | DecimalLiteral | DoubleLiteral )
            // org/apache/synapse/util/streaming_xpath/compiler/XPath1Walker.g:
            {
            if ( (input.LA(1) >= DecimalLiteral && input.LA(1) <= DoubleLiteral)||input.LA(1)==IntegerLiteral ) {
                input.consume();
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "numericLiteral"



    // $ANTLR start "qName"
    // org/apache/synapse/util/streaming_xpath/compiler/XPath1Walker.g:194:9: qName returns [QName qname] : ( ^( NameSpacedQNAME a= Name b= Name ) | ^( QNAME c= Name ) );
    public final QName qName() throws RecognitionException {
        QName qname = null;


        CommonTree a=null;
        CommonTree b=null;
        CommonTree c=null;


                String namespace=""; 
                String localname="";
                
        try {
            // org/apache/synapse/util/streaming_xpath/compiler/XPath1Walker.g:200:9: ( ^( NameSpacedQNAME a= Name b= Name ) | ^( QNAME c= Name ) )
            int alt29=2;
            switch ( input.LA(1) ) {
            case NameSpacedQNAME:
                {
                alt29=1;
                }
                break;
            case QNAME:
                {
                alt29=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return qname;}
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;

            }

            switch (alt29) {
                case 1 :
                    // org/apache/synapse/util/streaming_xpath/compiler/XPath1Walker.g:200:11: ^( NameSpacedQNAME a= Name b= Name )
                    {
                    match(input,NameSpacedQNAME,FOLLOW_NameSpacedQNAME_in_qName1717); if (state.failed) return qname;

                    match(input, Token.DOWN, null); if (state.failed) return qname;
                    a=(CommonTree)match(input,Name,FOLLOW_Name_in_qName1731); if (state.failed) return qname;

                    b=(CommonTree)match(input,Name,FOLLOW_Name_in_qName1735); if (state.failed) return qname;

                    if ( state.backtracking==0 ) {
                            namespace=(a!=null?a.getText():null);
                            localname=(b!=null?b.getText():null);
                            qname =new QName(namespace,localname);
                            }

                    match(input, Token.UP, null); if (state.failed) return qname;


                    }
                    break;
                case 2 :
                    // org/apache/synapse/util/streaming_xpath/compiler/XPath1Walker.g:207:11: ^( QNAME c= Name )
                    {
                    match(input,QNAME,FOLLOW_QNAME_in_qName1762); if (state.failed) return qname;

                    match(input, Token.DOWN, null); if (state.failed) return qname;
                    c=(CommonTree)match(input,Name,FOLLOW_Name_in_qName1766); if (state.failed) return qname;

                    if ( state.backtracking==0 ) {
                            localname=(c!=null?c.getText():null);
                            qname =new QName("",localname);
                            }

                    match(input, Token.UP, null); if (state.failed) return qname;


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return qname;
    }
    // $ANTLR end "qName"

    // $ANTLR start synpred2_XPath1Walker
    public final void synpred2_XPath1Walker_fragment() throws RecognitionException {
        // org/apache/synapse/util/streaming_xpath/compiler/XPath1Walker.g:42:10: ( ^( LOCATION_PATH SynapseSpecificBody relativeLocationPath ) )
        // org/apache/synapse/util/streaming_xpath/compiler/XPath1Walker.g:42:10: ^( LOCATION_PATH SynapseSpecificBody relativeLocationPath )
        {
        match(input,LOCATION_PATH,FOLLOW_LOCATION_PATH_in_synpred2_XPath1Walker341); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,SynapseSpecificBody,FOLLOW_SynapseSpecificBody_in_synpred2_XPath1Walker343); if (state.failed) return ;

        pushFollow(FOLLOW_relativeLocationPath_in_synpred2_XPath1Walker345);
        relativeLocationPath();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;


        }

    }
    // $ANTLR end synpred2_XPath1Walker

    // $ANTLR start synpred3_XPath1Walker
    public final void synpred3_XPath1Walker_fragment() throws RecognitionException {
        // org/apache/synapse/util/streaming_xpath/compiler/XPath1Walker.g:43:10: ( ^( LOCATION_PATH SynapseSpecific relativeLocationPath ) )
        // org/apache/synapse/util/streaming_xpath/compiler/XPath1Walker.g:43:10: ^( LOCATION_PATH SynapseSpecific relativeLocationPath )
        {
        match(input,LOCATION_PATH,FOLLOW_LOCATION_PATH_in_synpred3_XPath1Walker360); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,SynapseSpecific,FOLLOW_SynapseSpecific_in_synpred3_XPath1Walker362); if (state.failed) return ;

        pushFollow(FOLLOW_relativeLocationPath_in_synpred3_XPath1Walker366);
        relativeLocationPath();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;


        }

    }
    // $ANTLR end synpred3_XPath1Walker

    // $ANTLR start synpred4_XPath1Walker
    public final void synpred4_XPath1Walker_fragment() throws RecognitionException {
        // org/apache/synapse/util/streaming_xpath/compiler/XPath1Walker.g:44:10: ( ^( LOCATION_PATH SynapseSpecificBody absoluteLocationPath ) )
        // org/apache/synapse/util/streaming_xpath/compiler/XPath1Walker.g:44:10: ^( LOCATION_PATH SynapseSpecificBody absoluteLocationPath )
        {
        match(input,LOCATION_PATH,FOLLOW_LOCATION_PATH_in_synpred4_XPath1Walker379); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,SynapseSpecificBody,FOLLOW_SynapseSpecificBody_in_synpred4_XPath1Walker381); if (state.failed) return ;

        pushFollow(FOLLOW_absoluteLocationPath_in_synpred4_XPath1Walker383);
        absoluteLocationPath();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;


        }

    }
    // $ANTLR end synpred4_XPath1Walker

    // $ANTLR start synpred5_XPath1Walker
    public final void synpred5_XPath1Walker_fragment() throws RecognitionException {
        // org/apache/synapse/util/streaming_xpath/compiler/XPath1Walker.g:48:10: ( ^( LOCATION_PATH SynapseSpecific absoluteLocationPath ) )
        // org/apache/synapse/util/streaming_xpath/compiler/XPath1Walker.g:48:10: ^( LOCATION_PATH SynapseSpecific absoluteLocationPath )
        {
        match(input,LOCATION_PATH,FOLLOW_LOCATION_PATH_in_synpred5_XPath1Walker396); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,SynapseSpecific,FOLLOW_SynapseSpecific_in_synpred5_XPath1Walker398); if (state.failed) return ;

        pushFollow(FOLLOW_absoluteLocationPath_in_synpred5_XPath1Walker402);
        absoluteLocationPath();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;


        }

    }
    // $ANTLR end synpred5_XPath1Walker

    // $ANTLR start synpred6_XPath1Walker
    public final void synpred6_XPath1Walker_fragment() throws RecognitionException {
        // org/apache/synapse/util/streaming_xpath/compiler/XPath1Walker.g:49:10: ( ^( LOCATION_PATH relativeLocationPath ) )
        // org/apache/synapse/util/streaming_xpath/compiler/XPath1Walker.g:49:10: ^( LOCATION_PATH relativeLocationPath )
        {
        match(input,LOCATION_PATH,FOLLOW_LOCATION_PATH_in_synpred6_XPath1Walker415); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_relativeLocationPath_in_synpred6_XPath1Walker417);
        relativeLocationPath();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;


        }

    }
    // $ANTLR end synpred6_XPath1Walker

    // $ANTLR start synpred7_XPath1Walker
    public final void synpred7_XPath1Walker_fragment() throws RecognitionException {
        // org/apache/synapse/util/streaming_xpath/compiler/XPath1Walker.g:50:10: ( ^( LOCATION_PATH absoluteLocationPath ) )
        // org/apache/synapse/util/streaming_xpath/compiler/XPath1Walker.g:50:10: ^( LOCATION_PATH absoluteLocationPath )
        {
        match(input,LOCATION_PATH,FOLLOW_LOCATION_PATH_in_synpred7_XPath1Walker432); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_absoluteLocationPath_in_synpred7_XPath1Walker434);
        absoluteLocationPath();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;


        }

    }
    // $ANTLR end synpred7_XPath1Walker

    // $ANTLR start synpred13_XPath1Walker
    public final void synpred13_XPath1Walker_fragment() throws RecognitionException {
        // org/apache/synapse/util/streaming_xpath/compiler/XPath1Walker.g:66:43: ( ( predicate )* )
        // org/apache/synapse/util/streaming_xpath/compiler/XPath1Walker.g:66:43: ( predicate )*
        {
        // org/apache/synapse/util/streaming_xpath/compiler/XPath1Walker.g:66:43: ( predicate )*
        loop31:
        do {
            int alt31=2;
            switch ( input.LA(1) ) {
            case PREDICATE:
                {
                alt31=1;
                }
                break;

            }

            switch (alt31) {
        	case 1 :
        	    // org/apache/synapse/util/streaming_xpath/compiler/XPath1Walker.g:66:43: predicate
        	    {
        	    pushFollow(FOLLOW_predicate_in_synpred13_XPath1Walker616);
        	    predicate();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    break loop31;
            }
        } while (true);


        }

    }
    // $ANTLR end synpred13_XPath1Walker

    // $ANTLR start synpred16_XPath1Walker
    public final void synpred16_XPath1Walker_fragment() throws RecognitionException {
        // org/apache/synapse/util/streaming_xpath/compiler/XPath1Walker.g:67:49: ( ( predicate )* )
        // org/apache/synapse/util/streaming_xpath/compiler/XPath1Walker.g:67:49: ( predicate )*
        {
        // org/apache/synapse/util/streaming_xpath/compiler/XPath1Walker.g:67:49: ( predicate )*
        loop34:
        do {
            int alt34=2;
            switch ( input.LA(1) ) {
            case PREDICATE:
                {
                alt34=1;
                }
                break;

            }

            switch (alt34) {
        	case 1 :
        	    // org/apache/synapse/util/streaming_xpath/compiler/XPath1Walker.g:67:49: predicate
        	    {
        	    pushFollow(FOLLOW_predicate_in_synpred16_XPath1Walker637);
        	    predicate();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    break loop34;
            }
        } while (true);


        }

    }
    // $ANTLR end synpred16_XPath1Walker

    // Delegated rules

    public final boolean synpred16_XPath1Walker() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred16_XPath1Walker_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred7_XPath1Walker() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred7_XPath1Walker_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_XPath1Walker() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_XPath1Walker_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred5_XPath1Walker() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_XPath1Walker_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred13_XPath1Walker() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred13_XPath1Walker_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred6_XPath1Walker() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred6_XPath1Walker_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_XPath1Walker() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_XPath1Walker_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_XPath1Walker() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_XPath1Walker_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_locationPath_in_xpath287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SYNAPSE_SPECIFIC_in_xpath302 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_SynapseSpecific_in_xpath304 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_locationPath_in_xpath306 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LOCATION_PATH_in_locationPath341 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_SynapseSpecificBody_in_locationPath343 = new BitSet(new long[]{0x0000418000000000L});
    public static final BitSet FOLLOW_relativeLocationPath_in_locationPath345 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LOCATION_PATH_in_locationPath360 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_SynapseSpecific_in_locationPath362 = new BitSet(new long[]{0x0000418000000000L});
    public static final BitSet FOLLOW_relativeLocationPath_in_locationPath366 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LOCATION_PATH_in_locationPath379 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_SynapseSpecificBody_in_locationPath381 = new BitSet(new long[]{0x0000410000000000L});
    public static final BitSet FOLLOW_absoluteLocationPath_in_locationPath383 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LOCATION_PATH_in_locationPath396 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_SynapseSpecific_in_locationPath398 = new BitSet(new long[]{0x0000410000000000L});
    public static final BitSet FOLLOW_absoluteLocationPath_in_locationPath402 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LOCATION_PATH_in_locationPath415 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_relativeLocationPath_in_locationPath417 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LOCATION_PATH_in_locationPath432 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_absoluteLocationPath_in_locationPath434 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LOCATION_PATH_in_locationPath447 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_Name_in_locationPath449 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SingleAxisStep_in_absoluteLocationPath485 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_relativeLocationPath_in_absoluteLocationPath488 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_RecursiveAxisStep_in_absoluteLocationPath503 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_relativeLocationPath_in_absoluteLocationPath505 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SingleAxisStep_in_relativeLocationPath541 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_step_in_relativeLocationPath544 = new BitSet(new long[]{0x0000418000000000L});
    public static final BitSet FOLLOW_relativeLocationPath_in_relativeLocationPath546 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_RecursiveAxisStep_in_relativeLocationPath559 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_step_in_relativeLocationPath562 = new BitSet(new long[]{0x0000418000000000L});
    public static final BitSet FOLLOW_relativeLocationPath_in_relativeLocationPath565 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_step_in_relativeLocationPath577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QNAME_PREDICATE_in_step611 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_namedAxisStep_in_step613 = new BitSet(new long[]{0x0000000800000008L});
    public static final BitSet FOLLOW_predicate_in_step616 = new BitSet(new long[]{0x0000000800000008L});
    public static final BitSet FOLLOW_QNAME_PREDICATE_in_step632 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_abbreviatedAxisStep_in_step634 = new BitSet(new long[]{0x0000000800000008L});
    public static final BitSet FOLLOW_predicate_in_step637 = new BitSet(new long[]{0x0000000800000008L});
    public static final BitSet FOLLOW_ABBREVIATED_AXIS_STEP_in_abbreviatedAxisStep687 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_56_in_abbreviatedAxisStep689 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ABBREVIATED_AXIS_STEP_in_abbreviatedAxisStep705 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_57_in_abbreviatedAxisStep707 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ATTRIBUTE_AXIS_in_namedAxisStep744 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_AbbreviatedAxisSpecifier_in_namedAxisStep746 = new BitSet(new long[]{0x00000060800000C0L});
    public static final BitSet FOLLOW_nodeTest_in_namedAxisStep748 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NAMED_AXIS_STEP_in_namedAxisStep763 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_axisSpecifier_in_namedAxisStep765 = new BitSet(new long[]{0x00000060800000C0L});
    public static final BitSet FOLLOW_nodeTest_in_namedAxisStep768 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NAME_AXIS_in_axisSpecifier804 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_AxisName_in_axisSpecifier806 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_nameTest_in_nodeTest848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ANY_NODE_in_nodeTest864 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_NodeType_in_nodeTest866 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ProcessingInstruction_in_nodeTest880 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_LeftParenthesis_in_nodeTest883 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_StringLiteral_in_nodeTest885 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_RightParenthesis_in_nodeTest887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ANY_NODE_in_nameTest925 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ANY_NODE_in_nameTest928 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ANY_NAMESPACED_NODE_in_nameTest942 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_Name_in_nameTest944 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_qName_in_nameTest958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PREDICATE_in_predicate994 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_predicateExpr_in_predicate996 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PREDICATE_in_predicate1010 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_58_in_predicate1012 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_expr_in_predicateExpr1038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNCALL_in_functionCall1063 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_qName_in_functionCall1065 = new BitSet(new long[]{0x0000000000080008L});
    public static final BitSet FOLLOW_expressionList_in_functionCall1067 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EXPRLIST_in_expressionList1103 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expressionList1105 = new BitSet(new long[]{0x0000000200000008L});
    public static final BitSet FOLLOW_locationPath_in_pathExpr1140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_filterExpr_in_pathExpr1152 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_simpleAxisStep_in_pathExpr1155 = new BitSet(new long[]{0x0000418000000000L});
    public static final BitSet FOLLOW_relativeLocationPath_in_pathExpr1158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SIMPLE_AXIS_STEP_in_simpleAxisStep1201 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_SingleAxisStep_in_simpleAxisStep1203 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SIMPLE_AXIS_STEP_in_simpleAxisStep1216 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_RecursiveAxisStep_in_simpleAxisStep1218 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_primaryExpr_in_filterExpr1260 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_predicate_in_filterExpr1262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LeftParenthesis_in_primaryExpr1287 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_expr_in_primaryExpr1289 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_RightParenthesis_in_primaryExpr1291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_primaryExpr1303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionCall_in_primaryExpr1315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_orExpr_in_expr1348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OREXPR_in_orExpr1381 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_andExpr_in_orExpr1383 = new BitSet(new long[]{0x0000000000000028L});
    public static final BitSet FOLLOW_ANDEXPR_in_andExpr1419 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_equalityExpr_in_andExpr1421 = new BitSet(new long[]{0x0000000000040008L});
    public static final BitSet FOLLOW_EQUEXPRESSION_in_equalityExpr1457 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_relationalExpr_in_equalityExpr1459 = new BitSet(new long[]{0x0000000000100008L});
    public static final BitSet FOLLOW_EqualtyOp_in_equalityExpr1462 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_relationalExpr_in_equalityExpr1464 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_unionExpr_in_relationalExpr1500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UNIONEXPR_in_unionExpr1533 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_pathExpr_in_unionExpr1535 = new BitSet(new long[]{0x0010100021A00008L});
    public static final BitSet FOLLOW_STRING_in_literal1571 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_StringLiteral_in_literal1573 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NUMBER_in_literal1586 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_numericLiteral_in_literal1588 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_VARREF_in_literal1601 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_VariableReference_in_literal1603 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NameSpacedQNAME_in_qName1717 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_Name_in_qName1731 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_Name_in_qName1735 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_QNAME_in_qName1762 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_Name_in_qName1766 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LOCATION_PATH_in_synpred2_XPath1Walker341 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_SynapseSpecificBody_in_synpred2_XPath1Walker343 = new BitSet(new long[]{0x0000418000000000L});
    public static final BitSet FOLLOW_relativeLocationPath_in_synpred2_XPath1Walker345 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LOCATION_PATH_in_synpred3_XPath1Walker360 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_SynapseSpecific_in_synpred3_XPath1Walker362 = new BitSet(new long[]{0x0000418000000000L});
    public static final BitSet FOLLOW_relativeLocationPath_in_synpred3_XPath1Walker366 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LOCATION_PATH_in_synpred4_XPath1Walker379 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_SynapseSpecificBody_in_synpred4_XPath1Walker381 = new BitSet(new long[]{0x0000410000000000L});
    public static final BitSet FOLLOW_absoluteLocationPath_in_synpred4_XPath1Walker383 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LOCATION_PATH_in_synpred5_XPath1Walker396 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_SynapseSpecific_in_synpred5_XPath1Walker398 = new BitSet(new long[]{0x0000410000000000L});
    public static final BitSet FOLLOW_absoluteLocationPath_in_synpred5_XPath1Walker402 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LOCATION_PATH_in_synpred6_XPath1Walker415 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_relativeLocationPath_in_synpred6_XPath1Walker417 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LOCATION_PATH_in_synpred7_XPath1Walker432 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_absoluteLocationPath_in_synpred7_XPath1Walker434 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_predicate_in_synpred13_XPath1Walker616 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_predicate_in_synpred16_XPath1Walker637 = new BitSet(new long[]{0x0000000800000002L});

}