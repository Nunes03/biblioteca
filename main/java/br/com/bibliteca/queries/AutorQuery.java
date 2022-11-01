package br.com.bibliteca.queries;

import br.com.bibliteca.entities.AutorEntity;
import br.com.bibliteca.queries.interfaces.AutorQueryInterface;

public class AutorQuery implements AutorQueryInterface {
	
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
			+ "WHERE cliente.id = %d";

	@Override
	public String criar(AutorEntity entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String atualizar(AutorEntity entity) {
		// TODO Auto-generated method stub
		return null;
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