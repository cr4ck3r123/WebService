package com.aw.api.os.apirest.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "modelo")
public class Modelo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private int idmarca;
	private String nome;
	
	
	public Modelo() {
		super();
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getIdmarca() {
		return idmarca;
	}


	public void setIdmarca(int idmarca) {
		this.idmarca = idmarca;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
	
	

}
