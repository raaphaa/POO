package TesteFor;

public class TesteForContinue {
	public static void main(String[] args) {
		// n�o imprime o 2
		System.out.println("N�o imprime o 2");
		for (int contador = 1; contador <= 10; contador++) {
			if (contador == 2) {
				continue;
			}
			System.out.println(contador);
		}
		// imprime a partir de 2
		System.out.println("Imprime a partir de 2");
		for (int contador = 1; contador <= 10; contador++) {
			if (contador < 2) {
				continue;
			}
			System.out.println(contador);
		}
		// n�o imprime o 5 nem o 6
		System.out.println("N�o imprime o 5 nem o 6");
		for (int contador = 1; contador <= 10; contador++) {
			if (contador == 5 || contador == 6) {
				continue;
			}
			System.out.println(contador);
		}
		// n�o imprime o 5 nem o 6
		System.out.println("Imprime um * em vez de 5 e 6");
		for (int contador = 1; contador <= 10; contador++) {
			if (contador == 5 || contador == 6) {
				System.out.println("*");
				continue;
			}
			System.out.println(contador);
		}
	}
}