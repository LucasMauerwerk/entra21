package erança1;

public class funcionario  extends trabalhador{
	
	double cargaHoraria;
	String idSindicato;
	
	
	
	public funcionario(double cargaHoraria, String idSindicato) {
		super();
		this.cargaHoraria = cargaHoraria;
		this.idSindicato = idSindicato;
	}
	
	public void sairDoSindicato() {
		this.idSindicato = "serado"; 
		
		
	}

	public double getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(double cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	public String getIdSindicato() {
		return idSindicato;
	}

	public void setIdSindicato(String idSindicato) {
		this.idSindicato = idSindicato;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
