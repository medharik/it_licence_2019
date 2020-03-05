package s4;

import java.util.Scanner;

public class Correction_prix {
	public static void main(String[] args) {
		
		Scanner clavier =new Scanner(System.in);
		double prix=0;
		boolean valide=false;
		int nEssai=3;
		double somme=0;
		int n=0;
		do {
		System.out.println(" Entrer le nombre de produits ");
		 n =clavier.nextInt();
		 if(n<=0) {
			 System.out.println("Erreur , nombre incorrect");
		 }
		}while(n<=0);
		
	for (int i = 0; i <n; i++) {
		do {
			System.out.println("Entrer le prix numero "+(i+1));
			prix=clavier.nextDouble();
			valide=prix>0;
			if (!valide) {
				nEssai--;
				if(nEssai==0) {
					System.out.println("Arret  du programme ");
					return ;
				}
				System.out.println("Erreur , prix incorrect, il vous reste  "+nEssai +" essai(s) , veuiller reessayer ");
			}
			}while(!valide);
		nEssai=3;
		somme +=prix;
		
		
	}
	
	System.out.println(" la somme est "+somme+" dhs");
		
		
		
		
	}
}
