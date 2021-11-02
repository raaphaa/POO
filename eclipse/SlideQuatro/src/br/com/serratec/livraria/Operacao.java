package br.com.serratec.livraria;

public class Operacao implements Livraria {
	private String tipo;
	private double valorOperacao;
	private Livro livro;
	
	public Operacao(String tipo, Livro livro) {
		super();
		this.tipo = tipo;
		this.livro = livro;
	}
	public Livro getLivro() {
		return livro;
	}
	public void setLivro(Livro livro) {
		this.livro = livro;
	}
	public String getTipo() {
		return tipo;
	}
	public double getValorOperacao() {
		return valorOperacao;
	}
	@Override
	public String toString() {
		return "Operacao: " + tipo + "\n Valor da operação: " + valorOperacao + "\nLivro: " + livro;
	}
	@Override
	public void emprestarLivro() {
		// TODO Auto-generated method stub
		valorOperacao = (livro.getValor() * 0.02) + Livraria.taxaEmprestimo ;
	}
	@Override
	public void venderLivro() {
		// TODO Auto-generated method stub
		valorOperacao = livro.getValor() + livro.getValor() * 0.09;
	}
}