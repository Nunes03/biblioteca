package main.java.br.com.biblioteca.repositorios;

import main.java.br.com.biblioteca.banco.ComandosDMLBanco;
import main.java.br.com.biblioteca.entidades.LivroEntidade;
import main.java.br.com.biblioteca.repositorios.interfaces.LivroRepositorioInterface;
import main.java.br.com.biblioteca.utilitarios.construtores.consultas.LivroConsulta;
import main.java.br.com.biblioteca.utilitarios.construtores.consultas.interfaces.LivroConsultaInterface;
import main.java.br.com.biblioteca.utilitarios.conversores.ConversorEntidade;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class LivroRepositorio implements LivroRepositorioInterface {

    @Override
    public Boolean criar(LivroEntidade entidade) {
        try {
            LivroConsultaInterface livroConsultaInterface = new LivroConsulta();
            ComandosDMLBanco.executarInsercao(livroConsultaInterface, entidade);
            return Boolean.TRUE;
        } catch (Exception exception) {
            exception.printStackTrace();//todo: Colocar um JAlert aqui para avisar.
            return Boolean.FALSE;
        }
    }

    @Override
    public Boolean atualizar(LivroEntidade entidade) {
        try {
            LivroConsultaInterface livroConsultaInterface = new LivroConsulta();
            ComandosDMLBanco.executarAtualizacao(livroConsultaInterface, entidade);
            return Boolean.TRUE;
        } catch (Exception exception) {
            exception.printStackTrace();//todo: Colocar um JAlert aqui para avisar.
            return Boolean.FALSE;
        }
    }

    @Override
    public List<LivroEntidade> buscarTodos() {
        List<LivroEntidade> livroEntidades = new ArrayList<>();
        try {
            LivroConsultaInterface livroConsultaInterface = new LivroConsulta();
            ResultSet resultSet = ComandosDMLBanco.executarConsultaBuscandoTudo(livroConsultaInterface);
            while (resultSet.next()) {
                livroEntidades.add(
                    ConversorEntidade.resultSetParaLivro(resultSet)
                );
            }
            return livroEntidades;
        } catch (Exception exception) {
            exception.printStackTrace();//todo: Colocar um JAlert aqui para avisar.
            return livroEntidades;
        }
    }

    @Override
    public Optional<LivroEntidade> buscarPorId(Integer id) {
        try {
            LivroConsultaInterface livroConsultaInterface = new LivroConsulta();
            ResultSet resultSet = ComandosDMLBanco.executarConsultaPorId(livroConsultaInterface, id);
            if (resultSet.next()) {
                return Optional.of(ConversorEntidade.resultSetParaLivro(resultSet));
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
            LivroConsultaInterface livroConsultaInterface = new LivroConsulta();
            ComandosDMLBanco.executarExclusao(livroConsultaInterface);
            return Boolean.TRUE;
        } catch (Exception exception) {
            exception.printStackTrace();//todo: Colocar um JAlert aqui para avisar.
            return Boolean.FALSE;
        }
    }

    @Override
    public Boolean deletarPorId(Integer id) {
        try {
            LivroConsultaInterface livroConsultaInterface = new LivroConsulta();
            ComandosDMLBanco.executarExclusaoPorId(livroConsultaInterface, id);
            return Boolean.TRUE;
        } catch (Exception exception) {
            exception.printStackTrace();//todo: Colocar um JAlert aqui para avisar.
            return Boolean.FALSE;
        }
    }
}