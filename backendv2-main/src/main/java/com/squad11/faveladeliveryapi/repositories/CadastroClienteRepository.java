package com.squad11.faveladeliveryapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.squad11.faveladeliveryapi.entities.Cadastrocliente;

@Repository
public interface CadastroClienteRepository extends JpaRepository<Cadastrocliente, Long> {


}
