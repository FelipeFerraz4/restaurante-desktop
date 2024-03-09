package main.br.com.database.code.model;

public class Contato {

	private String codContato;
	private String telefone1;
	private String telefone2;
	private String email;
	
	protected Contato(String codContato, String telefone1, String telefone2, 
			String email) {
		this.codContato = codContato;
		this.telefone1 = telefone1;
		this.telefone2 = telefone2;
		this.email = email;
	}

	protected String getCodContato() {
		return codContato;
	}

	protected void setCodContato(String codContato) {
		this.codContato = codContato;
	}

	protected String getTelefone1() {
		return telefone1;
	}

	protected void setTelefone1(String telefone1) {
		this.telefone1 = telefone1;
	}

	protected String getTelefone2() {
		return telefone2;
	}

	protected void setTelefone2(String telefone2) {
		this.telefone2 = telefone2;
	}

	protected String getEmail() {
		return email;
	}

	protected void setEmail(String email) {
		this.email = email;
	}
	
	
	
}
