package br.edu.utfpr.aulaVraptor.controller;

import java.util.List;

import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Delete;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Put;
import br.com.caelum.vraptor.Result;
import br.edu.utfpr.aulaVraptor.dao.ClienteDAO;
import br.edu.utfpr.aulaVraptor.model.Cliente;

@Controller
@Path("/clientes")
public class ClienteController {

	@Inject
	private ClienteDAO dao;
	@Inject
	private Result result;
	
	@Get
	@Path("/novo")
	public void form(){
	}

	@Post
	public void adicionar(Cliente cliente) {
        dao.inserir(cliente);
        result.redirectTo(this).listar();
    }
	
	@Delete
	@Path("/{cliente.codigo}")
	public void remover(Cliente cliente) {
        dao.remover(cliente.getCodigo());
        result.redirectTo(this).listar();
    }
	
	@Put
	@Path("/{cliente.codigo}")
	public void alterar(Cliente cliente) {
        dao.alterar(cliente);
        result.redirectTo(this).listar();
    }
	
	@Get
	@Path("/{cliente.codigo}")
    public Cliente visualizar(Cliente cliente) {
        return dao.load(cliente.getCodigo());
    }

	@Get
    public List<Cliente> listar() {
        return dao.listAll();
    }
}
