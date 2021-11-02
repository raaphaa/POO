package br.com.serratec.olimpiadas.abstractt;

public class TestaAtleta {
	public static void main(String[] args) {
		Atleta a1 = new Atleta("Suécia", "Erik", 92, 10);
		String veri = a1.verificaSituacao();
		a1.setModalidade(veri);
		String ts = a1.toString();
		System.out.println(ts);
		
		System.out.println(" ");
		
		Atleta a2 = new Atleta("Suécia", "Gustavo", 58, 5);
		veri = a2.verificaSituacao();
		a2.setModalidade(veri);
		ts = a2.toString();
		System.out.println(ts);

		System.out.println(" ");
		
		Atleta a3 = new Atleta("Suécia", "Kristofer", 64, 5);
		veri = a3.verificaSituacao();
		a3.setModalidade(veri);
		ts = a3.toString();
		System.out.println(ts);
	}
}