import java.util.Scanner;

public class asdfghjkl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner mendes = new Scanner(System.in);
		System.out.println("informe sua idade");
		int idade = mendes.nextInt();
		
		
		
		if (idade >= 5 && idade <= 7) {
			System.out.println(" sau caegoria é pre mirim");
		}
		
		else if(idade >= 8 && idade <= 10) {
			System.out.println(" sua categoria é merim ");
		}
		
		
		else if(idade >= 11 && idade <= 13) {
			System.out.println(" sua categoria é infantil");
		}
		
		
		else if(idade >= 14 && idade <= 17) {
			System.out.println(" sua categoria infanto juvenil ");
		}
		
		else if(idade >= 18 && idade <= 20) {
			System.out.println(" sua categoria é juvenil");
		}
		
		
		else if(idade >= 21) {
			System.out.println(" adulto ");
		}
		 
		else {
			System.err.println("voce nao tem idade para fazer");
		}
			
		}
		

		
		

		
		
		
		
		
		
		

	}


