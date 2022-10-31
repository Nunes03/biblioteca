package br.com.bibliteca.repositories.interfaces;

import java.util.List;

public interface RepositoryInterface<E> {
	
	E criar(E entity);

	E atualizar(E entity);
	
	E buscarPorId(Integer id);
	
	List<E> buscarTodos();
	
	Boolean deletarPorId(Integer id);
}