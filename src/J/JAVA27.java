package J;

import java.util.Scanner;

public class JAVA27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner mendes = new Scanner(System.in);
		
		int idades[] = new int [100];
		 
		
		
		int menor = Integer.MAX_VALUE;
		int maior = Integer.MIN_VALUE;
		
	
		for (int i = 0; i<idades.length; i++ ) {
			System.out.println(" digite um valor");
			idades[i]= mendes.nextInt();
			
			if (idades[i] > maior ) {
				maior = idades[i];
			}
			if (idades[i] < menor ) {
				menor = menor;
			}
			System.out.println(" mais quando querer parar digite 'n' ");
			char nacionalide1 = mendes.next().charAt(0);
			nacionalide1 = Character.toUpperCase(nacionalide1);
			
			if (nacionalide1 == 'N') {
				break;
			}
			
			
		}
		
		System.out.println(" o maior é " + maior + " o e menor  é " + menor);
		
		System.out.println("media é " + menor / maior );
		
		
		
		
		
		
	}

}
