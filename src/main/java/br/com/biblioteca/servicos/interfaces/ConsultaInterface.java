package main.java.br.com.biblioteca.servicos.interfaces;

public interface ConsultaInterface<E> {
	
	String criar(E entity);

	String atualizar(E entity);
	
	String buscarPorId(Integer id);
	
	String buscar();
	
	String deletar();
	
	String deletarPorId(Integer id);
}
