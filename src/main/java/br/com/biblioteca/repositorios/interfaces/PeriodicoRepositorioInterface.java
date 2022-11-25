package main.java.br.com.biblioteca.repositorios.interfaces;

import java.util.List;
import main.java.br.com.biblioteca.entidades.PeriodicoEntidade;
import main.java.br.com.biblioteca.servicos.interfaces.RepositorioInterface;

public interface PeriodicoRepositorioInterface extends RepositorioInterface<PeriodicoEntidade> {
    
    List<PeriodicoEntidade> buscarAtivos();
    
    Boolean inativar(Integer id);
}