package main.java.br.com.biblioteca.entidades;

import java.util.Date;

public class ClienteEntidade {

    private Integer id;

    private String nomeCompleto;

    private Date dataNascimento;

    private String cpf;

    private String telefone;
    
    private Boolean ativo;

    private byte[] foto;

    public ClienteEntidade() {
    }

    public ClienteEntidade(Integer id) {
        this.id = id;
    }

    public ClienteEntidade(Integer id, String nomeCompleto, Date dataNascimento, String cpf, String telefone,
        Boolean ativo, byte[] foto) {
        this.id = id;
        this.nomeCompleto = nomeCompleto;
        this.dataNascimento = dataNascimento;
        this.cpf = cpf;
        this.telefone = telefone;
        this.ativo = ativo;
        this.foto = foto;
    }

    public ClienteEntidade(String nomeCompleto, Date dataNascimento, String cpf, String telefone,
        Boolean ativo, byte[] foto) {
        this.nomeCompleto = nomeCompleto;
        this.dataNascimento = dataNascimento;
        this.cpf = cpf;
        this.telefone = telefone;
        this.ativo = ativo;
        this.foto = foto;
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
    
    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }

    public Boolean getAtivo() {
        return this.ativo;
    }
    
    public void setFoto(byte[] foto) {
        this.foto = foto;
    }

    public byte[] getFoto() {
        return this.foto;
    }
}
