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
@Table(name = "peliculas")
public class Peliculas {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "nombre")
	private String nombre;

	@Column(name = "calificacionedad")
	private Long calificacionedad;

	@OneToMany(mappedBy = "pelicula", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Salas> salas;

	// Constructores
	public Peliculas() {

	}

	public Peliculas(Long id, String nombre, long calificacionedad) {

		this.id = id;
		this.nombre = nombre;
		this.calificacionedad = calificacionedad;

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

	public Long getCalificacionedad() {
		return calificacionedad;
	}

	public void setCalificacionedad(Long calificacionedad) {
		this.calificacionedad = calificacionedad;
	}

	public void setSalas(List<Salas> salas) {
		this.salas = salas;
	}

	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "pelicula")
	public List<Salas> getSalas() {
		return salas;
	}

	@Override
	public String toString() {
		return "Peliculas [id=" + id + ", nombre=" + nombre + ", calificacionedad=" + calificacionedad + ", salas=" + salas
				+ "]";
	}

}
