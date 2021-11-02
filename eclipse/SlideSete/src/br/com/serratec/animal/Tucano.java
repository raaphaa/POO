package br.com.serratec.animal;

import java.time.LocalDate;

public class Tucano extends Ave {
	private double peso;

	public Tucano(String nome, LocalDate dataVacinacao, String cor, double peso) {
		super(nome, dataVacinacao, cor);
		this.peso = peso;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	@Override
	public String Voar() {
		// TODO Auto-generated method stub
		String voar = "Voam sozinhos ou aos pares.";
		return voar;
	}
	@Override
	public String emitirSom(){
		String som = "chalrear, gorjear";
		return som;
	}
}