package br.com.serratec.anestesista;

public class Clinica extends Plano{
	protected String nomeClinica;
	protected String cgc;
	
	public Clinica(String empresa, String nomeClinica, String cgc) {
		super(empresa);
		this.nomeClinica = nomeClinica;
		this.cgc = cgc;
	}
	public String getNomeClinica() {
		return nomeClinica;
	}
	public void setNomeClinica(String nomeClinica) {
		this.nomeClinica = nomeClinica;
	}
	public String getCgc() {
		return cgc;
	}
	public void setCgc(String cgc) {
		this.cgc = cgc;
	}
	@Override
	public String toString() {
		return "\nClinica: " + nomeClinica + "\nCGC: " + cgc;
	}
}