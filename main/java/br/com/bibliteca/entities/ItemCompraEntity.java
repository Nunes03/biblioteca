package br.com.bibliteca.entities;

import java.util.ArrayList;
import java.util.List;

public class ItemCompraEntity {

	private Integer id;

	private Integer quantidade;

	private List<AcervoEntity> acervos = new ArrayList<>();

	private CompraEntity compra;

	public ItemCompraEntity() {
	}

	public ItemCompraEntity(Integer id, Integer quantidade, List<AcervoEntity> acervos, CompraEntity compra) {
		this.id = id;
		this.quantidade = quantidade;
		this.acervos = acervos;
		this.compra = compra;
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

	public List<AcervoEntity> getAcervos() {
		return acervos;
	}

	public void setAcervos(List<AcervoEntity> acervos) {
		this.acervos = acervos;
	}

	public CompraEntity getCompra() {
		return compra;
	}

	public void setCompra(CompraEntity compra) {
		this.compra = compra;
	}
}