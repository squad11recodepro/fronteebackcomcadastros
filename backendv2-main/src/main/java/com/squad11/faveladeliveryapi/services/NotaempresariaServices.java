package com.squad11.faveladeliveryapi.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.squad11.faveladeliveryapi.entities.Notaempresaria;
import com.squad11.faveladeliveryapi.repositories.NotaempresariaRepository;

@Service
public class NotaempresariaServices {

@Autowired
private NotaempresariaRepository repository;
	
@Transactional(readOnly= true)
public List<Notaempresaria> findAll(){
	List<Notaempresaria> resultado = repository.findAll();
	return resultado;	
}

public Notaempresaria getById(Long id){
 Optional<Notaempresaria> notaempresaria= repository.findById(id);
 if(notaempresaria.isPresent()) {
	 return notaempresaria.get();
 }else {
	 return null;
 }
}

public void save(Notaempresaria notaempresaria) {
try {
repository.save(notaempresaria);
}catch (Exception ex) {
throw ex;
}
}

public void delete(Long id) {
Optional<Notaempresaria> notaempresaria = repository.findById(id);
if (notaempresaria.isPresent()) {
repository.delete(notaempresaria.get());
System.out.println(notaempresaria.get().getNota_empresaria());	
}else {
System.out.println("Nota não encontrada");
}
}

public void update(Notaempresaria notaempresaria) {
try {
	repository.save(notaempresaria);
}catch(Exception ex) {
	throw ex;
}
}	
	
}
