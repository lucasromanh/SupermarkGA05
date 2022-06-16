package supermark;
import java.util.*;
public class Factura {
	
	private String nombre;
	private String cuit;
	private String direccion;
	private String provincia;
	private int codigoPostal;
	private float telefono;
	private double id;
	private Date fecha;
	private String hora;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
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
	public double getId() {
		return id;
	}
	public void setId(double id) {
		this.id = id;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public String getHora() {
		return hora;
	}
	public void setHora(String hora) {
		this.hora = hora;
	}
	public Factura(String nombre, String cuit, String direccion, String provincia, int codigoPostal, float telefono,
			double id, Date fecha, String hora) {
		super();
		this.nombre = nombre;
		this.cuit = cuit;
		this.direccion = direccion;
		this.provincia = provincia;
		this.codigoPostal = codigoPostal;
		this.telefono = telefono;
		this.id = id;
		this.fecha = fecha;
		this.hora = hora;
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
	System.out.println(getNombre() +"\n"+getCuit()+ "\n"
	+getDireccion()+"\n"+getProvincia()+
	"\n"+getCodigoPostal()+"\n"+getTelefono()+
	"------------------------------"+"\n Nro. Factura: "+getId()+
	"\n Fecha: "+ getFecha()+"\n Hora: "+getHora()+
	"\n ------------------------------");
	

}
}