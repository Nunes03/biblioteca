package main.java.br.com.biblioteca.repositorios;

import java.sql.Connection;
import java.sql.PreparedStatement;
import main.java.br.com.biblioteca.entidades.LivroEntidade;
import main.java.br.com.biblioteca.repositorios.interfaces.LivroRepositorioInterface;
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

public class LivroRepositorio implements LivroRepositorioInterface {

    @Override
    public Boolean criar(LivroEntidade entidade) {
        try {
            Connection connection = ConexaoBanco.pegarConexao();

            PreparedStatement preparedStatement = connection.prepareStatement(
                ConsultasConstante.Livro.CRIAR
            );
            preparedStatement.setString(1, entidade.getNome());
            preparedStatement.setString(2, entidade.getDescricao());
            preparedStatement.setDouble(3, entidade.getValor());
            preparedStatement.setDate(4, ConversorTipos.dateParaDateSql(entidade.getDataLancamento()));
            preparedStatement.setInt(5, entidade.getPaginas());
            preparedStatement.setString(6, entidade.getEditora());
            preparedStatement.setString(7, entidade.getAutor());
            preparedStatement.setBoolean(8, entidade.getCapaDura());
            preparedStatement.setString(9, entidade.getGenero().name());

            return preparedStatement.execute();
        } catch (SQLException exception) {
            throw new ConexaoBancoExcecao("Erro ao inserir na base de dados.", exception);
        }
    }

    @Override
    public Boolean atualizar(LivroEntidade entidade) {
        try {
            Connection connection = ConexaoBanco.pegarConexao();

            PreparedStatement preparedStatement = connection.prepareStatement(
                ConsultasConstante.Livro.ATUALIZAR
            );
            preparedStatement.setString(1, entidade.getNome());
            preparedStatement.setString(2, entidade.getDescricao());
            preparedStatement.setDouble(3, entidade.getValor());
            preparedStatement.setDate(4, ConversorTipos.dateParaDateSql(entidade.getDataLancamento()));
            preparedStatement.setInt(5, entidade.getPaginas());
            preparedStatement.setString(6, entidade.getEditora());
            preparedStatement.setBoolean(7, entidade.getCapaDura());
            preparedStatement.setString(8, entidade.getGenero().name());
            preparedStatement.setInt(9, entidade.getId());

            return preparedStatement.execute();
        } catch (SQLException exception) {
            throw new ConexaoBancoExcecao("Erro ao inserir na base de dados.", exception);
        }
    }

    @Override
    public List<LivroEntidade> buscar() {
        List<LivroEntidade> livros = new ArrayList<>();
        try {
            Connection connection = ConexaoBanco.pegarConexao();

            PreparedStatement preparedStatement = connection.prepareStatement(
                ConsultasConstante.Livro.BUSCAR
            );

            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                livros.add(
                    ConversorEntidade.resultSetParaLivro(resultSet)
                );
            }
            return livros;
        } catch (SQLException exception) {
            throw new RuntimeException(exception);
        }
    }

    @Override
    public Optional<LivroEntidade> buscarPorId(Integer id) {
        try {
            Connection connection = ConexaoBanco.pegarConexao();

            PreparedStatement preparedStatement = connection.prepareStatement(
                ConsultasConstante.Livro.BUSCAR_POR_ID
            );
            preparedStatement.setInt(1, id);

            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                return Optional.of(
                    ConversorEntidade.resultSetParaLivro(resultSet)
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
                ConsultasConstante.Livro.DELETAR
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
                ConsultasConstante.Livro.DELETAR_POR_ID
            );
            preparedStatement.setInt(1, id);

            return preparedStatement.execute();
        } catch (SQLException exception) {
            throw new RuntimeException(exception);
        }
    }

    @Override
    public LivroEntidade buscarUltimo() {
        try {
            Connection connection = ConexaoBanco.pegarConexao();

            PreparedStatement preparedStatement = connection.prepareStatement(
                ConsultasConstante.Livro.BUSCAR_ULTIMO
            );

            ResultSet resultSet = preparedStatement.executeQuery();
            resultSet.next();
            return ConversorEntidade.resultSetParaLivro(resultSet);
        } catch (SQLException exception) {
            throw new RuntimeException(exception);
        }
    }
}
