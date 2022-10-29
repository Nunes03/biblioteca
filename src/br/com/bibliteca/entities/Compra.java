package br.com.bibliteca.entities;

import java.sql.Date;
import java.util.List;

public class Compra {

	private Integer id;
	private Date data;
	private Double total;
	private List<ItensCompra> intesDeCompra;
	private Cliente cliente;

	public Compra(Integer id, Date data, Double total, List<ItensCompra> intesDeCompra, Cliente cliente) {
		super();
		this.id = id;
		this.data = data;
		this.total = total;
		this.intesDeCompra = intesDeCompra;
		this.cliente = cliente;
	}

	public Compra() {
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

	public List<ItensCompra> getIntesDeCompra() {
		return intesDeCompra;
	}

	public void setIntesDeCompra(List<ItensCompra> intesDeCompra) {
		this.intesDeCompra = intesDeCompra;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

}
