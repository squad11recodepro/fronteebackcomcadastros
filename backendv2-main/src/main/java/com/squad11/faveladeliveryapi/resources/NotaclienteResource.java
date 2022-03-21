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

import com.squad11.faveladeliveryapi.entities.Notacliente;
import com.squad11.faveladeliveryapi.services.NotaclienteServices;

@RestController
@RequestMapping("/notacliente")
@CrossOrigin (origins="*")
public class NotaclienteResource {
	
	@Autowired
	private NotaclienteServices service;
	
	@GetMapping
	public List<Notacliente> findAll(){
		return service.findAll();
	}
		
	@PostMapping (value="/")
	public ResponseEntity <Notacliente> save(@RequestBody Notacliente notacliente){
	service.save(notacliente);
	return ResponseEntity.ok().body(notacliente);
	}


	@DeleteMapping(value="/{id}")
	public ResponseEntity<Notacliente> delete(@PathVariable Long id){
		service.delete(id);
		Notacliente notacliente = service.getById(id);
		return ResponseEntity.ok().body(notacliente);
	}

	@PutMapping(value = "/")
	public ResponseEntity<Notacliente> update(@RequestBody Notacliente notacliente){
		service.save(notacliente);
		return ResponseEntity.ok().body(notacliente);
	}

}
