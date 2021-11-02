package relatorios;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import dadosexp.*;

public class RelatorioTransferencia {
	
	public static void pathTransferencia(Conta conta, double valor, User user, User destinatario)
			throws IOException {
		final String PATH_BASICO = "./temp/";
		final String EXTENSAO = ".txt";
		Date date = new Date();
		SimpleDateFormat formatar = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss");
		String path = PATH_BASICO + formatar.format(date) + "_transferencia_" + user.getNome() + EXTENSAO;
		escritorTransferencia(path, conta, user, valor, destinatario);
	}
	public static void escritorTransferencia(String path, Conta conta, User user, double valor, User destinatario)
			throws IOException {
		BufferedWriter buffWrite = new BufferedWriter(new FileWriter(path));
		String linha = "";
		Date date = new Date();
		SimpleDateFormat formatar = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		linha = "\n";
		buffWrite.append(linha + "\n");
		linha = "                                    _______                          ";
		buffWrite.append(linha + "\n");
		linha = "                             		 Banco G1                             ";
		buffWrite.append(linha + "\n");
		linha = "";
		buffWrite.append(linha + "\n");
		linha = "\n";
		buffWrite.append(linha + "\n");
		linha = "						Relatório de Transferência";
		buffWrite.append("\n" + linha + "\n\n");
		linha = "Olá, " + user.getNome() + "!";
		buffWrite.append(linha + "\n");
		linha = "Agência: " + conta.getAgencia() + "\nValor transferido: R$ " + valor + 
				"\nNome do destinatário: " + destinatario.getNome() + "\nCPF do destinatário: "
				+ destinatario.getCpf() + "\n\nSaldo atual: R$ " + conta.getSaldo();
		buffWrite.append(linha + "\n\n");
		linha = "						Fim do relatório";
		buffWrite.append(linha + "\n");
		linha = "Data: " + formatar.format(date);
		buffWrite.append(linha + "\n");
		linha = "				Volte Sempre!";
		buffWrite.append(linha + "\n");

		buffWrite.close();
	}
}