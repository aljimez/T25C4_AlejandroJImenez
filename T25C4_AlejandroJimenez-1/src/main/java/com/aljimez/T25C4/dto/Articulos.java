package com.aljimez.T25C4.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="articulos")
public class Articulos {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column
	private String nombre;
	
	@Column
	private int precio;
	
	@ManyToOne
    @JoinColumn(name="Fabricantes")
    private Fabricantes fabricante;

	
	public Articulos() {}
	
	public Articulos (Long id,String nombre, int precio,Fabricantes fabricante) {
		
		this.id = id;
		this.nombre = nombre;
		this.precio = precio;
		this.fabricante = fabricante;
	}
	
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Fabricantes")
	public Fabricantes getFabricantes() {
		return fabricante;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public Fabricantes getFabricante() {
		return fabricante;
	}

	public void setFabricante(Fabricantes fabricante) {
		this.fabricante = fabricante;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Articulos [id=" + id + ", nombre=" + nombre + ", precio=" + precio + ", fabricante=" + fabricante + "]";
	}

	
	
	
	
}
