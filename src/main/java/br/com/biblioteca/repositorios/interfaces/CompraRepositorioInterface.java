package main.java.br.com.biblioteca.repositorios.interfaces;

import java.util.List;
import main.java.br.com.biblioteca.entidades.ClienteEntidade;
import main.java.br.com.biblioteca.entidades.CompraEntidade;
import main.java.br.com.biblioteca.servicos.interfaces.RepositorioInterface;

public interface CompraRepositorioInterface extends RepositorioInterface<CompraEntidade> {
    
    List<CompraEntidade> buscarPorCliente(ClienteEntidade cliente);
    
}
