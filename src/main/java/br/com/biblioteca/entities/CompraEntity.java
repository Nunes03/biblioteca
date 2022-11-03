package main.java.br.com.biblioteca.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CompraEntity {

	private Integer id;

	private Date data;

	private Double total;

	private List<ItemCompraEntity> itensCompra = new ArrayList<>();

	private ClienteEntity cliente;

	public CompraEntity() {
	}

	public CompraEntity(Integer id, Date data, Double total, List<ItemCompraEntity> itensDeCompra, ClienteEntity cliente) {
		super();
		this.id = id;
		this.data = data;
		this.total = total;
		this.itensCompra = itensDeCompra;
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

	public List<ItemCompraEntity> getItensCompra() {
		return itensCompra;
	}

	public void setItensCompra(List<ItemCompraEntity> ItensDeCompra) {
		this.itensCompra = ItensDeCompra;
	}

	public ClienteEntity getCliente() {
		return cliente;
	}

	public void setCliente(ClienteEntity cliente) {
		this.cliente = cliente;
	}
}