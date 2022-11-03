package main.java.br.com.biblioteca.utilitarios.construtores.consultas;

import main.java.br.com.biblioteca.entidades.LivroEntidade;
import main.java.br.com.biblioteca.utilitarios.construtores.consultas.interfaces.LivroQueryInterface;

public class LivroQuery implements LivroQueryInterface {
	
	private final String CREATE_QUERY = "INSERT INTO biblioteca.acervo acervo "
			+ "(acervo.nome, acervo.descricao, acervo.valor, "
			+ "acervo.data_lancamento, acervo.paginas, acervo.editora, "
			+ "acervo.capa_dura, acervo.genero)"
			+ " VALUES "
			+ "('%s', '%s', %f, '%s', %d, '%s', %b, '%s');";
	
	private final String UPDATE_QUERY = "UPDATE biblioteca.acervo acervo "
			+ "SET "
			+ "acervo.nome = '%s', "
			+ "acervo.descricao = '%s', "
			+ "acervo.valor = %f, "
			+ "acervo.data_lancamento = '%s', "
			+ "acervo.paginas = %d, "
			+ "acervo.editora = '%s', "
			+ "acervo.capa_dura = %b, "
			+ "acervo.genero = '%s' "
			+ "WHERE acervo.id = %d;";
	
	private final String DELETE_TODOS_QUERY = "DELETE FROM biblioteca.acervo;";
	
	private final String DELETE_POR_ID_QUERY = "DELETE FROM biblioteca.acervo acervo "
			+ "WHERE acervo.id = %d;";
	
	private final String BUSCAR_TODOS_QUERY = "SELECT * FROM biblioteca.acervo;";
	
	private final String BUSCAR_POR_ID_QUERY = "SELECT * FROM biblioteca.acervo acervo "
			+ "WHERE acervo.id = %d;";
	
	@Override
	public String criar(LivroEntidade entity) {
		return String.format(
			CREATE_QUERY,
			entity.getNome(),
			entity.getDescricao(),
			entity.getValor(),
			entity.getDataLancamento(),
			entity.getPaginas(),
			entity.getEditora(),
			entity.getCapaDura(),
			entity.getGenero()
		);
	}

	@Override
	public String atualizar(LivroEntidade entity) {
		return String.format(
			UPDATE_QUERY,
			entity.getNome(),
			entity.getDescricao(),
			entity.getValor(),
			entity.getDataLancamento(),
			entity.getPaginas(),
			entity.getEditora(),
			entity.getCapaDura(),
			entity.getGenero(),
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