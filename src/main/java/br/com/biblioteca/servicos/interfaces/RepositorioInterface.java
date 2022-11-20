package main.java.br.com.biblioteca.servicos.interfaces;

import java.util.List;
import java.util.Optional;

public interface RepositorioInterface<E> {

    Boolean criar(E entidade);

    Boolean atualizar(E entidade);

    List<E> buscar();

    Optional<E> buscarPorId(Integer id);

    Boolean deletar();

    Boolean deletarPorId(Integer id);
}
