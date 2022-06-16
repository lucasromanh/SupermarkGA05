package supermark;

public class Domicilio {
	private String Barrio;
	private String calle;
	private Integer numero;
	private Integer piso;
	private Integer depNum;
	
	public void domicilio(String barrio, String calle, Integer numero, Integer piso, Integer depNum) {
	
		Barrio = barrio;
		this.calle = calle;
		this.numero = numero;
		this.piso = piso;
		this.depNum = depNum;
}

	public String getBarrio() {
		return Barrio;
	}

	public void setBarrio(String barrio) {
		Barrio = barrio;
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public Integer getPiso() {
		return piso;
	}

	public void setPiso(Integer piso) {
		this.piso = piso;
	}

	public Integer getDepNum() {
		return depNum;
	}

	public void setDepNum(Integer depNum) {
		this.depNum = depNum;
	}
}