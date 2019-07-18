package com.aw.api.os.apirest.ws;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.google.gson.Gson;

import com.aw.api.os.apirest.controle.ControllerEndereco;
import com.aw.api.os.apirest.modelo.Endereco;

@Path("endereco")
public class ServiceEndereco {

// SERVI�O INSERIR ENDERECO
	@POST
	@Path("adicionar")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.TEXT_PLAIN)
	public int inserir(Endereco endereco) throws Exception {
		int i = 0;
		Gson gson = new Gson();
		gson.toJson(endereco, Endereco.class);

		if (ControllerEndereco.addEndereco(endereco) == 1) {
			i = 1;
		}

		return i;
	}

// SERVI�O PESQUISA ENDERE�O
	@GET
	@Path("pesquisar/{id}/")
	@Produces(MediaType.TEXT_PLAIN)
	@Consumes(MediaType.APPLICATION_JSON)
	public String buscarPorId(@PathParam("id") int idUser) {
		Gson gson = new Gson();
		Endereco endereco = null;
		try {
			endereco = ControllerEndereco.pesqEndereco(idUser);

		} catch (Exception e) {

			e.printStackTrace();
		}
		return gson.toJson(endereco);
	}

// METODO LISTAR ENDERECO POR ID
	@GET
	@Path("listar/{idPessoa}")
	public String lista(@PathParam("idPessoa") int idEndereco) throws Exception {

		List<Endereco> lista = new ArrayList<Endereco>();

		ControllerEndereco dao = new ControllerEndereco();
		lista = dao.listarEndereco(idEndereco);

		// Converter para Gson
		Gson g = new Gson();
		return g.toJson(lista);
	}

// SERVI�O EDITAR ENDERECO
	@PUT
	@Path("editar")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.TEXT_PLAIN)
	public String editarEndereco(Endereco endereco) throws Exception {
		String msg = "";
		Gson gson = new Gson();
		gson.toJson(endereco, Endereco.class);

		if (ControllerEndereco.editarEndereco(endereco) == 1) {
			msg = "Endereco alterado com sucesso";
		}

		return msg;
	}

	// METODO PARA RETORNAR ID ENDERECO
	@GET
	@Path("/id")
	public int retornarIdPessoa() throws ClassNotFoundException, SQLException {

		int id = 0;
		System.out.print("Metodo Retornar ID");

		ControllerEndereco dao = new ControllerEndereco();
		id = dao.retornoIdEndereco();

		return id;
	}

}
