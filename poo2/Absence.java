package poo2;

public class Absence {
//Encapsulation : 
// un des principes de la POO
// role : protection des donnees 
//comment ? : declarer private des attibuts
//et de n'autriser leurs acces qye par des getters et des setters  	
 	String dateAbsence , matiere ;
private 	double nombreHeure;
	//personne (nom,salaire)
//setters et gets 
//ecriture
public void setNombreHeure(double nombreHeure) {
	if(nombreHeure >=0 ) {
		this.nombreHeure = nombreHeure;
	}else {
		System.out.println("Erreur , nombre d'heure incorrect");
	}
	
}

public String getDateAbsence() {
	return dateAbsence;
}

public void setDateAbsence(String dateAbsence) {
	this.dateAbsence = dateAbsence;
}

public String getMatiere() {
	return matiere;
}

public void setMatiere(String matiere) {
	this.matiere = matiere;
}

//lecture 
public double getNombreHeure() {
	return nombreHeure;
}

	 void afficher() {
		 System.out.println("------------------------------------");
		 System.out.println("Date : "+dateAbsence);
		 System.out.println("Nombre d'heure absence "+nombreHeure);
		 System.out.println("Matiere : "+matiere);
	}
}
