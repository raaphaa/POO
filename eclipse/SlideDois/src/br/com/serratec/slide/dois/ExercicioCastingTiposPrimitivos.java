package br.com.serratec.slide.dois;
import java.util.Scanner;

public class ExercicioCastingTiposPrimitivos {
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Informe um número: ");
		int numero1 = leitor.nextInt();
		
		System.out.println("Informe outro número: ");
		int numero2 = leitor.nextInt();
		
		int soma = numero1 + numero2;
		
		System.out.println("a soma é: " + soma);
		
		double divisao = (double)numero1 / (double) numero2;

		System.out.println("O resultado da divisão de " + numero1 + " por " + numero2 + " é: " + divisao);
		
		double divisao2 = ((double)numero1 + (double) numero2) / 2;

		System.out.println("O resultado da divisão de " + numero1 + " + " + numero2 + " / 2 é: " + divisao2);
		leitor.close();
	}
}