package lista1;
import	java.util. Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		System.out.println ("lucro");
		
		Scanner leia = new Scanner (System. in);
		
		double valor, porcentagem, lucro;
		
		System.out.print("valor do produto:");
		 
		valor = leia.nextDouble();
		
		System.out.print("% lucro do produto: ");
		
		porcentagem = leia.nextDouble();
		
		lucro=(valor+(valor*porcentagem/100));
		
		System.out.print(lucro);
		 
			
		
	}
	}
