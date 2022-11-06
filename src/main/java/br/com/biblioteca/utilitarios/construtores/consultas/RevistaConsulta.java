package main.java.br.com.biblioteca.utilitarios.construtores.consultas;

import main.java.br.com.biblioteca.entidades.RevistaEntidade;
import main.java.br.com.biblioteca.utilitarios.constantes.ConsultasConstante;
import main.java.br.com.biblioteca.utilitarios.construtores.consultas.interfaces.RevistaConsultaInterface;

public class RevistaConsulta implements RevistaConsultaInterface {

    @Override
    public String criar(RevistaEntidade entity) {
        return String.format(
            ConsultasConstante.Revista.CRIAR,
            entity.getNome(),
            entity.getValor(),
            entity.getDataLancamento(),
            entity.getPaginas(),
            entity.getEditora(),
            entity.getEdicao()
        );
    }

    @Override
    public String atualizar(RevistaEntidade entity) {
        return String.format(
            ConsultasConstante.Revista.ATUALIZAR,
            entity.getNome(),
            entity.getValor(),
            entity.getDataLancamento(),
            entity.getPaginas(),
            entity.getEditora(),
            entity.getEdicao(),
            entity.getId()
        );
    }

    @Override
    public String buscarPorId(Integer id) {
        return String.format(
            ConsultasConstante.Revista.BUSCAR_POR_ID,
            id
        );
    }

    @Override
    public String buscar() {
        return ConsultasConstante.Revista.BUSCAR;
    }

    @Override
    public String deletar() {
        return ConsultasConstante.Revista.DELETAR;
    }

    @Override
    public String deletarPorId(Integer id) {
        return String.format(
            ConsultasConstante.Revista.DELETAR_POR_ID,
            id
        );
    }
}