package br.com.dadosSimples.model;

import java.util.Date;

public class Complements {
	
	private String nome;
	private String email;
	private String telefone;
	private Date data;
	
	public String getNome(){
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
	
	public String getTelefone() {
		return telefone;
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public Date getDataCad() {
		return data;
	}
	
	public void setDataCad(Date data) {
		this.data = data;
	}

}
