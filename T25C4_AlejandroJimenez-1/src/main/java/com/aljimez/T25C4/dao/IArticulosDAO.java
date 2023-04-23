package com.aljimez.T25C4.dao;

import java.util.List;

import com.aljimez.T25C4.dto.Articulos;
import com.aljimez.T25C4.dto.Fabricantes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IArticulosDAO extends JpaRepository<Articulos,Long>{

	List<Articulos> findByFabricante(Fabricantes fabricante);

}
