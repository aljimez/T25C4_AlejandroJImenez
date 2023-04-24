package com.aljimez.T25C4.service;

import java.util.List;

import com.aljimez.T25C4.dto.Departamentos;
import com.aljimez.T25C4.dto.Empleados;

public interface IDepartamentosService {

	public List<Departamentos> listarDepartamentos(); 

	public Departamentos guardarDepartamentos(Departamentos departamentos); 

	public Departamentos departamentosXID(Long id); 

	public Departamentos actualizarDepartamentos(Departamentos departamentos); 

	public void eliminarDepartamento(Long id);
	
	public List<Departamentos> listarDepartamentosEmpleados(Empleados empleados);

	public List<Departamentos> listarEmpleadosDepartamento(Departamentos departamentos);



}
