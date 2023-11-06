package laços;
import java.util.Scanner;

public class Tabuadas {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int i, j, resultado;

        for (i = 1; i <= 10; i++) {
            System.out.println("Tabuada do " + i + ":");

            for (j = 1; j <= 10; j++) {
                 resultado = i * j;
                System.out.println(i + " x " + j + " = " + resultado);
            }

            System.out.println(); 
        }
    }
}
