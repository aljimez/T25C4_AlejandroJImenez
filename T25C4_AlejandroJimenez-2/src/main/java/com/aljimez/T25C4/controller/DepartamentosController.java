package com.aljimez.T25C4.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
	
	@PutMapping("/departamentos/{id}")
	public Departamentos actualizarDepartamento(@PathVariable(name="id")Long id,@RequestBody Departamentos departamento) {
		
		Departamentos departamento_seleccionado= new Departamentos();
		Departamentos departamento_updated= new Departamentos();
	
		departamento_seleccionado= iDepartamentosService.departamentosXID(id);
		
		departamento_seleccionado.setNombre(departamento.getNombre());
		departamento_seleccionado.setPresupuesto(departamento.getPresupuesto());
		
		departamento_updated = iDepartamentosService.actualizarDepartamentos(departamento_seleccionado);
		
		
		return departamento_updated;
	}
	@PostMapping("/departamentos")
	public Departamentos saveDepartamento(@RequestBody Departamentos departamento) {
		return iDepartamentosService.guardarDepartamentos(departamento);
	}
	
	@DeleteMapping("/departamentos/{id}")
	public void eleiminarDepartamento(@PathVariable(name="id")Long id) {
		iDepartamentosService.eliminarDepartamento(id);
	}
}
