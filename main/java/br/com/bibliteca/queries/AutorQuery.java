package br.com.bibliteca.queries;

import br.com.bibliteca.entities.AutorEntity;
import br.com.bibliteca.queries.interfaces.AutorQueryInterface;

public class AutorQuery implements AutorQueryInterface {
	
	private final String CREATE_QUERY = "INSERT INTO biblioteca.autor"
			+ "(nome)"
			+ " VALUES "
			+ "('%s');";
	
	private final String UPDATE_QUERY = "UPDATE biblioteca.autor autor "
			+ "SET "
			+ "nome = '%s' "
			+ "WHERE autor.id = %d";

	@Override
	public String criar(AutorEntity entity) {
		return String.format(
				CREATE_QUERY,
				entity.getNome()
		);
	}

	@Override
	public String atualizar(AutorEntity entity) {
		return String.format(
				UPDATE_QUERY,
				entity.getNome(),
				entity.getId()
		);
	}

	@Override
	public String buscarPorId(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String buscarTodos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deletarTodos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deletarPorId(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}
}