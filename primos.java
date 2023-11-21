package vetores;
import java.util.Scanner;
public class primos {
	public static void main(String[] args) {
        int[] A = new int[10];

        Scanner leia = new Scanner (System.in);
		final int TAM=10;
		int a[], i, j;
		a = new int [TAM];
		
		
		for (i=0;  i< a.length; i++) {
			System.out.println("Digite o "+(i+1)+"termo do vetor a");
			a[i] = leia.nextInt();
			if (a[i] % 2 ==0 && a[i] !=2 ) {
				System.out.println("Número não primo");
			}
			else {
				System.out.println("Número primo");
			}
		}
}
}
