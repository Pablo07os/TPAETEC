package matriz;
public class ex1 {
	public static void main(String[] args) {
int v [][] = new int[4][4];
		int i, j;
		v[0][0] = 2;
		v[1][0] = 32;
		v[2][0] = 512;
		v[3][0] = 8192;
		for (i=0; i<4; i++) {
			for (j=0; j<3; j++) {
				v[i][j+1] = v[i][j]*2;
				
				}
			
		}
		for (i=0; i<4; i++) {
			for (j=0; j<4; j++) {
				System.out.println(+v[i][j]);
			}
		}
		
	}
	}


