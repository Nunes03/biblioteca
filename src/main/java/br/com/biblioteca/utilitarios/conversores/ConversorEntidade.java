package main.java.br.com.biblioteca.utilitarios.conversores;

import java.sql.ResultSet;

import javax.swing.JOptionPane;

import main.java.br.com.biblioteca.entidades.ClienteEntidade;

public class ConversorEntidade {

	private ConversorEntidade() {
	}

	public static ClienteEntidade resultSetToCliente(ResultSet resultSet) {
		try {
			return new ClienteEntidade(
				resultSet.getInt("id"),
				resultSet.getString("nome_completo"),
				resultSet.getDate("data_nascimento"),
				resultSet.getString("cpf"),
				resultSet.getString("telefone"),
				null
			);
		} catch (Exception exception) {
			JOptionPane.showMessageDialog(null, "Erro ao converter Cliente.", "Erro", 1);
			throw new RuntimeException(exception);
		}
	}
}