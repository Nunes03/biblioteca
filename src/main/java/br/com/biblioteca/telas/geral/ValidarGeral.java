/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java.br.com.biblioteca.telas.geral;

import java.awt.Color;
import javax.swing.Icon;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.JTextField;

/**
 *
 * @author lucas
 */
public class ValidarGeral {

    public static Boolean autorValido(JTextField nomeTextField, JLabel statusLabel) {
        if (nomeTextField.getText().isEmpty()) {
            valorPadraoValidacao(Boolean.TRUE, statusLabel);
            return Boolean.FALSE;
        }
        valorPadraoValidacao(Boolean.FALSE, statusLabel);
        return Boolean.TRUE;

    }

    public static Boolean clienteValido(JTextField nomeCompletoTextField, JFormattedTextField cpfTextField,
        JFormattedTextField dataNascimentoTextField, JFormattedTextField telefoneTextField, JLabel fotoJLabel,
        JLabel statusLabel) {
        String nome = nomeCompletoTextField.getText();
        Integer cpf =  cpfTextField.getText().replace(" ", "").length();
        Integer dataNascimento = dataNascimentoTextField.getText().replace(" ", "").length();
        Integer telefone = telefoneTextField
            .getText()
            .replace(" ", "")
            .length();
        Icon foto = fotoJLabel.getIcon();

        if (nome.isEmpty() || cpf != 14 || dataNascimento != 10 || telefone != 14 || foto == null) {
            valorPadraoValidacao(Boolean.TRUE, statusLabel);
            return Boolean.FALSE;
        }
        valorPadraoValidacao(Boolean.FALSE, statusLabel);
        return Boolean.TRUE;

    }

    public static final Boolean revistaValida(JTextField nomeJTextField, JTextField valorJTextField,
        JFormattedTextField dataLancamentoFormattedTextField, JSpinner paginasJSpinner, JTextField editoraJTextField,
        JTextField autorJTextField, JSpinner edicaoJSpinnerd, JLabel fotoJLabel, JLabel statusLabel) {
        String nome = nomeJTextField.getText();
        String valor = valorJTextField.getText();
        Integer dataLancamento = dataLancamentoFormattedTextField.getText()
            .replace(" ", "")
            .length();
        Integer paginas = (Integer) paginasJSpinner.getValue();
        String editora = editoraJTextField.getText();
        String autor = autorJTextField.getText();
        Integer edicao = (Integer) edicaoJSpinnerd.getValue();
        Icon foto = fotoJLabel.getIcon();

        if (nome.isEmpty() || valor.isEmpty() || dataLancamento != 10 || paginas == 0 || editora.isEmpty() || autor.isEmpty()
            || edicao == 0 || foto == null) {
            valorPadraoValidacao(Boolean.TRUE, statusLabel);
            return Boolean.FALSE;
        }
        valorPadraoValidacao(Boolean.FALSE, statusLabel);
        return Boolean.TRUE;
    }
    
    public static final Boolean periodicoValida(JTextField nomeJTextField, JTextField valorJTextField,
        JFormattedTextField dataLancamentoFormattedTextField, JSpinner paginasJSpinner, JTextField editoraJTextField,
        JTextField autorJTextField, JTextField regiaoJTextField, JLabel fotoJLabel, JLabel statusLabel) {
        String nome = nomeJTextField.getText();
        String valor = valorJTextField.getText();
        Integer dataLancamento = dataLancamentoFormattedTextField.getText()
                .replace(" ", "")
                .length();
        Integer paginas = (Integer) paginasJSpinner.getValue();
        String editora = editoraJTextField.getText();
        String autor = autorJTextField.getText();
        String regiao = regiaoJTextField.getText();
        Icon foto = fotoJLabel.getIcon();

        if (nome.isEmpty() || valor.isEmpty() || dataLancamento != 10 || paginas == 0 || editora.isEmpty() || autor.isEmpty()
            || regiao.isEmpty() || foto == null) {
            valorPadraoValidacao(Boolean.TRUE, statusLabel);
            return Boolean.FALSE;
        }
        valorPadraoValidacao(Boolean.FALSE, statusLabel);
        return Boolean.TRUE;
    }
    
    public static final Boolean livroValida(JTextField nomeJTextField, JTextField valorJTextField,
        JFormattedTextField dataLancamentoFormattedTextField, JSpinner paginasJSpinner, JTextField editoraJTextField,
        JTextField autorJTextField, JTextField descricaooJTextField, JLabel fotoJLabel, JLabel statusLabel) {
        String nome = nomeJTextField.getText();
        String valor = valorJTextField.getText();
        Integer dataLancamento = dataLancamentoFormattedTextField.getText()
                .replace(" ", "")
                .length();
        Integer paginas = (Integer) paginasJSpinner.getValue();
        String editora = editoraJTextField.getText();
        String autor = autorJTextField.getText();
        String descricao = descricaooJTextField.getText();
        Icon foto = fotoJLabel.getIcon();

        if (nome.isEmpty() || valor.isEmpty() || dataLancamento != 10 || paginas == 0 || editora.isEmpty() || autor.isEmpty()
            || descricao.isEmpty() || foto == null) {
            valorPadraoValidacao(Boolean.TRUE, statusLabel);
            return Boolean.FALSE;
        }
        valorPadraoValidacao(Boolean.FALSE, statusLabel);
        return Boolean.TRUE;
    }
    
    private static void valorPadraoValidacao(Boolean erro, JLabel statusLabel) {
        if (erro) {
            statusLabel.setForeground(Color.RED);
            statusLabel.setText("Preencha todos os campos.");
        } else {
            statusLabel.setForeground(Color.BLACK);
            statusLabel.setText("Ação concluida com sucesso.");
        }
    }
}
