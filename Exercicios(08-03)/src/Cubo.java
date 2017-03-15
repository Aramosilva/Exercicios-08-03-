public class Cubo extends FigurasEspaciais{
	int altura,largura,base;
	
	public Cubo(int a,int l,int b) {
		altura=a;
		largura=l;
		base=b;
		
	}
	@Override
	public int volume() {
		return altura*largura*base;
	}
}
