package Zologico;

public class aves1 extends pai_zologico{
	String corPena;
	String alimento;
	
	public String getCorPena() {
		return corPena;
	}

	public void setCorPena(String corPena) {
		this.corPena = corPena;
	}

	public String getAlimento() {
		return alimento;
	}

	public void setAlimento(String alimento) {
		this.alimento = alimento;
	}

	public aves1(String raça, String nome, String porte, String abitat, String pais, String corPenaString,
			String alimento) {
		super(raça, nome, porte, abitat, pais);
		setCorPena(corPena);
		setAlimento(alimento);
	}
		
		public void tudo1(){
			System.out.println(getRaça()+  " " + getPorte() + " " + getPais() + " " + getNome() + " " + getCorPena() + " " + getAlimento());
			
		}
	
	}
	

	
