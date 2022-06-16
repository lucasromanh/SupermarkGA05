package supermark;

public class Detalle {

	private Producto producto;
	private Integer cantidad;
	private Float descuento;
	
	public Detalle(Producto producto, Integer cantidad, Float descuento) {
		super();
		this.producto = producto;
		this.cantidad = cantidad;
		this.descuento = descuento;
	}
	public Producto getProducto() {
		return producto;
	}
	public void setProducto(Producto producto) {
		this.producto = producto;
	}
	public Integer getCantidad() {
		return cantidad;
	}
	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}
	public Float getDescuento() {
		return descuento;
	}
	public void setDescuento(Float descuento) {
		this.descuento = descuento;
	}
	
	

	
}
