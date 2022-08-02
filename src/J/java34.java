package J;

public class java34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [][] matriz1 = new int [4][4];
		int [][] matriz2 = new int [4][4];
		int [][] matriz3 = new int [4][4];
		
		
		for(int i = 0; i< matriz1.length; i++) {
			for (int j = 0; j< matriz1.length; j++) {
				matriz1[i][j] = (i + 1) * 5;
				matriz2[i][j] = (i + 1) * 53;
				matriz3[i][j] = matriz1[i][j] + matriz2[i][j];
				System.out.print(matriz3[i][j] + " ");
			}
			System.out.println("\n");
		}
		
		
	}

}
