package s4;

public class Boucle {

	
	public static void main(String[] args) {
		
	
		for (int k = 0; k < 3; k++) {
			for (int i = 0, j=10; true; i++, j--) {
				System.out.println("A "+i);
			
				if(j%2 == 1)
					{
					break;
					}
				
				System.out.println("B "+j);		
				
				
				
				}
		}
		
			
			
		System.out.println("fin du programme");
		
		
	}
	
	
}
