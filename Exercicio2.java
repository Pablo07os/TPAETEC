package lista1;
import	java.util. Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		System.out.println ("volume");
		
		Scanner leia = new Scanner (System. in);
		
		double pi, raio, altura, volume;
		
		pi = 3.14;
		
		System.out.print("valor do raio");
		
		raio = leia.nextDouble();
		
		System.out.print("valor da altura");
		
		altura = leia.nextDouble ();
		
		volume  = (pi*(raio*raio)*altura);
				
		System.out.print(volume);
	}
}


