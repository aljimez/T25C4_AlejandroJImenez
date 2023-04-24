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

import com.aljimez.T25C4.dto.Salas;
import com.aljimez.T25C4.service.SalasServiceImpl;

@RestController
@RequestMapping("/api")
public class SalasController {

	
	@Autowired 
	SalasServiceImpl salasServiceImpl;

	
	@GetMapping ("/salas")
	public List<Salas> listSalas(){
		
		return salasServiceImpl.listarSalas();
	} 
	
	@PostMapping("/salas")
	public Salas salvarSala(@RequestBody Salas salas) {
		
		return salasServiceImpl.guardarSala(salas);
	}
	
	@GetMapping("/salas/{id}")
	public Salas salasXID (@PathVariable(name = "id")Long id) {
		
		Salas salaxid = new Salas();
		salaxid = salasServiceImpl.salaXID(id);
		
		return salaxid;
		
	}
	@PutMapping("/salas/{id}")
	public Salas actualizarSala(@PathVariable(name = "id")Long id,@RequestBody Salas salas) {
		
		
		Salas salaseleccionada= new Salas();
		Salas salaupdated= new Salas();
		
		
		salaseleccionada = salasServiceImpl.salaXID(id);
		
		
		salaseleccionada.setNombre(salas.getNombre());
		salaseleccionada.setPelicula(salas.getPelicula());
		
		salaseleccionada = salasServiceImpl.actualizarSala(salaseleccionada);
		
		return salaupdated;
	}
	
	@DeleteMapping("/salas/{id}")
	public void deleteSala(@PathVariable(name = "id") Long id) {
		salasServiceImpl.eliminarSala(id);

	}
}
