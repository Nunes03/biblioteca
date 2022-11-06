package main.java.br.com.biblioteca.telas;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
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
		
		JPanel barraLateralPanel = new JPanel();
		barraLateralPanel.setBackground(new Color(255, 0, 128));
		barraLateralPanel.setBounds(0, 0, 53, 367);
		contentPanel.add(barraLateralPanel);
		
		JPanel principalPanel = new JPanel();
		principalPanel.setBounds(55, 0, 571, 367);
		contentPanel.add(principalPanel);
		principalPanel.setLayout(new CardLayout(0, 0));
		
		JPanel livroPanel = new JPanel();
		livroPanel.setBackground(Color.RED);
		principalPanel.add(livroPanel, "name_254914035815600");
		livroPanel.setLayout(null);
		livroPanel.setName("livroCard");
		System.err.println(livroPanel.getName());
		
		JPanel autorPanel = new JPanel();
		autorPanel.setBackground(Color.CYAN);
		principalPanel.add(autorPanel, "name_254954077023300");
		autorPanel.setLayout(null);
		autorPanel.setName("autorCard");
		System.err.println(autorPanel.getName());
		
		JButton livroMenu = new JButton("Livro");
		livroMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout cardLayout = (CardLayout) principalPanel.getLayout();
				cardLayout.show(principalPanel, livroMenu.getName());
			}
		});
		
		JButton btnNewButton = new JButton("Autor");
		btnNewButton.addActionListener(
			actionEvent -> {
				CardLayout cardLayout = (CardLayout) principalPanel.getLayout();
				cardLayout.show(principalPanel, autorPanel.getName());
			}
		);

		barraLateralPanel.add(btnNewButton);
		barraLateralPanel.add(livroMenu);
	}
}
