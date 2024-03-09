package main.br.com.database.code.model;

public class Mesa {

	private String codMesa;
	private int capacidade;
	private String material;
	
	protected Mesa(String codMesa, int capacidade, String material) {
		this.codMesa = codMesa;
		this.capacidade = capacidade;
		this.material = material;
	}

	protected String getCodMesa() {
		return codMesa;
	}

	protected void setCodMesa(String codMesa) {
		this.codMesa = codMesa;
	}

	protected int getCapacidade() {
		return capacidade;
	}

	protected void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}

	protected String getMaterial() {
		return material;
	}

	protected void setMaterial(String material) {
		this.material = material;
	}
	
	
	
}
