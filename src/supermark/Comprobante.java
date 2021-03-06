package supermark;
import java.sql.Timestamp;
import java.util.*;

public class Comprobante {
	private Integer id;
	private Float total;
	private Timestamp fecha;
	private HashMap <Integer , Detalle > detalle;
	private Cliente destinatario;
	
	public Comprobante(Integer id, Float total, Timestamp fecha, Cliente destinatario) {
		
		super();
		this.id = id;
		this.total = total;
		this.fecha = fecha;
		this.destinatario = destinatario;
	
	
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Float getTotal() {
		return total;
	}
	public void setTotal(Float total) {
		this.total = total;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Timestamp fecha) {
		this.fecha = fecha;
	}
	public Cliente getDestinatario() {
		return destinatario;
	}
	public void setDestinatario(Cliente destinatario) {
		this.destinatario = destinatario;
	}
	public HashMap <Integer , Detalle > getDetalle() {
		return detalle;
	}
	public void setDetalle(HashMap <Integer , Detalle > detalle) {
		this.detalle = detalle;
	}
	public Object getPagotarjeta() {
		
		return null;
	}
	
}
