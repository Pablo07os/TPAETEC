package vetores;
import java.util.Scanner;
public class divisores {
	  public static void main(String[] args) {
		  
	        Scanner leia = new Scanner(System.in);
	    	final int TAM=10;
	        int[] a = new int[10];
	        a = new int [TAM];
	        int i, j;
	        
	        for (i=0;  i< a.length; i++) {
				System.out.println("Digite o "+(i+1)+"termo do vetor a");
				a[i] = leia.nextInt();
	        }
	        for (i=0; i<a.length; i++) {
	        	System.out.println("O elemento a["+i+"]="+a[i]);
	        	for(j=1; j<=a[i]; j++) {
	        		if(a[i] % j == 0) {
	        			System.out.println(j);
	        		}
	        	}
	        }
	  }
}

