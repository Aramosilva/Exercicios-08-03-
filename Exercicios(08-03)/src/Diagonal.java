public interface Diagonal {
		int altura();
		int base();	
	
		default double diagonal(){
		return Math.sqrt(Math.pow(base(),2)+ Math.pow(altura(),2));
	}
}