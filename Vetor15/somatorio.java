package vetores;
import java.util.Scanner;
public class somatorio {
    public static void main(String[] args) {
        int[] A = new int[10];
        int[] B = new int[10];

        
        for (int i = 0; i < 10; i++) {
            A[i] = i + 1; 
        }

       
        for (int i = 0; i < 10; i++) {
            int soma = 0;
            for (int j = i; j < 10; j++) {
                soma += A[j];
            }
            B[i] = soma;
        }

      
        System.out.println("Vetor B (Bi = somatório de Aj, para todo j variando de i até 10):");
        for (int i = 0; i < 10; i++) {
            System.out.print(B[i] + " ");
        }
    }
}
