package com.squad11.faveladeliveryapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.squad11.faveladeliveryapi.entities.Cadastroentregadora;

@Repository
public interface CadastroentregadoraRepository extends JpaRepository<Cadastroentregadora, Long> {

}
