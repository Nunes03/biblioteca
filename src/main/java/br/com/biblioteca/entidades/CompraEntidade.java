package main.java.br.com.biblioteca.entidades;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CompraEntidade {

	private Integer id;

	private Date data;

	private Double total;

	private List<ItemCompraEntidade> itensCompra = new ArrayList<>();

	private ClienteEntidade cliente;

	public CompraEntidade() {
	}

	public CompraEntidade(Integer id, Date data, Double total, List<ItemCompraEntidade> itensDeCompra, ClienteEntidade cliente) {
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

	public List<ItemCompraEntidade> getItensCompra() {
		return itensCompra;
	}

	public void setItensCompra(List<ItemCompraEntidade> ItensDeCompra) {
		this.itensCompra = ItensDeCompra;
	}

	public ClienteEntidade getCliente() {
		return cliente;
	}

	public void setCliente(ClienteEntidade cliente) {
		this.cliente = cliente;
	}
}