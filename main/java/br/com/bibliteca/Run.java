package br.com.bibliteca;

import java.time.LocalDate;

import br.com.bibliteca.entities.ClienteEntity;
import br.com.bibliteca.queries.ClienteQuery;

public class Run {

	public static void main(String[] args) {
		ClienteEntity clienteEntity = new ClienteEntity(
			1,
			"Lucas Nunes",
			LocalDate.now(),
			"1546",
			"7845",
			null
		);
		
		ClienteQuery clienteQuery = new ClienteQuery();
		
		System.err.println(clienteQuery.criar(clienteEntity));
	}
}