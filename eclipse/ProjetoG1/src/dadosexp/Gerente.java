package dadosexp;

public class Gerente extends Funcionario {
	
	private String agenciaResponsavel;

	public Gerente(String tipoDeConta, String nome, String cpf, String senha, 
					String cargo, String agenciaResponsavel) {
		super(tipoDeConta, nome, cpf, senha, cargo);
		this.agenciaResponsavel = agenciaResponsavel;
	}
	public String getAgenciaResponsavel() {
		return agenciaResponsavel;
	}
	@Override
	public String toString() {
		return "Gerente:"
				+ "\nAgencia Responsavel: " + agenciaResponsavel 
				+ "\nCargo: " + getCargo()
				+ "\nNome: "+ getNome()
				+ "\nCpf:" + getCpf();
	}
}