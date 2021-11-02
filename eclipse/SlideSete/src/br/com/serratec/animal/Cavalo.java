package br.com.serratec.animal;

import java.time.LocalDate;

public class Cavalo extends Mamifero implements AnimalCompeticao{
	private String marcaFerradura;

	public Cavalo(String nome, LocalDate dataVacinacao, String raca, String marcaFerradura) {
		super(nome, dataVacinacao, raca);
		this.marcaFerradura = marcaFerradura;
	}
	public String getMarcaFerradura() {
		return marcaFerradura;
	}
	public void setMarcaFerradura(String marcaFerradura) {
		this.marcaFerradura = marcaFerradura;
	}
	@Override
	public void amamentar() {
		// TODO Auto-generated method stub
		String amamentacao = "Criadores costumam desmamar o potro aos 4 ou aos 6 meses.";
		amamentacao.toString();//não faz nada 
	}
	@Override
	public String emitirSom() {
		// TODO Auto-generated method stub  
		String som = "relinchar, rinchar, bufar";
		return som;
	}
	/*
	@Override
	public void trocarFerradura() {
		String ferradura;
		if (ferradura  == "velha") {
			ferradura = "trocar";			
		}		
	}*/
	@Override
	public void viajar() {
		
	}
	@Override
	public void trocarFerradura() {
		// TODO Auto-generated method stub
		
	}
	
}