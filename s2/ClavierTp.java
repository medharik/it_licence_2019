package s2;

import java.util.Scanner;

public class ClavierTp {
	public static void main(String[] args) {

		Scanner	 clavier=new Scanner(System.in);

		System.out.println("entrer votre age : ");
		int age =clavier.nextInt();
		System.out.println(" Vous avez "+age+" ans ");
		
	System.out.println("entrer votre taille en m  : ");
	double taille=clavier.nextDouble();
	System.out.println(" la taille est "+taille+" m");
		System.out.println("votre prenom :");
		String prenom=clavier.next();
		System.out.println(prenom+" a "+age+" ans");
		
	}
}
