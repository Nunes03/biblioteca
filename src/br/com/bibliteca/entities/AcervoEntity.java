package br.com.bibliteca.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class AcervoEntity {

	private Integer id;
	
	private String nome;
	
	private LocalDate dataLancamento;
	
	private Integer paginas;
	
	private String editora;
	
	private List<AutorEntity> autores = new ArrayList<>();
	
	public AcervoEntity() {
	}
	
	public AcervoEntity(Integer id, String nome, LocalDate dataLancamento, Integer paginas, String editora, List<AutorEntity> autores) {
		this.id = id;
		this.nome = nome;
		this.dataLancamento = dataLancamento;
		this.paginas = paginas;
		this.editora = editora;
		this.autores = autores;
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

	public LocalDate getDataLancamento() {
		return dataLancamento;
	}

	public void setDataLancamento(LocalDate dataLancamento) {
		this.dataLancamento = dataLancamento;
	}

	public Integer getPaginas() {
		return paginas;
	}

	public void setPaginas(Integer paginas) {
		this.paginas = paginas;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

	public List<AutorEntity> getAutores() {
		return autores;
	}

	public void setAutores(List<AutorEntity> autores) {
		this.autores = autores;
	}
}