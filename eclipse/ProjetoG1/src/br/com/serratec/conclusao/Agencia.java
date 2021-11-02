package br.com.serratec.conclusao;

public class Agencia {
	
	private int idAgencia;
	protected static int totalAgencia1 = 0;
	protected static int totalAgencia2 = 0;

	public Agencia(int idAgencia) {
		super();
		this.idAgencia = idAgencia;
		if (idAgencia == 001) {
			totalAgencia1++;
		} else if (idAgencia == 002) {
			totalAgencia2++;
		}
	}
	public int getIdAgencia() {
		return idAgencia;
	}
	public int getTotalAgencia1() {
		return totalAgencia1;
	}

	public int getTotalAgencia2() {
		return totalAgencia2;
	}
	public void setAgencia(int agencia) {
		this.idAgencia = agencia;
		if (agencia == 001) {
			totalAgencia1++;
		} else if (agencia == 002) {
			totalAgencia2++;
		}
	}
}