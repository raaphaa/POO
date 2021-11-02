package br.com.serratec.aula4.exercicios;

public class TesteMedico {
	public static void main(String[] args) {
		
		Medico m1 = new Medico();
		m1.setCrm(12345);
		m1.setNome("Ana Maria");
		m1.setSalario(0);
		m1.setValorDaConsulta(250);
		
		Medico m2 = new Medico(456789,"Antônio",0,300);
		
		m1.PagamentoEmDinheiro(250);
		m2.PagamentoPlano(300);
		
		System.out.println(m1);
		System.out.println(m2);
		System.out.println("Total de Médicos: " + Medico.getTotalMedicos());
	}
}