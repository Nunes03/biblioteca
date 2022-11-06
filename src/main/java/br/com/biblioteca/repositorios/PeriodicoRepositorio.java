package main.java.br.com.biblioteca.repositorios;

import main.java.br.com.biblioteca.banco.ComandosDMLBanco;
import main.java.br.com.biblioteca.entidades.PeriodicoEntidade;
import main.java.br.com.biblioteca.repositorios.interfaces.PeriodicoRepositorioInterface;
import main.java.br.com.biblioteca.utilitarios.construtores.consultas.PeriodicoConsulta;
import main.java.br.com.biblioteca.utilitarios.construtores.consultas.interfaces.PeriodicoConsultaInterface;
import main.java.br.com.biblioteca.utilitarios.conversores.ConversorEntidade;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class PeriodicoRepositorio implements PeriodicoRepositorioInterface {

    @Override
    public Boolean criar(PeriodicoEntidade entidade) {
        try {
            PeriodicoConsultaInterface periodicoConsultaInterface = new PeriodicoConsulta();
            ComandosDMLBanco.executarInsercao(periodicoConsultaInterface, entidade);
            return Boolean.TRUE;
        } catch (Exception exception) {
            exception.printStackTrace();//todo: Colocar um JAlert aqui para avisar.
            return Boolean.FALSE;
        }
    }

    @Override
    public Boolean atualizar(PeriodicoEntidade entidade) {
        try {
            PeriodicoConsultaInterface periodicoConsultaInterface = new PeriodicoConsulta();
            ComandosDMLBanco.executarAtualizacao(periodicoConsultaInterface, entidade);
            return Boolean.TRUE;
        } catch (Exception exception) {
            exception.printStackTrace();//todo: Colocar um JAlert aqui para avisar.
            return Boolean.FALSE;
        }
    }

    @Override
    public List<PeriodicoEntidade> buscarTodos() {
        List<PeriodicoEntidade> periodicoEntidades = new ArrayList<>();
        try {
            PeriodicoConsultaInterface periodicoConsultaInterface = new PeriodicoConsulta();
            ResultSet resultSet = ComandosDMLBanco.executarConsultaBuscandoTudo(periodicoConsultaInterface);
            while (resultSet.next()) {
                periodicoEntidades.add(
                    ConversorEntidade.resultSetParaPeriodico(resultSet)
                );
            }
            return periodicoEntidades;
        } catch (Exception exception) {
            exception.printStackTrace();//todo: Colocar um JAlert aqui para avisar.
            return periodicoEntidades;
        }
    }

    @Override
    public Optional<PeriodicoEntidade> buscarPorId(Integer id) {
        try {
            PeriodicoConsultaInterface periodicoConsultaInterface = new PeriodicoConsulta();
            ResultSet resultSet = ComandosDMLBanco.executarConsultaPorId(periodicoConsultaInterface, id);
            if (resultSet.next()) {
                return Optional.of(ConversorEntidade.resultSetParaPeriodico(resultSet));
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
            PeriodicoConsultaInterface periodicoConsultaInterface = new PeriodicoConsulta();
            ComandosDMLBanco.executarExclusao(periodicoConsultaInterface);
            return Boolean.TRUE;
        } catch (Exception exception) {
            exception.printStackTrace();//todo: Colocar um JAlert aqui para avisar.
            return Boolean.FALSE;
        }
    }

    @Override
    public Boolean deletarPorId(Integer id) {
        try {
            PeriodicoConsultaInterface periodicoConsultaInterface = new PeriodicoConsulta();
            ComandosDMLBanco.executarExclusaoPorId(periodicoConsultaInterface, id);
            return Boolean.TRUE;
        } catch (Exception exception) {
            exception.printStackTrace();//todo: Colocar um JAlert aqui para avisar.
            return Boolean.FALSE;
        }
    }
}