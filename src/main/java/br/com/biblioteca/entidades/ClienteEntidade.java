package main.java.br.com.biblioteca.entidades;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ClienteEntidade {

	private Integer id;

	private String nomeCompleto;

	private Date dataNascimento;

	private String cpf;

	private String telefone;

        private byte[] foto;
        
	private List<CompraEntidade> compras = new ArrayList<>();

	public ClienteEntidade() {
	}

	public ClienteEntidade(Integer id) {
		this.id = id;
	}

	public ClienteEntidade(Integer id, String nomeCompleto, Date dataNascimento, String cpf, String telefone,
						   byte[] foto, List<CompraEntidade> compras) {
		this.id = id;
		this.nomeCompleto = nomeCompleto;
		this.dataNascimento = dataNascimento;
		this.cpf = cpf;
		this.telefone = telefone;
                this.foto = foto;
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
        
        public void setFoto(byte[] foto) {
            this.foto = foto;
        }
        
        public byte[] getFoto() {
            return this.foto;
        }
        
	public List<CompraEntidade> getCompras() {
		return compras;
	}

	public void setCompras(List<CompraEntidade> compras) {
		this.compras = compras;
	}

	@Override
	public String toString() {
		return "ClienteEntidade{" +
			"id=" + id +
			", nomeCompleto='" + nomeCompleto + '\'' +
			", dataNascimento=" + dataNascimento +
			", cpf='" + cpf + '\'' +
			", telefone='" + telefone + '\'' +
			", compras=" + compras +
			'}';
	}
}