package J;

import java.util.Scanner;

public class java37 {

	public static void main(String[] args) {
		
		Scanner mendes = new Scanner(System.in);
		
		System.out.println(" digite a sua altura: ");
		double altura = mendes.nextDouble();
		System.out.println("digite seu pesso: ");
		double pesso = mendes.nextDouble();
		
		double imc =  pesso / (altura * altura)  ;
		
		if (18.5 < imc) {
			System.out.println("Magreza");
		}
		else if (imc >=18.5 && imc < 24.9 ) {
			System.out.println("Saudável");
			
		}
		
		else if (imc >=25.0 && imc < 29.9  ) {
			System.out.println("Sobrepeso");
		}
		else if (imc >=30.0 && imc <34.9  ) {
			System.out.println("Obesidade Grau I");
		}
		
		else if (imc >=35.0&& imc <34.9 ) {
			System.out.println("Obesidade Grau II");
		}
		else if (imc >=40  ) {
			System.out.println("Obesidade Grau III");
		}
		
		
		
		
		
		
	}

}
