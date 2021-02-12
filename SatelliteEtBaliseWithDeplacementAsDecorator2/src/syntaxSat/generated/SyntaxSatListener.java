// Generated from SyntaxSat.g4 by ANTLR 4.9
package syntaxSat.generated;

// antlr exo3

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SyntaxSatParser}.
 */
public interface SyntaxSatListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SyntaxSatParser#commandes}.
	 * @param ctx the parse tree
	 */
	void enterCommandes(SyntaxSatParser.CommandesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SyntaxSatParser#commandes}.
	 * @param ctx the parse tree
	 */
	void exitCommandes(SyntaxSatParser.CommandesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SyntaxSatParser#commande}.
	 * @param ctx the parse tree
	 */
	void enterCommande(SyntaxSatParser.CommandeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SyntaxSatParser#commande}.
	 * @param ctx the parse tree
	 */
	void exitCommande(SyntaxSatParser.CommandeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SyntaxSatParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterInstruction(SyntaxSatParser.InstructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SyntaxSatParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitInstruction(SyntaxSatParser.InstructionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SyntaxSatParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(SyntaxSatParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SyntaxSatParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(SyntaxSatParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code start}
	 * labeled alternative in {@link SyntaxSatParser#methode}.
	 * @param ctx the parse tree
	 */
	void enterStart(SyntaxSatParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by the {@code start}
	 * labeled alternative in {@link SyntaxSatParser#methode}.
	 * @param ctx the parse tree
	 */
	void exitStart(SyntaxSatParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stop}
	 * labeled alternative in {@link SyntaxSatParser#methode}.
	 * @param ctx the parse tree
	 */
	void enterStop(SyntaxSatParser.StopContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stop}
	 * labeled alternative in {@link SyntaxSatParser#methode}.
	 * @param ctx the parse tree
	 */
	void exitStop(SyntaxSatParser.StopContext ctx);
	/**
	 * Enter a parse tree produced by {@link SyntaxSatParser#parametres}.
	 * @param ctx the parse tree
	 */
	void enterParametres(SyntaxSatParser.ParametresContext ctx);
	/**
	 * Exit a parse tree produced by {@link SyntaxSatParser#parametres}.
	 * @param ctx the parse tree
	 */
	void exitParametres(SyntaxSatParser.ParametresContext ctx);
	/**
	 * Enter a parse tree produced by {@link SyntaxSatParser#parametre}.
	 * @param ctx the parse tree
	 */
	void enterParametre(SyntaxSatParser.ParametreContext ctx);
	/**
	 * Exit a parse tree produced by {@link SyntaxSatParser#parametre}.
	 * @param ctx the parse tree
	 */
	void exitParametre(SyntaxSatParser.ParametreContext ctx);
	/**
	 * Enter a parse tree produced by {@link SyntaxSatParser#assignement}.
	 * @param ctx the parse tree
	 */
	void enterAssignement(SyntaxSatParser.AssignementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SyntaxSatParser#assignement}.
	 * @param ctx the parse tree
	 */
	void exitAssignement(SyntaxSatParser.AssignementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SyntaxSatParser#pG}.
	 * @param ctx the parse tree
	 */
	void enterPG(SyntaxSatParser.PGContext ctx);
	/**
	 * Exit a parse tree produced by {@link SyntaxSatParser#pG}.
	 * @param ctx the parse tree
	 */
	void exitPG(SyntaxSatParser.PGContext ctx);
	/**
	 * Enter a parse tree produced by {@link SyntaxSatParser#pD}.
	 * @param ctx the parse tree
	 */
	void enterPD(SyntaxSatParser.PDContext ctx);
	/**
	 * Exit a parse tree produced by {@link SyntaxSatParser#pD}.
	 * @param ctx the parse tree
	 */
	void exitPD(SyntaxSatParser.PDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code satellite}
	 * labeled alternative in {@link SyntaxSatParser#objet}.
	 * @param ctx the parse tree
	 */
	void enterSatellite(SyntaxSatParser.SatelliteContext ctx);
	/**
	 * Exit a parse tree produced by the {@code satellite}
	 * labeled alternative in {@link SyntaxSatParser#objet}.
	 * @param ctx the parse tree
	 */
	void exitSatellite(SyntaxSatParser.SatelliteContext ctx);
	/**
	 * Enter a parse tree produced by the {@code balise}
	 * labeled alternative in {@link SyntaxSatParser#objet}.
	 * @param ctx the parse tree
	 */
	void enterBalise(SyntaxSatParser.BaliseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code balise}
	 * labeled alternative in {@link SyntaxSatParser#objet}.
	 * @param ctx the parse tree
	 */
	void exitBalise(SyntaxSatParser.BaliseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code valeurEntier}
	 * labeled alternative in {@link SyntaxSatParser#valeur}.
	 * @param ctx the parse tree
	 */
	void enterValeurEntier(SyntaxSatParser.ValeurEntierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code valeurEntier}
	 * labeled alternative in {@link SyntaxSatParser#valeur}.
	 * @param ctx the parse tree
	 */
	void exitValeurEntier(SyntaxSatParser.ValeurEntierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code valeurChaine}
	 * labeled alternative in {@link SyntaxSatParser#valeur}.
	 * @param ctx the parse tree
	 */
	void enterValeurChaine(SyntaxSatParser.ValeurChaineContext ctx);
	/**
	 * Exit a parse tree produced by the {@code valeurChaine}
	 * labeled alternative in {@link SyntaxSatParser#valeur}.
	 * @param ctx the parse tree
	 */
	void exitValeurChaine(SyntaxSatParser.ValeurChaineContext ctx);
}