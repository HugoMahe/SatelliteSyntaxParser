// Generated from SyntaxSat.g4 by ANTLR 4.9
package syntaxSat.generated;

// antlr exo3

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SyntaxSatParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SyntaxSatVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SyntaxSatParser#commandes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommandes(SyntaxSatParser.CommandesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SyntaxSatParser#commande}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommande(SyntaxSatParser.CommandeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SyntaxSatParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruction(SyntaxSatParser.InstructionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SyntaxSatParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(SyntaxSatParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code start}
	 * labeled alternative in {@link SyntaxSatParser#methode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(SyntaxSatParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stop}
	 * labeled alternative in {@link SyntaxSatParser#methode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStop(SyntaxSatParser.StopContext ctx);
	/**
	 * Visit a parse tree produced by {@link SyntaxSatParser#parametres}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametres(SyntaxSatParser.ParametresContext ctx);
	/**
	 * Visit a parse tree produced by {@link SyntaxSatParser#parametre}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametre(SyntaxSatParser.ParametreContext ctx);
	/**
	 * Visit a parse tree produced by {@link SyntaxSatParser#assignement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignement(SyntaxSatParser.AssignementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SyntaxSatParser#pG}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPG(SyntaxSatParser.PGContext ctx);
	/**
	 * Visit a parse tree produced by {@link SyntaxSatParser#pD}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPD(SyntaxSatParser.PDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code satellite}
	 * labeled alternative in {@link SyntaxSatParser#objet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSatellite(SyntaxSatParser.SatelliteContext ctx);
	/**
	 * Visit a parse tree produced by the {@code balise}
	 * labeled alternative in {@link SyntaxSatParser#objet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBalise(SyntaxSatParser.BaliseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code valeurEntier}
	 * labeled alternative in {@link SyntaxSatParser#valeur}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValeurEntier(SyntaxSatParser.ValeurEntierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code valeurChaine}
	 * labeled alternative in {@link SyntaxSatParser#valeur}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValeurChaine(SyntaxSatParser.ValeurChaineContext ctx);
}