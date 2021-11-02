package br.com.serratec.maratonista;

public class Maratonista {
	protected String nome;
	protected String sexo;
	protected int idade;
	protected double altura;
	
	public Maratonista(String nome, String sexo, int idade, double altura) {
		super();
		this.nome = nome;
		this.sexo = sexo;
		this.idade = idade;
		this.altura = altura;
	}

	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}

	public double getAltura() {
		return altura;
	}
	public String verificaSituacao(int idade, double altura) {
		if(idade > 18 && altura >= 1.80) {
			return "Pode participar!";
		}else {
			 return "Não pode participar!";
		}
	}
}