package exercicios;

public class SegundaClasse {

	public static void main(String[] args) {

		Calculadora c = new Calculadora();

		float resultado = c.Somar(30, 20);
		// float resultado = c.Subtrair(30, 20);
		// float resultado = c.Dividir(30, 20);
		// float resultado = c.Multiplicar(30, 20);

		System.out.println("O Resultado da soma é: " + resultado);
		// System.out.println("O Resultado da subtração é: " + resultado);
		// System.out.println("O Resultado da divisão é: " + resultado);
		// System.out.println("O Resultado da multiplicação é: " + resultado);
	}
}