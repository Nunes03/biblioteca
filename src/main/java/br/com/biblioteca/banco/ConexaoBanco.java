package main.java.br.com.biblioteca.banco;

import main.java.br.com.biblioteca.excecoes.banco.ConexaoBancoExcecao;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoBanco {

    private static final Connection CONEXAO = null;

    private ConexaoBanco() {
    }

    public static Connection pegarConexao() throws ConexaoBancoExcecao {
        try {
            if (CONEXAO == null || CONEXAO.isClosed()) {
                String nomeServidor = "localhost";
                String nomeBanco = "biblioteca";
                String url = "jdbc:mysql://"
                    .concat(nomeServidor)
                    .concat("/")
                    .concat(nomeBanco);
                String usuario = "root";
                String senha = "";

                return DriverManager.getConnection(url, usuario, senha);
            }
            return CONEXAO;
        } catch (SQLException exception) {
            JOptionPane.showMessageDialog(//
                null,//
                "Erro ao conectar com o banco. Verifique as configurações.",//
                "Erro",//
                JOptionPane.ERROR_MESSAGE//
            );//
            throw new ConexaoBancoExcecao(exception);//
        }
    }
}
