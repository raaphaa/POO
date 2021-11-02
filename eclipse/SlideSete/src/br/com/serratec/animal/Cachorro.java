package br.com.serratec.animal;

import java.time.LocalDate;

public class Cachorro extends Mamifero implements AnimalDomestico {
	private boolean castrado;

	public Cachorro(String nome, LocalDate dataVacinacao, String raca, boolean castrado) {
		super(nome, dataVacinacao, raca);
		this.castrado = castrado;
	}

	public boolean isCastrado() {
		return castrado;
	}

	public void setCastrado(boolean castrado) {
		this.castrado = castrado;
	}

	@Override
	public String emitirSom() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public boolean levarVeterinario() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean alimentar() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void amamentar() {
		// TODO Auto-generated method stub
		
	}
	
}