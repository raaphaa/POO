package br.com.serratec.oficina;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

public class Carro extends Veiculo {
	protected String categoria;
	

	public Carro(String modelo, LocalDate dataConserto, Proprietario proprietario, String categoria) {
		super(modelo, dataConserto, proprietario);
		this.categoria = categoria;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	@Override
	public double lavarVeiculo() {
		return valorCobrado = valorCobrado + TipoServico.LAVAGEM.getValorPorServico();
	}
	@Override
	public double trocarOleo() {
		if(dataConserto.getDayOfWeek() == DayOfWeek.SATURDAY) {
			valorCobrado = valorCobrado + TipoServico.OLEO.getValorPorServico() - 50;
		}else {
			valorCobrado = valorCobrado + TipoServico.OLEO.getValorPorServico();
		}
		return valorCobrado;
	}
	@Override
	public double revisao() {
		if (dataConserto.getMonth() == Month.AUGUST) {
			valorCobrado = valorCobrado + TipoServico.REVISAO.getValorPorServico() * 0.90;			
		} else {
			valorCobrado = valorCobrado + TipoServico.REVISAO.getValorPorServico();
		}
		return valorCobrado;
	}
	@Override
	public String toString() {
		return "\nCarro \nCategoria: " + categoria + "\nModelo: " + modelo + "\nValor cobrado: " + valorCobrado
				+ "\nData do conserto: " + dataConserto + "\nDia da Semana: " + dataConserto.getDayOfWeek().name() +  "\nProprietario: " + proprietario;
	}
}