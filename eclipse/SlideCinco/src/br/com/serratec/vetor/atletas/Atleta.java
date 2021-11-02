package br.com.serratec.vetor.atletas;

public class Atleta {
	private String nomeAtleta;
	private String posicao;
	private int idade;
	
	public Atleta(String nomeAtleta, String posicao, int idade) {
		super();
		this.nomeAtleta = nomeAtleta;
		this.posicao = posicao;
		this.idade = idade;
	}
	public String getNomeAtleta() {
		return nomeAtleta;
	}
	public void setNomeAtleta(String nomeAtleta) {
		this.nomeAtleta = nomeAtleta;
	}
	public String getPosicao() {
		return posicao;
	}
	public void setPosicao(String posicao) {
		this.posicao = posicao;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
}