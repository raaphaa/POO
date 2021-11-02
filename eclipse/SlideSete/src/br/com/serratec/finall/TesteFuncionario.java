package br.com.serratec.finall;
import java.time.LocalDate;

public class TesteFuncionario {
	public static void main(String[] args) {
		LocalDate data;
		data = LocalDate.of(2021, 03, 03);
		createLocalDate(data);
		
		FuncionarioPublico fp = new FuncionarioPublico("Fernando", 2000., data);
		
		fp.setAnoConcurso2(data, 0);
		String ts = fp.toString();
		fp.getAnoConcurso();
		System.out.println(ts);
		
		data = LocalDate.of(1998, 07,27);
		createLocalDate(data);
		
		FuncionarioPublico fp2 = new FuncionarioPublico("Brenda", 1900.50, data);
		fp2.setAnoConcurso2(data, 0);
		ts = fp2.toString();
		fp2.getAnoConcurso();
		System.out.println(ts);
		
		data = LocalDate.of(1990, 04, 22);
		createLocalDate(data);
		
		FuncionarioPublico fp3 = new FuncionarioPublico("Pablo", 2250.97, data);
		fp3.setAnoConcurso2(data, 0);
		ts = fp3.toString();
		fp3.getAnoConcurso();
		System.out.println(ts);
	}
	private static void createLocalDate(LocalDate data) {
		LocalDate localDate = localDate(data);
		localDate.getYear();
	}
	private static LocalDate localDate(LocalDate data) {
		return data;
	}
}