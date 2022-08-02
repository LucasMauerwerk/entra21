package exer5;

import java.util.Scanner;

public class vetor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Faça um algoritmo em que o usuário insere um número 
		//em um vetor no índice específico que ele mesmo informou.
		//Lance as exceções que você achar necessárias
		
		Scanner mendes = new Scanner(System.in);
		
		int vetor[] = new int [60];
		for (int i = 0; i < vetor.length; i ++) {
			vetor[i] = i + 10;
			System.out.println(vetor[i] + "  ");
		}
		System.out.println("\n digite um numero: ");
		int n = mendes.nextInt();
		System.out.println("\ninforme uma posição: ");
		int p = mendes.nextInt();
		
		
		
		vetor[p] = n;
		System.out.println("novo vetor e´: ");
		for( int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i] + "  ");
		}

	}

}
