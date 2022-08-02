package Zologico;

public class gato1 extends pai_zologico {
	
	String cor;
    String manchas;
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getManchas() {
		return manchas;
	}
	public void setManchas(String manchas) {
		this.manchas = manchas;
	}
	public gato1(String raça, String nome, String porte, String abitat, String pais, String cor, String manchas) {
		super(raça, nome, porte, abitat, pais);
		setCor(cor);
		setManchas(manchas);
	}
	public void tudo(){
		System.out.println(getRaça()+  " " + getPorte() + " " + getPais() + " " + getNome() + " " + getManchas() + " " + getCor() + " " + getAbitat() );
		
	}
}
