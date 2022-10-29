package br.com.bibliteca.entities;

import java.util.List;

public class ItensCompra {

	private Integer id;
	private Integer quantidade;
	private List<Acervo> acervos;
	private Compra compra;

	public ItensCompra(Integer id, Integer quantidade, List<Acervo> acervos, Compra compra) {
		this.id = id;
		this.quantidade = quantidade;
		this.acervos = acervos;
		this.compra = compra;
	}

	public ItensCompra() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public List<Acervo> getAcervos() {
		return acervos;
	}

	public void setAcervos(List<Acervo> acervos) {
		this.acervos = acervos;
	}

	public Compra getCompra() {
		return compra;
	}

	public void setCompra(Compra compra) {
		this.compra = compra;
	}

}
