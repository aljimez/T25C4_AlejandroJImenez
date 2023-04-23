package com.aljimez.T25C4.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aljimez.T25C4.dao.ICajaDAO;
import com.aljimez.T25C4.dto.Cajas;
@Service
public class CajaServiceImpl implements ICajaService{


	@Autowired
	ICajaDAO iCajasDAO;

	
	@Override
	public List<Cajas> listarCajas() {
		// TODO Auto-generated method stub
		return iCajasDAO.findAll();
	}

	@Override
	public Cajas guardarCajas(Cajas caja) {
		// TODO Auto-generated method stub
		return iCajasDAO.save(caja);
	}

	@Override
	public Cajas cajaXID(String box_id) {
		// TODO Auto-generated method stub
		return iCajasDAO.findById(box_id).get();
	}

	@Override
	public Cajas actualizarCaja(Cajas caja) {
		// TODO Auto-generated method stub
		return iCajasDAO.save(caja);	
		}

	@Override
	public void eliminarCaja(String box_id) {
		// TODO Auto-generated method stub
		iCajasDAO.findById(box_id);

	}

	
	
}
