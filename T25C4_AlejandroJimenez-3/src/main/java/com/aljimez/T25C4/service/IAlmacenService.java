package com.aljimez.T25C4.service;

import java.util.List;

import com.aljimez.T25C4.dto.Almacenes;

public interface IAlmacenService {

	
	public List<Almacenes> listarAlmacenes();

	public Almacenes guardarAlmacenes(Almacenes almacen); 

	public Almacenes almacenXID(Long id);

	public Almacenes actualizarAlmacen(Almacenes almacen);

	public void eliminarAlmacen(Long id);
	
}
