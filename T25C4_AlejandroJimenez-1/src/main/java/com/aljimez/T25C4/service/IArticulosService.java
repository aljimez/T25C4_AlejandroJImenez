package com.aljimez.T25C4.service;

import java.util.List;

import com.aljimez.T25C4.dto.Articulos;
import com.aljimez.T25C4.dto.Fabricantes;

public interface IArticulosService {

	List<Articulos> listarArticulos();

	public Articulos guardarArticulos(Articulos articulos);
	
	public Articulos articulosXID(Long id);
	
	public List<Articulos> listarArticulosFabricantes(Fabricantes fabricante);
	
	public Articulos actualizarArticulos(Articulos articulos);
	
	public void eliminarArticulos(Long id);
}
