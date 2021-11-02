package br.com.serratec.banco;

public class ContaCorrente extends Conta {
	
	protected String tipoDeConta;

	public ContaCorrente(int idAg, String nomeAg, Cliente titular, Agencia agencia,
			              double saldo, String tipoDeConta) {
		super(idAg, nomeAg, titular, agencia, saldo);
		this.tipoDeConta = tipoDeConta;
	}
	public String getTipoDeConta() {
		return tipoDeConta;
	}
	public void setTipoDeConta(String tipoDeConta) {
		this.tipoDeConta = tipoDeConta;
	}
}