package com.squad11.faveladeliveryapi.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.squad11.faveladeliveryapi.entities.Cadastrocliente;
import com.squad11.faveladeliveryapi.repositories.CadastroClienteRepository;

@Service
public class CadastroclienteServices {

	@Autowired
	private CadastroClienteRepository repository;

	@Transactional(readOnly = true)
	public List<Cadastrocliente> findAll() {
		List<Cadastrocliente> resultado = repository.findAll();
		return resultado;
	}

	public Cadastrocliente getById(Long id_cliente) {
		Optional<Cadastrocliente> cadastrocliente = repository.findById(id_cliente);
		if (cadastrocliente.isPresent()) {
			return cadastrocliente.get();
		} else {
			return null;
		}
	}

	public void save(Cadastrocliente cadastrocliente) {
		try {
			repository.save(cadastrocliente);
		} catch (Exception ex) {
			throw ex;
		}
	}

	public void delete(Long id_cliente) {
		Optional<Cadastrocliente> cadastrocliente = repository.findById(id_cliente);
		if (cadastrocliente.isPresent()) {
			repository.delete(cadastrocliente.get());
			System.out.println(cadastrocliente.get().getNomecompleto());
		} else {
			System.out.println("Esse cliente ainda não está cadastrado");
		}
	}

	public void update(Cadastrocliente cadastrocliente) {
		try {
			repository.save(cadastrocliente);
		} catch (Exception ex) {
			throw ex;
		}
	}

}
