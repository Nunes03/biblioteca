package main.java.br.com.biblioteca.utilitarios.construtores.consultas;

import main.java.br.com.biblioteca.entidades.ClienteEntidade;
import main.java.br.com.biblioteca.utilitarios.constantes.ConsultasConstante;
import main.java.br.com.biblioteca.utilitarios.construtores.consultas.interfaces.ClienteConsultaInterface;

public class ClienteConsulta implements ClienteConsultaInterface {

    @Override
    public String criar(ClienteEntidade entity) {
        String dataNascimento = entity.getDataNascimento().toInstant().toString();
        dataNascimento = dataNascimento.replace('T', ' ').replace("Z", "");

        return String.format(
            ConsultasConstante.Cliente.CRIAR,
            entity.getNomeCompleto(),
            dataNascimento,
            entity.getCpf(),
            entity.getTelefone(),
            new String(entity.getFoto())
        );
    }

    @Override
    public String atualizar(ClienteEntidade entity) {
        return String.format(
            ConsultasConstante.Cliente.ATUALIZAR,
            entity.getNomeCompleto(),
            entity.getDataNascimento(),
            entity.getCpf(),
            entity.getTelefone(),
            new String(entity.getFoto()),
            entity.getId()
        );
    }

    @Override
    public String buscarPorId(Integer id) {
        return String.format(
            ConsultasConstante.Cliente.BUSCAR_POR_ID,
            id
        );
    }

    @Override
    public String buscar() {
        return ConsultasConstante.Cliente.BUSCAR;
    }

    @Override
    public String deletar() {
        return ConsultasConstante.Cliente.DELETAR;
    }

    @Override
    public String deletarPorId(Integer id) {
        return String.format(
            ConsultasConstante.Cliente.DELETAR_POR_ID,
            id
        );
    }

    @Override
    public String buscarPorCpf(String cpf) {
        return String.format(
            ConsultasConstante.Cliente.BUSCAR_POR_CPF,
            cpf
        );
    }
}