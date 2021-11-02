package dadosexp;

import br.com.serratec.conclusao.Agencia;

public abstract class Conta {
	
	protected Cliente titular;
	protected Agencia agencia;
	protected double saldo;
	protected double valorSaque;
	protected double valorTranferencia;
	protected double valorDeposito;
	private double totalTributos = 0.0;
	
	public Conta() {
		super();
	}
	public Conta(Cliente titular, Agencia agencia, double saldo) {
		super();
		this.titular = titular;
		this.agencia = agencia;
		this.saldo = saldo;
	}
	public Cliente getTitular() {
		return titular;
	}
	public Agencia getAgencia() {
		return agencia;
	}
	public double getSaldo() {
		return this.saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public double getValorSaque(double saque) {
		return valorSaque;
	}
	public double getValorTranferencia() {
		return valorTranferencia;
	}
	public double getValorDeposito(double deposito) {
		return valorDeposito;
	}
	public double getTotalTributos() {
		return totalTributos;
	}
	public void setTotalTributos(double totalTributos) {
		this.totalTributos = totalTributos;
	}
}