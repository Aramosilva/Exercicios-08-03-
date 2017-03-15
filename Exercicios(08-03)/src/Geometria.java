import java.util.ArrayList;

public class Geometria {
	public static void main(String args[]){
		ArrayList<Figura> figuras= new ArrayList<>();
		figuras.add(new Circulo(5));
		figuras.add(new Triangulo(4,8));
		figuras.add(new Quadrado(4,4));
		figuras.add(new Retangulo(3,8));
		figuras.add(new Losango(4,6));
		figuras.add(new Trapezio(5,3,9));
		
		ArrayList<FigurasEspaciais> figE= new ArrayList<>();
		figE.add(new Cubo(3,4,7));
		figE.add(new Piramide(2,6,3));
		figE.add(new Cilindro(2,2));
		figE.add(new Esfera(4));
		
		String nomes[]={"-- Circulo -- ","-- Triangulo -- ","-- Quadrado --","-- Retangulo -- ","-- Losango -- ","-- Trapezio -- ","   *-* Figuras Espaciais *-* \n\n-- Cubo -- ",
				"-- Piramide -- ","--Cilindro -- ","-- Esfera -- "};
		int i=0;
		for (Figura fig:figuras){
			System.out.println(nomes[i]);
			System.out.println("Área: " + fig.area());
			System.out.println("Perimetro:  " + fig.perimetro() + "\n\n" );

			if(fig instanceof Diagonal){
				System.out.println("Diagonal: " + ((Diagonal)fig).diagonal()+ "\n\n***********************");
			}
			i++;
			
		}
		for (FigurasEspaciais f:figE){
			System.out.println(nomes[i]);
			System.out.println("Volume: " + f.volume() + "\n");
			i++;
			
		}
	}
}