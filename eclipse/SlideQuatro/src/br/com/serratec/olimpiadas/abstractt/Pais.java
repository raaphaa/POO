package br.com.serratec.olimpiadas.abstractt;

public abstract class Pais {
	private static String nomePais;

	public Pais(String nomePais) {
		super();
		Pais.nomePais = nomePais;
	}
	public static String getNome() {
		return nomePais;
	}
	public void setNome(String nomePais) {
		Pais.nomePais = nomePais;
	}
}