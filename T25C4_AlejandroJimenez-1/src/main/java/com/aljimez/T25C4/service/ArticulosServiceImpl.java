package com.aljimez.T25C4.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aljimez.T25C4.dao.IArticulosDAO;
import com.aljimez.T25C4.dto.Articulos;
import com.aljimez.T25C4.dto.Fabricantes;

@Service
public class ArticulosServiceImpl implements IArticulosService {

	@Autowired
	IArticulosDAO iArticulosDAO;

	public List<Articulos> listarArticulos() {
		return iArticulosDAO.findAll();
	}

	public Articulos guardarArticulos(Articulos articulos) {

		return iArticulosDAO.save(articulos);
	}

	public Articulos actualizarArticulos(Articulos articulos) {

		return iArticulosDAO.save(articulos);
	}

	public void eliminarArticulos(Long id) {

		iArticulosDAO.deleteById(id);

	}

	public Articulos articulosXID(Long id) {
		// TODO Auto-generated method stub
		return iArticulosDAO.findById(id).get();
	}

	public List<Articulos> listarArticulosFabricantes(Fabricantes fabricante) {
		return iArticulosDAO.findByFabricante(fabricante);
	}

}
