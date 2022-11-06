package main.java.br.com.biblioteca.repositorios;

import main.java.br.com.biblioteca.banco.ComandosDMLBanco;
import main.java.br.com.biblioteca.entidades.ItemCompraEntidade;
import main.java.br.com.biblioteca.repositorios.interfaces.ItensCompraRepositorioInterface;
import main.java.br.com.biblioteca.utilitarios.construtores.consultas.ItemCompraConsulta;
import main.java.br.com.biblioteca.utilitarios.construtores.consultas.interfaces.ItemCompraConsultaInterface;
import main.java.br.com.biblioteca.utilitarios.conversores.ConversorEntidade;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ItensCompraRepositorio implements ItensCompraRepositorioInterface {

    @Override
    public Boolean criar(ItemCompraEntidade entidade) {
        try {
            ItemCompraConsultaInterface itemCompraConsultaInterface = new ItemCompraConsulta();
            ComandosDMLBanco.executarInsercao(itemCompraConsultaInterface, entidade);
            return Boolean.TRUE;
        } catch (Exception exception) {
            exception.printStackTrace();//todo: Colocar um JAlert aqui para avisar.
            return Boolean.FALSE;
        }
    }

    @Override
    public Boolean atualizar(ItemCompraEntidade entidade) {
        try {
            ItemCompraConsultaInterface itemCompraConsultaInterface = new ItemCompraConsulta();
            ComandosDMLBanco.executarAtualizacao(itemCompraConsultaInterface, entidade);
            return Boolean.TRUE;
        } catch (Exception exception) {
            exception.printStackTrace();//todo: Colocar um JAlert aqui para avisar.
            return Boolean.FALSE;
        }
    }

    @Override
    public List<ItemCompraEntidade> buscarTodos() {
        List<ItemCompraEntidade> itemCompraEntidades = new ArrayList<>();
        try {
            ItemCompraConsultaInterface itemCompraConsultaInterface = new ItemCompraConsulta();
            ResultSet resultSet = ComandosDMLBanco.executarConsultaBuscandoTudo(itemCompraConsultaInterface);
            while (resultSet.next()) {
                itemCompraEntidades.add(
                    ConversorEntidade.resultSetParaItemCompra(resultSet)
                );
            }
            return itemCompraEntidades;
        } catch (Exception exception) {
            exception.printStackTrace();//todo: Colocar um JAlert aqui para avisar.
            return itemCompraEntidades;
        }
    }

    @Override
    public Optional<ItemCompraEntidade> buscarPorId(Integer id) {
        try {
            ItemCompraConsultaInterface itemCompraConsultaInterface = new ItemCompraConsulta();
            ResultSet resultSet = ComandosDMLBanco.executarConsultaPorId(itemCompraConsultaInterface, id);
            if (resultSet.next()) {
                return Optional.of(ConversorEntidade.resultSetParaItemCompra(resultSet));
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
            ItemCompraConsultaInterface itemCompraConsultaInterface = new ItemCompraConsulta();
            ComandosDMLBanco.executarExclusao(itemCompraConsultaInterface);
            return Boolean.TRUE;
        } catch (Exception exception) {
            exception.printStackTrace();//todo: Colocar um JAlert aqui para avisar.
            return Boolean.FALSE;
        }
    }

    @Override
    public Boolean deletarPorId(Integer id) {
        try {
            ItemCompraConsultaInterface itemCompraConsultaInterface = new ItemCompraConsulta();
            ComandosDMLBanco.executarExclusaoPorId(itemCompraConsultaInterface, id);
            return Boolean.TRUE;
        } catch (Exception exception) {
            exception.printStackTrace();//todo: Colocar um JAlert aqui para avisar.
            return Boolean.FALSE;
        }
    }
}