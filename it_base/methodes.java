package it_base;

import java.util.Scanner;

public class methodes {

public static void main(String[] args) {
	
	int n=	demanderNombreProduit();
	double prix[]= saisirListePrix(n);
//	
	double ttc=calculTtc(prix);
//	
	afficher(ttc,"Euro");
	
	
}

private static void afficher(double ttc, String devise) {

	System.out.println(" le TTC est "+ttc+" "+devise);
}

private static double calculTtc(double[] prix) {
double ttc=0;
for (int i = 0; i < prix.length; i++) {
	ttc +=prix[i];
	
	
}
	
	return ttc;
}

private static double[] saisirListePrix(int n) {
double prix[]=new double[n];
Scanner clavier =new Scanner(System.in);

for (int i = 0; i < prix.length; i++) {
System.out.println("Entrer le prix numero "+(i+1));
prix[i]=clavier.nextDouble();
}
	
	return prix;
}

private static int demanderNombreProduit() {
Scanner clavier =new Scanner(System.in);
int n=0;
boolean valide=false;
do {
	
	System.out.println("Entrer le nombre de produits : ");
	 n=clavier.nextInt();
	valide= n>0;
	if(!valide) {
		System.out.println("Erreur, le nombre doit etre > 0");
	}
} while (!valide);

return n;
}
	
}
