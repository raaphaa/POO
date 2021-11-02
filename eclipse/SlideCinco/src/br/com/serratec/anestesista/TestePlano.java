package br.com.serratec.anestesista;

public class TestePlano {
	public static void main(String[] args) {
		
		Clinica clinica = new Clinica("GoldenS","TudoBem", "3849813941-45349");
		Medico medico = new Medico("GoldenS","Carlin", 587245209);
		Anestesista anestesista = new Anestesista("GoldenS", "Carlinha", 98592948, "Geral");
		ControlePagamento controlepagamento = new ControlePagamento();
		
		clinica.calcularPagamento();
		medico.calcularPagamento();
		anestesista.calcularPagamento();
		
		controlepagamento.calcularTotalPago(clinica);
		controlepagamento.calcularTotalPago(medico);
		controlepagamento.calcularTotalPago(anestesista);
		
		String ts = clinica.toString();
		System.out.println(ts);
		
		ts = medico.toString();
		System.out.println(ts);
		
		ts = anestesista.toString();
		System.out.println(ts);
		
		System.out.println("\nO total pago pelo plano: " + String.format("%.2f", controlepagamento.getTotalPago()));
	}
}