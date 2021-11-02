package br.com.serratec.livraria;

public class TestaLivro {
	public static void main(String[] args) {
		Livro lv = new Livro("Marco Antônio", "Cisco CCNA", 85.);
		Livro lv2 = new Livro("Kathy Sierra", "Use a Cabeça Java", 98.);
		
		Operacao op = new Operacao("Venda", lv);
		Operacao op2 = new Operacao("Empréstimo", lv2);
		
		op.venderLivro(); //valorOperacao
		lv.reajuste(op.getValorOperacao()); //reajuste
		String ts = lv.toString();
		System.out.println("Tipo: "+ op.getTipo() + "\n" + ts);
		
		System.out.println("\n");
		
		op2.emprestarLivro();
		lv2.setValor(op2.getValorOperacao());
		ts = lv2.toString();
		System.out.println("Tipo: "+ op2.getTipo() + "\n" + ts);
	}
}