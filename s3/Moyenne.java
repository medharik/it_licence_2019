package s3;

import java.util.Scanner;

public class Moyenne {
public static void main(String[] args) {
	Scanner clavier=new Scanner(System.in);
double somme=0;
	System.out.println("Entrer le nombre de note ");
	int  nombreNote=clavier.nextInt();
	if (nombreNote <=0) {
		System.out.println("valeur incorrecte");
		return;
	}
	boolean erreur=false;
	for (int i = 0; i < nombreNote; i++) {
		
		System.out.println("Entrer une note ");
		double note=clavier.nextDouble();
		boolean valide=note>=0 && note<=20;
		if (valide) {
			somme +=note;
		}else {
			erreur=true;
			
			System.out.println("Erreur , la note est incorrecte");
		
		}
		
		
	}//fin for
	System.out.println(erreur);
	if (erreur==true) {
	System.out.println("fin du programme");
	return ;
	}
	
	
	System.out.println(" la somme est "+ somme);
	double moyenne =somme/nombreNote;
	System.out.println(" la moyenne est "+moyenne);
	
	if (moyenne<8) {
		System.out.println("Echec");
	}else if(moyenne < 10) {
		System.out.println("Ratrappage");
	}else {
		System.out.println("Reussite");
	}
	
}
}
