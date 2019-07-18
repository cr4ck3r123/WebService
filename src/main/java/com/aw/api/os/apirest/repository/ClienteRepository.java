package com.aw.api.os.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aw.api.os.apirest.modelo.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long>{

	//Usuario findAll(String login, String senha);
	
	Cliente findById(int id);

}
