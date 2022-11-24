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
        String cpf = cpfTextField.getText();
        String dataNascimento = dataNascimentoTextField.getText();
        String telefone = telefoneTextField.getText();
        Icon foto = fotoJLabel.getIcon();

        if (nome.isEmpty() || cpf.isEmpty() || cpf.isEmpty() || dataNascimento.isEmpty() || telefone.isEmpty() || foto == null) {
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
        String dataLancamento = dataLancamentoFormattedTextField.getText();
        Integer paginas = (Integer) paginasJSpinner.getValue();
        String editora = editoraJTextField.getText();
        String autor = autorJTextField.getText();
        Integer edicao = (Integer) edicaoJSpinnerd.getValue();
        Icon foto = fotoJLabel.getIcon();

        if (nome.isEmpty() || valor.isEmpty() || dataLancamento.isEmpty() || paginas == 0 || editora.isEmpty() || autor.isEmpty()
            || edicao == 0 || foto == null) {
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
