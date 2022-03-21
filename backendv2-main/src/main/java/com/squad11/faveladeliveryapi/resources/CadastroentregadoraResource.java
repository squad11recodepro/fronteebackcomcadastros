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

import com.squad11.faveladeliveryapi.entities.Cadastroentregadora;
import com.squad11.faveladeliveryapi.services.CadastroentregadoraServices;

@RestController
@RequestMapping("/cadastroentregadora")
@CrossOrigin (origins="*")
public class CadastroentregadoraResource {

	@Autowired
	private CadastroentregadoraServices service;
	
	@GetMapping
	public List<Cadastroentregadora> findAll(){
		return service.findAll();
	}
		
	@PostMapping (value="/")
	public ResponseEntity <Cadastroentregadora> save(@RequestBody Cadastroentregadora cadastroentregadora){
	service.save(cadastroentregadora);
	return ResponseEntity.ok().body(cadastroentregadora);
	}


	@DeleteMapping(value="/{id_entregadora}")
	public ResponseEntity<Cadastroentregadora> delete(@PathVariable Long id_entregadora){
		service.delete(id_entregadora);
		Cadastroentregadora cadastroentregadora = service.getById(id_entregadora);
		return ResponseEntity.ok().body(cadastroentregadora);
	}

	@PutMapping(value = "/")
	public ResponseEntity<Cadastroentregadora> update(@RequestBody Cadastroentregadora cadastroentregadora){
		service.save(cadastroentregadora);
		return ResponseEntity.ok().body(cadastroentregadora);
	}
}
