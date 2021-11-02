package br.com.serratec.contato;

public class Contato {
	private String nome;
	private Endereco endereco;
	private Telefone[] telefones;
	
	public Contato(String nome, Endereco endereco) {
		super();
		this.nome = nome;
		this.endereco = endereco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Telefone[] getTelefone() {
		return telefones;
	}

	public void setTelefone(Telefone[] telefone) {
		
	}
	
	public void mostrarTelefones() {
		if (telefones != null) {
			for(int contadorTelefone = 0; contadorTelefone < telefones.length; contadorTelefone++) {
					System.out.println("Telefone: " + telefones[contadorTelefone].getNumero());
			}	
		}
	}
}