package com.aljimez.T25C4.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "fabricantes")
public class Fabricantes {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column
	private String nombre;

	@OneToMany
	@JoinColumn(name = "FKFabricante")
	private List<Articulos> articulos;

		public Fabricantes() {
	}

	public Fabricantes(Long id, String nombre) {

		this.id = id;
		this.nombre = nombre;
	}
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@JsonIgnore
	@OneToMany (fetch = FetchType.LAZY,mappedBy = "Articulo")
	public List<Articulos> getArticulos() {
		return articulos;
	}

	public void setArticulos(List<Articulos> articulos) {
		this.articulos = articulos;
	}

	@Override
	public String toString() {
		return "Fabricantes [id=" + id + ", nombre=" + nombre + ", articulos=" + articulos + "]";
	}


	
}
