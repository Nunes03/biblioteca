package br.com.bibliteca.converters;

import java.sql.ResultSet;

import javax.swing.JOptionPane;

import br.com.bibliteca.entities.ClienteEntity;

public class EntityConverter {

	private EntityConverter() {
	}

	public static ClienteEntity resultSetToCliente(ResultSet resultSet) {
		try {
			return new ClienteEntity(
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