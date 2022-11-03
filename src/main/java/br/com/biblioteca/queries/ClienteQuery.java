package main.java.br.com.biblioteca.queries;

import main.java.br.com.biblioteca.entities.ClienteEntity;
import main.java.br.com.biblioteca.queries.interfaces.ClienteQueryInterface;

public class ClienteQuery implements ClienteQueryInterface {
	
	private final String CREATE_QUERY = "INSERT INTO biblioteca.cliente"
			+ "(nome_completo, data_nascimento, cpf, telefone)"
			+ " VALUES "
			+ "('%s', '%s', '%s', '%s');";
	
	private final String UPDATE_QUERY = "UPDATE biblioteca.cliente cliente "
			+ "SET "
			+ "nome_completo = '%s',"
			+ "data_nascimento = '%s',"
			+ "cpf = '%s',"
			+ "telefone = '%s' "
			+ "WHERE cliente.id = %d;";
	
	private final String DELETE_TODOS_QUERY = "DELETE FROM biblioteca.cliente;";
	
	private final String DELETE_POR_ID_QUERY = "DELETE FROM biblioteca.cliente cliente "
			+ "WHERE cliente.id = %d;";
	
	private final String BUSCAR_TODOS_QERY = "SELECT * FROM biblioteca.cliente;";
	
	private final String BUSCAR_POR_ID_QUERY = "SELECT * FROM biblioteca.cliente cliente "
			+ "WHERE cliente.id = %d;";
	
	@Override
	public String criar(ClienteEntity entity) {
		String dataNascimento = entity.getDataNascimento().toInstant().toString();
		dataNascimento = dataNascimento.replace('T', ' ').replace("Z", "");
		
		return String.format(
			CREATE_QUERY,
			entity.getNomeCompleto(),
			dataNascimento,
			entity.getCpf(),
			entity.getTelefone()
		);
	}

	@Override
	public String atualizar(ClienteEntity entity) {
		return String.format(
			UPDATE_QUERY,
			entity.getNomeCompleto(),
			entity.getDataNascimento(),
			entity.getCpf(),
			entity.getTelefone(),
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