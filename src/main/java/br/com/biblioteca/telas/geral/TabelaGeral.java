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
import main.java.br.com.biblioteca.entidades.AcervoEntidade;
import main.java.br.com.biblioteca.entidades.ClienteEntidade;
import main.java.br.com.biblioteca.entidades.CompraEntidade;
import main.java.br.com.biblioteca.entidades.ItemCompraEntidade;
import main.java.br.com.biblioteca.entidades.LivroEntidade;
import main.java.br.com.biblioteca.entidades.PeriodicoEntidade;
import main.java.br.com.biblioteca.entidades.RevistaEntidade;
import main.java.br.com.biblioteca.enums.GeneroEnum;
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

    public static void atualizarTabelaPeriodico(JTable jTable, List<PeriodicoEntidade> periodicos) {
        DefaultTableModel defaultTableModel = (DefaultTableModel) jTable.getModel();
        limparTabela(defaultTableModel);

        periodicos.forEach(
            periodico -> {
                String dataLancamento = ConversorTipos.dateParaString(
                    periodico.getDataLancamento()
                );

                String ativo = periodico.getAtivo().equals(Boolean.TRUE)
                ? "Sim"
                : "Não";

                Object[] dados = {
                    periodico.getId(),
                    periodico.getNome(),
                    periodico.getValor(),
                    dataLancamento,
                    periodico.getPaginas(),
                    periodico.getEditora(),
                    periodico.getRegiao(),
                    periodico.getAutor(),
                    ativo
                };

                defaultTableModel.addRow(dados);
            }
        );
    }

    public static void atualizarTabelaLivro(JTable jTable, List<LivroEntidade> livros) {
        DefaultTableModel defaultTableModel = (DefaultTableModel) jTable.getModel();
        limparTabela(defaultTableModel);

        livros.forEach(
            livro -> {
                String dataLancamento = ConversorTipos.dateParaString(
                    livro.getDataLancamento()
                );

                String ativo = livro.getAtivo().equals(Boolean.TRUE)
                ? "Sim"
                : "Não";

                String capaDura = livro.getCapaDura().equals(Boolean.TRUE)
                ? "Sim"
                : "Não";

                String genero = ConversorTipos.generoEnumParaString(
                    livro.getGenero()
                );

                Object[] dados = {
                    livro.getId(),
                    livro.getNome(),
                    livro.getValor(),
                    dataLancamento,
                    livro.getPaginas(),
                    livro.getEditora(),
                    livro.getAutor(),
                    livro.getDescricao(),
                    capaDura,
                    genero,
                    ativo
                };

                defaultTableModel.addRow(dados);
            }
        );
    }

    public static void atualizarTabelaClienteCompra(JTable jTable, List<ClienteEntidade> clientes) {
        DefaultTableModel defaultTableModel = (DefaultTableModel) jTable.getModel();
        limparTabela(defaultTableModel);

        clientes.forEach(
            cliente -> {
                Object[] dados = {
                    cliente.getId(),
                    cliente.getNomeCompleto(),
                    cliente.getCpf()
                };

                defaultTableModel.addRow(dados);
            }
        );
    }

    public static void atualizarTabelaAcervoCompra(JTable jTable, List<AcervoEntidade> acervos) {
        DefaultTableModel defaultTableModel = (DefaultTableModel) jTable.getModel();
        limparTabela(defaultTableModel);

        acervos.forEach(
            acervo -> {
                Object[] dados = {
                    acervo.getId(),
                    acervo.getNome(),
                    acervo.getValor(),
                    acervo.getTipoNome()
                };

                defaultTableModel.addRow(dados);
            }
        );
    }

    public static void atualizarTabelaClienteHistorico(JTable jTable, List<ClienteEntidade> clienteEntidades) {
        DefaultTableModel defaultTableModel = (DefaultTableModel) jTable.getModel();
        limparTabela(defaultTableModel);

        clienteEntidades.forEach(
            cliente -> {

                Object[] dados = {
                    cliente.getId(),
                    cliente.getNomeCompleto()
                };

                defaultTableModel.addRow(dados);
            }
        );
    }

    public static void atualizarTabelaCompraHistorico(JTable jTable, List<CompraEntidade> compras) {
        DefaultTableModel defaultTableModel = (DefaultTableModel) jTable.getModel();
        limparTabela(defaultTableModel);

        compras.forEach(
            compra -> {
                String data = ConversorTipos.dateParaString(
                    compra.getData()
                );

                Object[] dados = {
                    compra.getId(),
                    data,
                    compra.getTotal()
                };

                defaultTableModel.addRow(dados);
            }
        );
    }

    public static void atualizarTabelaItemCompraHistorico(JTable jTable, List<ItemCompraEntidade> itensCompra) {
        DefaultTableModel defaultTableModel = (DefaultTableModel) jTable.getModel();
        limparTabela(defaultTableModel);

        itensCompra.forEach(
            itemCompra -> {
                Object[] dados = {
                    itemCompra.getAcervo().getId(),
                    itemCompra.getAcervo().getNome(),
                    itemCompra.getAcervo().getValor(),
                    itemCompra.getAcervo().getTipoNome()
                };

                defaultTableModel.addRow(dados);
            }
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

    public static PeriodicoEntidade convertParaPeriodicoEntidade(JTable jTable) {
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
        String regiao = jTable.getValueAt(linhaSelecionada, 6).toString();
        String autor = jTable.getValueAt(linhaSelecionada, 7).toString();
        Boolean ativo = jTable.getValueAt(linhaSelecionada, 8)
            .toString()
            .equals("Sim");

        return new PeriodicoEntidade(
            id,
            nome,
            valor,
            dataLancamento,
            paginas,
            editora,
            autor,
            null,
            ativo,
            regiao
        );
    }

    public static LivroEntidade convertParaLivroEntidade(JTable jTable) {
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
        String autor = jTable.getValueAt(linhaSelecionada, 6).toString();
        String descricao = jTable.getValueAt(linhaSelecionada, 7).toString();
        Boolean capaDura = jTable.getValueAt(linhaSelecionada, 8)
            .toString()
            .equals("Sim");
        GeneroEnum genero = ConversorTipos.stringParaGeneroEnum(
            jTable.getValueAt(linhaSelecionada, 9).toString()
        );
        Boolean ativo = jTable.getValueAt(linhaSelecionada, 10)
            .toString()
            .equals("Sim");

        return new LivroEntidade(
            id,
            nome,
            valor,
            dataLancamento,
            paginas,
            editora,
            autor,
            null,
            ativo,
            descricao,
            capaDura,
            genero
        );
    }

    public static AcervoEntidade convertParaAcervoEntidadeCompra(JTable jTable) {
        int linhaSelecionada = jTable.getSelectedRow();

        Integer id = Integer.parseInt(
            jTable.getValueAt(linhaSelecionada, 0).toString()
        );

        String nome = jTable.getValueAt(linhaSelecionada, 1).toString();
        Double valor = Double.valueOf(jTable.getValueAt(linhaSelecionada, 2).toString());
        Integer tipo = ConversorTipos.tipoStringParaInteger(
            jTable.getValueAt(linhaSelecionada, 3).toString()
        );

        return new AcervoEntidade(
            id,
            nome,
            valor,
            null,
            null,
            null,
            null,
            null,
            null,
            tipo
        );
    }

    public static AcervoEntidade convertParaAcervoEntidadeCompra(JTable jTable, Integer linha) {
        Integer id = Integer.parseInt(
            jTable.getValueAt(linha, 0).toString()
        );

        String nome = jTable.getValueAt(linha, 1).toString();
        Double valor = Double.valueOf(jTable.getValueAt(linha, 2).toString());
        Integer tipo = ConversorTipos.tipoStringParaInteger(
            jTable.getValueAt(linha, 3).toString()
        );

        return new AcervoEntidade(
            id,
            nome,
            valor,
            null,
            null,
            null,
            null,
            null,
            null,
            tipo
        );
    }

    public static ClienteEntidade convertParaClienteEntidadeCompra(JTable jTable) {
        int linhaSelecionada = jTable.getSelectedRow();

        Integer id = Integer.parseInt(
            jTable.getValueAt(linhaSelecionada, 0).toString()
        );

        String nome = jTable.getValueAt(linhaSelecionada, 1).toString();
        String cpf = jTable.getValueAt(linhaSelecionada, 2).toString();

        return new ClienteEntidade(
            id,
            nome,
            null,
            cpf,
            null,
            null,
            null
        );
    }

    public static ClienteEntidade convertParaClienteEntidadeHistorico(JTable jTable) {
        int linhaSelecionada = jTable.getSelectedRow();

        Integer id = Integer.parseInt(
            jTable.getValueAt(linhaSelecionada, 0).toString()
        );
        String nome = jTable.getValueAt(linhaSelecionada, 1).toString();

        return new ClienteEntidade(
            id,
            nome,
            null,
            null,
            null,
            null,
            null
        );
    }

    public static CompraEntidade convertParaCompraEntidadeHistorico(JTable jTable) {
        int linhaSelecionada = jTable.getSelectedRow();

        Integer id = Integer.parseInt(
            jTable.getValueAt(linhaSelecionada, 0).toString()
        );
        Date data = ConversorTipos.stringParaDate(
            jTable.getValueAt(linhaSelecionada, 1).toString()
        );
        Double total = Double.valueOf(jTable.getValueAt(linhaSelecionada, 2).toString());

        return new CompraEntidade(
            id,
            data,
            total,
            null
        );
    }
}
