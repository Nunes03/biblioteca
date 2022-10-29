package br.com.bibliteca.entities;

public class Revista extends Acervo{

	private Integer edicao;

	public Revista(Integer edicao) {
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
