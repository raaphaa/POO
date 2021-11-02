package br.com.serratec.funcionario;

public class Gerente extends Funcionario{
	//private String nivel;

	public Gerente(String nome, double salario) {
		super(nome, salario);
	}
	
	public double participacao() {
		return super.participacao() + 200;
	}

	@Override
	public String toString() {
		return this.nome + " - " + this.salario;
	}
	
}