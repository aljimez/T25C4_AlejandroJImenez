package com.aljimez.T25C4.service;

import java.util.List;

import com.aljimez.T25C4.dto.Departamentos;

public interface IDepartamentosService {

	// Metodos del CRUD
	public List<Departamentos> listarDepartamentos(); // Listar All

	public Departamentos guardarDepartamentos(Departamentos departamentos); // CREATE

	public Departamentos departamentosXID(Long id); // READ

	public Departamentos actualizarDepartamentos(Departamentos departamentos); // UPDATE

	public void eliminarDepartamento(Long id);// DELETE


}
