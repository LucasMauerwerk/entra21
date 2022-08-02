package J;

import java.util.Scanner;

public class java25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner mendes = new Scanner(System.in);
		
		System.out.println("insira uma quantia de indici  ");
		int vetor = mendes.nextInt();
		System.out.println("insura uma quantudade de vetor ate 5 ");
		int indisi = mendes.nextInt();
		
		
		int idades [] = new int [5];

		idades[0] = 0;
		idades[1] = 0;
		idades[2] = 0;
		idades[3] = 0;
		idades[4] = 0;
		
		while (true) {
		for (int i = 0; i < idades.length;i++ ) {
			if (vetor  > -1  && vetor < 5) {
				idades [vetor] += indisi;
				break;
			
		
		}
			else if ( vetor >  i ) {
				System.out.println("o indici n exixte");
			}
	}
System.out.println(idades [vetor]);
}
	}
}