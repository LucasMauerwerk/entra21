import java.util.Scanner;

public class Input {
	
	public static void main(String[] args) {
	

		
		
		System.out.println("informe sau idade");
		Scanner input = new Scanner(System.in);
		int idade = input.nextInt(); 
		System.out.println("ve é br? digiti 1 para sim e 2 pra nao");
		int brasiliro = input.nextInt(); 
		System.out.println("voce tem permisao judisial para dirigir?  digiti 1 para sim e 2 pra nao");
		int permisaoJudicial = input.nextInt();
		
		if (idade >= 18 || permisaoJudicial == 1) {
		System.out.println("voce pode retirar sua cnh");
		} else {
		System.out.println("voce n pode retirar seu cnh");
		
		}
		
		
		}
		
	}
	
	

