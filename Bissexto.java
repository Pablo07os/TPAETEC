package laços;
import java.util.Scanner;
public class Bissexto {
	    public static void main(String[] args) {
	        Scanner leia = new Scanner(System.in);
	        for(int i=0; i<=2023; i = i+4) {
	        	 System.out.println();
	        	 if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0)) {	       
	        		 System.out.println(i+"é um ano bissexto");
	        	 }
	        }
	    }
}
