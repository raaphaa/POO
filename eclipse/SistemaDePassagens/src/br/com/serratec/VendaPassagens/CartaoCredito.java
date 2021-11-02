package br.com.serratec.VendaPassagens;
import java.time.LocalDate;

public class CartaoCredito {
	private LocalDate dataValidade;
	private Usuario usuario;

	public CartaoCredito(LocalDate dataValidade, Usuario usuario) {
		super();
		this.dataValidade = dataValidade;
	}
	public LocalDate getDataValidade() {
		return dataValidade;
	}
	public void setDataValidade(LocalDate dataValidade) {
		this.dataValidade = dataValidade;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public boolean isDataValidade() {
		LocalDate hoje = LocalDate.now();
		hoje.getMonth();
		
		if (dataValidade.plusMonths(3).isAfter(hoje)) {
			System.out.println("Cart�o v�lido!");
			return true;
		} else {
			System.out.println("Cart�o inv�lido! Informe outro cart�o!");
			return false;
		}
	}
	public boolean isCartaoESenha(Usuario usuario, boolean validade, boolean senha) {
		if (isDataValidade() == true && usuario.isSenha(usuario.getSenha()) == true) {
			System.out.println("Cart�o e senha v�lidos.");
			return true;
		} else {
			System.out.println("Cart�o ou senha inv�lidos!");
			return false;
		}
	}
}