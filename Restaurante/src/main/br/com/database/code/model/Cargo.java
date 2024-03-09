package main.br.com.database.code.model;

public class Cargo {

	private String codCargo;
	private String nome;
	private String descricao;
	private double salario;
	private int permissao;
	
	protected Cargo(String codCargo, String nome, String descricao, 
			double salario, int permissao) {
		this.codCargo = codCargo;
		this.nome = nome;
		this.descricao = descricao;
		this.salario = salario;
		this.permissao = permissao;
	}

	protected String getCodCargo() {
		return codCargo;
	}

	protected void setCodCargo(String codCargo) {
		this.codCargo = codCargo;
	}

	protected String getNome() {
		return nome;
	}

	protected void setNome(String nome) {
		this.nome = nome;
	}

	protected String getDescricao() {
		return descricao;
	}

	protected void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	protected double getSalario() {
		return salario;
	}

	protected void setSalario(double salario) {
		this.salario = salario;
	}

	protected int getPermissao() {
		return permissao;
	}

	protected void setPermissao(int permissao) {
		this.permissao = permissao;
	}
	
	
	
}
