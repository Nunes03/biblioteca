package main.java.br.com.biblioteca.banco;

import main.java.br.com.biblioteca.excecoes.banco.ConexaoBancoExcecao;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;

public class ConexaoBanco {

    private static Connection connection = null;

    private ConexaoBanco() {
    }

    public static Connection pegarConexao() throws ConexaoBancoExcecao {
        try {
            if (connection == null || connection.isClosed()) {
                String serverName = "localhost";
                String databaseName = "biblioteca";
                String url = "jdbc:mysql://" + serverName + "/" + databaseName;
                String username = "root";
                String password = "";

                return DriverManager.getConnection(url, username, password);
            }
            return connection;
        } catch (Exception exception) {
            JOptionPane.showMessageDialog(null, "Erro ao conectar com o banco. Verifique as configurações.", "Erro", 1);
            throw new ConexaoBancoExcecao(exception);
        }
    }
}