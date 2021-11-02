package br.com.serratec.pedido;
import java.time.LocalDate;

public class MainProduto{
	public static void main(String[] args) {
		LocalDate data;
		data = LocalDate.of(2021, 10, 03);
		createLocalDate(data);
		
		Pedido pedido1 = new Pedido(1, 4, 5., data);
		
		String diaS = data.getDayOfWeek().toString();

		System.out.println(pedido1.toString());
		pedido1.setTotal(pedido1.getQuantidade(),pedido1.getValor(), diaS);
		System.out.println("\t[Total: R$ " + pedido1.getTotal() + " ]");
		System.out.println("\n");
		
		data = LocalDate.of(2021, 10, 04);
		createLocalDate(data);

		String diaS2 = data.getDayOfWeek().toString();
		
		Pedido pedido2 = new Pedido(2, 5, 7., data);
		System.out.println(pedido2.toString());
		pedido2.setTotal(pedido2.getQuantidade(),pedido2.getValor(), diaS2);
		System.out.println("\t[Total: R$ " + pedido2.getTotal() + " ]");

		System.out.println("\n");
		
		data = LocalDate.of(2021, 10, 10);
		createLocalDate(data);

		String diaS3 = data.getDayOfWeek().toString();

		Pedido pedido3 = new Pedido(3, 2, 2., data);
		System.out.println(pedido3.toString());
		pedido3.setTotal(pedido3.getQuantidade(),pedido3.getValor(), diaS3);
		System.out.println("\t[Total: R$ " + pedido3.getTotal() + " ]");		
	}
	 private static void createLocalDate(LocalDate data) {
	        LocalDate localDate = LocalDate(data);
	        System.out.println("Dia da semana: " + localDate.getDayOfWeek());
	    }
	private static LocalDate LocalDate(LocalDate data) {
		return data;
	}
}