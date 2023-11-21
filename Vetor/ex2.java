package e;
import java.util.Scanner;
public class ex2 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		final int TAM = 10;
		int i,a[], b[], c[];
		
		a = new int[TAM];
		b = new int[TAM];
		c = new int[TAM];
		
		for (i=0; i<TAM; i++) {
			System.out.println("Entre com o "+(i+1)+"o. valor");
			a[i] = leia.nextInt();
			
		}
		System.out.println("\nVetor B=");
		for (i=0; i<TAM; i++) {
			System.out.println("Entre com o "+(i+1)+"o. valor");
			b[i] = leia.nextInt();
				}
		
		for (i=0; i<TAM; i++) {
			c[i] = a[i]+b[i];
			System.out.println("O "+(i+1)+"o. valor de c eh"+c[i]);

				}
}
}