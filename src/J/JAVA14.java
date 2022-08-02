package J;

import java.util.Scanner;

public class JAVA14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner mendes = new Scanner(System.in);
		
		
		int menorvalor = -10000000;
		int maiorvalor = 10000000;
		int v = 0;
		

		while(true) {
			
			System.out.println("digite qualquer numero");
			v = mendes.nextInt();
			
			if (v == 0 ) {
				break;
			}
			
			if (v > menorvalor) {
				menorvalor = v;
			}  if (v < maiorvalor) {
				maiorvalor = v;
			}
			 
		}
		System.out.println("O número maior é "+menorvalor+" e o menor é "+maiorvalor);
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}


