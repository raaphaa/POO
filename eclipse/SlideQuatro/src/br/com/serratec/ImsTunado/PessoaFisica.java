package br.com.serratec.ImsTunado;

public class PessoaFisica extends ImpostoDeRenda{
	private String cpf;
	private String rg;
	
	public PessoaFisica(String nome, double rendimentos, String cpf, String rg) {
		super(nome, rendimentos);
		this.cpf = cpf;
		this.rg = rg;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}
	
	public void calculoIR() {
		this.rendimentos = rendimentos * 0.12;
	}
	
	@Override
	public String toString() {
		return "Pessoa Física: \n" 
				+ "[ CPF = " + cpf + "]\n" 
				+ "[ RG = " + rg + "]\n" 
				+ "[ Nome = "+ nome + "]\n"
				+ "[ Rendimento = " + rendimentos + "]";
	}
	
	public String rendimentoToString() {
		return "[ Imposto de renda = " + rendimentos + "]";
	}
}