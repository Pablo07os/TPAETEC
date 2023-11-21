
package while2;
import java.util.Scanner;
public class fibonacci {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int n, atual=0, futuro=1, i=1, futuro2;
        
        System.out.println("Digite um numero:");
        n = leia.nextInt();
        System.out.print("Sequência: " + atual);

        while (i <	 n) {
            System.out.print(" " + futuro);
            futuro2 = atual + futuro;
            atual = futuro;
            futuro = futuro2;
            i++;
        }
        leia.close();
    }
}