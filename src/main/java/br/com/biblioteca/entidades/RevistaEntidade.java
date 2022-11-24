package main.java.br.com.biblioteca.entidades;

import java.util.Date;

public class RevistaEntidade extends AcervoEntidade {

    private Integer edicao;

    public RevistaEntidade() {
    }

    public RevistaEntidade(Integer id, String nome, Double valor, Date dataLancamento, Integer paginas,
        String editora, String autor, byte[] foto, Integer edicao, Boolean ativo) {
        super(id, nome, valor, dataLancamento, paginas, editora, autor, foto, ativo);
        this.edicao = edicao;
    }
    
    public RevistaEntidade(String nome, Double valor, Date dataLancamento, Integer paginas,
        String editora, String autor, byte[] foto, Integer edicao, Boolean ativo) {
        super(nome, valor, dataLancamento, paginas, editora, autor, foto, ativo);
        this.edicao = edicao;
    }
    
    public Integer getEdicao() {
        return edicao;
    }

    public void setEdicao(Integer edicao) {
        this.edicao = edicao;
    }
}
