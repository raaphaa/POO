package br.com.serratec.anestesista;

public class Plano {
	protected String empresa;
	protected double valorPago = 80;
	protected double valorIss = 5;
	
	public Plano(String empresa) {
		super();
		this.empresa = empresa;
	}
	public double getValorPago() {
		return valorPago;
	}
	public void setValorPago(double valorPago) {
		this.valorPago = valorPago;
	}
	@Override
	public String toString() {
		return "Plano da empresa: " + empresa + "\n valorPago: " + valorPago + "\n valorIss: " + valorIss;
	}
	public double calcularPagamento() {
		valorPago = valorPago - (valorPago * valorIss/100); 
		return valorPago;
	}
}