package br.com.serratec.VendaPassagens;

public class Passagem {
	private int idPassagem;
	private Usuario usuario;
	private CartaoCredito cartao;
	private Trem trem;
    
	public Passagem(int idPassagem, Usuario usuario) {
		super();
		this.idPassagem = idPassagem;
		this.usuario = usuario;
	}
	public CartaoCredito getCartao() {
		return cartao;
	}
	public void setCartao(CartaoCredito cartao) {
		this.cartao = cartao;
	}
	public Trem getTrem() {
		return trem;
	}
	public void setTrem(Trem trem) {
		this.trem = trem;
	}
	public int getIdPassagem() {
		return idPassagem;
	}
	public void setIdPassagem(int idPassagem) {
		this.idPassagem = idPassagem;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	@Override
	public String toString() {
		return "\n\nPassagem: " + idPassagem + usuario;
	}
	public String emitirPassagem(Usuario usuario, Trem trem, CartaoCredito cartao, boolean verificaCartao, boolean verificaTrem){
		String tS= toString();
		if (cartao.isCartaoESenha(usuario,true, true) && trem.isvalidarEspaco() == true) {
			System.out.println("Passagem emitida!");
			return tS;
		}
		return "Ops! Alguma informação está errada! Tente novamente.";
	}	
}