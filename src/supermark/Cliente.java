package supermark;
public class Cliente {
	private String nombre;
	private String apellido;
	private long dni;
	private Domicilio domicilio;
	private int edad;
	
	public Cliente(String nom,String ape,long dni,Domicilio dom,int edad) {
		this.nombre = nom;
		this.apellido = ape;
		this.dni = dni;
		this.domicilio = dom;
		this.edad = edad;
	}
	
	public Cliente(String nom,String ape,long dni,Domicilio dom) {
		this.nombre = nom;
		this.apellido = ape;
		this.dni = dni;
		this.domicilio = dom;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public Domicilio getDomicilio() {
		return this.domicilio;
	}
	
	public long getDNI() {
		return this.dni;
	}
	
	public void mostrar(){
		System.out.println("Mi nombre es "+this.nombre+" "+this.apellido);
		System.out.println("DNI: "+this.dni+" - Domicilio: "+this.domicilio);
	}
	
	public boolean esMayor() {
		if(this.edad>=18) {
			return true;
		}else {
			return false;
		}
	}
	
	public boolean esMayor(String pais) {
		if(pais.compareTo("Belgica")==0) {
			if(this.edad>=16) {
				return true;
			}else {
				return false;
			}
		}else {
			return this.esMayor();
		}
	}
}