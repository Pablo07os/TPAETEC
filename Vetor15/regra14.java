package vetores;
import java.util.Scanner;
public class regra14 {
	public static void main(String[] args) {


        Scanner leia = new Scanner (System.in);
		final int TAM=10;
		int a[], i, b[], c[];
		a = new int [TAM];
		b = new int [TAM];
		c = new int [TAM];
		
		
		for (i=0;  i< a.length; i++) {
			System.out.println("Digite o "+(i+1)+"termo do vetor a");
			a[i] = leia.nextInt();
		}
		for (i=0;  i< b.length; i++) {
			System.out.println("Digite o "+(i+1)+"termo do vetor b");
			b[i] = leia.nextInt();
}
		for (i=0; i<a.length; i++) {
			if (a[i] > b[i] || b[i]< a[i]) {
				c[i] = 1;
			}else if (a[i] == b[i] || b[i] == a[i]) {
				c[i] = 0;
			}else {
				c[i] = -1;
			}
		}
		for(i=0; i<a.length; i++) {
		System.out.println("Vetor C = "+c[i]);
	}
	}
}
