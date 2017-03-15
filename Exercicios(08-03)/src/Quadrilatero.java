public abstract class Quadrilatero extends Poligono{

	public Quadrilatero(int a, int b) {
		super(a, b);
		// TODO Auto-generated constructor stub
	}
	@Override
	public int area() {
		return super.base*super.altura;
	}
	@Override
	public int perimetro() {
		return (super.base*2)+(super.altura*2);
	}
	

}

