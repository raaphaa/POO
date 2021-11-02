package br.com.serratec.olimpiadas.abstractt;

public class Atleta extends Pais implements Olimpiadas{
	private String nomeAtleta;
	private double peso;
	private String modalidade;
	private int totalParticipantes;
	
	public Atleta(String nomePais, String nomeAtleta, double peso, int totalParticipantes) {
		super(nomePais);
		this.nomeAtleta = nomeAtleta;
		this.peso = peso;
		this.totalParticipantes = totalParticipantes;
	}
	@Override
	public String verificaSituacao() {
		if (peso > 90) {
			return "Peso pesado";
		} else if (peso > 60 && peso < 90) {
			return "Peso médio";
		}
		return "O atleta não participará";
	}
	public String getModalidade() {
		return modalidade;
	}
	public void setModalidade(String modalidade) {
		this.modalidade = verificaSituacao();
	}
	public String getNomeAtleta() {
		return nomeAtleta;
	}
	public double getPeso() {
		return peso;
	}
	public int getTotalParticipantes() {
		return totalParticipantes;
	}
	@Override
	public String toString() {
		return "Atleta: " + nomeAtleta + "\nPeso: " + peso + "\nModalidade: " + getModalidade()
				+ "\nTotal de participantes: " + totalParticipantes + "\nPaís: " + Pais.getNome();
	}
}