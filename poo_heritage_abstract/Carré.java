package poo_heritage_abstract;

public class Carr� extends Forme {
 private int arret;
	
 public int getArret() {
	return arret;
}
 
 public void setArret(int arret) {
	this.arret = arret;
}
 public Carr�() {
	// TODO Auto-generated constructor stub
}

public Carr�(int x, int y, int arret) {
	super(x, y);
	this.arret = arret;
}

//redefinition 
@Override
	protected void afficher() {
		
		super.afficher();
		System.out.println("Arret est : "+arret);
		
	}
public double calculerSurface(){
	return arret*arret;
}
}
