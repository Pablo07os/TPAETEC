import java.util.Scanner;
public class tabuada {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int i = 1, n, r;
		  System.out.println("digite um numero para saber a tabuada");
		  n = leia.nextInt();
		while (i<=10) {
			r = i*n;
		  System.out.println(n+"x"+i+"="+r);
			i++;
		}
		leia.close();
	}	
	}