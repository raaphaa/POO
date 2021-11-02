package relatorios;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import dadosexp.*;

public class TributoSeguroDeVida {
	
	public static void pathSeguro(Conta conta, User user, Cliente c) throws IOException {
		final String PATH_BASICO = "./temp/";
		final String EXTENSAO = ".txt";
		Date date = new Date();
		SimpleDateFormat formatar = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss");
		String path = PATH_BASICO + formatar.format(date) + "_relatorio_tributacao_seguro_de_vida_" + user.getNome() + EXTENSAO;
		escritorRendimento(path, conta, user, c);
	}

	public static void escritorRendimento(String path, Conta conta, User user, Cliente c) throws IOException {
		BufferedWriter buffWrite = new BufferedWriter(new FileWriter(path));
		String linha = "";
		Date date = new Date();
		SimpleDateFormat formatar = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		linha = "\n";
		buffWrite.append(linha + "\n");
		linha = "                                    ________                         ";
		buffWrite.append(linha + "\n");
		linha = "                             		 Banco G1                             ";
		buffWrite.append(linha + "\n");
		linha = "";
		buffWrite.append(linha + "\n");
		linha = "\n";
		buffWrite.append(linha + "\n");
		linha = "					Tributação do seguro de vida";
		buffWrite.append("\n" + linha + "\n\n");
		linha = "Olá, " + user.getNome() + "!";
		buffWrite.append(linha + "\n");
		linha = "Agência: " + conta.getAgencia() + "\nValor do tributo: R$ " + c.getSeguroDeVida();
		buffWrite.append(linha + "\n\n");
		linha = "							Fim do relatório";
		buffWrite.append(linha + "\n");
		linha = "Data: " + formatar.format(date);
		buffWrite.append(linha + "\n");
		linha = "				  Volte Sempre!";
		buffWrite.append(linha + "\n");

		buffWrite.close();
	}
}