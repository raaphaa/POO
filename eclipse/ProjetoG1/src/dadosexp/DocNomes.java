package dadosexp;

//import java.io.BufferedReader;
//import java.io.FileReader;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class DocNomes {
	public static void main(String[] args) throws IOException {
		
		//int qntddNomes = 0;

		File arquivo = new File("C:\\Users\\Residencia2021.2\\eclipse-workspace\\CONCLUSÃO\\Teste.txt");
		Scanner leitor = new Scanner(arquivo);
		leitor.useDelimiter(";");
		Scanner leiaNome = new Scanner(System.in);

		System.out.println("Digite o seu nome: ");
		String nome = leiaNome.nextLine();
		
		String nomeNaLista = leitor.findInLine(nome);
	
		for (int i = 0; i < arquivo.length(); i++) {
			if(nomeNaLista == nome) {	
				System.out.println("Bem vindo: " + nome);	
			}else 
			System.out.println("Nome não identificado!");
		}			
			try {
				nomeNaLista.equals(nome) ;
			}catch (NullPointerException e) {
				System.out.println("Nome fora da lista!");
			}
		leiaNome.close();
		leitor.close();
	}
}
/*
try {
	BufferedReader in = new BufferedReader(new FileReader("Teste.txt"));
	while(in.ready()) {
		String linha = in.readLine();
		qntddNomes += linha.length();
	}	
}catch (IOException e) {
	System.out.println("Erro ao acessar o arquivo");
}
do {
	System.out.println("Digite novamente: ");
	nome = leiaNome.next();
	if(nome != nomeNaLista) {
for(int i = 0; i < qntddNomes; i++) {
}
	}else {
		System.out.println("Nome encontrado na lista!");
	}
}while (nome != nomeNaLista);
*/