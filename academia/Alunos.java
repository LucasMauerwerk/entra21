package academia;

public class Alunos {
	
		String nome;
		String telefone;
		String email;
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
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		
		public Alunos(String nome, String telefone, String email) {
			
			setNome ( nome);
			this.telefone = telefone;
			this.email = email;
		}
		
		
		
	
		

}
