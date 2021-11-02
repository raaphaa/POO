package br.com.serratec.polimorfismo.empregado;

public class TestaEmpregado {
	public static void main(String[] args) {
		
		//O Polimorfismo s� existe com a Heran�a!!!
		
		//Tecnico � um Empregado. O Polimorfismo � utilizado.
		//Inicializamos um Tecnico que � um Empregado.
		
		Empregado e = new Tecnico(); //Polimorfismo
		
		e.setNome("Maria Luiza");
		e.setSalario(2000.);
		
		e.adicionalSalario(); // o M�todo invocado � o do tecnico, n�o o de Empregado!
		
		System.out.println(e.getNome() + " - " + e.getSalario());
		
		
		Empregado e1 = new Empregado();// SEM Polimorfismo
		e1.setNome("Ana Lucia");
		e1.setSalario(1000.);
		e1.adicionalSalario();
		System.out.println(e1.getNome() + " - " + e1.getSalario());
	}
}