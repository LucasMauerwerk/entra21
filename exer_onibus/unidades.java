package exer_onibus;
public class unidades {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Utilizando a classe Mercado.//

		// Atribua valores ?s vari?veis da classe Mercado para cada um dos objetos de Mercado.//

		// Calcule://
		// a) Quem teve o maior lucro vendendo ma??s?//
		// b) Quem teve o maior lucro vendendo laranjas?//
		// c) Qual das lojas teve o maior lucro nesse ano espec?fico?//
		// d) Qual das lojas teve o menor lucro?//
		// e) Qual das lojas ficou no "meio" em termos de lucro?//
		// f) Juntando as 3 lojas, a franquia teve um lucro maior vendendo ma??s ou laranjas?//
		
		mercado unidadeBlumenau = new mercado ();
		mercado unidadeJoinvile = new mercado ();
		mercado unidadeGaspar = new mercado ();
		
		
		
		unidadeBlumenau.macasVendidas = 900;
		unidadeBlumenau.laranjasVendidas = 600;
		unidadeBlumenau.precoLaranja = 4.7;
		unidadeBlumenau.precoMacas = 3;
		System.out.println(" a quandidade de ma?as vendidas ? de ; " + unidadeBlumenau.macasVendidas + "\n a quandidade de ma?as vendidas ? de : " + unidadeBlumenau.laranjasVendidas + "\n o pre?o da laranja ? de: " + unidadeBlumenau.precoLaranja + "\n o pre?o da laramja ? de:" + unidadeBlumenau.precoMacas + "\n");
		
		
		
		unidadeJoinvile.macasVendidas = 615;
		unidadeJoinvile.laranjasVendidas = 6871;
		unidadeJoinvile.precoLaranja = 4.7;
		unidadeJoinvile.precoMacas = 3;
		System.out.println(" a quandidade de ma?as vendidas ? de ; " + unidadeJoinvile.macasVendidas + "\n a quandidade de ma?as vendidas ? de : " + unidadeJoinvile.laranjasVendidas + "\n o pre?o da laranja ? de: " + unidadeJoinvile.precoLaranja + "\n o pre?o da laramja ? de:" + unidadeJoinvile.precoMacas + "\n");
		
		
		
		
		unidadeGaspar.macasVendidas = 87135;
		unidadeGaspar.laranjasVendidas = 6812;
		unidadeGaspar.precoLaranja = 4.7;
		unidadeGaspar.precoMacas = 3;
		System.out.println(" a quandidade de ma?as vendidas ? de ; " + unidadeGaspar.macasVendidas + "\n a quandidade de ma?as vendidas ? de : " + unidadeGaspar.laranjasVendidas + "\n o pre?o da laranja ? de: " + unidadeGaspar.precoLaranja + "\n o pre?o da laramja ? de:" + unidadeGaspar.precoMacas + " \n" );
		
		
		
		double bluVenM = unidadeBlumenau.macasVendidas; 
		double joiVenM = unidadeJoinvile.macasVendidas;
		double GasVenM = unidadeGaspar.macasVendidas;
		
		System.err.println("\n Quem teve o maior lucro vendendo ma??s?");
		
		
		if (bluVenM > joiVenM && joiVenM > GasVenM ) {
			System.out.println(" \n blumenau ? o que mais vendeu ma?as, com cerca de :  " + bluVenM * 3 + " lucro vendidos ");
		}
		else if (joiVenM > bluVenM && bluVenM > GasVenM ) {
			System.out.println(" \n joinvile ? o que mais vendeu ma?as, com cerca de :  " + joiVenM * 3 + " lucro vendidos ");
		}
		else if ( GasVenM > joiVenM && GasVenM > bluVenM ) {
			System.out.println(" \n gaspar  ? o que mais vendeu ma?as, com cerca de :  " + GasVenM * 3 + " lucro vendidos ");
		}
		
		double bluVenL = unidadeBlumenau.laranjasVendidas; 
		double joiVenL = unidadeJoinvile.laranjasVendidas;
		double GasVenL = unidadeGaspar.laranjasVendidas;
		
		System.err.println("\n Quem teve o maior lucro vendendo laranjas?");
		
		if (bluVenL > joiVenL && joiVenL > GasVenL) {
			System.out.println(" \n blumenau ? o que mais vendeu laranjas , com cerca de : " + bluVenL * 4.7 + " lucro vendidos ");
			
		}
		else if(joiVenL > bluVenL && joiVenL > GasVenL) {
			System.out.println(" \n joinvile ? o que mais vendeu laranjas , com cerca de : " + joiVenL * 4.7 + " lucro vendidos ");
		}
		
		else if (GasVenL > joiVenL && GasVenL > bluVenL) {
			System.out.println(" \n gaspar ? o que mais vendeu laranjas , com cerca de : " + GasVenL * 4.7 + " lucro vendidos ");
		}
		
		
		double soma1 = bluVenM + bluVenL;
		double soma2 = joiVenM + joiVenL;
		double  soma3 = GasVenM + GasVenL;
		
		System.err.println("\n Qual das lojas teve o maior lucro nesse ano espec?fico?");
		
		if ( soma1 > soma2 && soma1 > soma3) {
			System.out.println(" \n blumenau teve o maior lucro");
		}
		else if ( soma2 > soma1 && soma2 > soma3  ) {
			System.out.println("\n joinvile teve o maior lucro ");
			
		}
		else if (soma3 > soma1 && soma3 > soma2 ) {
			System.out.println("\n gaspar teve o maior lucro ");
		}
	
		
		
		System.err.println("\n Qual das lojas teve o menor lucro?");
		
		
		
		
	    if (soma1 < soma2 && soma1 < soma3) {
	    	System.out.println("\n Blumenau teve o menor lucro");
	    }
		
	    else if (soma2 < soma3 && soma2 < soma1) {
	    	System.out.println("\n Joinvile teve o menor lucro");
	    }
	    else if (soma3 < soma2 && soma3 < soma1) {
	    	System.out.println("\n Gaspar teve o menor lucro");
	    	
	    }
	    
	    System.err.println(" \n Qual das lojas ficou no \"meio\" em termos de lucro?");
	    
	    if ( soma1 > soma2 && soma1 < soma3) {
	    	System.out.println(" \n blumenau ? a cidades do meio ");
	    }
	    else if (soma2 > soma1 && soma2 < soma3) {
	    	System.out.println("\n joenvile ? a idade do meio");
	    }
	    else if (soma3 > soma2 && soma3 < soma1) {
	    	System.out.println("\n gaspar ? a cidade do meio");
	    }
	    
	    
	    System.err.println("\n Juntando as 3 lojas, a franquia teve um lucro maior vendendo ma??s ou laranjas?");
		
	    
	   double ma?a = (bluVenM + joiVenM + GasVenM) * 3;
	   double laranja = (bluVenL + joiVenL + GasVenL) * 4.7;
	   
	   
		if ( ma?a < laranja) {
			System.out.println("\n ma?a teve o maior lucro");
		}
		
		else {
			System.out.println("\n laranja teve o maior lucro");
		}
		
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
