package supermark;

public class Transferencia {
	private Cliente Cliente;
	private Integer cvu;
	private Integer cbu;
	private String alias;
	
	public Transferencia(supermark.Cliente cliente, Integer cVU, Integer cBU, String alias) {
		super();
		Cliente = cliente;
		cvu = cVU;
		cbu = cBU;
		this.alias = alias;
}

	public supermark.Cliente getCliente() {
		return Cliente;
	}

	public void setCliente(supermark.Cliente cliente) {
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