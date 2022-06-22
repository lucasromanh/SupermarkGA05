package supermark;

public class MetodosdePago {
	
	private PagoEfectivo PagoEfectivo;
	private PagoTarjeta Tarjeta;
	private Transferencia transferencia;
	
	
	public MetodosdePago(supermark.PagoEfectivo efectivo, PagoTarjeta tarjeta, Transferencia transferencia ) {
		super();
		PagoEfectivo = efectivo;
		Tarjeta = tarjeta;
		this.transferencia = transferencia;
		
	}
	public MetodosdePago() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PagoEfectivo getPagoEfectivo() {
		return PagoEfectivo;
	}
	public void setEfectivo(supermark.PagoEfectivo efectivo) {
		PagoEfectivo = efectivo;
	}
	public PagoTarjeta getTarjeta() {
		return Tarjeta;
	}
	public void setTarjeta(PagoTarjeta tarjeta) {
		Tarjeta = tarjeta;
	}
	public Transferencia getTransferencia() {
		return transferencia;
	}
	public void setTransferencia(Transferencia transferencia) {
		this.transferencia = transferencia;
	}

	
	

}
