package main.java.br.com.biblioteca.utilitarios.construtores.consultas;

import main.java.br.com.biblioteca.entidades.AutorEntidade;
import main.java.br.com.biblioteca.utilitarios.constantes.ConsultasConstante;
import main.java.br.com.biblioteca.utilitarios.construtores.consultas.interfaces.AutorQueryInterface;

public class AutorQuery implements AutorQueryInterface {

    @Override
    public String criar(AutorEntidade entity) {
        return String.format(
            ConsultasConstante.Autor.CRIAR,
            entity.getNome()
        );
    }

    @Override
    public String atualizar(AutorEntidade entity) {
        return String.format(
            ConsultasConstante.Autor.ATUALIZAR,
            entity.getNome(),
            entity.getId()
        );
    }

    @Override
    public String buscarPorId(Integer id) {
        return String.format(
            ConsultasConstante.Autor.BUSCAR_POR_ID,
            id
        );
    }

    @Override
    public String buscar() {
        return ConsultasConstante.Autor.BUSCAR;
    }

    @Override
    public String deletar() {
        return ConsultasConstante.Autor.DELETAR;
    }

    @Override
    public String deletarPorId(Integer id) {
        return String.format(
            ConsultasConstante.Autor.DELETAR_POR_ID,
            id
        );
    }
}