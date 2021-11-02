package br.com.serratec.funcionario;

public class Funcionario {
	protected String nome;
	protected String cpf;
	protected double salario;
	protected String turno;
	
	public Funcionario(String nome, double salario) {
		super();
		this.nome = nome;
		this.salario = salario;
	}
	
	public String getNome() {
		return nome;
	}


	public double getSalario() {
		return salario + this.participacao();
	}


	public double participacao() {
		return this.salario * 0.01;
	}

	@Override
	public String toString() {
		return "Funcionario: " + nome + ", Salário: " + salario;
	}
	
	
	
}