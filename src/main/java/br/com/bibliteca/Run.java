package br.com.bibliteca;

import java.util.Date;

import br.com.bibliteca.entities.ClienteEntity;
import br.com.bibliteca.repositories.ClienteRepository;
import br.com.bibliteca.repositories.interfaces.ClienteRepositoryInterface;

public class Run {

	public static void main(String[] args) {
		ClienteEntity clienteEntity = new ClienteEntity(
			1,
			"Lucas Nunes",
			new Date(),
			"1546",
			"7845",
			null
		);
		
		ClienteRepositoryInterface clienteRepositoryInterface = new ClienteRepository();
		clienteRepositoryInterface.criar(clienteEntity);
	}
}