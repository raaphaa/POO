package br.com.serratec.produto;

public class Produto {
	private int cod;
	private String descricao;
	private double valor;
	private static int totalProdutos;
	
	public Produto() {
		System.out.println("Construtor Vazio.");
		Produto.totalProdutos += 1;
	}

	public Produto(String descricao) {
		this();
		this.descricao = descricao;
		Produto.totalProdutos += 1;
	}
	
	public Produto(int cod, String descricao, double valor) {
		this(descricao);
		this.cod = cod;
		this.descricao = descricao;
		this.valor = valor;
		Produto.totalProdutos += 1;
	}
	
	public static int getTotalProdutos() {
		return totalProdutos;
	}

	public static void setTotalProdutos(int totalProdutos) {
		Produto.totalProdutos = totalProdutos;
	}

	public int getCod() {
		return cod;
	}

	public void setCod(int cod) {
		this.cod = cod;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
}