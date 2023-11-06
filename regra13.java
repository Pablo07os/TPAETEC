package vetores;
import java.util.Scanner;
public class regra13 {
	public static void main(String[] args) {
        int[] A = new int[10];

        Scanner leia = new Scanner (System.in);
		final int TAM=10;
		int a[], i, j, b[];
		a = new int [TAM];
		b = new int [TAM];
		
		
		for (i=0;  i< a.length; i++) {
			System.out.println("Digite o "+(i+1)+"termo do vetor a");
			a[i] = leia.nextInt();
		}
		for (i=0; i<a.length; i++) {
			if (a[i] % 2 ==0) {
				b[i] =  1;
			}else {
				b[i] = 0;
			}
		}
		for (i=0; i<a.length; i++)
		System.out.println("Vetor B = "+b[i]);
}
}