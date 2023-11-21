package vetores;
import java.util.Scanner;
public class pares {
    public static void main(String[] args) {
        int[] A = new int[10];

        Scanner leia = new Scanner (System.in);
		final int TAM=10;
		int a[], i, j;
		a = new int [TAM];
		
		
		for (i=0;  i< a.length; i++) {
			System.out.println("Digite o "+(i+1)+"termo do vetor a");
			a[i] = leia.nextInt();
		}
		for (i=0; i< A.length; i++) {
			System.out.println("Elemento a["+i+"]=" + a[i]);
			for (j=0; j<= a[i]; j= j+2) {
				System.out.println(+j);
				
			}
		}
    }
}


