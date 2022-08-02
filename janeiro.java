import java.util.Scanner;

public class janeiro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner mendes = new Scanner(System.in);
		
		System.out.println("escola um ms de 1 a 12");
	int data = mendes.nextInt();
	if (data > 1 && data <12) {
		System.out.println("escola um dia do mes escolido");
		int dia = mendes.nextInt();
		if (dia > 1 && dia < 31){
		System.out.println( "voce escolheu a data " + data + "/" + dia);
		}
		
	}
	
	

		
		
		
		
		
		
		
		
	} 	

}

