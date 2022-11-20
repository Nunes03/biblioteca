/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java.br.com.biblioteca.telas.geral;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Aluno
 */
public class TelasGeral {
    
    public static JFileChooser seletorDeImagem() {
        FileNameExtensionFilter fileNameExtensionFilter = new FileNameExtensionFilter("Imagens", "png");

        JFileChooser jFileChooser = new JFileChooser();
        jFileChooser.setDialogTitle("Procurar imagem");
        jFileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        jFileChooser.setFileFilter(fileNameExtensionFilter);
        
        return jFileChooser;
    }
    
    public static ImageIcon redimensionarImagem(File file, Integer largura, Integer altura) {
        try {
            BufferedImage imagem;

            imagem = ImageIO.read(file);
            ImageIcon icone = new ImageIcon(
                imagem.getScaledInstance(
                    largura,
                    altura,
                    java.awt.Image.SCALE_SMOOTH
                )
            );

            return icone;
        } catch (IOException exception) {
            JOptionPane.showMessageDialog(null, "Erro ao selecionar imagem", "Erro", JOptionPane.ERROR);
            throw new RuntimeException(exception);
        }
    }
}
