package vetores;
import java.util.Scanner;
public class diferença {
	    public static void main(String[] args) {
	        Scanner leia = new Scanner(System.in);
	        final int TAM = 10;
	        int a[] = new int[TAM];
	        int b[] = new int[TAM];
	        int c[] = new int[TAM];
	        int diferenca = 0;

	        
	        for (int i = 0; i < a.length; i++) {
	            System.out.println("Digite o " + (i + 1) + "º termo do vetor A");
	            a[i] = leia.nextInt();
	        }

	        
	        for (int i = 0; i < b.length; i++) {
	            System.out.println("Digite o " + (i + 1) + "º termo do vetor B");
	            b[i] = leia.nextInt();
	        }

	     
	        for (int i = 0; i < a.length; i++) {
	            int j;
	            for (j = 0; j < b.length; j++) {
	                if (a[i] == b[j]) {
	                    break;
	                }
	            }
	            if (j == b.length) {
	                c[diferenca] = a[i];
	                diferenca++;
	            }
	        }

	      
	        for (int i = 0; i < b.length; i++) {
	            int j;
	            for (j = 0; j < a.length; j++) {
	                if (b[i] == a[j]) {
	                    break;
	                }
	            }
	            if (j == a.length) {
	                c[diferenca] = b[i];
	                diferenca++;
	            }
	        }
	        System.out.print("diferença: ");
	        for (int i = 0; i < diferenca; i++) {
	            System.out.print(c[i] + " ");
	        }
	    }
	}
