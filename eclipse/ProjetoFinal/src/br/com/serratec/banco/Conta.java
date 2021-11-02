package br.com.serratec.banco;

public abstract class Conta extends Agencia{
	
	protected Cliente titular;
	protected Agencia agencia;
	protected double saldo;
	
	public Conta(int idAg, String nomeAg, Cliente titular, Agencia agencia, double saldo) {
		super(idAg, nomeAg);
		this.titular = titular;
		this.agencia = agencia;
		this.saldo = saldo;
	}
	public Cliente getTitular() {
		return titular;
	}
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	public Agencia getAgencia() {
		return agencia;
	}
	public void setAgencia(Agencia agencia) {
		this.agencia = agencia;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
}