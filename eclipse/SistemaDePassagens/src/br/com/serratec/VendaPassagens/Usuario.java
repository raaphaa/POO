package br.com.serratec.VendaPassagens;

public class Usuario {
	private String nomeUsuario;
	private int senha;
	private int idUsuario;
	
	public Usuario(String nomeUsuario, int senha, int idUsuario) {
		super();
		this.nomeUsuario = nomeUsuario;
		this.senha = senha;
		this.idUsuario = idUsuario;
	}
	public String getNomeUsuario() {
		return nomeUsuario;
	}
	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}
	public int getSenha() {
		return senha;
	}
	public void setSenha(int senha) {
		this.senha = senha;
	}
	public int getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}
	@Override
	public String toString() {
		return "\nUsuario: " + nomeUsuario + "\nId Usuario: " + idUsuario;
	}
	public boolean isSenha(int senha) {
		if (getSenha() == senha) {
			System.out.println("Senha válida!");
			return true;
		} else {
			System.out.println("Senha inválida!");
			return false;
		}
	}
}