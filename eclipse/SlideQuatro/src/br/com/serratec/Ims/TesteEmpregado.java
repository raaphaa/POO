package br.com.serratec.Ims;

public class TesteEmpregado {
	public static void main(String[] args) {
		Empregado empregado = new Empregado("Robertin", "Souza", 1903.90);
		empregado.calculaImpostoDeRenda();
		
		System.out.println("O Empregado " + empregado.getNome() + " " + empregado.getSobrenome()
				+ " tem o salário líquido de R$: " + empregado.getSalario() );
		
		Empregado empregado2 = new Empregado("Rob", "Sou", 2000.90);
		empregado2.calculaImpostoDeRenda();
		
		System.out.printf("O Empregado " + empregado2.getNome() + " " + empregado2.getSobrenome()
		+ " tem o salário líquido de R$: %5.2f%n" , empregado2.getSalario());
		
		Empregado empregado3 = new Empregado("Acez", "Ohnidroguap", 5000.90);
		empregado3.calculaImpostoDeRenda();
		
		System.out.printf("O Empregado " + empregado3.getNome() + " " + empregado3.getSobrenome()
		+ " tem o salário líquido de R$: %5.2f%n" , empregado3.getSalario());
	}
}