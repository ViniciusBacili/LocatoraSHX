package com.shx.locacao.veiculos;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.shx.locacao.veiculos.model.Aluguel;
import com.shx.locacao.veiculos.model.Carro;
import com.shx.locacao.veiculos.model.Cliente;



@Configuration
public class RepositoryConfig implements RepositoryRestConfigurer, WebMvcConfigurer {

	@Override
	public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
		config.exposeIdsFor(Cliente.class, Carro.class, Aluguel.class);
	}
}