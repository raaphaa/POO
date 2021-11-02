package br.com.serratec.pessoaimovel;

import java.util.Scanner;

public class Teste {
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Nome : ");
		String nome = leitor.next();
		
		Pessoa pessoa = new Pessoa(nome, "2738137","2233-4455");
		Imovel imovel = new Imovel("Quitandinha", "Casa", 1000000, pessoa);
		
		String imovelToString = imovel.toString();
		
		System.out.println(imovelToString);
		leitor.close();
	}
}