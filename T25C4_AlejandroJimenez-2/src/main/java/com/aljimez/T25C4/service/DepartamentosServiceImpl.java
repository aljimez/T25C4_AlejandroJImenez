package com.aljimez.T25C4.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aljimez.T25C4.dao.IDepartamentosDAO;
import com.aljimez.T25C4.dto.Departamentos;
import com.aljimez.T25C4.dto.Empleados;

@Service
public class DepartamentosServiceImpl implements IDepartamentosService {

	@Autowired
	IDepartamentosDAO iDepartamentosDAO;

	public List<Departamentos> listarDepartamentos() {
		return iDepartamentosDAO.findAll();
	}

	public Departamentos actualizarDepartamentos(Departamentos departamentos) {

		return iDepartamentosDAO.save(departamentos);
	}

	public Departamentos departamentosXID(Long id) {
		return iDepartamentosDAO.findById(id).get();
	}

	public void eliminarDepartamento(Long id) {
		iDepartamentosDAO.deleteById(id);

	}

	@Override
	public Departamentos guardarDepartamentos(Departamentos departamento) {
		// TODO Auto-generated method stub
		return iDepartamentosDAO.save(departamento);
	}

	@Override
	public List<Departamentos> listarDepartamentosEmpleados(Empleados empleados) {
		// TODO Auto-generated method stub
		return iDepartamentosDAO.findByEmpleados(empleados);
	}

	@Override
	public List<Departamentos> listarEmpleadosDepartamento(Departamentos departamentos) {
		// TODO Auto-generated method stub
		return null;
	}



}
