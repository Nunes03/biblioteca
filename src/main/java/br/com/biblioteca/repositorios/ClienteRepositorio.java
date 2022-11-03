package main.java.br.com.biblioteca.repositorios;

import main.java.br.com.biblioteca.banco.ComandosDMLBanco;
import main.java.br.com.biblioteca.entidades.ClienteEntidade;
import main.java.br.com.biblioteca.utilitarios.construtores.consultas.ClienteQuery;
import main.java.br.com.biblioteca.utilitarios.construtores.consultas.interfaces.ClienteQueryInterface;
import main.java.br.com.biblioteca.repositorios.interfaces.ClienteRepositorioInterface;

import java.util.List;

public class ClienteRepositorio implements ClienteRepositorioInterface {

    @Override
    public Boolean criar(ClienteEntidade entity) {
        try {
            ClienteQueryInterface clienteQueryInterface = new ClienteQuery();
            ComandosDMLBanco.executarInsercao(entity, clienteQueryInterface);
            return Boolean.TRUE;
        } catch (Exception exception) {
            exception.printStackTrace();//todo: Colocar um JAlert aqui para avisar.
            return Boolean.FALSE;
        }
    }

    @Override
    public Boolean atualizar(ClienteEntidade entity) {
        try {
            ClienteQueryInterface clienteQueryInterface = new ClienteQuery();
            ComandosDMLBanco.executarAtualizacao(entity, clienteQueryInterface);
            return Boolean.TRUE;
        } catch (Exception exception) {
            exception.printStackTrace();//todo: Colocar um JAlert aqui para avisar.
            return Boolean.FALSE;
        }
    }

    @Override
    public ClienteEntidade buscarPorId(Integer id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<ClienteEntidade> buscarTodos() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Boolean deletarPorId(Integer id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Boolean deletarTodos() {
        // TODO Auto-generated method stub
        return null;
    }
}