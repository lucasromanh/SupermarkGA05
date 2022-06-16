package supermark;

public class Registro {

	private String id;
	private String contraseña;
	
	
	public Registro(String id, String contraseña) {
		super();
		this.id = id;
		this.contraseña = contraseña;
		
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getContraseña() {
		return contraseña;
	}


	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
	
}
