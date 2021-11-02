package br.com.serratec.funcionario;

public class TestaFuncionario {
	public static void main(String[] args) {
		Gerente g = new Gerente("Maria Luzia", 4350.);
		Assistente a = new Assistente("Antonio Carlos", 680.,180);
		
		System.out.println(g.toString());
		System.out.println("Part. lucros: " + g.participacao());
		System.out.println("Salario bruto: " + g.getSalario() + "\n");
		
		System.out.println(a.toString());
		System.out.println("Part. lucros: " + a.participacao());
		System.out.println("Salario bruto: " + a.getSalario() + "\n");
	}
}