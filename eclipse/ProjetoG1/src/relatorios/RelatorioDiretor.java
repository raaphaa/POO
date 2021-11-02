package relatorios;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import dadosexp.*;

public class RelatorioDiretor {

	public static void informacaoClientes(Conta conta, User u, List<User> listaUser, List<Conta> listaConta)
			throws IOException {
		Collections.sort(listaUser);
		for (int i = 0; i < listaUser.size(); i++) {
			System.out.println("----------------------------------- "
					+ "\nNome do cliente: " + listaUser.get(i).getNome() 
					+ "\nCPF do cliente: " + listaUser.get(i).getCpf()
					+ "\nNumero da agência: " + listaConta.get(i).getAgencia()
					+ "\n-----------------------------------");
			System.out.println();
		}

		pathInformacaoCliente(conta, u, listaUser, listaConta);
	}

	public static void pathInformacaoCliente(Conta conta, User u, List<User> listaUser, List<Conta> listaConta)
			throws IOException {
		final String PATH_BASICO = "./temp/";
		final String EXTENSAO = ".txt";
		Date date = new Date();
		SimpleDateFormat formatar = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss");
		String path = PATH_BASICO + formatar.format(date) + "_relatorio_diretor_" + u.getNome() + EXTENSAO;
		escritorInformacaoCliente(path, conta, u, listaUser, listaConta);
	}

	public static void escritorInformacaoCliente(String path, Conta conta, User u, List<User> listaUser,
			List<Conta> listaConta) throws IOException {
		BufferedWriter buffWrite = new BufferedWriter(new FileWriter(path));
		String linha = "";
		Date date = new Date();
		SimpleDateFormat formatar = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		buffWrite.append(linha + "\n");
		linha = "                                    Banco G1                             ";
		buffWrite.append(linha + "\n");
		linha = "";
		buffWrite.append(linha + "\n");
		linha = "\n";
		buffWrite.append(linha + "\n");
		linha = "				Relatório: Informações dos clientes				";
		buffWrite.append("\n" + linha + "\n\n");
		linha = "Olá, " + u.getNome() + "!";
		buffWrite.append(linha + "\n");

		Collections.sort(listaUser);
		for (int i = 0; i < listaUser.size(); i++) {
			linha = "\n "
					+ "\nNome do cliente: " + listaUser.get(i).getNome() 
					+ "\nCPF do cliente: "	+ listaUser.get(i).getCpf() 
					+ "\nNúmero da agência: " + listaConta.get(i).getAgencia()
					+ "\n";
			buffWrite.append("\n" + linha + "\n");
		}
			linha = "\n				  			Fim do relatório				  			";
			buffWrite.append(linha + "\n");
			linha = "Data: " + formatar.format(date);
			buffWrite.append(linha + "\n");
			linha = "				  Volte Sempre!				  ";
			buffWrite.append(linha + "\n");
			
		buffWrite.close();
	}
}