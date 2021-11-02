package dadosexp;

public class User implements Comparable<User> {

	private String nome;
	private String cpf;
	private String senha;
	private String tipoDeConta;
	private static final int tamanhoCpf = 11;

	public User(String tipoDeConta, String nome, String cpf, String senha) {
		super();
		this.cpf = cpf;
		this.senha = senha;
		this.tipoDeConta = tipoDeConta;
	}
	public String getNome() {
		return nome;
	}
	public String getCpf() {
		return cpf;
	}
	public String getSenha() {
		return senha;
	}
	public String getTipoDeConta() {
		return tipoDeConta;
	}
	public String formatCpf() {
		if (this.cpf != null) {
			if (cpf.length() == tamanhoCpf) {

				return cpf.replaceAll("([0-9]{3})([0-9]{3})([0-9]{3})([0-9]{2})", "$1\\.$2\\.$3-$4");
			}
		}
		return ("Cpf inválido.");
	}
	@Override
    public int compareTo(User user) {
		return this.getNome().compareToIgnoreCase(user.getNome());
    }	
}