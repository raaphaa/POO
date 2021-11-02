package br.com.serratec.banco;

public class Presidente extends Funcionario {

	public Presidente(String senha, String nome, String cpf, String cargo) {
		super(senha, nome, cpf, cargo);
		this.cargo = "Presidente";
	}
	public String getCargo() {
		return this.cargo;
	}
}