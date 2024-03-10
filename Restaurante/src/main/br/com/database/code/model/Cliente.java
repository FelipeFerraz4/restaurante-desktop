package main.br.com.database.code.model;

public class Cliente {

	private String codCliente;
	private String nome;
	private String login;
	private String senha;
	
	protected Cliente(String codCliente, String nome, String login, 
			String senha) {
		this.codCliente = codCliente;
		this.nome = nome;
		this.login = login;
		this.senha = senha;
	}

	protected String getCodCliente() {
		return codCliente;
	}

	protected void setCodCliente(String codCliente) {
		this.codCliente = codCliente;
	}

	protected String getNome() {
		return nome;
	}

	protected void setNome(String nome) {
		this.nome = nome;
	}

	protected String getLogin() {
		return login;
	}

	protected void setLogin(String login) {
		this.login = login;
	}

	protected String getSenha() {
		return senha;
	}

	protected void setSenha(String senha) {
		this.senha = senha;
	}
	
	
}
