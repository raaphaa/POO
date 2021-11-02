package br.com.serratec.slide.dois;

public class SituacaoAluno {
	public static void main(String[] args) {
		float nota1 = 5, nota2 = 8;
		float media = (nota1 + nota2)/2;
		System.out.println("A média é: " + media);
		
		if (media >= 7 && media < 10) {
			System.out.println("Aprovado.");
		} else if (media == 10) {
			System.out.println("Aprovado! Parabéns!");
		}else {
			System.out.println("Reprovado.");
		}
	}
}