package com.aljimez.T25C4.dao;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aljimez.T25C4.dto.Almacenes;

public interface IAlmacenDAO extends JpaRepository<Almacenes,String>{

	Optional<Almacenes> findById(Long id);

	void deleteById(Long id);




}
