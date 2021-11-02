package br.com.serratec.slide.dois;
import java.util.Scanner;

public class CalculadoraSalario {
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Informe o seu salário: ");
		double salario = leitor.nextDouble();
		double percentual = 0;
		
		if(salario <= 1751.81){
			percentual = salario - salario * 8/100;
			
		}else if(salario >= 1751.82 && salario <= 2919.72){
			percentual = salario - salario * 9/100;
			
		}else if(salario >= 2919.73 && salario <= 5839.45){
			percentual = salario - salario * 10/100;
		}else{
			percentual = salario - salario * 11/100;
		}
		System.out.println("Salário com desconto: " + (salario - percentual));
		leitor.close();
	}
}