package main.br.com.database.code.view;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class Main {

	private JFrame frame;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Main() {
		initializeJFrame();
		initializeJPanel();
	}

	private void initializeJFrame() {
		frame = new JFrame();
		frame.setTitle("Restaurante");
		frame.setBounds(100, 100, 800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	private void initializeJPanel() {
		TelaLogin login = new TelaLogin();
		frame.getContentPane().add(login);
		TelaCadastro cadastro = new TelaCadastro();
		frame.getContentPane().add(cadastro);
	}

}
