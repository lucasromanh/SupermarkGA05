package supermark;

public class TipoProducto {
	private String p_limpieza;
	private String p_hig_personal;
	private String perecederos;
	private String no_perecederos;
	private String bebidas;
	
	public TipoProducto(String p_limpieza, String p_hig_personal, String perecederos, String no_perecederos,
			String bebidas) {
		super();
		this.p_limpieza = p_limpieza;
		this.p_hig_personal = p_hig_personal;
		this.perecederos = perecederos;
		this.no_perecederos = no_perecederos;
		this.bebidas = bebidas;
		
		
	}

	public String getP_limpieza() {
		return p_limpieza;
	}

	public void setP_limpieza(String p_limpieza) {
		this.p_limpieza = p_limpieza;
	}

	public String getP_hig_personal() {
		return p_hig_personal;
	}

	public void setP_hig_personal(String p_hig_personal) {
		this.p_hig_personal = p_hig_personal;
	}

	public String getPerecederos() {
		return perecederos;
	}

	public void setPerecederos(String perecederos) {
		this.perecederos = perecederos;
	}

	public String getNo_perecederos() {
		return no_perecederos;
	}

	public void setNo_perecederos(String no_perecederos) {
		this.no_perecederos = no_perecederos;
	}

	public String getBebidas() {
		return bebidas;
	}

	public void setBebidas(String bebidas) {
		this.bebidas = bebidas;
	}

}
