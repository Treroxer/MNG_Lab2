// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class CalculatorParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INT=1, PLUS=2, MINUS=3, MULT=4, DIV=5, POW=6, SQRT=7, INTEGRAL=8, WS=9;
	public static final int
		RULE_expression = 0, RULE_multiplyingExpression = 1, RULE_poweringExpression = 2, 
		RULE_sqrtExpression = 3, RULE_integralExpression = 4;
	private static String[] makeRuleNames() {
		return new String[] {
			"expression", "multiplyingExpression", "poweringExpression", "sqrtExpression", 
			"integralExpression"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'+'", "'-'", "'*'", "'/'", "'^'", "'sqrt'", "'cal'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "INT", "PLUS", "MINUS", "MULT", "DIV", "POW", "SQRT", "INTEGRAL", 
			"WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "java-escape"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CalculatorParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public List<MultiplyingExpressionContext> multiplyingExpression() {
			return getRuleContexts(MultiplyingExpressionContext.class);
		}
		public MultiplyingExpressionContext multiplyingExpression(int i) {
			return getRuleContext(MultiplyingExpressionContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(CalculatorParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(CalculatorParser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(CalculatorParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(CalculatorParser.MINUS, i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(10);
			multiplyingExpression();
			setState(15);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				{
				setState(11);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(12);
				multiplyingExpression();
				}
				}
				setState(17);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MultiplyingExpressionContext extends ParserRuleContext {
		public List<PoweringExpressionContext> poweringExpression() {
			return getRuleContexts(PoweringExpressionContext.class);
		}
		public PoweringExpressionContext poweringExpression(int i) {
			return getRuleContext(PoweringExpressionContext.class,i);
		}
		public List<TerminalNode> MULT() { return getTokens(CalculatorParser.MULT); }
		public TerminalNode MULT(int i) {
			return getToken(CalculatorParser.MULT, i);
		}
		public List<TerminalNode> DIV() { return getTokens(CalculatorParser.DIV); }
		public TerminalNode DIV(int i) {
			return getToken(CalculatorParser.DIV, i);
		}
		public MultiplyingExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplyingExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterMultiplyingExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitMultiplyingExpression(this);
		}
	}

	public final MultiplyingExpressionContext multiplyingExpression() throws RecognitionException {
		MultiplyingExpressionContext _localctx = new MultiplyingExpressionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_multiplyingExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18);
			poweringExpression();
			setState(23);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MULT || _la==DIV) {
				{
				{
				setState(19);
				_la = _input.LA(1);
				if ( !(_la==MULT || _la==DIV) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(20);
				poweringExpression();
				}
				}
				setState(25);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PoweringExpressionContext extends ParserRuleContext {
		public SqrtExpressionContext sqrtExpression() {
			return getRuleContext(SqrtExpressionContext.class,0);
		}
		public IntegralExpressionContext integralExpression() {
			return getRuleContext(IntegralExpressionContext.class,0);
		}
		public List<TerminalNode> POW() { return getTokens(CalculatorParser.POW); }
		public TerminalNode POW(int i) {
			return getToken(CalculatorParser.POW, i);
		}
		public List<PoweringExpressionContext> poweringExpression() {
			return getRuleContexts(PoweringExpressionContext.class);
		}
		public PoweringExpressionContext poweringExpression(int i) {
			return getRuleContext(PoweringExpressionContext.class,i);
		}
		public PoweringExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_poweringExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterPoweringExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitPoweringExpression(this);
		}
	}

	public final PoweringExpressionContext poweringExpression() throws RecognitionException {
		PoweringExpressionContext _localctx = new PoweringExpressionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_poweringExpression);
		try {
			int _alt;
			setState(35);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SQRT:
				enterOuterAlt(_localctx, 1);
				{
				setState(26);
				sqrtExpression();
				}
				break;
			case INT:
			case MINUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(27);
				integralExpression();
				setState(32);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(28);
						match(POW);
						setState(29);
						poweringExpression();
						}
						} 
					}
					setState(34);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SqrtExpressionContext extends ParserRuleContext {
		public TerminalNode SQRT() { return getToken(CalculatorParser.SQRT, 0); }
		public TerminalNode INT() { return getToken(CalculatorParser.INT, 0); }
		public SqrtExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sqrtExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterSqrtExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitSqrtExpression(this);
		}
	}

	public final SqrtExpressionContext sqrtExpression() throws RecognitionException {
		SqrtExpressionContext _localctx = new SqrtExpressionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_sqrtExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			match(SQRT);
			setState(38);
			match(INT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IntegralExpressionContext extends ParserRuleContext {
		public TerminalNode MINUS() { return getToken(CalculatorParser.MINUS, 0); }
		public TerminalNode INT() { return getToken(CalculatorParser.INT, 0); }
		public IntegralExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integralExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterIntegralExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitIntegralExpression(this);
		}
	}

	public final IntegralExpressionContext integralExpression() throws RecognitionException {
		IntegralExpressionContext _localctx = new IntegralExpressionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_integralExpression);
		try {
			setState(43);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MINUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(40);
				match(MINUS);
				setState(41);
				match(INT);
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(42);
				match(INT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001\t.\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0005\u0000\u000e\b\u0000\n\u0000\f\u0000"+
		"\u0011\t\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001\u0016\b"+
		"\u0001\n\u0001\f\u0001\u0019\t\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0005\u0002\u001f\b\u0002\n\u0002\f\u0002\"\t\u0002\u0003"+
		"\u0002$\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0003\u0004,\b\u0004\u0001\u0004\u0000\u0000\u0005"+
		"\u0000\u0002\u0004\u0006\b\u0000\u0002\u0001\u0000\u0002\u0003\u0001\u0000"+
		"\u0004\u0005-\u0000\n\u0001\u0000\u0000\u0000\u0002\u0012\u0001\u0000"+
		"\u0000\u0000\u0004#\u0001\u0000\u0000\u0000\u0006%\u0001\u0000\u0000\u0000"+
		"\b+\u0001\u0000\u0000\u0000\n\u000f\u0003\u0002\u0001\u0000\u000b\f\u0007"+
		"\u0000\u0000\u0000\f\u000e\u0003\u0002\u0001\u0000\r\u000b\u0001\u0000"+
		"\u0000\u0000\u000e\u0011\u0001\u0000\u0000\u0000\u000f\r\u0001\u0000\u0000"+
		"\u0000\u000f\u0010\u0001\u0000\u0000\u0000\u0010\u0001\u0001\u0000\u0000"+
		"\u0000\u0011\u000f\u0001\u0000\u0000\u0000\u0012\u0017\u0003\u0004\u0002"+
		"\u0000\u0013\u0014\u0007\u0001\u0000\u0000\u0014\u0016\u0003\u0004\u0002"+
		"\u0000\u0015\u0013\u0001\u0000\u0000\u0000\u0016\u0019\u0001\u0000\u0000"+
		"\u0000\u0017\u0015\u0001\u0000\u0000\u0000\u0017\u0018\u0001\u0000\u0000"+
		"\u0000\u0018\u0003\u0001\u0000\u0000\u0000\u0019\u0017\u0001\u0000\u0000"+
		"\u0000\u001a$\u0003\u0006\u0003\u0000\u001b \u0003\b\u0004\u0000\u001c"+
		"\u001d\u0005\u0006\u0000\u0000\u001d\u001f\u0003\u0004\u0002\u0000\u001e"+
		"\u001c\u0001\u0000\u0000\u0000\u001f\"\u0001\u0000\u0000\u0000 \u001e"+
		"\u0001\u0000\u0000\u0000 !\u0001\u0000\u0000\u0000!$\u0001\u0000\u0000"+
		"\u0000\" \u0001\u0000\u0000\u0000#\u001a\u0001\u0000\u0000\u0000#\u001b"+
		"\u0001\u0000\u0000\u0000$\u0005\u0001\u0000\u0000\u0000%&\u0005\u0007"+
		"\u0000\u0000&\'\u0005\u0001\u0000\u0000\'\u0007\u0001\u0000\u0000\u0000"+
		"()\u0005\u0003\u0000\u0000),\u0005\u0001\u0000\u0000*,\u0005\u0001\u0000"+
		"\u0000+(\u0001\u0000\u0000\u0000+*\u0001\u0000\u0000\u0000,\t\u0001\u0000"+
		"\u0000\u0000\u0005\u000f\u0017 #+";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}