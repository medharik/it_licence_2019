package poo3_encaplustion;

public class Test {
public static void main(String[] args) {
	//
	Produit hp=new Produit("dell x 7, prix, qtestock",1200,10);
	hp.afficher();
	hp.setPrix(100);
	hp.setQtestock(-10);
	hp.afficher();
	System.out.println(" la valeur du stock est "+hp.valeurStock());
	
}
}
