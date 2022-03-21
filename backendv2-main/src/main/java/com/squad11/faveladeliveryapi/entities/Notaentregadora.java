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
import javax.persistence.Table;

@Entity
@Table
public class Notaentregadora implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(nullable=false)
	private Long nota_entregadora;
	
	@ManyToOne
	@JoinColumn(name="id_entregadora", nullable=false)
	private Cadastroentregadora cadastroentregadora;
	@ManyToOne
	@JoinColumn(name="id_empresaria", nullable=false)
	private Cadastroempresaria cadastroempresaria;
	@ManyToOne
	@JoinColumn(name="id_cliente", nullable=false)
	private Cadastrocliente cadastrocliente;
	
	
	public Notaentregadora() {}
	
	public Notaentregadora(Long id, Long nota_entregadora) {
		this.id = id;
		this.nota_entregadora = nota_entregadora;
		

	}

	public Cadastroempresaria getCadastroempresaria() {
		return cadastroempresaria;
	}

	public void setCadastroempresaria(Cadastroempresaria cadastroempresaria) {
		this.cadastroempresaria = cadastroempresaria;
	}

	public Cadastroentregadora getCadastroentregadora() {
		return cadastroentregadora;
	}

	public void setCadastroentregadora(Cadastroentregadora cadastroentregadora) {
		this.cadastroentregadora = cadastroentregadora;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getNota_entregadora() {
		return nota_entregadora;
	}

	public void setNota_entregadora(Long nota_entregadora) {
		this.nota_entregadora = nota_entregadora;
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
		Notaentregadora other = (Notaentregadora) obj;
		return Objects.equals(id, other.id);
	}
	
	
}
