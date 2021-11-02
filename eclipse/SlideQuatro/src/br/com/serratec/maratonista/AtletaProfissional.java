package br.com.serratec.maratonista;

public class AtletaProfissional extends Maratonista{
	private double peso;

	public AtletaProfissional(String nome, String sexo, int idade, double altura, double peso) {
		super(nome, sexo, idade, altura);
		this.peso = peso;
	}

	public double getPeso() {
		return peso;
	}

	@Override
	public String toString() {
		return "\nNome: " + nome + "\nSexo: " + sexo + "\nIdade: " + idade + "\nAltura: " + altura +"\nPeso do atleta profissional: " + peso;
	}
}