package com.aljimez.T25C4.service;

import java.util.List;

import com.aljimez.T25C4.dto.Peliculas;

public interface IPeliculasService {

	public List<Peliculas> listarPeliculas(); 

	public Peliculas guardarPelicula(Peliculas pelicula); 

	public Peliculas peliculaXID(Long id); 

	public Peliculas actualizarPelicula(Peliculas pelicula); 

	public void eliminarPelicula(Long id);

	
}
