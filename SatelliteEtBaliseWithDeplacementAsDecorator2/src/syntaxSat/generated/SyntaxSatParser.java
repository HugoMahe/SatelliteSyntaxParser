// Generated from SyntaxSat.g4 by ANTLR 4.9
package syntaxSat.generated;

// antlr exo3

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SyntaxSatParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		Variable=10, Entier=11, Chaine=12, WS=13;
	public static final int
		RULE_commandes = 0, RULE_commande = 1, RULE_instruction = 2, RULE_declaration = 3, 
		RULE_methode = 4, RULE_parametres = 5, RULE_parametre = 6, RULE_assignement = 7, 
		RULE_pG = 8, RULE_pD = 9, RULE_objet = 10, RULE_valeur = 11;
	private static String[] makeRuleNames() {
		return new String[] {
			"commandes", "commande", "instruction", "declaration", "methode", "parametres", 
			"parametre", "assignement", "pG", "pD", "objet", "valeur"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'new'", "'('", "');'", "'.start();'", "'.stop();'", "','", "'='", 
			"'Satellite'", "'Balise'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, "Variable", 
			"Entier", "Chaine", "WS"
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
	public String getGrammarFileName() { return "SyntaxSat.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SyntaxSatParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class CommandesContext extends ParserRuleContext {
		public List<CommandeContext> commande() {
			return getRuleContexts(CommandeContext.class);
		}
		public CommandeContext commande(int i) {
			return getRuleContext(CommandeContext.class,i);
		}
		public CommandesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commandes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SyntaxSatListener ) ((SyntaxSatListener)listener).enterCommandes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SyntaxSatListener ) ((SyntaxSatListener)listener).exitCommandes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SyntaxSatVisitor ) return ((SyntaxSatVisitor<? extends T>)visitor).visitCommandes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommandesContext commandes() throws RecognitionException {
		CommandesContext _localctx = new CommandesContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_commandes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(27);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Variable) {
				{
				{
				setState(24);
				commande();
				}
				}
				setState(29);
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

	public static class CommandeContext extends ParserRuleContext {
		public InstructionContext instruction() {
			return getRuleContext(InstructionContext.class,0);
		}
		public CommandeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commande; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SyntaxSatListener ) ((SyntaxSatListener)listener).enterCommande(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SyntaxSatListener ) ((SyntaxSatListener)listener).exitCommande(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SyntaxSatVisitor ) return ((SyntaxSatVisitor<? extends T>)visitor).visitCommande(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommandeContext commande() throws RecognitionException {
		CommandeContext _localctx = new CommandeContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_commande);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			instruction();
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

	public static class InstructionContext extends ParserRuleContext {
		public AssignementContext assignement() {
			return getRuleContext(AssignementContext.class,0);
		}
		public MethodeContext methode() {
			return getRuleContext(MethodeContext.class,0);
		}
		public InstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SyntaxSatListener ) ((SyntaxSatListener)listener).enterInstruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SyntaxSatListener ) ((SyntaxSatListener)listener).exitInstruction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SyntaxSatVisitor ) return ((SyntaxSatVisitor<? extends T>)visitor).visitInstruction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstructionContext instruction() throws RecognitionException {
		InstructionContext _localctx = new InstructionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_instruction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(32);
				assignement();
				}
				break;
			case 2:
				{
				setState(33);
				methode();
				}
				break;
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

	public static class DeclarationContext extends ParserRuleContext {
		public ObjetContext objet() {
			return getRuleContext(ObjetContext.class,0);
		}
		public ParametresContext parametres() {
			return getRuleContext(ParametresContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SyntaxSatListener ) ((SyntaxSatListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SyntaxSatListener ) ((SyntaxSatListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SyntaxSatVisitor ) return ((SyntaxSatVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			match(T__0);
			setState(37);
			objet();
			setState(38);
			match(T__1);
			setState(39);
			parametres();
			setState(40);
			match(T__2);
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

	public static class MethodeContext extends ParserRuleContext {
		public MethodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methode; }
	 
		public MethodeContext() { }
		public void copyFrom(MethodeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StopContext extends MethodeContext {
		public TerminalNode Variable() { return getToken(SyntaxSatParser.Variable, 0); }
		public StopContext(MethodeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SyntaxSatListener ) ((SyntaxSatListener)listener).enterStop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SyntaxSatListener ) ((SyntaxSatListener)listener).exitStop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SyntaxSatVisitor ) return ((SyntaxSatVisitor<? extends T>)visitor).visitStop(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StartContext extends MethodeContext {
		public TerminalNode Variable() { return getToken(SyntaxSatParser.Variable, 0); }
		public StartContext(MethodeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SyntaxSatListener ) ((SyntaxSatListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SyntaxSatListener ) ((SyntaxSatListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SyntaxSatVisitor ) return ((SyntaxSatVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodeContext methode() throws RecognitionException {
		MethodeContext _localctx = new MethodeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_methode);
		try {
			setState(46);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new StartContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(42);
				match(Variable);
				setState(43);
				match(T__3);
				}
				break;
			case 2:
				_localctx = new StopContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(44);
				match(Variable);
				setState(45);
				match(T__4);
				}
				break;
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

	public static class ParametresContext extends ParserRuleContext {
		public List<ParametreContext> parametre() {
			return getRuleContexts(ParametreContext.class);
		}
		public ParametreContext parametre(int i) {
			return getRuleContext(ParametreContext.class,i);
		}
		public ParametresContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametres; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SyntaxSatListener ) ((SyntaxSatListener)listener).enterParametres(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SyntaxSatListener ) ((SyntaxSatListener)listener).exitParametres(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SyntaxSatVisitor ) return ((SyntaxSatVisitor<? extends T>)visitor).visitParametres(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametresContext parametres() throws RecognitionException {
		ParametresContext _localctx = new ParametresContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_parametres);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case Variable:
			case Entier:
			case Chaine:
				{
				setState(53);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(48);
						parametre();
						setState(49);
						match(T__5);
						}
						} 
					}
					setState(55);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				}
				setState(56);
				parametre();
				}
				break;
			case T__2:
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class ParametreContext extends ParserRuleContext {
		public TerminalNode Variable() { return getToken(SyntaxSatParser.Variable, 0); }
		public ValeurContext valeur() {
			return getRuleContext(ValeurContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public ParametreContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametre; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SyntaxSatListener ) ((SyntaxSatListener)listener).enterParametre(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SyntaxSatListener ) ((SyntaxSatListener)listener).exitParametre(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SyntaxSatVisitor ) return ((SyntaxSatVisitor<? extends T>)visitor).visitParametre(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametreContext parametre() throws RecognitionException {
		ParametreContext _localctx = new ParametreContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_parametre);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Variable:
				{
				setState(60);
				match(Variable);
				}
				break;
			case Entier:
			case Chaine:
				{
				setState(61);
				valeur();
				}
				break;
			case T__0:
				{
				setState(62);
				declaration();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class AssignementContext extends ParserRuleContext {
		public PGContext pG() {
			return getRuleContext(PGContext.class,0);
		}
		public PDContext pD() {
			return getRuleContext(PDContext.class,0);
		}
		public AssignementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SyntaxSatListener ) ((SyntaxSatListener)listener).enterAssignement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SyntaxSatListener ) ((SyntaxSatListener)listener).exitAssignement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SyntaxSatVisitor ) return ((SyntaxSatVisitor<? extends T>)visitor).visitAssignement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignementContext assignement() throws RecognitionException {
		AssignementContext _localctx = new AssignementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_assignement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			pG();
			setState(66);
			match(T__6);
			setState(67);
			pD();
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

	public static class PGContext extends ParserRuleContext {
		public TerminalNode Variable() { return getToken(SyntaxSatParser.Variable, 0); }
		public PGContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pG; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SyntaxSatListener ) ((SyntaxSatListener)listener).enterPG(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SyntaxSatListener ) ((SyntaxSatListener)listener).exitPG(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SyntaxSatVisitor ) return ((SyntaxSatVisitor<? extends T>)visitor).visitPG(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PGContext pG() throws RecognitionException {
		PGContext _localctx = new PGContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_pG);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			match(Variable);
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

	public static class PDContext extends ParserRuleContext {
		public TerminalNode Variable() { return getToken(SyntaxSatParser.Variable, 0); }
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public ValeurContext valeur() {
			return getRuleContext(ValeurContext.class,0);
		}
		public PDContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pD; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SyntaxSatListener ) ((SyntaxSatListener)listener).enterPD(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SyntaxSatListener ) ((SyntaxSatListener)listener).exitPD(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SyntaxSatVisitor ) return ((SyntaxSatVisitor<? extends T>)visitor).visitPD(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PDContext pD() throws RecognitionException {
		PDContext _localctx = new PDContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_pD);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Variable:
				{
				setState(71);
				match(Variable);
				}
				break;
			case T__0:
				{
				setState(72);
				declaration();
				}
				break;
			case Entier:
			case Chaine:
				{
				setState(73);
				valeur();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class ObjetContext extends ParserRuleContext {
		public ObjetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objet; }
	 
		public ObjetContext() { }
		public void copyFrom(ObjetContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BaliseContext extends ObjetContext {
		public BaliseContext(ObjetContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SyntaxSatListener ) ((SyntaxSatListener)listener).enterBalise(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SyntaxSatListener ) ((SyntaxSatListener)listener).exitBalise(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SyntaxSatVisitor ) return ((SyntaxSatVisitor<? extends T>)visitor).visitBalise(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SatelliteContext extends ObjetContext {
		public SatelliteContext(ObjetContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SyntaxSatListener ) ((SyntaxSatListener)listener).enterSatellite(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SyntaxSatListener ) ((SyntaxSatListener)listener).exitSatellite(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SyntaxSatVisitor ) return ((SyntaxSatVisitor<? extends T>)visitor).visitSatellite(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjetContext objet() throws RecognitionException {
		ObjetContext _localctx = new ObjetContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_objet);
		try {
			setState(78);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
				_localctx = new SatelliteContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(76);
				match(T__7);
				}
				break;
			case T__8:
				_localctx = new BaliseContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(77);
				match(T__8);
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

	public static class ValeurContext extends ParserRuleContext {
		public ValeurContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valeur; }
	 
		public ValeurContext() { }
		public void copyFrom(ValeurContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ValeurEntierContext extends ValeurContext {
		public TerminalNode Entier() { return getToken(SyntaxSatParser.Entier, 0); }
		public ValeurEntierContext(ValeurContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SyntaxSatListener ) ((SyntaxSatListener)listener).enterValeurEntier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SyntaxSatListener ) ((SyntaxSatListener)listener).exitValeurEntier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SyntaxSatVisitor ) return ((SyntaxSatVisitor<? extends T>)visitor).visitValeurEntier(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ValeurChaineContext extends ValeurContext {
		public TerminalNode Chaine() { return getToken(SyntaxSatParser.Chaine, 0); }
		public ValeurChaineContext(ValeurContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SyntaxSatListener ) ((SyntaxSatListener)listener).enterValeurChaine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SyntaxSatListener ) ((SyntaxSatListener)listener).exitValeurChaine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SyntaxSatVisitor ) return ((SyntaxSatVisitor<? extends T>)visitor).visitValeurChaine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValeurContext valeur() throws RecognitionException {
		ValeurContext _localctx = new ValeurContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_valeur);
		try {
			setState(82);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Entier:
				_localctx = new ValeurEntierContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(80);
				match(Entier);
				}
				break;
			case Chaine:
				_localctx = new ValeurChaineContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(81);
				match(Chaine);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\17W\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\4\r\t\r\3\2\7\2\34\n\2\f\2\16\2\37\13\2\3\3\3\3\3\4\3\4\5\4%\n"+
		"\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\5\6\61\n\6\3\7\3\7\3\7\7\7"+
		"\66\n\7\f\7\16\79\13\7\3\7\3\7\5\7=\n\7\3\b\3\b\3\b\5\bB\n\b\3\t\3\t\3"+
		"\t\3\t\3\n\3\n\3\13\3\13\3\13\5\13M\n\13\3\f\3\f\5\fQ\n\f\3\r\3\r\5\r"+
		"U\n\r\3\r\2\2\16\2\4\6\b\n\f\16\20\22\24\26\30\2\2\2U\2\35\3\2\2\2\4 "+
		"\3\2\2\2\6$\3\2\2\2\b&\3\2\2\2\n\60\3\2\2\2\f<\3\2\2\2\16A\3\2\2\2\20"+
		"C\3\2\2\2\22G\3\2\2\2\24L\3\2\2\2\26P\3\2\2\2\30T\3\2\2\2\32\34\5\4\3"+
		"\2\33\32\3\2\2\2\34\37\3\2\2\2\35\33\3\2\2\2\35\36\3\2\2\2\36\3\3\2\2"+
		"\2\37\35\3\2\2\2 !\5\6\4\2!\5\3\2\2\2\"%\5\20\t\2#%\5\n\6\2$\"\3\2\2\2"+
		"$#\3\2\2\2%\7\3\2\2\2&\'\7\3\2\2\'(\5\26\f\2()\7\4\2\2)*\5\f\7\2*+\7\5"+
		"\2\2+\t\3\2\2\2,-\7\f\2\2-\61\7\6\2\2./\7\f\2\2/\61\7\7\2\2\60,\3\2\2"+
		"\2\60.\3\2\2\2\61\13\3\2\2\2\62\63\5\16\b\2\63\64\7\b\2\2\64\66\3\2\2"+
		"\2\65\62\3\2\2\2\669\3\2\2\2\67\65\3\2\2\2\678\3\2\2\28:\3\2\2\29\67\3"+
		"\2\2\2:=\5\16\b\2;=\3\2\2\2<\67\3\2\2\2<;\3\2\2\2=\r\3\2\2\2>B\7\f\2\2"+
		"?B\5\30\r\2@B\5\b\5\2A>\3\2\2\2A?\3\2\2\2A@\3\2\2\2B\17\3\2\2\2CD\5\22"+
		"\n\2DE\7\t\2\2EF\5\24\13\2F\21\3\2\2\2GH\7\f\2\2H\23\3\2\2\2IM\7\f\2\2"+
		"JM\5\b\5\2KM\5\30\r\2LI\3\2\2\2LJ\3\2\2\2LK\3\2\2\2M\25\3\2\2\2NQ\7\n"+
		"\2\2OQ\7\13\2\2PN\3\2\2\2PO\3\2\2\2Q\27\3\2\2\2RU\7\r\2\2SU\7\16\2\2T"+
		"R\3\2\2\2TS\3\2\2\2U\31\3\2\2\2\13\35$\60\67<ALPT";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}