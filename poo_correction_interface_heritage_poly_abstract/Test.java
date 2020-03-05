package poo_correction_interface_heritage_poly_abstract;

import java.util.Date;

public class Test {

	public static void main(String[] args) {
FormationCourt fc=new FormationCourt("120", "Info", new Date(), 3, 500);
FormationLong fl=new FormationLong("111","Dev info", new Date(), "Licence", 2000, 12);
Equipements e=new Equipements("DATASHOW ",10000);
Formation f[]= {fc, fl};
for (int i = 0; i < f.length; i++) {
	f[i].afficher();
	System.out.println("le cout de cette formation est "+f[i].calculerCoutFormation());
}

System.out.println("############################");
Affichable a[]= {fc,fl,e};
for (int i = 0; i < a.length; i++) {
	a[i].afficher();
}

	}

}
