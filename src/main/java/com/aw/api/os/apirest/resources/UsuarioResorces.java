package com.aw.api.os.apirest.resources;

import java.util.List;
import java.util.Optional;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aw.api.os.apirest.modelo.Usuario;
import com.aw.api.os.apirest.repository.UsuarioRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;


@RestController
@RequestMapping(value="/api")
@Api(value = "Api Usuario")
@CrossOrigin(origins = ("*"))
public class UsuarioResorces {
	
	@Autowired
	UsuarioRepository usuarioRepository;
	
	@GetMapping("/listaUsuario")
	@ApiOperation("Lista Usuarios")
	public List<Usuario> listaUsuarios(){
		return usuarioRepository.findAll();
	}

	@GetMapping("/usuario/{id}")
	@ApiOperation("Lista Usuarios por id")
	public Usuario listaUsuarioId(@PathVariable(value="id") int id){
		return usuarioRepository.findById(id);
	}
	
	@PostMapping("/usuario")
	@ApiOperation("Salva Usuarios")
	public Usuario salvarUsuario(@RequestBody Usuario user){
		return usuarioRepository.save(user);
	}
	
	@DeleteMapping("/usuario")
	@ApiOperation("Deletar Usuarios")
	public void deleteUsuario(@RequestBody Usuario user){
	usuarioRepository.delete(user);
	}
	
	@PutMapping("/usuario")
	@ApiOperation("Atualiza Usuarios")
	public Usuario atualizaUsuario(@RequestBody Usuario user){
	return usuarioRepository.save(user);
	}
	
	
	

}
