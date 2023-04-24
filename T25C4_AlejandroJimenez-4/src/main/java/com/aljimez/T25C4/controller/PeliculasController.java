package com.aljimez.T25C4.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aljimez.T25C4.dto.Peliculas;
import com.aljimez.T25C4.service.PeliculasServiceImpl;

@RestController
@RequestMapping("/api")
public class PeliculasController {


	@Autowired
	PeliculasServiceImpl peliculasServiceImpl;
	
	@GetMapping("/peliculas")
	public List<Peliculas> listPeliculas(){
		
		return peliculasServiceImpl.listarPeliculas();
		
	}
	
	@PostMapping ("/peliculas")
	public Peliculas savePeliculas(@PathVariable Peliculas peliculas) {
		
		return peliculasServiceImpl.guardarPelicula(peliculas);
		
	}
	
	@GetMapping("/peliculas/{id}")
	public Peliculas peliculaXID (@PathVariable(name = "id")Long id) {
	Peliculas pelicula_xid = new Peliculas();
	
	pelicula_xid = peliculasServiceImpl.peliculaXID(id);
	
	return pelicula_xid;
	
	}
	
	@PutMapping ("/peliculas/{id}")
	public Peliculas actualizarPeliculas (@PathVariable(name = "id")Long id,@RequestBody Peliculas pelicula) {
	

	Peliculas pelicula_seleccionada= new Peliculas();
	Peliculas peliculas_updated= new Peliculas();
	
	pelicula_seleccionada= peliculasServiceImpl.peliculaXID(id);
	
	pelicula_seleccionada.setName(pelicula.getName());
	pelicula_seleccionada.setCalificacionedad(pelicula.getCalificacionedad());
	
	peliculas_updated = peliculasServiceImpl.actualizarPelicula(pelicula_seleccionada);
	
	
	return peliculas_updated;
	}
		
	@DeleteMapping ("/peliculas/{id}")
	public void eleimPelicula(@PathVariable(name = "id")Long id) {
	peliculasServiceImpl.eliminarPelicula(id);
	
	}}
