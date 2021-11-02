package br.com.serratec.conclusao;

import dadosexp.Cliente;
import dadosexp.Conta;

public class ContaPoupanca extends Conta {
 
	private final String tipoDeConta = "Conta Poupança";
    private double taxaDeRendimento;
    private int diasDesejados;
    private double valorRendimento = 0.00012 * saldo;
    
	public ContaPoupanca() {
		super();
	}
	public ContaPoupanca(Cliente titular, Agencia agencia, double saldo) {
		super(titular, agencia, saldo);
	}
    public double getValorRendimento() {
        return valorRendimento;
    }
    public void setValorRendimento(double valorRendimento) {
        this.valorRendimento = valorRendimento;
    }

    public double getTaxaDeRendimento() {
        return taxaDeRendimento;
    }

    public String getTipoDeConta() {
        return tipoDeConta;
    }

    public double imprimeRendimento() {
        return taxaDeRendimento;
    }

    public String toString() {
        return "Valor total de rendimento por tempo: " + taxaDeRendimento;
    }
    public int getDiasDesejados() {
        return diasDesejados;
    }
    public void setDiasDesejados(int diasDesejados) {
        this.diasDesejados = diasDesejados;
    }
}