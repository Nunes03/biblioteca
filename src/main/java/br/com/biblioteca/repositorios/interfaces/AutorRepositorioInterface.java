package main.java.br.com.biblioteca.repositorios.interfaces;

import main.java.br.com.biblioteca.entidades.AutorEntidade;
import main.java.br.com.biblioteca.servicos.interfaces.RepositorioInterface;

public interface AutorRepositorioInterface extends RepositorioInterface<AutorEntidade> {
    
    Boolean acervoVinculado(AutorEntidade autorEntidade);
}