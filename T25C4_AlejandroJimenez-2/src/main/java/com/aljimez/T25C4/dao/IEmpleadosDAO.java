package com.aljimez.T25C4.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aljimez.T25C4.dto.Empleados;

public interface IEmpleadosDAO  extends  JpaRepository<Empleados, String>{

}
