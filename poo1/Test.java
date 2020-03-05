package poo1;

import java.util.ArrayList;
import java.util.Date;

public class Test {
public static void main(String[] args) {
	
	// instanciation d'un objet hp et dell de type Produit (classe)
	Produit dell =new Produit() ;
	Produit hp =new Produit();
	//saisir les attributs de chaque objet
	dell.libelle="dell G8";
	dell.prix=9000;
	dell.qteStock=0;
	
	hp.libelle="hp dv 8";
	hp.prix=4000;
	hp.qteStock=10;
	//instancier un objet fact de type Facture
	Facture fact =new Facture();
	fact.numero="F0001";
	fact.dateFacturation=new Date(2019-1901, 12, 21);
	fact.listeProduit=new ArrayList<>();
	fact.ajouter(dell);
	fact.ajouter(hp);
	fact.afficher();
	System.out.println("le ttc est "+fact.calculerTtc()+" $ ");
	

}
}
