package br.com.bibliteca.repositories;

import java.sql.Connection;
import java.sql.Statement;
import java.util.List;

import javax.swing.JOptionPane;

import br.com.bibliteca.database.ConnectionDatabase;
import br.com.bibliteca.entities.ClienteEntity;
import br.com.bibliteca.queries.ClienteQuery;
import br.com.bibliteca.queries.interfaces.ClienteQueryInterface;
import br.com.bibliteca.repositories.interfaces.ClienteRepositoryInterface;

public class ClienteRepository implements ClienteRepositoryInterface{

	@Override
	public ClienteEntity criar(ClienteEntity entity) {
		ClienteQueryInterface clienteQueryInterface = new ClienteQuery();
		Connection connection = ConnectionDatabase.pegarConexao();
		
		try {
			Statement query = connection.createStatement();
			System.err.println(clienteQueryInterface.criar(entity));
			query.executeUpdate(clienteQueryInterface.criar(entity));
			return null;
		} catch (Exception exception) {
			JOptionPane.showMessageDialog(null, "Erro ao criar cliente.", "Erro", 0);
			throw new RuntimeException(exception);
		}
	}

	@Override
	public ClienteEntity atualizar(ClienteEntity entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ClienteEntity buscarPorId(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ClienteEntity> buscarTodos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean deletarPorId(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean deletarTodos() {
		// TODO Auto-generated method stub
		return null;
	}
}