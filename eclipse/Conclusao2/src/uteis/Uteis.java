package uteis;

public class Uteis {

	public final static void limpaTela() {
		try {
			new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		} catch (final Exception e) {
			e.printStackTrace();
		}
	}
	public final static void logo(){
		Uteis.limpaTela();
		System.out.println("*************************************************************");     
		System.out.println("                                                             ");
		System.out.println("                      � Bradock Bank �                       ");
		System.out.println();
		System.out.println("************************************************************");
	}
	public final static void sair() {
		logo();
		System.out.println("------------------------------------------------------------");
		System.out.println("                           Saindo                           ");
		System.out.println("------------------------------------------------------------");
		System.out.println("Obrigado por escolher o Bradock Bank! Tenha um �timo dia!");
	}
}