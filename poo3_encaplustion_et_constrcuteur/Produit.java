package poo3_encaplustion;

import javax.swing.JOptionPane;

// Encapsulation  :
// un des principe de la POO
// role : protection des donnees 
//comment : 1- les masquer en les declarant private ,
//2- d'y acceder (lecture et ecriture ) par des methodes speciales : getter et setters 

//consutructeur : methode qui a pour role principle : initialiser les attribits 
public class Produit {
	//attribut : variable d'instance 
public  String libelle;
private double prix ,qtestock;
//constructeur qui initialise les attributs :


public double getPrix() {
	return prix;
}
public Produit(String libelle, double prix, double qtestock) {
	
	this.libelle = libelle;
	this.prix = prix;
	this.qtestock = qtestock;
}
public Produit(String libelle, double prix) {
	this.libelle=libelle;
	this.prix=prix;
}
//constructeur des defaut 
public Produit() {

}

public void setPrix(double prix) {
	if(prix >=0) {
		this.prix = prix;

	}else {
		System.out.println("prix incorrect");
	}
}
public double getQtestock() {
	return qtestock;
}
public void setQtestock(double qtestock) {
	if(qtestock>=0)
	this.qtestock = qtestock;
	else 
JOptionPane.showMessageDialog(null, "qte incorrecte");
}
//methode 
 void afficher() {
System.out.println(libelle +" coute "+prix+" dhs");
System.out.println("qte en stock est "+qtestock);
}
 double valeurStock() {
	 return prix*qtestock ;
			 
 }
 
}
