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

import com.aljimez.T25C4.dto.Almacenes;
import com.aljimez.T25C4.service.AlmacenServiceImpl;

@RestController
@RequestMapping("/api")
public class AlmacenController {
	
	@Autowired
	AlmacenServiceImpl almacenesServiceImpl;
	
	@GetMapping("/almacenes")
	public List<Almacenes> listarAlmacenes(){
		return almacenesServiceImpl.listarAlmacenes();
	}
	
	@PostMapping("/almacenes")
	public Almacenes saveAlmacen(@RequestBody Almacenes departamento) {
		
		return almacenesServiceImpl.guardarAlmacenes(departamento);
	}
	
	@GetMapping("/almacenes/{id}")
	public Almacenes almacenXID(@PathVariable(name="id") Long id) {
		
		Almacenes almacen_xid = new Almacenes();
		
		almacen_xid = almacenesServiceImpl.almacenXID(id);
		
		
		return almacen_xid;
	}
	
	@PutMapping("/almacenes/{id}")
	public Almacenes updateAlmacen(@PathVariable(name="id")Long id,@RequestBody Almacenes almacen) {
		
		Almacenes almacen_seleccionado= new Almacenes();
		Almacenes almacen_updated= new Almacenes();
		
		almacen_seleccionado= almacenesServiceImpl.almacenXID(id);
		
		almacen_seleccionado.setLocalizacion(almacen.getLocalizacion());
		almacen_seleccionado.setCapacidad(almacen.getCapacidad());
		
		almacen_updated = almacenesServiceImpl.actualizarAlmacen(almacen_seleccionado);
		
		
		return almacen_updated;
	}
	
	@DeleteMapping("/almacenes/{box_id}")
	public void eliminarAlmacen(@PathVariable(name="box_id")Long id) {
		almacenesServiceImpl.eliminarAlmacen(id);
	}

}
