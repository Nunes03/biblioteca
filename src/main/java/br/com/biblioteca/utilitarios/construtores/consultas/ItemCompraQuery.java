package main.java.br.com.biblioteca.utilitarios.construtores.consultas;

import main.java.br.com.biblioteca.entidades.ItemCompraEntidade;
import main.java.br.com.biblioteca.utilitarios.construtores.consultas.interfaces.ItemCompraQueryInterface;

public class ItemCompraQuery implements ItemCompraQueryInterface {
	
	private final String CREATE_QUERY = "INSERT INTO biblioteca.item_compra item_compra"
			+ "(item_compra.compra_id, item_compra.acervo_id)"
			+ " VALUES "
			+ "('%d', %d);";
	
	private final String UPDATE_QUERY = "UPDATE biblioteca.item_compra item_compra "
			+ "SET "
			+ "item_compra.compra_id = %d, "
			+ "item_compra.acervo_id = %d "
			+ "WHERE item_compra.id = %d;";
	
	private final String DELETE_TODOS_QUERY = "DELETE FROM biblioteca.item_compra;";
	
	private final String DELETE_POR_ID_QUERY = "DELETE FROM biblioteca.item_compra item_compra "
			+ "WHERE item_compra.id = %d;";
	
	private final String BUSCAR_TODOS_QUERY = "SELECT * FROM biblioteca.item_compra;";
	
	private final String BUSCAR_POR_ID_QUERY = "SELECT * FROM biblioteca.item_compra item_compra "
			+ "WHERE item_compra.id = %d;";
	
	@Override
	public String criar(ItemCompraEntidade entity) {
		return String.format(
			CREATE_QUERY,
			entity.getCompra().getId(),
			entity.getAcervo().getId()
		);
	}

	@Override
	public String atualizar(ItemCompraEntidade entity) {
		return String.format(
			UPDATE_QUERY,
			entity.getCompra().getId(),
			entity.getAcervo().getId(),
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
		return BUSCAR_TODOS_QUERY;
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