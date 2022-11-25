package main.java.br.com.biblioteca.repositorios.interfaces;

import java.util.List;
import main.java.br.com.biblioteca.entidades.CompraEntidade;
import main.java.br.com.biblioteca.entidades.ItemCompraEntidade;
import main.java.br.com.biblioteca.servicos.interfaces.RepositorioInterface;

public interface ItemCompraRepositorioInterface extends RepositorioInterface<ItemCompraEntidade> {
    
    List<ItemCompraEntidade> buscarPorCompra(CompraEntidade compraEntidade);
}
