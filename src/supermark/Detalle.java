package supermark;

public class Detalle {

	private Producto producto;
	private Integer cantidad;
	private TipoProducto tipoproducto;
	
	public Detalle(Producto producto, Integer cantidad, TipoProducto tipoproducto) {
		super();
		this.producto = producto;
		this.cantidad = cantidad;
		this.tipoproducto = tipoproducto;
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
	public TipoProducto gettipoproducto() {
		return tipoproducto;
	}
	public void settipoproducto(Float descuento) {
		extracted(tipoproducto);
	}
	private TipoProducto extracted(TipoProducto tipoproducto) {
		return this.tipoproducto = tipoproducto;
	}
	
	

	
}
