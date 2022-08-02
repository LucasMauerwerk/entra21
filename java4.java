import java.util.Scanner;

public class java4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner mendes = new Scanner(System.in);
		
		System.out.println("qal é sau idade?");
		int idade = mendes.nextInt();
		System.out.println("voce E pra sileiro?");
		String nacionalidade = mendes.next();
		System.out.println("voce tem permisao judicial para dirigir?");
		String judicial = mendes.next();
		
		
		if (idade > 17 && nacionalidade.equals("sim")){
			System.out.println(" voce pode dirigir");
		}
		if (judicial.equals("sim")){
			System.out.println("voce tem permisao para dirigir");
		}
		
		else {
			System.out.println("voce n pode tirar o cnh");
		}
		
		 
		
		}
	}


