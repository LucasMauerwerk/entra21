package J;

import java.util.Scanner;

public class java17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner mendes = new Scanner(System.in);
		
		int numero1 = 0;

		System.out.println("quantos numeros voce vai digitar?");
		int escolido = mendes.nextInt();
		
		for (int i = 1;i <= escolido; i++) {
	    System.out.println("digite seu numero");
		int numero = mendes.nextInt();
		
		if ( numero % 2 == 0 ) {
			System.out.println("par");
		}
		else {
			System.out.println("impar");
		}
		
		}
		
		System.out.println("parabens voce acertou");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

}
}
