package br.com.serratec.oficina;

import java.time.LocalDate;

public class Moto extends Veiculo {
	protected int cilindradas;

	public Moto(String modelo, LocalDate dataConserto, Proprietario proprietario, int cilindradas) {
		super(modelo, dataConserto, proprietario);
		this.cilindradas = cilindradas;
	}
	public int getCilindradas() {
		return cilindradas;
	}
	public void setCilindradas(int cilindradas) {
		this.cilindradas = cilindradas;
	}
	@Override
	public double lavarVeiculo() {
		return valorCobrado = valorCobrado + TipoServico.LAVAGEM.getValorPorServico();
	}
	@Override
	public double trocarOleo() {
		return valorCobrado = valorCobrado + TipoServico.OLEO.getValorPorServico();
	}
	@Override
	public double revisao() {
		return valorCobrado + valorCobrado + TipoServico.REVISAO.getValorPorServico();
	}
	@Override
	public String toString() {
		return "\nMoto \nCilindradas: " + cilindradas + "\nModelo: " + modelo + "\nValor cobrado: " + valorCobrado
				+ "\nData do conserto: " + dataConserto + "\nDia da Semana: " + dataConserto.getDayOfWeek().name() +  "\nProprietario: " + proprietario;
	}
}