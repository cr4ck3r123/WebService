package com.aw.api.os.apirest.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "servico")
public class Servico {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idservicos;
	private String tipoServico;
	private double valor;
	private int qtde;
	
	
	public Servico() {
		super();
	}


	public int getIdservicos() {
		return idservicos;
	}


	public void setIdservicos(int idservicos) {
		this.idservicos = idservicos;
	}


	public String getTipoServico() {
		return tipoServico;
	}


	public void setTipoServico(String tipoServico) {
		this.tipoServico = tipoServico;
	}


	public double getValor() {
		return valor;
	}


	public void setValor(double valor) {
		this.valor = valor;
	}


	public int getQtde() {
		return qtde;
	}


	public void setQtde(int qtde) {
		this.qtde = qtde;
	}
	
	
	
	

}
