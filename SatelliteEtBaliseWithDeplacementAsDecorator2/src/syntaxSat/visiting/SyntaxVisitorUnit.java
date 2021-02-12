package syntaxSat.visiting;

import static org.junit.Assert.*;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.junit.Test;

import model.ElementMobile;
import syntaxSat.generated.SyntaxSatLexer;
import syntaxSat.generated.SyntaxSatParser;
import syntaxSat.metamodel.Assignement;
import syntaxSat.metamodel.Valeur;

public class SyntaxVisitorUnit {

	protected SyntaxSatParser parserFor(String input) {
		CharStream stream = CharStreams.fromString(input);
		TokenStream tokens = new CommonTokenStream(new SyntaxSatLexer(stream));
		SyntaxSatParser parser = new SyntaxSatParser(tokens);
		return parser;
	}
	
	// TEST VALEUR
	@Test
	public void testEntierValeur() {
		String r ="5";
		SyntaxSatParser parser = this.parserFor(r);
		ParseTree tree = parser.valeur();
		SyntaxVisitor vis = new SyntaxVisitor();
		vis.visit(tree);
		Valeur result = (Valeur) vis.resultFor((ParserRuleContext) tree);
		System.out.println(result.getValue().toString());
        assertTrue(r.equals(result.getValue().toString()));
	}
	
	@Test
	public void testChaineValeur() {
		String r ="\"abc\"";
		SyntaxSatParser parser = this.parserFor(r);
		ParseTree tree = parser.valeur();
		SyntaxVisitor vis = new SyntaxVisitor();
		vis.visit(tree);
		Valeur result = (Valeur) vis.resultFor((ParserRuleContext) tree);
        assertTrue(r.equals(result.getValue()));
		
	}
	
	@Test
	public void testAssignement() {
		String r="a=10";
		SyntaxSatParser parser = this.parserFor(r);
		ParseTree tree = parser.assignement();
		SyntaxVisitor vis = new SyntaxVisitor();
		vis.visit(tree);
		String result =  (String) vis.resultFor((ParserRuleContext) tree);
		assertTrue(result.equals("10"));
	}
	
	@Test 
	public void testAssignement2() {
		String r="a=10";
		SyntaxSatParser parser = this.parserFor(r);
		ParseTree tree = parser.assignement();
		SyntaxVisitor vis = new SyntaxVisitor();
		vis.visit(tree);
		String result = (String) vis.resultFor((ParserRuleContext) tree);
		assertTrue(result.equals("10"));
		String r2="b=a";
		parser = this.parserFor(r2);
		tree = parser.assignement();
		vis.visit(tree);
		String result2 = (String) vis.resultFor((ParserRuleContext) tree);
		assertTrue(result2.equals("10"));
	}
	
	@Test 
	public void testAssignementSatellite() {
		String r="c=new Satellite(555);";
		SyntaxSatParser parser = this.parserFor(r);
		ParseTree tree = parser.assignement();
		SyntaxVisitor vis = new SyntaxVisitor();
		vis.visit(tree);
		ElementMobile element = (ElementMobile) vis.resultFor((ParserRuleContext) tree);
		assertTrue(element instanceof ElementMobile);
		String r2="simulation.start();";
		parser = this.parserFor(r2);
		tree = parser.methode();
		vis.visit(tree);
		
	}
	
	@Test 
	public void testAssignementBalise() {
		String r="c=new Balise(555); b=new Satellite(200);";
		SyntaxSatParser parser = this.parserFor(r);
		ParseTree tree = parser.commandes();
		SyntaxVisitor vis = new SyntaxVisitor();
		vis.visit(tree);
		String r2="simulation.start();";
		parser = this.parserFor(r2);
		tree = parser.methode();
		vis.visit(tree);
	}
	
	@Test 
	public void testSimulation() {
		String r=" c=new Balise(255);";
		SyntaxSatParser parser = this.parserFor(r);
		ParseTree tree = parser.assignement();
		SyntaxVisitor vis = new SyntaxVisitor();
		vis.visit(tree);
		ElementMobile elem = (ElementMobile) vis.resultFor((ParserRuleContext) tree);
		assertTrue(elem instanceof ElementMobile);
		String r2=" a=new Satellite(255);";
		parser = this.parserFor(r2);
		tree = parser.assignement();
		vis = new SyntaxVisitor();
		vis.visit(tree);
		ElementMobile elem2 = (ElementMobile) vis.resultFor((ParserRuleContext) tree);
		assertTrue(elem2 instanceof ElementMobile);
		/*String r3="simulation.start();";
		parser = this.parserFor(r3);
		tree = parser.methode();
		vis.visit(tree);*/
	}
	
	@Test
	public void testStart() {
		String r="a=new Balise();";
		SyntaxSatParser parser = this.parserFor(r);
		ParseTree tree = parser.assignement();
		SyntaxVisitor vis = new SyntaxVisitor();
		vis.visit(tree);
		ElementMobile elem = (ElementMobile) vis.resultFor((ParserRuleContext) tree);
		assertTrue(elem instanceof ElementMobile);
		String r2="a.start();";
		parser = this.parserFor(r2);
		tree = parser.methode();
		vis.visit(tree);
	}
	
	
	@Test
	public void testStop() {
		String r="a=new Balise();";
		SyntaxSatParser parser = this.parserFor(r);
		ParseTree tree = parser.assignement();
		SyntaxVisitor vis = new SyntaxVisitor();
		vis.visit(tree);
		ElementMobile elem = (ElementMobile) vis.resultFor((ParserRuleContext) tree);
		assertTrue(elem instanceof ElementMobile);
		String r2="a.stop();";
		parser = this.parserFor(r2);
		tree = parser.methode();
		vis.visit(tree);
	}
	
	
	

}
