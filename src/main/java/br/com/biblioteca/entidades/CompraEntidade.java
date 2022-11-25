package main.java.br.com.biblioteca.entidades;

import java.util.Date;

public class CompraEntidade {

    private Integer id;

    private Date data;

    private Double total;

    private ClienteEntidade cliente;

    public CompraEntidade() {
    }

    public CompraEntidade(Integer id) {
        this.id = id;
    }

    public CompraEntidade(Integer id, Date data, Double total, ClienteEntidade cliente) {
        this.id = id;
        this.data = data;
        this.total = total;
        this.cliente = cliente;
    }
    
    public CompraEntidade(Date data, Double total, ClienteEntidade cliente) {
        this.data = data;
        this.total = total;
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

    public ClienteEntidade getCliente() {
        return cliente;
    }

    public void setCliente(ClienteEntidade cliente) {
        this.cliente = cliente;
    }
}
