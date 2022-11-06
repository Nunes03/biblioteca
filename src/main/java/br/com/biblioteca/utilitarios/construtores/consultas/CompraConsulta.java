package main.java.br.com.biblioteca.utilitarios.construtores.consultas;

import main.java.br.com.biblioteca.entidades.CompraEntidade;
import main.java.br.com.biblioteca.utilitarios.constantes.ConsultasConstante;
import main.java.br.com.biblioteca.utilitarios.construtores.consultas.interfaces.CompraConsultaInterface;

public class CompraConsulta implements CompraConsultaInterface {
	
	@Override
	public String criar(CompraEntidade entity) {
		return String.format(
			ConsultasConstante.Compra.CRIAR,
			entity.getData(),
			entity.getTotal(),
			entity.getCliente().getId()
		);
	}

	@Override
	public String atualizar(CompraEntidade entity) {
		return String.format(
			ConsultasConstante.Compra.ATUALIZAR,
			entity.getData(),
			entity.getTotal(),
			entity.getCliente().getId(),
			entity.getId()
		);
	}

	@Override
	public String buscarPorId(Integer id) {
		return String.format(
			ConsultasConstante.Compra.BUSCAR_POR_ID,
			id
		);
	}

	@Override
	public String buscar() {
		return ConsultasConstante.Compra.BUSCAR;
	}

	@Override
	public String deletar() {
		return ConsultasConstante.Compra.DELETAR;
	}

	@Override
	public String deletarPorId(Integer id) {
		return String.format(
			ConsultasConstante.Compra.DELETE_POR_ID,
			id
		);
	}
}