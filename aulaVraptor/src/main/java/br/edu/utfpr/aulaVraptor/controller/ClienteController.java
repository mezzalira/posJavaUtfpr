package br.edu.utfpr.aulaVraptor.controller;

import java.util.List;

import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Delete;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Put;
import br.com.caelum.vraptor.Result;
import br.edu.utfpr.aulaVraptor.dao.ClienteDAO;
import br.edu.utfpr.aulaVraptor.model.Cliente;

@Controller
public class ClienteController {

	@Inject
	private ClienteDAO dao;
	@Inject
	private Result result;
	
	@Get("/clientes/novo")
	public void form(){
	}

	@Post("/clientes")
	public void adicionar(Cliente cliente) {
        dao.inserir(cliente);
        result.redirectTo(this).listar();
    }
	
	@Delete("/clientes/{cliente.codigo}")
	public void remover(Cliente cliente) {
        dao.remover(cliente.getCodigo());
        result.redirectTo(this).listar();
    }
	
	@Put("/clientes/{cliente.codigo}")
	public void alterar(Cliente cliente) {
        dao.alterar(cliente);
        result.redirectTo(this).listar();
    }
	
	@Get("/cliente/{cliente.codigo}")
    public Cliente visualizar(Cliente cliente) {
        return dao.load(cliente.getCodigo());
    }

	@Get("/clientes")
    public List<Cliente> listar() {
        return dao.listAll();
    }
}
