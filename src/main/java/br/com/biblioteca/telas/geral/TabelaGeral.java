/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java.br.com.biblioteca.telas.geral;

import java.util.Date;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import main.java.br.com.biblioteca.entidades.AutorEntidade;
import main.java.br.com.biblioteca.entidades.ClienteEntidade;
import main.java.br.com.biblioteca.entidades.RevistaEntidade;
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

    public static void atualizarTabelaCliente(JTable jTable, List<ClienteEntidade> clienteEntidades) {
        DefaultTableModel defaultTableModel = (DefaultTableModel) jTable.getModel();
        limparTabela(defaultTableModel);

        clienteEntidades.forEach(
            cliente -> {
                String dataNascimento = ConversorTipos.dateParaString(
                    cliente.getDataNascimento()
                );

                String ativo = cliente.getAtivo().equals(Boolean.TRUE)
                ? "Sim"
                : "Não";

                Object[] dados = {
                    cliente.getId(),
                    cliente.getNomeCompleto(),
                    dataNascimento,
                    cliente.getCpf(),
                    cliente.getTelefone(),
                    ativo
                };

                defaultTableModel.addRow(dados);
            }
        );
    }

    public static void atualizarTabelaRevista(JTable jTable, List<RevistaEntidade> revistas) {
        DefaultTableModel defaultTableModel = (DefaultTableModel) jTable.getModel();
        limparTabela(defaultTableModel);

        revistas.forEach(
            revista -> {
                String dataLancamento = ConversorTipos.dateParaString(
                    revista.getDataLancamento()
                );

                String ativo = revista.getAtivo().equals(Boolean.TRUE)
                ? "Sim"
                : "Não";

                Object[] dados = {
                    revista.getId(),
                    revista.getNome(),
                    revista.getValor(),
                    dataLancamento,
                    revista.getPaginas(),
                    revista.getEditora(),
                    revista.getEdicao(),
                    revista.getAutor(),
                    ativo
                };

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
            nome
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
        Boolean ativo = jTable.getValueAt(linhaSelecionada, 5)
            .toString()
            .equals("Sim");

        return new ClienteEntidade(
            id,
            nome,
            ConversorTipos.stringParaDate(dataNascimento),
            cpf,
            telefone,
            ativo,
            null
        );
    }

    public static RevistaEntidade convertParaRevistaEntidade(JTable jTable) {
        int linhaSelecionada = jTable.getSelectedRow();

        Integer id = Integer.parseInt(
            jTable.getValueAt(linhaSelecionada, 0).toString()
        );

        String nome = jTable.getValueAt(linhaSelecionada, 1).toString();
        Double valor = Double.valueOf(jTable.getValueAt(linhaSelecionada, 2).toString());
        Date dataLancamento = ConversorTipos.stringParaDate(
            jTable.getValueAt(linhaSelecionada, 3).toString()
        );
        Integer paginas = Integer.valueOf(jTable.getValueAt(linhaSelecionada, 4).toString());
        String editora = jTable.getValueAt(linhaSelecionada, 5).toString();
        Integer edicao = Integer.valueOf(jTable.getValueAt(linhaSelecionada, 6).toString());
        String autor = jTable.getValueAt(linhaSelecionada, 7).toString();
        Boolean ativo = jTable.getValueAt(linhaSelecionada, 8)
            .toString()
            .equals("Sim");

        return new RevistaEntidade(
            id,
            nome,
            valor,
            dataLancamento,
            paginas,
            editora,
            autor,
            null,
            edicao,
            ativo
        );
    }
}
