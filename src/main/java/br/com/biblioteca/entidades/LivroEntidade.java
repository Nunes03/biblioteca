package main.java.br.com.biblioteca.entidades;

import java.time.LocalDate;
import java.util.List;

import main.java.br.com.biblioteca.enums.GeneroEnum;

public class LivroEntidade extends AcervoEntidade {

	private String descricao;

	private Boolean capaDura;

	private GeneroEnum genero;

	public LivroEntidade() {
	}

	public LivroEntidade(Integer id, String nome, Double valor, LocalDate dataLancamento, Integer paginas, String editora,
						 List<AutorEntidade> autores, String descricao, Boolean capaDura, GeneroEnum genero) {
		super(id, nome, valor, dataLancamento, paginas, editora, autores);
		this.descricao = descricao;
		this.capaDura = capaDura;
		this.genero = genero;
	}

	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public boolean getCapaDura() {
		return this.capaDura;
	}

	public void setCapaDura(Boolean capaDura) {
		this.capaDura = capaDura;
	}

	public GeneroEnum getGenero() {
		return this.genero;
	}

	public void setGenero(GeneroEnum genero) {
		this.genero = genero;
	}
}