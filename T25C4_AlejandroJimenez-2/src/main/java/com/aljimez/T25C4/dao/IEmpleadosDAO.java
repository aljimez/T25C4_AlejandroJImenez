package com.aljimez.T25C4.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aljimez.T25C4.dto.Departamentos;
import com.aljimez.T25C4.dto.Empleados;

public interface IEmpleadosDAO  extends  JpaRepository<Empleados, String>{

	List<Departamentos> findByFabricante(Departamentos departamentos);

}
