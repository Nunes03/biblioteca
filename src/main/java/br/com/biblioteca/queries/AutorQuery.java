package main.java.br.com.biblioteca.queries;

import main.java.br.com.biblioteca.entities.AutorEntity;
import main.java.br.com.biblioteca.queries.interfaces.AutorQueryInterface;

public class AutorQuery implements AutorQueryInterface {
	
	private final String CREATE_QUERY = "INSERT INTO biblioteca.autor"
			+ "(nome)"
			+ " VALUES "
			+ "('%s');";
	
	private final String UPDATE_QUERY = "UPDATE biblioteca.autor autor "
			+ "SET "
			+ "nome = '%s' "
			+ "WHERE autor.id = %d";
	
	private final String DELETE_TODOS_QUERY = "DELETE FROM biblioteca.autor;";
	
	private final String DELETE_POR_ID_QUERY = "DELETE FROM biblioteca.autor autor "
			+ "WHERE autor.id = %d;";
	
	private final String BUSCAR_TODOS_QERY = "SELECT * FROM biblioteca.autor;";
	
	private final String BUSCAR_POR_ID_QUERY = "SELECT * FROM biblioteca.cliente autor "
			+ "WHERE autor.id = %d;";
	
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
		return String.format(
			BUSCAR_POR_ID_QUERY,
			id
		);
	}

	@Override
	public String buscarTodos() {
		return BUSCAR_TODOS_QERY;
	}

	@Override
	public String deletarTodos() {
		return DELETE_TODOS_QUERY;
	}

	@Override
	public String deletarPorId(Integer id) {
		return String.format(
			DELETE_POR_ID_QUERY,
			id
		);
	}
}