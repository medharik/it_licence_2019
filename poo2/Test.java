package poo2;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		//creer des objets (instancier) d'etudiant
		Etudiant ali=new Etudiant();
		ali.nom="ALAMI";
		ali.prenom="Ali";
		ali.classe="LICENCE INF 1";
		ali.listeAbsence=new ArrayList<>();
		Absence a1=new Absence();
		a1.setNombreHeure(6);
		a1.dateAbsence="01/01/2020";
		a1.matiere="JAVA";
		
		a1.setNombreHeure(3);
		Absence a2=new Absence();
		a2.dateAbsence="02/01/2020";
		a2.matiere="PHP";
		a2.setNombreHeure(6);
		
		
		Absence a3=new Absence();
		a3.dateAbsence="02/02/2020";
		a3.matiere="PHP";
		a3.setNombreHeure(2);
		
		
		ali.ajouterAbsence(a1);
		ali.ajouterAbsence(a2);
		ali.ajouterAbsence(a3);
		//ali.supprimerAbsence(a1);
		
		ali.afficher();
		ali.afficherListeDesAbsence();
		double total=ali.getTotalAbsence();
		System.out.println("TOTAL : "+total+"H");
		ali.afficherListeDesAbsenceParMatiere("JAVA");
		System.out.println("Total absence en PHP "+ali.getTotalAbsence("PHP"));
	}
}
