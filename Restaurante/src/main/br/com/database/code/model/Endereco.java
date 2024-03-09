package main.br.com.database.code.model;

public class Endereco {
	private String codEndereco;
	private String cep;
	private String pais;
	private String estado;
	private String bairro;
	private String rua;
	private int numero;
	private String complemento;

	protected Endereco(String codEndereco, String cep, String pais, 
			String estado, String bairro, String rua, int numero,
			String complemento) {
		this.codEndereco = codEndereco;
		this.cep = cep;
		this.pais = pais;
		this.estado = estado;
		this.bairro = bairro;
		this.rua = rua;
		this.numero = numero;
		this.complemento = complemento;
	}

	protected String getCodEndereco() {
		return codEndereco;
	}

	protected void setCodEndereco(String codEndereco) {
		this.codEndereco = codEndereco;
	}

	protected String getCep() {
		return cep;
	}

	protected void setCep(String cep) {
		this.cep = cep;
	}

	protected String getPais() {
		return pais;
	}

	protected void setPais(String pais) {
		this.pais = pais;
	}

	protected String getEstado() {
		return estado;
	}

	protected void setEstado(String estado) {
		this.estado = estado;
	}

	protected String getBairro() {
		return bairro;
	}

	protected void setBairro(String bairro) {
		this.bairro = bairro;
	}

	protected String getRua() {
		return rua;
	}

	protected void setRua(String rua) {
		this.rua = rua;
	}

	protected int getNumero() {
		return numero;
	}

	protected void setNumero(int numero) {
		this.numero = numero;
	}

	protected String getComplemento() {
		return complemento;
	}

	protected void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	
	
}
