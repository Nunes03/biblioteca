package main.java.br.com.biblioteca.banco;

import main.java.br.com.biblioteca.excecoes.banco.ConexaoBancoExcecao;
import main.java.br.com.biblioteca.servicos.interfaces.QueryInterface;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ComandosDMLBanco {

    private ComandosDMLBanco() {
    }

    public static <E> Integer executarInsercao(E entity, QueryInterface<E> queryInterface) {
        try {
            Connection connection = ConexaoBanco.pegarConexao();
            PreparedStatement preparedStatement = connection.prepareStatement(queryInterface.criar(entity));
            return preparedStatement.executeUpdate();
        } catch (Exception exception) {
            throw new ConexaoBancoExcecao("Erro ao inserir na base de dados.", exception);
        }
    }

    public static <E> Integer executarAtualizacao(E entity, QueryInterface<E> queryInterface) {
        try {
            Connection connection = ConexaoBanco.pegarConexao();
            PreparedStatement preparedStatement = connection.prepareStatement(queryInterface.atualizar(entity));
            return preparedStatement.executeUpdate();
        } catch (Exception exception) {
            throw new ConexaoBancoExcecao("Erro ao atualizar na base de dados.", exception);
        }
    }

    public static <E> ResultSet executarConsultaPorId(Integer id, QueryInterface<E> queryInterface) {
        try {
            Connection connection = ConexaoBanco.pegarConexao();
            PreparedStatement preparedStatement = connection.prepareStatement(queryInterface.buscarPorId(id));
            return preparedStatement.executeQuery();
        } catch (Exception exception) {
            throw new ConexaoBancoExcecao("Erro ao consultar na base de dados.", exception);
        }
    }

    public static <E> ResultSet executarConsultaBuscandoTudo(QueryInterface<E> queryInterface) {
        try {
            Connection connection = ConexaoBanco.pegarConexao();
            PreparedStatement preparedStatement = connection.prepareStatement(queryInterface.buscarTodos());
            return preparedStatement.executeQuery();
        } catch (Exception exception) {
            throw new ConexaoBancoExcecao("Erro ao consultar na base de dados.", exception);
        }
    }
}