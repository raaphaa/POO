package br.com.serratec.imovel;

public class MainImovel {
	public static void main(String[] args) {
		
		
		Imovel casa = new Imovel();
		Imovel apto = new Imovel(002, "Centro", "Apartamento", 25000);
		
		casa.setCodImovel(001);
		casa.setBairro("Quitandinha");
		casa.setTipoImovel("Casa");
		casa.setValor(98900);
		
		casa.reajustarValorImovel();
		apto.reajustarValorImovel();
		
		casa.categoriaImovel();
		System.out.println("Valor da " + casa.getTipoImovel() + " Reajustado: " + casa.getValor() + "\n");
		
		apto.categoriaImovel();
		System.out.println("Valor do " + apto.getTipoImovel() + " Reajustado: " + apto.getValor() + "\n");
		
	}
}