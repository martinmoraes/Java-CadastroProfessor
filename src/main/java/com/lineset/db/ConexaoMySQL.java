package com.lineset.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoMySQL {
	private Connection conexao = null;
	
	
	
	public Connection getConexion() {

//		Class.forName("com.mysql.cj.jdbc.Driver");
//		Class.forName("com.mysql.jdbc.Driver");

		String stringBase = "jdbc:mysql:";
		String URI = "//localhost/aula";
		String params = "?useTimezone=true&serverTimezone=UTC";
		
		try {
			conexao = DriverManager.getConnection( stringBase+URI+params ,"root", "123456");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conexao;
	}
	
}
