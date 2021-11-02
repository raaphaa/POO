package br.com.serratec.conclusao;

public class SeguroDeVida {

	private double tributo = 0.2;
	private double valorSegurado;
	private double valortaxado;

	public void seguroDeVida(double valor) {
		if (valor > 0) {
			this.valorSegurado = debitaTaxa(valor);
			this.valortaxado = valorTaxado(valor);
		} 
	}
	private double valorTaxado(double valor) {
		return valor + tributo;
	}
	private double debitaTaxa(double valor) {
		return valor - (valor + tributo);
	}
	public double getTributo() {
		return tributo;
	}
	public void setTributo(double tributo) {
		this.tributo = tributo;
	}
	public double getValorSegurado() {
		return valorSegurado;
	}
	public void setValorSegurado(double valorSegurado) {
		this.valorSegurado = valorSegurado;
	}
	public double getValortaxado() {
		return valortaxado;
	}
	public void setValortaxado(double valortaxado) {
		this.valortaxado = valortaxado;
	}
	public String getImprimeSegurodeVida() {
		return "\n Tributo sobre o seguro de vida: " + String.format("%.2f", this.valortaxado);
	}
}