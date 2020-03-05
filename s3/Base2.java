package s3;

import java.util.Scanner;

public class Base2 {
public static void main(String[] args) {
	Scanner clavier = new Scanner(System.in);
   
double moyenne=0, somme =0,note=0;
	System.out.println("entrer  note  1 ");
	 note=clavier.nextDouble();
boolean valide=note>=0 && note<=20;

if (valide) {
	somme+=note;
}else {
	System.out.println("note invalide");
}
		System.out.println("entrer  note 2  ");
		 note=clavier.nextDouble();//10
		 valide=note>=0 && note<=20;
		 if (valide) {
				somme+=note;
			}else {
				System.out.println("note invalide");
			}

	moyenne =somme/2;
	
	
	if(! valide)
	System.out.println("Note non valide");
	else if (moyenne<8) {
		System.out.println("Echec");
	}
	else if(moyenne <10) {//entre 8 et  10 8=<m<10
System.out.println("Ratrappage");
	}else {// >=10
		System.out.println("REUSSITE");
		double x=0;
	}
	
}
	
}
