package main.java.br.com.biblioteca.entidades;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public class RevistaEntidade extends AcervoEntidade {

	private Integer edicao;

	public RevistaEntidade() {
	}

	public RevistaEntidade(Integer id, String nome, Double valor, Date dataLancamento, Integer paginas,
						   String editora, List<AutorEntidade> autores, Integer edicao) {
		super(id, nome, valor, dataLancamento, paginas, editora, autores);
		this.edicao = edicao;
	}

	public Integer getEdicao() {
		return edicao;
	}

	public void setEdicao(Integer edicao) {
		this.edicao = edicao;
	}
}