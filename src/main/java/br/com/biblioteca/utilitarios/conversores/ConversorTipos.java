/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java.br.com.biblioteca.utilitarios.conversores;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author lucas
 */
public class ConversorTipos {

    public static Date stringParaDate(String data) {
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");

            return simpleDateFormat.parse(data);
        } catch (Exception exception) {
            throw new RuntimeException(exception);
        }
    }
}
