package J;

import java.util.Scanner;

public class java3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner mendes = new Scanner(System.in);

		System.out.println("escolha qualquer numero");
		int numero = mendes.nextInt();

		System.out.println("escolha a opera�ao: 1 para soma / 2 para subtra�ao / 3 para vezes / 4 para dividido");
		int escolha = mendes.nextInt();

		if (escolha == 1) {
			numero = numero + 10;
			System.out.println(numero);
		} else if (escolha == 2) {
			numero = numero - 10;
			System.out.println(numero);
			numero = numero + 10;
		} else if (escolha == 3) {
			numero = numero * 10;
			System.out.println(numero);
		} else if (escolha == 4) {
			numero = numero / 10;
			System.out.println(numero);
		}

		else {
			System.out.println("no existe essa opera�ao");

		}
		
		
		
	System.out.println("nathan � gay? 1 sim ou 2 para nao ");
	int lucas = mendes.nextInt();
	
	if (lucas == 1) {
		System.out.println("com toda a certesa");
	}
	else { 
		System.out.println("voce tem rever seus conseitos");
	}
	
	
	}
	

}




