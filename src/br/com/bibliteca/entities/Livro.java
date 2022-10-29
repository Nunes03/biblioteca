package br.com.bibliteca.entities;

import br.com.bibliteca.enums.GeneroEnum;

public class Livro extends Acervo{

	private String descricao;
	private boolean capaDura;
	private GeneroEnum genero;

	public Livro(String descricao, boolean capaDura, GeneroEnum genero) {
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

	public void setCapaDura(boolean capaDura) {
		this.capaDura = capaDura;
	}

	public GeneroEnum getGenero() {
		return genero;
	}

	public void setGenero(GeneroEnum genero) {
		this.genero = genero;
	}

}
