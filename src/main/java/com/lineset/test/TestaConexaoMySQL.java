package com.lineset.test;

import java.sql.Connection;
import java.sql.SQLException;

import com.lineset.db.ConexaoMySQL;

public class TestaConexaoMySQL {

	public static void main(String[] args) {

		try(Connection cnx = new ConexaoMySQL().getConexion();){
			if(cnx != null)
				System.out.println("Conectou");
			else
				System.out.println("Não conextou");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		

	}

}
