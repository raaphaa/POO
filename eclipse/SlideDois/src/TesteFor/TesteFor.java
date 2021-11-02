package TesteFor;
import java.util.Scanner;

public class TesteFor {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Informe o número final da contagem:");
		int numero = leitor.nextInt();
		
		for(int contador = 1; contador <= numero; contador++) {
			System.out.println(contador);
		}
		leitor.close();
	}
}