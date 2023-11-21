package vetores;
import java.util.Scanner;
public class palindromos{
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        final int TAM = 10;
        int A[] = new int[TAM];{

       
        for (int i = 0; i < A.length; i++) {
            System.out.println("Digite o " + (i + 1) + "º número: ");
            A[i] = leia.nextInt();
        }

        for (int i = 0; i < A.length; i++) {
            int numero = A[i];
            int reverso = 0;
            int original = numero;

            if (original < 10) {
                System.out.println(A[i] + " não é um palíndromo.");
                continue;
            }

            while (numero > 0) {
                int digito = numero % 10;
                reverso = reverso * 10 + digito;
                numero /= 10;
            }

            if (original == reverso) {
                System.out.println(A[i] + " é um palíndromo.");
            } else {
                System.out.println(A[i] + " não é um palíndromo.");
            }
        }
        }
    }}

