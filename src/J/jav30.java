package J;

import java.util.Scanner;

public class jav30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner mendes = new Scanner(System.in);

		int vetor1 [] = new int [5];
		
		for (int i = 0; i < vetor1.length;i++) {
			System.out.println("entre com qualquer valor do vetor1");
			vetor1[i] = mendes.nextInt();
		 
				
			}
		
		
		int vetor2 [] = new int [5];
		
		for (int i = 0; i < vetor2.length;i++) {
			System.out.println("entre com qualquer valor do vetor2");
			vetor2[i] = mendes.nextInt();
			
			
		}
		
		int vetor3 [] = new int [5];
		
		for (int i = 0; i < vetor3.length;i++) {
			vetor3[i]=vetor1[i]+vetor2[i];
			
		System.out.println( vetor1[i] + " " + vetor2[i] + " "+ vetor3[i] );
		
		}
	

}
}