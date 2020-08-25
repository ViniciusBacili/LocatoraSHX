package com.shx.locacao.veiculos.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.shx.locacao.veiculos.model.Cliente;
import com.shx.locacao.veiculos.repository.ClienteRepository;

@Controller
@RequestMapping("/cliente")
public class ClienteController {

	@Autowired
	private ClienteRepository clienteRepo;

	@GetMapping("/cadastro")
	public String exbirFormulario(Model model) {

		model.addAttribute("cliente", new Cliente());
		return "form-cad-cliente";
	}	
	
	@PostMapping("/cadastro")
	public String cadastrarCliente(
			@ModelAttribute("cliente") Cliente cliente,
			Model model) {

		clienteRepo.save(cliente);

		return "redirect:/cliente/cadastro";
	}
	    
	@RequestMapping("restClientes")
	public Iterable<Cliente> listaClientes(Model model){

	    Iterable<Cliente> clientes = clienteRepo.findAll();
	    model.addAttribute("cliente", clientes);

	    return clientes;
	}
	
	
	@GetMapping("/status")
	public String StatusCliente(
			@RequestParam("cliente") Cliente cliente) {
		
		cliente.setStatus(cliente.getStatus().equals(1) ? 0 : 1);
		clienteRepo.save(cliente);
		return "form-cad-cliente";
	}
	
}
		
