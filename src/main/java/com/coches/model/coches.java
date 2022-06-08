package com.coches.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class coches {

	@Id
	private int codigo;
	
	@Column(name="marca", length=50)
	private String marca;
	@Column(name="modelo", length=50)
	private String modelo;
	@Column(name="matricula", length=50)
	private String matricula;
	
	public int getcodigo() {
		return codigo;
	}
	public void setcodigo(int codigo) {
		this.codigo=codigo;
	}
	
	
	public String getmarca() {
		return marca;
	}
	public void setmarca(String marca) {
		this.marca=marca;
	}
	
	
	public String getmodelo() {
		return modelo;
	}
	public void setmodelo(String modelo) {
		this.modelo=modelo;
	}
	
	
	public String getmatricula() {
		return matricula;
	}
	public void setmatricula(String matricula) {
		this.matricula=matricula;
	}
}
