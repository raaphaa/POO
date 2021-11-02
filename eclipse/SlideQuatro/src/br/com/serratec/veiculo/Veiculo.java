package br.com.serratec.veiculo;

public class Veiculo {
	protected String chassi;
	protected String placa;
	protected String cor;
	protected double ipva;
	
	public String getChassi() {
		return chassi;
	}

	public void setChassi(String chassi) {
		this.chassi = chassi;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public double getIpva() {
		return ipva;
	}

	public void setIpva(double ipva) {
		this.ipva = ipva;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public void adicionaIPVA(double valor) {
		this.ipva += valor;
	}
	public void adicionaIpva(double valor) {
		this.ipva += valor * 2;
	}
}