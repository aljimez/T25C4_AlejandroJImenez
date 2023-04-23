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

import com.aljimez.T25C4.dto.Articulos;
import com.aljimez.T25C4.service.ArticulosServiceImpl;
import com.aljimez.T25C4.dto.Fabricantes;

@RestController
@RequestMapping("/api")
public class ArticulosController {

	@Autowired

	ArticulosServiceImpl articulosServiceImpl;

	@GetMapping("/articulos")
	public List<Articulos> listarArticuos() {

		return articulosServiceImpl.listarArticulos();

	}

	@PostMapping("/articulos")
	public Articulos salvarArticulos(@RequestBody Articulos articulos) {
		return articulosServiceImpl.guardarArticulos(articulos);

	}

	@GetMapping("/articulos/fabricante/{fabricante}")
	public List<Articulos> listarArticulosFabricante(@PathVariable(name = "fabricante") Long id) {

		Fabricantes fabricante = new Fabricantes();

		fabricante.setId();

		return articulosServiceImpl.listarArticulosFabricantes(fabricante);

	}
	
	@GetMapping("/articulos/{id}")
	public Articulos empleadoXID(@PathVariable(name= "id") Long id,@RequestBody Articulos articulos) {
		Articulos art_id = new Articulos();
		
		return art_id;
	}

	@PutMapping("/articulos/{id}")
	public Articulos actualizarArticulos(@PathVariable(name = "id") Long id, @RequestBody Articulos articulos) {
		
		Articulos Articulos_updated = new Articulos();
		Articulos Articulos_seleccionado = new Articulos();
		
		Articulos_seleccionado = articulosServiceImpl.articulosXID(id);
		Articulos_seleccionado.setName(articulos.getName());

		Articulos_seleccionado = articulosServiceImpl.actualizarArticulos(Articulos_seleccionado);
		
		
		return Articulos_updated;
	}
	
	@DeleteMapping("/articulos/{id}")
	public void eliminarArticulos(@PathVariable(name= "id")Long id)
	{
		articulosServiceImpl.eliminarArticulos(id);
	}

	
	
}
