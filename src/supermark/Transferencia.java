package supermark;

public class Transferencia {
	
	private Integer cvu;
	private Integer cbu;
	private String alias;
	
	public Transferencia(Integer cVU, Integer cBU, String alias) {
		super();
		cvu = cVU;
		cbu = cBU;
		this.alias = alias;
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