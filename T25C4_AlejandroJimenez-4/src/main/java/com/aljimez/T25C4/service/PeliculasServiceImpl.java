package com.aljimez.T25C4.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aljimez.T25C4.dao.IPeliculasDAO;
import com.aljimez.T25C4.dto.Peliculas;

@Service
public class PeliculasServiceImpl  implements IPeliculasService{

	@Autowired
	IPeliculasDAO iPeliculasDAO;
	
	@Override
	public List<Peliculas> listarPeliculas() {
		// TODO Auto-generated method stub
		return iPeliculasDAO.findAll();
	}

	@Override
	public Peliculas guardarPelicula(Peliculas pelicula) {
		// TODO Auto-generated method stub
		return iPeliculasDAO.save(pelicula);
	}

	@Override
	public Peliculas peliculaXID(Long id) {
		// TODO Auto-generated method stub
		return iPeliculasDAO.findById(id).get();
	}

	@Override
	public Peliculas actualizarPelicula(Peliculas pelicula) {
		// TODO Auto-generated method stub
		return iPeliculasDAO.save(pelicula);
	}

	@Override
	public void eliminarPelicula(Long id) {
		// TODO Auto-generated method stub
		iPeliculasDAO.deleteById(id);

	}

}
