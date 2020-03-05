package it1_base;

public class Second {
 
	public static void main(String[] args) {
	//variable : zone memoire 
		
		//declaration : reserver cette zone memoire
	int age;
	age=10;
	
	//initalisation d'une variable
	int salaire=9000;
	salaire=10000;//affectation 
	double taille=2.3;
	//afficher la valeur d'une variable
	//par la concatenation
	System.out.println("age est : "+age+" ans");
		System.out.println("le salaire est de :"+salaire+ " DHS");
		salaire=8000;
		System.out.println("salaire = "+salaire);
		//#################################
		int a=1,b=2, t;
		System.out.println("AU DEBUT :  a est "+a+" b est "+b);
		//PERMUTATION
		t=a;
		a=b;
		b=t;
		System.out.println("A LA FIN : a est "+a+" b est "+b);
		
		
		
		
		
		
		
	}

}
