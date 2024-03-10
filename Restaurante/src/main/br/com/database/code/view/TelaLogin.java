package main.br.com.database.code.view;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Color;

public class TelaLogin extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JPasswordField passwordField;

	protected TelaLogin() {
		super();
		
		JLabel login = new JLabel("Login");
		login.setFont(new Font("Calibri", Font.BOLD, 30));
		login.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel email = new JLabel("E-mail:");
		email.setFont(new Font("Calibri", Font.PLAIN, 18));
		
		textField = new JTextField();
		
		JLabel senha = new JLabel("Senha:");
		senha.setVerticalAlignment(SwingConstants.TOP);
		senha.setFont(new Font("Calibri", Font.PLAIN, 18));

		passwordField = new JPasswordField();
		
		JButton btnNewButton = new JButton("Entrar");
		btnNewButton.setBackground(Color.LIGHT_GRAY);
		btnNewButton.setForeground(Color.BLACK);
		
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap(296, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.CENTER)
								.addComponent(login, GroupLayout.PREFERRED_SIZE, 223, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField, GroupLayout.PREFERRED_SIZE, 223, GroupLayout.PREFERRED_SIZE)
								.addComponent(passwordField, GroupLayout.PREFERRED_SIZE, 223, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE)))
						.addComponent(email, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(1)
							.addComponent(senha, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)))
					.addGap(280))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(117)
					.addComponent(login, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(email, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
					.addGap(20)
					.addComponent(textField, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(senha, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
					.addGap(14)
					.addComponent(passwordField, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
					.addGap(44)
					.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(200, Short.MAX_VALUE))
		);
		setLayout(groupLayout);
	}
}
