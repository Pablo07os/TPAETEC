package vetores;
import java.util.Scanner;

public class crescdecr {


	

	    public static void main(String[] args) {
	        Scanner leia = new Scanner(System.in);

	        int i, j, a[], b[], c[], n;

	        a = new int[10];
	        b = new int[10];
	        c = new int[10];

	        for (i = 0; i < a.length; i++) {
	            System.out.println("Insira o " + (i + 1) + "º termo do vetor A");
	            a[i] = leia.nextInt();
	        }

	        for (i = 0; i < a.length; i++) {
	            b[i] = a[i];
	            c[i] = a[i];
	        }

	        
	        for (i = 0; i < b.length - 1; i++) {
	            for (j = i + 1; j < b.length; j++) {
	                if (b[i] > b[j]) {
	                    n = b[i];
	                    b[i] = b[j];
	                    b[j] = n;
	                }
	            }
	        }

	        
	        for (i = 0; i < c.length - 1; i++) {
	            for (j = i + 1; j < c.length; j++) {
	                if (c[i] < c[j]) {
	                    n = c[i];
	                    c[i] = c[j];
	                    c[j] = n;
	                }
	            }
	        }

	        System.out.print("B crescente: ");
	        for (i = 0; i < b.length; i++) {
	            System.out.print(b[i] + " ");
	        }

	        System.out.println();

	        System.out.print("C decrescente: ");
	        for (i = 0; i < c.length; i++) {
	            System.out.print(c[i] + " ");
	        }
	        
	        leia.close();
	    }
	}
