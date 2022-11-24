package main.java.br.com.biblioteca.repositorios.interfaces;

import java.util.List;
import main.java.br.com.biblioteca.entidades.RevistaEntidade;
import main.java.br.com.biblioteca.servicos.interfaces.RepositorioInterface;

public interface RevistaRepositorioInterface extends RepositorioInterface<RevistaEntidade> {

    List<RevistaEntidade> buscarAtivos();
    
    Boolean inativar(Integer id);
}
