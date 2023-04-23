package com.aljimez.T25C4.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "almacenes")
public class Almacenes {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private Long id;
	
	@Column(name = "localizacion")
	private String localizacion;
	
	@Column(name = "capacidad")
	private long capacidad;

	@OneToMany(mappedBy = "almacen", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Cajas> cajas;

	public Almacenes() {}
	
	
	public Almacenes(Long id, String nombre, long capacidad) {
		// super();
		this.id = id;
		this.localizacion = nombre;
		this.capacidad = capacidad;

	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getLocalizacion() {
		return localizacion;
	}


	public void setLocalizacion(String localizacion) {
		this.localizacion = localizacion;
	}


	public long getCapacidad() {
		return capacidad;
	}


	public void setCapacidad(long capacidad) {
		this.capacidad = capacidad;
	}

	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "almacen")
	public List<Cajas> getCajas() {
		return cajas;
	}


	public void setCajas(List<Cajas> cajas) {
		this.cajas = cajas;
	}


	@Override
	public String toString() {
		return "Almacenes [id=" + id + ", localizacion=" + localizacion + ", capacidad=" + capacidad + ", cajas="
				+ cajas + "]";
	}
	
	
	
}
