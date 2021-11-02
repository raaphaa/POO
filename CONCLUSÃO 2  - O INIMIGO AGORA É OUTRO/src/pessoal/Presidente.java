package pessoal;

public class Presidente extends Funcionario{
	
	public Presidente() {
		super();
	}
	public Presidente(String nome, String cpf, String cargo, int senha) {
		super(nome, cargo, cpf, senha);
	}
	@Override
	public String toString() {
		return "\n-------------------------- \n   Presidente instanciado    \n-------------------------- \nNome: "
				+ getNome() + "\nCPF: " + getCpf() + "\nSenha: " + getSenha() + "\nCargo: " + getTipo() + "\nSaldo: "
				+ getSaldo() + "\nAg�ncia: " + getAgencia() + "\n--------------------------";
	}	
}