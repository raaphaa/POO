package br.com.serratec.oficina;
import java.time.LocalDate;

public class TesteOficina {
	public static void main(String[] args) {
		LocalDate dataCons = LocalDate.of(2021, 7, 17);
		
		Proprietario aceZ = new Proprietario("aceZ");
		
		Carro carro = new Carro("KAmaro", dataCons, aceZ, "Sedan");
		carro.trocarOleo();
		carro.revisao();
		String ts = carro.toString();
		System.out.println(ts);
		
		dataCons = LocalDate.of(2021, 8, 4);
		Proprietario robertin = new Proprietario("Robertin");
		Moto moto = new Moto("Harley", dataCons, robertin, 20000);
		moto.lavarVeiculo();
		moto.revisao();
		moto.trocarOleo();
		ts = moto.toString();
		System.out.println(ts);
		
		dataCons = LocalDate.of(2021, 6, 9);
		Proprietario filipe = new Proprietario("Filipe");
		Carro carro2 = new Carro("Celta", dataCons, filipe, "Bandido");
		carro2.trocarOleo();
		carro2.revisao();
		ts = carro2.toString();
		System.out.println(ts);
		
		dataCons = LocalDate.of(2021, 5, 19);
		Proprietario kley = new Proprietario("Filipe");
		Carro carro3 = new Carro("Fusca", dataCons, kley, "Caido");
		carro3.trocarOleo();
		carro3.revisao();
		ts = carro3.toString();
		System.out.println(ts);
		
		dataCons = LocalDate.of(2021, 8, 4);
		Proprietario robert = new Proprietario("Robert");
		Moto moto2 = new Moto("CB", dataCons, robert, 150);
		moto2.lavarVeiculo();
		moto2.trocarOleo();
		ts = moto2.toString();
		System.out.println(ts);
	}
}