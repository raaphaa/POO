package br.com.serratec.maratonista;

public class AtletaAmador extends Maratonista{
	private boolean atestado;

	public AtletaAmador(String nome, String sexo, int idade, double altura, boolean atestado) {
		super(nome, sexo, idade, altura);
		this.atestado = atestado;
	}

	public boolean isAtestado() {
		if(atestado == true) {
			return true;
		}else {
			return false;
		}
	}

	public void setAtestado(boolean atestado) {
		this.atestado = atestado;
	}
	
	public String verificaSituacao(int idade, double altura) {
		if(idade > 18 && altura >= 1.80 && atestado == true) {
			return "Pode participar!";
		}else {
			 return "Não pode participar!";
		}
	}

	@Override
	public String toString() {
		return "\nNome: " + nome + "\nSexo: " + sexo + "\nIdade: " + idade + "\nAltura: " + altura +"\nAtestado do atleta amador é : " + atestado;
	
	}
	
}