package supermark;

import java.util.Date;

public class Factura extends Comprobante {
	
	private String nombre_supermark;
	private String cuit;
	private String direccion;
	private String provincia;
	private int codigoPostal;
	private float telefono;
	private double id_Factura;

public Factura(Integer id, Float total, Date fecha, Cliente destinatario, String nombre_supermark, String cuit,
			String direccion, String provincia, int codigoPostal, float telefono, double id_Factura) {
		super(id, total, fecha, destinatario);
		this.nombre_supermark = nombre_supermark;
		this.cuit = cuit;
		this.direccion = direccion;
		this.provincia = provincia;
		this.codigoPostal = codigoPostal;
		this.telefono = telefono;
		this.id_Factura = id_Factura;
	}


public String getNombre_supermark() {
	return nombre_supermark;
}


public void setNombre_supermark(String nombre_supermark) {
	this.nombre_supermark = nombre_supermark;
}


public String getCuit() {
	return cuit;
}


public void setCuit(String cuit) {
	this.cuit = cuit;
}


public String getDireccion() {
	return direccion;
}


public void setDireccion(String direccion) {
	this.direccion = direccion;
}


public String getProvincia() {
	return provincia;
}


public void setProvincia(String provincia) {
	this.provincia = provincia;
}


public int getCodigoPostal() {
	return codigoPostal;
}


public void setCodigoPostal(int codigoPostal) {
	this.codigoPostal = codigoPostal;
}


public float getTelefono() {
	return telefono;
}


public void setTelefono(float telefono) {
	this.telefono = telefono;
}


public double getId_Factura() {
	return id_Factura;
}


public void setId_Factura(double id_Factura) {
	this.id_Factura = id_Factura;
}


public void compra_producto(double precio, int cantidad,String nomProducto, String marca){
	double pago=precio*cantidad;
	double iva=0.21;
	double pagoProducto,impuesto;
	impuesto=pago*iva;
	pagoProducto= pago+impuesto;
	System.out.println(nomProducto+" "+marca+"\n"+cantidad+"x"+precio+
			"     "+pagoProducto);
	
}

			
public void encabezadoFactura( ) {

	System.out.println("-------------FACTURA------------");
	System.out.println(getNombre_supermark() +"\n"+getCuit()+ "\n"
	+getDireccion()+"\n"+getProvincia()+
	"\n"+getCodigoPostal()+"\n"+getTelefono()+
	"------------------------------"+"\n Nro. Factura: "+getId()+
	"\n Fecha: "+ getFecha() +
	"\n ------------------------------");
	

}
}