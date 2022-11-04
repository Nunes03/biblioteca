package main.java.br.com.biblioteca.repositorios;

import java.util.List;
import java.util.Optional;

import main.java.br.com.biblioteca.entidades.LivroEntidade;
import main.java.br.com.biblioteca.repositorios.interfaces.LivroRepositorioInterface;

public class LivroRepositorio implements LivroRepositorioInterface {

	@Override
	public Boolean criar(LivroEntidade entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean atualizar(LivroEntidade entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<LivroEntidade> buscarPorId(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<LivroEntidade> buscarTodos() {
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