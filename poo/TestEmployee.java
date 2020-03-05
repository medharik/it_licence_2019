package poo;

public class TestEmployee {

	public static void main(String[] args) {
		//instancier un objet de type Employee
		Employee ali=new Employee();
		ali.nom="ALAMI";
		ali.prenom="Ali";
		ali.salaire=5000;
		ali.departement="Informatique";
		
		ali.afficher();
		ali.augmenterSalaire(50);
		ali.afficher();
		ali.reduireSalaire(25);
		ali.afficher();
		
		ali.changerDepartement("Admin");
		ali.afficher();
		Employee rim=new Employee();
		rim.nom="Rima";
		rim.prenom="rim";
		rim.salaire=10000;
		rim.departement="informatique";
		
		Employee emp[]= {ali,rim};
		double somme =0;
		for (int i = 0; i < emp.length; i++) {
			somme +=emp[i].salaire;
		}
		System.out.println("La masse salariale est "+somme);
		
		
	}
	
}
