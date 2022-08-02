package J;

import java.util.Scanner;

public class java23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner mendes = new Scanner(System.in);
		
		int idades [] = new int [5];

		idades[0] = 1;
		idades[1] = 2;
		idades[2] = 3;
		idades[3] = 4;
		idades[4] = 5;
		
		
		
		System.out.println("digite seu numero de usuario:");
		int numero = mendes.nextInt();
		
		for(int i = 0; i < idades.length; i++ ){
			
			
		if (numero == idades[i]) {
			System.out.println("ACertou " );
			System.out.println(" o indice é :" + i + " valor é "+ numero );
			break;
		}
		
		else if(i==4){    {
			System.out.println("n exite nenhuma porta de usuario com esse numero");
		
		}
		
		}
	}
}
}

