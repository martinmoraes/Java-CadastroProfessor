package com.lineset.test;

import com.lineset.dao.DaoProfessor;
import com.lineset.entity.Professor;

public class TestaInsertMySQL {

	public static void main(String[] args) {

		Professor professor = new Professor("João", "24234234234");

		int qtde = new DaoProfessor().inserirProfessor(professor);
		System.out.println("Total inseridos:" + qtde);
	}
}
