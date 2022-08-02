package exer4;

public class imposto1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Para efetuar o recolhimento do Imposto de Renda a Receita Federal tem o NOME, CPF, UF (RS, PR e SC) e RENDA ANUAL.//
		//EX://
		//Nome: João da Silva//
		//CPF: 123.456.789-00//
		//UF: PR
		//RendaAnual: R$40.000//

	    //Para o cálculo do imposto a pagar de cada contribuinte, considere o seguinte://

		//Nível de Renda Anual     Alíquota//
		//0 a 4.000                  0%//
		//4.001 a 9.000              0.058%//
		//9.001 a 25.000             15%//
		//25.001 a 35.000            27,5%//
		//acima de 35.000            30%//


		//Sendo assim, deve-se calcular o imposto a pagar do seguinte modo://
		//Imposto a pagar = Renda Anual * Alíquota//

		//Crie 5 objetos da classe Contribuinte e coloque-os em um vetor.//

		//Calcule://
		//a) Quem mais paga imposto.//
		//b) Quem menos paga imposto.//
		//c) Qual o total de imposto pago entre os 5 contribuintes?//
		
		Imposto_renda mpessoa1  = new Imposto_renda();
		mpessoa1.nome = "Mendes";
		mpessoa1.cpf = 125632209;
		mpessoa1.uf = "PR";
		mpessoa1.renda = 20.000;
		
		Imposto_renda mpessoa2  = new Imposto_renda();
		mpessoa2.nome = "Guilherme";
		mpessoa2.cpf = 125632209;
		mpessoa2.uf = "TO";
		mpessoa2.renda = 20.000;
		
		Imposto_renda mpessoa3  = new Imposto_renda();
		mpessoa3.nome = "Bruno";
		mpessoa3.cpf = 125632209;
		mpessoa3.uf = "RS";
		mpessoa3.renda = 20.000;
		
		Imposto_renda mpessoa4 = new Imposto_renda();
		mpessoa4.nome = "Nathan";
		mpessoa4.cpf = 125632209;
		mpessoa4.uf = "SC";
		mpessoa4.renda = 20.000;
		
		Imposto_renda mpessoa5  = new Imposto_renda();
		mpessoa5.nome = "Julio";
		mpessoa5.cpf = 125632209;
		mpessoa5.uf = "RJ";
		mpessoa5.renda = 20.000;
		
		
		
		
		Imposto_renda vetor[] = new Imposto_renda[5];
		vetor[0] = mpessoa1;
		vetor[1] = mpessoa2;
		vetor[2] = mpessoa3;
		vetor[3] = mpessoa4;
		vetor[4] = mpessoa5;
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
