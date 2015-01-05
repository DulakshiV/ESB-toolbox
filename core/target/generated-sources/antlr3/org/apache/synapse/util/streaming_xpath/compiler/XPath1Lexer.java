// $ANTLR 3.4 org/apache/synapse/util/streaming_xpath/compiler/XPath1.g 2015-01-05 12:10:14
 
	package org.apache.synapse.util.streaming_xpath.compiler;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class XPath1Lexer extends Lexer {
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
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public XPath1Lexer() {} 
    public XPath1Lexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public XPath1Lexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "org/apache/synapse/util/streaming_xpath/compiler/XPath1.g"; }

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:11:7: ( '.' )
            // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:11:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:12:7: ( '..' )
            // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:12:9: '..'
            {
            match(".."); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:13:7: ( '1' )
            // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:13:9: '1'
            {
            match('1'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "SingleAxisStep"
    public final void mSingleAxisStep() throws RecognitionException {
        try {
            int _type = SingleAxisStep;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:156:15: ( '/' )
            // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:156:17: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SingleAxisStep"

    // $ANTLR start "RecursiveAxisStep"
    public final void mRecursiveAxisStep() throws RecognitionException {
        try {
            int _type = RecursiveAxisStep;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:157:18: ( '//' )
            // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:157:20: '//'
            {
            match("//"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RecursiveAxisStep"

    // $ANTLR start "AxisNameSeparator"
    public final void mAxisNameSeparator() throws RecognitionException {
        try {
            int _type = AxisNameSeparator;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:159:18: ( '::' )
            // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:159:20: '::'
            {
            match("::"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "AxisNameSeparator"

    // $ANTLR start "AbbreviatedAxisSpecifier"
    public final void mAbbreviatedAxisSpecifier() throws RecognitionException {
        try {
            int _type = AbbreviatedAxisSpecifier;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:160:25: ( '@' )
            // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:160:27: '@'
            {
            match('@'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "AbbreviatedAxisSpecifier"

    // $ANTLR start "Star"
    public final void mStar() throws RecognitionException {
        try {
            int _type = Star;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:162:5: ( '*' )
            // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:162:12: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Star"

    // $ANTLR start "Colon"
    public final void mColon() throws RecognitionException {
        try {
            int _type = Colon;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:163:6: ( ':' )
            // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:163:12: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Colon"

    // $ANTLR start "Comma"
    public final void mComma() throws RecognitionException {
        try {
            int _type = Comma;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:164:6: ( ',' )
            // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:164:12: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Comma"

    // $ANTLR start "Pipe"
    public final void mPipe() throws RecognitionException {
        try {
            int _type = Pipe;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:165:5: ( '|' )
            // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:165:12: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Pipe"

    // $ANTLR start "SynapseSpecificBody"
    public final void mSynapseSpecificBody() throws RecognitionException {
        try {
            int _type = SynapseSpecificBody;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:168:6: ( '$body' )
            // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:168:8: '$body'
            {
            match("$body"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SynapseSpecificBody"

    // $ANTLR start "SynapseSpecific"
    public final void mSynapseSpecific() throws RecognitionException {
        try {
            int _type = SynapseSpecific;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:171:6: ( '$header' | '$func' | '$axis2' | '$ctx' | '$trp' | '$url' )
            int alt1=6;
            switch ( input.LA(1) ) {
            case '$':
                {
                switch ( input.LA(2) ) {
                case 'h':
                    {
                    alt1=1;
                    }
                    break;
                case 'f':
                    {
                    alt1=2;
                    }
                    break;
                case 'a':
                    {
                    alt1=3;
                    }
                    break;
                case 'c':
                    {
                    alt1=4;
                    }
                    break;
                case 't':
                    {
                    alt1=5;
                    }
                    break;
                case 'u':
                    {
                    alt1=6;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

                    throw nvae;

                }

                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;

            }

            switch (alt1) {
                case 1 :
                    // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:171:8: '$header'
                    {
                    match("$header"); 



                    }
                    break;
                case 2 :
                    // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:171:18: '$func'
                    {
                    match("$func"); 



                    }
                    break;
                case 3 :
                    // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:171:26: '$axis2'
                    {
                    match("$axis2"); 



                    }
                    break;
                case 4 :
                    // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:171:35: '$ctx'
                    {
                    match("$ctx"); 



                    }
                    break;
                case 5 :
                    // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:171:42: '$trp'
                    {
                    match("$trp"); 



                    }
                    break;
                case 6 :
                    // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:171:49: '$url'
                    {
                    match("$url"); 



                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SynapseSpecific"

    // $ANTLR start "LeftParenthesis"
    public final void mLeftParenthesis() throws RecognitionException {
        try {
            int _type = LeftParenthesis;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:174:16: ( '(' )
            // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:174:18: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LeftParenthesis"

    // $ANTLR start "RightParenthesis"
    public final void mRightParenthesis() throws RecognitionException {
        try {
            int _type = RightParenthesis;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:175:17: ( ')' )
            // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:175:19: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RightParenthesis"

    // $ANTLR start "LeftSquareBracket"
    public final void mLeftSquareBracket() throws RecognitionException {
        try {
            int _type = LeftSquareBracket;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:177:18: ( '[' )
            // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:177:20: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LeftSquareBracket"

    // $ANTLR start "RightSquareBracket"
    public final void mRightSquareBracket() throws RecognitionException {
        try {
            int _type = RightSquareBracket;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:178:19: ( ']' )
            // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:178:21: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RightSquareBracket"

    // $ANTLR start "And"
    public final void mAnd() throws RecognitionException {
        try {
            int _type = And;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:180:5: ( 'and' )
            // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:180:7: 'and'
            {
            match("and"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "And"

    // $ANTLR start "Or"
    public final void mOr() throws RecognitionException {
        try {
            int _type = Or;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:181:4: ( 'or' )
            // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:181:6: 'or'
            {
            match("or"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Or"

    // $ANTLR start "AxisName"
    public final void mAxisName() throws RecognitionException {
        try {
            int _type = AxisName;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:184:5: ( 'ancestor' | 'ancestor-or-self' | 'attribute' | 'child' | 'descendant' | 'descendant-or-self' | 'following' | 'following-sibling' | 'namespace' | 'parent' | 'preceding' | 'preceding-sibling' | 'self' )
            int alt2=13;
            switch ( input.LA(1) ) {
            case 'a':
                {
                switch ( input.LA(2) ) {
                case 'n':
                    {
                    switch ( input.LA(3) ) {
                    case 'c':
                        {
                        switch ( input.LA(4) ) {
                        case 'e':
                            {
                            switch ( input.LA(5) ) {
                            case 's':
                                {
                                switch ( input.LA(6) ) {
                                case 't':
                                    {
                                    switch ( input.LA(7) ) {
                                    case 'o':
                                        {
                                        switch ( input.LA(8) ) {
                                        case 'r':
                                            {
                                            switch ( input.LA(9) ) {
                                            case '-':
                                                {
                                                alt2=2;
                                                }
                                                break;
                                            default:
                                                alt2=1;
                                            }

                                            }
                                            break;
                                        default:
                                            NoViableAltException nvae =
                                                new NoViableAltException("", 2, 30, input);

                                            throw nvae;

                                        }

                                        }
                                        break;
                                    default:
                                        NoViableAltException nvae =
                                            new NoViableAltException("", 2, 26, input);

                                        throw nvae;

                                    }

                                    }
                                    break;
                                default:
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 2, 22, input);

                                    throw nvae;

                                }

                                }
                                break;
                            default:
                                NoViableAltException nvae =
                                    new NoViableAltException("", 2, 18, input);

                                throw nvae;

                            }

                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 2, 14, input);

                            throw nvae;

                        }

                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 8, input);

                        throw nvae;

                    }

                    }
                    break;
                case 't':
                    {
                    alt2=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;

                }

                }
                break;
            case 'c':
                {
                alt2=4;
                }
                break;
            case 'd':
                {
                switch ( input.LA(2) ) {
                case 'e':
                    {
                    switch ( input.LA(3) ) {
                    case 's':
                        {
                        switch ( input.LA(4) ) {
                        case 'c':
                            {
                            switch ( input.LA(5) ) {
                            case 'e':
                                {
                                switch ( input.LA(6) ) {
                                case 'n':
                                    {
                                    switch ( input.LA(7) ) {
                                    case 'd':
                                        {
                                        switch ( input.LA(8) ) {
                                        case 'a':
                                            {
                                            switch ( input.LA(9) ) {
                                            case 'n':
                                                {
                                                switch ( input.LA(10) ) {
                                                case 't':
                                                    {
                                                    switch ( input.LA(11) ) {
                                                    case '-':
                                                        {
                                                        alt2=6;
                                                        }
                                                        break;
                                                    default:
                                                        alt2=5;
                                                    }

                                                    }
                                                    break;
                                                default:
                                                    NoViableAltException nvae =
                                                        new NoViableAltException("", 2, 40, input);

                                                    throw nvae;

                                                }

                                                }
                                                break;
                                            default:
                                                NoViableAltException nvae =
                                                    new NoViableAltException("", 2, 35, input);

                                                throw nvae;

                                            }

                                            }
                                            break;
                                        default:
                                            NoViableAltException nvae =
                                                new NoViableAltException("", 2, 31, input);

                                            throw nvae;

                                        }

                                        }
                                        break;
                                    default:
                                        NoViableAltException nvae =
                                            new NoViableAltException("", 2, 27, input);

                                        throw nvae;

                                    }

                                    }
                                    break;
                                default:
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 2, 23, input);

                                    throw nvae;

                                }

                                }
                                break;
                            default:
                                NoViableAltException nvae =
                                    new NoViableAltException("", 2, 19, input);

                                throw nvae;

                            }

                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 2, 15, input);

                            throw nvae;

                        }

                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 10, input);

                        throw nvae;

                    }

                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 3, input);

                    throw nvae;

                }

                }
                break;
            case 'f':
                {
                switch ( input.LA(2) ) {
                case 'o':
                    {
                    switch ( input.LA(3) ) {
                    case 'l':
                        {
                        switch ( input.LA(4) ) {
                        case 'l':
                            {
                            switch ( input.LA(5) ) {
                            case 'o':
                                {
                                switch ( input.LA(6) ) {
                                case 'w':
                                    {
                                    switch ( input.LA(7) ) {
                                    case 'i':
                                        {
                                        switch ( input.LA(8) ) {
                                        case 'n':
                                            {
                                            switch ( input.LA(9) ) {
                                            case 'g':
                                                {
                                                switch ( input.LA(10) ) {
                                                case '-':
                                                    {
                                                    alt2=8;
                                                    }
                                                    break;
                                                default:
                                                    alt2=7;
                                                }

                                                }
                                                break;
                                            default:
                                                NoViableAltException nvae =
                                                    new NoViableAltException("", 2, 36, input);

                                                throw nvae;

                                            }

                                            }
                                            break;
                                        default:
                                            NoViableAltException nvae =
                                                new NoViableAltException("", 2, 32, input);

                                            throw nvae;

                                        }

                                        }
                                        break;
                                    default:
                                        NoViableAltException nvae =
                                            new NoViableAltException("", 2, 28, input);

                                        throw nvae;

                                    }

                                    }
                                    break;
                                default:
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 2, 24, input);

                                    throw nvae;

                                }

                                }
                                break;
                            default:
                                NoViableAltException nvae =
                                    new NoViableAltException("", 2, 20, input);

                                throw nvae;

                            }

                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 2, 16, input);

                            throw nvae;

                        }

                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 11, input);

                        throw nvae;

                    }

                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 4, input);

                    throw nvae;

                }

                }
                break;
            case 'n':
                {
                alt2=9;
                }
                break;
            case 'p':
                {
                switch ( input.LA(2) ) {
                case 'a':
                    {
                    alt2=10;
                    }
                    break;
                case 'r':
                    {
                    switch ( input.LA(3) ) {
                    case 'e':
                        {
                        switch ( input.LA(4) ) {
                        case 'c':
                            {
                            switch ( input.LA(5) ) {
                            case 'e':
                                {
                                switch ( input.LA(6) ) {
                                case 'd':
                                    {
                                    switch ( input.LA(7) ) {
                                    case 'i':
                                        {
                                        switch ( input.LA(8) ) {
                                        case 'n':
                                            {
                                            switch ( input.LA(9) ) {
                                            case 'g':
                                                {
                                                switch ( input.LA(10) ) {
                                                case '-':
                                                    {
                                                    alt2=12;
                                                    }
                                                    break;
                                                default:
                                                    alt2=11;
                                                }

                                                }
                                                break;
                                            default:
                                                NoViableAltException nvae =
                                                    new NoViableAltException("", 2, 37, input);

                                                throw nvae;

                                            }

                                            }
                                            break;
                                        default:
                                            NoViableAltException nvae =
                                                new NoViableAltException("", 2, 33, input);

                                            throw nvae;

                                        }

                                        }
                                        break;
                                    default:
                                        NoViableAltException nvae =
                                            new NoViableAltException("", 2, 29, input);

                                        throw nvae;

                                    }

                                    }
                                    break;
                                default:
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 2, 25, input);

                                    throw nvae;

                                }

                                }
                                break;
                            default:
                                NoViableAltException nvae =
                                    new NoViableAltException("", 2, 21, input);

                                throw nvae;

                            }

                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 2, 17, input);

                            throw nvae;

                        }

                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 13, input);

                        throw nvae;

                    }

                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 6, input);

                    throw nvae;

                }

                }
                break;
            case 's':
                {
                alt2=13;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }

            switch (alt2) {
                case 1 :
                    // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:184:8: 'ancestor'
                    {
                    match("ancestor"); 



                    }
                    break;
                case 2 :
                    // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:184:22: 'ancestor-or-self'
                    {
                    match("ancestor-or-self"); 



                    }
                    break;
                case 3 :
                    // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:184:44: 'attribute'
                    {
                    match("attribute"); 



                    }
                    break;
                case 4 :
                    // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:185:8: 'child'
                    {
                    match("child"); 



                    }
                    break;
                case 5 :
                    // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:185:22: 'descendant'
                    {
                    match("descendant"); 



                    }
                    break;
                case 6 :
                    // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:185:44: 'descendant-or-self'
                    {
                    match("descendant-or-self"); 



                    }
                    break;
                case 7 :
                    // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:186:8: 'following'
                    {
                    match("following"); 



                    }
                    break;
                case 8 :
                    // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:186:22: 'following-sibling'
                    {
                    match("following-sibling"); 



                    }
                    break;
                case 9 :
                    // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:186:44: 'namespace'
                    {
                    match("namespace"); 



                    }
                    break;
                case 10 :
                    // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:187:8: 'parent'
                    {
                    match("parent"); 



                    }
                    break;
                case 11 :
                    // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:187:22: 'preceding'
                    {
                    match("preceding"); 



                    }
                    break;
                case 12 :
                    // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:187:44: 'preceding-sibling'
                    {
                    match("preceding-sibling"); 



                    }
                    break;
                case 13 :
                    // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:188:8: 'self'
                    {
                    match("self"); 



                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "AxisName"

    // $ANTLR start "ProcessingInstruction"
    public final void mProcessingInstruction() throws RecognitionException {
        try {
            int _type = ProcessingInstruction;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:191:22: ( 'processing-instruction' )
            // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:191:25: 'processing-instruction'
            {
            match("processing-instruction"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ProcessingInstruction"

    // $ANTLR start "NodeType"
    public final void mNodeType() throws RecognitionException {
        try {
            int _type = NodeType;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:194:2: ( 'comment' | 'text' | ProcessingInstruction | 'node' )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 'c':
                {
                alt3=1;
                }
                break;
            case 't':
                {
                alt3=2;
                }
                break;
            case 'p':
                {
                alt3=3;
                }
                break;
            case 'n':
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;

            }

            switch (alt3) {
                case 1 :
                    // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:194:5: 'comment'
                    {
                    match("comment"); 



                    }
                    break;
                case 2 :
                    // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:194:17: 'text'
                    {
                    match("text"); 



                    }
                    break;
                case 3 :
                    // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:194:26: ProcessingInstruction
                    {
                    mProcessingInstruction(); 


                    }
                    break;
                case 4 :
                    // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:194:50: 'node'
                    {
                    match("node"); 



                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NodeType"

    // $ANTLR start "IntegerLiteral"
    public final void mIntegerLiteral() throws RecognitionException {
        try {
            int _type = IntegerLiteral;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:196:16: ( ( '0' .. '9' )+ )
            // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:196:19: ( '0' .. '9' )+
            {
            // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:196:19: ( '0' .. '9' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                switch ( input.LA(1) ) {
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                    {
                    alt4=1;
                    }
                    break;

                }

                switch (alt4) {
            	case 1 :
            	    // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "IntegerLiteral"

    // $ANTLR start "DecimalLiteral"
    public final void mDecimalLiteral() throws RecognitionException {
        try {
            int _type = DecimalLiteral;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:197:16: ( ( '.' ( '0' .. '9' )+ ) | ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ) )
            int alt8=2;
            switch ( input.LA(1) ) {
            case '.':
                {
                alt8=1;
                }
                break;
            case '0':
            case '1':
            case '2':
            case '3':
            case '4':
            case '5':
            case '6':
            case '7':
            case '8':
            case '9':
                {
                alt8=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;

            }

            switch (alt8) {
                case 1 :
                    // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:197:19: ( '.' ( '0' .. '9' )+ )
                    {
                    // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:197:19: ( '.' ( '0' .. '9' )+ )
                    // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:197:20: '.' ( '0' .. '9' )+
                    {
                    match('.'); 

                    // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:197:24: ( '0' .. '9' )+
                    int cnt5=0;
                    loop5:
                    do {
                        int alt5=2;
                        switch ( input.LA(1) ) {
                        case '0':
                        case '1':
                        case '2':
                        case '3':
                        case '4':
                        case '5':
                        case '6':
                        case '7':
                        case '8':
                        case '9':
                            {
                            alt5=1;
                            }
                            break;

                        }

                        switch (alt5) {
                    	case 1 :
                    	    // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


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


                    }


                    }
                    break;
                case 2 :
                    // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:197:40: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* )
                    {
                    // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:197:40: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* )
                    // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:197:41: ( '0' .. '9' )+ '.' ( '0' .. '9' )*
                    {
                    // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:197:41: ( '0' .. '9' )+
                    int cnt6=0;
                    loop6:
                    do {
                        int alt6=2;
                        switch ( input.LA(1) ) {
                        case '0':
                        case '1':
                        case '2':
                        case '3':
                        case '4':
                        case '5':
                        case '6':
                        case '7':
                        case '8':
                        case '9':
                            {
                            alt6=1;
                            }
                            break;

                        }

                        switch (alt6) {
                    	case 1 :
                    	    // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt6 >= 1 ) break loop6;
                                EarlyExitException eee =
                                    new EarlyExitException(6, input);
                                throw eee;
                        }
                        cnt6++;
                    } while (true);


                    match('.'); 

                    // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:197:57: ( '0' .. '9' )*
                    loop7:
                    do {
                        int alt7=2;
                        switch ( input.LA(1) ) {
                        case '0':
                        case '1':
                        case '2':
                        case '3':
                        case '4':
                        case '5':
                        case '6':
                        case '7':
                        case '8':
                        case '9':
                            {
                            alt7=1;
                            }
                            break;

                        }

                        switch (alt7) {
                    	case 1 :
                    	    // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);


                    }


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DecimalLiteral"

    // $ANTLR start "DoubleLiteral"
    public final void mDoubleLiteral() throws RecognitionException {
        try {
            int _type = DoubleLiteral;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:198:16: ( ( ( '.' ( '0' .. '9' )+ ) | ( ( '0' .. '9' )+ ( '.' ( '0' .. '9' )* )? ) ) ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )
            // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:198:19: ( ( '.' ( '0' .. '9' )+ ) | ( ( '0' .. '9' )+ ( '.' ( '0' .. '9' )* )? ) ) ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+
            {
            // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:198:19: ( ( '.' ( '0' .. '9' )+ ) | ( ( '0' .. '9' )+ ( '.' ( '0' .. '9' )* )? ) )
            int alt13=2;
            switch ( input.LA(1) ) {
            case '.':
                {
                alt13=1;
                }
                break;
            case '0':
            case '1':
            case '2':
            case '3':
            case '4':
            case '5':
            case '6':
            case '7':
            case '8':
            case '9':
                {
                alt13=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;

            }

            switch (alt13) {
                case 1 :
                    // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:198:20: ( '.' ( '0' .. '9' )+ )
                    {
                    // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:198:20: ( '.' ( '0' .. '9' )+ )
                    // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:198:21: '.' ( '0' .. '9' )+
                    {
                    match('.'); 

                    // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:198:25: ( '0' .. '9' )+
                    int cnt9=0;
                    loop9:
                    do {
                        int alt9=2;
                        switch ( input.LA(1) ) {
                        case '0':
                        case '1':
                        case '2':
                        case '3':
                        case '4':
                        case '5':
                        case '6':
                        case '7':
                        case '8':
                        case '9':
                            {
                            alt9=1;
                            }
                            break;

                        }

                        switch (alt9) {
                    	case 1 :
                    	    // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt9 >= 1 ) break loop9;
                                EarlyExitException eee =
                                    new EarlyExitException(9, input);
                                throw eee;
                        }
                        cnt9++;
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:198:40: ( ( '0' .. '9' )+ ( '.' ( '0' .. '9' )* )? )
                    {
                    // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:198:40: ( ( '0' .. '9' )+ ( '.' ( '0' .. '9' )* )? )
                    // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:198:41: ( '0' .. '9' )+ ( '.' ( '0' .. '9' )* )?
                    {
                    // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:198:41: ( '0' .. '9' )+
                    int cnt10=0;
                    loop10:
                    do {
                        int alt10=2;
                        switch ( input.LA(1) ) {
                        case '0':
                        case '1':
                        case '2':
                        case '3':
                        case '4':
                        case '5':
                        case '6':
                        case '7':
                        case '8':
                        case '9':
                            {
                            alt10=1;
                            }
                            break;

                        }

                        switch (alt10) {
                    	case 1 :
                    	    // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


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


                    // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:198:53: ( '.' ( '0' .. '9' )* )?
                    int alt12=2;
                    switch ( input.LA(1) ) {
                        case '.':
                            {
                            alt12=1;
                            }
                            break;
                    }

                    switch (alt12) {
                        case 1 :
                            // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:198:54: '.' ( '0' .. '9' )*
                            {
                            match('.'); 

                            // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:198:58: ( '0' .. '9' )*
                            loop11:
                            do {
                                int alt11=2;
                                switch ( input.LA(1) ) {
                                case '0':
                                case '1':
                                case '2':
                                case '3':
                                case '4':
                                case '5':
                                case '6':
                                case '7':
                                case '8':
                                case '9':
                                    {
                                    alt11=1;
                                    }
                                    break;

                                }

                                switch (alt11) {
                            	case 1 :
                            	    // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:
                            	    {
                            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                            	        input.consume();
                            	    }
                            	    else {
                            	        MismatchedSetException mse = new MismatchedSetException(null,input);
                            	        recover(mse);
                            	        throw mse;
                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop11;
                                }
                            } while (true);


                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:198:84: ( '+' | '-' )?
            int alt14=2;
            switch ( input.LA(1) ) {
                case '+':
                case '-':
                    {
                    alt14=1;
                    }
                    break;
            }

            switch (alt14) {
                case 1 :
                    // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:
                    {
                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;

            }


            // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:198:97: ( '0' .. '9' )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                switch ( input.LA(1) ) {
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                    {
                    alt15=1;
                    }
                    break;

                }

                switch (alt15) {
            	case 1 :
            	    // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


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

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DoubleLiteral"

    // $ANTLR start "StringLiteral"
    public final void mStringLiteral() throws RecognitionException {
        try {
            int _type = StringLiteral;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:200:15: ( '\"' (~ ( '\"' ) )* '\"' | '\\'' (~ ( '\\'' ) )* '\\'' )
            int alt18=2;
            switch ( input.LA(1) ) {
            case '\"':
                {
                alt18=1;
                }
                break;
            case '\'':
                {
                alt18=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;

            }

            switch (alt18) {
                case 1 :
                    // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:200:17: '\"' (~ ( '\"' ) )* '\"'
                    {
                    match('\"'); 

                    // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:200:21: (~ ( '\"' ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( ((LA16_0 >= '\u0000' && LA16_0 <= '!')||(LA16_0 >= '#' && LA16_0 <= '\uFFFF')) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:
                    	    {
                    	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '\uFFFF') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);


                    match('\"'); 

                    }
                    break;
                case 2 :
                    // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:200:35: '\\'' (~ ( '\\'' ) )* '\\''
                    {
                    match('\''); 

                    // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:200:40: (~ ( '\\'' ) )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( ((LA17_0 >= '\u0000' && LA17_0 <= '&')||(LA17_0 >= '(' && LA17_0 <= '\uFFFF')) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:
                    	    {
                    	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '&')||(input.LA(1) >= '(' && input.LA(1) <= '\uFFFF') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);


                    match('\''); 

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "StringLiteral"

    // $ANTLR start "EqualtyOp"
    public final void mEqualtyOp() throws RecognitionException {
        try {
            int _type = EqualtyOp;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:202:10: ( '=' | '!=' | '&lt;' | '&lt;=' | '&gt;' | '&gt;=' )
            int alt19=6;
            switch ( input.LA(1) ) {
            case '=':
                {
                alt19=1;
                }
                break;
            case '!':
                {
                alt19=2;
                }
                break;
            case '&':
                {
                switch ( input.LA(2) ) {
                case 'l':
                    {
                    switch ( input.LA(3) ) {
                    case 't':
                        {
                        switch ( input.LA(4) ) {
                        case ';':
                            {
                            switch ( input.LA(5) ) {
                            case '=':
                                {
                                alt19=4;
                                }
                                break;
                            default:
                                alt19=3;
                            }

                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 19, 6, input);

                            throw nvae;

                        }

                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 19, 4, input);

                        throw nvae;

                    }

                    }
                    break;
                case 'g':
                    {
                    switch ( input.LA(3) ) {
                    case 't':
                        {
                        switch ( input.LA(4) ) {
                        case ';':
                            {
                            switch ( input.LA(5) ) {
                            case '=':
                                {
                                alt19=6;
                                }
                                break;
                            default:
                                alt19=5;
                            }

                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 19, 7, input);

                            throw nvae;

                        }

                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 19, 5, input);

                        throw nvae;

                    }

                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 19, 3, input);

                    throw nvae;

                }

                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;

            }

            switch (alt19) {
                case 1 :
                    // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:202:12: '='
                    {
                    match('='); 

                    }
                    break;
                case 2 :
                    // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:202:18: '!='
                    {
                    match("!="); 



                    }
                    break;
                case 3 :
                    // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:202:23: '&lt;'
                    {
                    match("&lt;"); 



                    }
                    break;
                case 4 :
                    // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:202:30: '&lt;='
                    {
                    match("&lt;="); 



                    }
                    break;
                case 5 :
                    // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:202:38: '&gt;'
                    {
                    match("&gt;"); 



                    }
                    break;
                case 6 :
                    // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:202:45: '&gt;='
                    {
                    match("&gt;="); 



                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "EqualtyOp"

    // $ANTLR start "VariableReference"
    public final void mVariableReference() throws RecognitionException {
        try {
            int _type = VariableReference;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:204:18: ( '$' Name )
            // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:204:20: '$' Name
            {
            match('$'); 

            mName(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "VariableReference"

    // $ANTLR start "Name"
    public final void mName() throws RecognitionException {
        try {
            int _type = Name;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:207:5: ( ( '\\u0024' | '\\u005f' | '\\u0041' .. '\\u005a' | '\\u0061' .. '\\u007a' | '\\u00c0' .. '\\u00d6' | '\\u00d8' .. '\\u00f6' | '\\u00f8' .. '\\u00ff' | '\\u0100' .. '\\u1fff' | '\\u3040' .. '\\u318f' | '\\u3300' .. '\\u337f' | '\\u3400' .. '\\u3d2d' | '\\u4e00' .. '\\u9fff' | '\\uf900' .. '\\ufaff' ) ( '\\u0024' | '\\u005f' | '\\u0041' .. '\\u005a' | '\\u0061' .. '\\u007a' | '\\u00c0' .. '\\u00d6' | '\\u00d8' .. '\\u00f6' | '\\u00f8' .. '\\u00ff' | '\\u0100' .. '\\u1fff' | '\\u3040' .. '\\u318f' | '\\u3300' .. '\\u337f' | '\\u3400' .. '\\u3d2d' | '\\u4e00' .. '\\u9fff' | '\\uf900' .. '\\ufaff' | '0' .. '9' | '.' | '-' )* )
            // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:208:5: ( '\\u0024' | '\\u005f' | '\\u0041' .. '\\u005a' | '\\u0061' .. '\\u007a' | '\\u00c0' .. '\\u00d6' | '\\u00d8' .. '\\u00f6' | '\\u00f8' .. '\\u00ff' | '\\u0100' .. '\\u1fff' | '\\u3040' .. '\\u318f' | '\\u3300' .. '\\u337f' | '\\u3400' .. '\\u3d2d' | '\\u4e00' .. '\\u9fff' | '\\uf900' .. '\\ufaff' ) ( '\\u0024' | '\\u005f' | '\\u0041' .. '\\u005a' | '\\u0061' .. '\\u007a' | '\\u00c0' .. '\\u00d6' | '\\u00d8' .. '\\u00f6' | '\\u00f8' .. '\\u00ff' | '\\u0100' .. '\\u1fff' | '\\u3040' .. '\\u318f' | '\\u3300' .. '\\u337f' | '\\u3400' .. '\\u3d2d' | '\\u4e00' .. '\\u9fff' | '\\uf900' .. '\\ufaff' | '0' .. '9' | '.' | '-' )*
            {
            if ( input.LA(1)=='$'||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z')||(input.LA(1) >= '\u00C0' && input.LA(1) <= '\u00D6')||(input.LA(1) >= '\u00D8' && input.LA(1) <= '\u00F6')||(input.LA(1) >= '\u00F8' && input.LA(1) <= '\u1FFF')||(input.LA(1) >= '\u3040' && input.LA(1) <= '\u318F')||(input.LA(1) >= '\u3300' && input.LA(1) <= '\u337F')||(input.LA(1) >= '\u3400' && input.LA(1) <= '\u3D2D')||(input.LA(1) >= '\u4E00' && input.LA(1) <= '\u9FFF')||(input.LA(1) >= '\uF900' && input.LA(1) <= '\uFAFF') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:209:69: ( '\\u0024' | '\\u005f' | '\\u0041' .. '\\u005a' | '\\u0061' .. '\\u007a' | '\\u00c0' .. '\\u00d6' | '\\u00d8' .. '\\u00f6' | '\\u00f8' .. '\\u00ff' | '\\u0100' .. '\\u1fff' | '\\u3040' .. '\\u318f' | '\\u3300' .. '\\u337f' | '\\u3400' .. '\\u3d2d' | '\\u4e00' .. '\\u9fff' | '\\uf900' .. '\\ufaff' | '0' .. '9' | '.' | '-' )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0=='$'||(LA20_0 >= '-' && LA20_0 <= '.')||(LA20_0 >= '0' && LA20_0 <= '9')||(LA20_0 >= 'A' && LA20_0 <= 'Z')||LA20_0=='_'||(LA20_0 >= 'a' && LA20_0 <= 'z')||(LA20_0 >= '\u00C0' && LA20_0 <= '\u00D6')||(LA20_0 >= '\u00D8' && LA20_0 <= '\u00F6')||(LA20_0 >= '\u00F8' && LA20_0 <= '\u1FFF')||(LA20_0 >= '\u3040' && LA20_0 <= '\u318F')||(LA20_0 >= '\u3300' && LA20_0 <= '\u337F')||(LA20_0 >= '\u3400' && LA20_0 <= '\u3D2D')||(LA20_0 >= '\u4E00' && LA20_0 <= '\u9FFF')||(LA20_0 >= '\uF900' && LA20_0 <= '\uFAFF')) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:
            	    {
            	    if ( input.LA(1)=='$'||(input.LA(1) >= '-' && input.LA(1) <= '.')||(input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z')||(input.LA(1) >= '\u00C0' && input.LA(1) <= '\u00D6')||(input.LA(1) >= '\u00D8' && input.LA(1) <= '\u00F6')||(input.LA(1) >= '\u00F8' && input.LA(1) <= '\u1FFF')||(input.LA(1) >= '\u3040' && input.LA(1) <= '\u318F')||(input.LA(1) >= '\u3300' && input.LA(1) <= '\u337F')||(input.LA(1) >= '\u3400' && input.LA(1) <= '\u3D2D')||(input.LA(1) >= '\u4E00' && input.LA(1) <= '\u9FFF')||(input.LA(1) >= '\uF900' && input.LA(1) <= '\uFAFF') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Name"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:213:3: ( ( ' ' | '\\t' | '\\u000C' ) )
            // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:213:5: ( ' ' | '\\t' | '\\u000C' )
            {
            if ( input.LA(1)=='\t'||input.LA(1)=='\f'||input.LA(1)==' ' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            skip();

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WS"

    public void mTokens() throws RecognitionException {
        // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:1:8: ( T__56 | T__57 | T__58 | SingleAxisStep | RecursiveAxisStep | AxisNameSeparator | AbbreviatedAxisSpecifier | Star | Colon | Comma | Pipe | SynapseSpecificBody | SynapseSpecific | LeftParenthesis | RightParenthesis | LeftSquareBracket | RightSquareBracket | And | Or | AxisName | ProcessingInstruction | NodeType | IntegerLiteral | DecimalLiteral | DoubleLiteral | StringLiteral | EqualtyOp | VariableReference | Name | WS )
        int alt21=30;
        alt21 = dfa21.predict(input);
        switch (alt21) {
            case 1 :
                // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:1:10: T__56
                {
                mT__56(); 


                }
                break;
            case 2 :
                // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:1:16: T__57
                {
                mT__57(); 


                }
                break;
            case 3 :
                // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:1:22: T__58
                {
                mT__58(); 


                }
                break;
            case 4 :
                // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:1:28: SingleAxisStep
                {
                mSingleAxisStep(); 


                }
                break;
            case 5 :
                // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:1:43: RecursiveAxisStep
                {
                mRecursiveAxisStep(); 


                }
                break;
            case 6 :
                // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:1:61: AxisNameSeparator
                {
                mAxisNameSeparator(); 


                }
                break;
            case 7 :
                // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:1:79: AbbreviatedAxisSpecifier
                {
                mAbbreviatedAxisSpecifier(); 


                }
                break;
            case 8 :
                // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:1:104: Star
                {
                mStar(); 


                }
                break;
            case 9 :
                // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:1:109: Colon
                {
                mColon(); 


                }
                break;
            case 10 :
                // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:1:115: Comma
                {
                mComma(); 


                }
                break;
            case 11 :
                // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:1:121: Pipe
                {
                mPipe(); 


                }
                break;
            case 12 :
                // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:1:126: SynapseSpecificBody
                {
                mSynapseSpecificBody(); 


                }
                break;
            case 13 :
                // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:1:146: SynapseSpecific
                {
                mSynapseSpecific(); 


                }
                break;
            case 14 :
                // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:1:162: LeftParenthesis
                {
                mLeftParenthesis(); 


                }
                break;
            case 15 :
                // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:1:178: RightParenthesis
                {
                mRightParenthesis(); 


                }
                break;
            case 16 :
                // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:1:195: LeftSquareBracket
                {
                mLeftSquareBracket(); 


                }
                break;
            case 17 :
                // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:1:213: RightSquareBracket
                {
                mRightSquareBracket(); 


                }
                break;
            case 18 :
                // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:1:232: And
                {
                mAnd(); 


                }
                break;
            case 19 :
                // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:1:236: Or
                {
                mOr(); 


                }
                break;
            case 20 :
                // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:1:239: AxisName
                {
                mAxisName(); 


                }
                break;
            case 21 :
                // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:1:248: ProcessingInstruction
                {
                mProcessingInstruction(); 


                }
                break;
            case 22 :
                // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:1:270: NodeType
                {
                mNodeType(); 


                }
                break;
            case 23 :
                // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:1:279: IntegerLiteral
                {
                mIntegerLiteral(); 


                }
                break;
            case 24 :
                // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:1:294: DecimalLiteral
                {
                mDecimalLiteral(); 


                }
                break;
            case 25 :
                // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:1:309: DoubleLiteral
                {
                mDoubleLiteral(); 


                }
                break;
            case 26 :
                // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:1:323: StringLiteral
                {
                mStringLiteral(); 


                }
                break;
            case 27 :
                // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:1:337: EqualtyOp
                {
                mEqualtyOp(); 


                }
                break;
            case 28 :
                // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:1:347: VariableReference
                {
                mVariableReference(); 


                }
                break;
            case 29 :
                // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:1:365: Name
                {
                mName(); 


                }
                break;
            case 30 :
                // org/apache/synapse/util/streaming_xpath/compiler/XPath1.g:1:370: WS
                {
                mWS(); 


                }
                break;

        }

    }


    protected DFA21 dfa21 = new DFA21(this);
    static final String DFA21_eotS =
        "\1\uffff\1\35\1\37\1\43\1\45\4\uffff\1\32\4\uffff\11\32\1\73\6\uffff"+
        "\1\74\1\uffff\1\74\5\uffff\10\100\2\32\1\112\12\32\2\uffff\1\74"+
        "\2\100\1\uffff\6\100\1\135\2\32\1\uffff\13\32\4\100\3\157\1\uffff"+
        "\7\32\1\167\3\32\1\173\1\167\1\174\1\100\1\157\1\100\1\uffff\2\32"+
        "\1\173\4\32\1\uffff\3\32\2\uffff\1\100\1\157\6\32\1\173\2\32\1\157"+
        "\2\32\1\167\5\32\1\173\7\32\1\173\1\32\3\173\2\32\1\173\34\32\1"+
        "\173\5\32\2\173\1\32\1\173\4\32\1\u00cc\1\uffff";
    static final String DFA21_eofS =
        "\u00cd\uffff";
    static final String DFA21_minS =
        "\1\11\2\56\1\57\1\72\4\uffff\1\44\4\uffff\1\156\1\162\1\150\1\145"+
        "\1\157\2\141\2\145\1\56\6\uffff\1\60\1\uffff\1\60\5\uffff\10\44"+
        "\1\143\1\164\1\44\1\151\1\155\1\163\1\154\1\155\1\144\1\162\1\145"+
        "\1\154\1\170\2\uffff\1\60\2\44\1\uffff\7\44\1\145\1\162\1\uffff"+
        "\1\154\1\155\1\143\1\154\3\145\2\143\1\146\1\164\7\44\1\uffff\1"+
        "\163\1\151\1\144\2\145\1\157\1\163\1\44\1\156\2\145\6\44\1\uffff"+
        "\1\164\1\142\1\44\2\156\1\167\1\160\1\uffff\1\164\1\144\1\163\2"+
        "\uffff\2\44\1\157\1\165\1\164\1\144\1\151\1\141\1\44\1\151\1\163"+
        "\1\44\1\162\1\164\1\44\1\141\1\156\1\143\1\156\1\151\1\44\1\145"+
        "\1\156\1\147\1\145\1\147\1\156\1\157\1\44\1\164\3\44\1\147\1\162"+
        "\1\44\2\163\2\55\1\157\3\151\1\163\1\162\2\142\1\156\1\145\1\55"+
        "\2\154\1\163\1\154\1\163\2\151\1\164\1\146\1\145\2\156\1\162\1\44"+
        "\1\154\2\147\1\165\1\146\2\44\1\143\1\44\1\164\1\151\1\157\1\156"+
        "\1\44\1\uffff";
    static final String DFA21_maxS =
        "\1\ufaff\1\71\1\145\1\57\1\72\4\uffff\1\ufaff\4\uffff\1\164\1\162"+
        "\1\157\1\145\2\157\1\162\3\145\6\uffff\1\145\1\uffff\1\145\5\uffff"+
        "\10\ufaff\1\144\1\164\1\ufaff\1\151\1\155\1\163\1\154\1\155\1\144"+
        "\1\162\1\157\1\154\1\170\2\uffff\1\145\2\ufaff\1\uffff\7\ufaff\1"+
        "\145\1\162\1\uffff\1\154\1\155\1\143\1\154\3\145\2\143\1\146\1\164"+
        "\7\ufaff\1\uffff\1\163\1\151\1\144\2\145\1\157\1\163\1\ufaff\1\156"+
        "\2\145\6\ufaff\1\uffff\1\164\1\142\1\ufaff\2\156\1\167\1\160\1\uffff"+
        "\1\164\1\144\1\163\2\uffff\2\ufaff\1\157\1\165\1\164\1\144\1\151"+
        "\1\141\1\ufaff\1\151\1\163\1\ufaff\1\162\1\164\1\ufaff\1\141\1\156"+
        "\1\143\1\156\1\151\1\ufaff\1\145\1\156\1\147\1\145\1\147\1\156\1"+
        "\157\1\ufaff\1\164\3\ufaff\1\147\1\162\1\ufaff\2\163\2\55\1\157"+
        "\3\151\1\163\1\162\2\142\1\156\1\145\1\55\2\154\1\163\1\154\1\163"+
        "\2\151\1\164\1\146\1\145\2\156\1\162\1\ufaff\1\154\2\147\1\165\1"+
        "\146\2\ufaff\1\143\1\ufaff\1\164\1\151\1\157\1\156\1\ufaff\1\uffff";
    static final String DFA21_acceptS =
        "\5\uffff\1\7\1\10\1\12\1\13\1\uffff\1\16\1\17\1\20\1\21\12\uffff"+
        "\1\32\1\33\1\35\1\36\1\2\1\1\1\uffff\1\3\1\uffff\1\31\1\5\1\4\1"+
        "\6\1\11\25\uffff\1\27\1\30\3\uffff\1\34\11\uffff\1\23\22\uffff\1"+
        "\22\21\uffff\1\15\7\uffff\1\26\3\uffff\1\24\1\14\117\uffff\1\25";
    static final String DFA21_specialS =
        "\u00cd\uffff}>";
    static final String[] DFA21_transitionS = {
            "\1\33\2\uffff\1\33\23\uffff\1\33\1\31\1\30\1\uffff\1\11\1\uffff"+
            "\1\31\1\30\1\12\1\13\1\6\1\uffff\1\7\1\uffff\1\1\1\3\1\27\1"+
            "\2\10\27\1\4\2\uffff\1\31\2\uffff\1\5\32\32\1\14\1\uffff\1\15"+
            "\1\uffff\1\32\1\uffff\1\16\1\32\1\20\1\21\1\32\1\22\7\32\1\23"+
            "\1\17\1\24\2\32\1\25\1\26\6\32\1\uffff\1\10\103\uffff\27\32"+
            "\1\uffff\37\32\1\uffff\u1f08\32\u1040\uffff\u0150\32\u0170\uffff"+
            "\u0080\32\u0080\uffff\u092e\32\u10d2\uffff\u5200\32\u5900\uffff"+
            "\u0200\32",
            "\1\34\1\uffff\12\36",
            "\1\40\1\uffff\12\27\13\uffff\1\41\37\uffff\1\41",
            "\1\42",
            "\1\44",
            "",
            "",
            "",
            "",
            "\1\55\34\uffff\32\55\4\uffff\1\55\1\uffff\1\51\1\46\1\52\2"+
            "\55\1\50\1\55\1\47\13\55\1\53\1\54\5\55\105\uffff\27\55\1\uffff"+
            "\37\55\1\uffff\u1f08\55\u1040\uffff\u0150\55\u0170\uffff\u0080"+
            "\55\u0080\uffff\u092e\55\u10d2\uffff\u5200\55\u5900\uffff\u0200"+
            "\55",
            "",
            "",
            "",
            "",
            "\1\56\5\uffff\1\57",
            "\1\60",
            "\1\61\6\uffff\1\62",
            "\1\63",
            "\1\64",
            "\1\65\15\uffff\1\66",
            "\1\67\20\uffff\1\70",
            "\1\71",
            "\1\72",
            "\1\40\1\uffff\12\27\13\uffff\1\41\37\uffff\1\41",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\36\13\uffff\1\41\37\uffff\1\41",
            "",
            "\12\75\13\uffff\1\41\37\uffff\1\41",
            "",
            "",
            "",
            "",
            "",
            "\1\77\10\uffff\2\77\1\uffff\12\77\7\uffff\32\77\4\uffff\1\77"+
            "\1\uffff\16\77\1\76\13\77\105\uffff\27\77\1\uffff\37\77\1\uffff"+
            "\u1f08\77\u1040\uffff\u0150\77\u0170\uffff\u0080\77\u0080\uffff"+
            "\u092e\77\u10d2\uffff\u5200\77\u5900\uffff\u0200\77",
            "\1\77\10\uffff\2\77\1\uffff\12\77\7\uffff\32\77\4\uffff\1\77"+
            "\1\uffff\4\77\1\101\25\77\105\uffff\27\77\1\uffff\37\77\1\uffff"+
            "\u1f08\77\u1040\uffff\u0150\77\u0170\uffff\u0080\77\u0080\uffff"+
            "\u092e\77\u10d2\uffff\u5200\77\u5900\uffff\u0200\77",
            "\1\77\10\uffff\2\77\1\uffff\12\77\7\uffff\32\77\4\uffff\1\77"+
            "\1\uffff\24\77\1\102\5\77\105\uffff\27\77\1\uffff\37\77\1\uffff"+
            "\u1f08\77\u1040\uffff\u0150\77\u0170\uffff\u0080\77\u0080\uffff"+
            "\u092e\77\u10d2\uffff\u5200\77\u5900\uffff\u0200\77",
            "\1\77\10\uffff\2\77\1\uffff\12\77\7\uffff\32\77\4\uffff\1\77"+
            "\1\uffff\27\77\1\103\2\77\105\uffff\27\77\1\uffff\37\77\1\uffff"+
            "\u1f08\77\u1040\uffff\u0150\77\u0170\uffff\u0080\77\u0080\uffff"+
            "\u092e\77\u10d2\uffff\u5200\77\u5900\uffff\u0200\77",
            "\1\77\10\uffff\2\77\1\uffff\12\77\7\uffff\32\77\4\uffff\1\77"+
            "\1\uffff\23\77\1\104\6\77\105\uffff\27\77\1\uffff\37\77\1\uffff"+
            "\u1f08\77\u1040\uffff\u0150\77\u0170\uffff\u0080\77\u0080\uffff"+
            "\u092e\77\u10d2\uffff\u5200\77\u5900\uffff\u0200\77",
            "\1\77\10\uffff\2\77\1\uffff\12\77\7\uffff\32\77\4\uffff\1\77"+
            "\1\uffff\21\77\1\105\10\77\105\uffff\27\77\1\uffff\37\77\1\uffff"+
            "\u1f08\77\u1040\uffff\u0150\77\u0170\uffff\u0080\77\u0080\uffff"+
            "\u092e\77\u10d2\uffff\u5200\77\u5900\uffff\u0200\77",
            "\1\77\10\uffff\2\77\1\uffff\12\77\7\uffff\32\77\4\uffff\1\77"+
            "\1\uffff\21\77\1\106\10\77\105\uffff\27\77\1\uffff\37\77\1\uffff"+
            "\u1f08\77\u1040\uffff\u0150\77\u0170\uffff\u0080\77\u0080\uffff"+
            "\u092e\77\u10d2\uffff\u5200\77\u5900\uffff\u0200\77",
            "\1\77\10\uffff\2\77\1\uffff\12\77\7\uffff\32\77\4\uffff\1\77"+
            "\1\uffff\32\77\105\uffff\27\77\1\uffff\37\77\1\uffff\u1f08\77"+
            "\u1040\uffff\u0150\77\u0170\uffff\u0080\77\u0080\uffff\u092e"+
            "\77\u10d2\uffff\u5200\77\u5900\uffff\u0200\77",
            "\1\110\1\107",
            "\1\111",
            "\1\32\10\uffff\2\32\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32"+
            "\1\uffff\32\32\105\uffff\27\32\1\uffff\37\32\1\uffff\u1f08\32"+
            "\u1040\uffff\u0150\32\u0170\uffff\u0080\32\u0080\uffff\u092e"+
            "\32\u10d2\uffff\u5200\32\u5900\uffff\u0200\32",
            "\1\113",
            "\1\114",
            "\1\115",
            "\1\116",
            "\1\117",
            "\1\120",
            "\1\121",
            "\1\122\11\uffff\1\123",
            "\1\124",
            "\1\125",
            "",
            "",
            "\12\75\13\uffff\1\41\37\uffff\1\41",
            "\1\77\10\uffff\2\77\1\uffff\12\77\7\uffff\32\77\4\uffff\1\77"+
            "\1\uffff\3\77\1\126\26\77\105\uffff\27\77\1\uffff\37\77\1\uffff"+
            "\u1f08\77\u1040\uffff\u0150\77\u0170\uffff\u0080\77\u0080\uffff"+
            "\u092e\77\u10d2\uffff\u5200\77\u5900\uffff\u0200\77",
            "\1\77\10\uffff\2\77\1\uffff\12\77\7\uffff\32\77\4\uffff\1\77"+
            "\1\uffff\32\77\105\uffff\27\77\1\uffff\37\77\1\uffff\u1f08\77"+
            "\u1040\uffff\u0150\77\u0170\uffff\u0080\77\u0080\uffff\u092e"+
            "\77\u10d2\uffff\u5200\77\u5900\uffff\u0200\77",
            "",
            "\1\77\10\uffff\2\77\1\uffff\12\77\7\uffff\32\77\4\uffff\1\77"+
            "\1\uffff\1\127\31\77\105\uffff\27\77\1\uffff\37\77\1\uffff\u1f08"+
            "\77\u1040\uffff\u0150\77\u0170\uffff\u0080\77\u0080\uffff\u092e"+
            "\77\u10d2\uffff\u5200\77\u5900\uffff\u0200\77",
            "\1\77\10\uffff\2\77\1\uffff\12\77\7\uffff\32\77\4\uffff\1\77"+
            "\1\uffff\15\77\1\130\14\77\105\uffff\27\77\1\uffff\37\77\1\uffff"+
            "\u1f08\77\u1040\uffff\u0150\77\u0170\uffff\u0080\77\u0080\uffff"+
            "\u092e\77\u10d2\uffff\u5200\77\u5900\uffff\u0200\77",
            "\1\77\10\uffff\2\77\1\uffff\12\77\7\uffff\32\77\4\uffff\1\77"+
            "\1\uffff\10\77\1\131\21\77\105\uffff\27\77\1\uffff\37\77\1\uffff"+
            "\u1f08\77\u1040\uffff\u0150\77\u0170\uffff\u0080\77\u0080\uffff"+
            "\u092e\77\u10d2\uffff\u5200\77\u5900\uffff\u0200\77",
            "\1\77\10\uffff\2\77\1\uffff\12\77\7\uffff\32\77\4\uffff\1\77"+
            "\1\uffff\27\77\1\132\2\77\105\uffff\27\77\1\uffff\37\77\1\uffff"+
            "\u1f08\77\u1040\uffff\u0150\77\u0170\uffff\u0080\77\u0080\uffff"+
            "\u092e\77\u10d2\uffff\u5200\77\u5900\uffff\u0200\77",
            "\1\77\10\uffff\2\77\1\uffff\12\77\7\uffff\32\77\4\uffff\1\77"+
            "\1\uffff\17\77\1\133\12\77\105\uffff\27\77\1\uffff\37\77\1\uffff"+
            "\u1f08\77\u1040\uffff\u0150\77\u0170\uffff\u0080\77\u0080\uffff"+
            "\u092e\77\u10d2\uffff\u5200\77\u5900\uffff\u0200\77",
            "\1\77\10\uffff\2\77\1\uffff\12\77\7\uffff\32\77\4\uffff\1\77"+
            "\1\uffff\13\77\1\134\16\77\105\uffff\27\77\1\uffff\37\77\1\uffff"+
            "\u1f08\77\u1040\uffff\u0150\77\u0170\uffff\u0080\77\u0080\uffff"+
            "\u092e\77\u10d2\uffff\u5200\77\u5900\uffff\u0200\77",
            "\1\32\10\uffff\2\32\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32"+
            "\1\uffff\32\32\105\uffff\27\32\1\uffff\37\32\1\uffff\u1f08\32"+
            "\u1040\uffff\u0150\32\u0170\uffff\u0080\32\u0080\uffff\u092e"+
            "\32\u10d2\uffff\u5200\32\u5900\uffff\u0200\32",
            "\1\136",
            "\1\137",
            "",
            "\1\140",
            "\1\141",
            "\1\142",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\147",
            "\1\150",
            "\1\151",
            "\1\152",
            "\1\77\10\uffff\2\77\1\uffff\12\77\7\uffff\32\77\4\uffff\1\77"+
            "\1\uffff\30\77\1\153\1\77\105\uffff\27\77\1\uffff\37\77\1\uffff"+
            "\u1f08\77\u1040\uffff\u0150\77\u0170\uffff\u0080\77\u0080\uffff"+
            "\u092e\77\u10d2\uffff\u5200\77\u5900\uffff\u0200\77",
            "\1\77\10\uffff\2\77\1\uffff\12\77\7\uffff\32\77\4\uffff\1\77"+
            "\1\uffff\3\77\1\154\26\77\105\uffff\27\77\1\uffff\37\77\1\uffff"+
            "\u1f08\77\u1040\uffff\u0150\77\u0170\uffff\u0080\77\u0080\uffff"+
            "\u092e\77\u10d2\uffff\u5200\77\u5900\uffff\u0200\77",
            "\1\77\10\uffff\2\77\1\uffff\12\77\7\uffff\32\77\4\uffff\1\77"+
            "\1\uffff\2\77\1\155\27\77\105\uffff\27\77\1\uffff\37\77\1\uffff"+
            "\u1f08\77\u1040\uffff\u0150\77\u0170\uffff\u0080\77\u0080\uffff"+
            "\u092e\77\u10d2\uffff\u5200\77\u5900\uffff\u0200\77",
            "\1\77\10\uffff\2\77\1\uffff\12\77\7\uffff\32\77\4\uffff\1\77"+
            "\1\uffff\22\77\1\156\7\77\105\uffff\27\77\1\uffff\37\77\1\uffff"+
            "\u1f08\77\u1040\uffff\u0150\77\u0170\uffff\u0080\77\u0080\uffff"+
            "\u092e\77\u10d2\uffff\u5200\77\u5900\uffff\u0200\77",
            "\1\77\10\uffff\2\77\1\uffff\12\77\7\uffff\32\77\4\uffff\1\77"+
            "\1\uffff\32\77\105\uffff\27\77\1\uffff\37\77\1\uffff\u1f08\77"+
            "\u1040\uffff\u0150\77\u0170\uffff\u0080\77\u0080\uffff\u092e"+
            "\77\u10d2\uffff\u5200\77\u5900\uffff\u0200\77",
            "\1\77\10\uffff\2\77\1\uffff\12\77\7\uffff\32\77\4\uffff\1\77"+
            "\1\uffff\32\77\105\uffff\27\77\1\uffff\37\77\1\uffff\u1f08\77"+
            "\u1040\uffff\u0150\77\u0170\uffff\u0080\77\u0080\uffff\u092e"+
            "\77\u10d2\uffff\u5200\77\u5900\uffff\u0200\77",
            "\1\77\10\uffff\2\77\1\uffff\12\77\7\uffff\32\77\4\uffff\1\77"+
            "\1\uffff\32\77\105\uffff\27\77\1\uffff\37\77\1\uffff\u1f08\77"+
            "\u1040\uffff\u0150\77\u0170\uffff\u0080\77\u0080\uffff\u092e"+
            "\77\u10d2\uffff\u5200\77\u5900\uffff\u0200\77",
            "",
            "\1\160",
            "\1\161",
            "\1\162",
            "\1\163",
            "\1\164",
            "\1\165",
            "\1\166",
            "\1\32\10\uffff\2\32\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32"+
            "\1\uffff\32\32\105\uffff\27\32\1\uffff\37\32\1\uffff\u1f08\32"+
            "\u1040\uffff\u0150\32\u0170\uffff\u0080\32\u0080\uffff\u092e"+
            "\32\u10d2\uffff\u5200\32\u5900\uffff\u0200\32",
            "\1\170",
            "\1\171",
            "\1\172",
            "\1\32\10\uffff\2\32\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32"+
            "\1\uffff\32\32\105\uffff\27\32\1\uffff\37\32\1\uffff\u1f08\32"+
            "\u1040\uffff\u0150\32\u0170\uffff\u0080\32\u0080\uffff\u092e"+
            "\32\u10d2\uffff\u5200\32\u5900\uffff\u0200\32",
            "\1\32\10\uffff\2\32\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32"+
            "\1\uffff\32\32\105\uffff\27\32\1\uffff\37\32\1\uffff\u1f08\32"+
            "\u1040\uffff\u0150\32\u0170\uffff\u0080\32\u0080\uffff\u092e"+
            "\32\u10d2\uffff\u5200\32\u5900\uffff\u0200\32",
            "\1\77\10\uffff\2\77\1\uffff\12\77\7\uffff\32\77\4\uffff\1\77"+
            "\1\uffff\32\77\105\uffff\27\77\1\uffff\37\77\1\uffff\u1f08\77"+
            "\u1040\uffff\u0150\77\u0170\uffff\u0080\77\u0080\uffff\u092e"+
            "\77\u10d2\uffff\u5200\77\u5900\uffff\u0200\77",
            "\1\77\10\uffff\2\77\1\uffff\12\77\7\uffff\32\77\4\uffff\1\77"+
            "\1\uffff\4\77\1\175\25\77\105\uffff\27\77\1\uffff\37\77\1\uffff"+
            "\u1f08\77\u1040\uffff\u0150\77\u0170\uffff\u0080\77\u0080\uffff"+
            "\u092e\77\u10d2\uffff\u5200\77\u5900\uffff\u0200\77",
            "\1\77\10\uffff\2\77\1\uffff\12\77\7\uffff\32\77\4\uffff\1\77"+
            "\1\uffff\32\77\105\uffff\27\77\1\uffff\37\77\1\uffff\u1f08\77"+
            "\u1040\uffff\u0150\77\u0170\uffff\u0080\77\u0080\uffff\u092e"+
            "\77\u10d2\uffff\u5200\77\u5900\uffff\u0200\77",
            "\1\77\10\uffff\2\77\1\uffff\2\77\1\176\7\77\7\uffff\32\77\4"+
            "\uffff\1\77\1\uffff\32\77\105\uffff\27\77\1\uffff\37\77\1\uffff"+
            "\u1f08\77\u1040\uffff\u0150\77\u0170\uffff\u0080\77\u0080\uffff"+
            "\u092e\77\u10d2\uffff\u5200\77\u5900\uffff\u0200\77",
            "",
            "\1\177",
            "\1\u0080",
            "\1\32\10\uffff\2\32\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32"+
            "\1\uffff\32\32\105\uffff\27\32\1\uffff\37\32\1\uffff\u1f08\32"+
            "\u1040\uffff\u0150\32\u0170\uffff\u0080\32\u0080\uffff\u092e"+
            "\32\u10d2\uffff\u5200\32\u5900\uffff\u0200\32",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "",
            "",
            "\1\77\10\uffff\2\77\1\uffff\12\77\7\uffff\32\77\4\uffff\1\77"+
            "\1\uffff\21\77\1\u0088\10\77\105\uffff\27\77\1\uffff\37\77\1"+
            "\uffff\u1f08\77\u1040\uffff\u0150\77\u0170\uffff\u0080\77\u0080"+
            "\uffff\u092e\77\u10d2\uffff\u5200\77\u5900\uffff\u0200\77",
            "\1\77\10\uffff\2\77\1\uffff\12\77\7\uffff\32\77\4\uffff\1\77"+
            "\1\uffff\32\77\105\uffff\27\77\1\uffff\37\77\1\uffff\u1f08\77"+
            "\u1040\uffff\u0150\77\u0170\uffff\u0080\77\u0080\uffff\u092e"+
            "\77\u10d2\uffff\u5200\77\u5900\uffff\u0200\77",
            "\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "\1\32\10\uffff\2\32\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32"+
            "\1\uffff\32\32\105\uffff\27\32\1\uffff\37\32\1\uffff\u1f08\32"+
            "\u1040\uffff\u0150\32\u0170\uffff\u0080\32\u0080\uffff\u092e"+
            "\32\u10d2\uffff\u5200\32\u5900\uffff\u0200\32",
            "\1\u008f",
            "\1\u0090",
            "\1\77\10\uffff\2\77\1\uffff\12\77\7\uffff\32\77\4\uffff\1\77"+
            "\1\uffff\32\77\105\uffff\27\77\1\uffff\37\77\1\uffff\u1f08\77"+
            "\u1040\uffff\u0150\77\u0170\uffff\u0080\77\u0080\uffff\u092e"+
            "\77\u10d2\uffff\u5200\77\u5900\uffff\u0200\77",
            "\1\u0091",
            "\1\u0092",
            "\1\32\10\uffff\2\32\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32"+
            "\1\uffff\32\32\105\uffff\27\32\1\uffff\37\32\1\uffff\u1f08\32"+
            "\u1040\uffff\u0150\32\u0170\uffff\u0080\32\u0080\uffff\u092e"+
            "\32\u10d2\uffff\u5200\32\u5900\uffff\u0200\32",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096",
            "\1\u0097",
            "\1\32\10\uffff\1\u0098\1\32\1\uffff\12\32\7\uffff\32\32\4\uffff"+
            "\1\32\1\uffff\32\32\105\uffff\27\32\1\uffff\37\32\1\uffff\u1f08"+
            "\32\u1040\uffff\u0150\32\u0170\uffff\u0080\32\u0080\uffff\u092e"+
            "\32\u10d2\uffff\u5200\32\u5900\uffff\u0200\32",
            "\1\u0099",
            "\1\u009a",
            "\1\u009b",
            "\1\u009c",
            "\1\u009d",
            "\1\u009e",
            "\1\u009f",
            "\1\32\10\uffff\2\32\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32"+
            "\1\uffff\32\32\105\uffff\27\32\1\uffff\37\32\1\uffff\u1f08\32"+
            "\u1040\uffff\u0150\32\u0170\uffff\u0080\32\u0080\uffff\u092e"+
            "\32\u10d2\uffff\u5200\32\u5900\uffff\u0200\32",
            "\1\u00a0",
            "\1\32\10\uffff\1\u00a1\1\32\1\uffff\12\32\7\uffff\32\32\4\uffff"+
            "\1\32\1\uffff\32\32\105\uffff\27\32\1\uffff\37\32\1\uffff\u1f08"+
            "\32\u1040\uffff\u0150\32\u0170\uffff\u0080\32\u0080\uffff\u092e"+
            "\32\u10d2\uffff\u5200\32\u5900\uffff\u0200\32",
            "\1\32\10\uffff\2\32\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32"+
            "\1\uffff\32\32\105\uffff\27\32\1\uffff\37\32\1\uffff\u1f08\32"+
            "\u1040\uffff\u0150\32\u0170\uffff\u0080\32\u0080\uffff\u092e"+
            "\32\u10d2\uffff\u5200\32\u5900\uffff\u0200\32",
            "\1\32\10\uffff\1\u00a2\1\32\1\uffff\12\32\7\uffff\32\32\4\uffff"+
            "\1\32\1\uffff\32\32\105\uffff\27\32\1\uffff\37\32\1\uffff\u1f08"+
            "\32\u1040\uffff\u0150\32\u0170\uffff\u0080\32\u0080\uffff\u092e"+
            "\32\u10d2\uffff\u5200\32\u5900\uffff\u0200\32",
            "\1\u00a3",
            "\1\u00a4",
            "\1\32\10\uffff\1\u00a5\1\32\1\uffff\12\32\7\uffff\32\32\4\uffff"+
            "\1\32\1\uffff\32\32\105\uffff\27\32\1\uffff\37\32\1\uffff\u1f08"+
            "\32\u1040\uffff\u0150\32\u0170\uffff\u0080\32\u0080\uffff\u092e"+
            "\32\u10d2\uffff\u5200\32\u5900\uffff\u0200\32",
            "\1\u00a6",
            "\1\u00a7",
            "\1\u00a8",
            "\1\u00a9",
            "\1\u00aa",
            "\1\u00ab",
            "\1\u00ac",
            "\1\u00ad",
            "\1\u00ae",
            "\1\u00af",
            "\1\u00b0",
            "\1\u00b1",
            "\1\u00b2",
            "\1\u00b3",
            "\1\u00b4",
            "\1\u00b5",
            "\1\u00b6",
            "\1\u00b7",
            "\1\u00b8",
            "\1\u00b9",
            "\1\u00ba",
            "\1\u00bb",
            "\1\u00bc",
            "\1\u00bd",
            "\1\u00be",
            "\1\u00bf",
            "\1\u00c0",
            "\1\u00c1",
            "\1\32\10\uffff\2\32\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32"+
            "\1\uffff\32\32\105\uffff\27\32\1\uffff\37\32\1\uffff\u1f08\32"+
            "\u1040\uffff\u0150\32\u0170\uffff\u0080\32\u0080\uffff\u092e"+
            "\32\u10d2\uffff\u5200\32\u5900\uffff\u0200\32",
            "\1\u00c2",
            "\1\u00c3",
            "\1\u00c4",
            "\1\u00c5",
            "\1\u00c6",
            "\1\32\10\uffff\2\32\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32"+
            "\1\uffff\32\32\105\uffff\27\32\1\uffff\37\32\1\uffff\u1f08\32"+
            "\u1040\uffff\u0150\32\u0170\uffff\u0080\32\u0080\uffff\u092e"+
            "\32\u10d2\uffff\u5200\32\u5900\uffff\u0200\32",
            "\1\32\10\uffff\2\32\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32"+
            "\1\uffff\32\32\105\uffff\27\32\1\uffff\37\32\1\uffff\u1f08\32"+
            "\u1040\uffff\u0150\32\u0170\uffff\u0080\32\u0080\uffff\u092e"+
            "\32\u10d2\uffff\u5200\32\u5900\uffff\u0200\32",
            "\1\u00c7",
            "\1\32\10\uffff\2\32\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32"+
            "\1\uffff\32\32\105\uffff\27\32\1\uffff\37\32\1\uffff\u1f08\32"+
            "\u1040\uffff\u0150\32\u0170\uffff\u0080\32\u0080\uffff\u092e"+
            "\32\u10d2\uffff\u5200\32\u5900\uffff\u0200\32",
            "\1\u00c8",
            "\1\u00c9",
            "\1\u00ca",
            "\1\u00cb",
            "\1\32\10\uffff\2\32\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32"+
            "\1\uffff\32\32\105\uffff\27\32\1\uffff\37\32\1\uffff\u1f08\32"+
            "\u1040\uffff\u0150\32\u0170\uffff\u0080\32\u0080\uffff\u092e"+
            "\32\u10d2\uffff\u5200\32\u5900\uffff\u0200\32",
            ""
    };

    static final short[] DFA21_eot = DFA.unpackEncodedString(DFA21_eotS);
    static final short[] DFA21_eof = DFA.unpackEncodedString(DFA21_eofS);
    static final char[] DFA21_min = DFA.unpackEncodedStringToUnsignedChars(DFA21_minS);
    static final char[] DFA21_max = DFA.unpackEncodedStringToUnsignedChars(DFA21_maxS);
    static final short[] DFA21_accept = DFA.unpackEncodedString(DFA21_acceptS);
    static final short[] DFA21_special = DFA.unpackEncodedString(DFA21_specialS);
    static final short[][] DFA21_transition;

    static {
        int numStates = DFA21_transitionS.length;
        DFA21_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA21_transition[i] = DFA.unpackEncodedString(DFA21_transitionS[i]);
        }
    }

    class DFA21 extends DFA {

        public DFA21(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 21;
            this.eot = DFA21_eot;
            this.eof = DFA21_eof;
            this.min = DFA21_min;
            this.max = DFA21_max;
            this.accept = DFA21_accept;
            this.special = DFA21_special;
            this.transition = DFA21_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__56 | T__57 | T__58 | SingleAxisStep | RecursiveAxisStep | AxisNameSeparator | AbbreviatedAxisSpecifier | Star | Colon | Comma | Pipe | SynapseSpecificBody | SynapseSpecific | LeftParenthesis | RightParenthesis | LeftSquareBracket | RightSquareBracket | And | Or | AxisName | ProcessingInstruction | NodeType | IntegerLiteral | DecimalLiteral | DoubleLiteral | StringLiteral | EqualtyOp | VariableReference | Name | WS );";
        }
    }
 

}