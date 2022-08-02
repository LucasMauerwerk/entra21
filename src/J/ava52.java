package J;

import java.util.Scanner;

public class ava52 {

	// TODO Auto-generated method stub

	public static void diidirNumero(int numero1, int numero2, int numero3, int numero4) {
		System.out.println("o resultado da sua operaçao é: ");
		System.out.println(numero1 + numero2 + numero3 + numero4);
	}

	public static void main(String[] args) {

		Scanner mendes = new Scanner(System.in);

		System.out.println("entre com o primeiro numero");
		int numero1 = mendes.nextInt();
		System.out.println("entre com o segundo numero");
		int numero2 = mendes.nextInt();
		System.out.println("entre com o terceiro numero");
		int numero3 = mendes.nextInt();
		System.out.println("entre com o quarto numero");
		int numero4 = mendes.nextInt();

		diidirNumero(numero1, numero2, numero3, numero4);

	}
}