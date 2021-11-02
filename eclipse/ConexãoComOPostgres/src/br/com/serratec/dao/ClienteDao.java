package br.com.serratec.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import br.com.serratec.banco.Cliente;

public class ClienteDao {
	
	private Connection connection;

	public ClienteDao() {
		super();
		 ConnectionFactory cf = new ConnectionFactory();
		this.connection = cf.createConnection();
	}
	public void adicionar(Cliente cliente) {
		String sql = "insert into cliente(nome,idade,cpf) values(?,?,?)";
		try {
			PreparedStatement ps = connection.prepareStatement(sql);
			
			ps.setString(1, cliente.getNome());
			ps.setInt(2, cliente.getIdade());
			ps.setString(3, cliente.getCpf());
			
			ps.execute();
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public void update(Cliente cliente) {
		String sql = "update cliente set nome =?,idade = ?,cpf =? where id = ?";
		try {
			PreparedStatement ps = connection.prepareStatement(sql);
			
			ps.setString(1, cliente.getNome());
			ps.setInt(2, cliente.getIdade());
			ps.setString(3, cliente.getCpf());
			ps.setInt(4, cliente.getId());
			
			ps.execute();
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public void close() {
	        try {
	            this.connection.close();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }
}