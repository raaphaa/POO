package br.com.serratec.slide.dois;

public class ParesEImpares {
	public static void main(String[] args) {
		int numeroPar = 0;
		int numeroImpar = 0;
		for(int contador = 0; contador <= 30; contador++) {
			if(contador % 2 == 0) {
				numeroPar += 1; 
				System.out.println(contador);
				
			}else {
				numeroImpar += 1;
				System.out.println(contador);
			}
		}

		System.out.println("\n" + "Número pares: " + numeroPar);
		System.out.println("Número impares: " + numeroImpar);
	}
}