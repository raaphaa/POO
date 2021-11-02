package br.com.serratec.aula4;
import java.util.Scanner;

public class Teste {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		Pessoa p = new Pessoa();
				
		System.out.println("Informe seu nome:");
		p.nome = leitor.nextLine();
		
		System.out.println("Informe seu peso:");
		double peso = leitor.nextDouble();
		p.SetPeso(peso);
		
		System.out.println("Informe sua altura:");
		double altura = leitor.nextDouble();
		p.SetAltura(altura);
		
		p.idPessoa = 242469;
		
		System.out.println(p.nome + "Você está: " + p.resultado());
		leitor.close();
	}
}