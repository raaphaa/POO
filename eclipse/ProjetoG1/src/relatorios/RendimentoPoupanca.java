package relatorios;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import br.com.serratec.conclusao.*;
import dadosexp.*;

public class RendimentoPoupanca {

	public static void pathRendimento(Conta conta, User user, double valor, int dias) throws IOException {
		final String PATH_BASICO = "./temp/";
		final String EXTENSAO = ".txt";
		Date date = new Date();
		SimpleDateFormat formatar = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss");
		String path = PATH_BASICO + formatar.format(date) + "_relatorio_rendimento_poupanca_" + user.getNome()
				+ EXTENSAO;
		escritorRendimento(path, conta, user, valor, dias);
	}

	public static void escritorRendimento(String path, Conta conta, User user, double valor, int dias)
			throws IOException {
		BufferedWriter buffWrite = new BufferedWriter(new FileWriter(path));
		String linha = "";
		Date date = new Date();
		SimpleDateFormat formatar = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		linha = "\n";
		buffWrite.append(linha + "\n");
		linha = "                                    ________                          ";
		buffWrite.append(linha + "\n");
		linha = "                             		 Banco G1                             ";
		buffWrite.append(linha + "\n");
		linha = "";
		buffWrite.append(linha + "\n");
		linha = "\n";
		buffWrite.append(linha + "\n");
		linha = "						Simula��o de rendimento";
		buffWrite.append("\n" + linha + "\n\n");
		linha = "Ol�, " + user.getNome() + "!";
		buffWrite.append(linha + "\n");
		linha = "Ag�ncia: " + conta.getAgencia() + "\nValor de aplica��o: " + valor + "\nQuantidade de dias: " + dias
				+ "\nRendimento previsto: " + ((ContaPoupanca)conta).getValorRendimento();
		buffWrite.append(linha + "\n\n");
		linha = "						  Fim do relat�rio";
		buffWrite.append(linha + "\n");
		linha = "Data: " + formatar.format(date);
		buffWrite.append(linha + "\n");
		linha = "				  Volte Sempre!";
		buffWrite.append(linha + "\n");

		buffWrite.close();
	}
}