package br.com.serratec.VendaPassagens;
import java.time.LocalDate;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite o seu nome: ");
		String nome = leitor.nextLine();
		
		System.out.println("Digite uma senha numérica: ");
		int senha = leitor.nextInt();
		
		Usuario usuario = new Usuario(nome, senha, 001);
		Trem trem1 = new Trem( 4, 995432);
		
		LocalDate dataValidadeCartao;
		dataValidadeCartao = LocalDate.of(2021, 7,8);
		
		CartaoCredito cartãoRobertin = new CartaoCredito(dataValidadeCartao, usuario);
		Passagem passagem = new Passagem(001,usuario);
		
		String menu = Destino.menuDestino();
		System.out.println(menu);
		int lerMenu = leitor.nextInt();
		
		Destino.escolherDestino(lerMenu);
		System.out.println(Destino.escolherDestino(lerMenu));
		
		boolean validade = cartãoRobertin.isDataValidade();
		System.out.println("Informe sua senha: ");
		int confirasenha = leitor.nextInt();
		
		boolean issenha = usuario.isSenha(confirasenha);
		
		boolean cartaoesenha = cartãoRobertin.isCartaoESenha(usuario,validade, issenha);
		
		boolean espaco = trem1.isvalidarEspaco();
		
		String ts = passagem.emitirPassagem(usuario,trem1,cartãoRobertin,cartaoesenha, espaco);
		
		System.out.println(ts);
		
			switch (lerMenu) {
			case 1:
				System.out.println("Destino: " + Destino.RIO_DE_JANEIRO);
				break;
			case 2:
				System.out.println("Destino: " + Destino.SAO_PAULO);			
				break;
			case 3:
				System.out.println("Destino: " + Destino.CAXIAS);
				break;
			case 4:
				System.out.println("Destino: " + Destino.DISTRITO_FEDERAL);
				 break;
			case 5:
				System.out.println("Destino: " + Destino.BAHIA);
				 break;
			default:
				System.out.println("Destino: " + Destino.erro);
				 break;
			}
		leitor.close();
	}
}