package br.com.serratec.slide.dois;
import java.util.Scanner;

public class ExercicioCastingTiposPrimitivos {
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Informe um n�mero: ");
		int numero1 = leitor.nextInt();
		
		System.out.println("Informe outro n�mero: ");
		int numero2 = leitor.nextInt();
		
		int soma = numero1 + numero2;
		
		System.out.println("a soma �: " + soma);
		
		double divisao = (double)numero1 / (double) numero2;

		System.out.println("O resultado da divis�o de " + numero1 + " por " + numero2 + " �: " + divisao);
		
		double divisao2 = ((double)numero1 + (double) numero2) / 2;

		System.out.println("O resultado da divis�o de " + numero1 + " + " + numero2 + " / 2 �: " + divisao2);
		leitor.close();
	}
}