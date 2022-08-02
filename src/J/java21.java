package J;

public class java21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int idades [] = new int [100];
		
		
		
		for (int i = 0; i < 100; i++) {
			idades[i] = i;
			System.out.println(idades[i]);
		}
		int idades1 [] = new int [100];
		int contador = 0;
		
		for (int i = 99; i >= 0; i--){
		idades1[contador] = idades[i];
		System.out.println(idades1[contador]);
		contador++;
		}
		
		
		
		
		
		
		
	}

}
