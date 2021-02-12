package syntaxSat.visiting;

import java.util.Iterator;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

import model.Balise;
import model.ElementMobile;
import model.Satelitte;
import simulation.Simulation;
import syntaxSat.generated.SyntaxSatBaseVisitor;
import syntaxSat.generated.SyntaxSatParser;
import syntaxSat.generated.SyntaxSatParser.*;
import syntaxSat.metamodel.*;
import java.util.ArrayList;
import java.util.HashMap;


public class SyntaxVisitor extends SyntaxSatBaseVisitor<Object> {
	HashMap<String, Object> listeVariable = new HashMap<String, Object>();
	ParseTreeProperty<Object> values = new ParseTreeProperty<Object>();

	// Constructor
	public SyntaxVisitor() {
		Simulation simulation = new Simulation();
		this.listeVariable.put("simulation", simulation);
	}
	
    public Object resultFor(ParserRuleContext ctx) {
        return values.get(ctx);
    }

	@Override public Object visitCommandes(SyntaxSatParser.CommandesContext ctx) {
		ParserRuleContext r = (ParserRuleContext) super.visitCommandes(ctx);
		Iterator<CommandeContext> itor = ctx.commande().iterator();
		ArrayList<Commande> commandes = new ArrayList<Commande>();
		while(itor.hasNext()) {
			commandes.add((Commande) values.get(itor.next()));
		}
		Commandes listeCommandes = new Commandes();
		listeCommandes.addAllCommandes(commandes);
		values.put(ctx, listeCommandes);
		return r; 	
	}

	@Override public Object visitCommande(SyntaxSatParser.CommandeContext ctx) {
		System.out.println("detection commande");
		ParserRuleContext r = (ParserRuleContext) super.visitCommande(ctx);
		Commande c = new Commande();
		values.put(ctx,c);
		return visitChildren(ctx);
		
	}

	@Override public Object visitInstruction(SyntaxSatParser.InstructionContext ctx) {
		System.out.println("instruction");
		ParserRuleContext r = (ParserRuleContext) super.visitInstruction(ctx);
		return r; 	
	}

	@Override public Object visitParametres(SyntaxSatParser.ParametresContext ctx) {
		ParserRuleContext r = (ParserRuleContext) super.visitParametres(ctx);
		if(ctx.parametre().size()!=0) {
			this.values.put(ctx, ctx.parametre());
		}
		return r; 	
	}

	@Override public Object visitParametre(SyntaxSatParser.ParametreContext ctx) {
		ParserRuleContext r = (ParserRuleContext) super.visitParametre(ctx);
		if(ctx.getText()!=null) {
			return r;
		}
		return null;
	}

	@Override public Object visitAssignement(SyntaxSatParser.AssignementContext ctx) 
	{ 
		ParserRuleContext r = (ParserRuleContext) super.visitAssignement(ctx);
		if(ctx.pG()!=null) {
			if(ctx.pD()!=null) {
				Assignement assignement = new Assignement();
				// On est dans le cas ou on assigne une variable avec une autre variable 
				if(ctx.pD().Variable()!=null) {
					Object objRetour = this.listeVariable.get(ctx.pD().getText());
					this.listeVariable.put(ctx.pG().getText(), objRetour);
					values.put(ctx, objRetour);
				}
				// Cette fois la partie de droite est une valeur
				if(ctx.pD().valeur()!=null) {
					this.listeVariable.put(ctx.pG().getText(), ctx.pD().getText());
					values.put(ctx, ctx.pD().getText());
				}
				if(ctx.pD().declaration()!=null) {
					Simulation sim = (Simulation) this.listeVariable.get("simulation");
					this.listeVariable.put(ctx.pG().getText(), this.values.get(ctx.pD().declaration().objet()));
					ElementMobile element = (ElementMobile)  this.values.get(ctx.pD().declaration().objet());
					if(element instanceof Balise) {
						sim.addBaliseSimplifie((Balise) element, ctx.pG().getText());
					}
					if(element instanceof Satelitte) {
						sim.addSatelliteSimplifie((Satelitte) element, ctx.pG().getText());
					}
					this.values.put(ctx, this.values.get(ctx.pD().declaration().objet()));
				}
			}
		}

		return r; 
	}
	
	@Override public Object visitDeclaration(SyntaxSatParser.DeclarationContext ctx) {
		ParserRuleContext r = (ParserRuleContext) super.visitDeclaration(ctx);
		int memorySize;
		if(ctx.objet()!=null) {
			if(ctx.parametres().parametre().size()!=0) {
				memorySize = Integer.parseInt(ctx.parametres().parametre().get(0).getText());
				ElementMobile element = (ElementMobile) this.values.get(ctx.objet());
				element.setMemorySize(memorySize);
			}
			values.put(ctx, ctx.objet());
		}
		return r; 	
	}
	
	@Override public Object visitStart(SyntaxSatParser.StartContext ctx) {
		ParserRuleContext r = (ParserRuleContext) super.visitStart(ctx);
		if(ctx.Variable()!=null) {
			Object element=  (Object) this.listeVariable.get(ctx.Variable().getText());
			if( element instanceof Simulation) {
				Simulation sim = (Simulation) element;
				sim.launchSyntax();
			}
			System.out.println(element);
		}
		return r;
	}

	
	@Override public Object visitStop(SyntaxSatParser.StopContext ctx) {
		System.out.println("VISITE STOP");
		ParserRuleContext r = (ParserRuleContext) super.visitStop(ctx);
		if(ctx.Variable()!=null) {
			ElementMobile element=  (ElementMobile) this.listeVariable.get(ctx.Variable().getText());
			System.out.println(element);
			
		}
		return r;
	}


	@Override public Object visitPG(SyntaxSatParser.PGContext ctx) { 
		ParserRuleContext r = (ParserRuleContext) super.visitPG(ctx);
		this.listeVariable.put(ctx.getText(), null);
		values.put(ctx, ctx.getText());
		return r; 	
	}
	
	@Override public Object visitPD(SyntaxSatParser.PDContext ctx) 
	{
		ParserRuleContext r = (ParserRuleContext) super.visitPD(ctx);
		values.put(ctx, r);
		return r; 
	}
	
	@Override public Object visitSatellite(SyntaxSatParser.SatelliteContext ctx) {
		ParserRuleContext r = (ParserRuleContext) super.visitSatellite(ctx);
		Satelitte sat = new Satelitte();
		values.put(ctx, sat);
		return r; 
	}

	
	@Override public Object visitBalise(SyntaxSatParser.BaliseContext ctx) {
		ParserRuleContext r = (ParserRuleContext) super.visitBalise(ctx);
		Balise bal = new Balise();
		values.put(ctx, bal);
		return r; 
	}

	
	@Override public Object visitValeurEntier(SyntaxSatParser.ValeurEntierContext ctx) {
		ParserRuleContext r = (ParserRuleContext) super.visitValeurEntier(ctx);
		Valeur v = new Valeur(ctx.getText());
		values.put(ctx, v);
		return r; 
	}
	
	@Override public Object visitValeurChaine(SyntaxSatParser.ValeurChaineContext ctx) {
		ParserRuleContext r = (ParserRuleContext) super.visitValeurChaine(ctx);
		Valeur v = new Valeur(ctx.getText());
		values.put(ctx, v);
		return r; 
	}
	
	
}
