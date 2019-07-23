package com.aw.api.os.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aw.api.os.apirest.modelo.Veiculo;

public interface VeiculoRepository extends JpaRepository<Veiculo, Long>{

	//Usuario findAll(String login, String senha);
	
	Veiculo findById(int id);

	void deleteById(int id);

}
