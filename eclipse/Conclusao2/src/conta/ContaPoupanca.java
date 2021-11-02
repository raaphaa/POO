package conta;

public class ContaPoupanca extends Conta{
	
	private double valorRendimento;

	public ContaPoupanca(String cpf, double saldo, int agencia, String tipoConta) {
		super(cpf, saldo, agencia, tipoConta);
	}

	public ContaPoupanca() {
		super();
	}
	
	//Getters and Setters
	public double getValorRendimento() {
		return valorRendimento;
	}

	public void setValorRendimento(double valorRendimento) {
		this.valorRendimento = valorRendimento;
	}

	public double calcularRendimentoPoupanca(double valor, int dias) {
        double valorFinal = valor * rendimentoPoupancaDia * dias;
            this.valorRendimento = valorFinal;
        return valorFinal;
    }

	@Override
	public String toString() {
		return "\n---------------------------- "
				+ "\n Conta Poupan�a instanciada "
				+ "\n---------------------------- "
				+ "\nCPF do titular: " + getCpf()
				+ "\nAg�ncia: " + getAgencia() 
				+ "\nSaldo: " + getSaldo() 
				+ "\n----------------------------";
	}	
}