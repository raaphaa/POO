package br.com.serratec.polimorfismo.empregado;

public class Empregado {
	protected String nome, cargo;
	protected double salario;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public double adicionalSalario() {
		return this.salario *= 1.08;	
	}
}