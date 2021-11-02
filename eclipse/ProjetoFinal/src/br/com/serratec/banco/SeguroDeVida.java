package br.com.serratec.banco;

public class SeguroDeVida {
	
	protected static final double tributoSeguro = 0.2;
	protected double valorSegurado;
	protected double valorTaxado;
	
	public SeguroDeVida(double valor) {
		if(valor > 0) {				
			this.valorSegurado = debitaTaxa(valor);
			this.valorTaxado = valorTaxado(valor);			
			
		}else {			
			throw new ValorInvalidoException("Não é possivel contratar um seguro para o valor informado!");
		}				
	}
	public double getValorSegurado() {
		return valorSegurado;
	}
	public void setValorSegurado(double valorSegurado) {
		this.valorSegurado = valorSegurado;
	}
	public double getValorTaxado() {
		return valorTaxado;
	}
	public void setValorTaxado(double valorTaxado) {
		this.valorTaxado = valorTaxado;
	}
	private double debitaTaxa(double valor) {
		return valor - (valor * tributoSeguro);
	}
	private double valorTaxado(double valor) {
		return valor * tributoSeguro;
	}
	@Override
	public String toString() {		
		return "\n Tributo sobre o seguro de vida: " + String.format("%.2f", this.valorTaxado);
	}
}