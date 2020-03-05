package s5;

import java.util.Arrays;
import java.util.Scanner;

public class Tableaux {
 public static void main(String[] args) {
	Scanner clavier =new Scanner(System.in);
	System.out.println("Entrer le nombre de produits : ");
	int np=clavier.nextInt();
	String []libelle=new String[np];
	double tprix[]=new double[np];
	//exemple de saisie des libelles 
	for (int i = 0; i < tprix.length; i++) {
		
		System.out.println("Entrer le libelle numero "+(i+1));
		libelle[i]=clavier.next();
		
	}
	//exemple saisie des prix 
	for (int i = 0; i < tprix.length; i++) {
	System.out.println("Entrer le prix de "+libelle[i]);	
	tprix[i]=clavier.nextDouble();
	}
	
	
	//calcul du tht
	double tht=0;
	for (int i = 0; i < tprix.length; i++) {
		tht +=tprix[i];
	}
			System.out.println(":LIBELLE     PRIX");

			
	for (int i = 0; i < tprix.length; i++) {
	System.out.println(libelle[i]+"     "+tprix[i]);
	}
	
	
	System.out.println("tht = "+tht);
	
	System.out.println("TRI DU TABLEAU");
//	double [] copiePrix=tprix;// tprix et copiePrix pointe vers le meme tableau
	
	double [] copiePrix=new double[tprix.length];
	//faire le clone
	for (int i = 0; i < copiePrix.length; i++) {
		copiePrix[i]=tprix[i];
	}
	Arrays.sort(copiePrix);
	for (int i = 0; i < tprix.length; i++) {
		System.out.println("prix "+(i)+" est "+tprix[i]);
	}
	System.out.println("listes prix copie");
	for (int i = 0; i < copiePrix.length; i++) {
		System.out.println("copie numero "+(i)+" est "+copiePrix[i]);
		
	}
	
	double max=copiePrix[copiePrix.length-1], min=copiePrix[0];
	System.out.println(" le prix max est "+max);
	System.out.println(" le prix min est "+min);
	int posMax=0, posMin=0;
	for (int i = 0; i < copiePrix.length; i++) {
		if (tprix[i]==min) {
			posMin=i;
		}
		if (tprix[i]==max) {
			posMax=i;
		}
	}
	
	System.out.println("libelle du produit le moins cher est "+libelle[posMin]);
	System.out.println("libelle du produit le plus cher est "+libelle[posMax]);
	
//	libelle : hp | sony | dell
//	tprix	 300 | 5000 |  600
//tprixTRIE  300| 600 | 5000
	 
}
	
}
