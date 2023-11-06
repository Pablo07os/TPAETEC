package vetores;
import java.util.Scanner;
public class rotinadebusca {
	public static void main(String[] args) {
		  
        Scanner leia = new Scanner(System.in);
    	final int TAM=10;
    	int i, x=0, p=-1, num=0;
        int[] a = new int[10];
        a = new int [TAM];
        for (i=0;  i< a.length; i++) {
			System.out.println("Digite o "+(i+1)+"termo do vetor a");
			a[i] = leia.nextInt();
}
        System.out.println("Digite o valor que deseja procurar");
        x = leia.nextInt();
        for (i=0; i<a.length; i++) {
        	if (a[i] == x) {
        		num = 1;
        		p = i;
        	}
        }
        if (num == 1) {
        System.out.println("Numero "+x+" encontrado na posição "+p);
        }else {
        System.out.println("Numero não encontrado");
        }
}
}