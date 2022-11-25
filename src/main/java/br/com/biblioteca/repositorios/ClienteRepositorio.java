package main.java.br.com.biblioteca.repositorios;

import java.sql.Connection;
import java.sql.PreparedStatement;
import main.java.br.com.biblioteca.entidades.ClienteEntidade;
import main.java.br.com.biblioteca.repositorios.interfaces.ClienteRepositorioInterface;
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

public class ClienteRepositorio implements ClienteRepositorioInterface {

    @Override
    public Boolean criar(ClienteEntidade entidade) {
        try {
            Connection connection = ConexaoBanco.pegarConexao();

            PreparedStatement preparedStatement = connection.prepareStatement(ConsultasConstante.Cliente.CRIAR);
            preparedStatement.setString(1, entidade.getNomeCompleto());
            preparedStatement.setDate(2, ConversorTipos.dateParaDateSql(entidade.getDataNascimento()));
            preparedStatement.setString(3, entidade.getCpf());
            preparedStatement.setString(4, entidade.getTelefone());
            preparedStatement.setBoolean(5, entidade.getAtivo());
            preparedStatement.setBytes(6, entidade.getFoto());

            return preparedStatement.execute();
        } catch (SQLException exception) {
            throw new ConexaoBancoExcecao("Erro ao inserir na base de dados.", exception);
        }
    }

    @Override
    public Boolean atualizar(ClienteEntidade entidade) {
        try {
            Connection connection = ConexaoBanco.pegarConexao();

            PreparedStatement preparedStatement = connection.prepareStatement(ConsultasConstante.Cliente.ATUALIZAR);
            preparedStatement.setString(1, entidade.getNomeCompleto());
            preparedStatement.setDate(2, ConversorTipos.dateParaDateSql(entidade.getDataNascimento()));
            preparedStatement.setString(3, entidade.getCpf());
            preparedStatement.setString(4, entidade.getTelefone());
            preparedStatement.setBoolean(5, entidade.getAtivo());
            preparedStatement.setBytes(6, entidade.getFoto());
            preparedStatement.setInt(7, entidade.getId());

            return preparedStatement.execute();
        } catch (SQLException exception) {
            throw new ConexaoBancoExcecao("Erro ao inserir na base de dados.", exception);
        }
    }

    @Override
    public List<ClienteEntidade> buscar() {
        List<ClienteEntidade> clientes = new ArrayList<>();
        try {
            Connection connection = ConexaoBanco.pegarConexao();

            PreparedStatement preparedStatement = connection.prepareStatement(
                ConsultasConstante.Cliente.BUSCAR
            );

            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                clientes.add(
                    ConversorEntidade.resultSetParaCliente(resultSet)
                );
            }
            return clientes;
        } catch (SQLException exception) {
            throw new RuntimeException(exception);
        }
    }

    @Override
    public Optional<ClienteEntidade> buscarPorId(Integer id) {
        try {
            Connection connection = ConexaoBanco.pegarConexao();

            PreparedStatement preparedStatement = connection.prepareStatement(
                ConsultasConstante.Cliente.BUSCAR_POR_ID
            );
            preparedStatement.setInt(1, id);

            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                return Optional.of(
                    ConversorEntidade.resultSetParaCliente(resultSet)
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
                ConsultasConstante.Cliente.DELETAR
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
                ConsultasConstante.Cliente.DELETAR_POR_ID
            );
            preparedStatement.setInt(1, id);

            return preparedStatement.execute();
        } catch (SQLException exception) {
            throw new RuntimeException(exception);
        }
    }

    @Override
    public Optional<ClienteEntidade> buscarPorCpf(String cpf) {
        try {
            Connection connection = ConexaoBanco.pegarConexao();

            PreparedStatement preparedStatement = connection.prepareStatement(
                ConsultasConstante.Cliente.BUSCAR_POR_CPF
            );
            preparedStatement.setString(1, cpf);

            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                return Optional.of(
                    ConversorEntidade.resultSetParaCliente(resultSet)
                );
            }
            return Optional.empty();
        } catch (SQLException exception) {
            throw new RuntimeException(exception);
        }
    }

    @Override
    public List<ClienteEntidade> buscarAtivos() {
        List<ClienteEntidade> clientes = new ArrayList<>();
        try {
            Connection connection = ConexaoBanco.pegarConexao();

            PreparedStatement preparedStatement = connection.prepareStatement(
                ConsultasConstante.Cliente.BUSCAR_ATIVOS
            );

            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                clientes.add(
                    ConversorEntidade.resultSetParaCliente(resultSet)
                );
            }
            return clientes;
        } catch (SQLException exception) {
            throw new RuntimeException(exception);
        }
    }

    @Override
    public Boolean inativar(Integer id) {
        try {
            Connection connection = ConexaoBanco.pegarConexao();

            PreparedStatement preparedStatement = connection.prepareStatement(
                ConsultasConstante.Cliente.INATIVAR
            );
            preparedStatement.setInt(1, id);

            return preparedStatement.execute();
        } catch (SQLException exception) {
            throw new ConexaoBancoExcecao("Erro ao inserir na base de dados.", exception);
        }
    }

    @Override
    public ClienteEntidade buscarUltimo() {
        try {
            Connection connection = ConexaoBanco.pegarConexao();

            PreparedStatement preparedStatement = connection.prepareStatement(
                ConsultasConstante.Cliente.BUSCAR_ULTIMO
            );

            ResultSet resultSet = preparedStatement.executeQuery();
            resultSet.next();
            return ConversorEntidade.resultSetParaCliente(resultSet);
        } catch (SQLException exception) {
            throw new RuntimeException(exception);
        }
    }

    @Override
    public List<ClienteEntidade> buscarPorNomeLike(String nome) {
        List<ClienteEntidade> clientes = new ArrayList<>();
        try {
            Connection connection = ConexaoBanco.pegarConexao();

            PreparedStatement preparedStatement = connection.prepareStatement(
                ConsultasConstante.Cliente.BUSCAR_POR_NOME_LIKE
            );
            preparedStatement.setString(1, "%".concat(nome).concat("%"));

            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                clientes.add(
                    ConversorEntidade.resultSetParaCliente(resultSet)
                );
            }
            return clientes;
        } catch (SQLException exception) {
            throw new RuntimeException(exception);
        }
    }
}
