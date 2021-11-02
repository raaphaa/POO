package br.com.serratec.finall;
import java.time.LocalDate;

public class FuncionarioPublico {
	private String nome;
	private double salario;
	private final LocalDate anoConcurso;
	private int anoConcurso2;
	
	public FuncionarioPublico(String nome, double salario, LocalDate anoConcurso) {
		super();
		this.nome = nome;
		this.salario = salario;
		this.anoConcurso = anoConcurso;
	}
	public int getAnoConcurso2() {
		return anoConcurso2;
	}
	public void setAnoConcurso2(LocalDate anoConcurso,int anoConcurso2) {
		LocalDate localDate = LocalDate(anoConcurso);
		anoConcurso2 = localDate.getYear();
		this.anoConcurso2 = anoConcurso2;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public String getNome() {
		return nome;
	}
	public double getSalario() {
		return salario;
	}
	public LocalDate getAnoConcurso() {
		return anoConcurso;
	}
	
	public void createLocalDate(LocalDate anoConcurso,int anoConcurso2) {
		LocalDate localDate = LocalDate(anoConcurso);
		anoConcurso2 = localDate.getYear();
	}
	private LocalDate LocalDate(LocalDate anoConcurso) {
		// TODO Auto-generated method stub
		return anoConcurso;
	}
	@Override
	public String toString() {
		return "\nFuncionario: " + nome + "\nSalário: " + salario + "\nAno do concurso: " + anoConcurso2;
	}
}