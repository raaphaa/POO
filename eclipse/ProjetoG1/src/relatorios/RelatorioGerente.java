package relatorios;

import br.com.serratec.conclusao.*;
import dadosexp.*;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class RelatorioGerente {

	public static int totalDeContasSupervisionadas(Gerente gerente, Conta conta, Agencia agencia, User user, int total) throws IOException {
		total = 0;
		if (agencia.getIdAgencia() == 001) {
			total = agencia.getTotalAgencia1();
		} else if (agencia.getIdAgencia() == 002) {
			total = agencia.getTotalAgencia2();
		}

		pathGerente(gerente, conta, agencia, user, total);
		return total;
	}

	public static void pathGerente(Gerente gerente, Conta conta, Agencia agencia, User user, int total) throws IOException {
		final String PATH_BASICO = "./temp/";
		final String EXTENSAO = ".txt";
		Date date = new Date();
		SimpleDateFormat formatar = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss");
		String path = PATH_BASICO + formatar.format(date) + "_relatorio_gerente_" + user.getNome() + EXTENSAO;
		escritorGerente(gerente, path, conta, user, total);
	}

	public static void escritorGerente(Gerente gerente, String path, Conta conta, User u, int total) throws IOException {
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
		linha = "					  Relatório: Total de contas					";
		buffWrite.append("\n" + linha + "\n\n");
		linha = "Olá, " + u.getNome() + "!";
		buffWrite.append(linha + "\n");
		linha = "Gerente: " + gerente.getCpf() + "\nTotal de contas supervisionadas: " + total;
		buffWrite.append(linha + "\n\n");
		linha = "							Fim do relatório							";
		buffWrite.append(linha + "\n");
		linha = "Data: " + formatar.format(date);
		buffWrite.append(linha + "\n");
		linha = "					Volte Sempre!					";
		buffWrite.append(linha + "\n");

		buffWrite.close();
	}
}