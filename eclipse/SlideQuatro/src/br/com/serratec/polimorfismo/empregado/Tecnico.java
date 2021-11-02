package br.com.serratec.polimorfismo.empregado;

public class Tecnico extends Empregado {
	@Override
	public double adicionalSalario() {
		return this.salario *= 1.15;	
	}
}