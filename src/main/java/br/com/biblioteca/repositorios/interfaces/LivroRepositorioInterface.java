package main.java.br.com.biblioteca.repositorios.interfaces;

import java.util.List;
import main.java.br.com.biblioteca.entidades.LivroEntidade;
import main.java.br.com.biblioteca.servicos.interfaces.RepositorioInterface;

public interface LivroRepositorioInterface extends RepositorioInterface<LivroEntidade> {
    
    List<LivroEntidade> buscarAtivos();
    
    List<LivroEntidade> buscarPorNomeLike(String nome);
    
    Boolean inativar(Integer id);
}