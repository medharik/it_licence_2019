package poo_correction_interface_heritage_poly_abstract;

import java.util.Date;

public class FormationLong  extends Formation{
private String niveau;
private double tarifparmois, nombredemois;
public String getNiveau() {
	return niveau;
}
public void setNiveau(String niveau) {
	this.niveau = niveau;
}
public double getTarifparmois() {
	return tarifparmois;
}
public void setTarifparmois(double tarifparmois) {
	this.tarifparmois = tarifparmois;
}
public double getNombredemois() {
	return nombredemois;
}
public void setNombredemois(double nombredemois) {
	this.nombredemois = nombredemois;
}
public FormationLong(String num, String domaine, Date dateFormation, String niveau, double tarifparmois,
		double nombredemois) {
	super(num, domaine, dateFormation);
	this.niveau = niveau;
	this.tarifparmois = tarifparmois;
	this.nombredemois = nombredemois;
}
public FormationLong() {

}
@Override
public double calculerCoutFormation() {
	
	return tarifparmois * nombredemois;
}
@Override
public void afficher() {
	System.out.println("fl "+getDomaine()+" "+getNiveau());
	
}
@Override
public void imprimer() {
	// TODO Auto-generated method stub
	
}
}

