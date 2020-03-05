package poo_correction_interface_heritage_poly_abstract;

import java.util.Date;

public class FormationCourt extends Formation{
private int nombreJour;
private int tarifParJour;



@Override
public double calculerCoutFormation() {
	
	return nombreJour * tarifParJour;
}



public int getNombreJour() {
	return nombreJour;
}



public FormationCourt(String num, String domaine, Date dateFormation, int nombreJour, int tarifParJour) {
	super(num, domaine, dateFormation);
	this.nombreJour = nombreJour;
	this.tarifParJour = tarifParJour;
}

public FormationCourt() {
	// TODO Auto-generated constructor stub
}

public void setNombreJour(int nombreJour) {
	this.nombreJour = nombreJour;
}



public int getTarifParJour() {
	return tarifParJour;
}



public void setTarifParJour(int tarifParJour) {
	this.tarifParJour = tarifParJour;
}



@Override
public void afficher() {
	System.out.println("fc "+getDomaine());
	
}



@Override
public void imprimer() {
	// TODO Auto-generated method stub
	
}




}
