package main.br.com.database.code.model;

public class Pagamento {

	private String codPagamento;
	private String nome;
	private int numeroParcela;
	private boolean status;

	protected Pagamento(String codPagamento, String nome, int numeroParcela,
			boolean status) {
		this.codPagamento = codPagamento;
		this.nome = nome;
		this.numeroParcela = numeroParcela;
		this.status = status;
	}

	protected String getCodPagamento() {
		return codPagamento;
	}

	protected void setCodPagamento(String codPagamento) {
		this.codPagamento = codPagamento;
	}

	protected String getNome() {
		return nome;
	}

	protected void setNome(String nome) {
		this.nome = nome;
	}

	protected int getNumeroParcela() {
		return numeroParcela;
	}

	protected void setNumeroParcela(int numeroParcela) {
		this.numeroParcela = numeroParcela;
	}

	protected boolean isstatus() {
		return status;
	}

	protected void setstatus(boolean status) {
		this.status = status;
	}
	
	
	
}
