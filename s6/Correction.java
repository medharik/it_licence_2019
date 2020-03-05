package s6;

import java.util.Scanner;

public class Correction {

	public static void main(String[] args) {
		
	String []listeNom=	saisirDesNomProduit();
	double []listePrix =	saisirDesPrixProduit(listeNom);
	int  []listeQte =	saisirDesQteProduit(listeNom);
	String reponse="";
		Scanner clavier =new Scanner(System.in);
	do {
		
		int choix=	afficherMenu();
		switch (choix) {
		case 1:
			double valeurStock=	calculerValeurStock(listePrix,listeQte);
			afficher(valeurStock);
			
		break;
		case 2:
			afficherProduitRuptureStock(listeNom,listeQte);
			
			break;

		default:
			
			break;
		}
		System.out.println("Tapez oui pour Continuer, non pour arreter ");
	reponse=clavier.next();
	} while (reponse.equals("oui"));
	System.out.println("fin du programme");
		
	}

	private static void afficherProduitRuptureStock(String[] listeNom, int[] listeQte) {

		for (int i = 0; i < listeQte.length; i++) {
	if (listeQte[i]==0) {
		System.out.println(listeNom[i]);
	}
	
}
		
	}

	private static int afficherMenu() {
	Scanner clavier =new Scanner(System.in);
		System.out.println("#########Menu###########");
		System.out.println("1- Valeur du stock");
		System.out.println("2- Produit en rupture du stock");
		int choix =clavier.nextInt();
		return choix;
	}

	private static void afficher(double valeurStock) {
		System.out.println("La valeur du stock est "+valeurStock+" DHS");
		
	}

	private static double calculerValeurStock(double[] listePrix, int[] listeQte) {
		double valeurStock=0;
		for (int i = 0; i < listeQte.length; i++) {
			valeurStock += listePrix[i]*listeQte[i];
		}
		return valeurStock;
	}

	private static int[] saisirDesQteProduit(String[] listeNom) {
		Scanner clavier=new Scanner(System.in);
		int qte[]=new int[listeNom.length];
	for (int i = 0; i < qte.length; i++) {
		System.out.println("Entrer la quantité en stock de "+listeNom[i]);
		qte[i]=clavier.nextInt();
	}
		return qte;
	}

	private static double[] saisirDesPrixProduit(String[] listeNom) {
	Scanner clavier=new Scanner(System.in);
		double prix[]=new double[listeNom.length];
	for (int i = 0; i < prix.length; i++) {
		System.out.println("Entrer le prix de "+listeNom[i]);
		prix[i]=clavier.nextDouble();
	}
		return prix;
	}

	private static String[] saisirDesNomProduit() {
		Scanner clavier=new Scanner(System.in);
		String []listeNom=new String[3];
		for (int i = 0; i <listeNom.length ; i++) {
			
			System.out.println("Entrer le nom du produit numero "+(i+1));
			listeNom[i]=clavier.next();
		}
		return listeNom;
	}
}
