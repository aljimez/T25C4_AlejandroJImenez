package com.aljimez.T25C4.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aljimez.T25C4.dao.IEmpleadosDAO;
import com.aljimez.T25C4.dto.Departamentos;
import com.aljimez.T25C4.dto.Empleados;
@Service
public class EmpleadosServiceImpl implements IEmpleadosService{


	@Autowired
	IEmpleadosDAO iEmpleadosDAO;

	@Override
	public List<Empleados> listarEmpleados() {
		// TODO Auto-generated method stub
		return iEmpleadosDAO.findAll();
	}

	@Override
	public Empleados guardarEmpleados(Empleados empleado) {
		// TODO Auto-generated method stub
		return iEmpleadosDAO.save(empleado);
	}

	@Override
	public Empleados empleadoXID(String dni) {
		// TODO Auto-generated method stub
		return iEmpleadosDAO.findById(dni).get();
	}

	@Override
	public Empleados actualizarEmpleado(Empleados empleado) {
		// TODO Auto-generated method stub
		return iEmpleadosDAO.save(empleado);
	}

	@Override
	public void eliminarEmpleado(String dni) {
		iEmpleadosDAO.deleteById(dni);
		
	}

	




	
}
