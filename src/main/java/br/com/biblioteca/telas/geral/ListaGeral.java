/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java.br.com.biblioteca.telas.geral;

import java.util.List;
import javax.swing.JList;
import main.java.br.com.biblioteca.entidades.AutorEntidade;

/**
 *
 * @author lucas
 */
public class ListaGeral {

    private ListaGeral() {
    }

    public static void atualizarListaAutor(JList jList, List<AutorEntidade> autores) {
        String[] dados = new String[autores.size()];
        for (int i = 0; i < autores.size(); i++) {
            AutorEntidade autor = autores.get(i);
            dados[i] = montarAutorParaList(autor);
        }
        
        jList.setListData(
            dados
        );
    }

    private static String montarAutorParaList(AutorEntidade autor) {
        return autor
            .getId()
            .toString()
            .concat(" - ")
            .concat(autor.getNome());
    }
}
