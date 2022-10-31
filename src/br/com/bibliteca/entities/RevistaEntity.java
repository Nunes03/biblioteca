package br.com.bibliteca.entities;

import java.time.LocalDate;
import java.util.List;

public class RevistaEntity extends AcervoEntity {

	private Integer edicao;

	public RevistaEntity() {
	}

	public RevistaEntity(Integer id, String nome, LocalDate dataLancamento, Integer paginas, String editora,
			List<AutorEntity> autores, Integer edicao) {
		super(id, nome, dataLancamento, paginas, editora, autores);
		this.edicao = edicao;
	}

	public Integer getEdicao() {
		return edicao;
	}

	public void setEdicao(Integer edicao) {
		this.edicao = edicao;
	}
}