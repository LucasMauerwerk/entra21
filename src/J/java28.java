package J;

import java.util.Scanner;

public class java28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner mendes  = new Scanner(System.in);
		double idades [] = new double [12];
		
		 
		for (int i = 0; i < 12; i++) {
			System.out.println("informe um numero");
			idades[i] = mendes.nextDouble();
			
			if (idades[i] %2 == 0) {
				idades[i] +=(idades[i] * 0.02);
				
				
			}
			else {
				idades[i] +=(idades[i] * 0.05);
				
			}
			System.err.println(idades[i]);
		}
				
		
		
		


	}

}
