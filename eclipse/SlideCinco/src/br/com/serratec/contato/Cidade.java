package br.com.serratec.contato;

public class Cidade {
	private String nomeCidade;
	private Estado estado;

	public Cidade() {
		super();
	}

	public Cidade(String nomeCidade, Estado estado) {
		super();
		this.nomeCidade = nomeCidade;
		this.estado = estado;
	}

	public String getNomeCidade() {
		return nomeCidade;
	}

	public void setNomeCidade(String nomeCidade) {
		this.nomeCidade = nomeCidade;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "Cidade = " + nomeCidade + " \nEstado = " + estado;
	}	
}