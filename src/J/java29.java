package J;

import java.util.Scanner;

public class java29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	double idades [] = new double  [7];
		
	Scanner mendes = new Scanner(System.in);
	
	double somaVetores = 0;
		
		for (int i = 0; i <  idades.length; i++) {
			System.out.println("digite um valor ");
			idades[i]= mendes.nextDouble();
			somaVetores += idades[i];
		}
		double media = somaVetores / 7 ;
		for (int i = 0; i <  idades.length; i++) {
			if (idades[i] > media ) {
				System.out.println(i);
				System.out.println(idades[i]);
			}
			
		}
	}

}
