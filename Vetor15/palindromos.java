package vetores;
import java.util.Scanner;
public class palindromos{
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        final int TAM = 10;
        int a[] = new int[TAM];{
        	for (int i=0;  i< a.length; i++) {
    			System.out.println("Digite o "+(i+1)+"termo do vetor a");
    			a[i] = leia.nextInt();
        }
        	if(a[0] == a[9] && a[1] == a[8] && a[2] == a[7] && a[3] == a[6] && a[4] == a[5]) {
        		System.out.println("É um palindromo");
        	}else {
        		System.out.println("Não é palindromo");
        	}
    }
}
}

