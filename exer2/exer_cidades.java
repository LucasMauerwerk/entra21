package exer2;

public class exer_cidades {
	
	//O c?digo a seguir foi escrito por um programador descuidado que, ap?s t?-lo escrito, perdeu o c?digo original da classe Cidade.//
	//Verifique o trecho de c?digo abaixo, e escreva qual seria o c?digo necess?rio da classe.//


	//Cidade gaspar = new Cidade();//
	//gaspar.nome( "Gaspar" );//
	//gaspar.uf( "SC" );//
	//gaspar.populacaoMasculina( 28141 );//
	 
	//Cidade indaial = new Cidade();//
	//indaial.nome( "Indaial" );//
	//indaial.populacaoFeminina( 25844 );//
	//indaial.calculado( true );//

	public static void main(String[] args) {
		
		
		cidades unidadeGaspar = new cidades();
		cidades unidadeIndaial = new cidades();
		
		
		
		unidadeGaspar.gasparNome = "gaspar";
		unidadeGaspar.gasparUf = "sc";
		unidadeGaspar.populacaoMascolina = 28141;
		
		
		System.out.println(" nome " + unidadeGaspar.gasparNome );
		System.out.println(" o UF ? " + unidadeGaspar.gasparUf );
		System.out.println(" popula?ao mascolina ? de " + unidadeGaspar.populacaoMascolina) ;
		
		
		
		unidadeIndaial.gasparNome = "Indaial";
		unidadeIndaial.populacaofeminina = 15844;
		unidadeIndaial.calculado = true;
		
		System.out.println("\n nome " + unidadeGaspar.gasparNome );
		System.out.println(" popula?ao mascolina ? de " + unidadeIndaial.populacaofeminina) ;
		System.out.println(" conta ? " + unidadeIndaial.calculado);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		// TODO Auto-generated method stub

	}

}
