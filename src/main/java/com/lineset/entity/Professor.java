package com.lineset.entity;

public class Professor extends Pessoa {
	
	public Professor(String nome, String fone) {
		super(nome, fone);
	}
	
	
	public Professor() {
	}


	@Override
	public String toString() {
		return "Professor [getID()=" + getID() + ", getNome()=" + getNome() + ", getFone()=" + getFone()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	
}
