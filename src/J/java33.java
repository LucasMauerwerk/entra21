package J;

public class java33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [][] matriz = new int [2][2];
		

		matriz [0][0] = 4;
		matriz [0][1] = 12;
		
		matriz [1][0] = 2;
		matriz [1][1] = -3;
		
		
		double numero1 = 0;
		double numero2 = 0;
		
		numero1 = matriz [0][0] * matriz [1][1];
		numero2 = matriz [1][0] * matriz [0][1];
		
		System.out.println(numero1 - numero2);
		
		
	}

}
