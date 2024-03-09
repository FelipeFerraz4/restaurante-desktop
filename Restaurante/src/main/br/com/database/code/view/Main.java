package main.br.com.database.code.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Main {

	private JFrame frame;
	private int width;
	private int height;

	/**
	 * Launch the application.
	 */
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

	/**
	 * Create the application.
	 */
	public Main() {
		initializeJFrame();
		initializeJPanel();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initializeJFrame() {
		frame = new JFrame();
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		Dimension screenSize = toolkit.getScreenSize();
		int screenWidth = screenSize.width;
		int screenHeight = screenSize.height;
		this.width = (int) (screenWidth * 0.6);
		this.height = (int) (screenHeight * 0.6);
		int positionX = (int) (screenWidth * 0.2);
		int positionY = (int) (screenHeight * 0.2);

		frame.setTitle("Restaurante");
		frame.setBounds(100, 100, 800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	private void initializeJPanel() {
		TelaLogin login = new TelaLogin();
//		login.setBorder(new EmptyBorder(0, 0, this.width, this.height));
//		login.setBackground(Color.cyan);
		frame.getContentPane().add(login);
	}

}
