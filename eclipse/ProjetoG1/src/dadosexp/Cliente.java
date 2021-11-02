package dadosexp;

import br.com.serratec.conclusao.SeguroDeVida;

public class Cliente extends User {

	private SeguroDeVida seguroDeVida;

	public Cliente(String tipoDeConta, String nome, String cpf, String senha) {
		super(tipoDeConta, nome, cpf, senha);
	}
	public SeguroDeVida getSeguroDeVida() {
		return seguroDeVida;
	}
	@Override
	public String toString() {
		return "Cliente: "
				+ "\nNome: " + getNome() 
				+ "\nCpf: " + getCpf()
				+ "\nTipo de Conta: " + getTipoDeConta()
				+ "\nSeguro de Vida: " + seguroDeVida;
	}
}