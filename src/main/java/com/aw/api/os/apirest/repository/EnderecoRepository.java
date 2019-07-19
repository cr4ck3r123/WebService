package com.aw.api.os.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aw.api.os.apirest.modelo.Cliente;
import com.aw.api.os.apirest.modelo.Endereco;

public interface EnderecoRepository extends JpaRepository<Endereco, Long>{

	//Usuario findAll(String login, String senha);
	
	Endereco findById(int id);

	
}
