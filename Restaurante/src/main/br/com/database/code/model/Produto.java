package main.br.com.database.code.model;

public class Produto {

	private String codProduto;
	private String nome;
	private String fabricante;
	private String categoria;
	private double preco;
	private int quantidade;
	private String descricao;
	
	protected Produto(String codProduto, String nome, String fabricante, String categoria, double preco, int quantidade,
			String descricao) {
		super();
		this.codProduto = codProduto;
		this.nome = nome;
		this.fabricante = fabricante;
		this.categoria = categoria;
		this.preco = preco;
		this.quantidade = quantidade;
		this.descricao = descricao;
	}

	protected String getCodProduto() {
		return codProduto;
	}

	protected void setCodProduto(String codProduto) {
		this.codProduto = codProduto;
	}

	protected String getNome() {
		return nome;
	}

	protected void setNome(String nome) {
		this.nome = nome;
	}

	protected String getFabricante() {
		return fabricante;
	}

	protected void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	protected String getCategoria() {
		return categoria;
	}

	protected void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	protected double getPreco() {
		return preco;
	}

	protected void setPreco(double preco) {
		this.preco = preco;
	}

	protected int getQuantidade() {
		return quantidade;
	}

	protected void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	protected String getDescricao() {
		return descricao;
	}

	protected void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
}
