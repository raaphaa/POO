package testeWhile;
import java.util.Scanner;

public class TesteDoWhile {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Informe o número final da contagem:");
		int numero = leitor.nextInt();
		
		int contador = 1;
		
		do {
			System.out.println(contador);
			contador++;
		}while ( contador <= numero) ;			
		
		leitor.close();
	}
}