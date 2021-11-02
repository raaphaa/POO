package br.com.serratec.maratonista;

public class TestaMaratonista {
	public static void main(String[] args) {
		AtletaProfissional ap = new AtletaProfissional("Arnaldo", "Masculino", 17, 1.90, 98 );
		String resultado = ap.verificaSituacao(ap.idade, ap.altura);
		String ts = ap.toString();
		
		System.out.println(ts);

		System.out.println(resultado);
		
		AtletaProfissional ap2 = new AtletaProfissional("Marcela", "Feminino", 20, 1.70, 80 );
		resultado = ap2.verificaSituacao(ap2.idade, ap2.altura);
		System.out.println(ap2.toString());
		System.out.println(resultado);
		
		AtletaProfissional ap3 = new AtletaProfissional("Ana", "Feminino", 20, 1.82, 87 );
		resultado = ap3.verificaSituacao(ap3.idade, ap3.altura);
		System.out.println(ap3.toString());
		System.out.println(resultado);
		
		AtletaAmador aa = new AtletaAmador("Roberta", "Feminino", 19, 1.65, true);
		resultado = aa.verificaSituacao(aa.idade, aa.altura);
		System.out.println(aa.toString());
		System.out.println(resultado);
		
		AtletaAmador aa2 = new AtletaAmador("Ronaldo", "Masculino", 18, 1.90, true);
		resultado = aa2.verificaSituacao(aa2.idade, aa2.altura);
		System.out.println(aa2.toString());
		System.out.println(resultado);
		
		AtletaAmador aa3 = new AtletaAmador("Robson", "Masculino", 19, 1.99, false);
		resultado = aa3.verificaSituacao(aa3.idade, aa3.altura);
		System.out.println(aa3.toString());
		System.out.println(resultado);
		
		AtletaAmador aa4 = new AtletaAmador("Maria", "Feminino", 23, 1.82, true);
		resultado = aa4.verificaSituacao(aa4.idade, aa4.altura);
		System.out.println(aa4.toString());
		System.out.println(resultado);
	}
}