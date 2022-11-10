package main.java.br.com.biblioteca.entidades;

import java.util.ArrayList;
import java.util.List;

public class AutorEntidade {

	private Integer id;
	
	private String nome;
	
	private List<AcervoEntidade> acervos = new ArrayList<>();

	public AutorEntidade() {
	}
	
        public AutorEntidade(Integer id, String nome, List<AcervoEntidade> acervos) {
		this.id = id;
		this.nome = nome;
		this.acervos = acervos;
	}
        
	public AutorEntidade(String nome, List<AcervoEntidade> acervos) {
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

	public List<AcervoEntidade> getAcervos() {
		return acervos;
	}

	public void setAcervos(List<AcervoEntidade> acervos) {
		this.acervos = acervos;
	}
}