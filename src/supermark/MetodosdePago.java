package supermark;

public class MetodosdePago {
	
	private Integer PagoEfectivo;
	private String Tarjeta;
	private String transferencia;
	private String  QR;
	
	
	public MetodosdePago(Integer efectivo, String tarjeta, String transferencia, String qR) {
		super();
		PagoEfectivo = efectivo;
		Tarjeta = tarjeta;
		this.transferencia = transferencia;
		QR = qR;
	}
	public MetodosdePago() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getPagoEfectivo() {
		return PagoEfectivo;
	}
	public void setEfectivo(Integer efectivo) {
		PagoEfectivo = efectivo;
	}
	public String getTarjeta() {
		return Tarjeta;
	}
	public void setTarjeta(String tarjeta) {
		Tarjeta = tarjeta;
	}
	public String getTransferencia() {
		return transferencia;
	}
	public void setTransferencia(String transferencia) {
		this.transferencia = transferencia;
	}
	public String getQR() {
		return QR;
	}
	public void setQR(String qR) {
		QR = qR;
	}
	
	
	
	

}
