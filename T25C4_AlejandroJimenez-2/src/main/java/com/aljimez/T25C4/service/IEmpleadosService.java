package com.aljimez.T25C4.service;

import java.util.List;

import com.aljimez.T25C4.dto.Empleados;

public interface IEmpleadosService {

	
	// Metodos del CRUD
	public List<Empleados> listarEmpleados(); // Listar All

	public Empleados guardarEmpleados(Empleados empleado); // CREATE

	public Empleados empleadoXID(String dni); // READ

	public Empleados actualizarEmpleado(Empleados empleado); // UPDATE

	public void eliminarEmpleado(String dni);// DELETE
}
