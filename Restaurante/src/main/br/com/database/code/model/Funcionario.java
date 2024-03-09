package main.br.com.database.code.model;

public class Funcionario {

	private String codFuncionario;
	private String nome;
	
	protected Funcionario(String codFuncionario, String nome) {
		this.codFuncionario = codFuncionario;
		this.nome = nome;
	}

	protected String getCodFuncionario() {
		return codFuncionario;
	}

	protected void setCodFuncionario(String codFuncionario) {
		this.codFuncionario = codFuncionario;
	}

	protected String getNome() {
		return nome;
	}

	protected void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
}
