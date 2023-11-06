import java.util.Scanner;
public class pares500 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int i = 2;
		  System.out.println("Numeros pares de 1 ao 500 ");
		while (i<=500) {
		  System.out.println(i);
			i = i+2;
		}
		leia.close();
	}	
	}