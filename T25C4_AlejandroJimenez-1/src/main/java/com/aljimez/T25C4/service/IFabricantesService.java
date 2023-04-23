package com.aljimez.T25C4.service;

import java.util.List;

import com.aljimez.T25C4.dto.Fabricantes;

public interface IFabricantesService {

	public List<Fabricantes> listarFabricantes();

	public Fabricantes guardarFabricantes(Fabricantes fabricantes);
	
	public Fabricantes fabricantesXID(Long id);
	
	public Fabricantes actualizarFabricantes(Fabricantes fabricantes);
	
	public void eliminarFabricantes(Long id);
}
