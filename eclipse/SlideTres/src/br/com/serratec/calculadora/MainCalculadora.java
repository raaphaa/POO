package br.com.serratec.calculadora;
import java.util.Scanner;

public class MainCalculadora {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		Calculadora calculadora = new Calculadora();
		
		System.out.println("Informe um número: ");
		double valor1 = leitor.nextDouble();
		
		System.out.println("Informe outro número: ");
		double valor2 = leitor.nextDouble();
		
		System.out.println("Escolha uma operação: "
				+ "\n1 - Soma"
				+ "\n2 - Subtração"
				+ "\n3 - Multiplicação"
				+ "\n4 - Divisão"
				+ "\n5 - Sair");
		int opcao = leitor.nextInt();
		
		switch (opcao) {
		case 1:
			System.out.println(calculadora.somar(valor1, valor2));
			break;
		case 2:
			System.out.println(calculadora.subtrair(valor1, valor2));
			break;
		case 3:
			System.out.println(calculadora.multiplicar(valor1, valor2));
			break;
		case 4:
			System.out.println(calculadora.dividir(valor1, valor2));
			break;
		case 5:
			break;
		}
		leitor.close();
	}
}