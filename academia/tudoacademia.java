package academia;

import java.util.Scanner;

public class tudoacademia {
	

		public static void main(String[] args) {
			Scanner input= new Scanner(System.in);
			System.out.println("	BEM VINDOS A ACADEMIA  DO MENDES \n---------------------------------------------------------------");
			System.out.println("Deseja fazer seu cadastro ? 1 para sim e 2 para não");
			int  cadastro= input.nextInt();
			 if (cadastro ==1) {
				 System.out.println("Qual o seu nome gatinho?");
				 String nome = input.next();
				 System.out.println("Qual seu telefone rsrs?");
				 String telefone= input.next();
				 System.out.println("Qual seu email?");
				 String email= input.next();
				 
				 Alunos al = new Alunos(nome, telefone, email);
				 
				 System.out.println("Seu nome é: " + al.nome + "\nSeu telefone: "+ al.telefone+ "\nSeu email: " + al.email);
				 Indtrutor inst =new Indtrutor("O GOSTOSO DO MENDES", "(47)9 9789-0908","marcelo.silva@gmail.com",new Endereco("Rua São Paulo", 345));
				 
				 System.out.println("Seu instrutor é: "+ inst.nome+ "\n Telefone para contato: "+ inst.telefone+ "\n Email: "+ inst.email);
				 
				 
			 }else {
				 System.out.println("que pena voce não sera bombado igual o Bruno para pegar nifetas");
			 }
			 	
			
			

		}

	}


