package br.com.joggue.faq.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.joggue.faq.repository.Perguntas;

@Controller
public class FaqController {

	
	/**
	 * Autowire permite injetar o repositório no controller, e isso nos livra
	 * da preocupação de como receber esse objeto na classe
	 */
	@Autowired 
	private Perguntas perguntas; 
	/**
	 * O repositorio convidados foi criado numa interface Convidados que extends 
	 * JpaRepository.
	 */
	
		
	/**
	 * Anota a o método listar dizendo que este método irá responder a 
	 * requisição HTTP do tipo GET para /convidados
	 * @return
	 */
	@GetMapping("/")
	public ModelAndView listar() {
		
		//Cria um objeto do tipo ModelAndView, retorna tb o nome da view
		//que é um HTML criado no diretorio templates (ListaConvidados.html)
		ModelAndView modelAndView = new ModelAndView("ListaPerguntas");
		
		//Permite adicionar objetos para serem usados no HTML
		// ou seja, estou adicionando um objeto para a view.
		modelAndView.addObject("perguntas", perguntas.findAll()); // retorna um objeto list de convidados
		
		return modelAndView;
	}
	
	

}



