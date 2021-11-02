package br.com.serratec.banco;

public enum Transacao {
	
	SAQUE(0.10),
	DEPOSITO(0.10),
	TRANSFERENCIA(0.20);
	
	private double valorPorTransacao;

	private Transacao(double valorPorTransacao) {
		this.valorPorTransacao = valorPorTransacao;
	}
	public double getValorPorTransacao() {
		return valorPorTransacao;
	}
	/*
	protected abstract void saque(double valor);
	protected abstract void deposito(double valor);
	protected abstract void transferePara(Conta destino, double valor);
	protected abstract double getSaldo();
	protected abstract String relatorioTributo();	
	*/
}