package br.com.serratec.abono.salario;

public class Funcionario {
	private String nome;
	private String cargo;
	private double salario;
	
	    public String getNome() {
	        return nome;
	    }
	    public void setNome(String nome) {
	        this.nome = nome;
	    }
	    public String getCorgo() {
	        return cargo;
	    }
	    public void setCorgo(String corgo) {
	        this.cargo = corgo;
	    }
	    public double getSalario() {
	        return salario;
	    }
	    public void setSalario(double salario) {
	        this.salario = salario;
	    }

	    public double abonoSalario(double abono) {
	        return this.salario += abono;
	    }
	}
