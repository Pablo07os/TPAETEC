import java.util.Scanner;
public class somatoria {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int i = 2, j;
		j=1;
		while (i<100) {
			j = j+i;
			System.out.println("Somatoria realizada é"+j);
			i++;
		
		}
		leia.close();
	}	
	}