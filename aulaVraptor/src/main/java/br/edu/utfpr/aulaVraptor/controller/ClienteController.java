package br.edu.utfpr.aulaVraptor.controller;

import java.util.List;

import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Result;
import br.edu.utfpr.aulaVraptor.dao.ClienteDAO;
import br.edu.utfpr.aulaVraptor.model.Cliente;

@Controller
public class ClienteController {

	@Inject
	private ClienteDAO dao;
	@Inject
	private Result result;
	
	public void form(){
	}

	public void add(Cliente cliente) {
        dao.save(cliente);
        result.redirectTo(this).list();
    }

    public List<Cliente> list() {
        return dao.listAll();
    }

    public Cliente view(Long id) {
        return dao.load(id);
    }
}
