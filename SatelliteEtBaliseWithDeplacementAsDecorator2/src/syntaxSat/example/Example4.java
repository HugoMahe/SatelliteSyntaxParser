package syntaxSat.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;

import syntaxSat.generated.SyntaxSatLexer;
import syntaxSat.generated.SyntaxSatParser;
import syntaxSat.visiting.SyntaxVisitor;



public class Example4 {
	
	public static void main(String[] args ) throws IOException {
		InputStream is = System.in;
		BufferedReader br = new BufferedReader(new InputStreamReader(is));
		String input = br.readLine();
		int line = 1; // track input expr line numbers
		SyntaxSatParser parser = new SyntaxSatParser(null);
		
		SyntaxVisitor visitor = new SyntaxVisitor();
		
		while (input != null) {
			CharStream stream = CharStreams.fromString(input); ;
			SyntaxSatLexer lexer = new SyntaxSatLexer(stream);
			lexer.setLine(line);
			lexer.setCharPositionInLine(0);
			TokenStream tokens = new CommonTokenStream(lexer);
			parser.setInputStream(tokens);
			
		}
	}
}
