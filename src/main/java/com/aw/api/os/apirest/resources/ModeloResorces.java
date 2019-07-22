package com.aw.api.os.apirest.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.aw.api.os.apirest.modelo.Modelo;
import com.aw.api.os.apirest.repository.ModeloRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;


@RestController
@RequestMapping(value="/api")
@Api(value = "Api Veiculo")
@CrossOrigin(origins = ("*"))
public class ModeloResorces {
	
	@Autowired
	ModeloRepository modeloRepository;
	
	@GetMapping("/listaModelo")
	@ApiOperation("Lista Modelos")
	public List<Modelo> listaModelos(){
		return modeloRepository.findAll();
	}
	
	@GetMapping("/modelo/{id}")
	@ApiOperation("Lista Modelo por id")
	public List<Modelo> listaMarcaId(@PathVariable(value="id") int id){
		return modeloRepository.findAllById(id);
	}

	@GetMapping("/modeloNome/{nome}")
	@ApiOperation("Lista Modelo por nome")
	public Modelo listaModeloNome(@PathVariable(value="nome") String nome){
		return modeloRepository.findByNome(nome);
	}

	
	

}
