package com.lineset.test;

import java.util.ArrayList;

import com.lineset.dao.DaoProfessor;
import com.lineset.entity.Professor;

public class TestaListaTodosMySQL {

	
	public static void main(String[] args) {
		
		DaoProfessor daoProfessor = new DaoProfessor();
		
		ArrayList<Professor> listaProfessores =  daoProfessor.listAll();
		
		listaProfessores.forEach(prof -> {
			System.out.println(prof.toString());
		});
		
//		
//		for (Professor professor : listaProfessores) {
//			System.out.println(professor.toString());
//		}
		System.out.println(listaProfessores.size());
	}
}
