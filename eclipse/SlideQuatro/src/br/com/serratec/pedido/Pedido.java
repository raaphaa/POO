package br.com.serratec.pedido;
import java.time.DayOfWeek;
import java.time.LocalDate;

public class Pedido {
	private int numero;
	private double quantidade;
	private double valor;
	private double total;
	private LocalDate dataPedido;
	private String dia;
	
	public Pedido(int numero, double quantidade, double valor, LocalDate dataPedido) {
		super();
		this.numero = numero;
		this.quantidade = quantidade;
		this.valor = valor;
		this.dataPedido = dataPedido; 
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public double getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(double quantidade) {
		this.quantidade = quantidade;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public String setDia(String dia) {
		return this.dia = dia;
	}
	public String getDia() {
		return dia;
	}
	public void setTotal(double quantidade, double valor, String dia) {
		if (dia == "SUNDAY") {
			total = (valor * quantidade);
			total = total- total * 0.10;
		} else {
			this.total = valor * quantidade;
		}
	}
	public double getTotal() {
		return this.total;
	}	
	@Override
	public String toString() {
		return "Informações do pedido: \n\t[Numero = " + numero + " ]\n"
						+ "\t[Quantidade = " + quantidade + " ]\n"
						+ "\t[Valor = " + valor + " ]\n"
						+ "\t[Data do pedido = " + dataPedido + " ]";
	}
	 public boolean domingo(DayOfWeek dia, LocalDate dataPedido) {
		    LocalDate localDate = LocalDate(dataPedido);
		    dia = localDate.getDayOfWeek();
	        return dia == DayOfWeek.SUNDAY;
	}
	public void createLocalDate(int i, int j, int k ,DayOfWeek dia) {
		LocalDate localDate = LocalDate(dataPedido);
        dia = localDate.getDayOfWeek();
	}
	private LocalDate LocalDate(LocalDate dataPedido2) {
		// TODO Auto-generated method stub
		return dataPedido;
	}
}