package decimais;

import java.util.ArrayList;
import java.util.Scanner;

public class array_list_desimais {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Crie uma Array List
		//O usuário vai colocando valores decimais até ele colocar o char n
		//Calcular:
		//a) Qual o menor número
		//b) Qual o maior número
		//c) Calcular a média
		Scanner mendes = new Scanner(System.in);

		ArrayList<Integer> lista = new ArrayList<>();
		double soma = 0;
		while(true) {
		System.out.println("digite um valor");
		int valor = mendes.nextInt();
		lista.add(valor);
		System.out.println("digite <S> para continuar <N> para parar");
		 char escolha = mendes.next().charAt(0);
		 soma += valor;
		 if (escolha == 'N'  || escolha == 'n') {
			 break;
		 }
		}
		 
		 lista.sort(null);
		 System.out.println(lista);
		 System.out.println(lista.get(0));
		 System.out.println(lista.get(lista.size()-1));
		 System.out.println(soma/lista.size());
	}
	

}
