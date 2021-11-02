package br.com.serratec.banco;

import br.com.serratec.dao.ClienteDao;

public class Principal {
	public static void main(String[] args) {

		Cliente jose = new Cliente("Jose", 46, "1098765748");
		Cliente maria = new Cliente("Maria", 32, "2332132123");

		ClienteDao cd = new ClienteDao();

		cd.adicionar(jose);
		cd.adicionar(maria);

		cd.close();
	}
}
/*//import java.sql.Connection; //import java.sql.SQLException; 
 * //import br.com.serratec.dao.ConnectionFactory;
 * 
 * try { ConnectionFactory cf = new ConnectionFactory(); Connection con =
 * cf.createConnection(); System.out.println("A conexão com banco está aberta? "
 * + !con.isClosed()); con.close(); }catch(SQLException ex) {
 * ex.printStackTrace(); } //con.isClosed() //Conexão aberta: false// Conexão
 * fechada: true
 */