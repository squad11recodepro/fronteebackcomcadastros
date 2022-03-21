package com.squad11.faveladeliveryapi.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.squad11.faveladeliveryapi.entities.Notaentregadora;
import com.squad11.faveladeliveryapi.repositories.NotaentregadoraRepository;

@Service
public class NotaentregadoraServices {


@Autowired
private NotaentregadoraRepository repository;
	
@Transactional(readOnly= true)
public List<Notaentregadora> findAll(){
	List<Notaentregadora> resultado = repository.findAll();
	return resultado;	
}

public Notaentregadora getById(Long id){
 Optional<Notaentregadora> notaentregadora= repository.findById(id);
 if(notaentregadora.isPresent()) {
	 return notaentregadora.get();
 }else {
	 return null;
 }
}

public void save(Notaentregadora notaentregadora) {
try {
repository.save(notaentregadora);
}catch (Exception ex) {
throw ex;
}
}

public void delete(Long id) {
Optional<Notaentregadora> notaentregadora = repository.findById(id);
if (notaentregadora.isPresent()) {
repository.delete(notaentregadora.get());
System.out.println(notaentregadora.get().getNota_entregadora());	
}else {
System.out.println("Nota não encontrada");
}
}

public void update(Notaentregadora notaentregadora) {
try {
	repository.save(notaentregadora);
}catch(Exception ex) {
	throw ex;
}
}	
	
}
