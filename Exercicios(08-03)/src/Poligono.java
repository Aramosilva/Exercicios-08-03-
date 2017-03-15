

public abstract class Poligono extends Figura {
	public int altura;
	public int base;

	public Poligono(int a, int b) {
		altura = a;
		base = b;
	}

	public void setAlt(int a) {
		altura = a;
	}

	public int getAlt() {
		return altura;
	}

	
}
