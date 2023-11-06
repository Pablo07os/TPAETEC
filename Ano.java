import java.util. Scanner;
public class Ano {
	public static void main(String[] args) {
		System.out.println ("idade");
		Scanner leia = new Scanner (System.in);
		int anonasc, ano, idade;
		System.out.println(" Escreva o seu ano de nascimento");
		anonasc = leia.nextInt();
		ano = (2023);
		idade = (ano-anonasc);
		System.out.println("sua idade é "+idade);
	    if(idade<=18) {
	    	System.out.println("Menor de idade");
	    }else {
	    	System.out.println("Maior de idade");
	    }
		
		
	}
}
