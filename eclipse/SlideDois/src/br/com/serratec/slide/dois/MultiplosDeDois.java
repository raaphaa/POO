package br.com.serratec.slide.dois;
import java.util.Scanner;

public class MultiplosDeDois {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Informe o n�mero desejado: ");
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

		System.out.println("\n" + "N�mero pares: " + numeroPar);
		System.out.println("N�mero impares: " + numeroImpar);
		leitor.close();
	}
}