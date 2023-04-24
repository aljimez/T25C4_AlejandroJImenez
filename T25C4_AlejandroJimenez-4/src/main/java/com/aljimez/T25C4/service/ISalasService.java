package com.aljimez.T25C4.service;

import java.util.List;

import com.aljimez.T25C4.dto.Salas;

public interface ISalasService {

	public List<Salas> listarSalas(); 

	public Salas guardarSala(Salas sala); 

	public Salas salaXID(long codigo); 

	public Salas actualizarSala(Salas sala); 

	public void eliminarSala(long codigo);
	
}
