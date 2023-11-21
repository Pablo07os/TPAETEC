package while2;
import java.util.Scanner;

public class potencia {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int b, e, i, r;
        System.out.println("digite o expoente");
        e = leia.nextInt();
        System.out.println("digite a base");
        b = leia.nextInt();
        i = e;
        r = 1;
        while(i>0) {
        	r = r*b;
        	i--;
        	System.out.println(b + " elevado a " + e + " é igual a " + r);
        	
    }

}
}
