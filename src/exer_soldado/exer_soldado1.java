package exer_soldado;

import java.util.Scanner;

public class exer_soldado1 {

	public static void main(String[] args) {
		int numero, numero2;
		Scanner mendes = new Scanner(System.in);

		conta_soldado conta01 = new conta_soldado(null, 0);

		System.out.println("informe seu nome: ");
		conta01.setNome(mendes.next());

		System.out.println("digite seu saldo Atual");
		conta01.setSoldo(mendes.nextInt());
		System.out.println(" escolha ; \n Voce deseja \n 1-sacar \n2-depozitar ");
		int escolha = mendes.nextInt();
		if (escolha == 1) {
			System.out.println("voce deseja sacar quanto?");
			numero = mendes.nextInt();
			conta01.depositar(numero);
		} else if (escolha == 2) {
			System.out.println("voce deseja depositar quanto?");
			numero2 = mendes.nextInt();
			conta01.depositar(numero2);
		}
		System.out.println(" agr voce tem :" + conta01.getSoldo());
		
		
		
		
		
		mendes.close();
	}

}
