package br.com.bibliteca.entities;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class Compra {

	private Integer id;

	private Date data;

	private Double total;

	private List<ItensCompra> itensDeCompra = new ArrayList<>();

	private Cliente cliente;

	public Compra() {
	}

	public Compra(Integer id, Date data, Double total, List<ItensCompra> itensDeCompra, Cliente cliente) {
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

	public List<ItensCompra> getItensDeCompra() {
		return itensDeCompra;
	}

	public void setItensDeCompra(List<ItensCompra> ItensDeCompra) {
		this.itensDeCompra = ItensDeCompra;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
}