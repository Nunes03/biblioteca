package br.com.bibliteca.services.interfaces;

public interface QueryInterface<E> {
	
	String criar(E entity);

	String atualizar(E entity);
	
	String buscarPorId(Integer id);
	
	String buscarTodos();
	
	String deletarTodos();
	
	String deletarPorId(Integer id);
}