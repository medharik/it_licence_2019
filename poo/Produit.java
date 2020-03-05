package poo;

public class Produit {
//attributs = fields
	String libelle ;
	double prix;
	int qteStock;
//les methodes 
	
	void afficher(){
		System.out.println("#########################################");

		System.out.println("Libelle est :"+libelle);
		System.out.println("Prix  est :"+prix+" DHS");
		System.out.println("Qte stock est :"+qteStock);
	}
  boolean exists(){
	  return qteStock >0;
  }
  boolean exists(int qte){
	  return qteStock >=qte;
  }  
  double acheter(int qteAchat){
	  
	  qteStock += qteAchat;
	  double coutRevient =qteAchat* prix;
	  return  coutRevient;
  }

  void sortie(int qteSortie) {
	  qteStock -=qteSortie;
  }
  
 double  vendre(int qteAvendre) {
	 double ttc=0;
	 if(exists(qteAvendre)) {
		sortie(qteAvendre);
		ttc=qteAvendre * prix;
		System.out.println("Vente de "+qteAvendre+" exemplaires  de "+
		libelle+", le ttc est "+ttc+"DHS");
		return ttc;
	 }else {
		 System.out.println("insuffisance du stock , il ne reste que "+
	 qteStock+" "+libelle);
		return 0; 
	 }
		 
	
 }
  
}




//afficher();boolean etat=exists();coutDeRevient=achater(qteAchat);ttc=vendre(qteAvendre);
