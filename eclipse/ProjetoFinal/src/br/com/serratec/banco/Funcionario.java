package br.com.serratec.banco;

public abstract class Funcionario extends Usuario {
	protected String cargo;

	public Funcionario(String senha, String nome, String cpf, String cargo) {
		super(senha, nome, cpf);
		this.cargo = cargo;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
}