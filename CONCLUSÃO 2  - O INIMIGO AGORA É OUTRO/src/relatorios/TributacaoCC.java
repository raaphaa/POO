package relatorios;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import conta.Conta;
import conta.Tributos;
import pessoal.Pessoa;

public class TributacaoCC {

	public static void pathTributacao(Pessoa p, Conta conta) throws IOException {
		final String PATH_BASICO = "./temp/";
		final String EXTENSAO = ".txt";
		final String OPERACAO = "tributacao_da_cc";
		Date date = new Date();
		SimpleDateFormat formatar = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss");
		String path = PATH_BASICO + formatar.format(date) + "_" + OPERACAO + "_" + p.getNome() + EXTENSAO;
		escritorTributacao(path, conta, p);
	}

	public static void escritorTributacao(String path, Conta conta, Pessoa p) throws IOException {
		BufferedWriter buffWrite = new BufferedWriter(new FileWriter(path));
		String linha = "";
		Date date = new Date();
		SimpleDateFormat formatar = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		linha = "************************************************************";
		buffWrite.append(linha + "\n");
		linha = "                                    _______                          ";
		buffWrite.append(linha + "\n");
		linha = "                             � Bradock Bank �                             ";
		buffWrite.append(linha + "\n");
		linha = "";
		buffWrite.append(linha + "\n");
		linha = "************************************************************";
		buffWrite.append(linha + "\n");
		linha = "-----------------Tributa��o da Conta Corrente----------------";
		buffWrite.append("\n" + linha + "\n\n");
		linha = "Ol�, " + p.getNome() + "!";
		buffWrite.append(linha + "\n");
		linha = "Voc� gastou um total de R$ " + conta.getTotalTributos();
		buffWrite.append(linha + "\n\n");
		linha = "-----------------------Final da Tributa��o-----------------------";
		buffWrite.append(linha + "\n");
		linha = "No nosso banco, a tributa��o para cada opera��o �:\n" + "Para o saque: R$ " + Tributos.saque
				+ "\nPara o dep�sito: R$ " + Tributos.deposito + "\nPara as transfer�ncias: R$ " + Tributos.transferencia;
		buffWrite.append(linha + "\n\n");
		linha = "-------------------------Fim do relat�rio--------------------------";
		buffWrite.append(linha + "\n");
		linha = "Data: " + formatar.format(date);
		buffWrite.append(linha + "\n");
		linha = "________________Volte Sempre!________________";
		buffWrite.append(linha + "\n");

		buffWrite.close();
	}
}