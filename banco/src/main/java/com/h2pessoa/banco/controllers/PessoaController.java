package com.h2pessoa.banco.controllers;

import java.awt.print.Pageable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.h2pessoa.banco.entitites.Pessoa;
import com.h2pessoa.banco.repositories.PessoaRepository;

@RestController
@RequestMapping(value= "/pessoas")
public class PessoaController {
	

	@Autowired
	private PessoaRepository repository;
	
	@GetMapping(value="/pessoa")
	public List<Pessoa> findAll(){
		List<Pessoa> result = repository.findAll();
		return result;
		
	}
	
	@PostMapping
	public Pessoa insert(@RequestBody Pessoa pessoa) {
		Pessoa result = repository.save(pessoa);
		return result;
	}
	
	/* Infelizmente me falta conhecimento para consegir termina essa parte do código 
	 * 
	 * 
	 @GetMapping("/listarpessoa")
	    public Pessoa serachBynome(
	    		@RequestParam (defaultValue = "") String nome,
	    		Pageable pageable) {
	        List<nome> result = repository.searchNome(nome,pageable);
	        return Pessoa.ok(result);
	
	
	 }
	 */
}