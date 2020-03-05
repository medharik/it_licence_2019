package s2;

public class Decalar_asctuces {

	public static void main(String[] args) {
		int age=10+2;
		String prenom="ali "+age;
		String nom =" alami ";
		String a="90"+"10";
		String ecole =20+"";//donne "20" et non ps 20
		String nomComplet=prenom+nom;//concatenation
		System.out.println("vous etes : "+nomComplet);
		System.out.println(" a est "+a);
		boolean majeur = age>21;
		if (majeur) {
			System.out.println("Majeur");
		}else {
			System.out.println("Mineur");
		}
	}
}
