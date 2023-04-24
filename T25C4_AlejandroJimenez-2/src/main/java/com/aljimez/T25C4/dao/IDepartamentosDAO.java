package com.aljimez.T25C4.dao;

import java.util.List;
import java.util.Optional;

import com.aljimez.T25C4.dto.Departamentos;
import com.aljimez.T25C4.dto.Empleados;

import org.springframework.data.jpa.repository.JpaRepository;

public interface IDepartamentosDAO extends JpaRepository<Departamentos, String>{

	void deleteById(Long id);

	Optional<Departamentos> findById(Long id);

	List<Departamentos> findByEmpleados(Empleados empleados);


	

}
