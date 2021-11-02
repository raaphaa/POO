package dadosexp;

public abstract class Funcionario extends User{
	
	private String cargo;

	public Funcionario(String tipoDeConta, String nome, String cpf, String senha, String cargo) {
		super(tipoDeConta, nome, cpf, senha);
		this.cargo = cargo;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
}