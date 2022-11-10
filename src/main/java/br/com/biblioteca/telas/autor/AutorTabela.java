/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java.br.com.biblioteca.telas.autor;

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
public class AutorTabela {
    
    public static void atualizarTabela(JTable jTable) {
        AutorRepositorioInterface autorRepositorioInterface = new AutorRepositorio();
        DefaultTableModel defaultTableModel = (DefaultTableModel) jTable.getModel();
        defaultTableModel.setRowCount(0);
        
        List<AutorEntidade> autorEntidades = autorRepositorioInterface.buscarTodos();
        
        autorEntidades.forEach(
            autor -> {
                Object[] dados = {autor.getId(), autor.getNome()};
                
                defaultTableModel.addRow(dados);
            }
        );
    }
}
