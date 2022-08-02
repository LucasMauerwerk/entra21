package exer4;

import java.util.Scanner;

public class altura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Еscreva um algoritmo que leia a altura de 5 pessoas e calcule a
		//média de altura das mesmas.
		//Lance as exceções que você achar necessárias
		Scanner mendes = new Scanner(System.in);
		
		System.out.println("informe sua altura");
		int alt = mendes.nextInt();
		System.out.println("informe sua altura");
		int alt2 = mendes.nextInt();
		System.out.println("informe sua altura");
		int alt3 = mendes.nextInt();
		System.out.println("informe sua altura");
		int alt4 = mendes.nextInt();
		System.out.println("informe sua altura");
		int alt5 = mendes.nextInt();
		double media = (alt + alt2 + alt3 + alt4 + alt5) /5; 
		System.out.println(media);
		if ( alt < 1 || alt > 300 ||alt2 < 1 || alt2 > 300 || alt3 < 1 || alt3 > 300 ||alt4 < 1 || alt4 > 300 ||alt5 < 1 || alt5 > 300 )  {
			throw new IllegalArgumentException("numeros fora dos limites");
		}
	}

}
