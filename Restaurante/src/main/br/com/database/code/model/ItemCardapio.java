package main.br.com.database.code.model;

public class ItemCardapio {

	private String codItemCardapio;
	private String nome;
	private double valor;
	private String categoria;
	private boolean status;
	
	protected ItemCardapio(String codItemCardapio, String nome, double valor,
			String categoria, boolean status) {
		this.codItemCardapio = codItemCardapio;
		this.nome = nome;
		this.valor = valor;
		this.categoria = categoria;
		this.status = status;
	}

	protected String getCodItemCardapio() {
		return codItemCardapio;
	}

	protected void setCodItemCardapio(String codItemCardapio) {
		this.codItemCardapio = codItemCardapio;
	}

	protected String getNome() {
		return nome;
	}

	protected void setNome(String nome) {
		this.nome = nome;
	}

	protected double getValor() {
		return valor;
	}

	protected void setValor(double valor) {
		this.valor = valor;
	}

	protected String getCategoria() {
		return categoria;
	}

	protected void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	protected boolean isStatus() {
		return status;
	}

	protected void setStatus(boolean status) {
		this.status = status;
	}
	
	
	
}
