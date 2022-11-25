package main.java.br.com.biblioteca.entidades;

import java.util.Date;

import main.java.br.com.biblioteca.enums.GeneroEnum;

public class LivroEntidade extends AcervoEntidade {

    private String descricao;

    private Boolean capaDura;

    private GeneroEnum genero;

    public LivroEntidade() {
    }

    public LivroEntidade(Integer id, String nome, Double valor, Date dataLancamento, Integer paginas, String editora,
        String autor, byte[] foto, Boolean ativo, String descricao, Boolean capaDura, GeneroEnum genero) {
        super(id, nome, valor, dataLancamento, paginas, editora, autor, foto, ativo);
        this.descricao = descricao;
        this.capaDura = capaDura;
        this.genero = genero;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean getCapaDura() {
        return this.capaDura;
    }

    public void setCapaDura(Boolean capaDura) {
        this.capaDura = capaDura;
    }

    public GeneroEnum getGenero() {
        return this.genero;
    }

    public void setGenero(GeneroEnum genero) {
        this.genero = genero;
    }
}
