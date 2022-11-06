package main.java.br.com.biblioteca.utilitarios.construtores.consultas;

import main.java.br.com.biblioteca.entidades.PeriodicoEntidade;
import main.java.br.com.biblioteca.utilitarios.constantes.ConsultasConstante;
import main.java.br.com.biblioteca.utilitarios.construtores.consultas.interfaces.PeriodicoQueryInterface;

public class PeriodicoQuery implements PeriodicoQueryInterface {
	
	@Override
	public String criar(PeriodicoEntidade entity) {
		return String.format(
			ConsultasConstante.Periodico.CRIAR,
			entity.getNome(),
			entity.getValor(),
			entity.getDataLancamento(),
			entity.getPaginas(),
			entity.getRegiao(),
			entity.getEditora()
		);
	}

	@Override
	public String atualizar(PeriodicoEntidade entity) {
		return String.format(
			ConsultasConstante.Periodico.ATUALIZAR,
			entity.getNome(),
			entity.getValor(),
			entity.getDataLancamento(),
			entity.getPaginas(),
			entity.getRegiao(),
			entity.getEditora(),
			entity.getId()
		);
	}

	@Override
	public String buscarPorId(Integer id) {
		return String.format(
			ConsultasConstante.Periodico.BUSCAR_POR_ID,
			id
		);
	}

	@Override
	public String buscar() {
		return ConsultasConstante.Periodico.BUSCAR;
	}

	@Override
	public String deletar() {
		return ConsultasConstante.Periodico.DELETAR;
	}

	@Override
	public String deletarPorId(Integer id) {
		return String.format(
			ConsultasConstante.Periodico.DELETAR_POR_ID,
			id
		);
	}
}