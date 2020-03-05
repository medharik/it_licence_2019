package poo_heritage_abstract;

public class Cercle extends Forme {

private 	int rayon;

public int getRayon() {
	return rayon;
}

public void setRayon(int rayon) {
	this.rayon = rayon;
}
public Cercle() {
	// TODO Auto-generated constructor stub
}

public Cercle(int x, int y, int rayon) {
	super(x, y);
	this.rayon = rayon;
}
void agrandir(int a , int b){
	setX(getX()+a);
	setY(getY()+b);
	
}

public double calculerSurface() {
	double surface =3.14*rayon*rayon;
	return surface;
}

}
