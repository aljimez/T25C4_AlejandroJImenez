package com.aljimez.T25C4.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aljimez.T25C4.dao.IAlmacenDAO;
import com.aljimez.T25C4.dto.Almacenes;

@Service
public class AlmacenServiceImpl  implements IAlmacenService{

	@Autowired
	IAlmacenDAO iAlmacenesDAO;
	
	@Override
	public List<Almacenes> listarAlmacenes() {
		// TODO Auto-generated method stub
		return  iAlmacenesDAO.findAll();
	}

	@Override
	public Almacenes guardarAlmacenes(Almacenes almacen) {
		// TODO Auto-generated method stub
		return iAlmacenesDAO.save(almacen);
	}

	@Override
	public Almacenes almacenXID(Long id) {
		// TODO Auto-generated method stub
		return iAlmacenesDAO.findById(id).get();
	}

	@Override
	public Almacenes actualizarAlmacen(Almacenes almacen) {
		// TODO Auto-generated method stub
		return iAlmacenesDAO.save(almacen);
	}

	@Override
	public void eliminarAlmacen(Long id) {
		// TODO Auto-generated method stub
		iAlmacenesDAO.deleteById(id);

	}
	
	
	

}
