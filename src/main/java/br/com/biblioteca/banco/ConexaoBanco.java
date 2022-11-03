package main.java.br.com.biblioteca.banco;

import main.java.br.com.biblioteca.excecoes.banco.ConexaoBancoExcecao;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConexaoBanco {

    private static Connection connection = null;

    private ConexaoBanco() {
    }

    private static Connection pegarConexao() throws SQLException {
        String serverName = "localhost";
        String databaseName = "biblioteca";
        String url = "jdbc:mysql://" + serverName + "/" + databaseName;
        String username = "root";
        String password = "";

        return DriverManager.getConnection(url, username, password);
    }

    public static Statement pegarDeclaracao() {
        try {
            if (connection == null || connection.isClosed()) {
                return pegarConexao().createStatement();
            }
            return connection.createStatement();
        } catch (Exception exception) {
            JOptionPane.showMessageDialog(null, "Erro ao conectar com o banco. Verifique as configurações.", "Erro", 1);
            throw new ConexaoBancoExcecao(exception);
        }
    }
}