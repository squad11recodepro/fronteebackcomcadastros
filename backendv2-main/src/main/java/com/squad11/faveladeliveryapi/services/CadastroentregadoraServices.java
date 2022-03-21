package com.squad11.faveladeliveryapi.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.squad11.faveladeliveryapi.entities.Cadastroentregadora;
import com.squad11.faveladeliveryapi.repositories.CadastroentregadoraRepository;

@Service
public class CadastroentregadoraServices {

@Autowired
private CadastroentregadoraRepository repository;
	
@Transactional(readOnly= true)
public List<Cadastroentregadora> findAll(){
	List<Cadastroentregadora> resultado = repository.findAll();
	return resultado;	
}

public Cadastroentregadora getById(Long id_entregadora){
 Optional<Cadastroentregadora> cadastroentregadora= repository.findById(id_entregadora);
 if(cadastroentregadora.isPresent()) {
	 return cadastroentregadora.get();
 }else {
	 return null;
 }
}

public void save(Cadastroentregadora cadastroentregadora) {
try {
repository.save(cadastroentregadora);
}catch (Exception ex) {
throw ex;
}
}

public void delete(Long id_entregadora) {
Optional<Cadastroentregadora> cadastroentregadora = repository.findById(id_entregadora);
if (cadastroentregadora.isPresent()) {
repository.delete(cadastroentregadora.get());
System.out.println(cadastroentregadora.get().getNomecompleto());	
}else {
System.out.println("Cadastro de entregadora não encontrado");
}
}

public void update(Cadastroentregadora cadastroentregadora) {
try {
	repository.save(cadastroentregadora);
}catch(Exception ex) {
	throw ex;
}
}

}
