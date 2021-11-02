package br.com.serratec.banco;

public class Cliente extends Usuario{
	
	private SeguroDeVida seguroDeVida;
	
	public Cliente(String senha, String nome, String cpf) {
		super(senha, nome, cpf);
	}
	public SeguroDeVida getSeguroDeVida() {
		return seguroDeVida;
	}
	public void setSeguroDeVida(SeguroDeVida seguroDeVida) {
		this.seguroDeVida = seguroDeVida;
	}
	private boolean isSeguro() {
		if(this.seguroDeVida != null) {
			return true;
		}
		return false;
	}
	public void contrataSeguro(SeguroDeVida contrato) {
		if(!isSeguro()) {
			this.seguroDeVida = contrato;
			System.out.println("Seguro contratado com sucesso!");
		}else {
			System.out.println("Cliente ja possui seguro!");
		}
	}
	public double valorTaxaSeguro() {
		if(isSeguro()) {
			return this.getSeguroDeVida().getValorTaxado();
		}
		return 0.0;
	}
	public String informacaoDoSeguro() {
		if(isSeguro()) {
			return "" + getSeguroDeVida().toString();
		}
		return "";
	}
	@Override
	public String toString() {
		return "Cliente seguroDeVida:" + seguroDeVida + " senha:" + senha + " nome:" + nome + " cpf:" + cpf
				+ " getSeguroDeVida():" + getSeguroDeVida() + " isSeguro():" + isSeguro() + " valorTaxaSeguro():"
				+ valorTaxaSeguro() + " informacaoDoSeguro():" + informacaoDoSeguro() + " getSenha():" + getSenha()
				+ " getNome():" + getNome() + " getCpf():" + getCpf() + " formatarCpf():" + formatarCpf()
				+ " getClass():" + getClass() + " hashCode():" + hashCode() + " toString():" + super.toString();
	}
	
}