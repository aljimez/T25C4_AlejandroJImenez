package com.aljimez.T25C4.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aljimez.T25C4.dao.IEmpleadosDAO;
import com.aljimez.T25C4.dto.Empleados;
@Service
public class EmpleadosServiceImpl implements IEmpleadosService{


	@Autowired
	IEmpleadosDAO iArticulosDAO;

	@Override
	public List<Empleados> listarEmpleados() {
		// TODO Auto-generated method stub
		return iArticulosDAO.findAll();
	}

	@Override
	public Empleados guardarEmpleados(Empleados empleado) {
		// TODO Auto-generated method stub
		return iArticulosDAO.save(empleado);
	}

	@Override
	public Empleados empleadoXID(String dni) {
		// TODO Auto-generated method stub
		return iArticulosDAO.findById(dni).get();
	}

	@Override
	public Empleados actualizarEmpleado(Empleados empleado) {
		// TODO Auto-generated method stub
		return iArticulosDAO.save(empleado);
	}

	@Override
	public void eliminarEmpleado(String dni) {
		iArticulosDAO.deleteById(dni);
		
	}

	




	
}
