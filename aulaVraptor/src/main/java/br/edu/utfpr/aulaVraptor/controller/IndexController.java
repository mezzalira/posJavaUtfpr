package br.edu.utfpr.aulaVraptor.controller;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;

/**
 * Controlador básico para exemplo inicial de funcionamento dos controladores.
 * @author forchesatto
 *
 */

@Controller
public class IndexController {

	public void ola(){
		
	}
	
	@Get("/")
	public void index(){
	}
}
