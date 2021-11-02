package br.com.serratec.polimorfismo.empregado;

public class TestaEmpregado {
	public static void main(String[] args) {
		
		//O Polimorfismo só existe com a Herança!!!
		
		//Tecnico é um Empregado. O Polimorfismo é utilizado.
		//Inicializamos um Tecnico que é um Empregado.
		
		Empregado e = new Tecnico(); //Polimorfismo
		
		e.setNome("Maria Luiza");
		e.setSalario(2000.);
		
		e.adicionalSalario(); // o Método invocado é o do tecnico, não o de Empregado!
		
		System.out.println(e.getNome() + " - " + e.getSalario());
		
		
		Empregado e1 = new Empregado();// SEM Polimorfismo
		e1.setNome("Ana Lucia");
		e1.setSalario(1000.);
		e1.adicionalSalario();
		System.out.println(e1.getNome() + " - " + e1.getSalario());
	}
}