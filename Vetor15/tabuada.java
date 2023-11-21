package vetores;
import java.util.Scanner;
public class tabuada {
	   public static void main(String[] args) {
	        Scanner leia = new Scanner(System.in);
	        final int TAM = 5;
	        int a[], b[], r;

	        a = new int[TAM];
	        b = new int[TAM];

	        for (int i = 0; i < TAM; i++) {
	            System.out.println("Digite o " + (i + 1) + "º termo do vetor a");
	            a[i] = leia.nextInt();
	        }

	        for (int i = 0; i < TAM; i++) {
	            for (int j = 1; j <= 10; j++) {
	                r = a[i] * j;
	                System.out.println(a[i] + " x " + j + " = " + r);
	            }
	        }
	    }
	}