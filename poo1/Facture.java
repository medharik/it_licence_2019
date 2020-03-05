package poo1;

import java.util.ArrayList;
import java.util.Date;



public class Facture {
	//attributs : numero , dateFacturation
	String numero;
	Date dateFacturation;
	ArrayList<Produit> listeProduit;
	// les methodes
	void afficher(){
		System.out.println("Facture numero "+numero+", Date facture : "+dateFacturation.toLocaleString());
	afficherListeProduit();
	}
	//Ajouter produit : 
	void ajouter(Produit p){
		if(p.exists())
		listeProduit.add(p);
	}

	//Ajouter produit : 
	void supprimer(Produit p){
		listeProduit.remove(p);
	}
	void afficherListeProduit() {
		for (int i = 0; i < listeProduit.size(); i++) {
		Produit p=	listeProduit.get(i);
		p.afficher();
		}
	}

 double calculerTtc(){
	 double ttc=0;
	 for (int i = 0; i < listeProduit.size(); i++) {
			Produit p=	listeProduit.get(i);
		ttc +=p.prix;
			}
	 return ttc;
 }
	
}
