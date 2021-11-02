package br.com.serratec.slide.dois;
import java.util.Scanner;

public class CalculadoraMedia {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		double media = 0;
		
		System.out.println("Informe a Nota 1:");
		double nota1 = leitor.nextDouble();
		
		System.out.println("Informe a Nota 2:");
		double nota2 = leitor.nextDouble();
		
		System.out.println("Informe a Nota 3:");
		double nota3 = leitor.nextDouble();
		
		System.out.println("Informe a Nota 4:");
		double nota4 = leitor.nextDouble();
		
		media = (nota1 + nota2 + nota3 + nota4) /4;
		
		System.out.println("A média é: " + media);
		leitor.close();
	}
}