package br.com.bibliteca.entities;

import java.time.LocalDate;
import java.util.List;

public class Periodico extends Acervo {

	private String regeiao;

	public Periodico(Integer id, String nome, LocalDate dataLancamento, Integer paginas, String editora,
			List<Autor> autores, String regeiao) {
		super(id, nome, dataLancamento, paginas, editora, autores);
		this.regeiao = regeiao;
	}

	public Periodico() {
	}

	public String getRegeiao() {
		return regeiao;
	}

	public void setRegeiao(String regeiao) {
		this.regeiao = regeiao;
	}

}
