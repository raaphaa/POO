package br.com.serratec.aula4;

public class Pessoa {
	long idPessoa;
	String nome;
	private double peso;
	private double altura;
	
	public double calculaImc() {
		double imc = peso / (altura * altura);
		System.out.println(imc);
		return imc;
	}
	
	public String resultado() {
		if(calculaImc() < 18.5) {
			return "Abaixo do Peso";
			}else if(calculaImc() >= 18.5 && calculaImc() <= 24.9) {
				return "Peso Normal";
			}else {
				return "Acima do Peso";
			}
		}
	
	public void SetAltura(double altura) {
		if(altura > 0) {
			this.altura = altura;
			}
	}
	
	public void SetPeso(double peso) {
		if(peso > 0) {
			this.peso = peso;
			}
	}	
}