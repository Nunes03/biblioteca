package main.java.br.com.biblioteca.banco;

import main.java.br.com.biblioteca.excecoes.banco.ManipulacaoBancoExcecao;
import main.java.br.com.biblioteca.servicos.interfaces.QueryInterface;

import java.sql.ResultSet;
import java.sql.Statement;

public class ComandosDMLBanco {

    private ComandosDMLBanco() {}

    public static <E> Integer executarInsercao(E entity, QueryInterface<E> queryInterface) throws ManipulacaoBancoExcecao {
        try (Statement query = ConexaoBanco.pegarDeclaracao()) {
            return query.executeUpdate(queryInterface.criar(entity));
        } catch (Exception exception) {
            throw new ManipulacaoBancoExcecao("Erro ao inserir na base de dados.", exception);
        }
    }

    public static <E> Integer executarAtualizacao(E entity, QueryInterface<E> queryInterface) throws ManipulacaoBancoExcecao {
        try (Statement query = ConexaoBanco.pegarDeclaracao()) {
            return query.executeUpdate(queryInterface.atualizar(entity));
        } catch (Exception exception) {
            throw new ManipulacaoBancoExcecao("Erro ao inserir na base de dados.", exception);
        }
    }

    public static <E> ResultSet executarConsultaPorId(Integer id, QueryInterface<E> queryInterface) throws ManipulacaoBancoExcecao {
        try (Statement query = ConexaoBanco.pegarDeclaracao()) {
            return query.executeQuery(queryInterface.buscarPorId(id));
        } catch (Exception exception) {
            throw new ManipulacaoBancoExcecao("Erro ao inserir na base de dados.", exception);
        }
    }

    public static <E> ResultSet executarConsultaBuscandoTudo(QueryInterface<E> queryInterface) throws ManipulacaoBancoExcecao {
        try (Statement query = ConexaoBanco.pegarDeclaracao()) {
            return query.executeQuery(queryInterface.buscarTodos());
        } catch (Exception exception) {
            throw new ManipulacaoBancoExcecao("Erro ao inserir na base de dados.", exception);
        }
    }
}