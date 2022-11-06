package main.java.br.com.biblioteca.repositorios;

import main.java.br.com.biblioteca.banco.ComandosDMLBanco;
import main.java.br.com.biblioteca.entidades.CompraEntidade;
import main.java.br.com.biblioteca.repositorios.interfaces.CompraRepositorioInterface;
import main.java.br.com.biblioteca.utilitarios.construtores.consultas.CompraConsulta;
import main.java.br.com.biblioteca.utilitarios.construtores.consultas.interfaces.CompraConsultaInterface;
import main.java.br.com.biblioteca.utilitarios.conversores.ConversorEntidade;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class CompraRepositorio implements CompraRepositorioInterface {

    @Override
    public Boolean criar(CompraEntidade entidade) {
        try {
            CompraConsultaInterface compraConsultaInterface = new CompraConsulta();
            ComandosDMLBanco.executarInsercao(compraConsultaInterface, entidade);
            return Boolean.TRUE;
        } catch (Exception exception) {
            exception.printStackTrace();//todo: Colocar um JAlert aqui para avisar.
            return Boolean.FALSE;
        }
    }

    @Override
    public Boolean atualizar(CompraEntidade entidade) {
        try {
            CompraConsultaInterface compraConsultaInterface = new CompraConsulta();
            ComandosDMLBanco.executarAtualizacao(compraConsultaInterface, entidade);
            return Boolean.TRUE;
        } catch (Exception exception) {
            exception.printStackTrace();//todo: Colocar um JAlert aqui para avisar.
            return Boolean.FALSE;
        }
    }

    @Override
    public List<CompraEntidade> buscarTodos() {
        List<CompraEntidade> compraEntidades = new ArrayList<>();
        try {
            CompraConsultaInterface compraConsultaInterface = new CompraConsulta();
            ResultSet resultSet = ComandosDMLBanco.executarConsultaBuscandoTudo(compraConsultaInterface);
            while (resultSet.next()) {
                compraEntidades.add(
                    ConversorEntidade.resultSetParaCompra(resultSet)
                );
            }
            return compraEntidades;
        } catch (Exception exception) {
            exception.printStackTrace();//todo: Colocar um JAlert aqui para avisar.
            return compraEntidades;
        }
    }

    @Override
    public Optional<CompraEntidade> buscarPorId(Integer id) {
        try {
            CompraConsultaInterface compraConsultaInterface = new CompraConsulta();
            ResultSet resultSet = ComandosDMLBanco.executarConsultaPorId(compraConsultaInterface, id);
            if (resultSet.next()) {
                return Optional.of(ConversorEntidade.resultSetParaCompra(resultSet));
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
            CompraConsultaInterface compraConsultaInterface = new CompraConsulta();
            ComandosDMLBanco.executarExclusao(compraConsultaInterface);
            return Boolean.TRUE;
        } catch (Exception exception) {
            exception.printStackTrace();//todo: Colocar um JAlert aqui para avisar.
            return Boolean.FALSE;
        }
    }

    @Override
    public Boolean deletarPorId(Integer id) {
        try {
            CompraConsultaInterface compraConsultaInterface = new CompraConsulta();
            ComandosDMLBanco.executarExclusaoPorId(compraConsultaInterface, id);
            return Boolean.TRUE;
        } catch (Exception exception) {
            exception.printStackTrace();//todo: Colocar um JAlert aqui para avisar.
            return Boolean.FALSE;
        }
    }
}