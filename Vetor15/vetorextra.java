package vetores;
import java.util.Scanner;
public class vetorextra {

	     public static void main(String[] args) {
	         Scanner leia = new Scanner(System.in);
	         int[] a = new int[10];
	         int[] b = new int[10]; 
	         int i;
	         for (i=0;  i< a.length; i++) {
	 			System.out.println("Digite o "+(i+1)+"termo do vetor a");
	 			a[i] = leia.nextInt();
	 		}
	         

	         int Par = 0;
	         int Impar = 0;

	         for (i = 0; i < 10; i++) {
	             if (a[i] % 2 == 0) {
	                 b[Par] = a[i];
	                 Par++;
	             } else {
	                 b[10 - 1 - Impar] = a[i];
	                 Impar++;
	             }
	         }
	         System.out.println("Números pares em B:");
	         for (i = 0; i < Par; i++) {
	             System.out.print(b[i] + " ");
	         }

	         System.out.println("Números ímpares em B:");
	         for (i = 0; i < Impar; i++) {
	             System.out.print(b[10 - 1 - i] + " ");
	         }
	     }
	 
	     }
	     
