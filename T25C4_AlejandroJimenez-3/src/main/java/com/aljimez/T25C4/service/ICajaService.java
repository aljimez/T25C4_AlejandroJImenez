package com.aljimez.T25C4.service;

import java.util.List;

import com.aljimez.T25C4.dto.Cajas;

public interface ICajaService {

	
		public List<Cajas> listarCajas(); 

		public Cajas guardarCajas(Cajas caja); 

		public Cajas cajaXID(String box_id);

		public Cajas actualizarCaja(Cajas caja); 

		public void eliminarCaja(String box_id);
}
