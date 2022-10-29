package br.com.bibliteca.entities;

import java.time.LocalDate;
import java.util.List;

public class Revista extends Acervo {

	private Integer edicao;

	public Revista(Integer id, String nome, LocalDate dataLancamento, Integer paginas, String editora,
			List<Autor> autores, Integer edicao) {
		super(id, nome, dataLancamento, paginas, editora, autores);
		this.edicao = edicao;
	}

	public Revista() {
	}

	public Integer getEdicao() {
		return edicao;
	}

	public void setEdicao(Integer edicao) {
		this.edicao = edicao;
	}

}
