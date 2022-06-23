package supermark;

import java.sql.Date;

public class MetodosdePago {
	
	private PagoEfectivo PagoEfectivo;
	private PagoTarjeta Tarjeta;
	private Transferencia transferencia;
	private Float monto_a_pagar;
	private Cliente Cliente;
	private Date FechaPago; 
	
	

	public MetodosdePago(supermark.PagoEfectivo pagoEfectivo, PagoTarjeta tarjeta, Transferencia transferencia,
			Float monto_a_pagar, supermark.Cliente cliente, Date fechaPago) {
		super();
		PagoEfectivo = pagoEfectivo;
		Tarjeta = tarjeta;
		this.transferencia = transferencia;
		this.monto_a_pagar = monto_a_pagar;
		Cliente = cliente;
		FechaPago = fechaPago;
	}
	public Float getMonto_a_pagar() {
		return monto_a_pagar;
	}
	public void setMonto_a_pagar(Float monto_a_pagar) {
		this.monto_a_pagar = monto_a_pagar;
	}
	public Cliente getCliente() {
		return Cliente;
	}
	public void setCliente(Cliente cliente) {
		Cliente = cliente;
	}
	public Date getFechaPago() {
		return FechaPago;
	}
	public void setFechaPago(Date fechaPago) {
		FechaPago = fechaPago;
	}
	public void setPagoEfectivo(PagoEfectivo pagoEfectivo) {
		PagoEfectivo = pagoEfectivo;
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
