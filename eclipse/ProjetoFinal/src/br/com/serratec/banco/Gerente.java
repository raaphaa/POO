package br.com.serratec.banco;

public class Gerente extends Funcionario {
	protected Agencia idAgencia;

	public Gerente(String senha, String nome, String cpf, String cargo, Agencia idAgencia) {
		super(senha, nome, cpf, cargo);
		this.idAgencia = idAgencia;
		this.cargo = "Gerente";
	}
	public Agencia getIdAgencia() {
		return idAgencia;
	}
	public void setIdAgencia(Agencia idAgencia) {
		this.idAgencia = idAgencia;
	}
	public String getCargo() {
		return this.cargo;
	}
}