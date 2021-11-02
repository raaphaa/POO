package br.com.serratec.calculadora;
import java.util.Scanner;

public class MainCalculadora {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		Calculadora calculadora = new Calculadora();
		
		System.out.println("Informe um n�mero: ");
		double valor1 = leitor.nextDouble();
		
		System.out.println("Informe outro n�mero: ");
		double valor2 = leitor.nextDouble();
		
		System.out.println("Escolha uma opera��o: "
				+ "\n1 - Soma"
				+ "\n2 - Subtra��o"
				+ "\n3 - Multiplica��o"
				+ "\n4 - Divis�o"
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