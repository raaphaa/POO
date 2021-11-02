package br.com.serratec.slide.dois;
import java.util.Scanner;

public class MultiplosDeDois {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Informe o número desejado: ");
		int numero = leitor.nextInt();
		
		int numeroPar = 0;
		int numeroImpar = 0;
		for(int contador = 0; contador <= numero; contador++) {
			if(contador % 2 == 0) {
				numeroPar += 1; 
				System.out.println(contador + " - Java");
				
			}else {
				numeroImpar += 1;
				System.out.println(contador);
			}
		}

		System.out.println("\n" + "Número pares: " + numeroPar);
		System.out.println("Número impares: " + numeroImpar);
		leitor.close();
	}
}