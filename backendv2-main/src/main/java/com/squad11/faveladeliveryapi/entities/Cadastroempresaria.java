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
public class Cadastroempresaria implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_empresaria;
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
	
	public Cadastroempresaria() {		
	}
	
	@OneToMany(mappedBy= "cadastroempresaria")
	private List <Notaentregadora> notaentregadora;
	
	@OneToMany(mappedBy= "cadastroempresaria")
	private List <Notacliente> notacliente;
	
	
	public List<Notacliente> getNotacliente() {
		return notacliente;
	}

	public void setNotacliente(List<Notacliente> notacliente) {
		this.notacliente = notacliente;
	}

	public Cadastroempresaria(Long id_empresaria, String nomecompleto, Long cpf, String enderecocompleto, String email,
			Long telefone, String login, String senha) {
		this.id_empresaria = id_empresaria;
		this.nomecompleto = nomecompleto;
		this.cpf = cpf;
		this.enderecocompleto = enderecocompleto;
		this.email = email;
		this.telefone = telefone;
		this.login = login;
		this.senha = senha;
	}

	public Long getId_empresaria() {
		return id_empresaria;
	}

	public void setId_empresaria(Long id_empresaria) {
		this.id_empresaria = id_empresaria;
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

	public List<Notaentregadora> getNotaentregadora() {
		return notaentregadora;
	}

	public void setNotaentregadora(List<Notaentregadora> notaentregadora) {
		this.notaentregadora = notaentregadora;
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
		return Objects.hash(id_empresaria);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cadastroempresaria other = (Cadastroempresaria) obj;
		return Objects.equals(id_empresaria, other.id_empresaria);
	}
	
	

}
