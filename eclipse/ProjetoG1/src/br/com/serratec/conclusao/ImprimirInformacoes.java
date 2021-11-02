package br.com.serratec.conclusao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import dadosexp.*;
import enumm.*;

public class ImprimirInformacoes {

	public static void leitorPessoas(String path, List<User> listaUser) throws IOException {

		BufferedReader buffRead = new BufferedReader(new FileReader(path));

		String linha = "";

		while (true) {

			linha = buffRead.readLine();

			if (linha != null) {
				String[] split = linha.split(",");

				if (split[2].equalsIgnoreCase(PessoasEnum.DIRETOR.name())) {
					Diretor d = new Diretor(split[0], split[1], split[2],split[3], split[4], split[5]);
					listaUser.add(d);

				} else if (split[2].equalsIgnoreCase(PessoasEnum.GERENTE.name())) {
					Gerente g = new Gerente(split[0], split[1], split[2],split[3], split[4], split[5]);
					listaUser.add(g);
				} else if (split[2].equalsIgnoreCase(PessoasEnum.PRESIDENTE.name())) {
					Presidente p = new Presidente(split[0], split[1], split[2],split[3], split[4]);
					listaUser.add(p);
				} else if (split[2].equalsIgnoreCase(PessoasEnum.CLIENTE.name())) {
					Cliente c = new Cliente(split[0], split[1], split[2], split[3]);
					listaUser.add(c);
				}
			} else {
				break;
			}
		}
		buffRead.close();
	}
	public static void leitorContas(String path, List<Conta> listaConta) throws IOException {

		BufferedReader buffRead = new BufferedReader(new FileReader(path));

		String linha = "";

		while (true) {

			linha = buffRead.readLine();

			if (linha != null) {
				String[] split = linha.split(",");

				if (split[3].equalsIgnoreCase(ContasEnum.CONTACORRENTE.name())) {
					Cliente cli = new Cliente(split[6],split[0],split[1],split[3]);
					Agencia ag = new Agencia(Integer.parseInt(split[5]));
					double saldo = Double.parseDouble(split[4]);
					
					ContaCorrente cc = new ContaCorrente(cli, ag, saldo);
					listaConta.add(cc);
				} else if (split[3].equalsIgnoreCase(ContasEnum.CONTAPOUPANCA.name())) {
					Cliente cli = new Cliente(split[6],split[0],split[1],split[3]);
					Agencia ag = new Agencia(Integer.parseInt(split[5]));
					double saldo = Double.parseDouble(split[4]);
					
					ContaPoupanca cp = new ContaPoupanca(cli, ag, saldo);
					listaConta.add(cp);
				}
			} else {
				break;
			}
		}
		buffRead.close();
	}
}