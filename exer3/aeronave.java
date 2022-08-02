package exer3;

public class aeronave {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Faça uma classe chamada Aeronave.//
		// Com os atributos://
		// Passageiros.//
		// Velocidade máxima.//
		// Capacidade de combustível.//
		// Queima de combustível por minuto.//

		// Crie 4 objetos de sua preferência.//

		// Calcule://
		// a) Qual das aeronaves pode ficar no ar por mais tempo?//
		// b) Qual aeronave leva o maior número de passageiros?//
		// c) Considerando que os aviões estão em velocidade máxima, quem vai mais
		// longe?//
		int m= 0000000000000000000000000000001;
		System.out.println(m);
		aeronave1 bong007 = new aeronave1();
		aeronave1 B51 = new aeronave1();
		aeronave1 F15 = new aeronave1();
		aeronave1 F32 = new aeronave1();

		bong007.passageiros = 244;
		bong007.velocidade = 1344;
		bong007.combustivel = 423;
		bong007.quima = 3;

		System.out.println("O  limite de passageiros do bong007 é de: " + bong007.passageiros);
		System.out.println("A velocidade maxima do bong007 é de: " + bong007.velocidade);
		System.out.println("A capacidade maxima de combustivel do bong007 é de: " + bong007.combustivel);
		System.out.println("A quima de combustivel por km do bomg007 é de: " + bong007.quima);

		B51.passageiros = 963;
		B51.velocidade = 2000;
		B51.combustivel = 500;
		B51.quima = 7;

		System.out.println("\nO limite de passageiros do B51 é de: " + B51.passageiros);
		System.out.println("A velocidade maxima do B51 é de: " + B51.velocidade);
		System.out.println("A capacidade maxima no combustivel do B51 é de: " + B51.combustivel);
		System.out.println("A quima de combustivel por km do B15 é de:  " + B51.quima);

		F15.passageiros = 245;
		F15.velocidade = 1346;
		F15.combustivel = 421;
		F15.quima = 400;

		System.out.println("\nO limite massimo de passageiros do F15 é de: " + F15.passageiros);
		System.out.println("A velocidade maxima do F15 é de: " + F15.velocidade);
		System.out.println("A capacidade maxima de combustivel do F15 é de: " + F15.combustivel);
		System.out.println("A quima de combostivel por km do F15 é de: " + F15.quima);

		F32.passageiros = 300;
		F32.velocidade = 1000;
		F32.combustivel = 500;
		F32.quima = 7;

		System.out.println("\nO limite massimo de passageiros do F32 é de: " + F32.passageiros);
		System.out.println("A velocidade maxima do F32 é de: " + F32.velocidade);
		System.out.println("A capacidade maxima de combustivel do F32 é de:" + F32.combustivel);
		System.out.println("A quima de combostivel por km do F32 é de: " + F32.quima);

		System.err.println("\na) Qual das aeronaves pode ficar no ar por mais tempo?");

		double calculo1 = bong007.quima / bong007.combustivel;
		double calculo2 = B51.quima / B51.combustivel;
		double calculo3 = F15.quima / F15.combustivel;
		double calculo4 = F32.quima / F32.combustivel;
		

		if (calculo1 > calculo2 && calculo1 > calculo3 && calculo1 > calculo4) {
			System.out.println("O bong007 tem o maior tempo de voo");
		} else if (calculo2 > calculo1 && calculo2 > calculo3 && calculo2 > calculo4) {
			System.out.println("O B51 tem o maior tempo de voo");
		} else if (calculo3 > calculo1 && calculo3 > calculo2 && calculo3 > calculo4) {
			System.out.println("O F15 tem o maior tempo de voo");
		} else if (calculo4 > calculo1 && calculo4 > calculo2 && calculo4 > calculo3) {
			System.out.println("O F32 tem o maior tempo de voo");
		}
		
		System.err.println("\nb) Qual aeronave leva o maior número de passageiros?");
		 
		double voo1 = bong007.passageiros;
		double voo2 = B51.passageiros;
		double voo3 = F15.passageiros;
		double voo4 = F32.passageiros;
		
		if (voo1 > voo2 && voo1 > voo3 && voo1 > voo4) {
			System.out.println("o bong007 leva o maior numeros de passageiros " );
		}
		else if (voo2 > voo1 && voo2 > voo3 && voo2 > voo4) {
			System.out.println("o B51 leva o maior numeros de passageiros " );
		}
		else if (voo3 > voo1 && voo3 > voo2 && voo3 > voo4) {
			System.out.println("o F15 leva o maior numeros de passageiros " );
		}
		else if (voo4 > voo1 && voo4 > voo2 && voo4 > voo3) {
			System.out.println("o F32 leva o maior numeros de passageiros " );
		}
		
		
		System.err.println("\nc) Considerando que os aviões estão em velocidade máxima, quem vai mais longe?");
		
		double longe1 = calculo1 * bong007.velocidade;
		double longe2 = calculo2 * B51.velocidade;
		double longe3 = calculo3 * F15.velocidade;
		double longe4 = calculo4 * F32.velocidade;
		
		if (longe1 > longe2 && longe1 > longe3 && longe1 > longe4) {
			System.out.println("o bong007 ficara mais tempo no ar");
		}
		else if (longe2 > longe1 && longe2 > longe3 && longe2 > longe4) {
			System.out.println("o B51 ficara mais tempo no ar");
		}
		else if (longe3 > longe1 && longe3 > longe2 && longe3 > longe4) {
			System.out.println("o F15 ficara mais tempo no ar");
		}
		else if (longe4 > longe1 && longe4 > longe2 && longe4 > longe3) {
			System.out.println("o F32 ficara mais tempo no ar");
		}

	}

}
