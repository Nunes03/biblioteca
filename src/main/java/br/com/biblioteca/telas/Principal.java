package main.java.br.com.biblioteca.telas;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.EventQueue;

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
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 642, 406);
		contentPanel = new JPanel();
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPanel);
		contentPanel.setLayout(null);

		JPanel painelBarraLateral = new JPanel();
		painelBarraLateral.setBackground(new Color(255, 0, 128));
		painelBarraLateral.setBounds(0, 0, 53, 367);
		contentPanel.add(painelBarraLateral);

		JPanel painelPrincipal = new JPanel();
		painelPrincipal.setBounds(55, 0, 571, 367);
		contentPanel.add(painelPrincipal);
		painelPrincipal.setLayout(new CardLayout(0, 0));

		JPanel livroPainel = new JPanel();
		livroPainel.setBackground(Color.RED);
		painelPrincipal.add(livroPainel, "livroPainelCard");
		livroPainel.setLayout(null);

		JPanel autorPainel = new JPanel();
		autorPainel.setBackground(Color.CYAN);
		painelPrincipal.add(autorPainel, "autorPainelCard");
		autorPainel.setLayout(null);

		JButton livroMenuBotao = new JButton("Livro");
		livroMenuBotao.addActionListener(
			actionListener -> {
				CardLayout cardLayout = (CardLayout) painelPrincipal.getLayout();
				cardLayout.show(painelPrincipal, "livroPainelCard");
			}
		);

		JButton autorMenuBotao = new JButton("Autor");
		autorMenuBotao.addActionListener(
			actionListener -> {
				CardLayout cardLayout = (CardLayout) painelPrincipal.getLayout();
				cardLayout.show(painelPrincipal, "autorPainelCard");
			}
		);

		painelBarraLateral.add(autorMenuBotao);
		painelBarraLateral.add(livroMenuBotao);
	}
}