package s2;

import java.util.Scanner;

public class Calcul {
 public static void main(String[] args) {
	 Scanner clv=new Scanner(System.in);
	System.out.println("Entrer la valeur de a " );
	int a=clv.nextInt();
	System.out.println("Entrer la valeur de b");
	int b=clv.nextInt();
	
	System.out.println("La somme est egal " +(a+b));
}
}
