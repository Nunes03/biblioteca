package main.java.br.com.biblioteca.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ClienteEntity {

	private Integer id;

	private String nomeCompleto;

	private Date dataNascimento;

	private String cpf;

	private String telefone;

	private List<CompraEntity> compras = new ArrayList<>();

	public ClienteEntity() {
	}

	public ClienteEntity(Integer id, String nomeCompleto, Date dataNascimento, String cpf, String telefone,
			List<CompraEntity> compras) {
		this.id = id;
		this.nomeCompleto = nomeCompleto;
		this.dataNascimento = dataNascimento;
		this.cpf = cpf;
		this.telefone = telefone;
		this.compras = compras;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public List<CompraEntity> getCompras() {
		return compras;
	}

	public void setCompras(List<CompraEntity> compras) {
		this.compras = compras;
	}
}