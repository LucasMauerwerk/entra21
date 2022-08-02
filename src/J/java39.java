package J;

import java.util.Scanner;

public class java39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner mendes = new Scanner(System.in);
		
		
		int alturaMedia = 0;
		int boiola = 0;
		
	
		for (int i =0 ; i <= 5000; i++) {
			System.out.println("digite suas idades para fazer a media.  se quiser parar digite 0");
			int altura = mendes.nextInt();
			if (altura == 0) {
				break;
				
			}else {
				alturaMedia += altura;
				boiola++;
			}
			
			
		}
		double media=alturaMedia/boiola;
		 System.out.println(media);
		
		
		
		
		
		
		
	}

}
