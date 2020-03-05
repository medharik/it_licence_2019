package s2;

import java.util.Scanner;

public class Conditions {
public static void main(String[] args) {
	
	
	Scanner clavier=new Scanner(System.in);
	System.out.println("entrer votre age : ");
	int age =clavier.nextInt();
	System.out.println("entrer votre taille  en metres: ");
	
	
	double taille =clavier.nextDouble();
	
	boolean accepete= age>20 && taille > 1.8; 
	
	if (accepete) {
		System.out.println("tu es accepete");
	} else {
		System.out.println("dsl , tu n'es pas accepte");
	}
	
	
}
}
