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
public class Notacliente implements Serializable{
	
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(nullable=false)
	private Long nota_cliente;
	
	
	public Notacliente() {}
	
	@ManyToOne
	@JoinColumn(name="id_empresaria", nullable=false)
	private Cadastroempresaria cadastroempresaria;
	
	public Cadastroempresaria getCadastroempresaria() {
		return cadastroempresaria;
	}

	public void setCadastroempresaria(Cadastroempresaria cadastroempresaria) {
		this.cadastroempresaria = cadastroempresaria;
	}

	public Notacliente(Long id, Long nota_cliente) {
	
		this.id = id;
		this.nota_cliente = nota_cliente;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getNota_cliente() {
		return nota_cliente;
	}

	public void setNota_cliente(Long nota_cliente) {
		this.nota_cliente = nota_cliente;
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
		Notacliente other = (Notacliente) obj;
		return Objects.equals(id, other.id);
	}
	
	

}
