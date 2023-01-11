package com.h2pessoa.banco.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.h2pessoa.banco.entitites.Endereco;
import com.h2pessoa.banco.repositories.EnderecosRepository;

@RestController
@RequestMapping("/enderecos")
public class EnderecosController {
	
	@Autowired
	private EnderecosRepository endrepository;
	
	@GetMapping
	public List<Endereco> findAll(){
		List<Endereco>result = endrepository.findAll();
		return result;
	}




}
