package s4;

import java.util.Random;
import java.util.Scanner;

public class Boucle2 {
public static void main(String[] args) {
	
	Scanner clavier =new Scanner(System.in);
	
	Random r =new Random();
	int nombreScret=r.nextInt(10);
//	System.out.println(" le nombre secret est "+nombreScret);
	for (int i = 0; i < 3; i++) {
		 nombreScret=r.nextInt(10);
System.out.println("Jeu numero "+(i+1));
		boolean trouve=false;
		int nombre=0;
		int score=5;
		do {
			System.out.println("Deviner  le nombre secret ");
			nombre=clavier.nextInt();
			trouve=(nombre==nombreScret);
		if(!trouve)	{
			if(nombre>nombreScret) {
				System.out.println(" c'est plus grand");
			}else {
				System.out.println("c'est plus petit");
			}
			System.out.print("non , c'est faux , Re-");
			score--;
			if (score==0) break;
		}
		
		
		} while (!trouve );
		
		if (trouve) {
				System.out.println("Bravo , votre  score est de "+score+" / 5");

		} else {
				System.out.println("DSL , ... score =0");
		}
	/*	if (trouve) {
			System.out.println("Bravo");
		} else {
			System.out.println("DSL");

		}
	*/	
		
	}
}
}
