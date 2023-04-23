package com.aljimez.T25C4.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aljimez.T25C4.dto.Departamentos;
import com.aljimez.T25C4.service.IDepartamentosService;



/*
 * 
 * @author Alejandro
 * */


@RestController
@RequestMapping("/api")
public class DepartamentosController {

	@Autowired
	IDepartamentosService iDepartamentosService;
	

	@GetMapping("/departamentos")
	public List<Departamentos> listDepartamentos() {
		return iDepartamentosService.listarDepartamentos();
	}


	@GetMapping("/departamentos/{id}")
	public Departamentos departamentoXID(@PathVariable(name = "id") Long id) {
		Departamentos departamentoxID = new Departamentos();

		departamentoxID = iDepartamentosService.departamentosXID(id);

		return departamentoxID;
	}
	
	
	@PostMapping("/departamentos")
	public Departamentos saveDepartamento(@RequestBody Departamentos departamento) {
		return iDepartamentosService.guardarDepartamentos(departamento);
	}
	 
}
