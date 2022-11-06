package main.java.br.com.biblioteca.utilitarios.construtores.consultas;

import main.java.br.com.biblioteca.entidades.LivroEntidade;
import main.java.br.com.biblioteca.utilitarios.constantes.ConsultasConstante;
import main.java.br.com.biblioteca.utilitarios.construtores.consultas.interfaces.LivroConsultaInterface;

public class LivroConsulta implements LivroConsultaInterface {
	
	@Override
	public String criar(LivroEntidade entity) {
		return String.format(
			ConsultasConstante.Livro.CRIAR,
			entity.getNome(),
			entity.getDescricao(),
			entity.getValor(),
			entity.getDataLancamento(),
			entity.getPaginas(),
			entity.getEditora(),
			entity.getCapaDura(),
			entity.getGenero()
		);
	}

	@Override
	public String atualizar(LivroEntidade entity) {
		return String.format(
			ConsultasConstante.Livro.ATUALIZAR,
			entity.getNome(),
			entity.getDescricao(),
			entity.getValor(),
			entity.getDataLancamento(),
			entity.getPaginas(),
			entity.getEditora(),
			entity.getCapaDura(),
			entity.getGenero(),
			entity.getId()
		);
	}

	@Override
	public String buscarPorId(Integer id) {
		return String.format(
			ConsultasConstante.Livro.DELETAR_POR_ID,
			id
		);
	}

	@Override
	public String buscar() {
		return ConsultasConstante.Livro.BUSCAR;
	}

	@Override
	public String deletar() {
		return ConsultasConstante.Livro.DELETAR;
	}

	@Override
	public String deletarPorId(Integer id) {
		return String.format(
			ConsultasConstante.Livro.DELETAR_POR_ID,
			id
		);
	}
}