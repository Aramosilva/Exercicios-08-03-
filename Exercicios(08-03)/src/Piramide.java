public class Piramide extends FigurasEspaciais{
	int alt,larg,base;
	
	public Piramide(int a,int l,int b) {
		alt=a;
		larg=l;
		base=b;
		
	}
	@Override
	public int volume() {
		return (alt*larg*base)/3;
	}
}