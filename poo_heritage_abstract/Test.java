package poo_heritage_abstract;

public class Test {
public static void main(String[] args) {
	
	Cercle c1 =new Cercle(1, 1, 2);
	Cercle c2 =new Cercle(4, 4, 10);
	Carr� cr1=new Carr�(2, 2, 10);	
	Carr� cr2=new Carr�(0, 0, 4);	
Carr� cr[]= {cr1,cr2};
Forme f[]= {c1,c2,cr1,cr2};	

for (int i = 0; i < f.length; i++) {
f[i].afficher();
System.out.println(" surface est "+f[i].calculerSurface());
}
//for (int i = 0; i < cr.length; i++) {
//	cr[i].afficher();
//	System.out.println(" surface est "+cr[i].calculerSurface());
//}
//for (int i = 0; i < ce.length; i++) {
//	ce[i].afficher();
//	System.out.println(" surface est "+ce[i].calculerSurface());
//}
}
}
