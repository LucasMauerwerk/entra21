package academia;

public class Indtrutor {
	String nome;
	String telefone;
	String email;
	private Endereco ende;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public Endereco getEnde() {
		return ende;
	}
	public void setEnde(Endereco ende) {
		this.ende = ende;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
		
		public Indtrutor(String nome, String telefone, String email, Endereco ende) {
			setNome (nome);
			setTelefone (telefone);
			setEnde ( ende);
			setEmail (email);
	}
	
	
	



	
}


