package while2;
import java.util.Scanner;

public class fatorial {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int n, i, f;
        System.out.println("digite o numero");
        n = leia.nextInt();
        i = 1;
        f = 1;
        while(i<=n) {
        	f = i*f;
        	i++;
        	System.out.println("o fatorial de "+n+" é igual a="+f);
        	
        	
    }
}
}