package com.squad11.faveladeliveryapi.entities;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Notaempresaria implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(nullable=false)
	private Long nota_empresaria;
	
	@ManyToOne
	@JoinColumn(name="id_cliente", nullable=false)
	private Cadastrocliente cadastrocliente;
	
	@ManyToOne
	@JoinColumn(name="id_empresaria", nullable=false)
	private Cadastroempresaria cadastroempresaria;

	@ManyToOne
	@JoinColumn(name="id_entregadora", nullable=false)
	private Cadastroentregadora cadastroentregadora;


	public Notaempresaria() {}
	
	public Notaempresaria(Long id, Long nota_empresaria) {
		this.id = id;
		this.nota_empresaria = nota_empresaria;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getNota_empresaria() {
		return nota_empresaria;
	}

	public void setNota_empresaria(Long nota_empresaria) {
		this.nota_empresaria = nota_empresaria;
	}

	
	public Cadastroempresaria getCadastroempresaria() {
		return cadastroempresaria;
	}

	public void setCadastroempresaria(Cadastroempresaria cadastroempresaria) {
		this.cadastroempresaria = cadastroempresaria;
	}


	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Notaempresaria other = (Notaempresaria) obj;
		return Objects.equals(id, other.id);
	}
	
}
