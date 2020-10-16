package com.lineset.entity;

public abstract class Pessoa {
	
	private long ID;
	private String nome;
	private String fone;
	
	public Pessoa() {
	}
	
	public Pessoa(String nome, String fone) {
		super();
		this.nome = nome;
		this.fone = fone;
	}
	
	
	public long getID() {
		return ID;
	}
	public void setID(long iD) {
		ID = iD;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getFone() {
		return fone;
	}
	public void setFone(String fone) {
		this.fone = fone;
	}
	
	
	

}
