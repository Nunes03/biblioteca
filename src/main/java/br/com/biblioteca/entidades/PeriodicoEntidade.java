package main.java.br.com.biblioteca.entidades;

import java.time.LocalDate;
import java.util.List;

public class PeriodicoEntidade extends AcervoEntidade {

	private String regiao;

	public PeriodicoEntidade() {
	}

	public PeriodicoEntidade(Integer id, String nome, Double valor, LocalDate dataLancamento, Integer paginas, String editora,
							 List<AutorEntidade> autores, String regiao) {
		super(id, nome, valor, dataLancamento, paginas, editora, autores);
		this.regiao = regiao;
	}

	public String getRegiao() {
		return regiao;
	}

	public void setRegiao(String regeiao) {
		this.regiao = regeiao;
	}
}