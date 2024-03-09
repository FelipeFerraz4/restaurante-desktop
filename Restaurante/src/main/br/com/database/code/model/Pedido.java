package main.br.com.database.code.model;

public class Pedido {
	
	private String codPedido;
	private double valor;
	private boolean status;
	
	protected Pedido(String codPedido, double valor, boolean status) {
		this.codPedido = codPedido;
		this.valor = valor;
		this.status = status;
	}

	protected String getCodPedido() {
		return codPedido;
	}

	protected void setCodPedido(String codPedido) {
		this.codPedido = codPedido;
	}

	protected double getValor() {
		return valor;
	}

	protected void setValor(double valor) {
		this.valor = valor;
	}

	protected boolean isstatus() {
		return status;
	}

	protected void setstatus(boolean status) {
		this.status = status;
	}
	
	
}
