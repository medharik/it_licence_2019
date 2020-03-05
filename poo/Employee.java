package poo;

public class Employee {
//Employee(nom,prenom,salaire, departement )+(afficher, 
	//augmenterSalaire(taux),reduireSalaire(taux), changerDepartement(nouveauDepartement) )
//attributs 
	String nom,prenom , departement;
	double salaire;
	//les methodes
	void afficher(){
	System.out.println("Nom & Prenom : "+nom+" "+prenom);
	System.out.println("salaire est "+salaire);
	System.out.println("departement "+departement);
	
	}
	
void	augmenterSalaire(double taux){
		salaire *=(1+taux/100); 
		System.out.println(" le nouveau salaire de "+nom+" est "+salaire+" DHS");
	}
void	reduireSalaire(double taux){
	salaire *=(1-taux/100); 
	System.out.println(" le nouveau salaire de "+nom+" est "+salaire+" DHS");
}

void changerDepartement(String departement){
	this.departement=departement;
}
}
