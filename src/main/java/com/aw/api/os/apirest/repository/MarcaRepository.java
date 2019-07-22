package com.aw.api.os.apirest.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aw.api.os.apirest.modelo.Cliente;
import com.aw.api.os.apirest.modelo.Marca;

public interface MarcaRepository extends JpaRepository<Marca, Long>{

	//Usuario findAll(String login, String senha);
	
	Marca findById(int id);
	
	List<Marca> findAll();

}
