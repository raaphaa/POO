package pessoal;

public class Diretor extends Funcionario {

	public Diretor() {
		super();
	}

	public Diretor(String nome, String cpf, String cargo, int senha) {
		super(nome, cargo, cpf, senha);
	}

	@Override
	public String toString() {
		return "\n-------------------------- \n   Diretor instanciado    \n-------------------------- \nNome: "
				+ getNome() + "\nCPF: " + getCpf() + "\nSenha: " + getSenha() + "\nCargo: " + getTipo() + "\nSaldo: "
				+ getSaldo() + "\nAg�ncia: " + getAgencia() + "\n--------------------------";

	}

}
