package exer_onibus;

public class onibusEscolar {
	
	
	int alunos;
	int professores;
	int retirados;
	
	
public int getRetirados() {
		return retirados;
	}

	public void setRetirados(int retirados) {
	
		if (alunos> 0 ) {
			alunos = alunos-retirados;
			
		}this.retirados = retirados;
	}		


public onibusEscolar(int alunos, int professores, int retirados) {
		
	setAlunos (alunos);
	setProfessores  (professores);
	setRetirados (retirados);
	}
	
	public int getAlunos() {
		return alunos;
	}
	public void setAlunos(int alunos) {
	
		if (alunos > 40 ) {
			this.alunos = 40;
			
		}else {
			this.alunos = alunos;
		}
		
	}
	public int getProfessores() {
		return professores;
	}
	public void setProfessores(int professores) {
		
		if (professores <= 0) {
			alunos = 0;
		}else {
			this.professores = professores;
		}
	}
	

}
