package br.com.serratec.aula;

public class Erro {
	public static void main(String[] args) {
		int a = 10, b = 0, c = 0;
		try {
			c = a/b;
			System.out.println("Resultado: "+ c);
		} catch (Exception e) {
			System.out.println("N�o foi poss�vel calcular a divis�o.");
			System.out.println("Erro: " + e.getMessage());
		}
	}
}