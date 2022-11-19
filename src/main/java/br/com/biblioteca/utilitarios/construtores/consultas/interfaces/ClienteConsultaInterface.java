package main.java.br.com.biblioteca.utilitarios.construtores.consultas.interfaces;

import main.java.br.com.biblioteca.entidades.ClienteEntidade;
import main.java.br.com.biblioteca.servicos.interfaces.ConsultaInterface;

public interface ClienteConsultaInterface extends ConsultaInterface<ClienteEntidade> {

    String buscarPorCpf(String cpf);

    String buscarTodosAtivos();
    
    String inativar(Integer id);
}
