package poo_correction_interface_heritage_poly_abstract;

import java.util.Date;

public abstract class Formation implements Affichable {
	
private String num , domaine ;
private Date dateFormation;

public String getNum() {
	return num;
}
public void setNum(String num) {
	this.num = num;
}
public String getDomaine() {
	return domaine;
}
public void setDomaine(String domaine) {
	this.domaine = domaine;
}
public Date getDateFormation() {
	return dateFormation;
}
public void setDateFormation(Date dateFormation) {
	this.dateFormation = dateFormation;
}
public Formation(String num, String domaine, Date dateFormation) {
	this.num = num;
	this.domaine = domaine;
	this.dateFormation = dateFormation;
}
public Formation() {
	
}

public abstract double calculerCoutFormation();

}
