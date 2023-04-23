package com.aljimez.T25C4.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aljimez.T25C4.dao.IFabricantesDAO;
import com.aljimez.T25C4.dto.Fabricantes;
@Service
public class FabricantesServiceImpl implements IFabricantesService {

	@Autowired
	IFabricantesDAO iFabricantesDAO;

	@Override
	public List<Fabricantes> listarFabricantes() {
		// TODO Auto-generated method stub
		return iFabricantesDAO.findAll();
	}

	@Override
	public Fabricantes guardarFabricantes(Fabricantes fabricantes) {
		// TODO Auto-generated method stub
		return iFabricantesDAO.save(fabricantes);
	}

	@Override
	public Fabricantes fabricantesXID(Long id) {
		// TODO Auto-generated method stub
		return iFabricantesDAO.findById(id).get();
	}

	@Override
	public Fabricantes actualizarFabricantes(Fabricantes fabricantes) {
		// TODO Auto-generated method stub
		return iFabricantesDAO.save(fabricantes);
	}

	@Override
	public void eliminarFabricantes(Long id) {
		// TODO Auto-generated method stub
		iFabricantesDAO.deleteById(id);
	}

	public void deleteFabricante(Long id) {
		iFabricantesDAO.deleteById(id);
	}

}
