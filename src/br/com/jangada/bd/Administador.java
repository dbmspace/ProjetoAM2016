package br.com.jangada.bd;

// default package
// Generated 11/09/2016 19:21:00 by Hibernate Tools 5.1.0.Alpha1

import java.util.HashSet;
import java.util.Set;

/**
 * Administador generated by hbm2java
 */
public class Administador implements java.io.Serializable {

	private Integer idAdministador;
	private String email;
	private String senhaAdministrador;
	private Character ativoAdministrador;
	private Set<Logs> logses = new HashSet<Logs>(0);
	private Set<Noticias> noticiases = new HashSet<Noticias>(0);

	public Administador() {
	}

	public Administador(String email, String senhaAdministrador) {
		this.email = email;
		this.senhaAdministrador = senhaAdministrador;
	}

	public Administador(String email, String senhaAdministrador, Character ativoAdministrador, Set<Logs> logses,
			Set<Noticias> noticiases) {
		this.email = email;
		this.senhaAdministrador = senhaAdministrador;
		this.ativoAdministrador = ativoAdministrador;
		this.logses = logses;
		this.noticiases = noticiases;
	}

	public Integer getIdAdministador() {
		return this.idAdministador;
	}

	public void setIdAdministador(Integer idAdministador) {
		this.idAdministador = idAdministador;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenhaAdministrador() {
		return this.senhaAdministrador;
	}

	public void setSenhaAdministrador(String senhaAdministrador) {
		this.senhaAdministrador = senhaAdministrador;
	}

	public Character getAtivoAdministrador() {
		return this.ativoAdministrador;
	}

	public void setAtivoAdministrador(Character ativoAdministrador) {
		this.ativoAdministrador = ativoAdministrador;
	}

	public Set<Logs> getLogses() {
		return this.logses;
	}

	public void setLogses(Set<Logs> logses) {
		this.logses = logses;
	}

	public Set<Noticias> getNoticiases() {
		return this.noticiases;
	}

	public void setNoticiases(Set<Noticias> noticiases) {
		this.noticiases = noticiases;
	}

}