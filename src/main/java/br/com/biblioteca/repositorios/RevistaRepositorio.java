package main.java.br.com.biblioteca.repositorios;

import java.sql.Connection;
import java.sql.PreparedStatement;
import main.java.br.com.biblioteca.entidades.RevistaEntidade;
import main.java.br.com.biblioteca.repositorios.interfaces.RevistaRepositorioInterface;
import main.java.br.com.biblioteca.utilitarios.conversores.ConversorEntidade;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import main.java.br.com.biblioteca.banco.ConexaoBanco;
import main.java.br.com.biblioteca.excecoes.banco.ConexaoBancoExcecao;
import main.java.br.com.biblioteca.utilitarios.constantes.ConsultasConstante;
import main.java.br.com.biblioteca.utilitarios.conversores.ConversorTipos;

public class RevistaRepositorio implements RevistaRepositorioInterface {

    @Override
    public Boolean criar(RevistaEntidade entidade) {
        try {
            Connection connection = ConexaoBanco.pegarConexao();

            PreparedStatement preparedStatement = connection.prepareStatement(
                ConsultasConstante.Revista.CRIAR
            );
            preparedStatement.setString(1, entidade.getNome());
            preparedStatement.setDouble(2, entidade.getValor());
            preparedStatement.setDate(3, ConversorTipos.dateParaDateSql(entidade.getDataLancamento()));
            preparedStatement.setInt(4, entidade.getPaginas());
            preparedStatement.setString(5, entidade.getEditora());
            preparedStatement.setBytes(6, entidade.getFoto());
            preparedStatement.setInt(7, entidade.getEdicao());

            return preparedStatement.execute();
        } catch (SQLException exception) {
            throw new ConexaoBancoExcecao("Erro ao inserir na base de dados.", exception);
        }
    }

    @Override
    public Boolean atualizar(RevistaEntidade entidade) {
        try {
            Connection connection = ConexaoBanco.pegarConexao();

            PreparedStatement preparedStatement = connection.prepareStatement(
                ConsultasConstante.Revista.ATUALIZAR
            );
            preparedStatement.setString(1, entidade.getNome());
            preparedStatement.setDouble(2, entidade.getValor());
            preparedStatement.setDate(3, ConversorTipos.dateParaDateSql(entidade.getDataLancamento()));
            preparedStatement.setInt(4, entidade.getPaginas());
            preparedStatement.setString(5, entidade.getEditora());
            preparedStatement.setInt(6, entidade.getEdicao());
            preparedStatement.setInt(7, entidade.getId());

            return preparedStatement.execute();
        } catch (SQLException exception) {
            throw new ConexaoBancoExcecao("Erro ao inserir na base de dados.", exception);
        }
    }

    @Override
    public List<RevistaEntidade> buscar() {
        List<RevistaEntidade> revistas = new ArrayList<>();
        try {
            Connection connection = ConexaoBanco.pegarConexao();

            PreparedStatement preparedStatement = connection.prepareStatement(
                ConsultasConstante.Revista.BUSCAR
            );

            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                revistas.add(
                    ConversorEntidade.resultSetParaRevista(resultSet)
                );
            }
            return revistas;
        } catch (SQLException exception) {
            throw new RuntimeException(exception);
        }
    }

    @Override
    public Optional<RevistaEntidade> buscarPorId(Integer id) {
        try {
            Connection connection = ConexaoBanco.pegarConexao();

            PreparedStatement preparedStatement = connection.prepareStatement(
                ConsultasConstante.Revista.BUSCAR_POR_ID
            );
            preparedStatement.setInt(1, id);

            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                Optional.of(
                    ConversorEntidade.resultSetParaRevista(resultSet)
                );
            }
            return Optional.empty();
        } catch (SQLException exception) {
            throw new RuntimeException(exception);
        }
    }

    @Override
    public Boolean deletar() {
        try {
            Connection connection = ConexaoBanco.pegarConexao();

            PreparedStatement preparedStatement = connection.prepareStatement(
                ConsultasConstante.Revista.DELETAR
            );

            return preparedStatement.execute();
        } catch (SQLException exception) {
            throw new RuntimeException(exception);
        }
    }

    @Override
    public Boolean deletarPorId(Integer id) {
        try {
            Connection connection = ConexaoBanco.pegarConexao();

            PreparedStatement preparedStatement = connection.prepareStatement(
                ConsultasConstante.Revista.DELETAR_POR_ID
            );
            preparedStatement.setInt(1, id);

            return preparedStatement.execute();
        } catch (SQLException exception) {
            throw new RuntimeException(exception);
        }
    }
}
