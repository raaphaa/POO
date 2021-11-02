package br.com.serratec.aula4.exercicios;

public class Medico {
	private int crm;
	private String nome;
	private double salario;
	private double valorDaConsulta;
	private static int totalMedicos;
	
	public Medico() {
		super();
		totalMedicos += 1;
	}

	public Medico(int crm, String nome, double salario, double valorDaConsulta) {
		super();
		this.crm = crm;
		this.nome = nome;
		this.salario = salario;
		this.valorDaConsulta = valorDaConsulta;
		totalMedicos += 1;
	}

	public int getCrm() {
		return crm;
	}

	public void setCrm(int crm) {
		this.crm = crm;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public double getValorDaConsulta() {
		return valorDaConsulta;
	}

	public void setValorDaConsulta(double valorDaConsulta) {
		this.valorDaConsulta = valorDaConsulta;
	}
	
	public static int getTotalMedicos() {
		return totalMedicos;
	}

	public static void setTotalMedicos(int totalMedicos) {
		Medico.totalMedicos = totalMedicos;
	}

	public void PagamentoEmDinheiro(double valorDaConsulta) {
		salario += valorDaConsulta;
	}
	
	public void PagamentoPlano(double valorDaConsulta) {
		salario += valorDaConsulta * 0.7;
	}
	
	public String toString() {
		return "Médico(a): \n[ CRM - " + crm + "]\n[ Nome: " + nome + "]\n[ Salário: " + salario + "]\n[ Valor da consulta: " + valorDaConsulta + "]\n";
	}
}