package com.squad11.faveladeliveryapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.squad11.faveladeliveryapi.entities.Notaempresaria;

@Repository
public interface NotaempresariaRepository extends JpaRepository<Notaempresaria, Long>{

}
