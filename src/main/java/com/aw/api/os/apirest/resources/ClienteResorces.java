package com.aw.api.os.apirest.resources;

import java.util.List;

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

import com.aw.api.os.apirest.modelo.Cliente;
import com.aw.api.os.apirest.repository.ClienteRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;


@RestController
@RequestMapping(value="/api")
@Api(value = "Api Cliente")
@CrossOrigin(origins = ("*"))
public class ClienteResorces {
	
	@Autowired
	ClienteRepository clienteRepository;
	
	@GetMapping("/listaCliente")
	@ApiOperation("Lista Clientes")
	public List<Cliente> listaClientes(){
		return clienteRepository.findAll();
	}

	@GetMapping("/cliente/{id}")
	@ApiOperation("Lista Cliente por id")
	public Cliente listaClienteId(@PathVariable(value="id") int id){
		return clienteRepository.findById(id);
	}
	
	@PostMapping("/cliente")
	@ApiOperation("Salva Clientes")
	public Cliente salvarCliente(@RequestBody Cliente user){
		return clienteRepository.save(user);
	}
	
	@DeleteMapping("/delcliente")
	@ApiOperation("Deletar clientes")
	public void deleteCliente(@RequestBody Cliente user){
	clienteRepository.delete(user);
	}
	
	@DeleteMapping("/delclienteid/{id}")
	@ApiOperation("Deletar clientes")
	public void deleteClienteId(@PathVariable(value="id") int id){
	clienteRepository.deleteById(id);
	}
	
	
	@PutMapping("/cliente")
	@ApiOperation("Atualiza Cliente")
	public Cliente atualizaCliente(@RequestBody Cliente user){
	return clienteRepository.save(user);
	}
	
		

}
