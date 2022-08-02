package exer3;

import java.util.Scanner;

public class valor0 {
	
	
	public static void main (String[] args) {
		

/*Escreva um algoritmo em que o usuário entre com 2 valores de 1 a 100
E depois mostre a divisão entre eles
Caso o usuário entre com o valor 0, lance uma exceção explicando que está sendo 
feita uma divisão por 0
Caso o usuário entre com algum outro número, lance uma exceção explicando 
que o número está fora dos limites*/

		Scanner mendes = new Scanner(System.in);

		System.out.println("entre com o primeiro valor entre 1 a 100: ");
		int num = mendes.nextInt();
		System.out.println("entre com o segundo valor  valor entre 1 a 100: ");
		int num1 = mendes.nextInt();
		if (num == 0 || num1==0) {
			throw new IllegalArgumentException("esta sendo dividido por 0");
		}
		if ( num < 1 || num > 100 || num1 < 1 || num1 > 100)  {
			throw new IllegalArgumentException("numeros fora dos limites");
		}
		
		double div = num/num1;

		System.out.println(div);
		
		
		
		
		
		
		
		
		
		
	}

}
