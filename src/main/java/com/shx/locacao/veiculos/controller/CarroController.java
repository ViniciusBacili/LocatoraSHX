package com.shx.locacao.veiculos.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.shx.locacao.veiculos.model.Carro;
import com.shx.locacao.veiculos.repository.CarroRepository;

@Controller
@RequestMapping("/carro")
public class CarroController {

	@Autowired
	private CarroRepository carroRepo;

	@GetMapping("/cadastro")
	public String exbirFormulario(Model model) {

		model.addAttribute("carro", new Carro());
		return "form-cad-carro";
	}	
	
	@PostMapping("/cadastro")
	public String cadastrarCarro(
			@ModelAttribute("carro") Carro carro,
			Model model) {

		carroRepo.save(carro);

		return "redirect:/carro/cadastro";
	}
	    
	@RequestMapping("restCarros")
	public Iterable<Carro> listaCarros(Model model){

	    Iterable<Carro> carros = carroRepo.findAll();
	    model.addAttribute("carro", carros);

	    return carros;
	}
	
	
	@GetMapping("/status")
	public String StatusCarros(
			@RequestParam("carro") Carro carro) {
		
		carro.setStatus(carro.getStatus().equals(1) ? 0 : 1);
		carroRepo.save(carro);
		return "form-cad-cliente";
	}
	
}
		
