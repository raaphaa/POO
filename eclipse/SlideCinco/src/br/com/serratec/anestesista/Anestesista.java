package br.com.serratec.anestesista;

public class Anestesista extends Medico {
	private String Anestesista;
	
	public Anestesista(String empresa, String nomeMedico, int crm, String Anestesista) {
		super(empresa, nomeMedico, crm);
		this.Anestesista = Anestesista;
	}
	public String getAnestesista() {
		return Anestesista;
	}
	public void setTipoAnestesista(String Anestesista) {
		this.Anestesista = Anestesista;
	}
	@Override
	public double calcularPagamento() {
		valorPago = super.calcularPagamento()+ 1000;
		return valorPago;
	}
	@Override
	public String toString() {
		return "\nAnestesista: " + Anestesista + "\nMedico: " + nomeMedico + "\ncrm:" + crm
				+ "\nempresa: " + empresa + "\nvalorPago: " + valorPago;
	}
}