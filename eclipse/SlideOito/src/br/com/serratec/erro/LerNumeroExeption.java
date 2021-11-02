package br.com.serratec.erro;
import java.util.Scanner;

public class LerNumeroExeption {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite um n�mero inteiro: ");
		try {
			double numero = leitor.nextDouble();
			System.out.println("Voc� digitou: " + numero);
		} catch (Exception e) {
			System.out.println("Falha ao ler o n�mero!");

		}
		leitor.close();
	}
}