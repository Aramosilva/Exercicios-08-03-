
public class Esfera extends FigurasEspaciais {
	int raio;

	public Esfera(int r) {
		raio = r;
	}

	@Override
	public int volume() {
		
		return (int) ((4/3)*3*Math.pow(raio, 3));
	}
}
