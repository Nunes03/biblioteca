/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java.br.com.biblioteca.telas.geral;

import java.awt.Color;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author lucas
 */
public class ValidarGeral {
    
    public static Boolean autorValido(JTextField nomeTextField, JLabel statusLabel) {
        if (nomeTextField.getText().isEmpty()) {
            statusLabel.setForeground(Color.RED);
            statusLabel.setText("Preencha todos os campos.");
            return Boolean.FALSE;
        } else {
            statusLabel.setForeground(Color.BLACK);
            statusLabel.setText("Ação concluida com sucesso.");
            return Boolean.TRUE;
        }
    }  
    
    public static Boolean clienteValido(JTextField nomeCompletoTextField, JFormattedTextField cpfTextField, JLabel statusLabel) {
        if (nomeCompletoTextField.getText().isEmpty()) {
            statusLabel.setForeground(Color.RED);
            statusLabel.setText("Preencha todos os campos.");
            return Boolean.FALSE;
        } else {
            statusLabel.setForeground(Color.BLACK);
            statusLabel.setText("Ação concluida com sucesso.");
            return Boolean.TRUE;
        }
    }
}
