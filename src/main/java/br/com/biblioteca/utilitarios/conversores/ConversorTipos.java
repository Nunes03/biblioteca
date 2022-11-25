/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java.br.com.biblioteca.utilitarios.conversores;

import java.awt.AlphaComposite;
import java.awt.Graphics2D;
import java.awt.GraphicsConfiguration;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.HeadlessException;
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
import main.java.br.com.biblioteca.enums.GeneroEnum;
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
        try {
            BufferedImage bufferedImage = ImageIO.read(file);
            byte[] bytes;

            try (ByteArrayOutputStream byteOut = new ByteArrayOutputStream()) {
                Integer type = BufferedImage.BITMASK;

                BufferedImage novaImagem = new BufferedImage(
                    Principal.LARGURA_IMAGEM,
                    Principal.ALTURA_IMAGEM,
                    type
                );

                Graphics2D graphics2D = novaImagem.createGraphics();
                graphics2D.setComposite(AlphaComposite.Src);
                graphics2D.drawImage(bufferedImage, 0, 0, Principal.LARGURA_IMAGEM, Principal.ALTURA_IMAGEM, null);

                ImageIO.write(novaImagem, "png", byteOut);

                byteOut.flush();
                bytes = byteOut.toByteArray();
            }

            return bytes;
        } catch (IOException exception) {
            throw new RuntimeException(exception);
        }
    }

    public static byte[] iconParaByteArray(Icon icon) {
        try (ByteArrayOutputStream byteOut = new ByteArrayOutputStream()) {
            GraphicsEnvironment graphicsEnvironment = GraphicsEnvironment.getLocalGraphicsEnvironment();
            GraphicsDevice graphicsDevice = graphicsEnvironment.getDefaultScreenDevice();
            GraphicsConfiguration graphicsConfiguration = graphicsDevice.getDefaultConfiguration();
            BufferedImage image = graphicsConfiguration.createCompatibleImage(
                icon.getIconWidth(),
                icon.getIconHeight()
            );

            Graphics2D graphics2D = image.createGraphics();
            icon.paintIcon(null, graphics2D, 0, 0);
            graphics2D.dispose();

            ImageIO.write(image, "png", byteOut);
            return byteOut.toByteArray();
        } catch (HeadlessException | IOException exception) {
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

    public static GeneroEnum stringParaGeneroEnum(String genero) {
        if ("Romance".equals(genero)) {
            return GeneroEnum.ROMANCE;
        } else if ("Terror".equals(genero)) {
            return GeneroEnum.TERROR;
        } else if ("Ação".equals(genero)) {
            return GeneroEnum.ACAO;
        }
        return GeneroEnum.SUSPENSE;
    }

    public static String generoEnumParaString(GeneroEnum generoEnum) {
        switch (generoEnum) {
            case ROMANCE:
                return "Romance";
            case TERROR:
                return "Romance";
            case ACAO:
                return "Ação";
            default:
                return "Suspense";
        }
    }

    public static Integer tipoStringParaInteger(String tipo) {
        if (tipo.equals("Livro")) {
            return 1;
        } else if (tipo.equals("Revista")) {
            return 2;
        }
        return 3;
    }
}
