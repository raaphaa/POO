package br.com.serratec.anestesista;

public class Medico extends Plano {
	protected String nomeMedico;
	protected int crm;
	
	public Medico(String empresa, String nomeMedico, int crm) {
		super(empresa);
		this.nomeMedico = nomeMedico;
		this.crm = crm;
	}
	public String getNomeMedico() {
		return nomeMedico;
	}
	public void setNomeMedico(String nomeMedico) {
		this.nomeMedico = nomeMedico;
	}
	public int getCrm() {
		return crm;
	}
	public void setCrm(int crm) {
		this.crm = crm;
	}
	@Override
	public double calcularPagamento() {
		
		valorPago = super.calcularPagamento()  * 1.10;
		return valorPago;
	}
	@Override
	public String toString() {
		return "\nMedico: " + nomeMedico + "\ncrm: " + crm + "\nempresa: " + empresa + "\nvalorPago: " + String.format("%.2f",valorPago);
	}
}