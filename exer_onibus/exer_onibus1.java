package exer_onibus;

public class exer_onibus1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	Fa?a uma classe chamada OnibusEscolar, com os atributos estudantes e professor

		//Fa?a uma exce??o no m?todo setAlunos que se o n?mero de alunos for maior do que 40,
	//	fa?a com que o n?mero de alunos seja 40

		//Caso o n?mero de professores for 0, o n?mero de alunos tamb?m deve ser zerado

		//Fa?a tamb?m um m?todo chamado remover alunos, que devera remover os alunos de acordo com o valor
		//passado como par?metro
		
		
		onibusEscolar onibus = new onibusEscolar(50, 2, 5);
		
		
		
		System.out.println("a quandidades de aluno ?: " + onibus.alunos + "\na quandidade de professores ?:" + onibus.professores + "\nE os numeros retirados de alunos ? " + onibus.retirados);
		
		
		
		
		
		
		

	}

}
