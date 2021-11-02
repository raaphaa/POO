package br.com.serratec.ImsTunado;

public class PessoaJuridica extends ImpostoDeRenda {
	private String cnpj;
	private String inscEstadual;
	
	public PessoaJuridica(String nome, double rendimentos, String cnpj, String inscEstadual) {
		super(nome, rendimentos);
		this.cnpj = cnpj;
		this.inscEstadual = inscEstadual;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getInscEstadual() {
		return inscEstadual;
	}

	public void setInscEstadual(String inscEstadual) {
		this.inscEstadual = inscEstadual;
	}
	public void calculoIR() {
		this.rendimentos = rendimentos * 0.15;
	}

	@Override
	public String toString() {
		return "Pessoa Jurídica: \n"
				+ "[ CNPJ = " + cnpj + "]\n"
				+ "[ inscrição estadual = " + inscEstadual + "]\n"
				+ "[ Nome = "+ nome + "]\n"
				+ "[ Rendimento = " + rendimentos + "]";
	}	
	
	public String rendimentoToString() {
		return "[ Imposto de renda = " + rendimentos + "]";
	}
}