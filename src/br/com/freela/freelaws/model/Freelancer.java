package br.com.freela.freelaws.model;

import java.io.Serializable;

import javax.persistence.Entity;

@Entity
public class Freelancer extends Model implements Serializable {

	private static final long serialVersionUID = 3914652452707342886L;

	private String nome;
	private String email;
	private String senha;

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

}
