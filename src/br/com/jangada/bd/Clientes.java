package br.com.jangada.bd;
// default package
// Generated 11/09/2016 19:21:00 by Hibernate Tools 5.1.0.Alpha1

import java.util.Date;

/**
 * Clientes generated by hbm2java
 */
public class Clientes implements java.io.Serializable {

	private Integer idClientes;
	private String nomeCliente;
	private Date nascimentoCliente;
	private String emailCliente;
	private String cpfCliente;
	private String cepCliente;
	private String logradouroCliente;
	private String bairroCliente;
	private String cidadeCliente;
	private String estadoCliente;
	private String paisCliente;
	private Character ativoCliente;

	public Clientes() {
	}

	public Clientes(String nomeCliente, Date nascimentoCliente, String emailCliente) {
		this.nomeCliente = nomeCliente;
		this.nascimentoCliente = nascimentoCliente;
		this.emailCliente = emailCliente;
	}

	public Clientes(String nomeCliente, Date nascimentoCliente, String emailCliente, String cpfCliente,
			String cepCliente, String logradouroCliente, String bairroCliente, String estadoCliente, String cidadeCliente, String paisCliente,
			Character ativoCliente) {
		this.nomeCliente = nomeCliente;
		this.nascimentoCliente = nascimentoCliente;
		this.emailCliente = emailCliente;
		this.cpfCliente = cpfCliente;
		this.cepCliente = cepCliente;
		this.logradouroCliente = logradouroCliente;
		this.bairroCliente = bairroCliente;
		this.cidadeCliente = cidadeCliente;
		this.estadoCliente = estadoCliente;
		this.paisCliente = paisCliente;
		this.ativoCliente = ativoCliente;
	}

	public Integer getIdClientes() {
		return this.idClientes;
	}

	public void setIdClientes(Integer idClientes) {
		this.idClientes = idClientes;
	}

	public String getNomeCliente() {
		return this.nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public Date getNascimentoCliente() {
		return this.nascimentoCliente;
	}

	public void setNascimentoCliente(Date nascimentoCliente) {
		this.nascimentoCliente = nascimentoCliente;
	}

	public String getEmailCliente() {
		return this.emailCliente;
	}

	public void setEmailCliente(String emailCliente) {
		this.emailCliente = emailCliente;
	}

	public String getCpfCliente() {
		return this.cpfCliente;
	}

	public void setCpfCliente(String cpfCliente) {
		this.cpfCliente = cpfCliente;
	}

	public String getCepCliente() {
		return this.cepCliente;
	}

	public void setCepCliente(String cepCliente) {
		this.cepCliente = cepCliente;
	}

	public String getLogradouroCliente() {
		return this.logradouroCliente;
	}

	public void setLogradouroCliente(String logradouroCliente) {
		this.logradouroCliente = logradouroCliente;
	}

	public String getBairroCliente() {
		return this.bairroCliente;
	}

	public void setBairroCliente(String bairroCliente) {
		this.bairroCliente = bairroCliente;
	}

	public String getCidadeCliente() {
		return this.cidadeCliente;
	}

	public void setCidadeCliente(String cidadeCliente) {
		this.cidadeCliente = cidadeCliente;
	}

	public String getPaisCliente() {
		return this.paisCliente;
	}

	public void setPaisCliente(String paisCliente) {
		this.paisCliente = paisCliente;
	}

	public Character getAtivoCliente() {
		return this.ativoCliente;
	}

	public void setAtivoCliente(Character ativoCliente) {
		this.ativoCliente = ativoCliente;
	}

	public String getEstadoCliente() {
		return estadoCliente;
	}

	public void setEstadoCliente(String estadoCliente) {
		this.estadoCliente = estadoCliente;
	}

}
