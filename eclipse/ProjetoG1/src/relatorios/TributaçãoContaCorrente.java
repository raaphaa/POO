package relatorios;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import dadosexp.*;

public class TributaçãoContaCorrente {
	
	public static void pathTributacao(User user, Conta conta) throws IOException {
		final String PATH_BASICO = "./temp/";
		final String EXTENSAO = ".txt";
		final String OPERACAO = "tributacao_da_cc";
		Date date = new Date();
		SimpleDateFormat formatar = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss");
		String path = PATH_BASICO + formatar.format(date) + "_" + OPERACAO + "_" + user.getNome() + EXTENSAO;
		escritorTributacao(path, conta, user);
	}

	public static void escritorTributacao(String path, Conta conta, User user) throws IOException {
		BufferedWriter buffWrite = new BufferedWriter(new FileWriter(path));
		String linha = "";
		Date date = new Date();
		SimpleDateFormat formatar = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		linha = "\n";
		buffWrite.append(linha + "\n");
		linha = "                                    ________                          ";
		buffWrite.append(linha + "\n");
		linha = "                             		 Banco G1                           ";
		buffWrite.append(linha + "\n");
		linha = "";
		buffWrite.append(linha + "\n");
		linha = "\n";
		buffWrite.append(linha + "\n");
		linha = "					Tributação da Conta Corrente";
		buffWrite.append("\n" + linha + "\n\n");
		linha = "Olá, " + user.getNome() + "!";
		buffWrite.append(linha + "\n");
		linha = "Você gastou um total de R$ " + conta.getTotalTributos();
		buffWrite.append(linha + "\n\n");
		linha = "						Final da Tributação";
		buffWrite.append(linha + "\n");
		linha = "No nosso banco, a tributação para cada operação é:"
				+ "\n" + "Para o saque: R$ " + Tributos.saque
				+ "\nPara o depósito: R$ " + Tributos.deposito
				+ "\nPara as transferências: R$ " + Tributos.transferencia;
		buffWrite.append(linha + "\n\n");
		linha = "						  Fim do relatório";
		buffWrite.append(linha + "\n");
		linha = "Data: " + formatar.format(date);
		buffWrite.append(linha + "\n");
		linha = "				  Volte Sempre!";
		buffWrite.append(linha + "\n");

		buffWrite.close();
	}
}