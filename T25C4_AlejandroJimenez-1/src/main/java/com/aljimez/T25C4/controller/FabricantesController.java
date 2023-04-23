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

import com.aljimez.T25C4.dto.Fabricantes;
import com.aljimez.T25C4.service.FabricantesServiceImpl;

@RestController
@RequestMapping("/api")
public class FabricantesController {

	@Autowired
	FabricantesServiceImpl fabricantesServiceImpl;
	

	@GetMapping("/fabricantes")
	public List<Fabricantes> listarFabricantes()
	{
		return fabricantesServiceImpl.listarFabricantes();
	}
	

	@PostMapping("/fabricantes")
	public Fabricantes salvarEmpleado(@RequestBody Fabricantes fabricantes)
	{
		return fabricantesServiceImpl.guardarFabricantes(fabricantes);
	}
	
	@PutMapping ("/fabricantes/{id}")
	public Fabricantes actualizarFabricante( @PathVariable(name = "id")Long id, @RequestBody Fabricantes fabricantes) {
	
	Fabricantes Fabricantes_selected  =new Fabricantes(id, fabricantes.getNombre());
	Fabricantes Fabricante_Updated  = new Fabricantes();
	Fabricantes Fabricantes_updated = fabricantesServiceImpl.actualizarFabricantes(Fabricantes_selected);
	return Fabricantes_updated;  
}
	

	@DeleteMapping("/fabricantes/{id}")
	public void deleteFabricante(@PathVariable(name = "id") Long id) {
		fabricantesServiceImpl.deleteFabricante(id);
	}
}
