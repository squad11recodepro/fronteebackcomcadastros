package com.squad11.faveladeliveryapi.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.squad11.faveladeliveryapi.entities.Cadastroempresaria;
import com.squad11.faveladeliveryapi.repositories.CadastroempresariaRepository;

@Service
public class CadastroempresariaServices {
	
@Autowired
private CadastroempresariaRepository repository;
	
@Transactional(readOnly= true)
public List<Cadastroempresaria> findAll(){
	List<Cadastroempresaria> resultado = repository.findAll();
	return resultado;	
}

public Cadastroempresaria getById(Long id_empresaria){
 Optional<Cadastroempresaria> cadastroempresaria= repository.findById(id_empresaria);
 if(cadastroempresaria.isPresent()) {
	 return cadastroempresaria.get();
 }else {
	 return null;
 }
}

public void save(Cadastroempresaria cadastroempresaria) {
try {
repository.save(cadastroempresaria);
}catch (Exception ex) {
throw ex;
}
}

public void delete(Long id_empresaria) {
Optional<Cadastroempresaria> cadastroempresaria = repository.findById(id_empresaria);
if (cadastroempresaria.isPresent()) {
repository.delete(cadastroempresaria.get());
System.out.println(cadastroempresaria.get().getNomecompleto());	
}else {
System.out.println("Cadastro de empresária não encontrado");
}
}

public void update(Cadastroempresaria cadastroempresaria) {
try {
	repository.save(cadastroempresaria);
}catch(Exception ex) {
	throw ex;
}
}


}
