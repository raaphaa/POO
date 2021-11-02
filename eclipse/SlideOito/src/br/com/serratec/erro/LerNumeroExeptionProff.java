package br.com.serratec.erro;

import java.util.Scanner;

public class LerNumeroExeptionProff {
	    public static void main(String[] args) {
	    	
	    	LerNumeroExeptionProff m = new LerNumeroExeptionProff();

	        System.out.println("Digite um número inteiro: ");
	        try {
	            double num = m.lerNumero();
	            System.out.println("Você digitou o número: " + num);
	        } catch (Exception e) {
	            System.out.println("Falha ao ler o número!");
	        }
	    }

	    public double lerNumero() throws Exception {
	        Scanner in = new Scanner(System.in);
	        double num = in.nextDouble();
	        in.close();
	        return num;

	    }
}