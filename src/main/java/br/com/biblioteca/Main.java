package main.java.br.com.biblioteca;


import main.java.br.com.biblioteca.entidades.ClienteEntidade;
import main.java.br.com.biblioteca.repositorios.ClienteRepositorio;
import main.java.br.com.biblioteca.repositorios.interfaces.ClienteRepositorioInterface;

import java.util.Date;

public class Main {

	public static void main(String[] args) {
		ClienteEntidade clienteEntity = new ClienteEntidade(
			1,
			"Lucas Nunes",
			new Date(),
			"1546",
			"7845",
			null
		);
		
		ClienteRepositorioInterface clienteRepositoryInterface = new ClienteRepositorio();
		//clienteRepositoryInterface.criar(clienteEntity);
		System.err.println(clienteRepositoryInterface.buscarTodos());
	}
}