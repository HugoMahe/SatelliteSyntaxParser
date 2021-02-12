package syntaxSat.metamodel;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Commandes {

	private ArrayList<Commande> commandes;
	
	public Commandes() {
		this.commandes = new ArrayList<Commande>();
	}
	
	public void addCommande(Commande cmd) {
		this.commandes.add(cmd);
	}
	
	public void addAllCommandes(List<Commande> cmds) {
		this.commandes.addAll(cmds);
	}
	
	public Iterator<Commande> commandesIterator(){
		return this.commandes.iterator();
	}
	
	public void accept(Visitor visitor) {
		visitor.visitCommandes(this);
	}
	
}
