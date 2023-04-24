package com.aljimez.T25C4.dao;

import java.util.Optional;

import com.aljimez.T25C4.dto.Departamentos;

import org.springframework.data.jpa.repository.JpaRepository;

public interface IDepartamentosDAO extends JpaRepository<Departamentos, String>{

	void deleteById(Long id);

	Optional<Departamentos> findById(Long id);

	

}
