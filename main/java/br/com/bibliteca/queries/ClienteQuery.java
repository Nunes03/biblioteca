package br.com.bibliteca.queries;

import br.com.bibliteca.entities.ClienteEntity;
import br.com.bibliteca.services.interfaces.QueryInterface;

public class ClienteQuery implements QueryInterface<ClienteEntity> {
	
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
	public String criar(ClienteEntity entity) {
		return String.format(
				CREATE_QUERY,
				entity.getNomeCompleto(),
				entity.getDataNascimento(),
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