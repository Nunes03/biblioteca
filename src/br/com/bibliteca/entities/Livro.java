package br.com.bibliteca.entities;

import java.time.LocalDate;
import java.util.List;

import br.com.bibliteca.enums.GeneroEnum;

public class Livro extends Acervo{

	private String descricao;
	private Boolean capaDura;
	private GeneroEnum genero;


	public Livro(Integer id, String nome, LocalDate dataLancamento, Integer paginas, String editora,
			List<Autor> autores, String descricao, Boolean capaDura, GeneroEnum genero) {
		super(id, nome, dataLancamento, paginas, editora, autores);
		this.descricao = descricao;
		this.capaDura = capaDura;
		this.genero = genero;
	}


	public Livro() {
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public boolean isCapaDura() {
		return capaDura;
	}

	public void setCapaDura(Boolean capaDura) {
		this.capaDura = capaDura;
	}

	public GeneroEnum getGenero() {
		return genero;
	}

	public void setGenero(GeneroEnum genero) {
		this.genero = genero;
	}

}
