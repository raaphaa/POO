package br.com.serratec.pagamento;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Conta minhaConta = new Conta("1234",30,"fulano","12345");
		minhaConta.deposito(1000);
		
		Scanner leitor = new Scanner(System.in);
	
		System.out.println("Digite 1 para saque. ");
		System.out.println("Digite 2 para deposito. ");
		System.out.println("Digite 3 para sair. ");
		int comando = leitor.nextInt();
		
		while(comando !=3) {
			switch(comando) {
			case 1:
				System.out.println("Digite o valor do saque.");
				double valorDoSaque = leitor.nextDouble();
				
				if(minhaConta.saque(valorDoSaque)) {
					System.out.println("Saque realizado");
				}
				break;
			case 2:
				System.out.println("Digite o valor do depósito.");
				double valorDoDeposito = leitor.nextDouble();
				minhaConta.deposito(valorDoDeposito);
			}
			
			System.out.println("Saldo atual: " + minhaConta.getSaldo());
			
			System.out.println("Selecione 1 para saque.");
			System.out.println("Selecione 2 para deposito");
			System.out.println("Selecione 3 para sair");
			comando = leitor.nextInt();
		}	
		leitor.close();
	}
}