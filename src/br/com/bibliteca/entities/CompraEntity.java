package br.com.bibliteca.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CompraEntity {

	private Integer id;

	private Date data;

	private Double total;

	private List<ItensCompraEntity> itensDeCompra = new ArrayList<>();

	private ClienteEntity cliente;

	public CompraEntity() {
	}

	public CompraEntity(Integer id, Date data, Double total, List<ItensCompraEntity> itensDeCompra, ClienteEntity cliente) {
		super();
		this.id = id;
		this.data = data;
		this.total = total;
		this.itensDeCompra = itensDeCompra;
		this.cliente = cliente;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}

	public List<ItensCompraEntity> getItensDeCompra() {
		return itensDeCompra;
	}

	public void setItensDeCompra(List<ItensCompraEntity> ItensDeCompra) {
		this.itensDeCompra = ItensDeCompra;
	}

	public ClienteEntity getCliente() {
		return cliente;
	}

	public void setCliente(ClienteEntity cliente) {
		this.cliente = cliente;
	}
}