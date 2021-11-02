package br.com.serratec.produto;

public class TestaProduto {
	public static void main(String[] args) {
		Produto produto = new Produto("arroz");
		System.out.println(produto.getDescricao());	
		
		Produto produto2 = new Produto();
		produto2.setDescricao("Banana");
		System.out.println(produto2.getDescricao());
		
		Produto produto3 = new Produto(003, "biscoito", 2.5);
		System.out.println(produto3.getCod() + " "
				+ produto3.getDescricao()
				 + " R$ " + produto3.getValor());
		
		Produto produto4 = new Produto(004, "bolacha", 2.7);
		System.out.println(produto4.getCod() + " "
				+ produto4.getDescricao()
				 + " R$ " + produto4.getValor());
		
		System.out.println("Total de Produtos: " + Produto.getTotalProdutos());
	}
}