package supermark;

import java.util.*;

public class PagoEfectivo {
	private String Cliente;
	public String getCliente() {
		return Cliente;
	}
	public void setCliente(String cliente) {
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
	public PagoEfectivo(String cliente, Date fecha, double total) {
		super();
		Cliente = cliente;
		this.fecha = fecha;
		this.total = total;
	}
	private Date fecha;
	private double total;
}
