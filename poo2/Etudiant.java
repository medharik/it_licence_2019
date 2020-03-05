package poo2;

import java.util.ArrayList;

public class Etudiant {
//les attributs
	String nom ,prenom, classe;
	ArrayList<Absence> listeAbsence;
	
//les methodes	
	 void afficher() {
		System.out.println(nom+" "+prenom);
		System.out.println(classe);
	}
	 //ajouter Absence 
	void  ajouterAbsence(Absence absence){
		listeAbsence.add(absence);
		 
	 }
	 //supprimer une absence 
	 void supprimerAbsence(Absence absence) {
		 listeAbsence.remove(absence);
	}
	 //liste des absences 
	 void afficherListeDesAbsence(){
		 System.out.println("liste  "+listeAbsence.size()+" absence(s)");
		 for (int i = 0; i < listeAbsence.size(); i++) {
			listeAbsence.get(i).afficher();
		}
		 
	 }
	 //liste des absences selon une matiere
	 
	 void afficherListeDesAbsenceParMatiere(String matiere){
		 System.out.println("liste  des absences dans la matiere "+matiere);
		 for (int i = 0; i < listeAbsence.size(); i++) {
		Absence a=listeAbsence.get(i);
			 if (a.matiere==matiere) {
			a.afficher();
		}
			
		}
		 
	 }
	 
	 //total absence par matiere
	 double getTotalAbsence(String matiere){
		 double total=0;
		 for (int i = 0; i < listeAbsence.size(); i++) {
			Absence chaqueAbsence=listeAbsence.get(i);
			if(chaqueAbsence.matiere==matiere) {
				total +=chaqueAbsence.getNombreHeure();
			}
		}
		 
		 return total;
	 }
	 //Total des absences 
	 double getTotalAbsence(){
		double total=0;
		 for (int i = 0; i < listeAbsence.size(); i++) {
			total+=listeAbsence.get(i).getNombreHeure();
		}
		 
		 return total;
	 }
	
	
	
	
}
