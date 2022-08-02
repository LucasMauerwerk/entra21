package J;

import java.util.Scanner;

public class java15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner mendes = new Scanner(System.in);
		
		System.out.println("quantos tem na turma?");
		int turma = mendes.nextInt();
		
		int gay = 0;
		
	
		int numero = 0;
		
		while(gay<turma) {
			System.out.println("digite sua idade");
			int idade = mendes.nextInt();
			
			System.out.println("digite seu nome ");
			String nome = mendes.next();
			int i = 0;
			if (i == numero) {
			if (idade >= 18 && idade <= 19) {
				System.out.println(nome + " " + idade );
				}
			int i1 = 0;
			if (i1 == numero) {
			if (idade >= 20 ) {
				System.out.println(nome + " " + idade );	

	}
		    
  gay++;
	}
	}
}
}
}
