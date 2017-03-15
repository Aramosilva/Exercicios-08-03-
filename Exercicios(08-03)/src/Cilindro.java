public class Cilindro extends FigurasEspaciais {
	int raio, altura;
	public Cilindro (int a , int r){
		raio=r;
		altura=a;
	}
	@Override
	public int volume() {
		return (int) (3*altura*Math.pow(raio, 3));
	}
}

