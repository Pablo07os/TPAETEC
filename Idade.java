package laços;
import java.util.Scanner;
public class Idade {
	    public static void main(String[] args) {
	        Scanner leia = new Scanner(System.in);
	        int anonasc, idade, resposta;
	        
	        do {
	        	 System.out.println("Digite o seu ano de nascimento");
	        	 anonasc = leia.nextInt();
	        	 idade = 2023-anonasc;
	        
	        	 
	        	 if (idade<18) {
	        		 System.out.println("Menor de idade "+idade+" anos");
	        	 }else {
	        		 System.out.println("Maior de idade "+idade+" anos");
	        		 
	        	 }
	        	 System.out.println("deseja continuar? 1 para sim e 2 para não");
	        	  resposta = leia.nextInt();
	        	 if (resposta ==1) {
	        		 
	        	 }
	        	 
	        }while(resposta==1);
	    }
}