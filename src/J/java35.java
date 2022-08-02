package J;

public class java35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[][] matriz = new double[5][3];

		//tamanho
		matriz[0][0] = 2104;
		matriz[1][0] = 1600;
		matriz[2][0] = 2400;
		matriz[3][0] = 1416;
		matriz[4][0] = 3000;

		//quartos
		matriz[0][1] = 3;
		matriz[1][1] = 3;
		matriz[2][1] = 3;
		matriz[3][1] = 2;
		matriz[4][1] = 5;

		// preço
		matriz[0][2] = 399.900;
		matriz[1][2] = 329.900;
		matriz[2][2] = 369.000;
		matriz[3][2] = 232.000;
		matriz[4][2] = 539.9;
		
		double preco = 0;
		double tamanho = 0;
		double quartos = 0;
		double menor = Integer.MAX_VALUE;
		double menor2 = Integer.MAX_VALUE;
		double precoMenor = 0;
		double maior = Integer.MIN_VALUE;
		double maior2 = Integer.MIN_VALUE;
		double preco1 = 0;
		double casamenos = 0;
		double casamaior = 0;
		 
		 int linhaMenosQuartos = 0;
		 
		for (int i =0; i < 5;i++) {
			 preco += matriz[i][2] ;
			// System.out.println(" o valor da  casa é R$" + preço / 5 + " mil reais" );
		if  ( matriz[i][0] < menor ) {
			menor = matriz[i][0];
			precoMenor = matriz[i][2]; 
			
			 }
		if  ( matriz[i][1] > maior){
				maior = matriz[i][1];
				linhaMenosQuartos = i;
		}
		if (matriz[i][1] > maior2) {
			casamaior = matriz[i][0];
			maior2 = matriz[i][1];
		}
		if (matriz[i][1] < menor2) {
			casamenos = matriz[i][0];
			menor2 = matriz[i][1];
		}
		}
		 
		 System.out.println(" a media  das  casas é R$" + preco / matriz.length + " mil reais");
		 System.out.println(" valor da menor casa é R$" + precoMenor + " reais" );
		 System.out.println("A casa mais cara tem: " + matriz[linhaMenosQuartos][1] + " quartos");
		 System.out.println("A diferença da casa "+casamaior+" menos "+casamenos+" é "+(casamaior-casamenos));
		
	}
}

