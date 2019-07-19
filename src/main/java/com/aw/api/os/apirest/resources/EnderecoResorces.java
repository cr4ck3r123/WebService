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
import com.aw.api.os.apirest.modelo.Endereco;
import com.aw.api.os.apirest.repository.ClienteRepository;
import com.aw.api.os.apirest.repository.EnderecoRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;


@RestController
@RequestMapping(value="/api")
@Api(value = "Api Endereco")
@CrossOrigin(origins = ("*"))
public class EnderecoResorces {
	
	@Autowired
	EnderecoRepository enderecoRepository;
	
	@GetMapping("/listaEndereco")
	@ApiOperation("Lista Endereco")
	public List<Endereco> listaEndereco(){
		return enderecoRepository.findAll();
	}

	@GetMapping("/endereco/{id}")
	@ApiOperation("Lista Endereco por id")
	public Endereco listaEnderecoId(@PathVariable(value="id") int id){
		return enderecoRepository.findById(id);
	}
	
	@PostMapping("/endereco")
	@ApiOperation("Salva Enderecos")
	public Endereco salvarEnderecos(@RequestBody Endereco end){
		return enderecoRepository.save(end);
	}
	
	@DeleteMapping("/endereco")
	@ApiOperation("Deletar enderecos")
	public void deleteEndereco(@RequestBody Endereco end){
		enderecoRepository.delete(end);
	}
	
	@PutMapping("/endereco")
	@ApiOperation("Atualiza enderecos")
	public Endereco atualizaEndereco(@RequestBody Endereco end){
	return enderecoRepository.save(end);
	}
	
	
	

}
