package indice_0;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class indice_0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Fa�a um algoritmo que coloque o n�mero 0 no �ndice que o usu�rio escolheu
		
		Scanner mendes = new Scanner(System.in);

		ArrayList<Integer> lista = new ArrayList<>();
		
		
		
		for (int i = 0; i <= 100 ; i ++) {
	    lista.add(i*i);
		}
		
		System.out.println("entre com um indici");
		int indici = mendes.nextInt();
			lista.set(indici,0);
		System.out.println(lista);

		
		
		

	}

}
