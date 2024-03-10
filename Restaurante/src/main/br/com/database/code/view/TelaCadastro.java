package main.br.com.database.code.view;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Color;

public class TelaCadastro extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField textFieldEmail;
	private JTextField textFieldEmailConfirmacao;
	private JTextField textFieldSenha;
	private JTextField textFieldSenhaConfirmacao;
	private JTextField textFieldNome;
	private JTextField textFieldCPF;
	private JTextField textFieldTelefone1;
	private JTextField textFieldTelefone2;


	public TelaCadastro() {
		super();
		setLayout(null);
		
		JLabel lblCadastro = new JLabel("Cadastro do usuário");
		lblCadastro.setHorizontalAlignment(SwingConstants.CENTER);
		lblCadastro.setBounds(272, 62, 256, 53);
		lblCadastro.setFont(new Font("Calibri", Font.BOLD, 30));
		add(lblCadastro);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setFont(new Font("Calibri", Font.PLAIN, 18));
		lblNome.setBounds(160, 154, 60, 18);
		add(lblNome);
		
		textFieldNome = new JTextField();
		textFieldNome.setBounds(160, 183, 210, 31);
		add(textFieldNome);
		
		JLabel lblCPF = new JLabel("CPF:");
		lblCPF.setFont(new Font("Calibri", Font.PLAIN, 18));
		lblCPF.setBounds(430, 154, 180, 18);
		add(lblCPF);
		
		textFieldCPF = new JTextField();
		textFieldCPF.setBounds(430, 183, 210, 31);
		add(textFieldCPF);
		
		JLabel lblTelefone1 = new JLabel("Telefone 1:");
		lblTelefone1.setFont(new Font("Calibri", Font.PLAIN, 18));
		lblTelefone1.setBounds(160, 225, 83, 18);
		add(lblTelefone1);
		
		textFieldTelefone1 = new JTextField();
		textFieldTelefone1.setBounds(160, 254, 210, 31);
		add(textFieldTelefone1);
		
		JLabel lblTelefone2 = new JLabel("Telefone 2:");
		lblTelefone2.setFont(new Font("Calibri", Font.PLAIN, 18));
		lblTelefone2.setBounds(430, 225, 180, 18);
		add(lblTelefone2);
		
		textFieldTelefone2 = new JTextField();
		textFieldTelefone2.setBounds(430, 254, 210, 31);
		add(textFieldTelefone2);
		
		JLabel lblEmail = new JLabel("E-mail:");
		lblEmail.setFont(new Font("Calibri", Font.PLAIN, 18));
		lblEmail.setBounds(160, 296, 60, 18);
		add(lblEmail);
		
		textFieldEmail = new JTextField();
		textFieldEmail.setBounds(160, 325, 210, 31);
		add(textFieldEmail);
		
		JLabel lblEmailConfirmacao = new JLabel("Confirmação do E-mail:");
		lblEmailConfirmacao.setFont(new Font("Calibri", Font.PLAIN, 18));
		lblEmailConfirmacao.setBounds(430, 296, 180, 18);
		add(lblEmailConfirmacao);
		
		textFieldEmailConfirmacao = new JTextField();
		textFieldEmailConfirmacao.setBounds(430, 325, 210, 31);
		add(textFieldEmailConfirmacao);
		textFieldEmailConfirmacao.setColumns(10);
		
		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setFont(new Font("Calibri", Font.PLAIN, 18));
		lblSenha.setBounds(160, 365, 60, 18);
		add(lblSenha);
		
		textFieldSenha = new JTextField();
		textFieldSenha.setBounds(160, 394, 210, 31);
		add(textFieldSenha);
		
		JLabel lblSenhaConfirmcao = new JLabel("Confirmação do Senha:");
		lblSenhaConfirmcao.setFont(new Font("Calibri", Font.PLAIN, 18));
		lblSenhaConfirmcao.setBounds(430, 367, 180, 18);
		add(lblSenhaConfirmcao);
		
		textFieldSenhaConfirmacao = new JTextField();
		textFieldSenhaConfirmacao.setBounds(430, 394, 210, 31);
		add(textFieldSenhaConfirmacao);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setBackground(Color.LIGHT_GRAY);
		btnVoltar.setBounds(10, 11, 122, 43);
		add(btnVoltar);
		
		JButton btnAvancar = new JButton("Avançar");
		btnAvancar.setBackground(Color.LIGHT_GRAY);
		btnAvancar.setBounds(339, 472, 122, 43);
		add(btnAvancar);
	}
}
