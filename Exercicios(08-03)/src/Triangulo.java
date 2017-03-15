public class Triangulo extends Poligono {

	public Triangulo(int a, int b) {
		super(a, b);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int area() {
		return (super.altura * super.base) / 2;
	}

	@Override
	public int perimetro() {
		return altura+base+base;
	}
}