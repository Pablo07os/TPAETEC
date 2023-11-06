package vetores;
import java.util.Scanner;
public class fatorial {
	  public static void main(String[] args) {
	        int[] A = new int[10];

	        Scanner leia = new Scanner (System.in);
			final int TAM=15;
			int a[], i, j, b[];
			a = new int [TAM];
			b = new int [TAM];
			
			for(i=0; i<a.length; i++) {
				System.out.println("Digite o "+(i+1)+"º termo de A");
				a[i] = leia.nextInt();
				}
			for(i=0; i<a.length; i++) {
				int fatorial = 1;
				for(j=1; j<=a[i]; j++)
					fatorial *= j;
				b[i] = fatorial;
				System.out.println("o elemento "+a[i]+" tem o fatorial igual a = "+b[i] );
			}
			}
}
