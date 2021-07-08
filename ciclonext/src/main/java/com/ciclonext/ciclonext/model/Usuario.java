package com.ciclonext.ciclonext.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_usuario")
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idUsuario;

	@NotEmpty(message = "Campo obrigatório.")
	private String nome;

	@NotEmpty(message = "Campo obrigatório.")
	@Email
	private String email;

	@NotEmpty(message = "Campo obrigatório.")
	private String senha;

	private String urlImagemPerfil;

	@OneToMany(mappedBy =  "criador")
	@JsonIgnoreProperties({"idGrupo", "descricao", "urlImagemGrupo", "criador","postagens"})
	private List<Grupo> gruposCriados = new ArrayList<>();

	//private Usuario amizade;
	
	//@OneToMany(mappedBy = "amizade")
	//private List<Usuario> amigos = new ArrayList<>();
	
	@OneToMany(mappedBy =  "autor")
	@JsonIgnoreProperties({"idPostagem", "grupo", "urlImagemVideo", "autor"})
	private List<Postagem> publicacoes = new ArrayList<>();
	
	public long getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(long idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getUrlImagemPerfil() {
		return urlImagemPerfil;
	}

	public void setUrlImagemPerfil(String urlImagemPerfil) {
		this.urlImagemPerfil = urlImagemPerfil;
	}

}
