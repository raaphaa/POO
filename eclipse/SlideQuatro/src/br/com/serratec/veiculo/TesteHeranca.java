package br.com.serratec.veiculo;

public class TesteHeranca {
	public static void main(String[] args) {
		Caminhao c = new Caminhao();
		VeiculoPasseio vp = new VeiculoPasseio();
		
		vp.setPlaca("lvc-9889");
		vp.setQuantidadePortas(4);
		
		c.setCargaMaxima(1000);
		c.setPlaca("ABC-3454");
		
		vp.adicionaIPVA(400);
		c.adicionaIpva(400);
		System.out.println("O veículo com a placa: " + vp.getPlaca() + " tem " + vp.getQuantidadePortas() + " portas." + " Ipva: " + vp.getIpva());
		System.out.println("O veículo com a placa: " + c.getPlaca() + " tem a carga máxima de: " + c.getCargaMaxima() + " Ipva: " + c.getIpva());
	}
}