package Zologico;

public class pai_zologico  {
	
	String raça;
	String nome;
	String porte;
	String abitat;
	String pais;
	
	public pai_zologico(String raça, String nome, String porte, String abitat, String pais) {
		
		setRaça(nome);
		setPorte(porte );
		setAbitat(abitat );
		setPais(pais); 
	}
	public String getRaça() {
		return raça;
	}
	public void setRaça(String raça) {
		this.raça = raça;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getPorte() {
		return porte;
	}
	public void setPorte(String porte) {
		this.porte = porte;
	}
	public String getAbitat() {
		return abitat;
	}
	public void setAbitat(String abitat) {
		this.abitat = abitat;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	
	
	
	
	
	
	
	

}
