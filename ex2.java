package matriz;
import java.util.Random;
public class ex2 {
	public static void main(String[] args) {
		int v [][] = new int[3][3];
				int i, j, menor=100, maior=0;
				Random r = new Random();
				for (i=0; i<3; i++) {
					for (j=0; j<3; j++) {
						v[i][j] =	r.nextInt(10);
						if (i > maior) {
							maior = i;
						}
						else  {
							menor = i;
						}
						if (j > maior) {
							maior = j;
						}
						else {
							menor = j;
						}
						
						
						

}
}
				for (i=0; i<3; i++) {
					for (j=0; j<3; j++) {
				System.out.println(+v[i][j]);
				System.out.println("O maior numero dessa matriz é"+maior+"e o menor é "+menor);
	}
}
	}
}
