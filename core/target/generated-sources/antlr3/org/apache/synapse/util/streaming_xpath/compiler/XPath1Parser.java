// $ANTLR 3.4 org/apache/synapse/util/streaming_xpath/compiler/XPath1.g 2015-01-05 12:10:13

	package org.apache.synapse.util.streaming_xpath.compiler;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class XPath1Parser extends Parser {
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
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public XPath1Parser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public XPath1Parser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}
    public String[] getTokenNames() { return XPath1Parser.tokenNames; }
    public String getGrammarFileName() { return "org/apache/synapse/util/streaming_xpath/compiler/XPath1.g"; }


    public static class xpath_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "xpath"
    // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:32:1: xpath : locationPath ;
    public final XPath1Parser.xpath_return xpath() throws RecognitionException {
        XPath1Parser.xpath_return retval = new XPath1Parser.xpath_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        XPath1Parser.locationPath_return locationPath1 =null;



        try {
            // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:33:5: ( locationPath )
            // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:33:8: locationPath
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_locationPath_in_xpath202);
            locationPath1=locationPath();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, locationPath1.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "xpath"


    public static class locationPath_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "locationPath"
    // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:36:1: locationPath : ( SynapseSpecificBody relativeLocationPath -> ^( LOCATION_PATH SynapseSpecificBody relativeLocationPath ) | SynapseSpecific relativeLocationPath -> ^( LOCATION_PATH SynapseSpecific relativeLocationPath ) | SynapseSpecificBody absoluteLocationPath -> ^( LOCATION_PATH SynapseSpecificBody absoluteLocationPath ) | SynapseSpecific absoluteLocationPath -> ^( LOCATION_PATH SynapseSpecific absoluteLocationPath ) | relativeLocationPath -> ^( LOCATION_PATH relativeLocationPath ) | absoluteLocationPath -> ^( LOCATION_PATH absoluteLocationPath ) | SynapseSpecific ':' Name -> ^( LOCATION_PATH Name ) | SynapseSpecificBody -> ^( LOCATION_PATH SynapseSpecificBody ) | SynapseSpecific -> ^( LOCATION_PATH SynapseSpecific ) );
    public final XPath1Parser.locationPath_return locationPath() throws RecognitionException {
        XPath1Parser.locationPath_return retval = new XPath1Parser.locationPath_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token SynapseSpecificBody2=null;
        Token SynapseSpecific4=null;
        Token SynapseSpecificBody6=null;
        Token SynapseSpecific8=null;
        Token SynapseSpecific12=null;
        Token char_literal13=null;
        Token Name14=null;
        Token SynapseSpecificBody15=null;
        Token SynapseSpecific16=null;
        XPath1Parser.relativeLocationPath_return relativeLocationPath3 =null;

        XPath1Parser.relativeLocationPath_return relativeLocationPath5 =null;

        XPath1Parser.absoluteLocationPath_return absoluteLocationPath7 =null;

        XPath1Parser.absoluteLocationPath_return absoluteLocationPath9 =null;

        XPath1Parser.relativeLocationPath_return relativeLocationPath10 =null;

        XPath1Parser.absoluteLocationPath_return absoluteLocationPath11 =null;


        CommonTree SynapseSpecificBody2_tree=null;
        CommonTree SynapseSpecific4_tree=null;
        CommonTree SynapseSpecificBody6_tree=null;
        CommonTree SynapseSpecific8_tree=null;
        CommonTree SynapseSpecific12_tree=null;
        CommonTree char_literal13_tree=null;
        CommonTree Name14_tree=null;
        CommonTree SynapseSpecificBody15_tree=null;
        CommonTree SynapseSpecific16_tree=null;
        RewriteRuleTokenStream stream_Name=new RewriteRuleTokenStream(adaptor,"token Name");
        RewriteRuleTokenStream stream_Colon=new RewriteRuleTokenStream(adaptor,"token Colon");
        RewriteRuleTokenStream stream_SynapseSpecificBody=new RewriteRuleTokenStream(adaptor,"token SynapseSpecificBody");
        RewriteRuleTokenStream stream_SynapseSpecific=new RewriteRuleTokenStream(adaptor,"token SynapseSpecific");
        RewriteRuleSubtreeStream stream_relativeLocationPath=new RewriteRuleSubtreeStream(adaptor,"rule relativeLocationPath");
        RewriteRuleSubtreeStream stream_absoluteLocationPath=new RewriteRuleSubtreeStream(adaptor,"rule absoluteLocationPath");
        try {
            // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:37:5: ( SynapseSpecificBody relativeLocationPath -> ^( LOCATION_PATH SynapseSpecificBody relativeLocationPath ) | SynapseSpecific relativeLocationPath -> ^( LOCATION_PATH SynapseSpecific relativeLocationPath ) | SynapseSpecificBody absoluteLocationPath -> ^( LOCATION_PATH SynapseSpecificBody absoluteLocationPath ) | SynapseSpecific absoluteLocationPath -> ^( LOCATION_PATH SynapseSpecific absoluteLocationPath ) | relativeLocationPath -> ^( LOCATION_PATH relativeLocationPath ) | absoluteLocationPath -> ^( LOCATION_PATH absoluteLocationPath ) | SynapseSpecific ':' Name -> ^( LOCATION_PATH Name ) | SynapseSpecificBody -> ^( LOCATION_PATH SynapseSpecificBody ) | SynapseSpecific -> ^( LOCATION_PATH SynapseSpecific ) )
            int alt1=9;
            switch ( input.LA(1) ) {
            case SynapseSpecificBody:
                {
                switch ( input.LA(2) ) {
                case AbbreviatedAxisSpecifier:
                case AxisName:
                case Name:
                case NodeType:
                case ProcessingInstruction:
                case Star:
                case 56:
                case 57:
                    {
                    alt1=1;
                    }
                    break;
                case RecursiveAxisStep:
                case SingleAxisStep:
                    {
                    alt1=3;
                    }
                    break;
                case EOF:
                case And:
                case Comma:
                case EqualtyOp:
                case Or:
                case Pipe:
                case RightParenthesis:
                case RightSquareBracket:
                    {
                    alt1=8;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

                    throw nvae;

                }

                }
                break;
            case SynapseSpecific:
                {
                switch ( input.LA(2) ) {
                case Colon:
                    {
                    alt1=7;
                    }
                    break;
                case AbbreviatedAxisSpecifier:
                case AxisName:
                case Name:
                case NodeType:
                case ProcessingInstruction:
                case Star:
                case 56:
                case 57:
                    {
                    alt1=2;
                    }
                    break;
                case RecursiveAxisStep:
                case SingleAxisStep:
                    {
                    alt1=4;
                    }
                    break;
                case EOF:
                case And:
                case Comma:
                case EqualtyOp:
                case Or:
                case Pipe:
                case RightParenthesis:
                case RightSquareBracket:
                    {
                    alt1=9;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 2, input);

                    throw nvae;

                }

                }
                break;
            case AbbreviatedAxisSpecifier:
            case AxisName:
            case Name:
            case NodeType:
            case ProcessingInstruction:
            case Star:
            case 56:
            case 57:
                {
                alt1=5;
                }
                break;
            case RecursiveAxisStep:
            case SingleAxisStep:
                {
                alt1=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;

            }

            switch (alt1) {
                case 1 :
                    // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:37:7: SynapseSpecificBody relativeLocationPath
                    {
                    SynapseSpecificBody2=(Token)match(input,SynapseSpecificBody,FOLLOW_SynapseSpecificBody_in_locationPath224); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SynapseSpecificBody.add(SynapseSpecificBody2);


                    pushFollow(FOLLOW_relativeLocationPath_in_locationPath226);
                    relativeLocationPath3=relativeLocationPath();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_relativeLocationPath.add(relativeLocationPath3.getTree());

                    // AST REWRITE
                    // elements: relativeLocationPath, SynapseSpecificBody
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 37:48: -> ^( LOCATION_PATH SynapseSpecificBody relativeLocationPath )
                    {
                        // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:37:50: ^( LOCATION_PATH SynapseSpecificBody relativeLocationPath )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(LOCATION_PATH, "LOCATION_PATH")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_SynapseSpecificBody.nextNode()
                        );

                        adaptor.addChild(root_1, stream_relativeLocationPath.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:38:7: SynapseSpecific relativeLocationPath
                    {
                    SynapseSpecific4=(Token)match(input,SynapseSpecific,FOLLOW_SynapseSpecific_in_locationPath243); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SynapseSpecific.add(SynapseSpecific4);


                    pushFollow(FOLLOW_relativeLocationPath_in_locationPath245);
                    relativeLocationPath5=relativeLocationPath();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_relativeLocationPath.add(relativeLocationPath5.getTree());

                    // AST REWRITE
                    // elements: relativeLocationPath, SynapseSpecific
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 38:44: -> ^( LOCATION_PATH SynapseSpecific relativeLocationPath )
                    {
                        // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:38:46: ^( LOCATION_PATH SynapseSpecific relativeLocationPath )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(LOCATION_PATH, "LOCATION_PATH")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_SynapseSpecific.nextNode()
                        );

                        adaptor.addChild(root_1, stream_relativeLocationPath.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 3 :
                    // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:39:7: SynapseSpecificBody absoluteLocationPath
                    {
                    SynapseSpecificBody6=(Token)match(input,SynapseSpecificBody,FOLLOW_SynapseSpecificBody_in_locationPath262); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SynapseSpecificBody.add(SynapseSpecificBody6);


                    pushFollow(FOLLOW_absoluteLocationPath_in_locationPath264);
                    absoluteLocationPath7=absoluteLocationPath();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_absoluteLocationPath.add(absoluteLocationPath7.getTree());

                    // AST REWRITE
                    // elements: SynapseSpecificBody, absoluteLocationPath
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 39:48: -> ^( LOCATION_PATH SynapseSpecificBody absoluteLocationPath )
                    {
                        // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:39:50: ^( LOCATION_PATH SynapseSpecificBody absoluteLocationPath )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(LOCATION_PATH, "LOCATION_PATH")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_SynapseSpecificBody.nextNode()
                        );

                        adaptor.addChild(root_1, stream_absoluteLocationPath.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 4 :
                    // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:40:7: SynapseSpecific absoluteLocationPath
                    {
                    SynapseSpecific8=(Token)match(input,SynapseSpecific,FOLLOW_SynapseSpecific_in_locationPath281); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SynapseSpecific.add(SynapseSpecific8);


                    pushFollow(FOLLOW_absoluteLocationPath_in_locationPath283);
                    absoluteLocationPath9=absoluteLocationPath();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_absoluteLocationPath.add(absoluteLocationPath9.getTree());

                    // AST REWRITE
                    // elements: absoluteLocationPath, SynapseSpecific
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 40:44: -> ^( LOCATION_PATH SynapseSpecific absoluteLocationPath )
                    {
                        // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:40:46: ^( LOCATION_PATH SynapseSpecific absoluteLocationPath )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(LOCATION_PATH, "LOCATION_PATH")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_SynapseSpecific.nextNode()
                        );

                        adaptor.addChild(root_1, stream_absoluteLocationPath.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 5 :
                    // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:41:7: relativeLocationPath
                    {
                    pushFollow(FOLLOW_relativeLocationPath_in_locationPath300);
                    relativeLocationPath10=relativeLocationPath();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_relativeLocationPath.add(relativeLocationPath10.getTree());

                    // AST REWRITE
                    // elements: relativeLocationPath
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 41:30: -> ^( LOCATION_PATH relativeLocationPath )
                    {
                        // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:41:32: ^( LOCATION_PATH relativeLocationPath )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(LOCATION_PATH, "LOCATION_PATH")
                        , root_1);

                        adaptor.addChild(root_1, stream_relativeLocationPath.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 6 :
                    // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:42:7: absoluteLocationPath
                    {
                    pushFollow(FOLLOW_absoluteLocationPath_in_locationPath317);
                    absoluteLocationPath11=absoluteLocationPath();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_absoluteLocationPath.add(absoluteLocationPath11.getTree());

                    // AST REWRITE
                    // elements: absoluteLocationPath
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 42:30: -> ^( LOCATION_PATH absoluteLocationPath )
                    {
                        // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:42:32: ^( LOCATION_PATH absoluteLocationPath )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(LOCATION_PATH, "LOCATION_PATH")
                        , root_1);

                        adaptor.addChild(root_1, stream_absoluteLocationPath.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 7 :
                    // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:43:7: SynapseSpecific ':' Name
                    {
                    SynapseSpecific12=(Token)match(input,SynapseSpecific,FOLLOW_SynapseSpecific_in_locationPath334); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SynapseSpecific.add(SynapseSpecific12);


                    char_literal13=(Token)match(input,Colon,FOLLOW_Colon_in_locationPath336); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Colon.add(char_literal13);


                    Name14=(Token)match(input,Name,FOLLOW_Name_in_locationPath338); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Name.add(Name14);


                    // AST REWRITE
                    // elements: Name
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 43:34: -> ^( LOCATION_PATH Name )
                    {
                        // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:43:36: ^( LOCATION_PATH Name )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(LOCATION_PATH, "LOCATION_PATH")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_Name.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 8 :
                    // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:44:7: SynapseSpecificBody
                    {
                    SynapseSpecificBody15=(Token)match(input,SynapseSpecificBody,FOLLOW_SynapseSpecificBody_in_locationPath355); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SynapseSpecificBody.add(SynapseSpecificBody15);


                    // AST REWRITE
                    // elements: SynapseSpecificBody
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 44:49: -> ^( LOCATION_PATH SynapseSpecificBody )
                    {
                        // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:44:51: ^( LOCATION_PATH SynapseSpecificBody )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(LOCATION_PATH, "LOCATION_PATH")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_SynapseSpecificBody.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 9 :
                    // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:45:7: SynapseSpecific
                    {
                    SynapseSpecific16=(Token)match(input,SynapseSpecific,FOLLOW_SynapseSpecific_in_locationPath392); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SynapseSpecific.add(SynapseSpecific16);


                    // AST REWRITE
                    // elements: SynapseSpecific
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 45:49: -> ^( LOCATION_PATH SynapseSpecific )
                    {
                        // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:45:51: ^( LOCATION_PATH SynapseSpecific )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(LOCATION_PATH, "LOCATION_PATH")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_SynapseSpecific.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "locationPath"


    public static class absoluteLocationPath_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "absoluteLocationPath"
    // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:48:1: absoluteLocationPath : ( SingleAxisStep ( relativeLocationPath )? -> ^( SingleAxisStep ( relativeLocationPath )? ) | RecursiveAxisStep relativeLocationPath -> ^( RecursiveAxisStep relativeLocationPath ) );
    public final XPath1Parser.absoluteLocationPath_return absoluteLocationPath() throws RecognitionException {
        XPath1Parser.absoluteLocationPath_return retval = new XPath1Parser.absoluteLocationPath_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token SingleAxisStep17=null;
        Token RecursiveAxisStep19=null;
        XPath1Parser.relativeLocationPath_return relativeLocationPath18 =null;

        XPath1Parser.relativeLocationPath_return relativeLocationPath20 =null;


        CommonTree SingleAxisStep17_tree=null;
        CommonTree RecursiveAxisStep19_tree=null;
        RewriteRuleTokenStream stream_SingleAxisStep=new RewriteRuleTokenStream(adaptor,"token SingleAxisStep");
        RewriteRuleTokenStream stream_RecursiveAxisStep=new RewriteRuleTokenStream(adaptor,"token RecursiveAxisStep");
        RewriteRuleSubtreeStream stream_relativeLocationPath=new RewriteRuleSubtreeStream(adaptor,"rule relativeLocationPath");
        try {
            // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:49:5: ( SingleAxisStep ( relativeLocationPath )? -> ^( SingleAxisStep ( relativeLocationPath )? ) | RecursiveAxisStep relativeLocationPath -> ^( RecursiveAxisStep relativeLocationPath ) )
            int alt3=2;
            switch ( input.LA(1) ) {
            case SingleAxisStep:
                {
                alt3=1;
                }
                break;
            case RecursiveAxisStep:
                {
                alt3=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;

            }

            switch (alt3) {
                case 1 :
                    // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:49:6: SingleAxisStep ( relativeLocationPath )?
                    {
                    SingleAxisStep17=(Token)match(input,SingleAxisStep,FOLLOW_SingleAxisStep_in_absoluteLocationPath447); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SingleAxisStep.add(SingleAxisStep17);


                    // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:49:21: ( relativeLocationPath )?
                    int alt2=2;
                    switch ( input.LA(1) ) {
                        case AbbreviatedAxisSpecifier:
                        case AxisName:
                        case Name:
                        case NodeType:
                        case ProcessingInstruction:
                        case Star:
                        case 56:
                        case 57:
                            {
                            alt2=1;
                            }
                            break;
                    }

                    switch (alt2) {
                        case 1 :
                            // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:49:21: relativeLocationPath
                            {
                            pushFollow(FOLLOW_relativeLocationPath_in_absoluteLocationPath449);
                            relativeLocationPath18=relativeLocationPath();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_relativeLocationPath.add(relativeLocationPath18.getTree());

                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: SingleAxisStep, relativeLocationPath
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 49:44: -> ^( SingleAxisStep ( relativeLocationPath )? )
                    {
                        // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:49:47: ^( SingleAxisStep ( relativeLocationPath )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        stream_SingleAxisStep.nextNode()
                        , root_1);

                        // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:49:64: ( relativeLocationPath )?
                        if ( stream_relativeLocationPath.hasNext() ) {
                            adaptor.addChild(root_1, stream_relativeLocationPath.nextTree());

                        }
                        stream_relativeLocationPath.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:50:6: RecursiveAxisStep relativeLocationPath
                    {
                    RecursiveAxisStep19=(Token)match(input,RecursiveAxisStep,FOLLOW_RecursiveAxisStep_in_absoluteLocationPath467); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RecursiveAxisStep.add(RecursiveAxisStep19);


                    pushFollow(FOLLOW_relativeLocationPath_in_absoluteLocationPath469);
                    relativeLocationPath20=relativeLocationPath();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_relativeLocationPath.add(relativeLocationPath20.getTree());

                    // AST REWRITE
                    // elements: relativeLocationPath, RecursiveAxisStep
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 50:45: -> ^( RecursiveAxisStep relativeLocationPath )
                    {
                        // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:50:48: ^( RecursiveAxisStep relativeLocationPath )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        stream_RecursiveAxisStep.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, stream_relativeLocationPath.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "absoluteLocationPath"


    public static class relativeLocationPath_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "relativeLocationPath"
    // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:53:1: relativeLocationPath : ( step ( ( SingleAxisStep relativeLocationPath ) -> ^( SingleAxisStep step relativeLocationPath ) | ( RecursiveAxisStep relativeLocationPath ) -> ^( RecursiveAxisStep step relativeLocationPath ) ) | step );
    public final XPath1Parser.relativeLocationPath_return relativeLocationPath() throws RecognitionException {
        XPath1Parser.relativeLocationPath_return retval = new XPath1Parser.relativeLocationPath_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token SingleAxisStep22=null;
        Token RecursiveAxisStep24=null;
        XPath1Parser.step_return step21 =null;

        XPath1Parser.relativeLocationPath_return relativeLocationPath23 =null;

        XPath1Parser.relativeLocationPath_return relativeLocationPath25 =null;

        XPath1Parser.step_return step26 =null;


        CommonTree SingleAxisStep22_tree=null;
        CommonTree RecursiveAxisStep24_tree=null;
        RewriteRuleTokenStream stream_SingleAxisStep=new RewriteRuleTokenStream(adaptor,"token SingleAxisStep");
        RewriteRuleTokenStream stream_RecursiveAxisStep=new RewriteRuleTokenStream(adaptor,"token RecursiveAxisStep");
        RewriteRuleSubtreeStream stream_relativeLocationPath=new RewriteRuleSubtreeStream(adaptor,"rule relativeLocationPath");
        RewriteRuleSubtreeStream stream_step=new RewriteRuleSubtreeStream(adaptor,"rule step");
        try {
            // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:54:5: ( step ( ( SingleAxisStep relativeLocationPath ) -> ^( SingleAxisStep step relativeLocationPath ) | ( RecursiveAxisStep relativeLocationPath ) -> ^( RecursiveAxisStep step relativeLocationPath ) ) | step )
            int alt5=2;
            switch ( input.LA(1) ) {
            case AbbreviatedAxisSpecifier:
                {
                int LA5_1 = input.LA(2);

                if ( (synpred12_XPath1()) ) {
                    alt5=1;
                }
                else if ( (true) ) {
                    alt5=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;

                }
                }
                break;
            case AxisName:
                {
                int LA5_2 = input.LA(2);

                if ( (synpred12_XPath1()) ) {
                    alt5=1;
                }
                else if ( (true) ) {
                    alt5=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 2, input);

                    throw nvae;

                }
                }
                break;
            case Star:
                {
                int LA5_3 = input.LA(2);

                if ( (synpred12_XPath1()) ) {
                    alt5=1;
                }
                else if ( (true) ) {
                    alt5=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 3, input);

                    throw nvae;

                }
                }
                break;
            case Name:
                {
                int LA5_4 = input.LA(2);

                if ( (synpred12_XPath1()) ) {
                    alt5=1;
                }
                else if ( (true) ) {
                    alt5=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 4, input);

                    throw nvae;

                }
                }
                break;
            case NodeType:
                {
                int LA5_5 = input.LA(2);

                if ( (synpred12_XPath1()) ) {
                    alt5=1;
                }
                else if ( (true) ) {
                    alt5=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 5, input);

                    throw nvae;

                }
                }
                break;
            case ProcessingInstruction:
                {
                int LA5_6 = input.LA(2);

                if ( (synpred12_XPath1()) ) {
                    alt5=1;
                }
                else if ( (true) ) {
                    alt5=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 6, input);

                    throw nvae;

                }
                }
                break;
            case 56:
                {
                int LA5_7 = input.LA(2);

                if ( (synpred12_XPath1()) ) {
                    alt5=1;
                }
                else if ( (true) ) {
                    alt5=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 7, input);

                    throw nvae;

                }
                }
                break;
            case 57:
                {
                int LA5_8 = input.LA(2);

                if ( (synpred12_XPath1()) ) {
                    alt5=1;
                }
                else if ( (true) ) {
                    alt5=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 8, input);

                    throw nvae;

                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;

            }

            switch (alt5) {
                case 1 :
                    // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:54:7: step ( ( SingleAxisStep relativeLocationPath ) -> ^( SingleAxisStep step relativeLocationPath ) | ( RecursiveAxisStep relativeLocationPath ) -> ^( RecursiveAxisStep step relativeLocationPath ) )
                    {
                    pushFollow(FOLLOW_step_in_relativeLocationPath491);
                    step21=step();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_step.add(step21.getTree());

                    // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:55:5: ( ( SingleAxisStep relativeLocationPath ) -> ^( SingleAxisStep step relativeLocationPath ) | ( RecursiveAxisStep relativeLocationPath ) -> ^( RecursiveAxisStep step relativeLocationPath ) )
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
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 0, input);

                        throw nvae;

                    }

                    switch (alt4) {
                        case 1 :
                            // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:55:7: ( SingleAxisStep relativeLocationPath )
                            {
                            // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:55:7: ( SingleAxisStep relativeLocationPath )
                            // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:55:8: SingleAxisStep relativeLocationPath
                            {
                            SingleAxisStep22=(Token)match(input,SingleAxisStep,FOLLOW_SingleAxisStep_in_relativeLocationPath501); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_SingleAxisStep.add(SingleAxisStep22);


                            pushFollow(FOLLOW_relativeLocationPath_in_relativeLocationPath504);
                            relativeLocationPath23=relativeLocationPath();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_relativeLocationPath.add(relativeLocationPath23.getTree());

                            }


                            // AST REWRITE
                            // elements: SingleAxisStep, step, relativeLocationPath
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            if ( state.backtracking==0 ) {

                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (CommonTree)adaptor.nil();
                            // 55:47: -> ^( SingleAxisStep step relativeLocationPath )
                            {
                                // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:55:50: ^( SingleAxisStep step relativeLocationPath )
                                {
                                CommonTree root_1 = (CommonTree)adaptor.nil();
                                root_1 = (CommonTree)adaptor.becomeRoot(
                                stream_SingleAxisStep.nextNode()
                                , root_1);

                                adaptor.addChild(root_1, stream_step.nextTree());

                                adaptor.addChild(root_1, stream_relativeLocationPath.nextTree());

                                adaptor.addChild(root_0, root_1);
                                }

                            }


                            retval.tree = root_0;
                            }

                            }
                            break;
                        case 2 :
                            // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:56:6: ( RecursiveAxisStep relativeLocationPath )
                            {
                            // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:56:6: ( RecursiveAxisStep relativeLocationPath )
                            // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:56:7: RecursiveAxisStep relativeLocationPath
                            {
                            RecursiveAxisStep24=(Token)match(input,RecursiveAxisStep,FOLLOW_RecursiveAxisStep_in_relativeLocationPath524); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_RecursiveAxisStep.add(RecursiveAxisStep24);


                            pushFollow(FOLLOW_relativeLocationPath_in_relativeLocationPath527);
                            relativeLocationPath25=relativeLocationPath();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_relativeLocationPath.add(relativeLocationPath25.getTree());

                            }


                            // AST REWRITE
                            // elements: relativeLocationPath, RecursiveAxisStep, step
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            if ( state.backtracking==0 ) {

                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (CommonTree)adaptor.nil();
                            // 56:48: -> ^( RecursiveAxisStep step relativeLocationPath )
                            {
                                // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:56:51: ^( RecursiveAxisStep step relativeLocationPath )
                                {
                                CommonTree root_1 = (CommonTree)adaptor.nil();
                                root_1 = (CommonTree)adaptor.becomeRoot(
                                stream_RecursiveAxisStep.nextNode()
                                , root_1);

                                adaptor.addChild(root_1, stream_step.nextTree());

                                adaptor.addChild(root_1, stream_relativeLocationPath.nextTree());

                                adaptor.addChild(root_0, root_1);
                                }

                            }


                            retval.tree = root_0;
                            }

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:58:6: step
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_step_in_relativeLocationPath551);
                    step26=step();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, step26.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "relativeLocationPath"


    public static class step_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "step"
    // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:61:1: step : ( namedAxisStep ( ( predicate )* )? -> ^( QNAME_PREDICATE namedAxisStep ( ( predicate )* )? ) | abbreviatedAxisStep ( ( predicate )* )? -> ^( QNAME_PREDICATE abbreviatedAxisStep ( ( predicate )* )? ) );
    public final XPath1Parser.step_return step() throws RecognitionException {
        XPath1Parser.step_return retval = new XPath1Parser.step_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        XPath1Parser.namedAxisStep_return namedAxisStep27 =null;

        XPath1Parser.predicate_return predicate28 =null;

        XPath1Parser.abbreviatedAxisStep_return abbreviatedAxisStep29 =null;

        XPath1Parser.predicate_return predicate30 =null;


        RewriteRuleSubtreeStream stream_abbreviatedAxisStep=new RewriteRuleSubtreeStream(adaptor,"rule abbreviatedAxisStep");
        RewriteRuleSubtreeStream stream_predicate=new RewriteRuleSubtreeStream(adaptor,"rule predicate");
        RewriteRuleSubtreeStream stream_namedAxisStep=new RewriteRuleSubtreeStream(adaptor,"rule namedAxisStep");
        try {
            // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:62:5: ( namedAxisStep ( ( predicate )* )? -> ^( QNAME_PREDICATE namedAxisStep ( ( predicate )* )? ) | abbreviatedAxisStep ( ( predicate )* )? -> ^( QNAME_PREDICATE abbreviatedAxisStep ( ( predicate )* )? ) )
            int alt10=2;
            switch ( input.LA(1) ) {
            case AbbreviatedAxisSpecifier:
            case AxisName:
            case Name:
            case NodeType:
            case ProcessingInstruction:
            case Star:
                {
                alt10=1;
                }
                break;
            case 56:
            case 57:
                {
                alt10=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;

            }

            switch (alt10) {
                case 1 :
                    // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:62:7: namedAxisStep ( ( predicate )* )?
                    {
                    pushFollow(FOLLOW_namedAxisStep_in_step568);
                    namedAxisStep27=namedAxisStep();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_namedAxisStep.add(namedAxisStep27.getTree());

                    // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:62:21: ( ( predicate )* )?
                    int alt7=2;
                    switch ( input.LA(1) ) {
                        case LeftSquareBracket:
                            {
                            alt7=1;
                            }
                            break;
                        case SingleAxisStep:
                            {
                            int LA7_2 = input.LA(2);

                            if ( (synpred14_XPath1()) ) {
                                alt7=1;
                            }
                            }
                            break;
                        case RecursiveAxisStep:
                            {
                            int LA7_3 = input.LA(2);

                            if ( (synpred14_XPath1()) ) {
                                alt7=1;
                            }
                            }
                            break;
                        case EOF:
                            {
                            int LA7_4 = input.LA(2);

                            if ( (synpred14_XPath1()) ) {
                                alt7=1;
                            }
                            }
                            break;
                        case Pipe:
                            {
                            int LA7_5 = input.LA(2);

                            if ( (synpred14_XPath1()) ) {
                                alt7=1;
                            }
                            }
                            break;
                        case EqualtyOp:
                            {
                            int LA7_6 = input.LA(2);

                            if ( (synpred14_XPath1()) ) {
                                alt7=1;
                            }
                            }
                            break;
                        case And:
                            {
                            int LA7_7 = input.LA(2);

                            if ( (synpred14_XPath1()) ) {
                                alt7=1;
                            }
                            }
                            break;
                        case Or:
                            {
                            int LA7_8 = input.LA(2);

                            if ( (synpred14_XPath1()) ) {
                                alt7=1;
                            }
                            }
                            break;
                        case RightSquareBracket:
                            {
                            int LA7_9 = input.LA(2);

                            if ( (synpred14_XPath1()) ) {
                                alt7=1;
                            }
                            }
                            break;
                        case Comma:
                            {
                            int LA7_10 = input.LA(2);

                            if ( (synpred14_XPath1()) ) {
                                alt7=1;
                            }
                            }
                            break;
                        case RightParenthesis:
                            {
                            int LA7_11 = input.LA(2);

                            if ( (synpred14_XPath1()) ) {
                                alt7=1;
                            }
                            }
                            break;
                    }

                    switch (alt7) {
                        case 1 :
                            // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:62:22: ( predicate )*
                            {
                            // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:62:22: ( predicate )*
                            loop6:
                            do {
                                int alt6=2;
                                switch ( input.LA(1) ) {
                                case LeftSquareBracket:
                                    {
                                    alt6=1;
                                    }
                                    break;

                                }

                                switch (alt6) {
                            	case 1 :
                            	    // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:62:22: predicate
                            	    {
                            	    pushFollow(FOLLOW_predicate_in_step571);
                            	    predicate28=predicate();

                            	    state._fsp--;
                            	    if (state.failed) return retval;
                            	    if ( state.backtracking==0 ) stream_predicate.add(predicate28.getTree());

                            	    }
                            	    break;

                            	default :
                            	    break loop6;
                                }
                            } while (true);


                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: namedAxisStep, predicate
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 62:36: -> ^( QNAME_PREDICATE namedAxisStep ( ( predicate )* )? )
                    {
                        // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:62:38: ^( QNAME_PREDICATE namedAxisStep ( ( predicate )* )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(QNAME_PREDICATE, "QNAME_PREDICATE")
                        , root_1);

                        adaptor.addChild(root_1, stream_namedAxisStep.nextTree());

                        // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:62:70: ( ( predicate )* )?
                        if ( stream_predicate.hasNext() ) {
                            // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:62:71: ( predicate )*
                            while ( stream_predicate.hasNext() ) {
                                adaptor.addChild(root_1, stream_predicate.nextTree());

                            }
                            stream_predicate.reset();

                        }
                        stream_predicate.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:63:7: abbreviatedAxisStep ( ( predicate )* )?
                    {
                    pushFollow(FOLLOW_abbreviatedAxisStep_in_step596);
                    abbreviatedAxisStep29=abbreviatedAxisStep();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_abbreviatedAxisStep.add(abbreviatedAxisStep29.getTree());

                    // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:63:28: ( ( predicate )* )?
                    int alt9=2;
                    switch ( input.LA(1) ) {
                        case LeftSquareBracket:
                            {
                            alt9=1;
                            }
                            break;
                        case SingleAxisStep:
                            {
                            int LA9_2 = input.LA(2);

                            if ( (synpred17_XPath1()) ) {
                                alt9=1;
                            }
                            }
                            break;
                        case RecursiveAxisStep:
                            {
                            int LA9_3 = input.LA(2);

                            if ( (synpred17_XPath1()) ) {
                                alt9=1;
                            }
                            }
                            break;
                        case EOF:
                            {
                            int LA9_4 = input.LA(2);

                            if ( (synpred17_XPath1()) ) {
                                alt9=1;
                            }
                            }
                            break;
                        case Pipe:
                            {
                            int LA9_5 = input.LA(2);

                            if ( (synpred17_XPath1()) ) {
                                alt9=1;
                            }
                            }
                            break;
                        case EqualtyOp:
                            {
                            int LA9_6 = input.LA(2);

                            if ( (synpred17_XPath1()) ) {
                                alt9=1;
                            }
                            }
                            break;
                        case And:
                            {
                            int LA9_7 = input.LA(2);

                            if ( (synpred17_XPath1()) ) {
                                alt9=1;
                            }
                            }
                            break;
                        case Or:
                            {
                            int LA9_8 = input.LA(2);

                            if ( (synpred17_XPath1()) ) {
                                alt9=1;
                            }
                            }
                            break;
                        case RightSquareBracket:
                            {
                            int LA9_9 = input.LA(2);

                            if ( (synpred17_XPath1()) ) {
                                alt9=1;
                            }
                            }
                            break;
                        case Comma:
                            {
                            int LA9_10 = input.LA(2);

                            if ( (synpred17_XPath1()) ) {
                                alt9=1;
                            }
                            }
                            break;
                        case RightParenthesis:
                            {
                            int LA9_11 = input.LA(2);

                            if ( (synpred17_XPath1()) ) {
                                alt9=1;
                            }
                            }
                            break;
                    }

                    switch (alt9) {
                        case 1 :
                            // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:63:29: ( predicate )*
                            {
                            // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:63:29: ( predicate )*
                            loop8:
                            do {
                                int alt8=2;
                                switch ( input.LA(1) ) {
                                case LeftSquareBracket:
                                    {
                                    alt8=1;
                                    }
                                    break;

                                }

                                switch (alt8) {
                            	case 1 :
                            	    // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:63:29: predicate
                            	    {
                            	    pushFollow(FOLLOW_predicate_in_step600);
                            	    predicate30=predicate();

                            	    state._fsp--;
                            	    if (state.failed) return retval;
                            	    if ( state.backtracking==0 ) stream_predicate.add(predicate30.getTree());

                            	    }
                            	    break;

                            	default :
                            	    break loop8;
                                }
                            } while (true);


                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: abbreviatedAxisStep, predicate
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 63:43: -> ^( QNAME_PREDICATE abbreviatedAxisStep ( ( predicate )* )? )
                    {
                        // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:63:45: ^( QNAME_PREDICATE abbreviatedAxisStep ( ( predicate )* )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(QNAME_PREDICATE, "QNAME_PREDICATE")
                        , root_1);

                        adaptor.addChild(root_1, stream_abbreviatedAxisStep.nextTree());

                        // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:63:83: ( ( predicate )* )?
                        if ( stream_predicate.hasNext() ) {
                            // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:63:84: ( predicate )*
                            while ( stream_predicate.hasNext() ) {
                                adaptor.addChild(root_1, stream_predicate.nextTree());

                            }
                            stream_predicate.reset();

                        }
                        stream_predicate.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "step"


    public static class abbreviatedAxisStep_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "abbreviatedAxisStep"
    // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:67:1: abbreviatedAxisStep : ( '.' -> ^( ABBREVIATED_AXIS_STEP '.' ) | '..' -> ^( ABBREVIATED_AXIS_STEP '..' ) );
    public final XPath1Parser.abbreviatedAxisStep_return abbreviatedAxisStep() throws RecognitionException {
        XPath1Parser.abbreviatedAxisStep_return retval = new XPath1Parser.abbreviatedAxisStep_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal31=null;
        Token string_literal32=null;

        CommonTree char_literal31_tree=null;
        CommonTree string_literal32_tree=null;
        RewriteRuleTokenStream stream_57=new RewriteRuleTokenStream(adaptor,"token 57");
        RewriteRuleTokenStream stream_56=new RewriteRuleTokenStream(adaptor,"token 56");

        try {
            // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:68:5: ( '.' -> ^( ABBREVIATED_AXIS_STEP '.' ) | '..' -> ^( ABBREVIATED_AXIS_STEP '..' ) )
            int alt11=2;
            switch ( input.LA(1) ) {
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
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;

            }

            switch (alt11) {
                case 1 :
                    // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:68:7: '.'
                    {
                    char_literal31=(Token)match(input,56,FOLLOW_56_in_abbreviatedAxisStep635); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_56.add(char_literal31);


                    // AST REWRITE
                    // elements: 56
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 68:15: -> ^( ABBREVIATED_AXIS_STEP '.' )
                    {
                        // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:68:18: ^( ABBREVIATED_AXIS_STEP '.' )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(ABBREVIATED_AXIS_STEP, "ABBREVIATED_AXIS_STEP")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_56.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:69:7: '..'
                    {
                    string_literal32=(Token)match(input,57,FOLLOW_57_in_abbreviatedAxisStep655); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_57.add(string_literal32);


                    // AST REWRITE
                    // elements: 57
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 69:16: -> ^( ABBREVIATED_AXIS_STEP '..' )
                    {
                        // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:69:19: ^( ABBREVIATED_AXIS_STEP '..' )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(ABBREVIATED_AXIS_STEP, "ABBREVIATED_AXIS_STEP")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_57.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "abbreviatedAxisStep"


    public static class namedAxisStep_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "namedAxisStep"
    // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:72:1: namedAxisStep : ( AbbreviatedAxisSpecifier nodeTest -> ^( ATTRIBUTE_AXIS AbbreviatedAxisSpecifier nodeTest ) | ( ( axisSpecifier )? nodeTest ) -> ^( NAMED_AXIS_STEP ( axisSpecifier )? nodeTest ) );
    public final XPath1Parser.namedAxisStep_return namedAxisStep() throws RecognitionException {
        XPath1Parser.namedAxisStep_return retval = new XPath1Parser.namedAxisStep_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token AbbreviatedAxisSpecifier33=null;
        XPath1Parser.nodeTest_return nodeTest34 =null;

        XPath1Parser.axisSpecifier_return axisSpecifier35 =null;

        XPath1Parser.nodeTest_return nodeTest36 =null;


        CommonTree AbbreviatedAxisSpecifier33_tree=null;
        RewriteRuleTokenStream stream_AbbreviatedAxisSpecifier=new RewriteRuleTokenStream(adaptor,"token AbbreviatedAxisSpecifier");
        RewriteRuleSubtreeStream stream_nodeTest=new RewriteRuleSubtreeStream(adaptor,"rule nodeTest");
        RewriteRuleSubtreeStream stream_axisSpecifier=new RewriteRuleSubtreeStream(adaptor,"rule axisSpecifier");
        try {
            // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:73:5: ( AbbreviatedAxisSpecifier nodeTest -> ^( ATTRIBUTE_AXIS AbbreviatedAxisSpecifier nodeTest ) | ( ( axisSpecifier )? nodeTest ) -> ^( NAMED_AXIS_STEP ( axisSpecifier )? nodeTest ) )
            int alt13=2;
            switch ( input.LA(1) ) {
            case AbbreviatedAxisSpecifier:
                {
                alt13=1;
                }
                break;
            case AxisName:
            case Name:
            case NodeType:
            case ProcessingInstruction:
            case Star:
                {
                alt13=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;

            }

            switch (alt13) {
                case 1 :
                    // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:73:7: AbbreviatedAxisSpecifier nodeTest
                    {
                    AbbreviatedAxisSpecifier33=(Token)match(input,AbbreviatedAxisSpecifier,FOLLOW_AbbreviatedAxisSpecifier_in_namedAxisStep684); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AbbreviatedAxisSpecifier.add(AbbreviatedAxisSpecifier33);


                    pushFollow(FOLLOW_nodeTest_in_namedAxisStep686);
                    nodeTest34=nodeTest();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_nodeTest.add(nodeTest34.getTree());

                    // AST REWRITE
                    // elements: AbbreviatedAxisSpecifier, nodeTest
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 73:42: -> ^( ATTRIBUTE_AXIS AbbreviatedAxisSpecifier nodeTest )
                    {
                        // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:73:45: ^( ATTRIBUTE_AXIS AbbreviatedAxisSpecifier nodeTest )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(ATTRIBUTE_AXIS, "ATTRIBUTE_AXIS")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_AbbreviatedAxisSpecifier.nextNode()
                        );

                        adaptor.addChild(root_1, stream_nodeTest.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:74:6: ( ( axisSpecifier )? nodeTest )
                    {
                    // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:74:6: ( ( axisSpecifier )? nodeTest )
                    // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:74:7: ( axisSpecifier )? nodeTest
                    {
                    // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:74:7: ( axisSpecifier )?
                    int alt12=2;
                    switch ( input.LA(1) ) {
                        case AxisName:
                            {
                            alt12=1;
                            }
                            break;
                    }

                    switch (alt12) {
                        case 1 :
                            // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:74:7: axisSpecifier
                            {
                            pushFollow(FOLLOW_axisSpecifier_in_namedAxisStep705);
                            axisSpecifier35=axisSpecifier();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_axisSpecifier.add(axisSpecifier35.getTree());

                            }
                            break;

                    }


                    pushFollow(FOLLOW_nodeTest_in_namedAxisStep708);
                    nodeTest36=nodeTest();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_nodeTest.add(nodeTest36.getTree());

                    }


                    // AST REWRITE
                    // elements: nodeTest, axisSpecifier
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 74:34: -> ^( NAMED_AXIS_STEP ( axisSpecifier )? nodeTest )
                    {
                        // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:74:37: ^( NAMED_AXIS_STEP ( axisSpecifier )? nodeTest )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(NAMED_AXIS_STEP, "NAMED_AXIS_STEP")
                        , root_1);

                        // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:74:55: ( axisSpecifier )?
                        if ( stream_axisSpecifier.hasNext() ) {
                            adaptor.addChild(root_1, stream_axisSpecifier.nextTree());

                        }
                        stream_axisSpecifier.reset();

                        adaptor.addChild(root_1, stream_nodeTest.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "namedAxisStep"


    public static class axisSpecifier_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "axisSpecifier"
    // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:76:1: axisSpecifier : AxisName AxisNameSeparator -> ^( NAME_AXIS AxisName ) ;
    public final XPath1Parser.axisSpecifier_return axisSpecifier() throws RecognitionException {
        XPath1Parser.axisSpecifier_return retval = new XPath1Parser.axisSpecifier_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token AxisName37=null;
        Token AxisNameSeparator38=null;

        CommonTree AxisName37_tree=null;
        CommonTree AxisNameSeparator38_tree=null;
        RewriteRuleTokenStream stream_AxisName=new RewriteRuleTokenStream(adaptor,"token AxisName");
        RewriteRuleTokenStream stream_AxisNameSeparator=new RewriteRuleTokenStream(adaptor,"token AxisNameSeparator");

        try {
            // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:77:5: ( AxisName AxisNameSeparator -> ^( NAME_AXIS AxisName ) )
            // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:77:7: AxisName AxisNameSeparator
            {
            AxisName37=(Token)match(input,AxisName,FOLLOW_AxisName_in_axisSpecifier734); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_AxisName.add(AxisName37);


            AxisNameSeparator38=(Token)match(input,AxisNameSeparator,FOLLOW_AxisNameSeparator_in_axisSpecifier736); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_AxisNameSeparator.add(AxisNameSeparator38);


            // AST REWRITE
            // elements: AxisName
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 77:35: -> ^( NAME_AXIS AxisName )
            {
                // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:77:38: ^( NAME_AXIS AxisName )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(NAME_AXIS, "NAME_AXIS")
                , root_1);

                adaptor.addChild(root_1, 
                stream_AxisName.nextNode()
                );

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "axisSpecifier"


    public static class nodeTest_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "nodeTest"
    // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:80:1: nodeTest : ( nameTest | NodeType LeftParenthesis RightParenthesis -> ^( ANY_NODE NodeType ) | ProcessingInstruction LeftParenthesis StringLiteral RightParenthesis );
    public final XPath1Parser.nodeTest_return nodeTest() throws RecognitionException {
        XPath1Parser.nodeTest_return retval = new XPath1Parser.nodeTest_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token NodeType40=null;
        Token LeftParenthesis41=null;
        Token RightParenthesis42=null;
        Token ProcessingInstruction43=null;
        Token LeftParenthesis44=null;
        Token StringLiteral45=null;
        Token RightParenthesis46=null;
        XPath1Parser.nameTest_return nameTest39 =null;


        CommonTree NodeType40_tree=null;
        CommonTree LeftParenthesis41_tree=null;
        CommonTree RightParenthesis42_tree=null;
        CommonTree ProcessingInstruction43_tree=null;
        CommonTree LeftParenthesis44_tree=null;
        CommonTree StringLiteral45_tree=null;
        CommonTree RightParenthesis46_tree=null;
        RewriteRuleTokenStream stream_LeftParenthesis=new RewriteRuleTokenStream(adaptor,"token LeftParenthesis");
        RewriteRuleTokenStream stream_NodeType=new RewriteRuleTokenStream(adaptor,"token NodeType");
        RewriteRuleTokenStream stream_RightParenthesis=new RewriteRuleTokenStream(adaptor,"token RightParenthesis");

        try {
            // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:81:5: ( nameTest | NodeType LeftParenthesis RightParenthesis -> ^( ANY_NODE NodeType ) | ProcessingInstruction LeftParenthesis StringLiteral RightParenthesis )
            int alt14=3;
            switch ( input.LA(1) ) {
            case Name:
            case Star:
                {
                alt14=1;
                }
                break;
            case NodeType:
                {
                alt14=2;
                }
                break;
            case ProcessingInstruction:
                {
                alt14=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;

            }

            switch (alt14) {
                case 1 :
                    // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:81:7: nameTest
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_nameTest_in_nodeTest762);
                    nameTest39=nameTest();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, nameTest39.getTree());

                    }
                    break;
                case 2 :
                    // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:82:7: NodeType LeftParenthesis RightParenthesis
                    {
                    NodeType40=(Token)match(input,NodeType,FOLLOW_NodeType_in_nodeTest771); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NodeType.add(NodeType40);


                    LeftParenthesis41=(Token)match(input,LeftParenthesis,FOLLOW_LeftParenthesis_in_nodeTest773); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LeftParenthesis.add(LeftParenthesis41);


                    RightParenthesis42=(Token)match(input,RightParenthesis,FOLLOW_RightParenthesis_in_nodeTest775); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RightParenthesis.add(RightParenthesis42);


                    // AST REWRITE
                    // elements: NodeType
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 82:50: -> ^( ANY_NODE NodeType )
                    {
                        // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:82:53: ^( ANY_NODE NodeType )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(ANY_NODE, "ANY_NODE")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_NodeType.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 3 :
                    // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:83:7: ProcessingInstruction LeftParenthesis StringLiteral RightParenthesis
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    ProcessingInstruction43=(Token)match(input,ProcessingInstruction,FOLLOW_ProcessingInstruction_in_nodeTest792); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ProcessingInstruction43_tree = 
                    (CommonTree)adaptor.create(ProcessingInstruction43)
                    ;
                    adaptor.addChild(root_0, ProcessingInstruction43_tree);
                    }

                    LeftParenthesis44=(Token)match(input,LeftParenthesis,FOLLOW_LeftParenthesis_in_nodeTest794); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LeftParenthesis44_tree = 
                    (CommonTree)adaptor.create(LeftParenthesis44)
                    ;
                    adaptor.addChild(root_0, LeftParenthesis44_tree);
                    }

                    StringLiteral45=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_nodeTest796); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    StringLiteral45_tree = 
                    (CommonTree)adaptor.create(StringLiteral45)
                    ;
                    adaptor.addChild(root_0, StringLiteral45_tree);
                    }

                    RightParenthesis46=(Token)match(input,RightParenthesis,FOLLOW_RightParenthesis_in_nodeTest798); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    RightParenthesis46_tree = 
                    (CommonTree)adaptor.create(RightParenthesis46)
                    ;
                    adaptor.addChild(root_0, RightParenthesis46_tree);
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "nodeTest"


    public static class nameTest_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "nameTest"
    // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:86:1: nameTest : ( Star -> ^( ANY_NODE ) | Name Colon Star -> ^( ANY_NAMESPACED_NODE Name ) | qName );
    public final XPath1Parser.nameTest_return nameTest() throws RecognitionException {
        XPath1Parser.nameTest_return retval = new XPath1Parser.nameTest_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token Star47=null;
        Token Name48=null;
        Token Colon49=null;
        Token Star50=null;
        XPath1Parser.qName_return qName51 =null;


        CommonTree Star47_tree=null;
        CommonTree Name48_tree=null;
        CommonTree Colon49_tree=null;
        CommonTree Star50_tree=null;
        RewriteRuleTokenStream stream_Name=new RewriteRuleTokenStream(adaptor,"token Name");
        RewriteRuleTokenStream stream_Colon=new RewriteRuleTokenStream(adaptor,"token Colon");
        RewriteRuleTokenStream stream_Star=new RewriteRuleTokenStream(adaptor,"token Star");

        try {
            // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:87:5: ( Star -> ^( ANY_NODE ) | Name Colon Star -> ^( ANY_NAMESPACED_NODE Name ) | qName )
            int alt15=3;
            switch ( input.LA(1) ) {
            case Star:
                {
                alt15=1;
                }
                break;
            case Name:
                {
                switch ( input.LA(2) ) {
                case Colon:
                    {
                    switch ( input.LA(3) ) {
                    case Star:
                        {
                        alt15=2;
                        }
                        break;
                    case Name:
                        {
                        alt15=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 15, 3, input);

                        throw nvae;

                    }

                    }
                    break;
                case EOF:
                case And:
                case Comma:
                case EqualtyOp:
                case LeftSquareBracket:
                case Or:
                case Pipe:
                case RecursiveAxisStep:
                case RightParenthesis:
                case RightSquareBracket:
                case SingleAxisStep:
                    {
                    alt15=3;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 15, 2, input);

                    throw nvae;

                }

                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;

            }

            switch (alt15) {
                case 1 :
                    // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:87:7: Star
                    {
                    Star47=(Token)match(input,Star,FOLLOW_Star_in_nameTest817); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Star.add(Star47);


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 87:16: -> ^( ANY_NODE )
                    {
                        // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:87:19: ^( ANY_NODE )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(ANY_NODE, "ANY_NODE")
                        , root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:88:7: Name Colon Star
                    {
                    Name48=(Token)match(input,Name,FOLLOW_Name_in_nameTest835); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Name.add(Name48);


                    Colon49=(Token)match(input,Colon,FOLLOW_Colon_in_nameTest837); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Colon.add(Colon49);


                    Star50=(Token)match(input,Star,FOLLOW_Star_in_nameTest839); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Star.add(Star50);


                    // AST REWRITE
                    // elements: Name
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 88:26: -> ^( ANY_NAMESPACED_NODE Name )
                    {
                        // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:88:29: ^( ANY_NAMESPACED_NODE Name )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(ANY_NAMESPACED_NODE, "ANY_NAMESPACED_NODE")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_Name.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 3 :
                    // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:89:7: qName
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_qName_in_nameTest858);
                    qName51=qName();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, qName51.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "nameTest"


    public static class predicate_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "predicate"
    // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:92:1: predicate : ( LeftSquareBracket predicateExpr RightSquareBracket -> ^( PREDICATE predicateExpr ) | LeftSquareBracket '1' RightSquareBracket -> ^( PREDICATE '1' ) );
    public final XPath1Parser.predicate_return predicate() throws RecognitionException {
        XPath1Parser.predicate_return retval = new XPath1Parser.predicate_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token LeftSquareBracket52=null;
        Token RightSquareBracket54=null;
        Token LeftSquareBracket55=null;
        Token char_literal56=null;
        Token RightSquareBracket57=null;
        XPath1Parser.predicateExpr_return predicateExpr53 =null;


        CommonTree LeftSquareBracket52_tree=null;
        CommonTree RightSquareBracket54_tree=null;
        CommonTree LeftSquareBracket55_tree=null;
        CommonTree char_literal56_tree=null;
        CommonTree RightSquareBracket57_tree=null;
        RewriteRuleTokenStream stream_RightSquareBracket=new RewriteRuleTokenStream(adaptor,"token RightSquareBracket");
        RewriteRuleTokenStream stream_58=new RewriteRuleTokenStream(adaptor,"token 58");
        RewriteRuleTokenStream stream_LeftSquareBracket=new RewriteRuleTokenStream(adaptor,"token LeftSquareBracket");
        RewriteRuleSubtreeStream stream_predicateExpr=new RewriteRuleSubtreeStream(adaptor,"rule predicateExpr");
        try {
            // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:93:5: ( LeftSquareBracket predicateExpr RightSquareBracket -> ^( PREDICATE predicateExpr ) | LeftSquareBracket '1' RightSquareBracket -> ^( PREDICATE '1' ) )
            int alt16=2;
            switch ( input.LA(1) ) {
            case LeftSquareBracket:
                {
                switch ( input.LA(2) ) {
                case 58:
                    {
                    alt16=2;
                    }
                    break;
                case AbbreviatedAxisSpecifier:
                case AxisName:
                case DecimalLiteral:
                case DoubleLiteral:
                case IntegerLiteral:
                case LeftParenthesis:
                case Name:
                case NodeType:
                case ProcessingInstruction:
                case RecursiveAxisStep:
                case SingleAxisStep:
                case Star:
                case StringLiteral:
                case SynapseSpecific:
                case SynapseSpecificBody:
                case VariableReference:
                case 56:
                case 57:
                    {
                    alt16=1;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 16, 1, input);

                    throw nvae;

                }

                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;

            }

            switch (alt16) {
                case 1 :
                    // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:93:7: LeftSquareBracket predicateExpr RightSquareBracket
                    {
                    LeftSquareBracket52=(Token)match(input,LeftSquareBracket,FOLLOW_LeftSquareBracket_in_predicate875); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LeftSquareBracket.add(LeftSquareBracket52);


                    pushFollow(FOLLOW_predicateExpr_in_predicate877);
                    predicateExpr53=predicateExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_predicateExpr.add(predicateExpr53.getTree());

                    RightSquareBracket54=(Token)match(input,RightSquareBracket,FOLLOW_RightSquareBracket_in_predicate879); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RightSquareBracket.add(RightSquareBracket54);


                    // AST REWRITE
                    // elements: predicateExpr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 93:58: -> ^( PREDICATE predicateExpr )
                    {
                        // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:93:61: ^( PREDICATE predicateExpr )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(PREDICATE, "PREDICATE")
                        , root_1);

                        adaptor.addChild(root_1, stream_predicateExpr.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:94:6: LeftSquareBracket '1' RightSquareBracket
                    {
                    LeftSquareBracket55=(Token)match(input,LeftSquareBracket,FOLLOW_LeftSquareBracket_in_predicate894); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LeftSquareBracket.add(LeftSquareBracket55);


                    char_literal56=(Token)match(input,58,FOLLOW_58_in_predicate896); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_58.add(char_literal56);


                    RightSquareBracket57=(Token)match(input,RightSquareBracket,FOLLOW_RightSquareBracket_in_predicate898); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RightSquareBracket.add(RightSquareBracket57);


                    // AST REWRITE
                    // elements: 58
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 94:47: -> ^( PREDICATE '1' )
                    {
                        // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:94:50: ^( PREDICATE '1' )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(PREDICATE, "PREDICATE")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_58.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "predicate"


    public static class predicateExpr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "predicateExpr"
    // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:97:1: predicateExpr : expr ;
    public final XPath1Parser.predicateExpr_return predicateExpr() throws RecognitionException {
        XPath1Parser.predicateExpr_return retval = new XPath1Parser.predicateExpr_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        XPath1Parser.expr_return expr58 =null;



        try {
            // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:97:15: ( expr )
            // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:97:17: expr
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_expr_in_predicateExpr919);
            expr58=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr58.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "predicateExpr"


    public static class functionCall_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "functionCall"
    // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:99:1: functionCall : qName LeftParenthesis ( expressionList )? RightParenthesis -> ^( FUNCALL qName ( expressionList )? ) ;
    public final XPath1Parser.functionCall_return functionCall() throws RecognitionException {
        XPath1Parser.functionCall_return retval = new XPath1Parser.functionCall_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token LeftParenthesis60=null;
        Token RightParenthesis62=null;
        XPath1Parser.qName_return qName59 =null;

        XPath1Parser.expressionList_return expressionList61 =null;


        CommonTree LeftParenthesis60_tree=null;
        CommonTree RightParenthesis62_tree=null;
        RewriteRuleTokenStream stream_LeftParenthesis=new RewriteRuleTokenStream(adaptor,"token LeftParenthesis");
        RewriteRuleTokenStream stream_RightParenthesis=new RewriteRuleTokenStream(adaptor,"token RightParenthesis");
        RewriteRuleSubtreeStream stream_expressionList=new RewriteRuleSubtreeStream(adaptor,"rule expressionList");
        RewriteRuleSubtreeStream stream_qName=new RewriteRuleSubtreeStream(adaptor,"rule qName");
        try {
            // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:100:5: ( qName LeftParenthesis ( expressionList )? RightParenthesis -> ^( FUNCALL qName ( expressionList )? ) )
            // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:100:7: qName LeftParenthesis ( expressionList )? RightParenthesis
            {
            pushFollow(FOLLOW_qName_in_functionCall935);
            qName59=qName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_qName.add(qName59.getTree());

            LeftParenthesis60=(Token)match(input,LeftParenthesis,FOLLOW_LeftParenthesis_in_functionCall937); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LeftParenthesis.add(LeftParenthesis60);


            // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:101:5: ( expressionList )?
            int alt17=2;
            switch ( input.LA(1) ) {
                case AbbreviatedAxisSpecifier:
                case AxisName:
                case DecimalLiteral:
                case DoubleLiteral:
                case IntegerLiteral:
                case LeftParenthesis:
                case Name:
                case NodeType:
                case ProcessingInstruction:
                case RecursiveAxisStep:
                case SingleAxisStep:
                case Star:
                case StringLiteral:
                case SynapseSpecific:
                case SynapseSpecificBody:
                case VariableReference:
                case 56:
                case 57:
                    {
                    alt17=1;
                    }
                    break;
            }

            switch (alt17) {
                case 1 :
                    // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:101:5: expressionList
                    {
                    pushFollow(FOLLOW_expressionList_in_functionCall943);
                    expressionList61=expressionList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expressionList.add(expressionList61.getTree());

                    }
                    break;

            }


            RightParenthesis62=(Token)match(input,RightParenthesis,FOLLOW_RightParenthesis_in_functionCall951); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RightParenthesis.add(RightParenthesis62);


            // AST REWRITE
            // elements: expressionList, qName
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 102:25: -> ^( FUNCALL qName ( expressionList )? )
            {
                // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:102:28: ^( FUNCALL qName ( expressionList )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(FUNCALL, "FUNCALL")
                , root_1);

                adaptor.addChild(root_1, stream_qName.nextTree());

                // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:102:44: ( expressionList )?
                if ( stream_expressionList.hasNext() ) {
                    adaptor.addChild(root_1, stream_expressionList.nextTree());

                }
                stream_expressionList.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "functionCall"


    public static class expressionList_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expressionList"
    // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:105:1: expressionList : expr ( Comma expr )* -> ^( EXPRLIST ( expr )+ ) ;
    public final XPath1Parser.expressionList_return expressionList() throws RecognitionException {
        XPath1Parser.expressionList_return retval = new XPath1Parser.expressionList_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token Comma64=null;
        XPath1Parser.expr_return expr63 =null;

        XPath1Parser.expr_return expr65 =null;


        CommonTree Comma64_tree=null;
        RewriteRuleTokenStream stream_Comma=new RewriteRuleTokenStream(adaptor,"token Comma");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:106:5: ( expr ( Comma expr )* -> ^( EXPRLIST ( expr )+ ) )
            // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:106:7: expr ( Comma expr )*
            {
            pushFollow(FOLLOW_expr_in_expressionList980);
            expr63=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(expr63.getTree());

            // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:106:12: ( Comma expr )*
            loop18:
            do {
                int alt18=2;
                switch ( input.LA(1) ) {
                case Comma:
                    {
                    alt18=1;
                    }
                    break;

                }

                switch (alt18) {
            	case 1 :
            	    // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:106:14: Comma expr
            	    {
            	    Comma64=(Token)match(input,Comma,FOLLOW_Comma_in_expressionList984); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_Comma.add(Comma64);


            	    pushFollow(FOLLOW_expr_in_expressionList986);
            	    expr65=expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_expr.add(expr65.getTree());

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);


            // AST REWRITE
            // elements: expr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 106:31: -> ^( EXPRLIST ( expr )+ )
            {
                // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:106:34: ^( EXPRLIST ( expr )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(EXPRLIST, "EXPRLIST")
                , root_1);

                if ( !(stream_expr.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_expr.hasNext() ) {
                    adaptor.addChild(root_1, stream_expr.nextTree());

                }
                stream_expr.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "expressionList"


    public static class pathExpr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "pathExpr"
    // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:109:1: pathExpr : ( locationPath | filterExpr ( simpleAxisStep relativeLocationPath )? );
    public final XPath1Parser.pathExpr_return pathExpr() throws RecognitionException {
        XPath1Parser.pathExpr_return retval = new XPath1Parser.pathExpr_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        XPath1Parser.locationPath_return locationPath66 =null;

        XPath1Parser.filterExpr_return filterExpr67 =null;

        XPath1Parser.simpleAxisStep_return simpleAxisStep68 =null;

        XPath1Parser.relativeLocationPath_return relativeLocationPath69 =null;



        try {
            // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:110:5: ( locationPath | filterExpr ( simpleAxisStep relativeLocationPath )? )
            int alt20=2;
            switch ( input.LA(1) ) {
            case AbbreviatedAxisSpecifier:
            case AxisName:
            case NodeType:
            case ProcessingInstruction:
            case RecursiveAxisStep:
            case SingleAxisStep:
            case Star:
            case SynapseSpecific:
            case SynapseSpecificBody:
            case 56:
            case 57:
                {
                alt20=1;
                }
                break;
            case Name:
                {
                switch ( input.LA(2) ) {
                case Colon:
                    {
                    switch ( input.LA(3) ) {
                    case Star:
                        {
                        alt20=1;
                        }
                        break;
                    case Name:
                        {
                        switch ( input.LA(4) ) {
                        case EOF:
                        case And:
                        case Comma:
                        case EqualtyOp:
                        case LeftSquareBracket:
                        case Or:
                        case Pipe:
                        case RecursiveAxisStep:
                        case RightParenthesis:
                        case RightSquareBracket:
                        case SingleAxisStep:
                            {
                            alt20=1;
                            }
                            break;
                        case LeftParenthesis:
                            {
                            alt20=2;
                            }
                            break;
                        default:
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 20, 5, input);

                            throw nvae;

                        }

                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 20, 4, input);

                        throw nvae;

                    }

                    }
                    break;
                case EOF:
                case And:
                case Comma:
                case EqualtyOp:
                case LeftSquareBracket:
                case Or:
                case Pipe:
                case RecursiveAxisStep:
                case RightParenthesis:
                case RightSquareBracket:
                case SingleAxisStep:
                    {
                    alt20=1;
                    }
                    break;
                case LeftParenthesis:
                    {
                    alt20=2;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 20, 2, input);

                    throw nvae;

                }

                }
                break;
            case DecimalLiteral:
            case DoubleLiteral:
            case IntegerLiteral:
            case LeftParenthesis:
            case StringLiteral:
            case VariableReference:
                {
                alt20=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;

            }

            switch (alt20) {
                case 1 :
                    // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:110:7: locationPath
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_locationPath_in_pathExpr1019);
                    locationPath66=locationPath();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, locationPath66.getTree());

                    }
                    break;
                case 2 :
                    // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:111:7: filterExpr ( simpleAxisStep relativeLocationPath )?
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_filterExpr_in_pathExpr1027);
                    filterExpr67=filterExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, filterExpr67.getTree());

                    // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:111:18: ( simpleAxisStep relativeLocationPath )?
                    int alt19=2;
                    switch ( input.LA(1) ) {
                        case RecursiveAxisStep:
                        case SingleAxisStep:
                            {
                            alt19=1;
                            }
                            break;
                    }

                    switch (alt19) {
                        case 1 :
                            // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:111:19: simpleAxisStep relativeLocationPath
                            {
                            pushFollow(FOLLOW_simpleAxisStep_in_pathExpr1030);
                            simpleAxisStep68=simpleAxisStep();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, simpleAxisStep68.getTree());

                            pushFollow(FOLLOW_relativeLocationPath_in_pathExpr1033);
                            relativeLocationPath69=relativeLocationPath();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, relativeLocationPath69.getTree());

                            }
                            break;

                    }


                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "pathExpr"


    public static class simpleAxisStep_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "simpleAxisStep"
    // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:114:1: simpleAxisStep : ( SingleAxisStep -> ^( SIMPLE_AXIS_STEP SingleAxisStep ) | RecursiveAxisStep -> ^( SIMPLE_AXIS_STEP RecursiveAxisStep ) ) ;
    public final XPath1Parser.simpleAxisStep_return simpleAxisStep() throws RecognitionException {
        XPath1Parser.simpleAxisStep_return retval = new XPath1Parser.simpleAxisStep_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token SingleAxisStep70=null;
        Token RecursiveAxisStep71=null;

        CommonTree SingleAxisStep70_tree=null;
        CommonTree RecursiveAxisStep71_tree=null;
        RewriteRuleTokenStream stream_SingleAxisStep=new RewriteRuleTokenStream(adaptor,"token SingleAxisStep");
        RewriteRuleTokenStream stream_RecursiveAxisStep=new RewriteRuleTokenStream(adaptor,"token RecursiveAxisStep");

        try {
            // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:115:5: ( ( SingleAxisStep -> ^( SIMPLE_AXIS_STEP SingleAxisStep ) | RecursiveAxisStep -> ^( SIMPLE_AXIS_STEP RecursiveAxisStep ) ) )
            // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:115:7: ( SingleAxisStep -> ^( SIMPLE_AXIS_STEP SingleAxisStep ) | RecursiveAxisStep -> ^( SIMPLE_AXIS_STEP RecursiveAxisStep ) )
            {
            // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:115:7: ( SingleAxisStep -> ^( SIMPLE_AXIS_STEP SingleAxisStep ) | RecursiveAxisStep -> ^( SIMPLE_AXIS_STEP RecursiveAxisStep ) )
            int alt21=2;
            switch ( input.LA(1) ) {
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
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;

            }

            switch (alt21) {
                case 1 :
                    // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:115:8: SingleAxisStep
                    {
                    SingleAxisStep70=(Token)match(input,SingleAxisStep,FOLLOW_SingleAxisStep_in_simpleAxisStep1057); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SingleAxisStep.add(SingleAxisStep70);


                    // AST REWRITE
                    // elements: SingleAxisStep
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 115:25: -> ^( SIMPLE_AXIS_STEP SingleAxisStep )
                    {
                        // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:115:28: ^( SIMPLE_AXIS_STEP SingleAxisStep )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(SIMPLE_AXIS_STEP, "SIMPLE_AXIS_STEP")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_SingleAxisStep.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:116:7: RecursiveAxisStep
                    {
                    RecursiveAxisStep71=(Token)match(input,RecursiveAxisStep,FOLLOW_RecursiveAxisStep_in_simpleAxisStep1075); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RecursiveAxisStep.add(RecursiveAxisStep71);


                    // AST REWRITE
                    // elements: RecursiveAxisStep
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 116:28: -> ^( SIMPLE_AXIS_STEP RecursiveAxisStep )
                    {
                        // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:116:31: ^( SIMPLE_AXIS_STEP RecursiveAxisStep )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(SIMPLE_AXIS_STEP, "SIMPLE_AXIS_STEP")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_RecursiveAxisStep.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "simpleAxisStep"


    public static class filterExpr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "filterExpr"
    // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:120:1: filterExpr : primaryExpr ( predicate )? ;
    public final XPath1Parser.filterExpr_return filterExpr() throws RecognitionException {
        XPath1Parser.filterExpr_return retval = new XPath1Parser.filterExpr_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        XPath1Parser.primaryExpr_return primaryExpr72 =null;

        XPath1Parser.predicate_return predicate73 =null;



        try {
            // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:120:11: ( primaryExpr ( predicate )? )
            // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:120:13: primaryExpr ( predicate )?
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_primaryExpr_in_filterExpr1108);
            primaryExpr72=primaryExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, primaryExpr72.getTree());

            // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:120:25: ( predicate )?
            int alt22=2;
            switch ( input.LA(1) ) {
                case LeftSquareBracket:
                    {
                    alt22=1;
                    }
                    break;
            }

            switch (alt22) {
                case 1 :
                    // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:120:25: predicate
                    {
                    pushFollow(FOLLOW_predicate_in_filterExpr1110);
                    predicate73=predicate();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, predicate73.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "filterExpr"


    public static class primaryExpr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "primaryExpr"
    // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:122:1: primaryExpr : ( LeftParenthesis expr RightParenthesis | literal | functionCall );
    public final XPath1Parser.primaryExpr_return primaryExpr() throws RecognitionException {
        XPath1Parser.primaryExpr_return retval = new XPath1Parser.primaryExpr_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token LeftParenthesis74=null;
        Token RightParenthesis76=null;
        XPath1Parser.expr_return expr75 =null;

        XPath1Parser.literal_return literal77 =null;

        XPath1Parser.functionCall_return functionCall78 =null;


        CommonTree LeftParenthesis74_tree=null;
        CommonTree RightParenthesis76_tree=null;

        try {
            // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:123:5: ( LeftParenthesis expr RightParenthesis | literal | functionCall )
            int alt23=3;
            switch ( input.LA(1) ) {
            case LeftParenthesis:
                {
                alt23=1;
                }
                break;
            case DecimalLiteral:
            case DoubleLiteral:
            case IntegerLiteral:
            case StringLiteral:
            case VariableReference:
                {
                alt23=2;
                }
                break;
            case Name:
                {
                alt23=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;

            }

            switch (alt23) {
                case 1 :
                    // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:123:7: LeftParenthesis expr RightParenthesis
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    LeftParenthesis74=(Token)match(input,LeftParenthesis,FOLLOW_LeftParenthesis_in_primaryExpr1123); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LeftParenthesis74_tree = 
                    (CommonTree)adaptor.create(LeftParenthesis74)
                    ;
                    adaptor.addChild(root_0, LeftParenthesis74_tree);
                    }

                    pushFollow(FOLLOW_expr_in_primaryExpr1125);
                    expr75=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr75.getTree());

                    RightParenthesis76=(Token)match(input,RightParenthesis,FOLLOW_RightParenthesis_in_primaryExpr1127); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    RightParenthesis76_tree = 
                    (CommonTree)adaptor.create(RightParenthesis76)
                    ;
                    adaptor.addChild(root_0, RightParenthesis76_tree);
                    }

                    }
                    break;
                case 2 :
                    // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:124:7: literal
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_literal_in_primaryExpr1135);
                    literal77=literal();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, literal77.getTree());

                    }
                    break;
                case 3 :
                    // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:125:7: functionCall
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_functionCall_in_primaryExpr1143);
                    functionCall78=functionCall();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, functionCall78.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "primaryExpr"


    public static class expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expr"
    // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:128:1: expr : orExpr ;
    public final XPath1Parser.expr_return expr() throws RecognitionException {
        XPath1Parser.expr_return retval = new XPath1Parser.expr_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        XPath1Parser.orExpr_return orExpr79 =null;



        try {
            // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:128:5: ( orExpr )
            // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:128:7: orExpr
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_orExpr_in_expr1155);
            orExpr79=orExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, orExpr79.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "expr"


    public static class orExpr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "orExpr"
    // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:130:1: orExpr : andExpr ( Or andExpr )* -> ^( OREXPR ( andExpr )+ ) ;
    public final XPath1Parser.orExpr_return orExpr() throws RecognitionException {
        XPath1Parser.orExpr_return retval = new XPath1Parser.orExpr_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token Or81=null;
        XPath1Parser.andExpr_return andExpr80 =null;

        XPath1Parser.andExpr_return andExpr82 =null;


        CommonTree Or81_tree=null;
        RewriteRuleTokenStream stream_Or=new RewriteRuleTokenStream(adaptor,"token Or");
        RewriteRuleSubtreeStream stream_andExpr=new RewriteRuleSubtreeStream(adaptor,"rule andExpr");
        try {
            // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:130:7: ( andExpr ( Or andExpr )* -> ^( OREXPR ( andExpr )+ ) )
            // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:130:9: andExpr ( Or andExpr )*
            {
            pushFollow(FOLLOW_andExpr_in_orExpr1162);
            andExpr80=andExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_andExpr.add(andExpr80.getTree());

            // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:130:17: ( Or andExpr )*
            loop24:
            do {
                int alt24=2;
                switch ( input.LA(1) ) {
                case Or:
                    {
                    alt24=1;
                    }
                    break;

                }

                switch (alt24) {
            	case 1 :
            	    // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:130:18: Or andExpr
            	    {
            	    Or81=(Token)match(input,Or,FOLLOW_Or_in_orExpr1165); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_Or.add(Or81);


            	    pushFollow(FOLLOW_andExpr_in_orExpr1167);
            	    andExpr82=andExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_andExpr.add(andExpr82.getTree());

            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);


            // AST REWRITE
            // elements: andExpr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 130:33: -> ^( OREXPR ( andExpr )+ )
            {
                // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:130:36: ^( OREXPR ( andExpr )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(OREXPR, "OREXPR")
                , root_1);

                if ( !(stream_andExpr.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_andExpr.hasNext() ) {
                    adaptor.addChild(root_1, stream_andExpr.nextTree());

                }
                stream_andExpr.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "orExpr"


    public static class andExpr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "andExpr"
    // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:132:1: andExpr : equalityExpr ( And equalityExpr )? -> ^( ANDEXPR ( equalityExpr )+ ) ;
    public final XPath1Parser.andExpr_return andExpr() throws RecognitionException {
        XPath1Parser.andExpr_return retval = new XPath1Parser.andExpr_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token And84=null;
        XPath1Parser.equalityExpr_return equalityExpr83 =null;

        XPath1Parser.equalityExpr_return equalityExpr85 =null;


        CommonTree And84_tree=null;
        RewriteRuleTokenStream stream_And=new RewriteRuleTokenStream(adaptor,"token And");
        RewriteRuleSubtreeStream stream_equalityExpr=new RewriteRuleSubtreeStream(adaptor,"rule equalityExpr");
        try {
            // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:132:8: ( equalityExpr ( And equalityExpr )? -> ^( ANDEXPR ( equalityExpr )+ ) )
            // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:132:10: equalityExpr ( And equalityExpr )?
            {
            pushFollow(FOLLOW_equalityExpr_in_andExpr1187);
            equalityExpr83=equalityExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_equalityExpr.add(equalityExpr83.getTree());

            // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:132:23: ( And equalityExpr )?
            int alt25=2;
            switch ( input.LA(1) ) {
                case And:
                    {
                    alt25=1;
                    }
                    break;
            }

            switch (alt25) {
                case 1 :
                    // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:132:24: And equalityExpr
                    {
                    And84=(Token)match(input,And,FOLLOW_And_in_andExpr1190); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_And.add(And84);


                    pushFollow(FOLLOW_equalityExpr_in_andExpr1192);
                    equalityExpr85=equalityExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_equalityExpr.add(equalityExpr85.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: equalityExpr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 132:44: -> ^( ANDEXPR ( equalityExpr )+ )
            {
                // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:132:47: ^( ANDEXPR ( equalityExpr )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(ANDEXPR, "ANDEXPR")
                , root_1);

                if ( !(stream_equalityExpr.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_equalityExpr.hasNext() ) {
                    adaptor.addChild(root_1, stream_equalityExpr.nextTree());

                }
                stream_equalityExpr.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "andExpr"


    public static class equalityExpr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "equalityExpr"
    // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:134:1: equalityExpr : relationalExpr ( EqualtyOp relationalExpr )? -> ^( EQUEXPRESSION relationalExpr ( EqualtyOp relationalExpr )? ) ;
    public final XPath1Parser.equalityExpr_return equalityExpr() throws RecognitionException {
        XPath1Parser.equalityExpr_return retval = new XPath1Parser.equalityExpr_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token EqualtyOp87=null;
        XPath1Parser.relationalExpr_return relationalExpr86 =null;

        XPath1Parser.relationalExpr_return relationalExpr88 =null;


        CommonTree EqualtyOp87_tree=null;
        RewriteRuleTokenStream stream_EqualtyOp=new RewriteRuleTokenStream(adaptor,"token EqualtyOp");
        RewriteRuleSubtreeStream stream_relationalExpr=new RewriteRuleSubtreeStream(adaptor,"rule relationalExpr");
        try {
            // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:135:5: ( relationalExpr ( EqualtyOp relationalExpr )? -> ^( EQUEXPRESSION relationalExpr ( EqualtyOp relationalExpr )? ) )
            // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:135:7: relationalExpr ( EqualtyOp relationalExpr )?
            {
            pushFollow(FOLLOW_relationalExpr_in_equalityExpr1216);
            relationalExpr86=relationalExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_relationalExpr.add(relationalExpr86.getTree());

            // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:135:22: ( EqualtyOp relationalExpr )?
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
                    // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:135:23: EqualtyOp relationalExpr
                    {
                    EqualtyOp87=(Token)match(input,EqualtyOp,FOLLOW_EqualtyOp_in_equalityExpr1219); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EqualtyOp.add(EqualtyOp87);


                    pushFollow(FOLLOW_relationalExpr_in_equalityExpr1221);
                    relationalExpr88=relationalExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_relationalExpr.add(relationalExpr88.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: relationalExpr, EqualtyOp, relationalExpr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 135:51: -> ^( EQUEXPRESSION relationalExpr ( EqualtyOp relationalExpr )? )
            {
                // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:135:54: ^( EQUEXPRESSION relationalExpr ( EqualtyOp relationalExpr )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(EQUEXPRESSION, "EQUEXPRESSION")
                , root_1);

                adaptor.addChild(root_1, stream_relationalExpr.nextTree());

                // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:135:85: ( EqualtyOp relationalExpr )?
                if ( stream_relationalExpr.hasNext()||stream_EqualtyOp.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_EqualtyOp.nextNode()
                    );

                    adaptor.addChild(root_1, stream_relationalExpr.nextTree());

                }
                stream_relationalExpr.reset();
                stream_EqualtyOp.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "equalityExpr"


    public static class relationalExpr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "relationalExpr"
    // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:137:1: relationalExpr : unionExpr ;
    public final XPath1Parser.relationalExpr_return relationalExpr() throws RecognitionException {
        XPath1Parser.relationalExpr_return retval = new XPath1Parser.relationalExpr_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        XPath1Parser.unionExpr_return unionExpr89 =null;



        try {
            // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:137:15: ( unionExpr )
            // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:137:17: unionExpr
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_unionExpr_in_relationalExpr1250);
            unionExpr89=unionExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, unionExpr89.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "relationalExpr"


    public static class unionExpr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "unionExpr"
    // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:139:1: unionExpr : pathExpr ( Pipe pathExpr )? -> ^( UNIONEXPR ( pathExpr )+ ) ;
    public final XPath1Parser.unionExpr_return unionExpr() throws RecognitionException {
        XPath1Parser.unionExpr_return retval = new XPath1Parser.unionExpr_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token Pipe91=null;
        XPath1Parser.pathExpr_return pathExpr90 =null;

        XPath1Parser.pathExpr_return pathExpr92 =null;


        CommonTree Pipe91_tree=null;
        RewriteRuleTokenStream stream_Pipe=new RewriteRuleTokenStream(adaptor,"token Pipe");
        RewriteRuleSubtreeStream stream_pathExpr=new RewriteRuleSubtreeStream(adaptor,"rule pathExpr");
        try {
            // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:139:10: ( pathExpr ( Pipe pathExpr )? -> ^( UNIONEXPR ( pathExpr )+ ) )
            // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:139:12: pathExpr ( Pipe pathExpr )?
            {
            pushFollow(FOLLOW_pathExpr_in_unionExpr1257);
            pathExpr90=pathExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_pathExpr.add(pathExpr90.getTree());

            // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:139:21: ( Pipe pathExpr )?
            int alt27=2;
            switch ( input.LA(1) ) {
                case Pipe:
                    {
                    alt27=1;
                    }
                    break;
            }

            switch (alt27) {
                case 1 :
                    // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:139:22: Pipe pathExpr
                    {
                    Pipe91=(Token)match(input,Pipe,FOLLOW_Pipe_in_unionExpr1260); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Pipe.add(Pipe91);


                    pushFollow(FOLLOW_pathExpr_in_unionExpr1262);
                    pathExpr92=pathExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_pathExpr.add(pathExpr92.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: pathExpr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 139:40: -> ^( UNIONEXPR ( pathExpr )+ )
            {
                // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:139:43: ^( UNIONEXPR ( pathExpr )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(UNIONEXPR, "UNIONEXPR")
                , root_1);

                if ( !(stream_pathExpr.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_pathExpr.hasNext() ) {
                    adaptor.addChild(root_1, stream_pathExpr.nextTree());

                }
                stream_pathExpr.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "unionExpr"


    public static class literal_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "literal"
    // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:141:1: literal : ( StringLiteral -> ^( STRING StringLiteral ) | numericLiteral -> ^( NUMBER numericLiteral ) | VariableReference -> ^( VARREF VariableReference ) );
    public final XPath1Parser.literal_return literal() throws RecognitionException {
        XPath1Parser.literal_return retval = new XPath1Parser.literal_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token StringLiteral93=null;
        Token VariableReference95=null;
        XPath1Parser.numericLiteral_return numericLiteral94 =null;


        CommonTree StringLiteral93_tree=null;
        CommonTree VariableReference95_tree=null;
        RewriteRuleTokenStream stream_StringLiteral=new RewriteRuleTokenStream(adaptor,"token StringLiteral");
        RewriteRuleTokenStream stream_VariableReference=new RewriteRuleTokenStream(adaptor,"token VariableReference");
        RewriteRuleSubtreeStream stream_numericLiteral=new RewriteRuleSubtreeStream(adaptor,"rule numericLiteral");
        try {
            // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:142:5: ( StringLiteral -> ^( STRING StringLiteral ) | numericLiteral -> ^( NUMBER numericLiteral ) | VariableReference -> ^( VARREF VariableReference ) )
            int alt28=3;
            switch ( input.LA(1) ) {
            case StringLiteral:
                {
                alt28=1;
                }
                break;
            case DecimalLiteral:
            case DoubleLiteral:
            case IntegerLiteral:
                {
                alt28=2;
                }
                break;
            case VariableReference:
                {
                alt28=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;

            }

            switch (alt28) {
                case 1 :
                    // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:142:7: StringLiteral
                    {
                    StringLiteral93=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_literal1288); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_StringLiteral.add(StringLiteral93);


                    // AST REWRITE
                    // elements: StringLiteral
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 142:24: -> ^( STRING StringLiteral )
                    {
                        // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:142:27: ^( STRING StringLiteral )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(STRING, "STRING")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_StringLiteral.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:143:7: numericLiteral
                    {
                    pushFollow(FOLLOW_numericLiteral_in_literal1307);
                    numericLiteral94=numericLiteral();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_numericLiteral.add(numericLiteral94.getTree());

                    // AST REWRITE
                    // elements: numericLiteral
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 143:25: -> ^( NUMBER numericLiteral )
                    {
                        // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:143:28: ^( NUMBER numericLiteral )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(NUMBER, "NUMBER")
                        , root_1);

                        adaptor.addChild(root_1, stream_numericLiteral.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 3 :
                    // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:144:7: VariableReference
                    {
                    VariableReference95=(Token)match(input,VariableReference,FOLLOW_VariableReference_in_literal1326); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_VariableReference.add(VariableReference95);


                    // AST REWRITE
                    // elements: VariableReference
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 144:28: -> ^( VARREF VariableReference )
                    {
                        // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:144:31: ^( VARREF VariableReference )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(VARREF, "VARREF")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_VariableReference.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "literal"


    public static class numericLiteral_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "numericLiteral"
    // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:147:1: numericLiteral : ( IntegerLiteral | DecimalLiteral | DoubleLiteral );
    public final XPath1Parser.numericLiteral_return numericLiteral() throws RecognitionException {
        XPath1Parser.numericLiteral_return retval = new XPath1Parser.numericLiteral_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set96=null;

        CommonTree set96_tree=null;

        try {
            // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:147:15: ( IntegerLiteral | DecimalLiteral | DoubleLiteral )
            // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:
            {
            root_0 = (CommonTree)adaptor.nil();


            set96=(Token)input.LT(1);

            if ( (input.LA(1) >= DecimalLiteral && input.LA(1) <= DoubleLiteral)||input.LA(1)==IntegerLiteral ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (CommonTree)adaptor.create(set96)
                );
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "numericLiteral"


    public static class qName_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "qName"
    // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:149:1: qName : ( Name Colon Name -> ^( NameSpacedQNAME Name Name ) | Name -> ^( QNAME Name ) );
    public final XPath1Parser.qName_return qName() throws RecognitionException {
        XPath1Parser.qName_return retval = new XPath1Parser.qName_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token Name97=null;
        Token Colon98=null;
        Token Name99=null;
        Token Name100=null;

        CommonTree Name97_tree=null;
        CommonTree Colon98_tree=null;
        CommonTree Name99_tree=null;
        CommonTree Name100_tree=null;
        RewriteRuleTokenStream stream_Name=new RewriteRuleTokenStream(adaptor,"token Name");
        RewriteRuleTokenStream stream_Colon=new RewriteRuleTokenStream(adaptor,"token Colon");

        try {
            // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:150:4: ( Name Colon Name -> ^( NameSpacedQNAME Name Name ) | Name -> ^( QNAME Name ) )
            int alt29=2;
            switch ( input.LA(1) ) {
            case Name:
                {
                switch ( input.LA(2) ) {
                case Colon:
                    {
                    alt29=1;
                    }
                    break;
                case EOF:
                case And:
                case Comma:
                case EqualtyOp:
                case LeftParenthesis:
                case LeftSquareBracket:
                case Or:
                case Pipe:
                case RecursiveAxisStep:
                case RightParenthesis:
                case RightSquareBracket:
                case SingleAxisStep:
                    {
                    alt29=2;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 29, 1, input);

                    throw nvae;

                }

                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;

            }

            switch (alt29) {
                case 1 :
                    // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:150:5: Name Colon Name
                    {
                    Name97=(Token)match(input,Name,FOLLOW_Name_in_qName1371); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Name.add(Name97);


                    Colon98=(Token)match(input,Colon,FOLLOW_Colon_in_qName1373); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Colon.add(Colon98);


                    Name99=(Token)match(input,Name,FOLLOW_Name_in_qName1376); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Name.add(Name99);


                    // AST REWRITE
                    // elements: Name, Name
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 150:25: -> ^( NameSpacedQNAME Name Name )
                    {
                        // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:150:28: ^( NameSpacedQNAME Name Name )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(NameSpacedQNAME, "NameSpacedQNAME")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_Name.nextNode()
                        );

                        adaptor.addChild(root_1, 
                        stream_Name.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:151:5: Name
                    {
                    Name100=(Token)match(input,Name,FOLLOW_Name_in_qName1395); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Name.add(Name100);


                    // AST REWRITE
                    // elements: Name
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 151:14: -> ^( QNAME Name )
                    {
                        // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:151:17: ^( QNAME Name )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(QNAME, "QNAME")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_Name.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "qName"

    // $ANTLR start synpred12_XPath1
    public final void synpred12_XPath1_fragment() throws RecognitionException {
        // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:54:7: ( step ( ( SingleAxisStep relativeLocationPath ) | ( RecursiveAxisStep relativeLocationPath ) ) )
        // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:54:7: step ( ( SingleAxisStep relativeLocationPath ) | ( RecursiveAxisStep relativeLocationPath ) )
        {
        pushFollow(FOLLOW_step_in_synpred12_XPath1491);
        step();

        state._fsp--;
        if (state.failed) return ;

        // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:55:5: ( ( SingleAxisStep relativeLocationPath ) | ( RecursiveAxisStep relativeLocationPath ) )
        int alt31=2;
        switch ( input.LA(1) ) {
        case SingleAxisStep:
            {
            alt31=1;
            }
            break;
        case RecursiveAxisStep:
            {
            alt31=2;
            }
            break;
        default:
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 31, 0, input);

            throw nvae;

        }

        switch (alt31) {
            case 1 :
                // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:55:7: ( SingleAxisStep relativeLocationPath )
                {
                // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:55:7: ( SingleAxisStep relativeLocationPath )
                // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:55:8: SingleAxisStep relativeLocationPath
                {
                match(input,SingleAxisStep,FOLLOW_SingleAxisStep_in_synpred12_XPath1501); if (state.failed) return ;

                pushFollow(FOLLOW_relativeLocationPath_in_synpred12_XPath1504);
                relativeLocationPath();

                state._fsp--;
                if (state.failed) return ;

                }


                }
                break;
            case 2 :
                // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:56:6: ( RecursiveAxisStep relativeLocationPath )
                {
                // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:56:6: ( RecursiveAxisStep relativeLocationPath )
                // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:56:7: RecursiveAxisStep relativeLocationPath
                {
                match(input,RecursiveAxisStep,FOLLOW_RecursiveAxisStep_in_synpred12_XPath1524); if (state.failed) return ;

                pushFollow(FOLLOW_relativeLocationPath_in_synpred12_XPath1527);
                relativeLocationPath();

                state._fsp--;
                if (state.failed) return ;

                }


                }
                break;

        }


        }

    }
    // $ANTLR end synpred12_XPath1

    // $ANTLR start synpred14_XPath1
    public final void synpred14_XPath1_fragment() throws RecognitionException {
        // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:62:22: ( ( predicate )* )
        // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:62:22: ( predicate )*
        {
        // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:62:22: ( predicate )*
        loop32:
        do {
            int alt32=2;
            switch ( input.LA(1) ) {
            case LeftSquareBracket:
                {
                alt32=1;
                }
                break;

            }

            switch (alt32) {
        	case 1 :
        	    // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:62:22: predicate
        	    {
        	    pushFollow(FOLLOW_predicate_in_synpred14_XPath1571);
        	    predicate();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    break loop32;
            }
        } while (true);


        }

    }
    // $ANTLR end synpred14_XPath1

    // $ANTLR start synpred17_XPath1
    public final void synpred17_XPath1_fragment() throws RecognitionException {
        // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:63:29: ( ( predicate )* )
        // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:63:29: ( predicate )*
        {
        // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:63:29: ( predicate )*
        loop35:
        do {
            int alt35=2;
            switch ( input.LA(1) ) {
            case LeftSquareBracket:
                {
                alt35=1;
                }
                break;

            }

            switch (alt35) {
        	case 1 :
        	    // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:63:29: predicate
        	    {
        	    pushFollow(FOLLOW_predicate_in_synpred17_XPath1600);
        	    predicate();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    break loop35;
            }
        } while (true);


        }

    }
    // $ANTLR end synpred17_XPath1

    // Delegated rules

    public final boolean synpred17_XPath1() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred17_XPath1_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred12_XPath1() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred12_XPath1_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred14_XPath1() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred14_XPath1_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_locationPath_in_xpath202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SynapseSpecificBody_in_locationPath224 = new BitSet(new long[]{0x0300802140000A00L});
    public static final BitSet FOLLOW_relativeLocationPath_in_locationPath226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SynapseSpecific_in_locationPath243 = new BitSet(new long[]{0x0300802140000A00L});
    public static final BitSet FOLLOW_relativeLocationPath_in_locationPath245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SynapseSpecificBody_in_locationPath262 = new BitSet(new long[]{0x0000410000000000L});
    public static final BitSet FOLLOW_absoluteLocationPath_in_locationPath264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SynapseSpecific_in_locationPath281 = new BitSet(new long[]{0x0000410000000000L});
    public static final BitSet FOLLOW_absoluteLocationPath_in_locationPath283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relativeLocationPath_in_locationPath300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_absoluteLocationPath_in_locationPath317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SynapseSpecific_in_locationPath334 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_Colon_in_locationPath336 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_Name_in_locationPath338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SynapseSpecificBody_in_locationPath355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SynapseSpecific_in_locationPath392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SingleAxisStep_in_absoluteLocationPath447 = new BitSet(new long[]{0x0300802140000A02L});
    public static final BitSet FOLLOW_relativeLocationPath_in_absoluteLocationPath449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RecursiveAxisStep_in_absoluteLocationPath467 = new BitSet(new long[]{0x0300802140000A00L});
    public static final BitSet FOLLOW_relativeLocationPath_in_absoluteLocationPath469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_step_in_relativeLocationPath491 = new BitSet(new long[]{0x0000410000000000L});
    public static final BitSet FOLLOW_SingleAxisStep_in_relativeLocationPath501 = new BitSet(new long[]{0x0300802140000A00L});
    public static final BitSet FOLLOW_relativeLocationPath_in_relativeLocationPath504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RecursiveAxisStep_in_relativeLocationPath524 = new BitSet(new long[]{0x0300802140000A00L});
    public static final BitSet FOLLOW_relativeLocationPath_in_relativeLocationPath527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_step_in_relativeLocationPath551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_namedAxisStep_in_step568 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_predicate_in_step571 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_abbreviatedAxisStep_in_step596 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_predicate_in_step600 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_56_in_abbreviatedAxisStep635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_abbreviatedAxisStep655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AbbreviatedAxisSpecifier_in_namedAxisStep684 = new BitSet(new long[]{0x0000802140000000L});
    public static final BitSet FOLLOW_nodeTest_in_namedAxisStep686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_axisSpecifier_in_namedAxisStep705 = new BitSet(new long[]{0x0000802140000000L});
    public static final BitSet FOLLOW_nodeTest_in_namedAxisStep708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AxisName_in_axisSpecifier734 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_AxisNameSeparator_in_axisSpecifier736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nameTest_in_nodeTest762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NodeType_in_nodeTest771 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_LeftParenthesis_in_nodeTest773 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_RightParenthesis_in_nodeTest775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ProcessingInstruction_in_nodeTest792 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_LeftParenthesis_in_nodeTest794 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_StringLiteral_in_nodeTest796 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_RightParenthesis_in_nodeTest798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Star_in_nameTest817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Name_in_nameTest835 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_Colon_in_nameTest837 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_Star_in_nameTest839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qName_in_nameTest858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LeftSquareBracket_in_predicate875 = new BitSet(new long[]{0x0327C12141430A00L});
    public static final BitSet FOLLOW_predicateExpr_in_predicate877 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_RightSquareBracket_in_predicate879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LeftSquareBracket_in_predicate894 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_predicate896 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_RightSquareBracket_in_predicate898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_predicateExpr919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qName_in_functionCall935 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_LeftParenthesis_in_functionCall937 = new BitSet(new long[]{0x0327C32141430A00L});
    public static final BitSet FOLLOW_expressionList_in_functionCall943 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_RightParenthesis_in_functionCall951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_expressionList980 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_Comma_in_expressionList984 = new BitSet(new long[]{0x0327C12141430A00L});
    public static final BitSet FOLLOW_expr_in_expressionList986 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_locationPath_in_pathExpr1019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_filterExpr_in_pathExpr1027 = new BitSet(new long[]{0x0000410000000002L});
    public static final BitSet FOLLOW_simpleAxisStep_in_pathExpr1030 = new BitSet(new long[]{0x0300802140000A00L});
    public static final BitSet FOLLOW_relativeLocationPath_in_pathExpr1033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SingleAxisStep_in_simpleAxisStep1057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RecursiveAxisStep_in_simpleAxisStep1075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primaryExpr_in_filterExpr1108 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_predicate_in_filterExpr1110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LeftParenthesis_in_primaryExpr1123 = new BitSet(new long[]{0x0327C12141430A00L});
    public static final BitSet FOLLOW_expr_in_primaryExpr1125 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_RightParenthesis_in_primaryExpr1127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_primaryExpr1135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionCall_in_primaryExpr1143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_orExpr_in_expr1155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_andExpr_in_orExpr1162 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_Or_in_orExpr1165 = new BitSet(new long[]{0x0327C12141430A00L});
    public static final BitSet FOLLOW_andExpr_in_orExpr1167 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_equalityExpr_in_andExpr1187 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_And_in_andExpr1190 = new BitSet(new long[]{0x0327C12141430A00L});
    public static final BitSet FOLLOW_equalityExpr_in_andExpr1192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relationalExpr_in_equalityExpr1216 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_EqualtyOp_in_equalityExpr1219 = new BitSet(new long[]{0x0327C12141430A00L});
    public static final BitSet FOLLOW_relationalExpr_in_equalityExpr1221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unionExpr_in_relationalExpr1250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pathExpr_in_unionExpr1257 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_Pipe_in_unionExpr1260 = new BitSet(new long[]{0x0327C12141430A00L});
    public static final BitSet FOLLOW_pathExpr_in_unionExpr1262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_StringLiteral_in_literal1288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericLiteral_in_literal1307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VariableReference_in_literal1326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Name_in_qName1371 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_Colon_in_qName1373 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_Name_in_qName1376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Name_in_qName1395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_step_in_synpred12_XPath1491 = new BitSet(new long[]{0x0000410000000000L});
    public static final BitSet FOLLOW_SingleAxisStep_in_synpred12_XPath1501 = new BitSet(new long[]{0x0300802140000A00L});
    public static final BitSet FOLLOW_relativeLocationPath_in_synpred12_XPath1504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RecursiveAxisStep_in_synpred12_XPath1524 = new BitSet(new long[]{0x0300802140000A00L});
    public static final BitSet FOLLOW_relativeLocationPath_in_synpred12_XPath1527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_predicate_in_synpred14_XPath1571 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_predicate_in_synpred17_XPath1600 = new BitSet(new long[]{0x0000000002000002L});

}