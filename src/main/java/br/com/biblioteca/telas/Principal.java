package main.java.br.com.biblioteca.telas;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Principal extends JFrame {

	private static final long serialVersionUID = 3758927955378564092L;

	private JPanel contentPanel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(
			() -> {
				try {
					Principal frame = new Principal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		);
	}

	/**
	 * Create the frame.
	 */
	public Principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1132, 746);
		contentPanel = new JPanel();
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPanel);
		contentPanel.setLayout(null);

		JPanel painelBarraLateral = new JPanel();
		painelBarraLateral.setBackground(new Color(255, 0, 128));
		painelBarraLateral.setBounds(0, 0, 91, 707);
		contentPanel.add(painelBarraLateral);

		JPanel painelPrincipal = new JPanel();
		painelPrincipal.setBounds(92, 0, 1024, 707);
		contentPanel.add(painelPrincipal);
		painelPrincipal.setLayout(new CardLayout(0, 0));

		JPanel painelLivro = new JPanel();
		painelLivro.setBackground(Color.RED);
		painelPrincipal.add(painelLivro, "livroPainelCard");
		painelLivro.setLayout(null);

		JPanel painelAutor = new JPanel();
		painelAutor.setBackground(Color.CYAN);
		painelPrincipal.add(painelAutor, "autorPainelCard");
		painelAutor.setLayout(null);

		JButton livroMenuBotao = new JButton("Livro");
		livroMenuBotao.addActionListener(
			adicionarCardNoPainel(
				painelPrincipal,
				"livroPainelCard"
			)
		);

		JButton autorMenuBotao = new JButton("Autor");
		autorMenuBotao.addActionListener(
			adicionarCardNoPainel(
				painelPrincipal,
				"autorPainelCard"
			)
		);

		painelBarraLateral.add(autorMenuBotao);
		painelBarraLateral.add(livroMenuBotao);
	}
	
	private ActionListener adicionarCardNoPainel(JPanel painel, String nomeDoFilho) {
		return actionListener -> {
			CardLayout cardLayout = (CardLayout) painel.getLayout();
			cardLayout.show(painel, nomeDoFilho);
		};
	}
}