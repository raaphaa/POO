package br.com.serratec.slide.dois;
import java.util.Scanner;

public class SwitchCase {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Informe uma nota para avalia��o entre 1(P�ssimo) e 5(Excelente):");
		int avalia��o = leitor.nextInt();
		
		switch (avalia��o) {
		case 1: 
			System.out.println("P�ssimo");
			break;
		case 2:
			System.out.println("Ruim");
			break;
		case 3:
			System.out.println("Regular");
			break;
		case 4:
			System.out.println("Bom");
			break;
		case 5:
			System.out.println("Excelente");
			break;
		default:
			System.out.println("Informe uma nota v�lida!");
			break;
		}
		leitor.close();
	}
}