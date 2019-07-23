package com.aw.api.os.apirest.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aw.api.os.apirest.modelo.Modelo;

public interface ModeloRepository extends JpaRepository<Modelo, Long>{

	//Usuario findAll(String login, String senha);
	
	Modelo findById(int id);
	
	Modelo findByNome(String nome);
	
	List<Modelo> findAll();
	
	List<Modelo> findAllById(int idmarca);

}
