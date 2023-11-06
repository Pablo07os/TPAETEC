package vetores;
import java.util.Scanner;
public class interseccão {
	 public static void main(String[] args) {
	        int[] A = new int[10];

	        Scanner leia = new Scanner (System.in);
			final int TAM=10;
			int a[], i, j, b[], inter=0, c[], k;
			a = new int [TAM];
			b = new int [TAM];
			c = new int [TAM];
			
			
			for (i=0;  i< a.length; i++) {
				System.out.println("Digite o "+(i+1)+"termo do vetor a");
				a[i] = leia.nextInt();
			}
			for (i=0;  i< b.length; i++) {
				System.out.println("Digite o "+(i+1)+"termo do vetor b");
				 b[i]= leia.nextInt();
				 
}
			for (i = 0; i < a.length; i++) {
	            for (j = 0; j < b.length; j++) {
	                if (a[i] == b[j]) {
	                    for (k = 0; k < inter; k++) {
	                        if (c[k] == a[i]) {
	                            break;
	                        }
	                    }
	                    if (k == inter) {
	                        c[inter] = a[i];
	                        inter++;
					}
				}
			}
			}
			for (i=0;  i< inter; i++) {
			System.out.println("A intersecção dos vetores A e B é = "+c[i]);
}
}
}
