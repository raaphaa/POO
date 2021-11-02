package TesteFor;

public class TesteForBreak {
	public static void main(String[] args) {
		for(int contador = 1; contador <= 10; contador++) {
			if(contador == 5) {
				break;
			}
			System.out.println(contador);
		}
	}
}