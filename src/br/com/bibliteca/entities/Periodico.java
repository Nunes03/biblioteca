package br.com.bibliteca.entities;

public class Periodico extends Acervo{

	private String regeiao;

	public Periodico(String regeiao) {
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
