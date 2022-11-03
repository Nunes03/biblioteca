package main.java.br.com.biblioteca.queries;

import main.java.br.com.biblioteca.entities.CompraEntity;
import main.java.br.com.biblioteca.queries.interfaces.CompraQueryInterface;

public class CompraQuery implements CompraQueryInterface{
	
	private final String CREATE_QUERY = "INSERT INTO biblioteca.compra"
			+ "(compra.data, compra.total, compra.cliente_id)"
			+ " VALUES "
			+ "('%s', '%s', %d);";
	
	private final String UPDATE_QUERY = "UPDATE biblioteca.compra compra "
			+ "SET "
			+ "compra.data = '%s',"
			+ "compra.total = '%s',"
			+ "compra.cliente_id = %d "
			+ "WHERE compra.id = %d;";
	
	private final String DELETE_TODOS_QUERY = "DELETE FROM biblioteca.compra;";
	
	private final String DELETE_POR_ID_QUERY = "DELETE FROM biblioteca.compra compra "
			+ "WHERE compra.id = %d;";
	
	private final String BUSCAR_TODOS_QERY = "SELECT * FROM biblioteca.compra;";
	
	private final String BUSCAR_POR_ID_QUERY = "SELECT * FROM biblioteca.compra compra "
			+ "WHERE compra.id = %d;";
	
	@Override
	public String criar(CompraEntity entity) {
		return String.format(
			CREATE_QUERY,
			entity.getData(),
			entity.getTotal(),
			entity.getCliente().getId()
		);
	}

	@Override
	public String atualizar(CompraEntity entity) {
		return String.format(
			UPDATE_QUERY,
			entity.getData(),
			entity.getTotal(),
			entity.getCliente().getId(),
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