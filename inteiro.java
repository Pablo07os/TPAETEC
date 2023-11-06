import java.util. Scanner;
public class inteiro {
	public static void main(String[] args) {
		System.out.println ("inteiro");
		Scanner leia = new Scanner (System.in);
		int numero;
		System.out.println ("escreva o numero");
		numero = leia.nextInt();
		if(numero%2==0) {
			System.out.println ("par");
		}else {
			System.out.print("impar");
		}
	}
}