package com.lineset.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.lineset.db.ConexaoMySQL;
import com.lineset.entity.Professor;

public class DaoProfessor {
	final String INSERE_PROFESSOR = "INSERT INTO aula.professor	(nome,	fone) VALUES (?, ?);";
	final String LISTA_PROFESSORES = "SELECT * FROM aula.professor;";
	final String MEU_CODIGO = "SELECT * FROM aula.professor;";
	

	public int inserirProfessor(Professor professor) {
		
		try(Connection cnx = new ConexaoMySQL().getConexion();){
			PreparedStatement pst = cnx.prepareStatement(INSERE_PROFESSOR);
			pst.setString(1, professor.getNome());
			pst.setString(2, professor.getFone());
			return pst.executeUpdate();	
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}
	
	public ArrayList<Professor> listAll(){
		ArrayList<Professor> listProfessores = new ArrayList();
		
		try(Connection cnx = new ConexaoMySQL().getConexion();){
			PreparedStatement pst = cnx.prepareStatement(LISTA_PROFESSORES);
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				Professor professor = new Professor();
//				professor.setNome(rs.getString("nome"));
//				professor.setFone(rs.getString("fone"));
				professor.setNome(rs.getString(2));
				professor.setFone(rs.getString(3));
				listProfessores.add(professor);
			}
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return listProfessores;
	}
}
