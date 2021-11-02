package br.com.serratec.conclusao;

import dadosexp.Cliente;
import dadosexp.Conta;

public class ContaCorrente extends Conta {

	private final String tipoDeConta = "Conta Corrente";
	private final double taxaSaque = 0.10;
	private final double taxaTransferencia = 0.20;
	private final double taxaDeposito = 0.10;
	 
	public ContaCorrente() {
		super();
	}
	public ContaCorrente(Cliente titular, Agencia agencia, double saldo) {
		super(titular, agencia, saldo);
	}
	public String getTipoDeConta() {
		return tipoDeConta;
	}
	public double getTaxaSaque() {
		return taxaSaque;
	}
	public double getTaxaTransferencia() {
		return taxaTransferencia;
	}
	public double getTaxaDeposito() {
		return taxaDeposito;
	}
	public String ImprimirSaldo() {
        return "O seu saldo é de: " + this.getSaldo() + " reais";
    }
	public double relatorioTributacao(double valor) {
		saldo -= saldo - getValorSaque(valor);
		return saldo;
	}
	public String sacar(double valor) {
		if (this.saldo > valor) {
			double novoSaldo = this.getSaldo() - valor;
			this.setSaldo(novoSaldo);
			return "Saque realizado com sucesso!";
		} else {
			return "Saldo insuficiente para saque.";
		}
	}
	public String depositar(double valor) {
		double novoSaldo = this.getSaldo() + valor;
		this.setSaldo(novoSaldo);
		return "Depósito realizado com sucesso!";
	}
	public String transferir(double valor) {
		if (this.saldo > valor) {
			sacar(valor);
			this.setSaldo(this.getSaldo() + valor);
			return "Transferência realizada com sucesso!";
		} else {
			return "Saldo insuficiente para transferência.";
		}
	}	
	@Override
	public String toString() {
		return "_____________________________________________\n" 
				+ "As taxas cobradas pelo banco são: \n"
				+ "\nTaxa de Saque: " + taxaSaque + " Reais "
				+ "\nTaxa de Deposito: " + taxaDeposito + " Reais "
				+ "\nTaxa de Transferencia: " + taxaTransferencia + " Reais ";
	}
}