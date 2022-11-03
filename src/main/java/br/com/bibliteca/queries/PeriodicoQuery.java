package br.com.bibliteca.queries;

import br.com.bibliteca.entities.PeriodicoEntity;
import br.com.bibliteca.queries.interfaces.PeriodicoQueryInterface;

public class PeriodicoQuery implements PeriodicoQueryInterface {
	
	private final String CREATE_QUERY = "INSERT INTO biblioteca.acervo acervo "
			+ "(acervo.nome, acervo.valor, "
			+ "acervo.data_lancamento, acervo.paginas, acervo.regiao, acervo.editora) "
			+ "VALUES "
			+ "('%s', %f, '%s', %d, '%s', '%s');";
	
	private final String UPDATE_QUERY = "UPDATE biblioteca.acervo acervo "
			+ "SET "
			+ "acervo.nome = '%s', "
			+ "acervo.valor = %f, "
			+ "acervo.data_lancamento = '%s', "
			+ "acervo.paginas = %d, "
			+ "acervo.editora = '%s', "
			+ "acervo.regiao = '%s' "
			+ "WHERE acervo.id = %d;";
	
	private final String DELETE_TODOS_QUERY = "DELETE FROM biblioteca.acervo;";
	
	private final String DELETE_POR_ID_QUERY = "DELETE FROM biblioteca.acervo acervo "
			+ "WHERE acervo.id = %d;";
	
	private final String BUSCAR_TODOS_QUERY = "SELECT * FROM biblioteca.acervo;";
	
	private final String BUSCAR_POR_ID_QUERY = "SELECT * FROM biblioteca.acervo acervo "
			+ "WHERE acervo.id = %d;";
	
	@Override
	public String criar(PeriodicoEntity entity) {
		return String.format(
			CREATE_QUERY,
			entity.getNome(),
			entity.getValor(),
			entity.getDataLancamento(),
			entity.getPaginas(),
			entity.getRegiao(),
			entity.getEditora()
		);
	}

	@Override
	public String atualizar(PeriodicoEntity entity) {
		return String.format(
			UPDATE_QUERY,
			entity.getNome(),
			entity.getValor(),
			entity.getDataLancamento(),
			entity.getPaginas(),
			entity.getRegiao(),
			entity.getEditora(),
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