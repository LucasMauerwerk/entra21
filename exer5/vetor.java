package exer5;

import java.util.Scanner;

public class vetor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Fa?a um algoritmo em que o usu?rio insere um n?mero 
		//em um vetor no ?ndice espec?fico que ele mesmo informou.
		//Lance as exce??es que voc? achar necess?rias
		
		Scanner mendes = new Scanner(System.in);
		
		int vetor[] = new int [60];
		for (int i = 0; i < vetor.length; i ++) {
			vetor[i] = i + 10;
			System.out.println(vetor[i] + "  ");
		}
		System.out.println("\n digite um numero: ");
		int n = mendes.nextInt();
		System.out.println("\ninforme uma posi??o: ");
		int p = mendes.nextInt();
		
		
		
		vetor[p] = n;
		System.out.println("novo vetor e?: ");
		for( int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i] + "  ");
		}

	}

}
