package br.com.serratec.erro;

import java.util.Scanner;

public class LerNumeroExeptionProff {
	    public static void main(String[] args) {
	    	
	    	LerNumeroExeptionProff m = new LerNumeroExeptionProff();

	        System.out.println("Digite um n�mero inteiro: ");
	        try {
	            double num = m.lerNumero();
	            System.out.println("Voc� digitou o n�mero: " + num);
	        } catch (Exception e) {
	            System.out.println("Falha ao ler o n�mero!");
	        }
	    }

	    public double lerNumero() throws Exception {
	        Scanner in = new Scanner(System.in);
	        double num = in.nextDouble();
	        in.close();
	        return num;

	    }
}