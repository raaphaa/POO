package br.com.serratec.vetor.atletas;

public class TesteAtleta {
	public static void main(String[] args) {
		
		Atleta atleta1 = new Atleta("Diego Alves", "Goleiro", 25);
		Atleta atleta2 = new Atleta("Rafinha", "Lateral", 32);
		Atleta atleta3 = new Atleta("Arrascaeta", "Meio Campo", 25);
	
		Time time = new Time("Flamengo", "Jorge Jesus", new Atleta[3]);
		time.adicionarAtletas(atleta1);
		time.adicionarAtletas(atleta2);
		time.adicionarAtletas(atleta3);
	
		System.out.println("Time: " + time.getNomeTime());
		time.mostrarTime();
	}
}