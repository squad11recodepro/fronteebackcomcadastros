package com.squad11.faveladeliveryapi.entities;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table
public class Cadastrocliente implements Serializable{
	
		
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_cliente;
	@Column(nullable=false)
	private String nomecompleto;
	@Column(nullable=false)
	private Long cpf;
	@Column(nullable=false)
	private String enderecocompleto;
	@Column(nullable=false)
	private String email;
	@Column(nullable=false)
	private Long telefone;
	@Column(nullable=false)
	private String login;
	@Column(nullable=false)
	private String senha;
	
	public Cadastrocliente() {	
	}
	
	public Cadastrocliente(Long id_cliente, String nomecompleto, Long cpf, String enderecocompleto, String email,
			Long telefone, String login, String senha) {
		this.id_cliente = id_cliente;
		this.nomecompleto = nomecompleto;
		this.cpf = cpf;
		this.enderecocompleto = enderecocompleto;
		this.email = email;
		this.telefone = telefone;
		this.login = login;
		this.senha = senha;
	}

	
	@OneToMany(mappedBy= "cadastrocliente")
	private List <Notaentregadora> notaentregadora;
	@OneToMany(mappedBy= "cadastrocliente")
	private List <Notaempresaria> notaempresaria;
	
	public List<Notaentregadora> getNotaentregadora() {
		return notaentregadora;
	}

	public void setNotaentregadora(List<Notaentregadora> notaentregadora) {
		this.notaentregadora = notaentregadora;
	}

	public List<Notaempresaria> getNotaempresaria() {
		return notaempresaria;
	}

	public void setNotaempresaria(List<Notaempresaria> notaempresaria) {
		this.notaempresaria = notaempresaria;
	}

	public Long getId_cliente() {
		return id_cliente;
	}

	public void setId_cliente(Long id_cliente) {
		this.id_cliente = id_cliente;
	}

	public String getNomecompleto() {
		return nomecompleto;
	}

	public void setNomecompleto(String nomecompleto) {
		this.nomecompleto = nomecompleto;
	}

	public Long getCpf() {
		return cpf;
	}

	public void setCpf(Long cpf) {
		this.cpf = cpf;
	}

	public String getEnderecocompleto() {
		return enderecocompleto;
	}

	public void setEnderecocompleto(String enderecocompleto) {
		this.enderecocompleto = enderecocompleto;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getTelefone() {
		return telefone;
	}

	public void setTelefone(Long telefone) {
		this.telefone = telefone;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
		
	}

	@Override
	public int hashCode() {
		return Objects.hash(id_cliente);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cadastrocliente other = (Cadastrocliente) obj;
		return Objects.equals(id_cliente, other.id_cliente);
	}
	

}
	