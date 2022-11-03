package main.java.br.com.biblioteca.database;

import java.sql.Connection;
import java.sql.DriverManager;

import javax.swing.JOptionPane;

public class ConnectionDatabase {

	private static Connection connection = null;

	private ConnectionDatabase() {
	}

	public static Connection pegarConexao() {
		try {
			if (connection == null || connection.isClosed()) {
				String serverName = "localhost";
				String mydatabase = "biblioteca";
				String url = "jdbc:mysql://" + serverName + "/" + mydatabase;
				String username = "root";
				String password = "";

				connection = DriverManager.getConnection(url, username, password);
				return connection;
			}
			return connection;
		} catch (Exception exception) {
			JOptionPane.showMessageDialog(null, "Erro ao conectar com o banco. Verique as configurações.", "Erro", 1);
			throw new RuntimeException(exception);
		}
	}
}