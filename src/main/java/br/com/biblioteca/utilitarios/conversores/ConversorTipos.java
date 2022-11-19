/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java.br.com.biblioteca.utilitarios.conversores;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author lucas
 */
public class ConversorTipos {

    public static Date stringParaDate(String data) {
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");

            return simpleDateFormat.parse(data);
        } catch (ParseException exception) {
            throw new RuntimeException(exception);
        }
    }

    public static String dateParaString(Date data) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        return simpleDateFormat.format(data);
    }

    public static byte[] iconParaByteArray(Icon icone) {
        int size = icone.getIconHeight() * icone.getIconWidth();
        int[] imgRgbData = new int[size];
        byte[] imageData = null;

        try (ByteArrayOutputStream byteOutput = new ByteArrayOutputStream()) {

            try (DataOutputStream dataOutput = new DataOutputStream(byteOutput)) {
                for (int i = 0; i < imgRgbData.length; i++) {
                    dataOutput.writeByte(imgRgbData[i]);
                }
                imageData = byteOutput.toByteArray();
            }

        } catch (IOException exception) {
            throw new RuntimeException(exception);
        }

        return imageData;
    }

    public static Icon byteArrayParaIcon(byte[] foto) {
        try {
            InputStream inputStream = new ByteArrayInputStream(foto);
            BufferedImage someImage = ImageIO.read(inputStream);
            return new ImageIcon(foto);
        } catch (Exception exception) {
            throw new RuntimeException(exception);
        }
    }
}
