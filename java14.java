import java.util.Scanner;

public class java14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int contador;
		double numero, lindu;
		numero = 0;
		contador = -1;
		lindu = 0;
		Scanner mendes = new Scanner(System.in);
		while (true) {
			System.out.println("entre com o numero ");		
			numero = mendes.nextDouble();
			contador++;
			lindu = lindu + numero;
			if (numero == 0) {
				break;
			}
			}
		System.out.println("A média é "+lindu/contador);
		}
		

		
		
		
		
		
		
		
		
		

	}


