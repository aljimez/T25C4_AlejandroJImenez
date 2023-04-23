package com.aljimez.T25C4.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "cajas")
public class Cajas {

	
	@Id
	@Column(name = "box_id")
	private String box_id;
	
	@Column (name = "contenido")
	private String contenido;
	
	@Column (name = "valor")
	private long valor;
	
	@ManyToOne
	@JoinColumn(name = "almacen")
	private Almacenes almacen;
	
	public Cajas() {}
	
	
	public Cajas (String box_id, String contenido,long valor,Almacenes almacenes) {
		
		this.box_id = box_id;
		this.contenido = contenido;
		this.valor = valor;
		this.almacen = almacenes;
		
	}


	public String getBox_id() {
		return box_id;
	}


	public void setBox_id(String box_id) {
		this.box_id = box_id;
	}


	public String getContenido() {
		return contenido;
	}


	public void setContenido(String contenido) {
		this.contenido = contenido;
	}


	public long getValor() {
		return valor;
	}


	public void setValor(long valor) {
		this.valor = valor;
	}


	public Almacenes getAlmacen() {
		return almacen;
	}


	public void setAlmacen(Almacenes almacen) {
		this.almacen = almacen;
	}


	@Override
	public String toString() {
		return "Cajas [box_id=" + box_id + ", contenido=" + contenido + ", valor=" + valor + ", almacen=" + almacen
				+ "]";
	}
	
	
	
}
