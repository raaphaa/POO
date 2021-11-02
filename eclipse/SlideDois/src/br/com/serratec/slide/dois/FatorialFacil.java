package br.com.serratec.slide.dois;

public class FatorialFacil {
	public static void main(String[] args) {
		
		int numero = 1;
		int fatorial = 1;
		
		for(numero = 1; numero <=10; numero ++) {
			fatorial *= numero;
			System.out.println("O fatorial de " + numero + " é: " + fatorial);
		}
	}
}