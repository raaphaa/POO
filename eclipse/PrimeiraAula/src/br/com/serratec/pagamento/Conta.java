package br.com.serratec.pagamento;

public class Conta {
	
	 private double saldo;
	 private String titular;
	 private String cpf;
	 private String senha;
	 private int idade;
	 private boolean maiorDe18;
	
	 public Conta(String senha,int idade, String titular, String cpf) { 
		 //construtor
			this.senha = senha;
			if(idade >= 18) {
				this.maiorDe18 = true;
			}
			this.idade = idade;			
		}
	 

	 
	 public double getSaldo() {
		return saldo;
	}



	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}



	public String getTitular() {
		return titular;
	}



	public void setTitular(String titular) {
		this.titular = titular;
	}



	public String getCpf() {
		return cpf;
	}



	public void setCpf(String cpf) {
		this.cpf = cpf;
	}



	public String getSenha() {
		return senha;
	}



	public void setSenha(String senha) {
		this.senha = senha;
	}



	public int getIdade() {
		return idade;
	}



	public void setIdade(int idade) {
		this.idade = idade;
	}



	public boolean isMaiorDe18() {
		return maiorDe18;
	}



	public void setMaiorDe18(boolean maiorDe18) {
		this.maiorDe18 = maiorDe18;
	}



	public void deposito(double valor) {
		 this.saldo += valor;
		 System.out.println("O Valor do Sado é de: " + saldo + "após um depósito de: " + valor);
	 }
	 
	 public boolean saque(double valor) {
		 if ( this.saldo < valor) {
			 return false;
		 }else {
			 
			 //this.saldo = this.saldo - valor;
			 this.saldo -= valor;
			 return true;
		 }
	 }
	 
}
