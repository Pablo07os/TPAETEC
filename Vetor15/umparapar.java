package vetores;
import java.util.Scanner;
public class umparapar {
	public static void main(String[]args) {
		
		Scanner leia = new Scanner (System.in);
		final int TAM=10;
		int a[], i, b[];
		a = new int [TAM];
		b = new int [TAM];
		
		for (i=0; i<TAM; i++) {
			System.out.println("Digite o "+(i+1)+"termo do veotr a");
			a[i] = leia.nextInt();
			
		if (a[i] % 2 ==0) {
			b[i] = 1;
		}else {
			b[i] = 0;
		}
		}
		for(i=0; i<TAM; i++) {
		System.out.println(+b[i]);
	}
	}
}


