package supermark;

import java.util.Arrays;

public class Transferencia {
	private Arrays Cliente;
	private Integer cvu;
	private Integer cbu;
	private String alias;
	
	public Transferencia(Arrays cliente, Integer cVU, Integer cBU, String alias) {
		super();
		Cliente = cliente;
		cvu = cVU;
		cbu = cBU;
		this.alias = alias;
}

	public Arrays getCliente() {
		return Cliente;
	}

	public void setCliente(Arrays cliente) {
		Cliente = cliente;
	}

	public Integer getCvu() {
		return cvu;
	}

	public void setCvu(Integer cvu) {
		this.cvu = cvu;
	}

	public Integer getCbu() {
		return cbu;
	}

	public void setCbu(Integer cbu) {
		this.cbu = cbu;
	}

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}
}