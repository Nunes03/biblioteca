package br.com.bibliteca.entities;

import java.time.LocalDate;
import java.util.List;

public class Periodico extends Acervo {

	private String regiao;

	public Periodico(Integer id, String nome, LocalDate dataLancamento, Integer paginas, String editora,
			List<Autor> autores, String regeiao) {
		super(id, nome, dataLancamento, paginas, editora, autores);
		this.regiao = regeiao;
	}

	public Periodico() {
	}

	public String getRegiao() {
		return regiao;
	}

	public void setRegiao(String regeiao) {
		this.regiao = regeiao;
	}

}
