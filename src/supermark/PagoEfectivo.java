package supermark;

import java.util.*;

public class PagoEfectivo {
	private Cliente Cliente;
	public Cliente getCliente() {
		return Cliente;
	}
	public void setCliente(supermark.Cliente cliente) {
		Cliente = cliente;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public PagoEfectivo(supermark.Cliente cliente, Date fecha, double total) {
		super();
		Cliente = cliente;
		this.fecha = fecha;
		this.total = total;
	}
	private Date fecha;
	private double total;
}
