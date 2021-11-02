package br.com.serratec.banco;

public class ContaPoupanca  extends Conta {
	
	protected String tipoDeConta;
	protected double valorRendimento;
	
	
	public ContaPoupanca(int idAg, String nomeAg, Cliente titular, Agencia agencia,
							double saldo, String tipoDeConta, double valorRendimento) {
		super(idAg, nomeAg, titular, agencia, saldo);
		this.tipoDeConta = tipoDeConta;
		this.valorRendimento = valorRendimento;
	}
	public String getTipoDeConta() {
		return tipoDeConta;
	}
	public void setTipoDeConta(String tipoDeConta) {
		this.tipoDeConta = tipoDeConta;
	}
	public double getValorRendimento() {
		return valorRendimento;
	}
	public void setValorRendimento(double valorRendimento) {
		this.valorRendimento = valorRendimento;
	}
}