package br.com.serratec.banco;

public abstract class Usuario{
	protected String senha;
	protected String nome;
	protected String cpf;
	protected static final int tamanhoCpf = 11;
	
	public Usuario(String senha, String nome, String cpf) {
		super();
		this.senha = senha;
		this.nome = nome;
		this.cpf = cpf;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String formatarCpf() {
		if (this.cpf != null) {
			if (cpf.length() == tamanhoCpf) {
				return cpf.replaceAll("([0-9]{3})([0-9]{3})([0-9]{3})([0-9]{2})", "$1\\.$2\\.$3-$4");
			}// 111.222.333-44
		}
		return ("CPF inválido!");
	}
}