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

	public aves1(String ra?a, String nome, String porte, String abitat, String pais, String corPenaString,
			String alimento) {
		super(ra?a, nome, porte, abitat, pais);
		setCorPena(corPena);
		setAlimento(alimento);
	}
		
		public void tudo1(){
			System.out.println(getRa?a()+  " " + getPorte() + " " + getPais() + " " + getNome() + " " + getCorPena() + " " + getAlimento());
			
		}
	
	}
	

	
