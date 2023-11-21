package e;
import java.util.Scanner;
public class ex1 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		final int TAM = 10;
		int i,a[], b[];
		
		a = new int[TAM];
		b = new int[TAM];
		
		for (i=0; i<TAM; i++) {
			System.out.println("Entre com o "+(i+1)+"o. valor");
			a[i] = leia.nextInt();
			b[i] = a[i];
		}
		for (i=0; i<TAM; i++) {
			b[i] = (b[i]*b[i]);
			System.out.println("O "+(i+1)+"o. valor de b eh"+b[i]);

				}

}
}