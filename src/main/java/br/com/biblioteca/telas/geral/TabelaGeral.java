/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java.br.com.biblioteca.telas.geral;

import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import main.java.br.com.biblioteca.entidades.AutorEntidade;
import main.java.br.com.biblioteca.entidades.ClienteEntidade;
import main.java.br.com.biblioteca.repositorios.AutorRepositorio;
import main.java.br.com.biblioteca.repositorios.ClienteRepositorio;
import main.java.br.com.biblioteca.repositorios.interfaces.AutorRepositorioInterface;
import main.java.br.com.biblioteca.repositorios.interfaces.ClienteRepositorioInterface;
import main.java.br.com.biblioteca.utilitarios.conversores.ConversorTipos;

/**
 *
 * @author lucas
 */
public class TabelaGeral {

    public static Integer pegarLinhaSelecionada(JTable jTable) {
        return jTable.getSelectedRow();
    }

    public static void limparTabela(DefaultTableModel defaultTableModel) {
        defaultTableModel.setRowCount(0);
    }

    public static Boolean linhaValida(JTable jTable) {
        return !pegarLinhaSelecionada(jTable).equals(-1);
    }

    public static void atualizarTabelaAutor(JTable jTable) {
        AutorRepositorioInterface autorRepositorioInterface = new AutorRepositorio();
        DefaultTableModel defaultTableModel = (DefaultTableModel) jTable.getModel();
        limparTabela(defaultTableModel);
        
        List<AutorEntidade> autorEntidades = autorRepositorioInterface.buscarTodos();

        autorEntidades.forEach(
            autor -> {
                Object[] dados = {autor.getId(), autor.getNome()};

                defaultTableModel.addRow(dados);
            }
        );
    }

    public static void atualizarTabelaCliente(JTable jTable) {
        ClienteRepositorioInterface clienteRepositorioInterface = new ClienteRepositorio();
        DefaultTableModel defaultTableModel = (DefaultTableModel) jTable.getModel();
        limparTabela(defaultTableModel);

        List<ClienteEntidade> clienteEntidades = clienteRepositorioInterface.buscarTodos();

        clienteEntidades.forEach(
            cliente -> {
                String dataNascimento = ConversorTipos.dateParaString(
                    cliente.getDataNascimento()
                );
                
                Object[] dados = {cliente.getId(), cliente.getNomeCompleto(), dataNascimento, cliente.getCpf(), cliente.getTelefone()};

                defaultTableModel.addRow(dados);
            }
        );
    }

    public static AutorEntidade convertParaAutorEntidade(JTable jTable) {
        int linhaSelecionada = jTable.getSelectedRow();

        Integer id = Integer.parseInt(
            jTable.getValueAt(linhaSelecionada, 0).toString()
        );

        String nome = jTable.getValueAt(linhaSelecionada, 1).toString();

        return new AutorEntidade(
            id,
            nome,
            null
        );
    }
    
    public static ClienteEntidade convertParaClienteEntidade(JTable jTable) {
        int linhaSelecionada = jTable.getSelectedRow();

        Integer id = Integer.parseInt(
            jTable.getValueAt(linhaSelecionada, 0).toString()
        );

        String nome = jTable.getValueAt(linhaSelecionada, 1).toString();
        String dataNascimento = jTable.getValueAt(linhaSelecionada, 2).toString();
        String cpf = jTable.getValueAt(linhaSelecionada, 3).toString();
        String telefone = jTable.getValueAt(linhaSelecionada, 4).toString();
        
        return new ClienteEntidade(
            id,
            nome,
            ConversorTipos.stringParaDate(dataNascimento),
            cpf,
            telefone,
            null,
            null
        );
    }
}
