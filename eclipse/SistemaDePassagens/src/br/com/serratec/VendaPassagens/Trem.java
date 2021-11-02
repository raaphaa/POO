package br.com.serratec.VendaPassagens;

public class Trem {
	private int espacoDisponivel;
	private long idTrem;
	
	public Trem(int espacoDisponivel, long idTrem) {
		super();
		this.espacoDisponivel = espacoDisponivel;
		this.idTrem = idTrem;
	}
	public int getEspacoDisponivel() {
		return espacoDisponivel;
	}
	public void setEspacoDisponivel(int espacoDisponivel) {
		this.espacoDisponivel = espacoDisponivel;
	}
	public long getIdTrem() {
		return idTrem;
	}
	public void setIdTrem(long idTrem) {
		this.idTrem = idTrem;
	}
	@Override
	public String toString() {
		return "Espaco disponivel no trem: " + espacoDisponivel + "\nId do trem: " + idTrem;
	}
	public boolean isvalidarEspaco() {
		if (espacoDisponivel >= 1 ) {
			System.out.println("Espaço disponível!");
			return true;
		} else {
			System.out.println("Espaço não disponível.");
		return false;
		}
	}
}