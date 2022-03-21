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

import com.squad11.faveladeliveryapi.entities.Notaentregadora;
import com.squad11.faveladeliveryapi.services.NotaentregadoraServices;

@RestController
@RequestMapping("/notaentregadora")
@CrossOrigin (origins="*")
public class NotaentregadoraResource {

	@Autowired
	private NotaentregadoraServices service;
	
	@GetMapping
	public List<Notaentregadora> findAll(){
		return service.findAll();
	}
		
	@PostMapping (value="/")
	public ResponseEntity <Notaentregadora> save(@RequestBody Notaentregadora notaentregadora){
	service.save(notaentregadora);
	return ResponseEntity.ok().body(notaentregadora);
	}


	@DeleteMapping(value="/{id}")
	public ResponseEntity<Notaentregadora> delete(@PathVariable Long id){
		service.delete(id);
		Notaentregadora notaentregadora = service.getById(id);
		return ResponseEntity.ok().body(notaentregadora);
	}

	@PutMapping(value = "/")
	public ResponseEntity<Notaentregadora> update(@RequestBody Notaentregadora notaentregadora){
		service.save(notaentregadora);
		return ResponseEntity.ok().body(notaentregadora);
	}

}
