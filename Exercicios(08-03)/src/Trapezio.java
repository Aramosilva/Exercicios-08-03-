
public class Trapezio extends Poligono {
	public int basMaior;

	public Trapezio(int a, int b, int bas) {
		super(a, b);
		basMaior=bas;
		// TODO Auto-generated constructor stub
	}

	@Override
	public int area() {
		return ((basMaior + super.base)*altura) / 2;
	}

	@Override
	public int perimetro() {
		double z=( basMaior -base)/2;
		z=Math.sqrt(Math.pow(z, 2)+Math.pow(z, 2));
		return  (int) (z+ base + basMaior+z);
	}

}
