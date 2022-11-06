package main.java.br.com.biblioteca.banco;

import main.java.br.com.biblioteca.excecoes.banco.ConexaoBancoExcecao;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;

public class ConexaoBanco {

    private static Connection conexao = null;

    private ConexaoBanco() {
    }

    public static Connection pegarConexao() throws ConexaoBancoExcecao {
        try {
            if (conexao == null || conexao.isClosed()) {
                String nomeServidor = "localhost";
                String nomeBanco = "biblioteca";
                String url = "jdbc:mysql://" + nomeServidor + "/" + nomeBanco;
                String usuario = "root";
                String senha = "";

                return DriverManager.getConnection(url, usuario, senha);
            }
            return conexao;
        } catch (Exception exception) {
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