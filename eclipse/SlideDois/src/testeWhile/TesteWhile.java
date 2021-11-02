package testeWhile;
import java.util.Scanner;

public class TesteWhile {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Informe o número final da contagem:");
		int numero = leitor.nextInt();
		
		int contador = 0;
		
		while ( contador <= numero) {
			System.out.println(contador);
			contador++;
		}
		leitor.close();
	}
}