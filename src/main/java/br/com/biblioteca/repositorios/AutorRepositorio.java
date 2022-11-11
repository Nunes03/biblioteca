package main.java.br.com.biblioteca.repositorios;

import main.java.br.com.biblioteca.banco.ComandosDMLBanco;
import main.java.br.com.biblioteca.entidades.AutorEntidade;
import main.java.br.com.biblioteca.repositorios.interfaces.AutorRepositorioInterface;
import main.java.br.com.biblioteca.utilitarios.construtores.consultas.AutorConsulta;
import main.java.br.com.biblioteca.utilitarios.construtores.consultas.interfaces.AutorConsultaInterface;
import main.java.br.com.biblioteca.utilitarios.conversores.ConversorEntidade;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class AutorRepositorio implements AutorRepositorioInterface {
    
    AutorConsultaInterface autorConsultaInterface = new AutorConsulta();
    
    @Override
    public Boolean criar(AutorEntidade entidade) {
        try {
            ComandosDMLBanco.executarInsercao(autorConsultaInterface, entidade);
            return Boolean.TRUE;
        } catch (Exception exception) {
            exception.printStackTrace();//todo: Colocar um JAlert aqui para avisar.
            return Boolean.FALSE;
        }
    }

    @Override
    public Boolean atualizar(AutorEntidade entidade) {
        try {
            ComandosDMLBanco.executarAtualizacao(autorConsultaInterface, entidade);
            return Boolean.TRUE;
        } catch (Exception exception) {
            exception.printStackTrace();//todo: Colocar um JAlert aqui para avisar.
            return Boolean.FALSE;
        }
    }

    @Override
    public List<AutorEntidade> buscarTodos() {
        List<AutorEntidade> autorEntidades = new ArrayList<>();
        try {
            ResultSet resultSet = ComandosDMLBanco.executarConsultaBuscandoTudo(autorConsultaInterface);
            while (resultSet.next()) {
                autorEntidades.add(
                    ConversorEntidade.resultSetParaAutor(resultSet)
                );
            }
            return autorEntidades;
        } catch (Exception exception) {
            exception.printStackTrace();//todo: Colocar um JAlert aqui para avisar.
            return autorEntidades;
        }
    }

    @Override
    public Optional<AutorEntidade> buscarPorId(Integer id) {
        try {
            ResultSet resultSet = ComandosDMLBanco.executarConsultaPorId(autorConsultaInterface, id);
            if (resultSet.next()) {
                return Optional.of(ConversorEntidade.resultSetParaAutor(resultSet));
            }
            return Optional.empty();
        } catch (Exception exception) {
            exception.printStackTrace();//todo: Colocar um JAlert aqui para avisar.
            return Optional.empty();
        }
    }

    @Override
    public Boolean deletarTodos() {
        try {
            ComandosDMLBanco.executarExclusao(autorConsultaInterface);
            return Boolean.TRUE;
        } catch (Exception exception) {
            exception.printStackTrace();//todo: Colocar um JAlert aqui para avisar.
            return Boolean.FALSE;
        }
    }

    @Override
    public Boolean deletarPorId(Integer id) {
        try {
            ComandosDMLBanco.executarExclusaoPorId(autorConsultaInterface, id);
            return Boolean.TRUE;
        } catch (Exception exception) {
            exception.printStackTrace();//todo: Colocar um JAlert aqui para avisar.
            return Boolean.FALSE;
        }
    }

    @Override
    public Boolean acervoVinculado(AutorEntidade autorEntidade) {
        try {
            ResultSet resultSet = ComandosDMLBanco.executarConsulta(
                autorConsultaInterface.acervoVinculado(autorEntidade)
            );
            
            return resultSet.next();
        } catch (Exception exception) {
            exception.printStackTrace();//todo: Colocar um JAlert aqui para avisar.
            return Boolean.FALSE;
        }
    }
}