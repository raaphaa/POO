package br.com.serratec.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionFactory {
	
	private String urlConexao = "jdbc:postgresql://localhost/bancoteste";
	private String usuario = "postgres";
	private String senha = "Serratec";
	Connection Connection;
	
	public Connection createConnection() {
		Properties props = new Properties();
		props.setProperty("user",usuario);
		props.setProperty("password",senha);
		
		try {
			Connection con = DriverManager.getConnection(urlConexao,props);
			if(con != null) {
				System.out.println("Conseguiu conectar ao banco.");
			}else {
				System.out.println("Ocorreu algum erro ao conectar ao banco.");
			}
			return con;
		}catch (SQLException ex) {
			System.out.println("Erro ao conectar ao banco." + ex.getMessage());
			ex.printStackTrace();
		}
		return null;
	}
}