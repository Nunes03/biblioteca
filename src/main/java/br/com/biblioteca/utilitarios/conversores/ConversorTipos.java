/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java.br.com.biblioteca.utilitarios.conversores;

import java.awt.AlphaComposite;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import main.java.br.com.biblioteca.telas.Principal;

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

    public static java.sql.Date dateParaDateSql(Date date) {
        return new java.sql.Date(date.getTime());
    }
    
    public static byte[] fileParaByteArray(File file) {
        Boolean isPng = file.getName().endsWith("png");

        try {
            BufferedImage bufferedImage = ImageIO.read(file);
            byte[] bytes;
            try (ByteArrayOutputStream byteOut = new ByteArrayOutputStream()) {
                Integer type = isPng
                    ? BufferedImage.BITMASK
                    : BufferedImage.TYPE_INT_RGB;

                BufferedImage newImage = new BufferedImage(
                    Principal.LARGURA_IMAGEM,
                    Principal.ALTURA_IMAGEM,
                    type
                );

                Graphics2D graphics2D = newImage.createGraphics();
                graphics2D.setComposite(AlphaComposite.Src);
                graphics2D.drawImage(bufferedImage, 0, 0, Principal.LARGURA_IMAGEM, Principal.ALTURA_IMAGEM, null);
                if (isPng) {
                    ImageIO.write(newImage, "png", byteOut);
                } else {
                    ImageIO.write(newImage, "jpg", byteOut);
                }
                
                byteOut.flush();
                bytes = byteOut.toByteArray();
            }

            return bytes;
        } catch (IOException exception) {
            throw new RuntimeException(exception);
        }
    }

    public static Icon byteArrayParaIcon(byte[] foto) {
        try {
            ImageIcon imageIcon = new ImageIcon(foto);
            imageIcon.setImage(imageIcon.getImage().getScaledInstance(150, 150, 100));
            return imageIcon;
        } catch (Exception exception) {
            throw new RuntimeException(exception);
        }
    }
}