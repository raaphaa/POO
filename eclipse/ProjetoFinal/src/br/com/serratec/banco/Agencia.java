package br.com.serratec.banco;

public abstract class Agencia {
	protected int idAgencia;
	protected String nomeAgencia;
	
	public Agencia(int idAg, String nomeAg) {
		super();
		this.idAgencia = idAg;
		this.nomeAgencia = nomeAg;
	}
	public int getIdAgencia() {
		return idAgencia;
	}
	public void setIdAgencia(int idAg) {
		this.idAgencia = idAg;
	}
	public String getNome() {
		return nomeAgencia;
	}
	public void setNome(String nomeAg) {
		this.nomeAgencia = nomeAg;
	}
}