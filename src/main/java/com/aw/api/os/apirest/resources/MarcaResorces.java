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
import com.aw.api.os.apirest.modelo.Marca;
import com.aw.api.os.apirest.repository.ClienteRepository;
import com.aw.api.os.apirest.repository.MarcaRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;


@RestController
@RequestMapping(value="/api")
@Api(value = "Api Veiculo")
@CrossOrigin(origins = ("*"))
public class MarcaResorces {
	
	@Autowired
	MarcaRepository marcaRepository;
	
	@GetMapping("/listaMarca")
	@ApiOperation("Lista Marcas")
	public List<Marca> listaMarcas(){
		return marcaRepository.findAll();
	}
	
	@GetMapping("/marca/{id}")
	@ApiOperation("Lista Marca por id")
	public Marca listaMarcaId(@PathVariable(value="id") int id){
		return marcaRepository.findById(id);
	}

	@GetMapping("/marca/{nome}")
	@ApiOperation("Lista Marca por nome")
	public Marca listaMarcaId(@PathVariable(value="nome") String nome){
		return marcaRepository.findByNome(nome);
	}

	
	

}
