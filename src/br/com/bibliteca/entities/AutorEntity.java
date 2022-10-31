package br.com.bibliteca.entities;

import java.util.ArrayList;
import java.util.List;

public class AutorEntity {

	private Integer id;
	
	private String nome;
	
	private List<AcervoEntity> acervos = new ArrayList<>();

	public AutorEntity() {
	}
	
	public AutorEntity(Integer id, String nome, List<AcervoEntity> acervos) {
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

	public List<AcervoEntity> getAcervos() {
		return acervos;
	}

	public void setAcervos(List<AcervoEntity> acervos) {
		this.acervos = acervos;
	}
}