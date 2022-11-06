package main.java.br.com.biblioteca.banco;

import main.java.br.com.biblioteca.excecoes.banco.ConexaoBancoExcecao;
import main.java.br.com.biblioteca.servicos.interfaces.ConsultaInterface;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ComandosDMLBanco {

    private ComandosDMLBanco() {
    }

    public static <E> Integer executarInsercao(ConsultaInterface<E> consultaInterface, E entidade) {
        try {
            Connection connection = ConexaoBanco.pegarConexao();
            PreparedStatement preparedStatement = connection.prepareStatement(consultaInterface.criar(entidade));
            return preparedStatement.executeUpdate();
        } catch (Exception exception) {
            throw new ConexaoBancoExcecao("Erro ao inserir na base de dados.", exception);
        }
    }

    public static <E> Integer executarAtualizacao(ConsultaInterface<E> consultaInterface, E entidade) {
        try {
            Connection connection = ConexaoBanco.pegarConexao();
            PreparedStatement preparedStatement = connection.prepareStatement(consultaInterface.atualizar(entidade));
            return preparedStatement.executeUpdate();
        } catch (Exception exception) {
            throw new ConexaoBancoExcecao("Erro ao atualizar na base de dados.", exception);
        }
    }

    public static <E> ResultSet executarConsultaPorId(ConsultaInterface<E> consultaInterface, Integer id) {
        try {
            Connection connection = ConexaoBanco.pegarConexao();
            PreparedStatement preparedStatement = connection.prepareStatement(consultaInterface.buscarPorId(id));
            return preparedStatement.executeQuery();
        } catch (Exception exception) {
            throw new ConexaoBancoExcecao("Erro ao consultar na base de dados.", exception);
        }
    }

    public static <E> ResultSet executarConsultaBuscandoTudo(ConsultaInterface<E> consultaInterface) {
        try {
            Connection connection = ConexaoBanco.pegarConexao();
            PreparedStatement preparedStatement = connection.prepareStatement(consultaInterface.buscar());
            return preparedStatement.executeQuery();
        } catch (Exception exception) {
            throw new ConexaoBancoExcecao("Erro ao consultar na base de dados.", exception);
        }
    }

    public static <E> Integer executarExclusao(ConsultaInterface<E> consultaInterface) {
        try {
            Connection conexao = ConexaoBanco.pegarConexao();
            PreparedStatement preparedStatement = conexao.prepareStatement(consultaInterface.deletar());
            return preparedStatement.executeUpdate();
        } catch (Exception exception) {
            throw new ConexaoBancoExcecao("Erro ao atualizar na base de dados.", exception);
        }
    }

    public static <E> Integer executarExclusaoPorId(ConsultaInterface<E> consultaInterface, Integer id) {
        try {
            Connection connection = ConexaoBanco.pegarConexao();
            PreparedStatement preparedStatement = connection.prepareStatement(consultaInterface.deletarPorId(id));
            return preparedStatement.executeUpdate();
        } catch (Exception exception) {
            throw new ConexaoBancoExcecao("Erro ao atualizar na base de dados.", exception);
        }
    }
}