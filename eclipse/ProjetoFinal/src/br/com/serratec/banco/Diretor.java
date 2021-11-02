package br.com.serratec.banco;

public class Diretor extends Funcionario {

	public Diretor(String senha, String nome, String cpf, String cargo) {
		super(senha, nome, cpf, cargo);
		this.cargo = "Diretor";
	}
	public String getCargo() {
		return this.cargo;
	}
}