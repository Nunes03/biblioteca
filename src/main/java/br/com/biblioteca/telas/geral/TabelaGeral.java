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
import main.java.br.com.biblioteca.repositorios.AutorRepositorio;
import main.java.br.com.biblioteca.repositorios.interfaces.AutorRepositorioInterface;

/**
 *
 * @author lucas
 */
public class TabelaGeral {
    
    public static Integer pegarLinhaSelecionada(JTable jTable) {
        return jTable.getSelectedRow();
    }
    
    public static void limparTabela(JTable jTable) {
        DefaultTableModel defaultTableModel = (DefaultTableModel) jTable.getModel();
        defaultTableModel.setRowCount(0);
    }
    
    public static Boolean linhaValida(JTable jTable) {
        return !pegarLinhaSelecionada(jTable).equals(-1);
    }
    
    public static void atualizarTabelaAutor(JTable jTable) {
        AutorRepositorioInterface autorRepositorioInterface = new AutorRepositorio();
        limparTabela(jTable);
        DefaultTableModel defaultTableModel = (DefaultTableModel) jTable.getModel();
        

        List<AutorEntidade> autorEntidades = autorRepositorioInterface.buscarTodos();

        autorEntidades.forEach(
                autor -> {
                    Object[] dados = {autor.getId(), autor.getNome()};

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
}
