package relatorios;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import dadosexp.*;

public class RelatorioSaque {
	
	public static void pathSaque(Conta conta, User user, double valor) throws IOException {
		final String PATH_BASICO = "./temp/";
		final String EXTENSAO = ".txt";
		Date date = new Date();
		SimpleDateFormat formatar = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss");
		String path = PATH_BASICO + formatar.format(date) + "_saque_" + user.getNome() + EXTENSAO;
		escritorSaque(path, conta, user, valor);	
	}
	
	public static void escritorSaque(String path, Conta conta, User user, double valor) throws IOException {
		BufferedWriter buffWrite = new BufferedWriter(new FileWriter(path));
		String linha = "";
		Date date = new Date();
		SimpleDateFormat formatar = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		linha = "\n"; 
		buffWrite.append(linha + "\n");
		linha = "                                    _______                          ";
		buffWrite.append(linha + "\n");
		linha = "                              		 Banco G1                             ";
		buffWrite.append(linha + "\n");
		linha = "";
		buffWrite.append(linha + "\n");
		linha = "\n";
		buffWrite.append(linha + "\n");
		linha = "							Relatório de saque";
		buffWrite.append("\n" + linha + "\n\n");
		linha = "Olá, " + user.getNome() + "!";
		buffWrite.append(linha + "\n");
		linha = "Agência: " + conta.getAgencia() + "\nValor sacado: R$ " + valor + "\nSaldo: R$ " + conta.getSaldo();
			buffWrite.append(linha + "\n\n");
		linha = "						  Fim do relatório";
		buffWrite.append(linha + "\n");
		linha = "Data: " + formatar.format(date);
		buffWrite.append(linha + "\n");
		linha = "					Volte Sempre!";
		buffWrite.append(linha + "\n");

		buffWrite.close();
	}
}