package main.java.br.com.biblioteca.repositorios.interfaces;

import java.util.Optional;
import main.java.br.com.biblioteca.entidades.ClienteEntidade;
import main.java.br.com.biblioteca.servicos.interfaces.RepositorioInterface;

public interface ClienteRepositorioInterface extends RepositorioInterface<ClienteEntidade> {
    
    Optional<ClienteEntidade> buscarPorCpf(String cpf);
}