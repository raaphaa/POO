package br.com.serratec.slide.dois;

public class TesteIfAnd {
	public static void main(String[] args) {
		int idade = 17;
		double altura = 1.6;
		
		if(idade >= 18 && altura > 1.8) {
			System.out.println("O atleta competir�");
		}else {
			System.out.println("O atleta n�o competir�");
		}
	}
}