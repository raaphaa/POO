package br.com.serratec.livraria;

public class Livro {
	private String autor;
	private String livro;
	private double valor;
	
	public Livro(String autor, String livro, double valor) {
		super();
		this.autor = autor;
		this.livro = livro;
		this.valor = valor;
	}
	public String getAutor() {
		return autor;
	}
	public String getLivro() {
		return livro;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	@Override
	public String toString() {
		return "Autor: " + autor + "\nLivro: " + livro + "\nValor: " + valor;
	}
	public void reajuste(double valor) {
		this.valor = valor + valor * 0.06;
	}	
}