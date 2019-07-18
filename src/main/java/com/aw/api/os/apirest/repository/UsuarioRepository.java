package com.aw.api.os.apirest.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.aw.api.os.apirest.modelo.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

	//Usuario findAll(String login, String senha);
	
	Usuario findById(int id);

}
