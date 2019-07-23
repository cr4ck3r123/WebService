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

import com.aw.api.os.apirest.modelo.Veiculo;

import com.aw.api.os.apirest.repository.VeiculoRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;


@RestController
@RequestMapping(value="/api")
@Api(value = "Api Veiculo")
@CrossOrigin(origins = ("*"))
public class VeiculoResorces {
	
	@Autowired
	VeiculoRepository veiculoRepository;
	
	@GetMapping("/listaVeiculo")
	@ApiOperation("Lista Veiculos")
	public List<Veiculo> listaClientes(){
		return veiculoRepository.findAll();
	}

	@GetMapping("/veiculo/{id}")
	@ApiOperation("Lista Veiculo por id")
	public Veiculo listaVeiculoId(@PathVariable(value="id") int id){
		return veiculoRepository.findById(id);
	}
	
	@PostMapping("/veiculo")
	@ApiOperation("Salva Veiculos")
	public Veiculo salvarCliente(@RequestBody Veiculo veiculo){
		return veiculoRepository.save(veiculo);
	}
	
	@DeleteMapping("/veiculo")
	@ApiOperation("Deletar Veiculos")
	public void deleteVeiculo(@RequestBody Veiculo veiculo){
		try {
			veiculoRepository.delete(veiculo);
		} catch (Exception e) {
		System.out.print(e);
		}
	
	}
	
	@PutMapping("/veiculo")
	@ApiOperation("Atualiza Veiculo")
	public Veiculo atualizaCliente(@RequestBody Veiculo veiculo){
	return veiculoRepository.save(veiculo);
	}
	
		

}
