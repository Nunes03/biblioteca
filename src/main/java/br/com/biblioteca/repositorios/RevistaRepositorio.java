package main.java.br.com.biblioteca.repositorios;

import main.java.br.com.biblioteca.banco.ComandosDMLBanco;
import main.java.br.com.biblioteca.entidades.RevistaEntidade;
import main.java.br.com.biblioteca.repositorios.interfaces.RevistaRepositorioInterface;
import main.java.br.com.biblioteca.utilitarios.construtores.consultas.RevistaConsulta;
import main.java.br.com.biblioteca.utilitarios.construtores.consultas.interfaces.RevistaConsultaInterface;
import main.java.br.com.biblioteca.utilitarios.conversores.ConversorEntidade;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class RevistaRepositorio implements RevistaRepositorioInterface {

    @Override
    public Boolean criar(RevistaEntidade entidade) {
        try {
            RevistaConsultaInterface revistaConsultaInterface = new RevistaConsulta();
            ComandosDMLBanco.executarInsercao(revistaConsultaInterface, entidade);
            return Boolean.TRUE;
        } catch (Exception exception) {
            exception.printStackTrace();//todo: Colocar um JAlert aqui para avisar.
            return Boolean.FALSE;
        }
    }

    @Override
    public Boolean atualizar(RevistaEntidade entidade) {
        try {
            RevistaConsultaInterface revistaConsultaInterface = new RevistaConsulta();
            ComandosDMLBanco.executarAtualizacao(revistaConsultaInterface, entidade);
            return Boolean.TRUE;
        } catch (Exception exception) {
            exception.printStackTrace();//todo: Colocar um JAlert aqui para avisar.
            return Boolean.FALSE;
        }
    }

    @Override
    public List<RevistaEntidade> buscarTodos() {
        List<RevistaEntidade> RevistaEntidades = new ArrayList<>();
        try {
            RevistaConsultaInterface revistaConsultaInterface = new RevistaConsulta();
            ResultSet resultSet = ComandosDMLBanco.executarConsultaBuscandoTudo(revistaConsultaInterface);
            while (resultSet.next()) {
                RevistaEntidades.add(
                    ConversorEntidade.resultSetParaRevista(resultSet)
                );
            }
            return RevistaEntidades;
        } catch (Exception exception) {
            exception.printStackTrace();//todo: Colocar um JAlert aqui para avisar.
            return RevistaEntidades;
        }
    }

    @Override
    public Optional<RevistaEntidade> buscarPorId(Integer id) {
        try {
            RevistaConsultaInterface revistaConsultaInterface = new RevistaConsulta();
            ResultSet resultSet = ComandosDMLBanco.executarConsultaPorId(revistaConsultaInterface, id);
            if (resultSet.next()) {
                return Optional.of(ConversorEntidade.resultSetParaRevista(resultSet));
            }
            return Optional.empty();
        } catch (Exception exception) {
            exception.printStackTrace();//todo: Colocar um JAlert aqui para avisar.
            return Optional.empty();
        }
    }

    @Override
    public Boolean deletarTodos() {
        try {
            RevistaConsultaInterface revistaConsultaInterface = new RevistaConsulta();
            ComandosDMLBanco.executarExclusao(revistaConsultaInterface);
            return Boolean.TRUE;
        } catch (Exception exception) {
            exception.printStackTrace();//todo: Colocar um JAlert aqui para avisar.
            return Boolean.FALSE;
        }
    }

    @Override
    public Boolean deletarPorId(Integer id) {
        try {
            RevistaConsultaInterface revistaConsultaInterface = new RevistaConsulta();
            ComandosDMLBanco.executarExclusaoPorId(revistaConsultaInterface, id);
            return Boolean.TRUE;
        } catch (Exception exception) {
            exception.printStackTrace();//todo: Colocar um JAlert aqui para avisar.
            return Boolean.FALSE;
        }
    }
}