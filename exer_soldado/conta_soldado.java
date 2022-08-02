package exer_soldado;

public class conta_soldado {

	private String nome;
	private int soldo;
	private int valor;

	public conta_soldado(String nome, int soldo) {
		setSoldo(soldo);
		setNome(nome);
		setValor(soldo);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getSoldo() {
		return soldo;
	}

	public void setSoldo(int soldado) {
		this.soldo = soldado;
	}

	public void sacar(int numero) {

		setSoldo(getSoldo() - numero);
	}

	public void depositar(int numero2) {
		setSoldo(getSoldo() + numero2);

	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

}
