package poo_heritage_abstract;

public abstract class Forme {

	private int x , y ;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public Forme() {
		// TODO Auto-generated constructor stub
	}

	public Forme(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	protected void afficher() {
System.out.println("Forme : x est : "+x+", y est : "+y);
	}
	
	protected abstract double calculerSurface();
}
