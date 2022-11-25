/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java.br.com.biblioteca.repositorios;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Optional;
import main.java.br.com.biblioteca.banco.ConexaoBanco;
import main.java.br.com.biblioteca.entidades.AcervoEntidade;
import main.java.br.com.biblioteca.repositorios.interfaces.AcervoRepositorioInterface;
import main.java.br.com.biblioteca.utilitarios.constantes.ConsultasConstante;
import main.java.br.com.biblioteca.utilitarios.conversores.ConversorEntidade;

/**
 *
 * @author lucas
 */
public class AcervoRepositorio implements AcervoRepositorioInterface{

    @Override
    public Optional<AcervoEntidade> buscarPorId(Integer id) {
        try {
            Connection connection = ConexaoBanco.pegarConexao();

            PreparedStatement preparedStatement = connection.prepareStatement(
                ConsultasConstante.Acervo.BUSCAR_POR_ID
            );
            preparedStatement.setInt(1, id);

            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                return Optional.of(
                    ConversorEntidade.resultSetParaAcervo(resultSet)
                );
            }
            return Optional.empty();
        } catch (SQLException exception) {
            throw new RuntimeException(exception);
        }
    }    
}
