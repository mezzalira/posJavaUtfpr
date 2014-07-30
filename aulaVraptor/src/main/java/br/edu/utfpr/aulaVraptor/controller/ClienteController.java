package br.edu.utfpr.aulaVraptor.controller;

import java.util.List;

import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
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
	public void add(Cliente cliente) {
        dao.save(cliente);
        result.redirectTo(this).list();
    }

	@Get
	@Path("/clientes")
    public List<Cliente> list() {
        return dao.listAll();
    }

	@Get("/cliente/{id}")
    public Cliente view(Long id) {
        return dao.load(id);
    }
}
