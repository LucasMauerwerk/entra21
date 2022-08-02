package J;

import java.util.Scanner;

public class java18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int par = 0;
		int impar = 0;
		
		for( int i = 0; i <= 1000; i++) {
			if(i % 2 == 0) {
				par += i;
				
			}
			else {
				impar += i;
			}
		}
			System.out.println(impar + " " + par);
		
		
		}
		
	}


