package erança1;

public class chefe extends trabalhador {
	
	 private int subordinados;

	public int getSubordinados() {
		return subordinados;
	}

	public void setSubordinados(int subordinados) {
		this.subordinados = subordinados;
	}

	public chefe(int subordinados) {
		super();
		this.subordinados = subordinados;
	}
	public void dobrarSalario() {
		this.setSalario(getSalario()*2);
		System.out.println("o salario agora é " + getSalario());
	}
 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
