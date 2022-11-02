package br.com.bibliteca.entities;

import java.time.LocalDate;
import java.util.List;

public class PeriodicoEntity extends AcervoEntity {

	private String regiao;

	public PeriodicoEntity() {
	}

	public PeriodicoEntity(Integer id, String nome, Double valor, LocalDate dataLancamento, Integer paginas, String editora,
			List<AutorEntity> autores, String regiao) {
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