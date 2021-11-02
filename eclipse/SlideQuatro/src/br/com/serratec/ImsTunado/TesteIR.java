package br.com.serratec.ImsTunado;

public class TesteIR {
	public static void main(String[] args) {
		
		PessoaFisica pessoafisica =  new PessoaFisica("Robertin", 2485.78, "875934875897", "57489563");
		
		String pessoaFisicaToString = pessoafisica.toString() ;
		
		System.out.println(pessoaFisicaToString);
		
		pessoafisica.calculoIR();
		
		String rendimentosPessoaFisicaToString = pessoafisica.rendimentoToString();
		
		System.out.println(rendimentosPessoaFisicaToString);
		
		System.out.println(pessoafisica.getNome() + " deverá pagar de imposto de renda R$: " 
						   + pessoafisica.getRendimentos());
		
		////////////////////////////////////////////////////////////////////////////////////////
		System.out.println("\n\n");
		////////////////////////////////////////////////////////////////////////////////////////
		PessoaJuridica pessoajuridica =  new PessoaJuridica("Reddot", 500000, "694878348", "74582759");
		
		String pessoaJuridicaToString = pessoajuridica.toString();

		
		System.out.println(pessoaJuridicaToString);
		
		pessoajuridica.calculoIR();
		
		String rendimentosPessoaJuridicaToString = pessoajuridica.rendimentoToString(); 
		
		System.out.println(rendimentosPessoaJuridicaToString);
		
		System.out.println(pessoajuridica.getNome() + " deverá pagar de imposto de renda R$: " 
						   + pessoajuridica.getRendimentos());
	}
}