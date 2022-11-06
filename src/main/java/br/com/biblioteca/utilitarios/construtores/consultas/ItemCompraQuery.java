package main.java.br.com.biblioteca.utilitarios.construtores.consultas;

import main.java.br.com.biblioteca.entidades.ItemCompraEntidade;
import main.java.br.com.biblioteca.utilitarios.constantes.ConsultasConstante;
import main.java.br.com.biblioteca.utilitarios.construtores.consultas.interfaces.ItemCompraQueryInterface;

public class ItemCompraQuery implements ItemCompraQueryInterface {

	@Override
	public String criar(ItemCompraEntidade entity) {
		return String.format(
			ConsultasConstante.ItemCompra.CRIAR,
			entity.getCompra().getId(),
			entity.getAcervo().getId()
		);
	}

	@Override
	public String atualizar(ItemCompraEntidade entity) {
		return String.format(
			ConsultasConstante.ItemCompra.ATUALIZAR,
			entity.getCompra().getId(),
			entity.getAcervo().getId(),
			entity.getId()
		);
	}

	@Override
	public String buscarPorId(Integer id) {
		return String.format(
			ConsultasConstante.ItemCompra.BUSCAR_POR_ID,
			id
		);
	}

	@Override
	public String buscar() {
		return ConsultasConstante.ItemCompra.BUSCAR;
	}

	@Override
	public String deletar() {
		return ConsultasConstante.ItemCompra.DELETAR;
	}

	@Override
	public String deletarPorId(Integer id) {
		return String.format(
			ConsultasConstante.ItemCompra.BUSCAR_POR_ID,
			id
		);
	}
}