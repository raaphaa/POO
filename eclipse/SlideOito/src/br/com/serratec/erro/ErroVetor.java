package br.com.serratec.erro;

public class ErroVetor {
	public static void main(String[] args) {
		int[] numerador = {1,2,3,4,5};
		int[] denominador = {3,0,2};
		
		for(int contador = 0; contador < numerador.length; contador++) {
			try {
				int divisao = numerador[contador] / denominador[contador];
				System.out.println("Divivindo: " + numerador[contador] + " por "+ denominador [contador] + " = " + divisao );	
			} catch (ArithmeticException e) {
				System.out.println("Ocorreu um problema na divisão");
			}catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Ocorreu um problema! Um Array é maior que o outro!");
			}
		}
	}
}