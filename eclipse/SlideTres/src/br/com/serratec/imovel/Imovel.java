package br.com.serratec.imovel;

public class Imovel {
	private int codImovel;
	private String bairro;
	private String tipoImovel;
	private double valor;
	
	public Imovel() {
		super();
	}

	public Imovel(int codImovel, String bairro, String tipoImovel, double valor) {
		super();
		this.codImovel = codImovel;
		this.bairro = bairro;
		this.tipoImovel = tipoImovel;
		this.valor = valor;
	}

	public int getCodImovel() {
		return codImovel;
	}

	public void setCodImovel(int codImovel) {
		this.codImovel = codImovel;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getTipoImovel() {
		return tipoImovel;
	}

	public void setTipoImovel(String tipoImovel) {
		this.tipoImovel = tipoImovel;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public void reajustarValorImovel() {
		 if (tipoImovel == "casa") {
				valor = valor + valor * 0.05; 
			}else{
				valor = valor + valor * 0.08; 	
			}
	}
	
	public void categoriaImovel() {
		if (valor > 10000 && valor < 50000) {
			System.out.println("Categoria B ");
		} else if (valor < 10000) {
			System.out.println("Categoria C ");
		}else {
			System.out.println("Categoria A ");
		}
	}
}