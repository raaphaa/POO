package dadosexp;

public class Diretor extends Funcionario{
		
	private String atividadesDeControle;
	
	public Diretor(String tipoDeConta, String nome, String cpf, String senha, String cargo,
			String atividadesDeControle) {
		super(tipoDeConta, nome, cpf, senha, cargo);
		this.atividadesDeControle = atividadesDeControle;
	}
	public String getAtividadesDeControle() {
		return atividadesDeControle;
	}
	@Override
	public String toString() {
		return "Diretor:"
				+ "\nAtividades de Controle: " + atividadesDeControle 
				+ "\nCargo: " + getCargo() 
				+ "\nNome: "	+ getNome() 
				+ "\nCpf: " + getCpf();
	}
}