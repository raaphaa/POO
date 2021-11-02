package br.com.serratec.vetor.atletas;

public class Time {
	private String nomeTime;
	private String nomeTecnico;
	private Atleta[] atletas;
	
	public Time(String nomeTime, String nomeTecnico, Atleta[] atletas) {
		super();
		this.nomeTime = nomeTime;
		this.nomeTecnico = nomeTecnico;
		this.atletas = atletas;
	}
	public String getNomeTime() {
		return nomeTime;
	}
	public void setNomeTime(String nomeTime) {
		this.nomeTime = nomeTime;
	}
	public String getNomeTecnico() {
		return nomeTecnico;
	}
	public void setNomeTecnico(String nomeTecnico) {
		this.nomeTecnico = nomeTecnico;
	}
	public Atleta[] getAtletas() {
		return atletas;
	}
	public void setAtletas(Atleta[] atletas) {
		this.atletas = atletas;
	}
	public void adicionarAtletas(Atleta atleta){
		for(int contador = 0; contador < atletas.length; contador++) {
			if(atletas[contador] == null) {
				atletas[contador] = atleta;
				return;
			}
		}
	}
	public void mostrarTime() {
		for(int contador = 0; contador < atletas.length; contador++) {
			System.out.println(atletas[contador].getNomeAtleta());
		}
	}
}