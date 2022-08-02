package computador1;


import java.util.Scanner;
public class tudo {
	

		public static void main(String[] args) {
			Scanner GMW=new Scanner(System.in);
			notebook note1= new notebook(200,300,true, 3);
			notebook note2= new notebook(300,400,true, 3.3);
			Smartphone celular=new Smartphone(150, 100, false, 10);
			
			
			if(note1.ehPesado()==true) {
			System.out.println("o Notebook1 é pesado");
			}else {
				System.out.println("O Notebook1 não é pesado");
				
			}
			if(note2.ehPesado()==true) {
				System.out.println("o Notebook2 é pesado");
				}else {
				System.out.println("O Notebook2 não é pesado");
				}
			System.out.println("Voce já tem "+celular.getSelfies()+" selfies,deseja tirar mais selfies?digite\n1 para sim  \n2 para não");
			int s=GMW.nextInt();
			if(s==1) {
				System.out.println("Quantas selfies dejeva tirar?");
				int vezes=GMW.nextInt();
				for(int i=0;i<vezes;i++) { 
					celular.setSelfies(celular.getSelfies()+1);
				}System.out.println("Agora voce tem: "+celular.getSelfies());
			}else {
				System.out.println("obriga pelas fotos henrrique seu lindo rsrs");
			}
			

	}
	}


