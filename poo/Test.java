package poo;

public class Test {
public static void main(String[] args) {
	//instancier un objet hp de type Produit (classe)
	Produit hp = new Produit();

	hp.libelle="hp dv6";
	hp.prix = 1000;
	hp.qteStock=100;
	hp.afficher();
	hp.acheter(100);
	hp.afficher();
	hp.vendre(150);
	hp.afficher();
	hp.vendre(50);
	hp.afficher();
	hp.vendre(1);
	
//reduirePrix(tauxReduction)
	//prix *=(1-tauxReduction/100)
//augmeterPrix(tauxAugmentation)	
	
}
}
