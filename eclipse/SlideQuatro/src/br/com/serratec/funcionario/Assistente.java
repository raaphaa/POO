package br.com.serratec.funcionario;

public class Assistente extends Funcionario{
	private double adicional;

	public Assistente(String nome, double salario, double adicional) {
		super(nome, salario);
		this.adicional = adicional;
	}

	@Override
	public double getSalario() {
		return super.getSalario() + this.adicional;
	}

	@Override
	public String toString() {
		return this.nome + " - " + this.salario;
	}	
}