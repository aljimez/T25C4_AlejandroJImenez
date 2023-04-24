package com.aljimez.T25C4.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "salas")
public class Salas {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private long id;

	
	@Column(name = "nombre")
	private String nombre;
	

	@ManyToOne
	@JoinColumn(name = "pelicula")
	private Peliculas pelicula;
	
	public Salas() {}
	
	public Salas (Long id, String nombre,Peliculas pelicula) {
		this.id = id;
		this.nombre = nombre;
		this.pelicula = pelicula;
		
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Peliculas getPelicula() {
		return pelicula;
	}

	public void setPelicula(Peliculas pelicula) {
		this.pelicula = pelicula;
	}

	@Override
	public String toString() {
		return "Salas [id=" + id + ", nombre=" + nombre + ", pelicula=" + pelicula + "]";
	}
	
	

}
