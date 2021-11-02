package br.com.serratec.VendaPassagens;

public enum Destino {

	RIO_DE_JANEIRO(1, 65.80, "Rio de Janeiro"), 
	SAO_PAULO(2, 94.70,"São Paulo"), 
	CAXIAS(3, 16.15,"Duque de Caxias"), 
	DISTRITO_FEDERAL(4, 198.97,"Distrito Federal"),
	BAHIA(5, 328.35,"Bahia"),
	erro(999999999,999999999,"Erro! Selecione um destino válido!");

	private final int idDestino;
	private final double valorDestino;
	private final String nome;

	private Destino(int idDestino, double valorDestino, String nome) {
		this.idDestino = idDestino;
		this.valorDestino = valorDestino;
		this.nome = nome;
	}
	@Override
	public String toString() {
		return this.nome;
	}
	public int getIdDestino() {
		return idDestino;
	}
	public double getValorDestino() {
		return valorDestino;
	}
	public static Destino escolherDestino(int menu) {
		switch (menu) {
		case 1:
			return Destino.RIO_DE_JANEIRO;
		case 2:
			return Destino.SAO_PAULO;
		case 3:
			return Destino.CAXIAS;
		case 4:
			return Destino.DISTRITO_FEDERAL;
		case 5:
			return Destino.BAHIA;
		default:
			return Destino.erro;
		}
	}
	public static String menuDestino() {
		return "Escolha o destino desejado!" 
				+ "\n1 - Rio de Janeiro" 
				+ "\n2 - São Paulo" 
				+ "\n3 - Caxias"
				+ "\n4 - Distrito Federal" 
				+ "\n5 - Bahia";
	}
}