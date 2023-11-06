package vetores;
import java.util.Scanner;

public class crescdecr {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        final int TAM = 10;
        int A[] = new int[TAM];
        int B[] = new int[TAM];
        int C[] = new int[TAM];

    
        for (int i = 0; i < A.length; i++) {
            System.out.println("Digite o " + (i + 1) + "º número: ");
            A[i] = leia.nextInt();
        }

      
        for (int i = 0; i < A.length; i++) {
            B[i] = A[i];
            C[i] = A[i];
        }
        ordenarCrescente(B);
        ordenarDecrescente(C);

   
        System.out.println("Vetor B (crescente):");
        for (int i = 0; i < B.length; i++) {
            System.out.print(B[i] + " ");
        }

        System.out.println("\nVetor C (decrescente):");
        for (int i = 0; i < C.length; i++) {
            System.out.print(C[i] + " ");
        }
    }

    public static void ordenarCrescente(int vetor[]) {
        int n = vetor.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (vetor[j] < vetor[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = vetor[minIndex];
            vetor[minIndex] = vetor[i];
            vetor[i] = temp;
        }
    }

    public static void ordenarDecrescente(int vetor[]) {
        int n = vetor.length;

        for (int i = 0; i < n - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (vetor[j] > vetor[maxIndex]) {
                    maxIndex = j;
                }
            }
            int temp = vetor[maxIndex];
            vetor[maxIndex] = vetor[i];
            vetor[i] = temp;
        }
    }
}




