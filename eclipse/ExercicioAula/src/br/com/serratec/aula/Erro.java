package br.com.serratec.aula;

public class Erro {
	public static void main(String[] args) {
		int a = 10, b = 0, c = 0;
		try {
			c = a/b;
			System.out.println("Resultado: "+ c);
		} catch (Exception e) {
			System.out.println("Não foi possível calcular a divisão.");
			System.out.println("Erro: " + e.getMessage());
		}
	}
}