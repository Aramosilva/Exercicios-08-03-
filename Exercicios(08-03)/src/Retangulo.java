public class Retangulo extends Quadrilatero implements Diagonal{

	public Retangulo(int a, int b) {
		super(a, b);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int area() {
		// TODO Auto-generated method stub
		return super.area();
	}
	public int perimetro() {
		return super.perimetro();
	}
	@Override
	public int altura() {
		return altura;
	}

	@Override
	public int base() {
		return base;
	}

	@Override
	public double diagonal() {
		// TODO Auto-generated method stub
		return Diagonal.super.diagonal();
	}
	
}
