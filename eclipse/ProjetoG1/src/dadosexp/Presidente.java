package dadosexp;

public class Presidente extends User{
	
	private String empresaCoordenada;

	public Presidente(String tipoDeConta, String nome, String cpf, String senha,
						String empresaCoordenada) {
		super(tipoDeConta, nome, cpf, senha);
		this.empresaCoordenada = empresaCoordenada;
	}
	public String getEmpresaCoordenada() {
		return empresaCoordenada;
	}
	@Override
	public String toString() {
		return "Presidente: "
				+ "\nEmpresa Coordenada: " + empresaCoordenada 
				+ "\nNome: " + getNome() 
				+ "\nCpf: "	+ getCpf();
	}	
}