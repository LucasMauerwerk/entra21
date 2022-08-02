import java.util.Scanner;

public class ed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner mendes = new Scanner(System.in);
		
		System.out.println( "digite u numero de 0 a 30"); 
		int numbEscolhido = mendes.nextInt();
		if (numbEscolhido >= 0 && numbEscolhido <= 10 ) {
			System.out.println("vermelho");
		}
		else if (numbEscolhido >=11 && numbEscolhido <=20) {
			System.out.println("azul");
		}
		else if (numbEscolhido >= 21 && numbEscolhido <= 30) {
			System.out.println("verde");
		}
		else {
			System.err.println("numero invalido");
		} 
}
	
		
		
		
		
		
		
		
		
		
		
		

		
		
	}


