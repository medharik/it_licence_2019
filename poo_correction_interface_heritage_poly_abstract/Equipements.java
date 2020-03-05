package poo_correction_interface_heritage_poly_abstract;

public class Equipements implements Affichable {

	private String nom ;
    private double cout ;
	public Equipements() {
		super();
	}
	public Equipements(String nom, double cout) {
		super();
		this.nom = nom;
		this.cout = cout;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public double getCout() {
		return cout;
	}
	public void setCout(double cout) {
		this.cout = cout;
	}
	@Override
	public void afficher() {
		System.out.println("equipement :"+nom+" , "+cout+"Dhs");
		
	}
	@Override
	public void imprimer() {
		// TODO Auto-generated method stub
		
	}
}
