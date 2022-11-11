package main.java.br.com.biblioteca.entidades;

import java.util.Date;
import java.util.List;

public class PeriodicoEntidade extends AcervoEntidade {

	private String regiao;

	public PeriodicoEntidade() {
	}

	public PeriodicoEntidade(Integer id, String nome, Double valor, Date dataLancamento, Integer paginas, String editora,
							 byte[] foto, List<AutorEntidade> autores, String regiao) {
		super(id, nome, valor, dataLancamento, paginas, editora, foto, autores);
		this.regiao = regiao;
	}

	public String getRegiao() {
		return regiao;
	}

	public void setRegiao(String regeiao) {
		this.regiao = regeiao;
	}
}