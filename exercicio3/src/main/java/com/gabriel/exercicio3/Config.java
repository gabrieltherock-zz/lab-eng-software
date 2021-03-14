package com.gabriel.exercicio3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import java.util.ArrayList;
import java.util.List;

@EnableWebMvc
@Configuration
@ComponentScan
public class Config {
	
	@Bean
	public List<Pet> produzLista() {
		return new ArrayList<>();
	}

}
