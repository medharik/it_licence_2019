package s5;

import java.util.Arrays;
import java.util.Scanner;

public class CorrectionNote {
public static void main(String[] args) {
	Scanner clavier=new Scanner(System.in);
	String nom[]= {"JAVA","VB","PHP"};
	double note[]=new double[nom.length];
	
	for (int i = 0; i < note.length; i++) {
		System.out.println("Entrer la note de "+nom[i]);
		note[i]=clavier.nextDouble();
		
	}
	
	double copieNote[]=new double[nom.length];
	for (int i = 0; i < copieNote.length; i++) {
		copieNote[i]=note[i];
	}
	
	Arrays.sort(copieNote);
	double min=copieNote[0], max=copieNote[nom.length-1];
	
	
	//trouver la position (i) du min
	int pmin=0,pmax=0;
	for (int i = 0; i < copieNote.length; i++) {
		
		if(min==note[i]) {
			pmin=i;
		}
		if(max==note[i]) {
			pmax=i;
		}
	}
	
	//les nom des matieres ayant note min et max \
	System.out.println("la matiere dont la note est min est "+nom[pmin]);
	System.out.println("la matiere dont la note est max est "+nom[pmax]);
	
	
	
	
}
}
