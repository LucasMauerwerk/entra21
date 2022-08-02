package erança1;

import java.util.Scanner;

public class empresa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner mendes = new Scanner(System.in);
		
		
		trabalhador mendes1 = new trabalhador();
		funcionario mendes2 = new funcionario(200, "125.632.209-12");
		chefe mendes3 = new chefe(3);

		System.out.println("digite seu nome ");
		mendes1.setNome(mendes.next());
		System.out.println("qual é seu salario");
		mendes1.setSalario(mendes.nextDouble());
		System.out.println("qual é a data que voce entrou na impresa ");
		mendes1.setDataIngresso(mendes.nextInt());
		
		System.out.println("digite \n1-chefe \n2-funcionario");
		int escolha= mendes.nextInt();
		
		if (escolha == 1) {
			
			
			System.out.println("ola Sr." + mendes1.getNome() + " seu salario é: " + mendes1.getSalario() + " voce atualmente tem " + mendes3.getSubordinados() + " funcionarios");
		System.out.println("voce quer demitir algum funcionario? \ndigite \n1-Sim \n2-Não");
		int demitir1 = mendes.nextInt();
		if (demitir1 == 1 ) {
	     mendes1.demetir(); 
		}
		if (demitir1 == 2) {
			System.out.println("deseja imformar se seu salario dobrou Sr" + mendes1.getNome() + "\nDigite  \n1-Sim \n2-Não");
			int dobrou = mendes.nextInt();
			if ( dobrou ==1) {
				mendes3.dobrarSalario();
				System.out.print(mendes3.getSalario());
			}
			if (dobrou == 2) {
				System.out.println("Obrigodo pela sua presença");
			}
		}
	
		}
		if (escolha == 2) {
			System.out.println("bem vindo" + mendes1.nome + " seu salario é de " + mendes1.salario + "e sau carga horaria é de " + mendes2.cargaHoraria );
			System.out.println("deseja se demitir? \ndigite \n1-sim \n2-nao");
			int mnb = mendes.nextInt();
			if (mnb == 1) {
				mendes1.demetir();
			}
			if (mnb == 2 ) {
				System.out.println("professsor tava atrasado e pulei essa parte");
			}
			
			
			
		}
		
		
		


	}

}
