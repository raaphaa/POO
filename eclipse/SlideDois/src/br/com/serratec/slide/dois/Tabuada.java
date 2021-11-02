package br.com.serratec.slide.dois;
import java.util.Scanner;

public class Tabuada {
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Informe um número para ver sua tabuada: ");
		int numero = leitor.nextInt();
		
		System.out.println("A tabuada de " + numero + " é: " + "\n\n");
		
		for(int contador = 1; contador <= 10; contador++) {
			int resultado = numero * contador;
			
			System.out.println(numero + " X " + contador + " = " + resultado);
			leitor.close();
		}
	}
}