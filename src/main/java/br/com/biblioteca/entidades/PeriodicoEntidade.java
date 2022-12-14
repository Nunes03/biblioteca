package main.java.br.com.biblioteca.entidades;

import java.util.Date;

public class PeriodicoEntidade extends AcervoEntidade {

    private String regiao;

    public PeriodicoEntidade() {
    }

    public PeriodicoEntidade(Integer id, String nome, Double valor, Date dataLancamento, Integer paginas, String editora,
        String autor, byte[] foto, Boolean ativo, String regiao) {
        super(id, nome, valor, dataLancamento, paginas, editora, autor, foto, ativo, 3);
        this.regiao = regiao;
    }
    
    public PeriodicoEntidade(String nome, Double valor, Date dataLancamento, Integer paginas, String editora,
        String autor, byte[] foto, Boolean ativo, String regiao) {
        super(nome, valor, dataLancamento, paginas, editora, autor, foto, ativo, 3);
        this.regiao = regiao;
    }
    
    public String getRegiao() {
        return regiao;
    }

    public void setRegiao(String regeiao) {
        this.regiao = regeiao;
    }
}
