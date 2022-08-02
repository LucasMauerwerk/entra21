package triangulo;

public class riangulo {
	
	private int altura;
	private int largura;
	
	
	public int getAltura() {
		return altura;
	}
	public void setAltura(int altura) {
		if (altura<0) {
			this.altura = 0;
		}else {
		this.altura = altura;
	}
	}
	public int getLargura() {
		return largura;
	}
	public void setLargura(int largura) {
		if(largura<0) {
			this.largura = 0;
		}else {
		this.largura = largura;
	}
	}
	public riangulo(int altura, int largura) {
		
		setAltura (altura);
		setLargura  (largura);
	}
	
	public int conta (){
		return largura * altura;
		
	}
	public int conta2 () {
		return (largura+largura) + (altura+altura);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
