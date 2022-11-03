package main.java.br.com.biblioteca.services.interfaces;

import java.util.List;

public interface RepositoryInterface<E> {
	
	E criar(E entity);

	E atualizar(E entity);
	
	E buscarPorId(Integer id);
	
	List<E> buscarTodos();
	
	Boolean deletarTodos();
	
	Boolean deletarPorId(Integer id);
}