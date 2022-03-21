package com.squad11.faveladeliveryapi.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.squad11.faveladeliveryapi.entities.Cadastroempresaria;
import com.squad11.faveladeliveryapi.services.CadastroempresariaServices;

@RestController
@RequestMapping("/cadastroempresaria")
@CrossOrigin (origins="*")
public class CadastroempresariaResource {

	@Autowired
	private CadastroempresariaServices service;

	@GetMapping
	public List<Cadastroempresaria> findAll(){
		return service.findAll();
	}
		
	@PostMapping (value="/")
	public ResponseEntity <Cadastroempresaria> save(@RequestBody Cadastroempresaria cadastroempresaria){
	service.save(cadastroempresaria);
	return ResponseEntity.ok().body(cadastroempresaria);
	}


	@DeleteMapping(value="/{id_empresaria}")
	public ResponseEntity<Cadastroempresaria> delete(@PathVariable Long id_empresaria){
		service.delete(id_empresaria);
		Cadastroempresaria cadastroempresaria = service.getById(id_empresaria);
		return ResponseEntity.ok().body(cadastroempresaria);
	}

	@PutMapping(value = "/")
	public ResponseEntity<Cadastroempresaria> update(@RequestBody Cadastroempresaria cadastroempresaria){
		service.save(cadastroempresaria);
		return ResponseEntity.ok().body(cadastroempresaria);
	}
}
