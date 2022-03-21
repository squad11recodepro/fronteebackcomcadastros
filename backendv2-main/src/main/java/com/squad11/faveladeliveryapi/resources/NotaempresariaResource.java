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

import com.squad11.faveladeliveryapi.entities.Notaempresaria;
import com.squad11.faveladeliveryapi.services.NotaempresariaServices;

@RestController
@RequestMapping("/notaempresaria")
@CrossOrigin (origins="*")
public class NotaempresariaResource {

	@Autowired
	private NotaempresariaServices service;
	
	@GetMapping
	public List<Notaempresaria> findAll(){
		return service.findAll();
	}
		
	@PostMapping (value="/")
	public ResponseEntity <Notaempresaria> save(@RequestBody Notaempresaria notaempresaria){
	service.save(notaempresaria);
	return ResponseEntity.ok().body(notaempresaria);
	}


	@DeleteMapping(value="/{id}")
	public ResponseEntity<Notaempresaria> delete(@PathVariable Long id){
		service.delete(id);
		Notaempresaria notaempresaria = service.getById(id);
		return ResponseEntity.ok().body(notaempresaria);
	}

	@PutMapping(value = "/")
	public ResponseEntity<Notaempresaria> update(@RequestBody Notaempresaria notaempresaria){
		service.save(notaempresaria);
		return ResponseEntity.ok().body(notaempresaria);
	}

}
