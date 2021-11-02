package br.com.serratec.oficina;
import java.time.LocalDate;

public abstract class Veiculo implements Oficina {
	protected String modelo;
	protected double valorCobrado;
	protected LocalDate dataConserto;
	protected Proprietario proprietario;
	
	public Veiculo(String modelo, LocalDate dataConserto, Proprietario proprietario) {
		super();
		this.modelo = modelo;
		this.dataConserto = dataConserto;
		this.proprietario = proprietario;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public double getValorCobrado() {
		return valorCobrado;
	}
	public void setValorCobrado(double valorCobrado) {
		this.valorCobrado = valorCobrado;
	}
	public LocalDate getDataConserto() {
		return dataConserto;
	}
	public void setDataConserto(LocalDate dataConserto) {
		this.dataConserto = dataConserto;
	}
	public Proprietario getProprietario() {
		return proprietario;
	}
	public void setProprietario(Proprietario proprietario) {
		this.proprietario = proprietario;
	}
	@Override
	public String toString() {
		return "Veiculo: " + modelo + "\nValor Cobrado: " + valorCobrado + "\nData do conserto: " + dataConserto
				+ "\nProprietario: " + proprietario;
	}
}