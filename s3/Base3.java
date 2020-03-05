package s3;

import java.util.Scanner;

public class Base3 {
public static void main(String[] args) {
	Scanner clavier = new Scanner(System.in);
   
double moyenne=0;
	System.out.println("entrer la note numero 1 ");
	double note1=clavier.nextDouble();
	System.out.println("entrer la note numero 2 ");
	double note2=clavier.nextDouble();
	
	boolean valide=note1>=0 && note2>=0;
	if (valide) {
		 moyenne =(note1+note2)/2;
		System.out.println("La moyenne est "+moyenne);
	}
	
	
	else {
		System.out.println("veuillez saisir des notes valides");
	}
	
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
