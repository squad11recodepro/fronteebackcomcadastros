package com.squad11.faveladeliveryapi.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.squad11.faveladeliveryapi.entities.Notacliente;
import com.squad11.faveladeliveryapi.repositories.NotaclienteRepository;

@Service
public class NotaclienteServices {

@Autowired
private NotaclienteRepository repository;
	
@Transactional(readOnly= true)
public List<Notacliente> findAll(){
	List<Notacliente> resultado = repository.findAll();
	return resultado;	
}

public Notacliente getById(Long id){
 Optional<Notacliente> notacliente= repository.findById(id);
 if(notacliente.isPresent()) {
	 return notacliente.get();
 }else {
	 return null;
 }
}

public void save(Notacliente notacliente) {
try {
repository.save(notacliente);
}catch (Exception ex) {
throw ex;
}
}

public void delete(Long id) {
Optional<Notacliente> notacliente = repository.findById(id);
if (notacliente.isPresent()) {
repository.delete(notacliente.get());
System.out.println(notacliente.get().getNota_cliente());	
}else {
System.out.println("Nota não encontrada");
}
}

public void update(Notacliente notacliente) {
try {
	repository.save(notacliente);
}catch(Exception ex) {
	throw ex;
}
}

}
