package while2;
import java.util.Scanner;

public class altura {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        double i=0, j=134, p=145;
    while(j<=p) {
    	j = j+2.5;
    	p= p+2;
    	i++;
    }
    System.out.println("joao demora "+i+" anos para ficar maior que pedro");
    }
    }