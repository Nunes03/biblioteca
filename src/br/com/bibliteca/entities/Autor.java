package br.com.bibliteca.entities;

import java.util.ArrayList;
import java.util.List;

public class Autor {

	private Integer id;
	
	private String nome;
	
	private List<Acervo> acervos = new ArrayList<>();

	public Autor() {
	}
	
	public Autor(Integer id, String nome, List<Acervo> acervos) {
		this.id = id;
		this.nome = nome;
		this.acervos = acervos;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Acervo> getAcervos() {
		return acervos;
	}

	public void setAcervos(List<Acervo> acervos) {
		this.acervos = acervos;
	}
}