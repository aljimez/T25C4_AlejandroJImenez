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

import com.aljimez.T25C4.dto.Cajas;
import com.aljimez.T25C4.service.CajaServiceImpl;

@RestController
@RequestMapping("/api")
public class CajaController {

	@Autowired
	CajaServiceImpl CajasServiceImpl;
	
	@GetMapping("/cajas")
	public List<Cajas> listarCajas(){
		return CajasServiceImpl.listarCajas();
	}
	
	@PostMapping("/cajas")
	public Cajas salvarCaja(@RequestBody Cajas caja) {
		
		return CajasServiceImpl.guardarCajas(caja);
	}
	
	@GetMapping("/cajas/{box_id}")
	public Cajas cajaXID(@PathVariable(name="box_id") String id) {
		
		Cajas caja_xid= new Cajas();
		
		caja_xid=CajasServiceImpl.cajaXID(id);
		
		return caja_xid;
	}
	
	@PutMapping("/cajas/{box_id}")
	public Cajas actualizarCaja(@PathVariable(name="box_id")String id,@RequestBody Cajas caja) {
		
		Cajas caja_seleccionada= new Cajas();
		Cajas caja_actualizada= new Cajas();
		
		caja_seleccionada= CajasServiceImpl.cajaXID(id);
		
		caja_seleccionada.setContenido(caja.getContenido());
		caja_seleccionada.setValor(caja.getValor());
		caja_seleccionada.setAlmacen(caja.getAlmacen());
		
		caja_actualizada = CajasServiceImpl.actualizarCaja(caja_seleccionada);
		
		return caja_actualizada;
	}
	
	@DeleteMapping("/cajas/{box_id}")
	public void eliminarCaja(@PathVariable(name="box_id")String id) {
		CajasServiceImpl.eliminarCaja(id);
	}
	}
